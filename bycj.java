import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.identitycredentials.CreateCredentialResponse;

public final class bycj extends wby implements byck {
    final gmcu a;
    final bboh b;

    public bycj() {
        super("com.google.android.gms.identitycredentials.provider.ICreateCredentialCallbacks");
    }

    public bycj(gmcu gmcu0, bboh bboh0) {
        this.a = gmcu0;
        this.b = bboh0;
        super("com.google.android.gms.identitycredentials.provider.ICreateCredentialCallbacks");
    }

    @Override  // byck
    public final void a(String s, String s1) {
        ibuq.f(s, "errorType");
        ibuq.f(s1, "message");
        bxuf bxuf0 = new bxuf(s, s1);
        if(!this.a.r(bxuf0)) {
            ((ggtj)this.b.j()).x("Failed to set exception for create credential request");
        }
    }

    @Override  // byck
    public final void b(CreateCredentialResponse createCredentialResponse0, PendingIntent pendingIntent0) {
        if(createCredentialResponse0 != null && pendingIntent0 != null) {
            bydi bydi0 = new bydi(createCredentialResponse0, pendingIntent0);
            if(!this.a.q(bydi0)) {
                ((ggtj)this.b.j()).x("Failed to set exception for create credential request");
            }
        }
        else {
            bxuf bxuf0 = new bxuf("android.credentials.CreateCredentialException.TYPE_UNKNOWN", "CreateCredentialResponse is null");
            if(!this.a.r(bxuf0)) {
                ((ggtj)this.b.j()).x("Failed to set exception for create credential request");
            }
        }
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                CreateCredentialResponse createCredentialResponse0 = (CreateCredentialResponse)wbz.a(parcel0, CreateCredentialResponse.CREATOR);
                bycj.gr(parcel0);
                bxuf bxuf0 = new bxuf("android.credentials.CreateCredentialException.TYPE_UNKNOWN", "onSuccess is not supported for v1");
                if(!this.a.r(bxuf0)) {
                    ((ggtj)this.b.j()).x("Failed to set exception for create credential request");
                }
                break;
            }
            case 2: {
                String s = parcel0.readString();
                String s1 = parcel0.readString();
                bycj.gr(parcel0);
                this.a(s, s1);
                break;
            }
            case 3: {
                CreateCredentialResponse createCredentialResponse1 = (CreateCredentialResponse)wbz.a(parcel0, CreateCredentialResponse.CREATOR);
                PendingIntent pendingIntent0 = (PendingIntent)wbz.a(parcel0, PendingIntent.CREATOR);
                bycj.gr(parcel0);
                this.b(createCredentialResponse1, pendingIntent0);
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

