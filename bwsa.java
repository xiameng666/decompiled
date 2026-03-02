import java.util.Arrays;

public final class bwsa {
    public final bwqk a;
    public final String b;
    public final int c;
    private static final ggeo d;

    static {
        bwsa.d = ggeo.n(Integer.valueOf(1), "_no_gsa", Integer.valueOf(2), "", Integer.valueOf(3), "_cross_device");
    }

    public bwsa(bwqk bwqk0, String s, int v) {
        batl.c(gopv.c(v), a.f(v, "The scope of this indexable is not valid, scope value is ", "."));
        this.a = bwqk0;
        this.b = s;
        this.c = v;
    }

    public static bwsa a(String s, String s1, bwtc bwtc0) {
        return s.startsWith("internal.3p:") ? bwsa.b(s.substring(12), s1, bwtc0) : null;
    }

    public static bwsa b(String s, String s1, bwtc bwtc0) {
        bwrz bwrz0 = bwsa.j(s);
        return new bwsa(bwtc0.a(bwrz0.a), s1, bwrz0.b);
    }

    public final String c() {
        return "internal.3p:" + this.d();
    }

    public final String d() {
        return this.a.b + ((String)bwsa.d.get(Integer.valueOf(this.c)));
    }

    public final String e() {
        return bwsa.f(this.d(), this.b);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        if(this == object0) {
            return true;
        }
        return (object0 instanceof bwsa) ? bata.b(this.a.b, ((bwsa)object0).a.b) && bata.b(this.b, ((bwsa)object0).b) && bata.b(Integer.valueOf(this.c), Integer.valueOf(((bwsa)object0).c)) : false;
    }

    public static String f(String s, String s1) {
        return a.V(s1, s, "_", "_seq_table");
    }

    public static String g(String s) {
        return bwsa.i(s) ? bwsa.h(s.substring(12)) : "";
    }

    public static String h(String s) {
        return bwsa.j(s).a;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a.b, this.b, ((int)this.c)});
    }

    public static boolean i(String s) {
        return s.startsWith("internal.3p:");
    }

    private static bwrz j(String s) {
        int v;
        if(s.endsWith("_no_gsa")) {
            v = 1;
        }
        else {
            v = s.endsWith("_cross_device") ? 3 : 2;
        }
        String s1 = (String)bwsa.d.get(Integer.valueOf(v));
        return s1 == null ? new bwrz(s.substring(0, s.length()), v) : new bwrz(s.substring(0, s.length() - s1.length()), v);
    }
}

