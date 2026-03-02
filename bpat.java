import android.accounts.Account;
import java.util.ArrayList;

public final class bpat implements glzn {
    public final bpav a;

    public bpat(bpav bpav0) {
        this.a = bpav0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(bouv.c(((fqzl)object0))) {
            return gmbu.i(Boolean.valueOf(true));
        }
        if(bouv.j(((fqzl)object0))) {
            bpav bpav0 = this.a;
            gged_interceptors gged0 = bpsq.g(bpav0.a);
            ArrayList arrayList0 = new ArrayList(gged0.size());
            int v1 = gged0.size();
            for(int v = 0; v < v1; ++v) {
                Account account0 = (Account)gged0.get(v);
                arrayList0.add(((boou)bpav0.b).a(account0).g().d());
            }
            return gdta.g(gdtd.f(arrayList0)).h(new bpau(), gmap.a);
        }
        return gmbu.i(Boolean.valueOf(false));
    }
}

