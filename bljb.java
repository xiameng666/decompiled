import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.credentialstore.KeyData;
import j..util.Objects;

final class bljb implements evpz {
    final bljg a;

    public bljb(bljg bljg0) {
        Objects.requireNonNull(bljg0);
        this.a = bljg0;
        super();
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        try {
            if(evql0.n()) {
                KeyData keyData0 = (KeyData)evql0.j();
                ApiMetadata apiMetadata0 = cckf.d(bbdp.bv);
                this.a.b.a(Status.b, keyData0, apiMetadata0);
                return;
            }
            this.a.b.a(Status.d, null, ApiMetadata.b);
        }
        catch(RemoteException unused_ex) {
        }
    }
}

