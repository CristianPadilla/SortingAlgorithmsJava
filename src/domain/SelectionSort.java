package domain;

public class SelectionSort implements SortinAlgorithm {
    @Override
    public void sort(int[] list) {
        int minIndex;
        int nextSmallest;

        //into list.length-1 because the last element is obiously the biggest
        for (int unSortedStart = 0; unSortedStart < list.length - 1; unSortedStart++) {
            minIndex = unSortedStart;
            //scan along the array whether an element smaller than unSortedStart exist
            for (int currentIndex = unSortedStart + 1; currentIndex < list.length; currentIndex++) {
                if (list[currentIndex] < list[minIndex]) {
                    minIndex = currentIndex;
                }
            }
            //move the smallest found element into the sorted part
            nextSmallest = list[minIndex];
            list[minIndex] = list[unSortedStart];
            list[unSortedStart] = nextSmallest;
        }
    }
}
