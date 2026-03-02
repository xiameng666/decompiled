import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

public final class aqva {
    private static final baun a;
    private static final Intent b;
    private final Context c;
    private final aqvf d;

    static {
        aqva.a = aqql.a("PhotosAidlConnectionManager");
        aqva.b = new Intent().setPackage("com.google.android.apps.photos").setAction("com.google.android.apps.photos.backup.apiservice.PHOTOS_BACKUP_SERVICE");
    }

    public aqva(Context context0, aqvf aqvf0) {
        this.c = context0;
        this.d = aqvf0;
    }

    public final Object a(aquz aquz0, int v, aqvd aqvd0) {
        fptf fptf0;
        aqvf aqvf0 = this.d;
        Long long0 = aqvf0.a();
        azox azox0 = new azox();
        bbic bbic0 = bbic.a();
        Context context0 = this.c;
        Object object0 = null;
        if(!bbic0.d(context0, aqva.b, azox0, (Build.VERSION.SDK_INT < 34 ? 1 : 0x201))) {
            aqvf0.e(v, aqvd0, aqvf.c(context0), long0);
            return null;
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
            Object object1 = aquz0.a(fptf0);
            aqvf0.g(v, aqvd0, object1, long0);
            object0 = object1;
        }
        catch(InterruptedException | RemoteException exception0) {
            aqva.a.l(exception0);
            this.d.f(v, aqvd0, aqvf.d(false, exception0), long0);
        }
        finally {
            try {
                bbic.a().b(this.c, azox0);
            }
            catch(IllegalArgumentException | IllegalStateException exception1) {
                aqva.a.n("Exception when unbinding: ", exception1, new Object[0]);
            }
        }
        return object0;
    }

    public final boolean b(aquz aquz0, int v, aqvd aqvd0) {
        Boolean boolean0 = (Boolean)this.a(aquz0, v, aqvd0);
        return boolean0 != null && boolean0.booleanValue();
    }
}

