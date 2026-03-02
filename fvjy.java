import java.io.PrintWriter;

public final class fvjy {
    private static final String a;

    static {
        fvjy.a = String.format("%n");
    }

    public static void a(PrintWriter printWriter0, String s, MessageLite hfvm0) {
        if(s.isEmpty()) {
            throw new IllegalArgumentException("Label must be non-empty");
        }
        printWriter0.printf("### %s START ###%n", new Object[]{s});
        try {
            byte[] arr_b = hfvm0.toBytesArray();
            printWriter0.println(ghjc.d.i(fvjy.a, 120).o(arr_b));
        }
        catch(RuntimeException runtimeException0) {
            printWriter0.printf("ERROR: %s%n", new Object[]{runtimeException0.getMessage()});
        }
        printWriter0.printf("### %s END ###%n", new Object[]{s});
    }
}

