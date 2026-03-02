import android.util.Size;
import j..util.Objects;
import java.util.List;

public final class bfp {
    public bhl a;
    public bhl b;
    public bka c;
    public bka d;
    public bka e;
    public final Size f;
    public final int g;
    public final List h;
    public final boolean i;
    public final bco j;
    public final bgf k;
    public final bsc l;
    public final bsc m;

    public bfp() {
        this.a = new bhl();
        this.e = null;
    }

    public bfp(Size size0, int v, List list0, boolean z, bco bco0, bgf bgf0, bsc bsc0, bsc bsc1) {
        this.a = new bhl();
        this.e = null;
        if(size0 == null) {
            throw new NullPointerException("Null size");
        }
        this.f = size0;
        this.g = v;
        this.h = list0;
        this.i = z;
        this.j = bco0;
        this.k = bgf0;
        this.l = bsc0;
        this.m = bsc1;
    }

    public final bka a() {
        return (bka)Objects.requireNonNull(this.c);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof bfp) && this.f.equals(((bfp)object0).f) && this.g == ((bfp)object0).g && this.h.equals(((bfp)object0).h) && this.i == ((bfp)object0).i) {
            bco bco0 = this.j;
            if(bco0 != null) {
                if(bco0.equals(((bfp)object0).j)) {
                label_8:
                    bgf bgf0 = this.k;
                    if(bgf0 == null) {
                        return ((bfp)object0).k == null ? this.l.equals(((bfp)object0).l) && this.m.equals(((bfp)object0).m) : false;
                    }
                    return bgf0.equals(((bfp)object0).k) ? this.l.equals(((bfp)object0).l) && this.m.equals(((bfp)object0).m) : false;
                }
            }
            else if(((bfp)object0).j == null) {
                goto label_8;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = ((this.f.hashCode() ^ 1000003) * 1000003 ^ this.g) * 1000003 ^ this.h.hashCode();
        int v1 = 0;
        int v2 = this.j == null ? 0 : this.j.hashCode();
        int v3 = this.i ? 0x4CF : 0x4D5;
        bgf bgf0 = this.k;
        if(bgf0 != null) {
            v1 = bgf0.hashCode();
        }
        return this.m.hashCode() ^ ((((v * 1000003 ^ v3) * 1000003 ^ v2) * 1000003 ^ v1) * 1000003 ^ this.l.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "In{size=" + this.f + ", inputFormat=" + this.g + ", outputFormats=" + this.h + ", virtualCamera=" + this.i + ", imageReaderProxyProvider=" + this.j + ", postviewSettings=" + this.k + ", requestEdge=" + this.l + ", errorEdge=" + this.m + "}";
    }
}

