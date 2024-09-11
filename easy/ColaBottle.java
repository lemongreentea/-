public class ColaBottle {
    static int tmp;

    public int solution(int a, int b, int n) {
        colaBottle(a,b,n);
        return tmp;
    }
    public void colaBottle(int a, int b, int n) {
        if(n<a){
            return;
        }else{
           int newCola = b*(n/a);
           int remainingBottles = n%a;
            tmp+=newCola;
            colaBottle(a,b,newCola+remainingBottles);
        }
    }
    public static void main(String[] args) {
        ColaBottle colaBottle = new ColaBottle();
        System.out.println(colaBottle.solution(2,1,20));
    }
}