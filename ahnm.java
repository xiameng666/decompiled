import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.fido.RegisteredCredentialData;
import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;

public final class ahnm extends wby implements ahnn, cjug {
    private final cjts a;
    private final String b;
    private final String c;

    public ahnm() {
        super("com.google.android.gms.auth.api.fido.internal.IFidoInternalService");
    }

    public ahnm(cjts cjts0, String s, String s1) {
        super("com.google.android.gms.auth.api.fido.internal.IFidoInternalService");
        this.b = s1;
        this.a = cjts0;
        this.c = s;
    }

    @Override  // ahnn
    public final void a(ahnt ahnt0, String s, ApiMetadata apiMetadata0) {
        agff agff0 = (agff)afqc.a.mr();
        afkt afkt0 = new afkt();
        Objects.requireNonNull(ahnt0);
        afkw afkw0 = new afkw(ahnt0);
        agff0.F(bbcu.dq, agfg.a, afkt0, afkw0);
        cjtm cjtm0 = agff0.B(new afqc(s)).b(379, "IncrementAndGetRegisteredCredentialCounterOperation", this.d(apiMetadata0));
        this.a.b(cjtm0);
    }

    @Override  // ahnn
    public final void b(ahnz ahnz0, String s, ApiMetadata apiMetadata0) {
        agff agff0 = (agff)afqf.a.mr();
        afkt afkt0 = new afkt();
        Objects.requireNonNull(ahnz0);
        afku afku0 = new afku(ahnz0);
        agff0.F(bbcu.dq, agfg.a, afkt0, afku0);
        cjtm cjtm0 = agff0.q(s).b(379, "ListRegisteredCredentialsOperation", this.d(apiMetadata0));
        this.a.b(cjtm0);
    }

    @Override  // ahnn
    public final void c(azxs azxs0, RegisteredCredentialData registeredCredentialData0, ApiMetadata apiMetadata0) {
        agff agff0 = (agff)afqj.a.mr();
        afkt afkt0 = new afkt();
        Objects.requireNonNull(azxs0);
        afkx afkx0 = new afkx(azxs0);
        agff0.G(bbcu.dq, agfg.a, afkt0, afkx0);
        cjtm cjtm0 = agff0.B(new afqj(registeredCredentialData0)).b(379, "SaveRegisteredCredentialOperation", this.d(apiMetadata0));
        this.a.b(cjtm0);
    }

    private final azug d(ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.N);
        azuf0.g(bbdq.aL);
        azuf0.d(this.c);
        azuf0.c(this.b);
        return azuf0.a();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        azxs azxs0 = null;
        switch(v) {
            case 2: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    azxs0 = (iInterface0 instanceof azxs) ? ((azxs)iInterface0) : new azxq(iBinder0);
                }
                RegisteredCredentialData registeredCredentialData0 = (RegisteredCredentialData)wbz.a(parcel0, RegisteredCredentialData.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahnm.gr(parcel0);
                this.c(azxs0, registeredCredentialData0, apiMetadata0);
                break;
            }
            case 3: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.auth.api.fido.internal.IListRegisteredCredentialsCallback");
                    azxs0 = (iInterface1 instanceof ahnz) ? ((ahnz)iInterface1) : new ahnx(iBinder1);
                }
                String s = parcel0.readString();
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahnm.gr(parcel0);
                this.b(((ahnz)azxs0), s, apiMetadata1);
                break;
            }
            case 4: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.auth.api.fido.internal.IIncrementAndGetCounterCallback");
                    azxs0 = (iInterface2 instanceof ahnt) ? ((ahnt)iInterface2) : new ahnr(iBinder2);
                }
                String s1 = parcel0.readString();
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahnm.gr(parcel0);
                this.a(((ahnt)azxs0), s1, apiMetadata2);
                break;
            }
            case 5: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    azxs0 = (iInterface3 instanceof azxs) ? ((azxs)iInterface3) : new azxq(iBinder3);
                }
                String s2 = parcel0.readString();
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahnm.gr(parcel0);
                agff agff0 = (agff)afpy.a.mr();
                afkt afkt0 = new afkt();
                Objects.requireNonNull(azxs0);
                afkx afkx0 = new afkx(azxs0);
                agff0.G(bbcu.dq, agfg.a, afkt0, afkx0);
                cjtm cjtm0 = agff0.B(new afpy(s2)).b(379, "DeleteRegisteredCredentialOperation", this.d(apiMetadata3));
                this.a.b(cjtm0);
                break;
            }
            case 10: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.auth.api.fido.internal.IPendingIntentCallback");
                    azxs0 = (iInterface4 instanceof ahof) ? ((ahof)iInterface4) : new ahod(iBinder4);
                }
                String s3 = parcel0.readString();
                Account account0 = (Account)wbz.a(parcel0, Account.CREATOR);
                boolean z = wbz.i(parcel0);
                ApiMetadata apiMetadata4 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahnm.gr(parcel0);
                agff agff1 = (agff)aftm.a.mr();
                afkt afkt1 = new afkt();
                afkv afkv0 = new afkv(((ahof)azxs0));
                agff1.F(bbcu.dq, agfg.a, afkt1, afkv0);
                cjtm cjtm1 = agff1.B(new aftm(s3, account0, z, this.c)).b(379, "GetCryptauthKeyAndPendingIntentForAuthenticationOperation", this.d(apiMetadata4));
                this.a.b(cjtm1);
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

