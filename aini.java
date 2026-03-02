import java.util.ArrayList;

public final class aini implements glzn {
    public final aink a;

    public aini(aink aink0) {
        this.a = aink0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        aink aink0;
        if(((gged_interceptors)object0) == null) {
            ((ggtj)aink.a.i()).x("variable packageNames is null!");
            return gmbu.h(new aiml(8));
        }
        ((ggtj)aink.a.h()).z("Found %d packages with Block data.", ((gged_interceptors)object0).size());
        ArrayList arrayList0 = new ArrayList();
        int v = ((gged_interceptors)object0).size();
        for(int v1 = 0; true; ++v1) {
            aink0 = this.a;
            if(v1 >= v) {
                break;
            }
            String s = (String)((gged_interceptors)object0).get(v1);
            arrayList0.add(glzd.f(gmbt.h(aink0.f.c(s)), new aimm(s), aink0.k));
        }
        return gmbu.c(arrayList0).b(new aimx(aink0, arrayList0), aink0.k);
    }
}

