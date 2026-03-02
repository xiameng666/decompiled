import java.util.List;

public final class cph implements ibts {
    public final int a;
    public final cpi b;

    public cph(int v, cpi cpi0) {
        this.a = v;
        this.b = cpi0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        int v = this.a;
        ((cjg)object0).a = v;
        List list0 = this.b.b;
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            cot cot0 = (cot)list0.get(v2);
            cje cje0 = ((cjg)object0).a(cot0.b, ((int)(((float)v) * cot0.a)));
            cje0.b = cot0.c;
        }
        return ibom.a;
    }
}

