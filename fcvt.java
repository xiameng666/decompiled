import java.util.ArrayList;
import java.util.Arrays;

final class fcvt implements ibtx {
    final fcvm a;
    final gui b;

    public fcvt(fcvm fcvm0, gui gui0) {
        this.a = fcvm0;
        this.b = gui0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dib)object0), "$this$TextButton");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dib)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        ibuq.e(this.a.c, "mText");
        jbn jbn0 = pqq.d(((goz)object1)).d;
        Float float0 = (float)100.0f;
        int v1 = ((Number)this.b.a()).intValue();
        ibuq.f(jbn0, "<this>");
        ArrayList arrayList0 = new ArrayList();
        Integer.valueOf(v1).getClass();
        arrayList0.add(jet.b(v1));
        float0.getClass();
        arrayList0.add(jet.a("ROND", 100.0f));
        float0.getClass();
        arrayList0.add(jet.a("wdth", 100.0f));
        jdy[] arr_jdy = new jdy[1];
        jdv.a("font-family-flex-device-default");
        jep[] arr_jep = (jep[])arrayList0.toArray(new jep[0]);
        arr_jdy[0] = jdx.a("font-family-flex-device-default", null, 0, new jes(((jep[])Arrays.copyOf(arr_jep, arr_jep.length))), 6);
        jbn jbn1 = jbn.y(jbn0, 0L, 0L, null, jea.a(arr_jdy), null, 0L, null, 0, 0L, null, null, 0, 0, null, 0xFFFFDF);
        hfc hfc0 = ((dib)object0).a(hfc.e, hei.e);
        pwb.b(this.a.c, hfc0, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, jbn1, ((goz)object1), 0, 0, 0xFFFC);
        return ibom.a;
    }
}

