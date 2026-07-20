class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int maxCount = 0;
        int maxBarcode = 0;
        for (int code : barcodes) {
            int currentCount = countMap.getOrDefault(code, 0) + 1;
            countMap.put(code, currentCount);
            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxBarcode = code;
            }
        }
        int[] result = new int[barcodes.length];
        int index = 0;
        while (maxCount > 0) {
            result[index] = maxBarcode;
            index += 2;
            maxCount--;
        }
        countMap.remove(maxBarcode);
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int barcode = entry.getKey();
            int count = entry.getValue();
            while (count > 0) {
                if (index >= barcodes.length) {
                    index = 1;
                }
                result[index] = barcode;
                index += 2;
                count--;
            }
        }
        return result;
    }
}