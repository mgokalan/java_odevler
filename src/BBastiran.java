public class BBastiran {
    public static void main(String[] args) {
        String [][] letter = new String[7][4];

        for (int i = 0; i < letter.length; i++){
            for (int j = 0; j < letter[i].length; j++){
                if (i == 0 || i == 3 || i == 6 || j == 0 || j ==3){
                    letter[i][j] = " * ";
                }else {
                    letter[i][j] = "   ";
                }
            }
        }
        for (String [] i : letter){
            for (String j : i){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
