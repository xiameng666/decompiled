import com.google.android.chimera.android.Activity;

final class ddwa implements ibty {
    final Activity a;
    final nry b;

    public ddwa(nry nry0, Activity activity0) {
        this.b = nry0;
        this.a = activity0;
        super();
    }

    @Override  // ibty
    public final Object a(Object object0, Object object1, Object object2, Object object3) {
        ((Number)object3).intValue();
        ibuq.f(((cax)object0), "$this$composable");
        ibuq.f(((nrl)object1), "it");
        ((goz)object2).M(-1633490746);
        nry nry0 = this.b;
        int v = ((goz)object2).Z(nry0);
        Activity activity0 = this.a;
        int v1 = v | ((goz)object2).Z(activity0);
        Object object4 = ((goz)object2).k();
        if(v1 != 0 || object4 == gop.a) {
            object4 = new ddvy(nry0, activity0);
            ((goz)object2).R(object4);
        }
        ((goz)object2).A();
        ((goz)object2).M(5004770);
        boolean z = ((goz)object2).Z(nry0);
        Object object5 = ((goz)object2).k();
        if(z || object5 == gop.a) {
            object5 = new ddvz(nry0);
            ((goz)object2).R(object5);
        }
        ((goz)object2).A();
        dfqn.l(null, ((ibth)object4), ((ibth)object5), ((goz)object2), 0);
        return ibom.a;
    }
}

