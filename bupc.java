final class bupc implements ibtx {
    final bupl a;

    public bupc(bupl bupl0) {
        this.a = bupl0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ((Number)object2).intValue();
        ibuq.f(((cmhw)object0), "$this$VisualElement");
        bupl bupl0 = this.a;
        tyb tyb0 = bupl0.ag;
        if(tyb0 == null) {
            ibuq.j("glideRequestManager");
            tyb0 = null;
        }
        ((goz)object1).M(5004770);
        boolean z = ((goz)object1).Z(bupl0);
        Object object3 = ((goz)object1).k();
        if(z || object3 == gop.a) {
            object3 = new buoz(bupl0);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        ((goz)object1).M(5004770);
        boolean z1 = ((goz)object1).Z(bupl0);
        Object object4 = ((goz)object1).k();
        if(z1 || object4 == gop.a) {
            object4 = new bupa(bupl0);
            ((goz)object1).R(object4);
        }
        ((goz)object1).A();
        ((goz)object1).M(5004770);
        boolean z2 = ((goz)object1).Z(bupl0);
        Object object5 = ((goz)object1).k();
        if(z2 || object5 == gop.a) {
            object5 = new bupb(bupl0);
            ((goz)object1).R(object5);
        }
        ((goz)object1).A();
        bupl0.D(tyb0, ((ibts)object3), ((ibts)object4), ((ibth)object5), null, ((goz)object1), 0);
        return ibom.a;
    }
}

