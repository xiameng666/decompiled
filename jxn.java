import android.graphics.Insets;

public final class jxn {
    public static final jxn a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    static {
        jxn.a = new jxn(0, 0, 0, 0);
    }

    private jxn(int v, int v1, int v2, int v3) {
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = v3;
    }

    public final Insets a() {
        return Insets.of(this.b, this.c, this.d, this.e);
    }

    public static jxn b(jxn jxn0, jxn jxn1) {
        return jxn.e(jxn0.b + jxn1.b, jxn0.c + jxn1.c, jxn0.d + jxn1.d, jxn0.e + jxn1.e);
    }

    public static jxn c(jxn jxn0, jxn jxn1) {
        return jxn.e(Math.max(jxn0.b, jxn1.b), Math.max(jxn0.c, jxn1.c), Math.max(jxn0.d, jxn1.d), Math.max(jxn0.e, jxn1.e));
    }

    public static jxn d(jxn jxn0, jxn jxn1) {
        return jxn.e(Math.min(jxn0.b, jxn1.b), Math.min(jxn0.c, jxn1.c), Math.min(jxn0.d, jxn1.d), Math.min(jxn0.e, jxn1.e));
    }

    public static jxn e(int v, int v1, int v2, int v3) {
        if(v == 0) {
            v = 0;
            if(v1 == 0) {
                if(v2 == 0) {
                    return v3 == 0 ? jxn.a : new jxn(0, 0, 0, v3);
                }
                v1 = 0;
            }
        }
        return new jxn(v, v1, v2, v3);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            if(this.e != ((jxn)object0).e) {
                return false;
            }
            if(this.b != ((jxn)object0).b) {
                return false;
            }
            return this.d == ((jxn)object0).d ? this.c == ((jxn)object0).c : false;
        }
        return false;
    }

    public static jxn f(Insets insets0) {
        return jxn.e(insets0.left, insets0.top, insets0.right, insets0.bottom);
    }

    @Override
    public final int hashCode() {
        return ((this.b * 0x1F + this.c) * 0x1F + this.d) * 0x1F + this.e;
    }

    @Override
    public final String toString() {
        return "Insets{left=" + this.b + ", top=" + this.c + ", right=" + this.d + ", bottom=" + this.e + '}';
    }
}

