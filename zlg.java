import com.google.android.gms.chimera.modules.accountsettings.AppContextProvider;
import dagger.internal.InstanceFactory;
import j..util.Objects;
import java.util.concurrent.ExecutorService;

@ibnh
public final class zlg {
    public final zjw a;
    public final zkl b;
    public final ziz c;
    public final aauo d;
    private final ExecutorService e;
    private final zes f;

    public zlg(zjw zjw0, ExecutorService executorService0, zkl zkl0, ziz ziz0, aauo aauo0, zes zes0) {
        this.a = zjw0;
        this.e = executorService0;
        this.b = zkl0;
        this.c = ziz0;
        this.d = aauo0;
        this.f = zes0;
        Objects.requireNonNull(zkl0);
        evrg.a(executorService0, new zky(zkl0)).b(new zkz(this));
        Objects.requireNonNull(ziz0);
        evrg.a(executorService0, new zla(ziz0)).b(new zlb(this));
    }

    public final void a(Runnable runnable0) {
        zlf zlf0 = new zlf(runnable0);
        evrg.a(this.e, zlf0);
    }

    public final lqd b(aatb aatb0, grxw grxw0, fhrt fhrt0) {
        zjv zjv0 = zjv.a(aatb0, grxw0, fhrt0, this.d.a());
        return this.a.c(zjv0);
    }

    public final void c(aatb aatb0, grxw grxw0, fhrt fhrt0) {
        ibuq.f(aatb0, "activeUser");
        zmj zmj0 = ((zmk)((InstanceFactory)((zfh)this.f).a.a(aatb0).j).a).a;
        aauo aauo0 = (aauo)zmj0.b.get();
        zjw zjw0 = (zjw)zmj0.c.get();
        ExecutorService executorService0 = (ExecutorService)zmj0.d.get();
        zis zis0 = ((zit)zmj0.e).a();
        zjt zjt0 = ((zju)zmj0.f).a();
        zip zip0 = new zip();
        zmi zmi0 = new zmi(grxw0, fhrt0, ((aatb)((InstanceFactory)zmj0.a).a), aauo0, zjw0, executorService0, zis0, zjt0, zip0);
        if(((zhq)zmi.m(zmi0.k)).a) {
            zmi.a.j("loadScreenGraph root request ongoing already for %s", new Object[]{((int)zmi0.c.c)});
            return;
        }
        grxw grxw1 = zmi0.c;
        zmi.a.j("loadScreenGraph root for %s", new Object[]{((int)grxw1.c)});
        zmi0.j = null;
        if(aaua.c(zmi0.b) && !bbpr.c(AppContextProvider.a())) {
            zmi0.j = new iapl(iapk.f);
        }
        zmi0.h = true;
        zmi0.i();
        zmi0.e();
        if(zmi0.k(grxw1)) {
            zmi0.b();
            return;
        }
        zmh zmh0 = new zmh(zmi0);
        evql evql0 = evrg.a(zmi0.f, zmh0);
        evql0.b(new zlw(zmi0));
        evql0.A(new zlx(zmi0));
        evql0.z(new zly(zmi0));
    }
}

