import android.content.Context;

final class fuap implements ibtx {
    final fuat a;
    final jbg b;
    final Context c;
    final jbn d;
    final gra e;

    public fuap(fuat fuat0, jbg jbg0, Context context0, jbn jbn0, gra gra0) {
        this.a = fuat0;
        this.b = jbg0;
        this.c = context0;
        this.d = jbn0;
        this.e = gra0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dih)object0), "$this$BoxWithConstraints");
        boolean z = true;
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dih)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        gra gra0 = this.e;
        fubu fubu0 = (fubu)this.a.d;
        fryv fryv0 = fubu0.a;
        ((goz)object1).M(5004770);
        boolean z1 = ((goz)object1).X(fryv0);
        jbg jbg0 = this.b;
        Context context0 = this.c;
        jbn jbn0 = this.d;
        Object object3 = ((goz)object1).k();
        if(z1 || object3 == gop.a) {
            object3 = jbg.a(jbg0, fryv0.a(context0).toString(), jbn0, 0, false, 0, ((dih)object0).b, false, 988);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        if(((jbe)object3).e() <= fubu0.d) {
            z = false;
        }
        gra0.b(Boolean.valueOf(z));
        return ibom.a;
    }
}

