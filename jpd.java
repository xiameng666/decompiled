import java.util.ArrayList;
import java.util.List;

public final class jpd implements iau {
    public static final jpd a;

    static {
        jpd.a = new jpd();
    }

    @Override  // iau
    public final int a(hzg hzg0, List list0, int v) {
        return iat.a(this, hzg0, list0, v);
    }

    @Override  // iau
    public final int b(hzg hzg0, List list0, int v) {
        return iat.b(this, hzg0, list0, v);
    }

    @Override  // iau
    public final int c(hzg hzg0, List list0, int v) {
        return iat.c(this, hzg0, list0, v);
    }

    @Override  // iau
    public final int d(hzg hzg0, List list0, int v) {
        return iat.d(this, hzg0, list0, v);
    }

    @Override  // iau
    public final iav e(iax iax0, List list0, long v) {
        switch(list0.size()) {
            case 0: {
                return iaw.b(iax0, 0, 0, jpa.a);
            }
            case 1: {
                ibq ibq1 = ((ias)list0.get(0)).e(v);
                return iaw.b(iax0, ibq1.a, ibq1.b, new jpb(ibq1));
            }
            default: {
                ArrayList arrayList0 = new ArrayList(list0.size());
                int v2 = list0.size();
                int v3 = 0;
                int v4 = 0;
                for(int v1 = 0; v1 < v2; ++v1) {
                    ibq ibq0 = ((ias)list0.get(v1)).e(v);
                    v3 = Math.max(v3, ibq0.a);
                    v4 = Math.max(v4, ibq0.b);
                    arrayList0.add(ibq0);
                }
                return iaw.b(iax0, v3, v4, new jpc(arrayList0));
            }
        }
    }
}

