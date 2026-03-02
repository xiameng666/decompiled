import java.util.ArrayList;
import java.util.List;

final class joh implements iau {
    public static final joh a;

    static {
        joh.a = new joh();
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
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v1 = list0.size();
        int v3 = 0;
        int v4 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            ibq ibq0 = ((ias)list0.get(v2)).e(v);
            v4 = Math.max(v4, ibq0.a);
            v3 = Math.max(v3, ibq0.b);
            arrayList0.add(ibq0);
        }
        if(list0.isEmpty()) {
            v4 = jkp.d(v);
            v3 = jkp.c(v);
        }
        return iaw.b(iax0, v4, v3, new jog(arrayList0));
    }
}

