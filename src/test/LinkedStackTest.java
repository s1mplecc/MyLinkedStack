import info.s1mple.LinkedStack;
import org.junit.jupiter.api.Test;

class LinkedStackTest {

    @Test
    void should_string_success() {
        LinkedStack<String> lss = new LinkedStack<>();
        for (String s : "This is an Apple.".split(" ")) {
            lss.push(s);
        }
        String s;
        while ((s = lss.pop()) != null) {
            System.out.println(s);
        }
    }

    @Test
    void should_integer_success() {
        LinkedStack<Integer> lsi = new LinkedStack<>();
        for (int i : new int[]{1, 2, 3, 4, 5}) {
            lsi.push(i);
        }
        Integer i;
        while ((i = lsi.pop()) != null) {
            System.out.println(i);
        }
    }
}
