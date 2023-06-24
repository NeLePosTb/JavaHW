public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[] {9, 7, 6, 4, 2, 1};
        int temp;
        for (int i = array.length-1; i >0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j]>array[j+1]){
                    temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
            for (int j2 = 0; j2 < array.length; j2++) {
                System.out.print(array[j2]);
            }
            System.out.println("\n");
        }
    }
}