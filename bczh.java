import com.google.android.gms.credential.manager.accountparticle.AccountParticleFragment;

public final class bczh implements Runnable {
    public final AccountParticleFragment a;
    public final gged_interceptors b;

    public bczh(AccountParticleFragment accountParticleFragment0, gged_interceptors gged0) {
        this.a = accountParticleFragment0;
        this.b = gged0;
    }

    @Override
    public final void run() {
        AccountParticleFragment accountParticleFragment0 = this.a;
        fnle fnle0 = accountParticleFragment0.d;
        Object object0 = null;
        if(fnle0 == null) {
            ibuq.j("accountMenuManager");
            fnle0 = null;
        }
        String s = accountParticleFragment0.y().a;
        ggqk ggqk0 = this.b.E();
        while(ggqk0.hasNext()) {
            Object object1 = ggqk0.next();
            if(ibuq.m(((fntm)object1).c, s)) {
                object0 = object1;
                break;
            }
        }
        fnle0.b.i(((fntm)object0));
    }
}

