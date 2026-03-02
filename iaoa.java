import java.nio.charset.StandardCharsets;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;

public abstract class iaoa {
    public final String a;
    public final byte[] b;
    public final Object c;
    public static final int d;
    private static final BitSet e;
    private final String f;

    static {
        BitSet bitSet0 = new BitSet(0x7F);
        bitSet0.set(45);
        bitSet0.set(0x5F);
        bitSet0.set(46);
        for(int v = 0x30; v <= 57; v = (char)(v + 1)) {
            bitSet0.set(v);
        }
        for(int v1 = 97; v1 <= 0x7A; v1 = (char)(v1 + 1)) {
            bitSet0.set(v1);
        }
        iaoa.e = bitSet0;
    }

    public iaoa(String s, boolean z, Object object0) {
        gftb.z(s, "name");
        this.f = s;
        String s1 = s.toLowerCase(Locale.ROOT);
        gftb.z(s1, "name");
        gftb.b(((boolean)(s1.isEmpty() ^ 1)), "token must have at least 1 tchar");
        if(s1.equals("connection")) {
            Level level0 = Level.WARNING;
            RuntimeException runtimeException0 = new RuntimeException("exception to show backtrace");
            iaof_metadata.a.logp(level0, "io.grpc.Metadata$Key", "validateName", "Metadata key is \'Connection\', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", runtimeException0);
        }
        int v = 0;
        while(v < s1.length()) {
            int v1 = s1.charAt(v);
            if(z && v1 == 58) {
                if(v == 0) {
                    v = 0;
                    ++v;
                    continue;
                }
                else {
                    v1 = 58;
                }
            }
            if(!iaoa.e.get(v1)) {
                throw new IllegalArgumentException(gfuk.a("Invalid character \'%s\' in key name \'%s\'", new Object[]{Character.valueOf(((char)v1)), s1}));
            }
            ++v;
            continue;
        }
        this.a = s1;
        this.b = s1.getBytes(StandardCharsets.US_ASCII);
        this.c = object0;
    }

    public abstract Object a(byte[] arg1);

    public abstract byte[] b(Object arg1);

    public boolean c() {
        return false;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 == null || this.getClass() != object0.getClass() ? false : this.a.equals(((iaoa)object0).a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Key{name=\'" + this.a + "\'}";
    }
}

