package module9.VTBhomework2;

public class MyArraySizeException extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("неправильный размер массива");
    }
}
