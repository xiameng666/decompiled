public final class ghhq {
    public String a;
    public int b;
    public boolean c;
    public boolean d;
    public ghhp e;
    public ggfp f;
    public ggfp g;
    public gged_interceptors h;
    public ghhn i;
    public ghhn j;
    public int k;
    public int l;

    public ghhq() {
    }

    public ghhq(String s, int v, boolean z, boolean z1, boolean z2, ghhp ghhp0) {
        gftb.z(s, "Element name can not be null");
        gftb.z(ghhp0, "Element flow can not be null");
        this.a = s;
        this.b = v;
        this.c = z;
        this.d = z2;
        this.e = ghhp0;
        int v1 = 1;
        this.k = 1;
        if(z1) {
            v1 = 2;
        }
        this.l = v1;
        this.f = ggnj.a;
        this.g = ggnj.a;
        this.h = ggna.a;
        this.i = ghhn.a;
        this.j = ghhn.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof ghhq) ? this.a.equals(((ghhq)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return this.a;
    }
}

