import java.util.Set;

public final class kvs {
    public final int a;
    public static final int b;
    private static final Set c;

    static {
        kvs.c = ibqg.c(new Integer[]{((int)15), ((int)0xFF), ((int)0x8000), ((int)0x800F), ((int)0x80FF)});
    }

    public kvs() {
        this(0xFF);
    }

    public kvs(int v) {
        this(v, false);
    }

    public kvs(int v, boolean z) {
        this.a = v;
        if(!z && !kvs.c.contains(Integer.valueOf(v))) {
            throw new IllegalArgumentException("The allowed authenticator must be specified according to the BiometricPrompt spec.");
        }
    }
}

