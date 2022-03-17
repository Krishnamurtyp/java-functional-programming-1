package functionnalinterface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {

        System.out.println(getDBConnexionUrl());
        System.out.println(getDBConnexionUrlSupplier.get());
    }

    // Normal java
    static String getDBConnexionUrl() {
        return "jdbc://localhost:5432/users";
    }

    // functionnal
    static Supplier<String> getDBConnexionUrlSupplier = () -> "jdbc://localhost:5432/users";

}
