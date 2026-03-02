import java.util.HashMap;

public final class blvm implements jqv {
    public final blwa a;
    public final gfsx b;
    public final bmae c;
    public final gfsx d;
    public final bluv e;

    public blvm(blwa blwa0, gfsx gfsx0, bmae bmae0, gfsx gfsx1, bluv bluv0) {
        this.a = blwa0;
        this.b = gfsx0;
        this.c = bmae0;
        this.d = gfsx1;
        this.e = bluv0;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        this.a.p = new blvs(jqt0);
        this.e.ai = new blvt(this.a, this.c, this.e);
        this.e.d = this.b;
        this.e.ag = this.d;
        HashMap hashMap0 = new HashMap();
        blun blun0 = new blun();
        bluk.a(bluu.b, blun0, hashMap0);
        bluo bluo0 = new bluo(this.e);
        bluk.a(bluu.c, bluo0, hashMap0);
        blup blup0 = new blup(this.e);
        bluk.a(bluu.d, blup0, hashMap0);
        bluq bluq0 = new bluq(this.e);
        bluk.a(bluu.e, bluq0, hashMap0);
        blur blur0 = new blur(this.e);
        blus blus0 = new blus(this.e);
        this.e.a = new blul(bluu.b, hashMap0, blur0, blus0);
        blul blul0 = this.e.a;
        if(!blul0.d) {
            blul0.d = true;
            blul0.e = blul0.a;
            blul0.b();
        }
        return "Verify user and sign data";
    }
}

