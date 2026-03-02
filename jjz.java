import java.util.ArrayList;

public final class jjz {
    public static final jjz a;
    public static final jjz b;
    public static final jjz c;
    public final int d;

    static {
        jjz.a = new jjz(0);
        jjz.b = new jjz(1);
        jjz.c = new jjz(2);
    }

    public jjz(int v) {
        this.d = v;
    }

    public final boolean a(jjz jjz0) {
        return (jjz0.d | this.d) == this.d;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof jjz) ? this.d == ((jjz)object0).d : false;
    }

    @Override
    public final int hashCode() {
        return this.d;
    }

    @Override
    public final String toString() {
        int v = this.d;
        if(v == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList0 = new ArrayList();
        if((jjz.b.d & v) != 0) {
            arrayList0.add("Underline");
        }
        if((v & jjz.c.d) != 0) {
            arrayList0.add("LineThrough");
        }
        return arrayList0.size() == 1 ? "TextDecoration." + ((String)arrayList0.get(0)) : "TextDecoration[" + jlz.c(arrayList0, ", ", null, null, null, 62) + ']';
    }
}

