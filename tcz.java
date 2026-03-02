import java.io.Serializable;
import java.util.Arrays;

public final class tcz implements Serializable {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;
    public final int e;
    private final String f;
    private final tdb g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;

    public tcz(String s, String s1, byte[] arr_b, int v, int v1, int v2, int v3, int v4, int v5, int v6, tdb tdb0, int v7) {
        this.a = s;
        this.f = s1;
        this.b = arr_b;
        this.c = v;
        this.d = v1;
        this.e = v2;
        this.h = v3;
        this.i = v4;
        this.j = v5;
        this.k = v6;
        this.g = tdb0;
        this.l = v7;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        if(this.getClass() != object0.getClass()) {
            return false;
        }
        if(this.a.equals(((tcz)object0).a) && this.f.equals(((tcz)object0).f)) {
            if(!Arrays.equals(this.b, ((tcz)object0).b)) {
                return false;
            }
            if(this.c != ((tcz)object0).c) {
                return false;
            }
            if(this.d != ((tcz)object0).d) {
                return false;
            }
            if(this.h != ((tcz)object0).h) {
                return false;
            }
            if(this.i != ((tcz)object0).i) {
                return false;
            }
            if(this.j != ((tcz)object0).j) {
                return false;
            }
            if(this.k != ((tcz)object0).k) {
                return false;
            }
            return this.g == ((tcz)object0).g ? this.l == ((tcz)object0).l : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.b);
        int v1 = ((this.a.hashCode() + 469) * 67 + this.f.hashCode()) * 67 + v;
        int v2 = this.i;
        int v3 = 0;
        if(v2 == 0) {
            v2 = 0;
        }
        int v4 = (((((((((v1 * 67 + this.c) * 67 + 0x80000000) * 67 + this.d) * 67 + this.e) * 67 + this.h) * 67 + 4) * 67 + v2) * 67 + this.j) * 67 + this.k) * 67;
        tdb tdb0 = this.g;
        if(tdb0 != null) {
            v3 = tdb0.hashCode();
        }
        return v4 + v3;
    }
}

