package Aula14;
public class main {
    public static void main(String[] args) {
        int[] num = {20,8,15,6,35,40,7,22,21,99,12};
        int x = num.length;
        int h = x;
        int aux, cont,i = 0;

        h= h/2;

    while (h > 0) {
        for (i = 0; i < x; i++) {
            aux = num[i];
            cont = i;
            while (cont >= h && num[cont - h] > aux) {
                num[i] = num[cont - h];
                cont = cont - h;
            }
            num[cont] = aux;
        }
        h = h / 2;
    }

        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);
        System.out.println(num[4]);
        System.out.println(num[5]);
        System.out.println(num[6]);
        System.out.println(num[7]);
        System.out.println(num[8]);
        System.out.println(num[9]);
        System.out.println(num[10]);
    }
}
