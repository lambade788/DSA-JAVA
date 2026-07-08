package ARRAY;

public class passingarraytomethod {
    public static void main(String[] args) {
        int [] a ={12};
        int[] b= {34};

        System.out.println(a[0]+" "+b[0]);
        swap(a,b);
        System.out.println(a[0]+" "+b[0]);
    }
    public static void swap(int [] a,int[] b){
        int temp=a[0];
        a[0]=b[0];
        b[0]=temp;
    }
}
