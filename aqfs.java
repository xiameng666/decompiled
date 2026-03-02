import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.backup.ApplicationBackupStats;
import com.google.android.gms.backup.BackupStatsRequestConfig;

public final class aqfs {
    public static final Intent a;
    public final Context b;

    static {
        aqfs.a = new Intent().setPackage("com.google.android.gms").setAction("com.google.android.gms.backup.BackupStatsService").addCategory("android.intent.category.DEFAULT");
    }

    public aqfs(Context context0) {
        batl.s(context0);
        this.b = context0;
    }

    public final ApplicationBackupStats[] a(BackupStatsRequestConfig backupStatsRequestConfig0) {
        aqgq aqgq0;
        azox azox0 = new azox();
        ApplicationBackupStats[] arr_applicationBackupStats = null;
        if(bbic.a().d(this.b, aqfs.a, azox0, 1)) {
            try {
                IBinder iBinder0 = azox0.a();
                if(iBinder0 == null) {
                    aqgq0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.backup.IBackupStatsService");
                    aqgq0 = (iInterface0 instanceof aqgq) ? ((aqgq)iInterface0) : new aqgo(iBinder0);
                }
                arr_applicationBackupStats = aqgq0.d(backupStatsRequestConfig0);
            }
            catch(InterruptedException | RemoteException exception0) {
                Log.w("BackupStatsClient", exception0);
            }
            finally {
                try {
                    bbic.a().b(this.b, azox0);
                }
                catch(IllegalArgumentException | IllegalStateException exception1) {
                    Log.w("BackupStatsClient", "Exception when unbinding: ", exception1);
                }
            }
            return arr_applicationBackupStats;
        }
        return null;
    }
}

