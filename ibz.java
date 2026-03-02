import java.util.ArrayList;
import java.util.List;

public final class ibz extends ifv {
    public static final ibz a;

    static {
        ibz.a = new ibz();
    }

    private ibz() {
        super("Undefined intrinsics block and it is required");
    }

    @Override  // iau
    public final iav e(iax iax0, List list0, long v) {
        switch(list0.size()) {
            case 0: {
                return iaw.b(iax0, jkp.d(v), jkp.c(v), ibw.a);
            }
            case 1: {
                ibq ibq1 = ((ias)list0.get(0)).e(v);
                return iaw.b(iax0, jkq.c(v, ibq1.a), jkq.b(v, ibq1.b), new ibx(ibq1));
            }
            default: {
                ArrayList arrayList0 = new ArrayList(list0.size());
                int v2 = list0.size();
                int v3 = 0;
                int v4 = 0;
                for(int v1 = 0; v1 < v2; ++v1) {
                    ibq ibq0 = ((ias)list0.get(v1)).e(v);
                    v3 = Math.max(ibq0.a, v3);
                    v4 = Math.max(ibq0.b, v4);
                    arrayList0.add(ibq0);
                }
                return iaw.b(iax0, jkq.c(v, v3), jkq.b(v, v4), new iby(arrayList0));
            }
        }
    }
}

