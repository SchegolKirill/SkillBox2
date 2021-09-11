package module9.VTBhomework2;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {{"1","1","1","1"},{"1","1","1","1"},{"1","shgkjahdgkjad","1","1"},{"1","1","1","1"}};

        try {
            array(arr);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static void array(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum1 = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr.length != 4){
                throw new MyArraySizeException();
            }
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i].length != 4){
                    throw new MyArraySizeException();
                }
                if(!isDigit(arr[i][j])){
                    throw new MyArrayDataException();
                }
                sum1 += Integer.parseInt(arr[i][j]);
            }
        }
        System.out.println(sum1);
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
