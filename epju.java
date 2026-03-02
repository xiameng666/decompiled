import com.google.android.gms.significantplaces.settings.PlacePickerChimeraActivity;

final class epju extends ibsl implements ibtw {
    int a;
    final PlacePickerChimeraActivity b;
    final hjij c;

    public epju(PlacePickerChimeraActivity placePickerChimeraActivity0, hjij hjij0, ibrl ibrl0) {
        this.b = placePickerChimeraActivity0;
        this.c = hjij0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((epju)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new epju(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        int v = this.a;
        cpnp cpnp0 = null;
        ibnx.b(object0);
        if(v == 0) {
            epia epia0 = this.b.k;
            if(epia0 == null) {
                ibuq.j("placesApiHelper");
                epia0 = null;
            }
            this.a = 1;
            object2 = epia0.b(this.c, this);
            if(object2 == object1) {
                return object1;
            }
        }
        else {
            object2 = ((ibnw)object0).a;
        }
        Throwable throwable0 = ibnw.a(object2);
        if(throwable0 != null) {
            a.ae(epit.a.j(), "Failed to fetch place by latlng", throwable0);
            object2 = null;
        }
        if(((hatr)object2) == null) {
            return ibom.a;
        }
        epil.a();
        PlacePickerChimeraActivity placePickerChimeraActivity0 = this.b;
        acp acp0 = placePickerChimeraActivity0.l;
        if(acp0 == null) {
            ibuq.j("confirmPlaceActivityLauncher");
            acp0 = null;
        }
        cpnp cpnp1 = placePickerChimeraActivity0.j;
        if(cpnp1 == null) {
            ibuq.j("map");
            cpnp1 = null;
        }
        double f = cpnp1.d().a.a;
        cpnp cpnp2 = placePickerChimeraActivity0.j;
        if(cpnp2 == null) {
            ibuq.j("map");
        }
        else {
            cpnp0 = cpnp2;
        }
        double f1 = cpnp0.d().a.b;
        String s = ((hatr)object2).e;
        ibuq.e(s, "getFormattedAddress(...)");
        String s1 = ((hatr)object2).c;
        ibuq.e(s1, "getId(...)");
        ibuq.e("Dropped pin", "getString(...)");
        acp0.b(epir.b(placePickerChimeraActivity0, f, f1, s, s1, "Dropped pin", 1));
        return ibom.a;
    }
}

