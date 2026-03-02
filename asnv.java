import android.accounts.Account;
import j..util.Objects;
import java.util.function.Supplier;

public final class asnv implements Supplier {
    public final asnw a;

    public asnv(asnw asnw0) {
        this.a = asnw0;
    }

    @Override
    public final Object get() {
        asnw asnw0 = this.a;
        asxf asxf0 = asnw0.c;
        gfsx gfsx0 = asxf0.b();
        if(gfsx0.i() && !((Account)gfsx0.d()).equals(asnw0.d)) {
            asnw.a.d("Unable to create backup storage meter: the active backup account does not match the selected account in Google Settings.", new Object[0]);
            return gfqx.a;
        }
        Objects.requireNonNull(asxf0);
        gfsx gfsx1 = (gfsx)asnw.d("getStorageQuotaInfo", new asnu(asxf0));
        if(!gfsx1.i()) {
            asnw.a.d("Unable to create backup storage meter: no storage quota info is provided.", new Object[0]);
            return gfqx.a;
        }
        arzs arzs0 = (arzs)gfsx1.d();
        if(!asyc.c(arzs0)) {
            asnw.a.d("Unable to create backup storage meter: device has an unlimited storage quota.", new Object[0]);
            return gfqx.a;
        }
        String s = asyc.b(asnw0.b, arzs0);
        double f = asyc.a(arzs0);
        asnw.a.d("Device storage is %.2f%% full.", new Object[]{f});
        return gfsx.m(new ccoq(f, s, ccos.a));
    }
}

