import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerInvocationParams;
import com.google.android.gms.credential.manager.invocationparams.IssueType;

public final class becm extends wby implements IInterface, cjug {
    private final cjts a;
    private final String b;
    private final String c;

    public becm() {
        super("com.google.android.gms.credential.manager.firstparty.internal.IPasswordCheckupService");
    }

    public becm(cjts cjts0, String s, String s1) {
        super("com.google.android.gms.credential.manager.firstparty.internal.IPasswordCheckupService");
        this.b = s;
        this.c = s1;
        this.a = cjts0;
    }

    private final azug a(ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.aX);
        azuf0.g(bbdq.aT);
        azuf0.d(this.b);
        azuf0.c(this.c);
        return azuf0.a();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        bdic bdic0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.credential.manager.common.IPendingIntentCallback");
                    bdic0 = (iInterface0 instanceof bdic) ? ((bdic)iInterface0) : new bdia(iBinder0);
                }
                CredentialManagerInvocationParams credentialManagerInvocationParams0 = (CredentialManagerInvocationParams)wbz.a(parcel0, CredentialManagerInvocationParams.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                becm.gr(parcel0);
                bgfw bgfw0 = new bgfw(bdic0, credentialManagerInvocationParams0, 0, true, this.a(apiMetadata0));
                this.a.b(bgfw0);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    bdic0 = (iInterface1 instanceof azxs) ? ((azxs)iInterface1) : new azxq(iBinder1);
                }
                CredentialManagerInvocationParams credentialManagerInvocationParams1 = (CredentialManagerInvocationParams)wbz.a(parcel0, CredentialManagerInvocationParams.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                becm.gr(parcel0);
                bgjb bgjb0 = new bgjb(((azxs)bdic0), credentialManagerInvocationParams1, this.a(apiMetadata1));
                this.a.b(bgjb0);
                break;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.credential.manager.common.IIntegerCallback");
                    bdic0 = (iInterface2 instanceof bdhw) ? ((bdhw)iInterface2) : new bdhw(iBinder2);
                }
                IssueType issueType0 = (IssueType)wbz.a(parcel0, IssueType.CREATOR);
                CredentialManagerInvocationParams credentialManagerInvocationParams2 = (CredentialManagerInvocationParams)wbz.a(parcel0, CredentialManagerInvocationParams.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                becm.gr(parcel0);
                bght bght0 = new bght(((bdhw)bdic0), issueType0, credentialManagerInvocationParams2, this.a(apiMetadata2));
                this.a.b(bght0);
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

