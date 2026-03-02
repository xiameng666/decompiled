import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.fido.AuthenticationOptions;
import com.google.android.gms.auth.api.fido.GetGooglePasskeyForExportRequest;
import com.google.android.gms.auth.api.fido.RegistrationOptions;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ahnj extends wby implements ahnk, cjug {
    private final cjts a;
    private final String b;
    private final String c;

    public ahnj() {
        super("com.google.android.gms.auth.api.fido.internal.IFidoFirstPartyService");
    }

    public ahnj(cjts cjts0, String s, String s1) {
        super("com.google.android.gms.auth.api.fido.internal.IFidoFirstPartyService");
        this.b = s1;
        this.a = cjts0;
        this.c = s;
    }

    @Override  // ahnk
    public final void a(advs advs0, String s, byte[] arr_b, int v, String s1, ApiMetadata apiMetadata0) {
        agff agff0 = (agff)afqz.a.mr();
        agff0.y(bxnj.by, s1);
        afki afki0 = new afki();
        afkp afkp0 = new afkp(advs0);
        agff0.F(bbcu.dr, agfg.a, afki0, afkp0);
        cjtm cjtm0 = agff0.h(new ggoh(ByteString.copyFrom(arr_b)), s, v, s1).b(427, "GetKeyOperation", this.j(apiMetadata0));
        this.a.b(cjtm0);
    }

    @Override  // ahnk
    public final void b(ahof ahof0, AuthenticationOptions authenticationOptions0, ApiMetadata apiMetadata0) {
        agff agff0 = (agff)afti.a.mr();
        agff0.y(bxnj.bj, authenticationOptions0.b);
        afki afki0 = new afki();
        afkr afkr0 = new afkr(ahof0);
        agff0.F(bbcu.dr, agfg.a, afki0, afkr0);
        cjtm cjtm0 = agff0.B(new afti(authenticationOptions0)).b(427, "GetAuthenticationIntentOperation", this.j(apiMetadata0));
        this.a.b(cjtm0);
    }

    @Override  // ahnk
    public final void c(ahnw ahnw0, String s, ApiMetadata apiMetadata0) {
        String s1 = bxol.a();
        agff agff0 = (agff)afrs.a.mr();
        agff0.y(bxnj.bw, s1);
        afki afki0 = new afki();
        Objects.requireNonNull(ahnw0);
        afkk afkk0 = new afkk(ahnw0);
        agff0.F(bbcu.dq, agfg.a, afki0, afkk0);
        cjtm cjtm0 = agff0.B(new afrs(s, s1)).b(379, "ListKeysForBrowserOperation", this.j(apiMetadata0));
        this.a.b(cjtm0);
    }

    @Override  // ahnk
    public final void d(ahnq ahnq0, GetGooglePasskeyForExportRequest getGooglePasskeyForExportRequest0, ApiMetadata apiMetadata0) {
        agff agff0 = (agff)afue.a.mr();
        afki afki0 = new afki();
        Objects.requireNonNull(ahnq0);
        afkm afkm0 = new afkm(ahnq0);
        agff0.F(bbcu.dr, agfg.a, afki0, afkm0);
        cjtm cjtm0 = agff0.B(new afue(getGooglePasskeyForExportRequest0)).b(427, "GetGooglePasskeyForExportOperation", this.j(apiMetadata0));
        this.a.b(cjtm0);
    }

    @Override  // ahnk
    public final void e(ahof ahof0, RegistrationOptions registrationOptions0, ApiMetadata apiMetadata0) {
        agff agff0 = (agff)afuk.a.mr();
        agff0.y(bxnj.bi, registrationOptions0.b);
        afki afki0 = new afki();
        afkj afkj0 = new afkj(ahof0);
        agff0.F(bbcu.dr, agfg.a, afki0, afkj0);
        cjtm cjtm0 = agff0.B(new afuk(registrationOptions0)).b(427, "GetRegistrationIntentOperation", this.j(apiMetadata0));
        this.a.b(cjtm0);
    }

    @Override  // ahnk
    public final void f(ahoc ahoc0, String s, Account account0, ApiMetadata apiMetadata0) {
        agff agff0 = (agff)afwl.a.mr();
        agff0.y(bxnj.be, s);
        afki afki0 = new afki();
        afkn afkn0 = new afkn(ahoc0);
        agff0.F(bbcu.dr, agfg.a, afki0, afkn0);
        afwi afwi0 = afwj.a();
        afwi0.b(account0);
        afwi0.a = null;
        afwi0.d(true);
        afwi0.c(hpon.c());
        afwi0.e(s);
        cjtm cjtm0 = agff0.k(afwi0.a()).b(427, "SaveNewlyCreatedWebauthnCredentialSpecificsOperation", this.j(apiMetadata0));
        this.a.b(cjtm0);
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
                String s = parcel0.readString();
                Account account0 = (Account)wbz.a(parcel0, Account.CREATOR);
                byte[] arr_b = parcel0.createByteArray();
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahnj.gr(parcel0);
                this.g(azxs0, s, account0, arr_b, apiMetadata0);
                break;
            }
            case 3: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.auth.api.fido.internal.IListWebauthnCredentialSpecificsCallback");
                    azxs0 = (iInterface1 instanceof ahoc) ? ((ahoc)iInterface1) : new ahoa(iBinder1);
                }
                String s1 = parcel0.readString();
                Account account1 = (Account)wbz.a(parcel0, Account.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahnj.gr(parcel0);
                this.f(((ahoc)azxs0), s1, account1, apiMetadata1);
                break;
            }
            case 4: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.auth.api.fido.internal.IGetGooglePasskeyForExportCallback");
                    azxs0 = (iInterface2 instanceof ahnq) ? ((ahnq)iInterface2) : new ahno(iBinder2);
                }
                GetGooglePasskeyForExportRequest getGooglePasskeyForExportRequest0 = (GetGooglePasskeyForExportRequest)wbz.a(parcel0, GetGooglePasskeyForExportRequest.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahnj.gr(parcel0);
                this.d(((ahnq)azxs0), getGooglePasskeyForExportRequest0, apiMetadata2);
                break;
            }
            case 5: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.auth.api.fido.internal.IPendingIntentCallback");
                    azxs0 = (iInterface3 instanceof ahof) ? ((ahof)iInterface3) : new ahod(iBinder3);
                }
                RegistrationOptions registrationOptions0 = (RegistrationOptions)wbz.a(parcel0, RegistrationOptions.CREATOR);
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahnj.gr(parcel0);
                this.e(((ahof)azxs0), registrationOptions0, apiMetadata3);
                break;
            }
            case 6: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.auth.api.fido.internal.IPendingIntentCallback");
                    azxs0 = (iInterface4 instanceof ahof) ? ((ahof)iInterface4) : new ahod(iBinder4);
                }
                AuthenticationOptions authenticationOptions0 = (AuthenticationOptions)wbz.a(parcel0, AuthenticationOptions.CREATOR);
                ApiMetadata apiMetadata4 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahnj.gr(parcel0);
                this.b(((ahof)azxs0), authenticationOptions0, apiMetadata4);
                break;
            }
            case 7: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.auth.api.common.IStatusAndBooleanCallback");
                    azxs0 = (iInterface5 instanceof advs) ? ((advs)iInterface5) : new advq(iBinder5);
                }
                String s2 = parcel0.readString();
                byte[] arr_b1 = parcel0.createByteArray();
                int v1 = parcel0.readInt();
                String s3 = parcel0.readString();
                ApiMetadata apiMetadata5 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahnj.gr(parcel0);
                this.a(azxs0, s2, arr_b1, v1, s3, apiMetadata5);
                break;
            }
            case 8: {
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.auth.api.common.IStatusAndBooleanCallback");
                    azxs0 = (iInterface6 instanceof advs) ? ((advs)iInterface6) : new advq(iBinder6);
                }
                String s4 = parcel0.readString();
                String s5 = parcel0.readString();
                ApiMetadata apiMetadata6 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahnj.gr(parcel0);
                agff agff0 = (agff)afrk.a.mr();
                afki afki0 = new afki();
                afkl afkl0 = new afkl(((advs)azxs0));
                agff0.F(bbcu.dr, agfg.a, afki0, afkl0);
                cjtm cjtm0 = agff0.a(s4, s5).b(427, "GetKeyOperation", this.j(apiMetadata6));
                this.a.b(cjtm0);
                break;
            }
            case 9: {
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.auth.api.common.IStatusAndBooleanCallback");
                    azxs0 = (iInterface7 instanceof advs) ? ((advs)iInterface7) : new advq(iBinder7);
                }
                String s6 = parcel0.readString();
                String s7 = parcel0.readString();
                ApiMetadata apiMetadata7 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahnj.gr(parcel0);
                this.i(((advs)azxs0), s6, s7, apiMetadata7);
                break;
            }
            case 10: {
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 != null) {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.auth.api.common.IStatusAndBooleanCallback");
                    azxs0 = (iInterface8 instanceof advs) ? ((advs)iInterface8) : new advq(iBinder8);
                }
                String s8 = parcel0.readString();
                ApiMetadata apiMetadata8 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahnj.gr(parcel0);
                this.h(((advs)azxs0), s8, apiMetadata8);
                break;
            }
            case 11: {
                IBinder iBinder9 = parcel0.readStrongBinder();
                if(iBinder9 != null) {
                    IInterface iInterface9 = iBinder9.queryLocalInterface("com.google.android.gms.auth.api.fido.internal.IListKeysForBrowserCallback");
                    azxs0 = (iInterface9 instanceof ahnw) ? ((ahnw)iInterface9) : new ahnu(iBinder9);
                }
                String s9 = parcel0.readString();
                ApiMetadata apiMetadata9 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahnj.gr(parcel0);
                this.c(((ahnw)azxs0), s9, apiMetadata9);
                break;
            }
            case 12: {
                IBinder iBinder10 = parcel0.readStrongBinder();
                if(iBinder10 != null) {
                    IInterface iInterface10 = iBinder10.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    azxs0 = (iInterface10 instanceof azxs) ? ((azxs)iInterface10) : new azxq(iBinder10);
                }
                String s10 = parcel0.readString();
                Account account2 = (Account)wbz.a(parcel0, Account.CREATOR);
                byte[] arr_b2 = parcel0.createByteArray();
                ApiMetadata apiMetadata10 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahnj.gr(parcel0);
                hery hery0 = ahnj.k(arr_b2, azxs0);
                if(hery0 != null) {
                    agff agff1 = (agff)afva.a.mr();
                    afki afki1 = new afki();
                    Objects.requireNonNull(azxs0);
                    afkq afkq0 = new afkq(azxs0);
                    agff1.G(bbcu.dr, agfg.a, afki1, afkq0);
                    cjtm cjtm1 = agff1.B(new afva(s10, account2, hery0)).b(427, "DeleteWebauthnCredentialSpecificsOperation", this.j(apiMetadata10));
                    this.a.b(cjtm1);
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

    @Override  // ahnk
    public final void g(azxs azxs0, String s, Account account0, byte[] arr_b, ApiMetadata apiMetadata0) {
        hery hery0 = ahnj.k(arr_b, azxs0);
        if(hery0 == null) {
            return;
        }
        agff agff0 = (agff)afxk.a.mr();
        afki afki0 = new afki();
        Objects.requireNonNull(azxs0);
        afkq afkq0 = new afkq(azxs0);
        agff0.G(bbcu.dr, agfg.a, afki0, afkq0);
        cjtm cjtm0 = agff0.s(s, account0, hery0).b(427, "SaveNewlyCreatedWebauthnCredentialSpecificsOperation", this.j(apiMetadata0));
        this.a.b(cjtm0);
    }

    @Override  // ahnk
    public final void h(advs advs0, String s, ApiMetadata apiMetadata0) {
        String s1 = bxol.a();
        agff agff0 = ((agff)aftc.a.mr()).e();
        agff0.y(bxnj.bx, s1);
        afki afki0 = new afki();
        afks afks0 = new afks(advs0);
        agff0.F(bbcu.dr, agfg.a, afki0, afks0);
        cjtm cjtm0 = agff0.B(new aftc(s)).b(427, "ValidateBrowserOperation", this.j(apiMetadata0));
        this.a.b(cjtm0);
    }

    @Override  // ahnk
    public final void i(advs advs0, String s, String s1, ApiMetadata apiMetadata0) {
        String s2 = bxol.a();
        agff agff0 = ((agff)agai.a.mr()).e();
        agff0.y(bxnj.bt, s2);
        afki afki0 = new afki();
        afko afko0 = new afko(advs0);
        agff0.F(bbcu.dr, agfg.a, afki0, afko0);
        cjtm cjtm0 = agff0.p(s, s1, s2).b(427, "ValidateRpIdOperation", this.j(apiMetadata0));
        this.a.b(cjtm0);
    }

    public final azug j(ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.N);
        azuf0.g(bbdq.aL);
        azuf0.d(this.c);
        azuf0.c(this.b);
        return azuf0.a();
    }

    private static hery k(byte[] arr_b, azxs azxs0) {
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hery.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return (hery)hftv0;
        }
        catch(hfur unused_ex) {
            try {
                azxs0.a(new Status(8, "Unable to parse WebauthnCredentialSpecifics"));
            }
            catch(RemoteException remoteException0) {
                Log.e("Auth.Api.Credentials", "Failed to set failure response to API callback.", remoteException0);
            }
            return null;
        }
    }
}

