import java.util.HashMap;
import java.util.Map;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class hmbd extends Enum {
    public static final enum hmbd a;
    private static final Map b;
    private static final hmbd[] c;

    static {
        hmbd.a = new hmbd();
        hmbd.c = new hmbd[]{hmbd.a};
        hmbd.b = new HashMap();
    }

    private hmbd() {
        super("INSTANCE", 0);
    }

    public static hmbc a(byte[] arr_b, hmbf hmbf0) {
        hmbc hmbc0;
        try {
            hmbc0 = (hmbc)((Class)hmbd.b.get(Byte.valueOf(arr_b[1]))).newInstance();
        }
        catch(NullPointerException | ArrayIndexOutOfBoundsException unused_ex) {
            throw new hmfn(hmfl.T);
        }
        catch(InstantiationException | IllegalAccessException exception0) {
            hmhe.a().b(exception0, "Unable to assign the Command Handler for C-APDU", new Object[0]);
            throw new hmfm(hmfl.as);
        }
        try {
            hmbc0.b(arr_b, hmbf0);
            return hmbc0;
        }
        catch(ArrayIndexOutOfBoundsException unused_ex) {
            throw new hmfn(hmfl.W);
        }
    }

    public static void b(byte b, Class class0) {
        Map map0 = hmbd.b;
        Byte byte0 = b;
        if(map0.containsKey(byte0)) {
            throw new hmfr(String.format("INS %02X already registered in sSupportedCommands", byte0));
        }
        map0.put(byte0, class0);
    }

    public static hmbd[] values() {
        return (hmbd[])hmbd.c.clone();
    }
}

