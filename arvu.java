import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;

public final class arvu extends cjtm {
    private static final bboh a;
    private final Context b;
    private final String c;
    private final arvs d;
    private final aqjk e;
    private final aqef f;
    private final aqic g;

    static {
        arvu.a = bboh.b("GetGoogleBackupAccountOperation", bbcu.cJ);
    }

    public arvu(Context context0, String s, aqic aqic0, arvs arvs0, aqjk aqjk0, aqef aqef0) {
        ibuq.f(context0, "context");
        ibuq.f(s, "callingPackage");
        ibuq.f(aqic0, "callback");
        ibuq.f(arvs0, "backupStateLogger");
        ibuq.f(aqjk0, "backupManagerWrapper");
        ibuq.f(aqef0, "backupAccountManagerSupplier");
        super(439, "getGoogleBackupAccount");
        this.b = context0;
        this.c = s;
        this.g = aqic0;
        this.d = arvs0;
        this.e = aqjk0;
        this.f = aqef0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ibuq.f(context0, "context");
        int v = bbmq.c(this.b, this.c);
        if(cjmf.c(this.b, "android.permission.GET_ACCOUNTS", -1, v, this.c, null) == 0) {
            if(!this.e.i()) {
                ((ggtj)arvu.a.h()).x("Backup is not enabled");
                this.d.a(gian.e);
                this.g.a(arvw.c, null);
                return;
            }
            Account account0 = this.f.a();
            if(account0 == null) {
                ((ggtj)arvu.a.j()).x("Backup account is null");
                this.d.a(gian.c);
                this.g.a(arvw.d, null);
                return;
            }
            ((ggtj)arvu.a.h()).x("Backup account exists");
            this.d.a(gian.b);
            this.g.a(arvw.a, account0.name);
            return;
        }
        this.d.a(gian.f);
        throw new SecurityException("android.permission.GET_ACCOUNTS is required");
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ibuq.f(status0, "status");
        this.d.a(gian.c);
        this.g.a(status0, null);
    }
}

