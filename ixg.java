import java.util.List;

public final class ixg implements ibth {
    public final ixh a;

    public ixg(ixh ixh0) {
        this.a = ixh0;
    }

    @Override  // ibth
    public final Object a() {
        List list0 = this.a.d;
        if(list0.isEmpty()) {
            return (float)0.0f;
        }
        Object object0 = list0.get(0);
        float f = ((ixl)object0).a.a();
        int v = ibpo.d(list0);
        if(v > 0) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = list0.get(v1);
                float f1 = ((ixl)object1).a.a();
                int v2 = Float.compare(f, f1);
                if(v2 < 0) {
                    f = f1;
                }
                if(v2 < 0) {
                    object0 = object1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return ((ixl)object0) == null ? ((float)0.0f) : ((ixl)object0).a.a();
    }
}

