import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.libraries.photos.backup.api.AutoBackupState;

public final class aqvh implements aqvg {
    private static final baun a;
    private static final Intent b;
    private final Context c;
    private final aqvf d;

    static {
        aqvh.a = aqql.a("PhotosAidlBackupStatusChecker");
        aqvh.b = new Intent().setPackage("com.google.android.apps.photos").setAction("com.google.android.apps.photos.backup.apiservice.PHOTOS_BACKUP_SERVICE");
    }

    public aqvh(Context context0) {
        aqvf aqvf0 = aqvf.b(context0, 2);
        super();
        this.c = context0;
        this.d = aqvf0;
    }

    @Override  // aqvg
    public final aqvk a(aqvd aqvd0) {
        aqvk aqvk0;
        fptf fptf0;
        Long long0;
        aqvf aqvf0;
        try {
            aqvf0 = this.d;
            long0 = aqvf0.a();
            Context context0 = this.c;
            if(!context0.getPackageManager().getApplicationInfo("com.google.android.apps.photos", 0).enabled) {
                this.d.e(15, aqvd0, 4, long0);
                return new aqvk(aqvj.b, null, null);
            }
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            this.d.e(15, aqvd0, 5, long0);
            return new aqvk(aqvj.b, null, packageManager$NameNotFoundException0);
        }
        catch(NullPointerException nullPointerException0) {
            this.d.e(15, aqvd0, 6, long0);
            return new aqvk(aqvj.c, null, nullPointerException0);
        }
        azox azox0 = new azox();
        if(!bbic.a().d(context0, aqvh.b, azox0, 1)) {
            aqvf0.e(15, aqvd0, 3, long0);
            return new aqvk(aqvj.c, null, null);
        }
        try {
            IBinder iBinder0 = azox0.a();
            if(iBinder0 == null) {
                fptf0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.libraries.photos.backup.api.IPhotosBackup");
                fptf0 = (iInterface0 instanceof fptf) ? ((fptf)iInterface0) : new fptf(iBinder0);
            }
            AutoBackupState autoBackupState0 = fptf0.a();
            aqvf0.g(15, aqvd0, autoBackupState0, long0);
            aqvk0 = autoBackupState0 == null ? new aqvk(aqvj.b, null, null) : new aqvk(aqvj.a, autoBackupState0.a, null);
        }
        catch(InterruptedException | RemoteException exception1) {
            aqvh.a.l(exception1);
            this.d.f(15, aqvd0, aqvf.d(true, exception1), long0);
            aqvk0 = new aqvk(aqvj.c, null, exception1);
        }
        catch(IllegalArgumentException | SecurityException exception0) {
            if(!hqhh.a.b().a()) {
                throw exception0;
            }
            aqvh.a.l(exception0);
            this.d.f(15, aqvd0, aqvf.d(true, exception0), long0);
            aqvk0 = new aqvk(aqvj.c, null, exception0);
        }
        finally {
            try {
                bbic.a().b(this.c, azox0);
            }
            catch(IllegalArgumentException | IllegalStateException exception2) {
                aqvh.a.n("Exception when unbinding: ", exception2, new Object[0]);
            }
        }
        return aqvk0;
    }

    @Override  // aqvg
    public final aqvk b() {
        throw new IllegalStateException("getBackupStateUnsafe is not supported with this class");
    }
}

