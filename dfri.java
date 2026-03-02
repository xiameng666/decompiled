import android.content.Context;

final class dfri extends ibsl implements ibtw {
    final dfrr a;

    public dfri(dfrr dfrr0, ibrl ibrl0) {
        this.a = dfrr0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dfri)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dfri(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        dcii dcii0 = this.a.d;
        dcii0.b.e("nearby_sharing", 4);
        Context context0 = dcii0.a;
        if(!dcww.b(context0).d()) {
            cuqi cuqi0 = new cuqi(context0, (hvrc.I() ? "nearby_sharing_privacy_interrupting" : "nearby_sharing_privacy"));
            cuqi0.ag(new juk());
            cuqi0.Z("Everyone mode is currently active");
            cuqi0.Y("Bluetooth and Wi-Fi may be used while you\'re in everyone mode. Tap to go to visibility settings.");
            cuqi0.h = dcii0.b();
            cuqi0.al();
            cuqi0.m = 2;
            cuqi0.ak();
            cuqi0.ad(true);
            cuqi0.ac(true);
            cuqi0.X(false);
            cuqi0.D = djbm.a(context0);
            cuqi0.ao();
            cuqi0.an();
            cuqi0.af(0x7F080EEC);  // drawable:sharing_ic_v3_foreground
            cuqi0.aj("Quick Share");
            dcii0.u(6, cuqi0.a());
        }
        return ibom.a;
    }
}

