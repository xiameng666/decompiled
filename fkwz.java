import j..time.Instant;

public final class fkwz implements ibts {
    public final Instant a;
    public final fkys b;
    public final fkwm c;

    public fkwz(Instant instant0, fkys fkys0, fkwm fkwm0) {
        this.a = instant0;
        this.b = fkys0;
        this.c = fkwm0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        hfwn hfwn0 = ((fkvu)object0).e;
        if(hfwn0 == null) {
            hfwn0 = hfwn.a;
        }
        ibuq.e(hfwn0, "getLastUpdateTime(...)");
        if(hfyo.d(hfwn0).isAfter(this.a)) {
            gssv gssv0 = ((fkvu)object0).c;
            if(gssv0 == null) {
                gssv0 = gssv.a;
            }
            return gmbu.i(fktz.e(gssv0));
        }
        ibuq.c(((fkvu)object0));
        return gdtf.k(this.b.b(((fkvu)object0), this.c), new fkyl(new fkyk(this.b, ((fkvu)object0))), gmap.a);
    }
}

