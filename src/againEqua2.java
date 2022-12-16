import java.util.*;

public class againEqua2 {
    public static Scanner scanner = new Scanner(System.in);

    static Map<Integer, Integer> getAppearingTimesMap(int[] numArr) {
        var map = new HashMap<Integer, Integer>();
        for (var val : numArr) {
            if (map.get(val) == null) map.put(val, 1);
            else map.put(val, map.get(val).intValue() + 1);
        }
        return map;
    }
    static int[] getElementsAppear2times(int[] numArr) {
        var result = new ArrayList<Integer>();
        var map = getAppearingTimesMap(numArr);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                result.add(entry.getKey());
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
    public static void main(String[] args) {
        var numArr = new int[]{1, 2, 3, 4, 3, 2, 1, 1};
        var map = getAppearingTimesMap(numArr);

//        System.out.println(map);
        System.out.print("Phan tu chi xuat hien 2 lan la: " + Arrays.toString(getElementsAppear2times(numArr)));
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue() == 2) {
//                System.out.print(entry.getKey() + " ");
//            }
//        }
    }


    public static void addElement(Map<Integer, Integer> map, int element) {
        if (map.containsKey(element)) {
            int count = map.get(element) + 1;
            map.put(element, count);
        } else {
            map.put(element, 1);
        }
    }
}
