import android.os.Bundle;
import android.os.RemoteException;

public final class aqvx implements glzn {
    public final aqwd a;
    public final Bundle b;

    public aqvx(aqwd aqwd0, Bundle bundle0) {
        this.a = aqwd0;
        this.b = bundle0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        sow sow0 = (sow)object0;
        gmcd gmcd0 = new gmcu();
        try {
            baun baun0 = aqwd.b;
            baun0.d("Requesting play to resume app updates", new Object[0]);
            Bundle bundle0 = sow0.b(this.b);
            if(bundle0 == null) {
                ((gmcu)gmcd0).q(null);
            }
            else {
                Bundle bundle1 = bundle0.getBundle("error");
                if(bundle1 == null) {
                    ((gmcu)gmcd0).q(null);
                }
                else {
                    String s = bundle1.getString("error");
                    baun0.f("Error resuming app updates: %s", new Object[]{s});
                    ((gmcu)gmcd0).r(new RemoteException(s));
                }
            }
        }
        catch(RemoteException remoteException0) {
            aqwd.b.g("RemoteException when resuming app updates", remoteException0, new Object[0]);
            ((gmcu)gmcd0).r(remoteException0);
        }
        this.a.d(((gmcu)gmcd0));
        return gmcd0;
    }
}

