import android.content.Context;

final class bvdm implements ibtx {
    final bvfz a;
    final clzq b;
    final Context c;

    public bvdm(bvfz bvfz0, clzq clzq0, Context context0) {
        this.a = bvfz0;
        this.b = clzq0;
        this.c = context0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ((Number)object2).intValue();
        ibuq.f(((cmhw)object0), "$this$VisualElement");
        bvfz bvfz0 = this.a;
        ibts ibts0 = cmig.d(((cmhw)object0), bvfz0.d);
        ((goz)object1).M(-1633490746);
        int v = ((goz)object1).X(ibts0);
        Context context0 = this.c;
        int v1 = v | ((goz)object1).Z(context0);
        Object object3 = ((goz)object1).k();
        if(v1 != 0 || object3 == gop.a) {
            object3 = new bvdl(ibts0, context0);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        this.b.b(bvfz0.a, false, ((ibth)object3), ((goz)object1), 0);
        return ibom.a;
    }
}

