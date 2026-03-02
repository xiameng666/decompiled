import android.net.Uri.Builder;
import android.net.Uri;
import com.google.android.gms.trustagent.activeunlock.common.data.communication.ConnectionInfo;
import com.google.android.gms.trustagent.activeunlock.common.data.communication.WearConnectionInfo;

public final class eyea implements eydt {
    public final bboh a;
    private final fcer b;

    public eyea(bboh bboh0, fcer fcer0) {
        this.a = bboh0;
        this.b = fcer0;
    }

    @Override  // eydt
    public final Object a(ConnectionInfo connectionInfo0, ibrl ibrl0) {
        WearConnectionInfo wearConnectionInfo0 = connectionInfo0.a;
        if(wearConnectionInfo0 == null) {
            ((ggtj)this.a.j()).x("No WearConnectionInfo passed when trying to get AD info");
            return null;
        }
        icbr icbr0 = new icbr();
        Uri uri0 = new Uri.Builder().scheme("wear").authority(wearConnectionInfo0.a).path("/activeunlock/sync/state/ad").build();
        evql evql0 = this.b.f(uri0);
        evql0.b(new eydy(new eydx(this, wearConnectionInfo0, icbr0)));
        evql0.A(new eydz(this, icbr0));
        return icbr0.F(ibrl0);
    }
}

