import java.util.Scanner;
public class Пример_Лаб2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n");
        int n = sc.nextInt();
        System.out.println("Введите x");
        int x = sc.nextInt();
        System.out.println("Результат "+ calc_sum(n,x));
    }
    static double calc_sum(int n,int x){
        double sum = 0;
        for (int i = n; i>0;i--){
            sum = Math.PI/2+sum + Math.pow(-1,i+1)/(2*i)*Math.pow(x,2*i+1);
        }
        return sum;
    }
}
