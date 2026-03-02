import java.util.List;

public final class siw implements ibts {
    public final List a;
    public final iax b;
    public final float c;
    public final int d;
    public final List e;

    public siw(List list0, iax iax0, float f, int v, List list1) {
        this.a = list0;
        this.b = iax0;
        this.c = f;
        this.d = v;
        this.e = list1;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        iax iax0;
        ibuq.f(((ibp)object0), "$this$layout");
        List list0 = this.a;
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            List list1 = (List)list0.get(v1);
            int v2 = list1.size();
            int[] arr_v = new int[v2];
            for(int v3 = 0; true; ++v3) {
                iax0 = this.b;
                if(v3 >= v2) {
                    break;
                }
                arr_v[v3] = ((ibq)list1.get(v3)).a + ((iax0.p() != jlm.a || v3 >= ibpo.d(list1)) && (iax0.p() != jlm.b || v3 <= 0) ? 0 : jkr.f(((ibp)object0), this.c));
            }
            dhf dhf0 = dho.b;
            int[] arr_v1 = new int[v2];
            for(int v4 = 0; v4 < v2; ++v4) {
                arr_v1[v4] = 0;
            }
            jlm jlm0 = iax0.p();
            dhf0.b(((ibp)object0), this.d, arr_v, jlm0, arr_v1);
            int v5 = list1.size();
            for(int v6 = 0; v6 < v5; ++v6) {
                ibp.y(((ibp)object0), ((ibq)list1.get(v6)), arr_v1[v6], ((Number)this.e.get(v1)).intValue());
            }
        }
        return ibom.a;
    }
}

