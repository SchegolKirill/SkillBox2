package module4.HomeWork3.trucks;

public class Test {
    public static void main(String[] args) {
//        int k = 0;
//        for(int i = 1; i < 11; i++){
//            System.out.println("Грузовик " + i + ":");
//            for(int j = 1; j <= 12; j++){
//                System.out.println("Контейнер " + j + ":");
//                for (k = 1; k <= 27; k++){
//                    System.out.println("Ящик " + k);
//                }
//            }
//        }
        result(3000);
    }
    public static void result(int box){

        int container = 0;
        int truck = 0;

        if ((box % 27) == 0) {
            container = box / 27;
        }else{
            container = (box / 27) + 1;
        }
        if((container % 12) == 0) {
            truck = container / 12;
        }else{
            truck = (container / 12) + 1;
        }

        System.out.println(truck);
        System.out.println(container);
        int t = 1;
        int c = 1;
        System.out.println("Грузовик № " + t);
        System.out.println("Контенер № " + c);

        for(int i = 1; i <= box; i += 1){

            System.out.println("\t Ящик № " + i);
            if((i % (27 * 12)) ==0){
                System.out.println("Грузовик № " + (++t));
            }
            if((i % 27) == 0){
                System.out.println("Контенер № " + (++c));
            }
        }
    }
}
//