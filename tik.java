import java.io.Serializable;
import java.util.Arrays;

public final class tik implements Serializable {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    private final String g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;

    public tik(String s, String s1, byte[] arr_b, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, int v9) {
        this.a = s;
        this.g = s1;
        this.b = arr_b;
        this.c = v;
        this.d = v1;
        this.e = v2;
        this.f = v3;
        this.h = v4;
        this.i = v5;
        this.j = v6;
        this.k = v7;
        this.l = v8;
        this.m = v9;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        if(this.getClass() != object0.getClass()) {
            return false;
        }
        if(this.a.equals(((tik)object0).a) && this.g.equals(((tik)object0).g)) {
            if(!Arrays.equals(this.b, ((tik)object0).b)) {
                return false;
            }
            if(this.c != ((tik)object0).c) {
                return false;
            }
            if(this.d != ((tik)object0).d) {
                return false;
            }
            if(this.e != ((tik)object0).e) {
                return false;
            }
            if(this.h != ((tik)object0).h) {
                return false;
            }
            if(this.i != ((tik)object0).i) {
                return false;
            }
            if(this.j != ((tik)object0).j) {
                return false;
            }
            if(this.k != ((tik)object0).k) {
                return false;
            }
            return this.l == ((tik)object0).l ? this.m == ((tik)object0).m : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.b);
        int v1 = ((this.a.hashCode() + 469) * 67 + this.g.hashCode()) * 67 + v;
        int v2 = this.h;
        int v3 = 0;
        if(v2 == 0) {
            v2 = 0;
        }
        int v4 = (((((((((v1 * 67 + this.c) * 67 + this.d) * 67 + this.e) * 67 + this.f) * 67 + v2) * 67 + 4) * 67 + (this.i == 0 ? 0 : this.i)) * 67 + this.j) * 67 + this.k) * 67;
        int v5 = this.l;
        if(v5 != 0) {
            v3 = v5;
        }
        return v4 + v3;
    }
}

