import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.adid.service.AdvertisingIdNotificationChimeraService;
import com.google.android.gms.ads.identifier.internal.a;
import com.google.android.gms.ads.identifier.settings.b;
import java.util.concurrent.Semaphore;

public final class aazb extends clil {
    public final String a;
    public final Intent b;
    public final Context c;
    public final Semaphore d;
    private final b e;

    public aazb(String s, b b0, Context context0, Semaphore semaphore0) {
        super("ads");
        this.a = s;
        this.b = new Intent("com.google.android.gms.ads.identifier.BIND_LISTENER").setPackage(s);
        this.e = b0;
        this.c = context0;
        this.d = semaphore0;
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        wbx wbx0;
        if(iBinder0 == null) {
            wbx0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdListener");
            wbx0 = (iInterface0 instanceof a) ? ((a)iInterface0) : new a(iBinder0);
        }
        try {
            int v = bbsr.b(this.c).d(this.a, 0).uid;
            Bundle bundle0 = new Bundle();
            bundle0.putString("ad_id", this.e.f(v));
            bundle0.putBoolean("lat_enabled", this.e.n(v));
            Parcel parcel0 = wbx0.jo();
            wbz.f(parcel0, bundle0);
            wbx0.jq(1, parcel0);
        }
        catch(Throwable throwable0) {
            ((ggtj)AdvertisingIdNotificationChimeraService.a.j()).B("Failed to notify listener service of %s.", this.a);
            Log.w("AdvertisingIdNS", throwable0);
        }
        try {
            bbic.a().b(this.c, this);
        }
        catch(IllegalArgumentException unused_ex) {
        }
        this.d.release();
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
        this.d.release();
    }
}

