import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.internal.HasConsentedToContactsUploadParams;

public final class dchb implements Runnable {
    public final dchp a;
    public final HasConsentedToContactsUploadParams b;

    public dchb(dchp dchp0, HasConsentedToContactsUploadParams hasConsentedToContactsUploadParams0) {
        this.a = dchp0;
        this.b = hasConsentedToContactsUploadParams0;
    }

    @Override
    public final void run() {
        try {
            this.b.a.b(djat.b(this.a.e.N));
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).p("Failed to invoke hasConsentedToContactsUpload callback.", new Object[0]);
        }
    }
}

