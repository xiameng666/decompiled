import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;

public final class dmaj implements dmba {
    private static final bboh a;
    private final dvjf b;
    private gged_interceptors c;

    static {
        dmaj.a = bboh.b("Pay", bbcu.cZ);
    }

    public dmaj(dvjf dvjf0) {
        this.b = dvjf0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        int v;
        gftb.b(hjwe0.b == 9, "cannot evaluate: does not have smart tap count filter");
        hjvi hjvi0 = hjwe0.b == 9 ? ((hjvi)hjwe0.c) : hjvi.a;
        try {
            if(this.c == null) {
                this.c = (gged_interceptors)this.b.a(null).first;
            }
            v = 0;
            ggqk ggqk0 = this.c.E();
            while(true) {
            label_6:
                if(!ggqk0.hasNext()) {
                    goto label_18;
                }
                Object object0 = ggqk0.next();
                if(((Valuable)object0).z()) {
                    break;
                }
            }
        }
        catch(eaqz | earn exception0) {
            a.ae(dmaj.a.h(), "Not showing because of missing storage key", exception0);
            return false;
        }
        catch(dmhl dmhl0) {
            a.ae(dmaj.a.h(), "Not showing because of database exception", dmhl0);
            return false;
        }
        ++v;
        goto label_6;
    label_18:
        ((ggtj)dmaj.a.h()).z("Found %s smart tap valuables", v);
        if((hjvi0.b & 2) != 0 && v > (hjvi0.d == null ? hftw.a : hjvi0.d).b) {
            return false;
        }
        return (hjvi0.b & 1) == 0 ? true : v >= (hjvi0.c == null ? hftw.a : hjvi0.c).b;
    }
}

