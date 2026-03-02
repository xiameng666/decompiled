import com.google.android.gms.common.api.Status;

public final class bgfh extends ibsl implements ibtw {
    int a;
    final bdii b;
    final beck c;

    public bgfh(beck beck0, bdii bdii0, ibrl ibrl0) {
        this.c = beck0;
        this.b = bdii0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bgfh)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bgfh(this.c, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Status status0;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            bgjp bgjp0 = (bgjp)this.c.b.get();
            bdii bdii0 = this.b;
            this.a = 1;
            if(hsas.g()) {
                status0 = new Status(8, "SMS OTP not implemented yet.");
            }
            else {
                status0 = new Status(0, "SMS OTP retrieval disabled by feature flag.");
                bdii0.a(status0, "", cckf.d(bbdp.aX));
            }
            object0 = status0;
            if(object0 == object1) {
                return object1;
            }
        }
        return (Status)object0;
    }
}

