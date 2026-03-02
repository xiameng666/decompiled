import java.util.List;

public final class fuci {
    public final fryv a;
    public final List b;
    public final int c;
    public final fucg d;

    public fuci() {
        this(null, null, null, 15);
    }

    public fuci(fryv fryv0, List list0, int v, fucg fucg0) {
        this.a = fryv0;
        this.b = list0;
        this.c = v;
        this.d = fucg0;
    }

    public fuci(fryv fryv0, List list0, fucg fucg0, int v) {
        if(1 == (v & 1)) {
            fryv0 = null;
        }
        if((v & 2) != 0) {
            list0 = null;
        }
        if((v & 8) != 0) {
            fucg0 = null;
        }
        this(fryv0, list0, ((v & 4) == 0 ? 0 : 3), fucg0);
    }

    public static fuci a(fuci fuci0, fryv fryv0, List list0, fucg fucg0, int v) {
        if((v & 1) != 0) {
            fryv0 = fuci0.a;
        }
        if((v & 2) != 0) {
            list0 = fuci0.b;
        }
        int v1 = (v & 4) == 0 ? 0 : fuci0.c;
        if((v & 8) != 0) {
            fucg0 = fuci0.d;
        }
        return new fuci(fryv0, list0, v1, fucg0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fuci)) {
            return false;
        }
        if(!ibuq.m(this.a, ((fuci)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((fuci)object0).b)) {
            return false;
        }
        return this.c == ((fuci)object0).c ? ibuq.m(this.d, ((fuci)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c;
        fucg fucg0 = this.d;
        if(fucg0 != null) {
            v = fucg0.hashCode();
        }
        return ((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "TileListContent(subtitle=" + this.a + ", rows=" + this.b + ", maxRowsShown=" + this.c + ", actionButton=" + this.d + ")";
    }
}

