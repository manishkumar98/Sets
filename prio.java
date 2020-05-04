

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class prio {
    public static void main(String[] args) throws IOException {
        final Queue<Stall> stalls = new PriorityQueue<>((o1, o2) -> {
            final int size1 = o1.nearestRight - o1.nearestLeft, size2 = o2.nearestRight - o2.nearestLeft;
            if (size1 != size2) {
                return size2 - size1;
            } else {
                return o1.nearestLeft - o2.nearestLeft;
            }
        });
        final StringBuilder sb = new StringBuilder();
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        final int T = Integer.parseInt(bufferedReader.readLine());
        for (int t = 0; t < T; t++) {
            final String split[] = bufferedReader.readLine().split(" ");
            final int n = Integer.parseInt(split[0]);
            final int k = Integer.parseInt(split[1]);
            stalls.clear();
            stalls.add(new Stall(0, n + 1));
            int max = 0, min = 0;
            for (int i = 0; i < k; i++) {
                final Stall largest = stalls.poll();
                final int middle = (largest.nearestRight + largest.nearestLeft) >> 1;
                stalls.add(new Stall(middle, largest.nearestRight));
                stalls.add(new Stall(largest.nearestLeft, middle));
                max = Math.max(largest.nearestRight - middle, middle - largest.nearestLeft) - 1;
                min = Math.min(largest.nearestRight - middle, middle - largest.nearestLeft) - 1;
            }
            sb.append("Case #").append(t + 1).append(": ").append(max).append(" ").append(min).append('\n');
        }
        System.out.println(sb);
    }
}

class Stall {
    final int nearestLeft, nearestRight;

    Stall(final int nearestLeft, final int nearestRight) {
        this.nearestLeft = nearestLeft;
        this.nearestRight = nearestRight;
    }

    @Override
    public String toString() {
        return "{L=" + nearestLeft + ", R=" + nearestRight + "}";
    }
}
/*Problem

A certain bathroom has N + 2 stalls in a single row; the stalls on the left and right ends are permanently occupied by the bathroom guards. The other N stalls are for users.

Whenever someone enters the bathroom, they try to choose a stall that is as far from other people as possible. To avoid confusion, they follow deterministic rules: For each empty stall S, they compute two values LS and RS, each of which is the number of empty stalls between S and the closest occupied stall to the left or right, respectively. Then they consider the set of stalls with the farthest closest neighbor, that is, those S for which min(LS, RS) is maximal. If there is only one such stall, they choose it; otherwise, they choose the one among those where max(LS, RS) is maximal. If there are still multiple tied stalls, they choose the leftmost stall among those.

K people are about to enter the bathroom; each one will choose their stall before the next arrives. Nobody will ever leave.

When the last person chooses their stall S, what will the values of max(LS, RS) and min(LS, RS) be?

Input

The first line of the input gives the number of test cases, T. T lines follow. Each line describes a test case with two integers N and K, as described above.

Output

For each test case, output one line containing Case #x: y z, where x is the test case number (starting from 1), y is max(LS, RS), and z is min(LS, RS) as calculated by the last person to enter the bathroom for their chosen stall S.

Limits

1 ≤ T ≤ 100. 1 ≤ K ≤ N. 1 ≤ N ≤ 10^18.

Input               Output
5
4 2                 Case #1: 1 0
5 2                 Case #2: 1 0
6 2                 Case #3: 1 1
1000 1000           Case #4: 0 0
1000 1              Case #5: 500 499
Description of my algorithm

I attached a little graphic to show how the algorithm is supposed to work. That's maybe quicker to understand than reading through the algorithm.

/*
Definitions:
 Group =    A number of consecutive free stalls, in the beginning there is only one group.
 Layer =    A new layer is started when all groups of the previous layer are split up.
            Each layer holds therefore 2^(layer - 1) customers
            e.g.    1st layer: 1 customer
                    2nd layer: 2 customers
                    3rd layer: 4 customers
                    .
                    nth layer: 2^(n-1) customers

 With the above definitions it can be calculated how many layers are necessary.
     (Eq. 1) lastLayer = ceil(log(numberCustomers)/log(2))

 To calculate the size of the group, the last customer will be assigned to, the size of the
 groups in the last layer must be calculated. To do so, we need the following:
 - number of stalls in the last layer
     (Eq. 2) custPrevLayers = 2^(lastLayer - 1) - 1
     (Eq. 3) stallsLastLayer = totalStalls - custPrevLayers
 - the number of groups
     (Eq. 4) nbrGroupsLastLayer = 2^(lastLayer - 1)
 - and the number of customers in the last layer
     (Eq. 5) custLastLayer = totalCustomers - custPrevLayers

 Thus, the average group size is
     (Eq. 6) avgGroupSizeLastLayer = stallsLastLayer / nbrGroupsLastLayer

 Since avgGroupSizeLastLayer will in most cases not be an integer, we end up with two different
 group sizes:
     (Eq. 7) largeGroupSize = ceil(avgGroupSizeLastLayer)
     (Eq. 8) smallGroupSize = largeGroupSize - 1

 The last step is to figure out how many large groups are present in the last layer. This can
 be calculated by means of (Eq. 9) and (Eq. 10):
     (Eq. 9)  stallsLastLayer    = largeGroupSize * nbrLargeGroups + smallGroupSize * nbrSmallGroups
     (Eq. 10) nbrGroupsLastLayer = nbrLargeGroups + nbrSmallGroups

     Solving (Eq. 9) for nbrSmallGroups and inserting it into (Eq. 10) leaves us with
     (Eq. 11) nbrLargeGroups = (stallsLastLayer - (nbrGroupsLastLayer * smallGroupSize))/(largeGroupSize - smallGroupSize);

 If custLastLayer is smaller than the nbrLargeGroups min and max is to be calculated
 with the largeGroupSize, otherwise with the smallGroupSize.*/
