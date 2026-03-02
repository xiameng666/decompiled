import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import j..util.Objects;
import java.util.concurrent.TimeUnit;

final class akos extends clil {
    final akot a;

    public akos(akot akot0) {
        Objects.requireNonNull(akot0);
        this.a = akot0;
        super("auth_managed");
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        yxh yxh0;
        componentName0.toShortString();
        if(iBinder0 == null) {
            yxh0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.finsky.installapi.IPlayInstallService");
            yxh0 = (iInterface0 instanceof yxh) ? ((yxh)iInterface0) : new yxh(iBinder0);
        }
        akot akot0 = this.a;
        akot0.h = yxh0;
        if(akot0.b == 0) {
            akot0.b = aknv.a(akot0.g.a());
        }
        if(!akot0.a) {
            akot0.a = true;
            gmbu.t(akot0.g.h("com.android.vending", akot0.h, akot0.d, akot0.e), new akor(this), gmap.a);
            akoq akoq0 = new akoq(this);
            long v = TimeUnit.SECONDS.toMillis(((long)bapf.a(akot0.g.a(), "auth_managed_dpmrh_phonesky_download_timeout_seconds", 120)));
            akot0.c.postDelayed(akoq0, v);
        }
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
        Log.i("Auth", "[AuthManaged, PhoneskyDpcInstallViewModel] onServiceDisconnected when updating Phonesky.");
        this.a.h = null;
    }
}

