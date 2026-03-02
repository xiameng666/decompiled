import dagger.internal.Factory;
import dagger.internal.Preconditions;
import j..util.DesugarArrays;

public final class anqw implements Factory {
    @Override  // ibnf, ibne
    public final Object get() {
        Object object0;
        hfuo hfuo0 = hqca.a.b().e().b;
        if(hfuo0.isEmpty()) {
            object0 = ggbz.a;
        }
        else {
            ggfq ggfq0 = new ggfq();
            for(Object object1: hfuo0) {
                String[] arr_s = ((String)object1).split("\\|");
                if(arr_s.length == 2) {
                    ggfp ggfp0 = (ggfp)DesugarArrays.stream(arr_s[1].split(",")).map(new anom()).map(new anon()).collect(ggaf.b);
                    ggfq0.k(arr_s[0], ggfp0);
                }
            }
            object0 = ggfq0.a();
        }
        Preconditions.f(object0);
        return object0;
    }
}

