import com.google.android.gms.significantplaces.settings.DeletePlaceChimeraActivity;

final class epiy extends ibsl implements ibtw {
    int a;
    final String b;
    final DeletePlaceChimeraActivity c;

    public epiy(String s, DeletePlaceChimeraActivity deletePlaceChimeraActivity0, ibrl ibrl0) {
        this.b = s;
        this.c = deletePlaceChimeraActivity0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((epiy)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new epiy(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            epix epix0 = new epix(this.b);
            this.a = 1;
            if(epom.a.e(epix0, this) == object1) {
                return object1;
            }
        }
        ((ggtj)epit.a.h()).B("removed significant place: %s", this.b);
        new ccmp().a(bbdg.wB);
        epil.b(this.c);
        return ibom.a;
    }
}

