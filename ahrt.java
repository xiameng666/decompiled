import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.service.credentials.BeginCreateCredentialRequest;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ahrt extends wby implements ahru, cjug {
    private final cjts a;

    public ahrt() {
        super("com.google.android.gms.auth.api.identity.internal.ICredentialProviderService");
    }

    public ahrt(cjts cjts0) {
        super("com.google.android.gms.auth.api.identity.internal.ICredentialProviderService");
        this.a = cjts0;
    }

    @Override  // ahru
    public final void a(ahrl ahrl0, Bundle bundle0, String s, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.cm);
        bxrz bxrz0 = (bxrz)aewx.a.mr();
        bxrz0.ap(bxnj.bp, s);
        aexj aexj0 = new aexj();
        aexk aexk0 = new aexk(ahrl0);
        bxrz0.F(bbcu.gI, ahft.a, aexj0, aexk0);
        ibuq.f(bundle0, "bundle");
        kvx kvx0 = kvu.c(bundle0);
        if(kvx0 == null) {
            throw new IllegalArgumentException("Bundle was missing CallingAppInfo.");
        }
        cjtm cjtm0 = ((ahfp)bxrz0.B(new aewx(new kwt(kvx0), s))).b(402, "AuxiliaryCreateCredentialsOperation", ahrt.f(apiMetadata0));
        this.a.b(cjtm0);
    }

    @Override  // ahru
    public final void b(ahrr ahrr0, Bundle bundle0, String s, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.cl);
        bxrz bxrz0 = (bxrz)aexh.a.mr();
        bxrz0.ap(bxnj.bo, s);
        aexj aexj0 = new aexj();
        aexl aexl0 = new aexl(this, ahrr0);
        bxrz0.F(bbcu.gI, ahft.a, aexj0, aexl0);
        ibuq.f(bundle0, "bundle");
        kva kva0 = null;
        if(Build.VERSION.SDK_INT >= 34) {
            ibuq.f(bundle0, "bundle");
            BeginCreateCredentialRequest beginCreateCredentialRequest0 = ahs..ExternalSyntheticApiModelOutline0.m(bundle0.getParcelable("androidx.credentials.provider.BeginCreateCredentialRequest", BeginCreateCredentialRequest.class));
            if(beginCreateCredentialRequest0 != null) {
                kva0 = kxl.b(beginCreateCredentialRequest0);
            }
        }
        else {
            ibuq.f(bundle0, "bundle");
            String s1 = bundle0.getString("androidx.credentials.provider.extra.BEGIN_CREATE_CREDENTIAL_REQUEST_TYPE");
            if(s1 != null) {
                Bundle bundle1 = bundle0.getBundle("androidx.credentials.provider.extra.BEGIN_CREATE_CREDENTIAL_REQUEST_CANDIDATE_QUERY_DATA");
                if(bundle1 == null) {
                    bundle1 = new Bundle();
                }
                kva0 = kuz.a(s1, bundle1, kvu.c(bundle0));
            }
        }
        cjtm cjtm0 = ((ahfp)bxrz0.B(new aexh(kva0, s))).b(402, "AuxiliaryCreateCredentialsOperation", ahrt.f(apiMetadata0));
        this.a.b(cjtm0);
    }

    @Override  // ahru
    public final void c(ahsv ahsv0, Bundle bundle0, String s, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.ck);
        bxrz bxrz0 = (bxrz)aexw.a.mr();
        bxrz0.ap(bxnj.bn, s);
        aexj aexj0 = new aexj();
        aexm aexm0 = new aexm(this, ahsv0);
        bxrz0.F(bbcu.gI, ahft.a, aexj0, aexm0);
        cjtm cjtm0 = ((ahfp)bxrz0.B(new aexw(kvh.b(bundle0), s))).b(402, "AuxiliaryGetCredentialsOperation", ahrt.f(apiMetadata0));
        this.a.b(cjtm0);
    }

    // Detected as a lambda impl.
    public static Bundle d(SafeParcelable safeParcelable0) {
        Bundle bundle0 = new Bundle();
        bxom.b(bundle0, "credential_provider_response", safeParcelable0);
        return bundle0;
    }

    public static final gged_interceptors e(ggfp ggfp0) {
        return ggch.j(ggfp0).l((SafeParcelable safeParcelable0) -> {
            Bundle bundle0 = new Bundle();
            bxom.b(bundle0, "credential_provider_response", safeParcelable0);
            return bundle0;
        }).n();
    }

    private static azug f(ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.N);
        azuf0.g(bbdq.aL);
        return azuf0.a();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        ahsv ahsv0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IGetCredentialCallback");
                    ahsv0 = (iInterface0 instanceof ahsv) ? ((ahsv)iInterface0) : new ahst(iBinder0);
                }
                Bundle bundle0 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                String s = parcel0.readString();
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahrt.gr(parcel0);
                this.c(ahsv0, bundle0, s, apiMetadata0);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICreateCredentialCallback");
                    ahsv0 = (iInterface1 instanceof ahrr) ? ((ahrr)iInterface1) : new ahrp(iBinder1);
                }
                Bundle bundle1 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                String s1 = parcel0.readString();
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahrt.gr(parcel0);
                this.b(((ahrr)ahsv0), bundle1, s1, apiMetadata1);
                break;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IClearCredentialCallback");
                    ahsv0 = (iInterface2 instanceof ahrl) ? ((ahrl)iInterface2) : new ahrj(iBinder2);
                }
                Bundle bundle2 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                String s2 = parcel0.readString();
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahrt.gr(parcel0);
                this.a(((ahrl)ahsv0), bundle2, s2, apiMetadata2);
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

