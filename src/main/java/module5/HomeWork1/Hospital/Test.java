package module5.HomeWork1.Hospital;

public class Test {
    public static void main(String[] args) {
        final int PATIENTS = 30;
        final float MAX_TEMPERATURE = 40.0f;
        final float MIN_TEMPERATURE = 32.0f;
        final float MAX_NORMAL_TEMPERATURE = 36.9f;
        final float MIN_NORMAL_TEMPERATURE = 36.2f;

        float sum1 = 0;
        int sum2 = 0;

        float[] allTemperatures = new float[PATIENTS];

        System.out.print("Температуры пациентов: ");
        for(int i = 0; i < allTemperatures.length; i++){
            allTemperatures[i] = (float) (Math.random() * (MAX_TEMPERATURE - MIN_TEMPERATURE) + MIN_TEMPERATURE);
            sum1 += allTemperatures[i];
            if(allTemperatures[i] >= MIN_NORMAL_TEMPERATURE && allTemperatures[i] <= MAX_NORMAL_TEMPERATURE){
                sum2 += 1;
            }
            System.out.printf("%.1f ", allTemperatures[i]);
        }

        float averageValueTemperature = sum1 / allTemperatures.length;

        System.out.printf(
                "\nСредняя температура: %.1f\n" +
                        "Количество здоровых: %d\n",averageValueTemperature, sum2);
    }
}
