import android.accounts.Account;

final class dfqi implements ibtx {
    final dfqp a;
    final ibth b;
    final gui c;
    final ibth d;
    final boolean e;

    public dfqi(dfqp dfqp0, ibth ibth0, gui gui0, ibth ibth1, boolean z) {
        this.a = dfqp0;
        this.b = ibth0;
        this.c = gui0;
        this.d = ibth1;
        this.e = z;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dim)object0), "$this$SettingsGroup");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        dfqp dfqp0 = this.a;
        Object object3 = ((dfog)dfqp0.a).a;
        String s = ((Account)object3) == null ? null : ((Account)object3).name;
        Number number0 = (Number)((dfog)dfqp0.b).a;
        boolean z = true;
        boolean z1 = number0.intValue() == 4;
        ibth ibth0 = this.b;
        ((goz)object1).M(5004770);
        gui gui0 = this.c;
        boolean z2 = ((goz)object1).X(gui0);
        Object object4 = ((goz)object1).k();
        if(z2 || object4 == gop.a) {
            object4 = new dfqe(gui0);
            ((goz)object1).R(object4);
        }
        ((goz)object1).A();
        dfqn.f(s, z1, ibth0, ((ibth)object4), ((goz)object1), 0);
        boolean z3 = number0.intValue() == 1;
        ((goz)object1).M(5004770);
        boolean z4 = ((goz)object1).X(gui0);
        Object object5 = ((goz)object1).k();
        if(z4 || object5 == gop.a) {
            object5 = new dfqf(gui0);
            ((goz)object1).R(object5);
        }
        ((goz)object1).A();
        dfqn.b(object3 == null, z3, ibth0, ((ibth)object5), this.d, ((goz)object1), 0);
        ((goz)object1).M(0xBC33433);
        if(!this.e) {
            boolean z5 = number0.intValue() == 3 && ((Boolean)((dfog)dfqp0.c).a).booleanValue();
            ((goz)object1).M(5004770);
            boolean z6 = ((goz)object1).X(gui0);
            Object object6 = ((goz)object1).k();
            if(z6 || object6 == gop.a) {
                object6 = new dfqg(gui0);
                ((goz)object1).R(object6);
            }
            ((goz)object1).A();
            dfqn.d(z5, ((ibth)object6), ((goz)object1), 0);
        }
        ((goz)object1).A();
        if(number0.intValue() != 3 || ((Boolean)((dfog)dfqp0.c).a).booleanValue()) {
            z = false;
        }
        ((goz)object1).M(5004770);
        boolean z7 = ((goz)object1).X(gui0);
        Object object7 = ((goz)object1).k();
        if(z7 || object7 == gop.a) {
            object7 = new dfqh(gui0);
            ((goz)object1).R(object7);
        }
        ((goz)object1).A();
        dfqn.g(z, ((ibth)object7), ((goz)object1), 0);
        return ibom.a;
    }
}

