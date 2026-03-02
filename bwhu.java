import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.provider.Settings.Global;
import com.google.android.chimera.Service;

public abstract class bwhu extends Service implements bwhp {
    public static final bboh a;
    public bwhq b;
    private boolean c;

    static {
        bwhu.a = bboh.b("HomeStubDevProvMonSvc", bbcu.fA);
    }

    @Override  // bwhp
    public final void a() {
        this.b();
        ((ggtj)bwhu.a.h()).x("Device provisioning notification delivered - stopping monitoring service");
        this.stopSelf();
    }

    public abstract void b();

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        return null;
    }

    @Override  // com.google.android.chimera.Service
    public void onCreate() {
        ((ggtj)bwhu.a.h()).x("Device provision monitoring service created");
        Context context0 = this.getBaseContext();
        ibuq.e(context0, "getBaseContext(...)");
        ibuq.f(context0, "context");
        this.b = new bwht(context0);
    }

    @Override  // com.google.android.chimera.Service
    public final void onDestroy() {
        ((ggtj)bwhu.a.h()).x("Device provision monitor stopping");
        bwhq bwhq0 = this.b;
        if(bwhq0 == null) {
            ibuq.j("provisionMonitor");
            bwhq0 = null;
        }
        bwhq0.a();
        this.c = false;
    }

    @Override  // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent0, int v, int v1) {
        if(this.c) {
            ((ggtj)bwhu.a.h()).x("Device provision monitoring service running");
            return 2;
        }
        this.c = true;
        ((ggtj)bwhu.a.h()).x("Device provision monitoring service started");
        bwhq bwhq0 = this.b;
        if(bwhq0 == null) {
            ibuq.j("provisionMonitor");
            bwhq0 = null;
        }
        synchronized(bwhq0) {
            ((bwht)bwhq0).c = this;
            if(((bwht)bwhq0).d) {
                ((ggtj)bwht.a.j()).x("Device provision monitoring already started - listener updated.");
                return 2;
            }
            ((ggtj)bwht.a.h()).x("Registering device provision listener");
            Context context0 = ((bwht)bwhq0).b;
            ContentResolver contentResolver0 = context0.getContentResolver();
            Uri uri0 = Settings.Global.getUriFor("device_provisioned");
            bwhs bwhs0 = ((bwht)bwhq0).e;
            contentResolver0.registerContentObserver(uri0, false, bwhs0);
            if(bwhr.a(context0)) {
                context0.getContentResolver().unregisterContentObserver(bwhs0);
                this.a();
                return 2;
            }
            ((bwht)bwhq0).d = true;
        }
        return 2;
    }
}

