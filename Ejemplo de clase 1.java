public class Excercise {
    public static int sumar(int[] v1, int[] v2) {
        // Añada aquí el código necesario para completar el método
        int res = 0;
        for (int i = 0; i < v1.length; i++){
            if (i % 2 == 0){
                res += v1[i] + v2[i];
            }
        }
        return res;
    }
}