import java.util.Arrays;

public class Source {
    public static void main(String[] args) {
    int [] arr ={3,4,5};
        System.out.println(pythagoreanTriple(arr)==1);
    }
    public static int pythagoreanTriple(int[] triple){
        Arrays.sort(triple);
        return (Math.pow(triple[2],2)==(Math.pow(triple[0],2)+Math.pow(triple[1],2)))? 1 :0;
    }
}
