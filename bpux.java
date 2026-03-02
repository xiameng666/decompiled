import android.accounts.Account;
import java.util.ArrayList;

public final class bpux implements glzn {
    public final bpvj a;

    public bpux(bpvj bpvj0) {
        this.a = bpvj0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        bpvj bpvj0 = this.a;
        if(!((Boolean)object0).booleanValue()) {
            return bpvj0.c.b(ggnf.a);
        }
        gged_interceptors gged0 = bpsq.g(bpvj0.d);
        ArrayList arrayList0 = new ArrayList();
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Account account0 = (Account)gged0.get(v1);
            gdta gdta0 = gdta.g(((boou)bpvj0.b).a(account0).b().a()).h(new bpuu(), gmap.a);
            bpuv bpuv0 = new bpuv();
            arrayList0.add(gdta0.e(Throwable.class, bpuv0, gmap.a));
        }
        if(gged0.isEmpty()) {
            ((ggtj)bpvj.a.h()).x("Unpublishing owner key versions.");
            return gdtd.a(arrayList0).i(new bpuw(bpvj0, gged0), bpvj0.e);
        }
        ((ggtj)bpvj.a.h()).z("Publishing owner key versions for %d accounts.", gged0.size());
        return gdtd.a(arrayList0).i(new bpuw(bpvj0, gged0), bpvj0.e);
    }
}

