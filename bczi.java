import com.google.android.gms.credential.manager.accountparticle.AccountParticleFragment;

public final class bczi implements Runnable {
    public final fntm a;
    public final AccountParticleFragment b;

    public bczi(fntm fntm0, AccountParticleFragment accountParticleFragment0) {
        this.a = fntm0;
        this.b = accountParticleFragment0;
    }

    @Override
    public final void run() {
        fntm fntm0 = this.a;
        if(fntm0 != null) {
            bejq bejq0 = this.b.y();
            ibuq.e(fntm0.c, "accountName(...)");
            bejq0.a(fntm0.c);
        }
    }
}

