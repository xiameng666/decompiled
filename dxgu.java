final class dxgu implements ibtw {
    final dxhl a;
    final gui b;

    public dxgu(dxhl dxhl0, gui gui0) {
        this.a = dxhl0;
        this.b = gui0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        dxhs dxhs0 = dxhl.y(this.b);
        ibuq.d(dxhs0, "null cannot be cast to non-null type com.google.android.gms.pay.pix.gboard.viewmodel.PixGboardPayFlowScreenState.FopSelection");
        this.a.D(((dxhp)dxhs0).a, ((goz)object0), 0);
        return ibom.a;
    }
}

