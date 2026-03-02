import android.app.ComponentCaller;
import android.app.PendingIntent;
import android.content.Intent;

class bgju extends xni {
    private fqbw j;

    private final fqbw a() {
        if(this.j == null) {
            ggek ggek0 = new ggek();
            fqbs fqbs0 = new fqbs();
            ggek ggek1 = new ggek();
            fqbn.b("pwm.DataFieldNames.pendingIntentForSmsRetrievalConsentActivity", PendingIntent.class, ggek1);
            fqbs0.a = fqbn.a(ggek1);
            fqbp.b("com.google.android.gms.credential.manager.smsotpretrieval.SmsOtpRetrievalConsentDialogActivity", fqbs0, ggek0);
            fqbq fqbq0 = fqbp.a("com.google.android.gms.credential.manager.smsotpretrieval.SmsOtpRetrievalConsentDialogChimeraActivity", ggek0, fqbt.a, fqbt.a);
            this.j = fqco.a(this).a(fqbq0);
        }
        return this.j;
    }

    @Override  // com.google.android.chimera.android.Activity
    public final Intent getIntent() {
        return this.a().a(super.getIntent());
    }

    @Override  // com.google.android.chimera.android.Activity
    public final void onActivityReenter(int v, Intent intent0) {
        super.onActivityReenter(v, this.a().b(intent0));
    }

    @Override  // xoi
    protected final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, this.a().c(intent0));
    }

    @Override  // com.google.android.chimera.android.Activity
    public final void onActivityResult(int v, int v1, Intent intent0, ComponentCaller componentCaller0) {
        super.onActivityResult(v, v1, this.a().c(intent0));
    }

    @Override  // xnb
    protected final void onNewIntent(Intent intent0) {
        super.onNewIntent(this.a().a(intent0));
    }

    @Override  // com.google.android.chimera.android.Activity
    public final void onNewIntent(Intent intent0, ComponentCaller componentCaller0) {
        super.onNewIntent(this.a().a(intent0), componentCaller0);
    }
}

