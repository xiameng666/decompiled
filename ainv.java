import java.util.ArrayList;

public final class ainv implements glzn {
    public final ainy a;

    public ainv(ainy ainy0) {
        this.a = ainy0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        ainy ainy0;
        if(((gged_interceptors)object0) == null) {
            ((ggtj)ainy.a.i()).x("variable packageNames is null!");
            return gmbu.h(new aiml(8));
        }
        ((ggtj)ainy.a.h()).z("Found %s packages with Block data.", ((gged_interceptors)object0).size());
        ArrayList arrayList0 = new ArrayList();
        int v = ((gged_interceptors)object0).size();
        for(int v1 = 0; true; ++v1) {
            ainy0 = this.a;
            if(v1 >= v) {
                break;
            }
            String s = (String)((gged_interceptors)object0).get(v1);
            arrayList0.add(glzd.f(gmbt.h(ainy0.c.c(s)), new ainq(s), ainy0.h));
        }
        return gmbu.c(arrayList0).b(new ainr(ainy0, arrayList0), ainy0.h);
    }
}

