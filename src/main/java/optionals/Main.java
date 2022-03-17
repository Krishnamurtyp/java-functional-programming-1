package optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Supplier<IllegalStateException> exception = () -> new IllegalStateException("Exception");

        Object value = Optional.ofNullable("Hello")
                        .orElseThrow(exception);


        System.out.println(value);
    }


}
