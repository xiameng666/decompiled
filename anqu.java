import dagger.internal.Factory;
import dagger.internal.Preconditions;
import j..util.DesugarArrays;

public final class anqu implements Factory {
    @Override  // ibnf, ibne
    public final Object get() {
        Object object0;
        hfuo hfuo0 = hqca.a.b().f().b;
        if(hfuo0.isEmpty()) {
            object0 = ggnj.a;
        }
        else {
            ggfn ggfn0 = new ggfn();
            for(Object object1: hfuo0) {
                String[] arr_s = ((String)object1).split(",");
                if(arr_s.length > 1) {
                    ggfn0.i(((ggfp)DesugarArrays.stream(arr_s).map(new anom()).map(new anon()).collect(ggaf.b)));
                }
            }
            object0 = ggfn0.h();
        }
        Preconditions.f(object0);
        return object0;
    }
}

