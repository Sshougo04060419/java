package mondai09; 
import java.util.Scanner; /*標準入力の定型 */

public class I_a {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String school = stdIn.nextline();
        String name = stdIn.nextline();
        System.out.println("学校名："+ school);
        System.out.println("名前："+ name);
        display(school, name);
    }

    static void display(String school, String name) {
        System.out.println("学校名" + school);
        System.out.println("名前" + name);
    }
}

