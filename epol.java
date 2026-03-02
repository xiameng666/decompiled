import android.content.Intent;

final class epol extends ibsl implements ibtw {
    int a;
    final ibtw b;
    private Object c;

    public epol(ibtw ibtw0, ibrl ibrl0) {
        this.b = ibtw0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((epol)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new epol(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibvd ibvd0;
        Object object1 = ibrx.a;
        if(this.a != 0) {
            ibvd0 = (ibvd)this.c;
            ibnx.b(object0);
            goto label_13;
        }
        ibnx.b(object0);
        icck icck0 = (icck)this.c;
        ibvd ibvd1 = new ibvd();
        gmcd gmcd0 = epom.a.h().c(new epoj(new epoi(icck0, ibvd1, this.b)), gmap.a);
        this.c = ibvd1;
        this.a = 1;
        if(icpu.c(gmcd0, this) != object1) {
            ibvd0 = ibvd1;
        label_13:
            Object object2 = ibvd0.a;
            if(object2 == null) {
                ibuq.j("newSignificantPlaces");
            }
            else {
                epnt epnt0 = (epnt)object2;
            }
            synchronized(epom.a) {
                Intent intent0 = new Intent("com.google.android.gms.significantplaces.storage.SIGNIFICANT_PLACES_UPDATE").setPackage("com.google.android.gms");
                epom.b.sendBroadcast(intent0);
            }
            return ibom.a;
        }
        return object1;
    }
}

