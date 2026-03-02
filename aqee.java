import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

public final class aqee implements aqef {
    public static final int a;
    private static final Intent b;
    private final Context c;

    static {
        aqee.b = new Intent().setPackage("com.google.android.gms").setAction("com.google.android.gms.backup.BackupAccountManagerService").addCategory("android.intent.category.DEFAULT");
    }

    public aqee(Context context0) {
        batl.s(context0);
        this.c = context0;
    }

    @Override  // aqef
    public final Account a() {
        return (Account)this.b(new aqeb());
    }

    protected final Object b(aqed aqed0) {
        aqgn aqgn0;
        azox azox0 = new azox();
        Object object0 = null;
        if(bbic.a().d(this.c, aqee.b, azox0, 1)) {
            try {
                IBinder iBinder0 = azox0.a();
                if(iBinder0 == null) {
                    aqgn0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.backup.IBackupAccountManagerService");
                    aqgn0 = (iInterface0 instanceof aqgn) ? ((aqgn)iInterface0) : new aqgl(iBinder0);
                }
                object0 = aqed0.a(aqgn0);
            }
            catch(InterruptedException | RemoteException exception0) {
                Log.w("BackupAccountMgrClient", exception0);
            }
            finally {
                try {
                    bbic.a().b(this.c, azox0);
                }
                catch(IllegalArgumentException | IllegalStateException exception1) {
                    Log.w("BackupAccountMgrClient", "Exception when unbinding: ", exception1);
                }
            }
            return object0;
        }
        return null;
    }

    public final void c(Account account0) {
        this.b(new aqec(account0));
    }

    public final boolean d() {
        Boolean boolean0 = (Boolean)this.b(new aqea());
        return boolean0 == null || boolean0.booleanValue();
    }
}

