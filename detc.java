final class detc implements ibtx {
    final devp a;
    final ibts b;
    final gra c;
    final ibth d;
    final ibth e;
    final gra f;
    final gei g;

    public detc(devp devp0, ibts ibts0, gra gra0, gei gei0, ibth ibth0, ibth ibth1, gra gra1) {
        this.a = devp0;
        this.b = ibts0;
        this.c = gra0;
        this.g = gei0;
        this.d = ibth0;
        this.e = ibth1;
        this.f = gra1;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dlp)object0), "$this$DesktopScaffold");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        devp devp0 = this.a;
        ibts ibts0 = this.b;
        ((goz)object1).M(5004770);
        gra gra0 = this.c;
        boolean z = ((goz)object1).X(gra0);
        Object object3 = ((goz)object1).k();
        if(z || object3 == gop.a) {
            object3 = new deta(gra0);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        devo.O(devp0, ibts0, ((ibts)object3), this.g, ((goz)object1));
        gra gra1 = this.f;
        ibth ibth0 = this.d;
        ibth ibth1 = this.e;
        boolean z1 = devo.l(gra1);
        ((goz)object1).M(5004770);
        boolean z2 = ((goz)object1).X(gra1);
        Object object4 = ((goz)object1).k();
        if(z2 || object4 == gop.a) {
            object4 = new detb(gra1);
            ((goz)object1).R(object4);
        }
        ((goz)object1).A();
        dexb.f(z1, ibth0, ibth1, ((ibth)object4), ((goz)object1), 0);
        return ibom.a;
    }
}

