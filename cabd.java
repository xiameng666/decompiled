import android.content.ComponentName;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import j..util.Objects;
import java.util.Locale;

final class cabd extends clil {
    final cabe a;

    public cabd(cabe cabe0) {
        Objects.requireNonNull(cabe0);
        this.a = cabe0;
        super("instantapps");
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        yxh yxh0;
        if(iBinder0 == null) {
            yxh0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.finsky.installapi.IPlayInstallService");
            yxh0 = (iInterface0 instanceof yxh) ? ((yxh)iInterface0) : new yxh(iBinder0);
        }
        try {
            cabe cabe0 = this.a;
            cabe0.b = yxh0;
            if(cabe0.b == null) {
                throw new RemoteException("IPlayInstallService.Stub.asInterface returned null");
            }
            Context context0 = cabe0.getContext();
            if(context0 == null) {
                throw new RemoteException("onServiceConnected without context");
            }
            ConnectivityManager connectivityManager0 = (ConnectivityManager)context0.getSystemService("connectivity");
            if(connectivityManager0 != null) {
                NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
                if(networkInfo0 != null && networkInfo0.isConnected()) {
                    Bundle bundle0 = new Bundle();
                    bundle0.putBoolean("show_completion", false);
                    gftb.check(cabe0.b);
                    Bundle bundle1 = cabe0.b.a("com.google.android.gms", "com.google.android.instantapps.supervisor", bundle0);
                    if(bundle1 == null) {
                        throw new RemoteException("Received null result from PlayInstallService");
                    }
                    int v = bundle1.getInt("status_code", -4);
                    if(v != 0) {
                        String s = String.format(Locale.US, "The failure status_code: %d", v);
                        Bundle bundle2 = bundle1.getBundle("error");
                        if(bundle2 != null) {
                            s = s + String.format(" Failure reason: %s, failure exception: %s", bundle2.getString("reason", ""), bundle2.getString("exception_type", ""));
                        }
                        throw new RemoteException(s);
                    }
                    cabe0.a = true;
                    cabe0.y("InstallSupervisorFragment.InstallRequested");
                    return;
                }
            }
            cabe0.y("InstallSupervisorFragment.Offline");
            throw new RemoteException("Will not request install without Internet connection.");
        }
        catch(RemoteException remoteException0) {
            Log.e("InstallSupervisorChimeraFragment", "Exception: ", remoteException0);
            this.a.z();
        }
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
        this.a.b = null;
    }
}

