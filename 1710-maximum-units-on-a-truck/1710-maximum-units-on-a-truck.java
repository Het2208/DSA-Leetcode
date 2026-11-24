
import java.util.Arrays;

class Solution {

    public int maximumUnits(int[][] boxTypes, int cap) {

        Arrays.sort(boxTypes, (a, b) ->
            Integer.compare(b[1], a[1])
        );

        int total = 0;

        for (int i = 0; i < boxTypes.length; i++) {

            int boxes = boxTypes[i][0];
            int units = boxTypes[i][1];

            if (boxes <= cap) {

                total += boxes * units;
                cap -= boxes;

            } else {

                total += cap * units;
                break;
            }
        }

        return total;
    }
}
