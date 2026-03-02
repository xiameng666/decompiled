import android.content.Intent;
import j..util.Objects;

public final class albk {
    acp a;
    acp b;
    acp c;

    public albk() {
    }

    public albk(du du0, albi albi0) {
        albj albj0 = new albj();
        Objects.requireNonNull(albi0);
        this.a = du0.registerForActivityResult(albj0, new albf(albi0));
        albj albj1 = new albj();
        Objects.requireNonNull(albi0);
        this.b = du0.registerForActivityResult(albj1, new albg(albi0));
        albj albj2 = new albj();
        Objects.requireNonNull(albi0);
        this.c = du0.registerForActivityResult(albj2, new albh(albi0));
    }

    public final void a(String s, String s1) {
        this.a.b(new Intent().setClassName("com.google.ambient.streaming", "com.google.ambient.streaming.core.CompanionDeviceSetupActivity").setAction("com.google.ambient.streaming.core.action.ACCOUNT_ASSOCIATION").putExtra("ExtraGaiaId", s).putExtra("ExtraDisplayName", s1));
    }

    public final void b(String s) {
        this.b.b(new Intent().setClassName("com.google.ambient.streaming", "com.google.ambient.streaming.core.CompanionDeviceSetupActivity").setAction("com.google.ambient.streaming.core.action.ACCOUNT_DISASSOCIATION").putExtra("ExtraGaiaId", s));
    }

    public final void c(String s) {
        this.c.b(new Intent().setClassName("com.google.ambient.streaming", "com.google.ambient.streaming.core.CompanionDeviceSetupActivity").setAction("com.google.ambient.streaming.core.action.CHECK_ACCOUNT_ASSOCIATION").putExtra("ExtraGaiaId", s));
    }
}

