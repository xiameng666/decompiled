final class bgbn implements ibtw {
    final bgbv a;
    final gui b;

    public bgbn(bgbv bgbv0, gui gui0) {
        this.a = bgbv0;
        this.b = gui0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        bgdv bgdv0 = (bgdv)this.b.a();
        ((goz)object0).M(5004770);
        bgbv bgbv0 = this.a;
        boolean z = ((goz)object0).Z(bgbv0);
        Object object2 = ((goz)object0).k();
        if(z || object2 == gop.a) {
            object2 = new bgbh(bgbv0);
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        bgeu bgeu0 = bgbv0.A();
        ((goz)object0).M(5004770);
        boolean z1 = ((goz)object0).Z(bgeu0);
        Object object3 = ((goz)object0).k();
        if(z1 || object3 == gop.a) {
            object3 = new bgbk(bgeu0);
            ((goz)object0).R(object3);
        }
        ((goz)object0).A();
        bgeu bgeu1 = bgbv0.A();
        ((goz)object0).M(5004770);
        boolean z2 = ((goz)object0).Z(bgeu1);
        Object object4 = ((goz)object0).k();
        if(z2 || object4 == gop.a) {
            object4 = new bgbl(bgeu1);
            ((goz)object0).R(object4);
        }
        ((goz)object0).A();
        ((goz)object0).M(5004770);
        boolean z3 = ((goz)object0).Z(bgbv0);
        Object object5 = ((goz)object0).k();
        if(z3 || object5 == gop.a) {
            object5 = new bgbi(bgbv0);
            ((goz)object0).R(object5);
        }
        ((goz)object0).A();
        bfnb bfnb0 = bgbv0.ag;
        if(bfnb0 == null) {
            ibuq.j("navigateToMovePasswordsScreenLauncher");
            bfnb0 = null;
        }
        ((goz)object0).M(5004770);
        boolean z4 = ((goz)object0).Z(bfnb0);
        Object object6 = ((goz)object0).k();
        if(z4 || object6 == gop.a) {
            object6 = new bgbm(bfnb0);
            ((goz)object0).R(object6);
        }
        ((goz)object0).A();
        ((goz)object0).M(5004770);
        boolean z5 = ((goz)object0).Z(bgbv0);
        Object object7 = ((goz)object0).k();
        if(z5 || object7 == gop.a) {
            object7 = new bgbj(bgbv0);
            ((goz)object0).R(object7);
        }
        ((goz)object0).A();
        bgdq.d(bgdv0, ((ibth)object2), ((ibts)(((ibwx)object3))), ((ibth)(((ibwx)object4))), ((ibth)object5), ((ibth)(((ibwx)object6))), ((ibtw)object7), bgah.a, bgah.b, ((goz)object0), 0x6C00000);
        return ibom.a;
    }
}

