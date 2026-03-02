import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class qpq {
    public static final qpq a;
    public qpr b;
    private final List c;

    static {
        qpq.a = new qpq(new String[]{"COMPOSITION"});
    }

    private qpq(qpq qpq0) {
        this.c = new ArrayList(qpq0.c);
        this.b = qpq0.b;
    }

    public qpq(String[] arr_s) {
        this.c = Arrays.asList(arr_s);
    }

    public final int a(String s, int v) {
        if(qpq.h(s)) {
            return 0;
        }
        List list0 = this.c;
        if(!((String)list0.get(v)).equals("**")) {
            return 1;
        }
        if(v == list0.size() - 1) {
            return 0;
        }
        return ((String)list0.get(v + 1)).equals(s) ? 2 : 0;
    }

    public final qpq b(String s) {
        qpq qpq0 = new qpq(this);
        qpq0.c.add(s);
        return qpq0;
    }

    public final qpq c(qpr qpr0) {
        qpq qpq0 = new qpq(this);
        qpq0.b = qpr0;
        return qpq0;
    }

    public final boolean d(String s, int v) {
        List list0 = this.c;
        if(v >= list0.size()) {
            return false;
        }
        int v1 = list0.size() - 1;
        String s1 = (String)list0.get(v);
        if(!s1.equals("**")) {
            return (v == v1 || v == list0.size() - 2 && this.g()) && (s1.equals(s) || s1.equals("*"));
        }
        if(v != v1) {
            if(((String)list0.get(v + 1)).equals(s)) {
                return v == list0.size() - 2 ? true : v == list0.size() - 3 && this.g();
            }
            return v + 1 >= list0.size() - 1 ? ((String)list0.get(v + 1)).equals(s) : false;
        }
        return true;
    }

    public final boolean e(String s, int v) {
        if(qpq.h(s)) {
            return true;
        }
        return v < this.c.size() ? ((String)this.c.get(v)).equals(s) || ((String)this.c.get(v)).equals("**") || ((String)this.c.get(v)).equals("*") : false;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            if(!this.c.equals(((qpq)object0).c)) {
                return false;
            }
            return this.b == null ? ((qpq)object0).b == null : this.b.equals(((qpq)object0).b);
        }
        return false;
    }

    public final boolean f(String s, int v) {
        return "__container".equals(s) ? true : v < this.c.size() - 1 || ((String)this.c.get(v)).equals("**");
    }

    private final boolean g() {
        return ((String)this.c.get(this.c.size() - 1)).equals("**");
    }

    private static final boolean h(String s) {
        return "__container".equals(s);
    }

    @Override
    public final int hashCode() {
        int v = this.c.hashCode() * 0x1F;
        return this.b == null ? v : v + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "KeyPath{keys=" + this.c + ",resolved=" + (this.b != null) + "}";
    }
}

