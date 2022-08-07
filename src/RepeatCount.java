public class RepeatCount {
    static boolean isFind(int [] arr, int i){
        for (int k : arr){
            if (k == i){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] tekrar = new int[array.length];


        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = i; j < array.length; j++) {
                if (array [i] == array[j]){
                    count += 1;
                }
            }
            if (!isFind(tekrar, array[i])){
                System.out.println(array[i]+" sayisi "+count+" kere tekrar etti.");
            }
            tekrar[i] = array[i];
        }
    }
}
