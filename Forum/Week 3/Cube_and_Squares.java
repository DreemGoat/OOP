public class Cube_and_Squares {
    public static void main(String[] args){
        System.out.println("number  square  cube");
        for(int n=0; n<11 ;n++){
            int square = n*n;
            int cube = n*n*n;
            System.out.println(n + "\t" + square + "\t" + cube);
        }
    }
}
