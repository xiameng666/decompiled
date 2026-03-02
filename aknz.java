import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.PackageInstaller.SessionCallback;
import android.content.pm.PackageInstaller;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.auth.managed.ui.PhoneskyDpcInstallLoader.2;
import java.util.Locale;

public final class aknz extends lvb {
    final ServiceConnection a;
    final BroadcastReceiver b;
    final PackageInstaller.SessionCallback c;
    public final String d;
    public final PackageInstaller e;
    public yxh f;
    private final bbic g;
    private Handler h;
    private int i;
    private int j;
    private boolean k;

    public aknz(Context context0, String s) {
        PackageInstaller packageInstaller0 = context0.getPackageManager().getPackageInstaller();
        bbic bbic0 = bbic.a();
        super(context0);
        this.a = new aknw(this);
        this.b = new PhoneskyDpcInstallLoader.2(this);
        this.c = new aknx(this);
        this.i = -4;
        this.j = 0;
        batl.q(s);
        this.d = s;
        batl.s(packageInstaller0);
        this.e = packageInstaller0;
        this.g = bbic0;
    }

    public final void a(Integer integer0) {
        if(((int)integer0) >= 0) {
            this.j = (int)integer0;
        }
        else {
            this.i = (int)integer0;
        }
        if(this.isStarted()) {
            this.h.post(new akny(this, integer0));
        }
    }

    @Override  // lvb
    protected final void onReset() {
        if(this.k) {
            Context context0 = this.getContext();
            this.g.b(context0, this.a);
            this.getContext().unregisterReceiver(this.b);
            this.e.unregisterSessionCallback(this.c);
            this.h = null;
            this.k = false;
        }
        this.i = -4;
        this.j = 0;
    }

    @Override  // lvb
    public final void onStartLoading() {
        if(!this.k) {
            this.h = new clht();
            bbic bbic0 = this.g;
            ServiceConnection serviceConnection0 = this.a;
            if(!bbic0.d(this.getContext(), aknv.a, serviceConnection0, 1)) {
                Log.e("Auth", String.format(Locale.US, "[AuthManaged, PhoneskyDpcInstallLoader] Failed to bind install service."));
                bbic0.b(this.getContext(), serviceConnection0);
                this.a(Integer.valueOf(-3));
                return;
            }
            this.e.registerSessionCallback(this.c);
            Context context0 = this.getContext();
            IntentFilter intentFilter0 = new IntentFilter("com.google.android.finsky.installapi.ACTION_INSTALL_STATUS");
            jwe.b(context0, this.b, intentFilter0, 2);
            this.k = true;
            this.a(Integer.valueOf(this.i));
            this.a(Integer.valueOf(this.j));
        }
    }
}

