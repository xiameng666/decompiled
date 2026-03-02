import java.util.ArrayList;
import java.util.List;

final class cbo implements iau {
    private final cch a;
    private boolean b;

    public cbo(cch cch0) {
        this.a = cch0;
    }

    @Override  // iau
    public final int a(hzg hzg0, List list0, int v) {
        if(list0.isEmpty()) {
            return 0;
        }
        int v1 = ((hzf)list0.get(0)).a(v);
        int v2 = ibpo.d(list0);
        if(v2 > 0) {
            for(int v3 = 1; true; ++v3) {
                int v4 = ((hzf)list0.get(v3)).a(v);
                if(v4 > v1) {
                    v1 = v4;
                }
                if(v3 == v2) {
                    break;
                }
            }
        }
        return v1;
    }

    @Override  // iau
    public final int b(hzg hzg0, List list0, int v) {
        if(list0.isEmpty()) {
            return 0;
        }
        int v1 = ((hzf)list0.get(0)).b(v);
        int v2 = ibpo.d(list0);
        if(v2 > 0) {
            for(int v3 = 1; true; ++v3) {
                int v4 = ((hzf)list0.get(v3)).b(v);
                if(v4 > v1) {
                    v1 = v4;
                }
                if(v3 == v2) {
                    break;
                }
            }
        }
        return v1;
    }

    @Override  // iau
    public final int c(hzg hzg0, List list0, int v) {
        if(list0.isEmpty()) {
            return 0;
        }
        int v1 = ((hzf)list0.get(0)).c(v);
        int v2 = ibpo.d(list0);
        if(v2 > 0) {
            for(int v3 = 1; true; ++v3) {
                int v4 = ((hzf)list0.get(v3)).c(v);
                if(v4 > v1) {
                    v1 = v4;
                }
                if(v3 == v2) {
                    break;
                }
            }
        }
        return v1;
    }

    @Override  // iau
    public final int d(hzg hzg0, List list0, int v) {
        if(list0.isEmpty()) {
            return 0;
        }
        int v1 = ((hzf)list0.get(0)).d(v);
        int v2 = ibpo.d(list0);
        if(v2 > 0) {
            for(int v3 = 1; true; ++v3) {
                int v4 = ((hzf)list0.get(v3)).d(v);
                if(v4 > v1) {
                    v1 = v4;
                }
                if(v3 == v2) {
                    break;
                }
            }
        }
        return v1;
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
        if(iax0.ep()) {
            this.b = true;
            jlk jlk0 = new jlk(((long)v4) << 0x20 | 0xFFFFFFFFL & ((long)v3));
            this.a.a.b(jlk0);
            return iaw.b(iax0, v4, v3, new cbn(arrayList0));
        }
        if(!this.b) {
            jlk jlk1 = new jlk(((long)v4) << 0x20 | 0xFFFFFFFFL & ((long)v3));
            this.a.a.b(jlk1);
        }
        return iaw.b(iax0, v4, v3, new cbn(arrayList0));
    }
}

