import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.backup.common.play.PlaySetupServiceV2Proxy.2;

public final class aqvy implements glzn {
    public final aqwd a;
    public final Bundle b;

    public aqvy(aqwd aqwd0, Bundle bundle0) {
        this.a = aqwd0;
        this.b = bundle0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        sow sow0 = (sow)object0;
        gmcd gmcd0 = new gmcu();
        aqwd aqwd0 = this.a;
        try {
            baun baun0 = aqwd.b;
            baun0.d("Requesting play to pause app updates", new Object[0]);
            Bundle bundle0 = sow0.a(new PlaySetupServiceV2Proxy.2(aqwd0, new clht(Looper.getMainLooper()), ((gmcu)gmcd0)), this.b);
            if(bundle0 != null) {
                Bundle bundle1 = bundle0.getBundle("error");
                if(bundle1 != null) {
                    String s = bundle1.getString("error");
                    baun0.f("Error pausing app updates=" + s, new Object[0]);
                    ((gmcu)gmcd0).r(new RemoteException(s));
                }
            }
        }
        catch(RemoteException remoteException0) {
            aqwd.b.g("RemoteException while pausing app updates", remoteException0, new Object[0]);
            ((gmcu)gmcd0).r(remoteException0);
        }
        aqwd0.d(((gmcu)gmcd0));
        return gmcd0;
    }
}

