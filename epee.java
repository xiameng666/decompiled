import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.hardware.biometrics.BiometricManager;
import android.os.Build;
import android.provider.Settings.Secure;

public final class epee extends epeg {
    private final Account a;
    private final BiometricManager b;
    private final boolean c;

    public epee(Context context0, Account account0, boolean z, boolean z1) {
        super(context0);
        this.a = account0;
        this.b = (BiometricManager)context0.getSystemService(BiometricManager.class);
        this.c = z || z1;
    }

    @Override  // epeg
    protected final void a(boolean z) {
        if(!this.c()) {
            return;
        }
        Context context0 = this.d;
        new ccmp().a((z ? bbdg.dW : bbdg.dX));
        if(this.c) {
            Settings.Secure.putInt(context0.getContentResolver(), "play_bio_auth_opt_in_displaye_in_suw", 1);
        }
        else {
            Settings.Secure.putInt(context0.getContentResolver(), "play_bio_auth_opt_in_displayed_in_non_suw", 1);
        }
        Intent intent0 = new Intent("com.android.vending.BIOAUTH_CONSENT");
        intent0.setPackage("com.android.vending");
        intent0.putExtra("BioAuthAckedReceiver.account", this.a.name);
        intent0.putExtra("BioAuthAckedReceiver.account_type", this.a.type);
        intent0.putExtra("BioAuthAckedReceiver.optIn", z);
        context0.sendBroadcast(intent0, "com.google.android.gms.permission.BIOAUTH_CONSENT");
    }

    public final boolean c() {
        hydh hydh0 = hydh.a;
        if(!hydh0.c().W()) {
            return false;
        }
        Context context0 = this.d;
        if(!bbnp.k(context0) && !bbnp.n(context0)) {
            return false;
        }
        if(this.a != null) {
            for(Object object0: hydh0.c().d().b) {
                if(!Build.MODEL.contains(((String)object0))) {
                    continue;
                }
                goto label_18;
            }
            for(Object object1: hydh0.c().c().b) {
                if(Build.MODEL.contains(((String)object1))) {
                    return false;
                }
            }
        label_18:
            if(this.b.canAuthenticate(15) == 0) {
                return this.c ? !this.d() : Settings.Secure.getInt(context0.getContentResolver(), "play_bio_auth_opt_in_displaye_in_suw", 0) != 1 && !this.d();
            }
        }
        return false;
    }

    private final boolean d() {
        return Settings.Secure.getInt(this.d.getContentResolver(), "play_bio_auth_opt_in_displayed_in_non_suw", 0) == 1;
    }
}

