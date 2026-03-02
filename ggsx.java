import java.util.Iterator;

public class ggsx {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final long d;
    private final Class e;

    protected ggsx(String s, Class class0, boolean z) {
        this(s, class0, z, true);
    }

    public ggsx(String s, Class class0, boolean z, boolean z1) {
        if(s.isEmpty()) {
            throw new IllegalArgumentException("identifier must not be empty");
        }
        if(!ggwv.c(s.charAt(0))) {
            throw new IllegalArgumentException("identifier must start with an ASCII letter: " + s);
        }
        for(int v1 = 1; v1 < s.length(); ++v1) {
            int v2 = s.charAt(v1);
            if(!ggwv.c(((char)v2)) && (v2 < 0x30 || v2 > 57) && v2 != 0x5F) {
                throw new IllegalArgumentException("identifier must contain only ASCII letters, digits or underscore: " + s);
            }
        }
        this.a = s;
        this.e = class0;
        this.b = z;
        this.c = z1;
        int v3 = System.identityHashCode(this);
        long v4 = 0L;
        for(int v = 0; v < 5; ++v) {
            v4 |= 1L << (v3 & 0x3F);
            v3 >>>= 6;
        }
        this.d = v4;
    }

    public void a(Iterator iterator0, ggsw ggsw0) {
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            this.b(object0, ggsw0);
        }
    }

    public void b(Object object0, ggsw ggsw0) {
        ggsw0.a(this.a, object0);
    }

    public final Object c(Object object0) {
        return this.e.cast(object0);
    }

    @Override
    public final String toString() {
        return this.getClass().getName() + "/" + this.a + "[" + this.e.getName() + "]";
    }
}

