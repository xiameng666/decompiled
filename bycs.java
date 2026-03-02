import android.os.Parcel;
import com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupResponse;

public final class bycs extends wby implements byct {
    final gmcu a;
    final bboh b;

    public bycs() {
        super("com.google.android.gms.identitycredentials.provider.IExportCredentialsCallbacks");
    }

    public bycs(gmcu gmcu0, bboh bboh0) {
        this.a = gmcu0;
        this.b = bboh0;
        super("com.google.android.gms.identitycredentials.provider.IExportCredentialsCallbacks");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                ExportCredentialsToDeviceSetupResponse exportCredentialsToDeviceSetupResponse0 = (ExportCredentialsToDeviceSetupResponse)wbz.a(parcel0, ExportCredentialsToDeviceSetupResponse.CREATOR);
                bycs.gr(parcel0);
                ibuq.f(exportCredentialsToDeviceSetupResponse0, "result");
                if(!this.a.q(exportCredentialsToDeviceSetupResponse0)) {
                    ((ggtj)this.b.j()).x("Failed to set result for export credentials request");
                }
                break;
            }
            case 2: {
                String s = parcel0.readString();
                String s1 = parcel0.readString();
                bycs.gr(parcel0);
                ibuq.f(s, "type");
                ibuq.f(s1, "message");
                cjuh cjuh0 = new cjuh(8, s1);
                this.a.r(cjuh0);
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

