import com.google.android.gms.trustagent.activeunlock.primary.ui.setup.SetupCompleteFragment;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import j..util.Optional;

final class eyla implements AndroidInjector {
    private final eylm a;

    public eyla(eylm eylm0) {
        this.a = eylm0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        SetupCompleteFragment setupCompleteFragment0 = (SetupCompleteFragment)object0;
        setupCompleteFragment0.a = (eyet)this.a.aN.get();
        setupCompleteFragment0.b = new eynd();
        exzl exzl0 = extu.b(((exjk)this.a.r.get()));
        exrc exrc0 = (exrc)((InstanceFactory)this.a.P).a;
        exsp exsp0 = new exsp(exrc0);
        exsm exsm0 = new exsm(exrc0);
        glxz.a();
        expk expk0 = new expk(exeg.a());
        bboh bboh0 = exeg.a();
        icck icck0 = eylm.d();
        glxz.a();
        new exwm(new exsf(exrc0), new eyel(this.a.b(), exei.a()), ((exki)this.a.ah.get()), exeg.a(), eylm.d());
        exwr exwr0 = new exwr(new eydr(exeg.a(), fcfo.e(exqc.a())), exeg.a());
        eyge eyge0 = new eyge(this.a.b());
        eyex eyex0 = new eyex(this.a.b(), exei.a());
        Optional optional0 = Optional.of(DoubleCheck.a(this.a.x));
        eyec eyec0 = new eyec();
        setupCompleteFragment0.c = new exyg(exzl0, exsp0, exsm0, ((exzd)((InstanceFactory)this.a.aa).a), expk0, bboh0, icck0, exwr0, eyge0, eyex0, optional0, eyec0);
        setupCompleteFragment0.ah = this.a.c();
        setupCompleteFragment0.ai = exeg.a();
    }
}

