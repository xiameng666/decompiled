import android.content.Context;
import android.net.ConnectivityManager;
import android.os.ext.SdkExtensions;
import com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper;

public final class czsh {
    public final ConnectivityManager a;
    public NetworkCallbackWrapper b;
    public NetworkCallbackWrapper c;
    public int d;
    public int e;

    public czsh(Context context0) {
        this.b = null;
        this.c = null;
        this.d = 0;
        this.e = 0;
        this.a = (ConnectivityManager)context0.getSystemService(ConnectivityManager.class);
    }

    public final void a() {
        czkq.a.d().p("[BleL2capOverIpv6] stopBleClientOverIpv6.", new Object[0]);
        this.c();
        czkq.a.b().p("[BleL2capOverIpv6] successfully stopBleClientOverIpv6.", new Object[0]);
    }

    public final void b() {
        czkq.a.d().p("[BleL2capOverIpv6] stopBleServerOverIpv6.", new Object[0]);
        this.d();
        czkq.a.b().p("[BleL2capOverIpv6] successfully stopBleServerOverIpv6.", new Object[0]);
    }

    public final void c() {
        ConnectivityManager connectivityManager0 = this.a;
        if(connectivityManager0 != null) {
            NetworkCallbackWrapper networkCallbackWrapper0 = this.c;
            if(networkCallbackWrapper0 != null) {
                connectivityManager0.unregisterNetworkCallback(networkCallbackWrapper0);
                this.c = null;
            }
        }
        this.e = 0;
    }

    public final void d() {
        ConnectivityManager connectivityManager0 = this.a;
        if(connectivityManager0 != null) {
            NetworkCallbackWrapper networkCallbackWrapper0 = this.b;
            if(networkCallbackWrapper0 != null) {
                connectivityManager0.unregisterNetworkCallback(networkCallbackWrapper0);
                this.b = null;
            }
        }
        this.d = 0;
    }

    public static boolean e() {
        if(SdkExtensions.getExtensionVersion(0x1F) < 17) {
            if(hvol.a.r().ab()) {
                czkq.a.e().h("BleL2capOverIpv6 is not supported due to mainline version  SdkExtensions.getExtensionVersion(Build.VERSION_CODES.S) = %s < 17", Integer.valueOf(SdkExtensions.getExtensionVersion(0x1F)));
                return false;
            }
            czkq.a.e().h("BleL2capOverIpv6 might be unsupported due to mainline version  SdkExtensions.getExtensionVersion(Build.VERSION_CODES.S) = %s < 17", Integer.valueOf(SdkExtensions.getExtensionVersion(0x1F)));
        }
        return true;
    }
}

