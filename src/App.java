/**
 * Created by mayank on 29/3/2015.
 */
public class App {
    public static void main(String[] args){
        String text = "this is a simple test\nOne Two Three\nHello world!";
        for(int i=0;i<text.length();++i){
            System.out.print(text.charAt(i));
        }
        System.out.println();
    }
}
