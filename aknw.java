import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import j..util.Objects;
import java.util.Locale;

final class aknw extends clil {
    final aknz a;

    public aknw(aknz aknz0) {
        Objects.requireNonNull(aknz0);
        this.a = aknz0;
        super("auth_managed");
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        yxh yxh0;
        componentName0.toShortString();
        String s = null;
        if(iBinder0 == null) {
            yxh0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.finsky.installapi.IPlayInstallService");
            yxh0 = (iInterface0 instanceof yxh) ? ((yxh)iInterface0) : new yxh(iBinder0);
        }
        try {
            aknz aknz0 = this.a;
            aknz0.f = yxh0;
            int v = -3;
            Bundle bundle0 = new Bundle();
            bundle0.putInt("network_type", 1);
            bundle0.putBoolean("charging", false);
            bundle0.putBoolean("idle", false);
            String s1 = aknz0.d;
            Bundle bundle1 = aknz0.f.a("com.google.android.gms", s1, bundle0);
            int v1 = bundle1.getInt("status_code", -4);
            switch(v1) {
                case -5: {
                    if(hpwj.d()) {
                        aknz0.a(Integer.valueOf(-1));
                        return;
                    }
                    break;
                }
                case -4: {
                    Bundle bundle2 = bundle1.getBundle("error");
                    String s2 = bundle2 == null ? null : bundle2.getString("reason");
                    if(bundle2 != null) {
                        s = bundle2.getString("exception_type");
                    }
                    Log.e("Auth", String.format(Locale.US, a.ai(s, s2, s1, "[AuthManaged, PhoneskyDpcInstallLoader] starting ", " installation failed with STATUS_CODE_REQUEST_FAILED reason = ", " exceptionType = ")));
                    aknz0.a(Integer.valueOf(("transient".equals(s2) ? -2 : -3)));
                    return;
                }
                case -3: {
                    Log.e("Auth", String.format(Locale.US, a.p(-3, s1, "[AuthManaged, PhoneskyDpcInstallLoader] starting ", " installation failed with status code ")));
                    if(((long)(((Long)bbmq.c.i()))) == 0L) {
                        v = -2;
                    }
                    aknz0.a(Integer.valueOf(v));
                    return;
                }
                case -2: 
                case -1: {
                    Log.e("Auth", String.format(Locale.US, a.p(v1, s1, "[AuthManaged, PhoneskyDpcInstallLoader] starting ", " installation failed with status code ")));
                    aknz0.a(Integer.valueOf(-3));
                    return;
                }
                case 0: {
                    break;
                }
                default: {
                    Log.e("Auth", String.format(Locale.US, a.f(v1, "[AuthManaged, PhoneskyDpcInstallLoader] Unknown status code ", " returned by PlayInstallService#installPackage")));
                    aknz0.a(Integer.valueOf(-2));
                }
            }
        }
        catch(RemoteException remoteException0) {
            Log.e("Auth", String.format(Locale.US, "[AuthManaged, PhoneskyDpcInstallLoader] DPC installation failed - couldn\'t connect to the install service"), remoteException0);
            this.a.a(Integer.valueOf(-2));
        }
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
        componentName0.toShortString();
        this.a.f = null;
    }
}

