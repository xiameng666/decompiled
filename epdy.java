import android.accounts.Account;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings.Secure;

public final class epdy extends epeg {
    public static final bboh a;
    public final epfc b;
    public final Account c;
    private final epep e;

    static {
        epdy.a = bboh.b("BackupOptIn", bbcu.dR);
    }

    public epdy(Context context0, epfc epfc0, Account account0, epep epep0) {
        super(context0);
        this.b = epfc0;
        this.c = account0;
        this.e = epep0;
    }

    @Override  // epeg
    protected final void a(boolean z) {
        if(this.c != null) {
            new ccmp().a((z ? bbdg.dI : bbdg.dJ));
            new epdx(this, z).start();
        }
    }

    @Override  // epeg
    protected final void b() {
        super.b();
        Context context0 = this.d;
        Settings.Secure.putInt(context0.getContentResolver(), "backup_encryption_opt_in_displayed", 1);
        if(this.d()) {
            Settings.Secure.putInt(context0.getContentResolver(), "backup_enabled:com.android.providers.telephony", 1);
        }
        Settings.Secure.putInt(context0.getContentResolver(), "user_full_data_backup_aware", 1);
        if(this.c()) {
            Settings.Secure.putInt(context0.getContentResolver(), "backup_enabled:com.android.calllogbackup", 1);
        }
    }

    public final boolean c() {
        return this.b != epfc.c;
    }

    public final boolean d() {
        return this.b != epfc.c;
    }

    public final boolean e() {
        return ((Boolean)this.e.g.mr()).booleanValue();
    }

    public final void f(boolean z) {
        Intent intent0 = new Intent("com.google.android.backup.BackupEnabler");
        intent0.putExtra("BACKUP_ENABLE", z);
        intent0.setPackage("com.google.android.backuptransport");
        try {
            this.d.startService(intent0);
        }
        catch(SecurityException | ActivityNotFoundException exception0) {
            ((ggtj)((ggtj)epdy.a.j()).s(exception0)).B("Could not enable backup %s", exception0);
        }
    }
}

