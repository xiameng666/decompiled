import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.fido.u2f.api.StateUpdate;
import com.google.android.gms.fido.u2f.api.common.BrowserRegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;

public final class bnfs extends wby implements bnft, cjug {
    private final cjts a;
    private final String b;
    private final String c;

    public bnfs() {
        super("com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService");
    }

    public bnfs(cjts cjts0, String s, String s1) {
        super("com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService");
        this.b = s;
        this.c = s1;
        this.a = cjts0;
    }

    @Override  // bnft
    public final void a(azxs azxs0, BrowserSignRequestParams browserSignRequestParams0, bncr bncr0, ApiMetadata apiMetadata0) {
        azug azug0 = this.c(apiMetadata0);
        bnad bnad0 = new bnad();
        bnad0.a = bnaf.l;
        bnad0.b = browserSignRequestParams0.e();
        bnad0.f = browserSignRequestParams0.a().getHost();
        bnad0.e = String.format("%s_%s", "HEADLESS", "U2F_CHIMERA_ACTIVITY_ASSERTION");
        bngd bngd0 = new bngd(bnad0.a(), azxs0, browserSignRequestParams0, bncr0, this.b, azug0);
        this.a.b(bngd0);
    }

    @Override  // bnft
    public final void b(azxs azxs0, StateUpdate stateUpdate0, ApiMetadata apiMetadata0) {
        bnge bnge0 = new bnge(azxs0, stateUpdate0, this.c(apiMetadata0));
        this.a.b(bnge0);
    }

    private final azug c(ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.bv);
        azuf0.g(bbdq.aL);
        azuf0.d(this.b);
        azuf0.c(this.c);
        return azuf0.a();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        azxs azxs2;
        azxs azxs1;
        azxs azxs0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    azxs1 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    azxs1 = (iInterface0 instanceof azxs) ? ((azxs)iInterface0) : new azxq(iBinder0);
                }
                BrowserSignRequestParams browserSignRequestParams0 = (BrowserSignRequestParams)wbz.a(parcel0, BrowserSignRequestParams.CREATOR);
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.fido.u2f.api.ISignResponseHandler");
                    azxs0 = (iInterface1 instanceof bncr) ? ((bncr)iInterface1) : new bncp(iBinder1);
                }
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bnfs.gr(parcel0);
                this.a(azxs1, browserSignRequestParams0, ((bncr)azxs0), apiMetadata0);
                break;
            }
            case 2: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 == null) {
                    azxs2 = null;
                }
                else {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    azxs azxs3 = (iInterface2 instanceof azxs) ? ((azxs)iInterface2) : new azxq(iBinder2);
                    azxs2 = azxs3;
                }
                BrowserRegisterRequestParams browserRegisterRequestParams0 = (BrowserRegisterRequestParams)wbz.a(parcel0, BrowserRegisterRequestParams.CREATOR);
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.fido.u2f.api.IRegisterResponseHandler");
                    azxs0 = (iInterface3 instanceof bnco) ? ((bnco)iInterface3) : new bnco(iBinder3);
                }
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bnfs.gr(parcel0);
                azug azug0 = this.c(apiMetadata1);
                bnad bnad0 = new bnad();
                bnad0.a = bnaf.l;
                bnad0.b = browserRegisterRequestParams0.e();
                bnad0.f = browserRegisterRequestParams0.a().getHost();
                bnad0.e = String.format("%s_%s", "HEADLESS", "U2F_CHIMERA_ACTIVITY_REGISTRATION");
                bnfz bnfz0 = new bnfz(bnad0.a(), azxs2, browserRegisterRequestParams0, ((bnco)azxs0), this.b, azug0);
                this.a.b(bnfz0);
                break;
            }
            case 3: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    azxs0 = (iInterface4 instanceof azxs) ? ((azxs)iInterface4) : new azxq(iBinder4);
                }
                StateUpdate stateUpdate0 = (StateUpdate)wbz.a(parcel0, StateUpdate.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bnfs.gr(parcel0);
                this.b(azxs0, stateUpdate0, apiMetadata2);
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

