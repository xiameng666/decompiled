import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.AppInstallMetadata;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.OnInstallUpdateParams;
import j..util.Objects;

final class dchj implements dbzg {
    final ddok a;

    public dchj(dchp dchp0, ddok ddok0) {
        this.a = ddok0;
        Objects.requireNonNull(dchp0);
        super();
    }

    @Override  // dbzg
    public final void a(ShareTarget shareTarget0, AppInstallMetadata appInstallMetadata0) {
        try {
            OnInstallUpdateParams onInstallUpdateParams0 = new OnInstallUpdateParams();
            onInstallUpdateParams0.a = shareTarget0;
            onInstallUpdateParams0.b = appInstallMetadata0;
            this.a.a(onInstallUpdateParams0);
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).p("Failed to invoke onInstallUpdate on registered install update callback.", new Object[0]);
        }
    }
}

