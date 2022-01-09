package domain;

public class MergeSort implements SortingAlgorithm {
    @Override
    public void sort(int[] unsortedArray) {
        mergeSort(unsortedArray, 0, unsortedArray.length - 1);
    }

    public static void mergeSort(int[] list, int start, int end) {
        if (start == end) return;

        int mid = (start + end) / 2;
        mergeSort(list, start, mid);
        mergeSort(list, mid + 1, end);
        merge(list, start, mid, end);
    }

    private static void merge(int[] list, int start, int mid, int end) {

        //both sublists have an extra space for Integer.MaxValue
        int[] leftHalf = new int[mid - start + 2];
        int[] rightHalf = new int[end - mid + 1];

        //store list values into the sublists (both halves)
        for (int j = 0; j < leftHalf.length - 1; j++) {
            leftHalf[j] = list[start + j];
        }
        for (int j = 0; j < rightHalf.length - 1; j++) {
            rightHalf[j] = list[mid + j + 1];
        }

        //using extra spaces of both sublist
        leftHalf[mid - start + 1] = Integer.MAX_VALUE;
        rightHalf[end - mid] = Integer.MAX_VALUE;

        int leftPos = 0, rightPos = 0, k;
        //
        for (k = start; k <= end; k++) {
            if (leftHalf[leftPos] <= rightHalf[rightPos]) {
                list[k] = leftHalf[leftPos];
                leftPos++;
            } else {
                list[k] = rightHalf[rightPos];
                rightPos++;
            }
        }
    }
}
