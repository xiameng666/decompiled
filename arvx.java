import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.backup.BackupOptInSettings;
import com.google.android.gms.common.api.Status;

public final class arvx extends cjtm {
    private final azxs a;
    private final boolean b;
    private final String c;
    private final BackupOptInSettings d;

    public arvx(azxs azxs0, boolean z, String s, BackupOptInSettings backupOptInSettings0, azug azug0) {
        super(0xB6, "EnableAndroidBackup", azug0);
        this.a = azxs0;
        this.b = z;
        this.c = s;
        this.d = backupOptInSettings0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        boolean z = this.b;
        if(z && this.c == null) {
            throw new cjuh(5, "accountName cannot be null");
        }
        aqjk aqjk0 = new aqjk(context0);
        aqee aqee0 = new aqee(context0);
        if(z) {
            aqee0.c(new Account(this.c, "com.google"));
        }
        aqjk0.f(z);
        if(z) {
            BackupOptInSettings backupOptInSettings0 = this.d;
            if(backupOptInSettings0 != null) {
                aqjl aqjl0 = aqjl.a;
                if(backupOptInSettings0.a) {
                    aqjl0.d(context0, true);
                }
                if(backupOptInSettings0.b) {
                    aqjl0.h(context0, true);
                }
                if(backupOptInSettings0.c) {
                    aqjl0.b(context0, true);
                }
                if(backupOptInSettings0.d) {
                    aqjl0.c(context0, true);
                }
            }
        }
        this.a.a(Status.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0);
    }
}

