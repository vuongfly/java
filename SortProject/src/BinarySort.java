interface BinarySort {
    public default int[] sort(int[] arr) {
        System.out.println("Binary Sort: " + arr);
        return arr;
    }
}