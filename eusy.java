import java.util.ArrayList;

public final class eusy implements bboe {
    @Override  // bboe
    public final Object a(Object object0) {
        gged_interceptors gged0 = gged_interceptors.h(gggq.d((((dpfp)object0).b == 1 ? ((dpfe)((dpfp)object0).c) : dpfe.b).e, new eutc()));
        ArrayList arrayList0 = new ArrayList();
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            hkhr hkhr0 = (hkhr)gged0.get(v1);
            arrayList0.add(dpfq.b(hkhr0, gged0.indexOf(hkhr0) == 0));
        }
        return gged_interceptors.i(arrayList0);
    }
}

