public class Data{
    public static void main(String[] args){
        int a=0;
        int b=5;
        int sum=a+b;
        int diff=a-b;
        int mult=a*b;
        int div=a/b;
        String magic="magic";
        System.out.println("Method 1");
        System.out.println("addition of A and B: " + sum);
        System.out.println("subtraction of A and B: " + diff);
        System.out.println("multiplication of A and B:" + mult);
        System.out.println("multiplication of A and B:" + div);
        System.out.println("method 2");
        System.out.println("Addition of A and B:" + (a+b));
        System.out.println("Subtraction of A and B:" + (a-b));
        System.out.print("Multiplication of A and B:" + (a*b));
        System.out.println("Division of A and B:" + (a/b));
        System.out.println("Remainder" + (a%b));
        System.out.println(magic);
        System.out.println("Addition:"+(a+b)+"subtraction:"+(a-b)+"multiplication:"+(a*b)+("division:")+(a/b));
    }
}
