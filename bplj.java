import android.accounts.Account;

public final class bplj implements glzn {
    public final bplr a;

    public bplj(bplr bplr0) {
        this.a = bplr0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(hsxy.e() && ((fqxd)object0).a == 1 && ((fqxd)object0).b != 1) {
            bplr bplr0 = this.a;
            gdta gdta0 = gdta.g(gmbx.a);
            gged_interceptors gged0 = bpsq.g(bplr0.c);
            int v = gged0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                Account account0 = (Account)gged0.get(v1);
                gdta gdta1 = gdta0.i(new bpln(bplr0.h.a(account0)), bplr0.i);
                bplo bplo0 = new bplo();
                gdta0 = gdta1.e(Throwable.class, bplo0, gmap.a);
            }
            return gdta.g(gdta0).h(new bplp(((fqxd)object0)), gmap.a);
        }
        return gmbu.i(Boolean.valueOf(((fqxd)object0).b()));
    }
}

