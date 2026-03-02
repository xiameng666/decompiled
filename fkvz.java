import android.accounts.Account;
import java.util.List;

public final class fkvz implements glzn {
    public final fkwe a;
    public final List b;

    public fkvz(fkwe fkwe0, List list0) {
        this.a = fkwe0;
        this.b = list0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        ggdy ggdy0 = new ggdy();
        int v = ((gged_interceptors)object0).size();
        int v1 = 0;
        while(v1 < v) {
            fiyh fiyh0 = (fiyh)((gged_interceptors)object0).get(v1);
            if(fkwe.c(fiyh0)) {
                for(Object object1: this.b) {
                    if(!fkwe.b(fiyh0, ((Account)object1))) {
                        continue;
                    }
                    goto label_13;
                }
                fjgk fjgk0 = fkwe.a(fiyh0);
                ggdy0.i(this.a.a.k(fjgk0));
            }
        label_13:
            ++v1;
        }
        return gdtf.k(gmbu.o(ggdy0.h()), new fkwd(), gmap.a);
    }
}

