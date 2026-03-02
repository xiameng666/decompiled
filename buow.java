import android.content.Context;

final class buow implements ibtx {
    final Context a;
    final tyb b;
    final gui c;

    public buow(Context context0, tyb tyb0, gui gui0) {
        this.a = context0;
        this.b = tyb0;
        this.c = gui0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dlp)object0), "$this$TopAppBar");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        foec foec0 = (foec)this.c.a();
        if(foec0 != null) {
            String s = foec0.h == null ? foec0.i : foec0.h;
            ((goz)object1).M(5004770);
            Context context0 = this.a;
            boolean z = ((goz)object1).Z(context0);
            Object object3 = ((goz)object1).k();
            if(z || object3 == gop.a) {
                object3 = new buou(context0);
                ((goz)object1).R(object3);
            }
            ((goz)object1).A();
            hfc hfc0 = iqn.a(dla.j(hfc.e, 0.0f, 0.0f, 8.0f, 0.0f, 11), "AvatarIcon");
            ((goz)object1).M(0x97EA02AA);
            tyb tyb0 = this.b;
            int v1 = ((goz)object1).Z(tyb0) | ((goz)object1).X(s) | ((goz)object1).Z(foec0);
            Object object4 = ((goz)object1).k();
            if(v1 != 0 || object4 == gop.a) {
                object4 = new buov(tyb0, s, foec0);
                ((goz)object1).R(object4);
            }
            ((goz)object1).A();
            jnl.b(((ibts)object3), hfc0, ((ibts)object4), ((goz)object1), 0x30, 0);
        }
        return ibom.a;
    }
}

