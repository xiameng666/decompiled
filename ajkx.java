import com.google.android.gms.auth.cryptauth.ExportedSymmetricKey;
import javax.crypto.spec.SecretKeySpec;

public final class ajkx implements evpz {
    public final gmcu a;

    public ajkx(gmcu gmcu0) {
        this.a = gmcu0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        gmcu gmcu0 = this.a;
        if(!evql0.n()) {
            gmcu0.r(new ajku("Failed to derive symmetric key."));
            return;
        }
        ExportedSymmetricKey exportedSymmetricKey0 = (ExportedSymmetricKey)evql0.j();
        if(exportedSymmetricKey0 == null) {
            gmcu0.r(new ajku("Symmetric key is null."));
            return;
        }
        gmcu0.q(new SecretKeySpec(exportedSymmetricKey0.b, "AES"));
    }
}

