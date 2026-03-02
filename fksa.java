import android.content.Context;
import android.provider.Settings.Secure;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

public final class fksa implements Factory {
    private final Provider a;
    private final Provider b;
    private final Provider c;

    public fksa(Provider provider0, Provider provider1, Provider provider2) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        bblp bblp0 = new bblp(0x7FFFFFFF, 10);
        gpgz gpgz0 = cmma.i(0x4901, cmmk.a);
        Context context0 = (Context)((InstanceFactory)this.a).a;
        String s = (String)this.b.get();
        hhps hhps0 = (hhps)this.c.get();
        gftb.check(context0);
        gftb.check(hhps0.c);
        gftb.check(s);
        hhbm hhbm0 = hhbn.a(gpgz0.a(hhbv.c));
        fkqk fkqk0 = new fkqk(context0, fkqm.a);
        fiyn fiyn0 = new fiyn(new fgvy(), Settings.Secure.getString(context0.getContentResolver(), "android_id"), glwy.h(1000L), 2);
        fknl fknl0 = new fknl(context0, hhps0.c, fiyn0, fkqk0);
        gpjh gpjh0 = gpjh.b(s);
        hhbm hhbm1 = (hhbm)hhbm0.q(gpji.g, gpjh0);
        return new fknn(bblp0, hhps0.c, hhbm1, ((gful_cronetEngineProvider)fknl0), fkmp.a);
    }
}

