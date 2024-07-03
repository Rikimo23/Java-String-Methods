
import java.util.Arrays;

public class splitmethod {
    public static void main(String[] args) {
        String vowels = "a::b::c::d:e";


        String[] result = vowels.split("::");


        System.out.println("result = " + Arrays.toString(result));
    }
}

