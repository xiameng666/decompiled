public final class dnmj implements fulf {
    public final fryv a;
    public final fryv b;
    public final ibth c;
    public fule d;
    public boolean e;
    private final fryv f;
    private final int g;
    private final int h;
    private final long i;
    private final frxs j;
    private final fryv k;

    public dnmj(fryv fryv0, fryv fryv1, ibth ibth0, int v) {
        fule fule0 = fule.a;
        ibuq.f(fule0, "position");
        super();
        this.a = fryv0;
        this.f = null;
        if((v & 4) != 0) {
            fryv1 = null;
        }
        this.b = fryv1;
        this.g = 0;
        this.h = 0;
        this.i = 0L;
        if((v & 0x40) != 0) {
            ibth0 = null;
        }
        this.c = ibth0;
        this.j = null;
        this.k = null;
        this.d = fule0;
        this.e = false;
    }

    @Override  // fulf
    public final void a(fule fule0) {
        ibuq.f(fule0, "<set-?>");
        this.d = fule0;
    }

    @Override  // fulf
    public final void b() {
        this.e = true;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dnmj)) {
            return false;
        }
        if(!ibuq.m(this.a, ((dnmj)object0).a)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        if(!ibuq.m(this.b, ((dnmj)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((dnmj)object0).c)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        return this.d == ((dnmj)object0).d ? this.e == ((dnmj)object0).e : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 961;
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        ibth ibth0 = this.c;
        if(ibth0 != null) {
            v1 = ibth0.hashCode();
        }
        int v3 = ((v + v2) * 0xE1781 + v1) * 0x745F + this.d.hashCode();
        return this.e ? v3 * 0x1F + 0x4CF : v3 * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        return "CardRewardsPreviewState(title=" + this.a + ", body=null, actionText=" + this.b + ", veLogConstWalletTip=0, veLogConstCloseButton=0, treatmentId=0, onClick=" + this.c + ", graphicImageContainerBackgroundColor=null, imageContentDescription=null, position=" + this.d + ", isContained=" + this.e + ")";
    }
}

