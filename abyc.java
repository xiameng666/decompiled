import j..util.DesugarCollections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class abyc {
    public final String a;
    protected final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Map g;
    public final boolean h;

    public abyc(String s, String s1, String s2, String s3, Map map0, boolean z) {
        if(s2 == null) {
            throw new NullPointerException("A URI column must be specified for table " + s1);
        }
        this.d = s2;
        if(s == null) {
            s = a.r(s2, s1, "_");
        }
        this.a = s;
        this.b = s1;
        if(s1.equals(null)) {
            throw new IllegalArgumentException("Tags table and docs table cannot be the same.");
        }
        if(s3 == null) {
            s3 = "0";
        }
        this.e = s3;
        this.f = "0";
        this.g = DesugarCollections.unmodifiableMap(new HashMap(map0));
        this.c = s1;
        this.h = z;
    }

    private final Object[] a() {
        return new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, 0, Boolean.valueOf(this.h), 0, 0};
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof abyc) ? Arrays.deepEquals(this.a(), ((abyc)object0).a()) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.deepHashCode(this.a());
    }
}

