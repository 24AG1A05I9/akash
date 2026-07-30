public class Selectionsort {

    public static void selectionSort(int num[]) {

        for (int turn = 0; turn < num.length - 1; turn++) {

            int minPos = turn;

            for (int j = turn + 1; j < num.length; j++) {
                if (num[j] < num[minPos]) {
                    minPos = j;
                }
            }

            int temp = num[minPos];
            num[minPos] = num[turn];
            num[turn] = temp;
        }
    }

    public static void printArray(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int num[] = {5, 4, 1, 3, 2};

        selectionSort(num);

        printArray(num);
    }
}