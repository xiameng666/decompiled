public final class ftvr {
    public final fryv a;
    public final fryk b;
    public final ftuw c;
    public final ibth d;
    private final fryv e;
    private final jkv f;

    public ftvr(fryv fryv0, fryk fryk0, ftuw ftuw0, ibth ibth0) {
        ibuq.f(ibth0, "onDismissRequest");
        super();
        this.a = fryv0;
        this.e = null;
        this.b = fryk0;
        this.f = null;
        this.c = ftuw0;
        this.d = ibth0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ftvr)) {
            return false;
        }
        if(!ibuq.m(this.a, ((ftvr)object0).a)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        if(!ibuq.m(this.b, ((ftvr)object0).b)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        return ibuq.m(this.c, ((ftvr)object0).c) ? ibuq.m(this.d, ((ftvr)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 961;
        int v1 = 0;
        int v2 = this.b == null ? 0 : ((fryh)this.b).a;
        ftuw ftuw0 = this.c;
        if(ftuw0 != null) {
            v1 = ftuw0.hashCode();
        }
        return ((v + v2) * 961 + v1) * 0x1F + this.d.hashCode();
    }

    @Override
    public final String toString() {
        return "BulletinState(title=" + this.a + ", body=null, image=" + this.b + ", imageWidth=null, actionBarState=" + this.c + ", onDismissRequest=" + this.d + ")";
    }
}

