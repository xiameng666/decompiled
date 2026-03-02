import android.content.Context;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public final class aueo implements ibts {
    public final auez a;
    public final Context b;

    public aueo(auez auez0, Context context0) {
        this.a = auez0;
        this.b = context0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((aaxg)object0), "$this$getStringClient");
        ibuq.c(this.b);
        ibuq.f(this.b, "context");
        ibuq.f(this.a.c, "clientPkg");
        aaxh aaxh0 = ((aaxg)object0).a;
        aaxh0.a = "com.google.android.gms#" + this.a.c + "#select_device";
        Set set0 = ibqg.c(new Integer[]{((int)1), ((int)2), ((int)4)});
        ibuq.f(set0, "value");
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: set0) {
            int v = ((Number)object1).intValue();
            if(v <= 0 || v >= 5) {
                arrayList0.add(object1);
            }
        }
        if(!arrayList0.isEmpty()) {
            throw new IllegalArgumentException("Unrecognized types " + arrayList0.toString());
        }
        ibuq.f(set0, "<set-?>");
        aaxh0.b = set0;
        aaxf aaxf0 = ((aaxg)object0).b;
        Set set1 = ibqg.b("");
        ibuq.f(set1, "data");
        if(set1.isEmpty()) {
            throw new IllegalArgumentException(a.i("wifi", "No values provided for ", "!"));
        }
        aaxh aaxh1 = aaxf0.a.a;
        Map map0 = aaxh1.c;
        ArrayList arrayList1 = new ArrayList(ibpo.q(set1, 10));
        for(Object object2: set1) {
            arrayList1.add(String.valueOf(object2));
        }
        Map map1 = ibpz.o(map0, new ibns("wifi", ibpo.ay(arrayList1)));
        ibuq.f(map1, "<set-?>");
        aaxh1.c = map1;
        return ibom.a;
    }
}

