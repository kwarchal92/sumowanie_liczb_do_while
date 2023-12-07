package sumowanie_liczb_do_while;

public class SumowanieLiczb {

    public static void main(String[] args)
    {
        int a = 0 , suma = 0;

        //Program sumuje lidzby 0-100. Petla do..while

        do
        {
            suma += a;
            a++;
        }
        while(a<=100);

        System.out.print("Suma liczb z przedziału 0-50 wynosi: \t");
        System.out.print(suma);
    }
}
