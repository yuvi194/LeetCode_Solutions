class Solution {
    public int largestInteger(int num) {
        ArrayList<Integer> arrList = new ArrayList<>();
        while (num > 0) {
            arrList.add(0, num % 10);
            num /= 10;
        }
        int[] arr = new int[arrList.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrList.get(i);
        }
        int[] even = new int[arr.length];
        int[] odd = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even[i] = arr[i];
            } else {
                odd[i] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] % 2 == 0 && arr[j] % 2 == 0 && even[i] < even[j]) {
                    int tempe = even[i];
                    even[i] = even[j];
                    even[j] = tempe;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] % 2 != 0 && arr[j] % 2 != 0 && odd[i] < odd[j]) {
                    int tempo = odd[i];
                    odd[i] = odd[j];
                    odd[j] = tempo;
                }
            }
        }
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result = result * 10 + even[i];
            } else {
                result = result * 10 + odd[i];
            }
        }
        return result;
    }
}