import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;

public final class dmbu implements dmba {
    private final Context a;

    public dmbu(Context context0) {
        ibuq.f(context0, "context");
        super();
        this.a = context0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        ibuq.f(hjrn0, "bulletin");
        ibuq.f(hjwe0, "filter");
        hwrc.d();
        if(!hwrc.c()) {
            return false;
        }
        boolean z = this.b("com.google.android.apps.walletnfcrel") || this.b("com.google.commerce.tapandpay.dev");
        return (hjwe0.b == 0x40 ? ((hjvf)hjwe0.c) : hjvf.a).b == z;
    }

    private final boolean b(String s) {
        try {
            this.a.getPackageManager().getServiceInfo(new ComponentName(s, "com.google.android.apps.wallet.quicksettings.WalletTileService"), 0);
            return true;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return false;
        }
    }
}

