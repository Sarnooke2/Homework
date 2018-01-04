package Recursion;
public class TriangularNumberRecursion {
public static int triangular(int n) {
System.out.println("Entering n=" +n) ;
if (n==1){
System.out.println("Return : 1 ");
return 1 ;
} else {
 int temp = n + triangular(n-1) ;
System.out.println("Returning: "+temp) ;
return temp;
}
}
public static void main(String[] args){
 int n = Integer.parseInt(args[0]) ;
 int answer = TriangularNumberRecursion.triangular(n);
System.out.println("Answer: "+answer);
}
}
