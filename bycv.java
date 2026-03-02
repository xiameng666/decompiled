import android.os.Parcel;
import com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupResponse;

public final class bycv extends wby implements bycw {
    final gmcu a;
    final bboh b;

    public bycv() {
        super("com.google.android.gms.identitycredentials.provider.IImportCredentialsCallbacks");
    }

    public bycv(gmcu gmcu0, bboh bboh0) {
        this.a = gmcu0;
        this.b = bboh0;
        super("com.google.android.gms.identitycredentials.provider.IImportCredentialsCallbacks");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                ImportCredentialsForDeviceSetupResponse importCredentialsForDeviceSetupResponse0 = (ImportCredentialsForDeviceSetupResponse)wbz.a(parcel0, ImportCredentialsForDeviceSetupResponse.CREATOR);
                bycv.gr(parcel0);
                ibuq.f(importCredentialsForDeviceSetupResponse0, "result");
                if(!this.a.q(importCredentialsForDeviceSetupResponse0)) {
                    ((ggtj)this.b.j()).x("Failed to set result for import credentials request");
                }
                break;
            }
            case 2: {
                String s = parcel0.readString();
                String s1 = parcel0.readString();
                bycv.gr(parcel0);
                ibuq.f(s, "type");
                ibuq.f(s1, "message");
                cjuh cjuh0 = new cjuh(8, s1);
                if(!this.a.r(cjuh0)) {
                    ((ggtj)this.b.j()).x("Failed to set exception for import credentials request");
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

