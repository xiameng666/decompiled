import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.text.TextUtils;
import android.util.Log;
import j..util.Objects;
import java.util.concurrent.TimeUnit;

final class akoo extends clil {
    final akop a;

    public akoo(akop akop0) {
        Objects.requireNonNull(akop0);
        this.a = akop0;
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
        akop akop0 = this.a;
        akop0.i = yxh0;
        if(TextUtils.isEmpty(akop0.a)) {
            Log.e("Auth", "[AuthManaged, PhoneskyDpcInstallViewModel] package name is not set.");
            akou.f(akop0.e, Integer.valueOf(-2), akop0.b);
            return;
        }
        if(!akop0.c) {
            akop0.c = true;
            gmbu.t(akop0.h.h(akop0.a, akop0.i, akop0.e, akop0.b), new akon(this), gmap.a);
            akom akom0 = new akom(this);
            long v = TimeUnit.SECONDS.toMillis(((long)bapf.a(akop0.h.a(), "auth_managed_dpmrh_package_download_timeout_seconds", 60)));
            akop0.d.postDelayed(akom0, v);
        }
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
        componentName0.toShortString();
        this.a.i = null;
    }
}

