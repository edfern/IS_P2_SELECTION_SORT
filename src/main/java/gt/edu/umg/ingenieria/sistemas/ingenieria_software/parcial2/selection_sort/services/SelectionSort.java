package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.selection_sort.services;

public class SelectionSort implements ISelectionSort {

    @Override
    public void selectionSort(String[] args, int n) {
        for(int i = 0; i < n - 1; i++) {
            int min_index = i;
            String minStr = args[i];
            for(int j = i + 1; j < n; j++){
                if(args[j].compareTo(minStr) < 0){
                    minStr = args[j];
                    min_index = j;
                }
            }
            if(min_index != i){
                String temp = args[min_index];
                args[min_index] = args[i];
                args[i] = temp;
            }
        }
    }
}
