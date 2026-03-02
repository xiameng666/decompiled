import android.os.Parcel;
import com.google.android.gms.identitycredentials.CredentialTransferCapabilities;

public final class bycp extends wby implements bycq {
    final gmcu a;
    final bboh b;

    public bycp() {
        super("com.google.android.gms.identitycredentials.provider.ICredentialTransferCapabilitiesCallbacks");
    }

    public bycp(gmcu gmcu0, bboh bboh0) {
        this.a = gmcu0;
        this.b = bboh0;
        super("com.google.android.gms.identitycredentials.provider.ICredentialTransferCapabilitiesCallbacks");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                CredentialTransferCapabilities credentialTransferCapabilities0 = (CredentialTransferCapabilities)wbz.a(parcel0, CredentialTransferCapabilities.CREATOR);
                bycp.gr(parcel0);
                ibuq.f(credentialTransferCapabilities0, "result");
                if(!this.a.q(credentialTransferCapabilities0)) {
                    ((ggtj)this.b.j()).x("Failed to set result for get credential transfer capabilities request");
                }
                break;
            }
            case 2: {
                String s = parcel0.readString();
                String s1 = parcel0.readString();
                bycp.gr(parcel0);
                ibuq.f(s, "type");
                ibuq.f(s1, "message");
                cjuh cjuh0 = new cjuh(8, s1);
                if(!this.a.r(cjuh0)) {
                    ((ggtj)this.b.j()).x("Failed to set exception for get credential transfer capabilities request");
                }
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

