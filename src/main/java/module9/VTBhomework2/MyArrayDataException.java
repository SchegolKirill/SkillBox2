package module9.VTBhomework2;

public class MyArrayDataException extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("в ячейке массива лежит что-то не то");
    }
}
