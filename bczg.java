import com.google.android.gms.credential.manager.accountparticle.AccountParticleFragment;

public final class bczg implements ibts {
    public final AccountParticleFragment a;

    public bczg(AccountParticleFragment accountParticleFragment0) {
        this.a = accountParticleFragment0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((String)object0), "newAccountName");
        bgnm bgnm0 = this.a.a;
        if(bgnm0 == null) {
            ibuq.j("accountSwitcher");
            bgnm0 = null;
        }
        bgnm0.a(((String)object0));
        return ibom.a;
    }
}

