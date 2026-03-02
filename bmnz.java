import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.fido.fido2.api.StateUpdate;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.HybridRequestData;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import java.util.UUID;

public final class bmnz extends wby implements bmoa, cjug {
    private final Context a;
    private final String b;
    private final String c;
    private final cjts d;

    public bmnz() {
        super("com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService");
    }

    public bmnz(Context context0, cjts cjts0, String s, String s1) {
        super("com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService");
        this.b = s;
        this.c = s1;
        this.a = context0;
        this.d = cjts0;
    }

    @Override  // bmoa
    public final void a(bmnx bmnx0, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions0, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.cH);
        blkw blkw0 = new blkw(bmnx0, browserPublicKeyCredentialCreationOptions0, this.m(apiMetadata0));
        this.d.b(blkw0);
    }

    @Override  // bmoa
    public final void b(bmnx bmnx0, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions0, String s, boolean z, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.cO);
        azug azug0 = this.m(apiMetadata0);
        blkx blkx0 = new blkx(bmnx0, publicKeyCredentialCreationOptions0, s, z, bnaf.d, azug0);
        this.d.b(blkx0);
    }

    @Override  // bmoa
    public final void c(bmnx bmnx0, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions0, String s, boolean z, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.cN);
        azug azug0 = this.m(apiMetadata0);
        blkx blkx0 = new blkx(bmnx0, publicKeyCredentialRequestOptions0, s, z, bnaf.d, azug0);
        this.d.b(blkx0);
    }

    @Override  // bmoa
    public final void d(bmnx bmnx0, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions0, String s, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.cG);
        azug azug0 = this.m(apiMetadata0);
        blky blky0 = new blky(bmnx0, publicKeyCredentialCreationOptions0, s, bnaf.d, azug0);
        this.d.b(blky0);
    }

    @Override  // bmoa
    public final void e(bmnx bmnx0, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions0, String s, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.cF);
        azug azug0 = this.m(apiMetadata0);
        blkz blkz0 = new blkz(bmnx0, publicKeyCredentialRequestOptions0, s, bnaf.d, azug0);
        this.d.b(blkz0);
    }

    @Override  // bmoa
    public final void f(bmnx bmnx0, HybridRequestData hybridRequestData0, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.cP);
        azug azug0 = this.m(apiMetadata0);
        blla blla0 = new blla(bmnx0, hybridRequestData0, bnaf.i, azug0);
        this.d.b(blla0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        azxs azxs4;
        azxs azxs3;
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
                    azxs azxs2 = (iInterface0 instanceof azxs) ? ((azxs)iInterface0) : new azxq(iBinder0);
                    azxs1 = azxs2;
                }
                parcel0.readInt();
                byte[] arr_b = parcel0.createByteArray();
                byte[] arr_b1 = parcel0.createByteArray();
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.fido.fido2.api.IAuthStatusCallback");
                    azxs0 = (iInterface1 instanceof bmfv) ? ((bmfv)iInterface1) : new bmft(iBinder1);
                }
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmnz.gr(parcel0);
                this.l(azxs1, arr_b, arr_b1, ((bmfv)azxs0), apiMetadata0);
                break;
            }
            case 2: {
                String s = parcel0.readString();
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 == null) {
                    azxs3 = null;
                }
                else {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    azxs3 = (iInterface2 instanceof azxs) ? ((azxs)iInterface2) : new azxq(iBinder2);
                }
                PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions0 = (PublicKeyCredentialRequestOptions)wbz.a(parcel0, PublicKeyCredentialRequestOptions.CREATOR);
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.fido.fido2.api.IResponseHandler");
                    azxs0 = (iInterface3 instanceof bmgd) ? ((bmgd)iInterface3) : new bmgb(iBinder3);
                }
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmnz.gr(parcel0);
                this.k(s, azxs3, publicKeyCredentialRequestOptions0, ((bmgd)azxs0), apiMetadata1);
                break;
            }
            case 3: {
                String s1 = parcel0.readString();
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 == null) {
                    azxs4 = null;
                }
                else {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    azxs azxs5 = (iInterface4 instanceof azxs) ? ((azxs)iInterface4) : new azxq(iBinder4);
                    azxs4 = azxs5;
                }
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions0 = (PublicKeyCredentialCreationOptions)wbz.a(parcel0, PublicKeyCredentialCreationOptions.CREATOR);
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.fido.fido2.api.IResponseHandler");
                    azxs0 = (iInterface5 instanceof bmgd) ? ((bmgd)iInterface5) : new bmgb(iBinder5);
                }
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmnz.gr(parcel0);
                ccmq.a().a(bbdg.cy);
                bnad bnad0 = new bnad();
                bnad0.a = bnaf.d;
                bnad0.b = publicKeyCredentialCreationOptions0.h;
                bnad0.f = publicKeyCredentialCreationOptions0.a.a;
                bnad0.e = String.format("%s_%s", "HEADLESS", "FIDO2_CHIMERA_ACTIVITY_REGISTRATION");
                bnae bnae0 = bnad0.a();
                azug azug0 = this.m(apiMetadata2);
                bllf bllf0 = new bllf(bnae0, UUID.fromString(s1), azxs4, publicKeyCredentialCreationOptions0, ((bmgd)azxs0), this.b, azug0);
                this.d.b(bllf0);
                break;
            }
            case 4: {
                String s2 = parcel0.readString();
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    azxs0 = (iInterface6 instanceof azxs) ? ((azxs)iInterface6) : new azxq(iBinder6);
                }
                StateUpdate stateUpdate0 = (StateUpdate)wbz.a(parcel0, StateUpdate.CREATOR);
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmnz.gr(parcel0);
                this.j(s2, azxs0, stateUpdate0, apiMetadata3);
                break;
            }
            case 5: {
                parcel0.readString();
                String s3 = parcel0.readString();
                String s4 = parcel0.readString();
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.fido.fido2.api.ICredentialListCallback");
                    azxs0 = (iInterface7 instanceof bmga) ? ((bmga)iInterface7) : new bmga(iBinder7);
                }
                ApiMetadata apiMetadata4 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmnz.gr(parcel0);
                ccmq.a().a(bbdg.cC);
                azug azug1 = this.m(apiMetadata4);
                blll blll0 = new blll(s3, s4, azxs0, new blny(this.a), azug1);
                this.d.b(blll0);
                break;
            }
            case 6: {
                String s5 = parcel0.readString();
                String s6 = parcel0.readString();
                PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions1 = (PublicKeyCredentialRequestOptions)wbz.a(parcel0, PublicKeyCredentialRequestOptions.CREATOR);
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 != null) {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyCallbacks");
                    azxs0 = (iInterface8 instanceof bmnx) ? ((bmnx)iInterface8) : new bmnv(iBinder8);
                }
                ApiMetadata apiMetadata5 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmnz.gr(parcel0);
                ccmq.a().a(bbdg.cD);
                blkv blkv0 = new blkv(s5, s6, publicKeyCredentialRequestOptions1, azxs0, this.m(apiMetadata5));
                this.d.b(blkv0);
                break;
            }
            case 7: {
                String s7 = parcel0.readString();
                String s8 = parcel0.readString();
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions1 = (PublicKeyCredentialCreationOptions)wbz.a(parcel0, PublicKeyCredentialCreationOptions.CREATOR);
                IBinder iBinder9 = parcel0.readStrongBinder();
                if(iBinder9 != null) {
                    IInterface iInterface9 = iBinder9.queryLocalInterface("com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyCallbacks");
                    azxs0 = (iInterface9 instanceof bmnx) ? ((bmnx)iInterface9) : new bmnv(iBinder9);
                }
                ApiMetadata apiMetadata6 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmnz.gr(parcel0);
                ccmq.a().a(bbdg.cE);
                azug azug2 = this.m(apiMetadata6);
                bllb bllb0 = new bllb(s7, s8, gfqx.a, publicKeyCredentialCreationOptions1, azxs0, azug2);
                this.d.b(bllb0);
                break;
            }
            case 8: {
                IBinder iBinder10 = parcel0.readStrongBinder();
                if(iBinder10 != null) {
                    IInterface iInterface10 = iBinder10.queryLocalInterface("com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyCallbacks");
                    azxs0 = (iInterface10 instanceof bmnx) ? ((bmnx)iInterface10) : new bmnv(iBinder10);
                }
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions2 = (PublicKeyCredentialCreationOptions)wbz.a(parcel0, PublicKeyCredentialCreationOptions.CREATOR);
                String s9 = parcel0.readString();
                ApiMetadata apiMetadata7 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmnz.gr(parcel0);
                this.d(((bmnx)azxs0), publicKeyCredentialCreationOptions2, s9, apiMetadata7);
                break;
            }
            case 9: {
                IBinder iBinder11 = parcel0.readStrongBinder();
                if(iBinder11 != null) {
                    IInterface iInterface11 = iBinder11.queryLocalInterface("com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyCallbacks");
                    azxs0 = (iInterface11 instanceof bmnx) ? ((bmnx)iInterface11) : new bmnv(iBinder11);
                }
                PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions2 = (PublicKeyCredentialRequestOptions)wbz.a(parcel0, PublicKeyCredentialRequestOptions.CREATOR);
                String s10 = parcel0.readString();
                ApiMetadata apiMetadata8 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmnz.gr(parcel0);
                this.e(((bmnx)azxs0), publicKeyCredentialRequestOptions2, s10, apiMetadata8);
                break;
            }
            case 10: {
                IBinder iBinder12 = parcel0.readStrongBinder();
                if(iBinder12 != null) {
                    IInterface iInterface12 = iBinder12.queryLocalInterface("com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyCallbacks");
                    azxs0 = (iInterface12 instanceof bmnx) ? ((bmnx)iInterface12) : new bmnv(iBinder12);
                }
                BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions0 = (BrowserPublicKeyCredentialCreationOptions)wbz.a(parcel0, BrowserPublicKeyCredentialCreationOptions.CREATOR);
                ApiMetadata apiMetadata9 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmnz.gr(parcel0);
                this.a(((bmnx)azxs0), browserPublicKeyCredentialCreationOptions0, apiMetadata9);
                break;
            }
            case 11: {
                String s11 = parcel0.readString();
                String s12 = parcel0.readString();
                String s13 = parcel0.readString();
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions3 = (PublicKeyCredentialCreationOptions)wbz.a(parcel0, PublicKeyCredentialCreationOptions.CREATOR);
                IBinder iBinder13 = parcel0.readStrongBinder();
                if(iBinder13 != null) {
                    IInterface iInterface13 = iBinder13.queryLocalInterface("com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyCallbacks");
                    azxs0 = (iInterface13 instanceof bmnx) ? ((bmnx)iInterface13) : new bmnv(iBinder13);
                }
                ApiMetadata apiMetadata10 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmnz.gr(parcel0);
                ccmq.a().a(bbdg.cI);
                azug azug3 = this.m(apiMetadata10);
                bllb bllb1 = new bllb(s11, s12, gfsx.m(s13), publicKeyCredentialCreationOptions3, azxs0, azug3);
                this.d.b(bllb1);
                break;
            }
            case 12: {
                String s14 = parcel0.readString();
                BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions0 = (BrowserPublicKeyCredentialRequestOptions)wbz.a(parcel0, BrowserPublicKeyCredentialRequestOptions.CREATOR);
                boolean z = wbz.i(parcel0);
                IBinder iBinder14 = parcel0.readStrongBinder();
                if(iBinder14 != null) {
                    IInterface iInterface14 = iBinder14.queryLocalInterface("com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyCallbacks");
                    azxs0 = (iInterface14 instanceof bmnx) ? ((bmnx)iInterface14) : new bmnv(iBinder14);
                }
                ApiMetadata apiMetadata11 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmnz.gr(parcel0);
                ccmq.a().a(bbdg.cJ);
                bllm bllm0 = new bllm(s14, browserPublicKeyCredentialRequestOptions0, z, azxs0, this.m(apiMetadata11));
                this.d.b(bllm0);
                break;
            }
            case 13: {
                String s15 = parcel0.readString();
                String s16 = parcel0.readString();
                BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions1 = (BrowserPublicKeyCredentialCreationOptions)wbz.a(parcel0, BrowserPublicKeyCredentialCreationOptions.CREATOR);
                IBinder iBinder15 = parcel0.readStrongBinder();
                if(iBinder15 != null) {
                    IInterface iInterface15 = iBinder15.queryLocalInterface("com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyCallbacks");
                    azxs0 = (iInterface15 instanceof bmnx) ? ((bmnx)iInterface15) : new bmnv(iBinder15);
                }
                ApiMetadata apiMetadata12 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmnz.gr(parcel0);
                ccmq.a().a(bbdg.cK);
                bllp bllp0 = new bllp(s15, s16, browserPublicKeyCredentialCreationOptions1, azxs0, this.m(apiMetadata12));
                this.d.b(bllp0);
                break;
            }
            case 15: {
                BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions2 = (BrowserPublicKeyCredentialCreationOptions)wbz.a(parcel0, BrowserPublicKeyCredentialCreationOptions.CREATOR);
                IBinder iBinder16 = parcel0.readStrongBinder();
                if(iBinder16 != null) {
                    IInterface iInterface16 = iBinder16.queryLocalInterface("com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyCallbacks");
                    azxs0 = (iInterface16 instanceof bmnx) ? ((bmnx)iInterface16) : new bmnv(iBinder16);
                }
                ApiMetadata apiMetadata13 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmnz.gr(parcel0);
                ccmq.a().a(bbdg.cL);
                blln blln0 = new blln(browserPublicKeyCredentialCreationOptions2, ((bmnx)azxs0), this.m(apiMetadata13));
                this.d.b(blln0);
                break;
            }
            case 16: {
                BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions1 = (BrowserPublicKeyCredentialRequestOptions)wbz.a(parcel0, BrowserPublicKeyCredentialRequestOptions.CREATOR);
                IBinder iBinder17 = parcel0.readStrongBinder();
                if(iBinder17 != null) {
                    IInterface iInterface17 = iBinder17.queryLocalInterface("com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyCallbacks");
                    azxs0 = (iInterface17 instanceof bmnx) ? ((bmnx)iInterface17) : new bmnv(iBinder17);
                }
                ApiMetadata apiMetadata14 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmnz.gr(parcel0);
                this.i(browserPublicKeyCredentialRequestOptions1, ((bmnx)azxs0), apiMetadata14);
                break;
            }
            case 17: {
                IBinder iBinder18 = parcel0.readStrongBinder();
                if(iBinder18 != null) {
                    IInterface iInterface18 = iBinder18.queryLocalInterface("com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyCallbacks");
                    azxs0 = (iInterface18 instanceof bmnx) ? ((bmnx)iInterface18) : new bmnv(iBinder18);
                }
                PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions3 = (PublicKeyCredentialRequestOptions)wbz.a(parcel0, PublicKeyCredentialRequestOptions.CREATOR);
                String s17 = parcel0.readString();
                boolean z1 = wbz.i(parcel0);
                ApiMetadata apiMetadata15 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmnz.gr(parcel0);
                this.c(azxs0, publicKeyCredentialRequestOptions3, s17, z1, apiMetadata15);
                break;
            }
            case 18: {
                IBinder iBinder19 = parcel0.readStrongBinder();
                if(iBinder19 != null) {
                    IInterface iInterface19 = iBinder19.queryLocalInterface("com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyCallbacks");
                    azxs0 = (iInterface19 instanceof bmnx) ? ((bmnx)iInterface19) : new bmnv(iBinder19);
                }
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions4 = (PublicKeyCredentialCreationOptions)wbz.a(parcel0, PublicKeyCredentialCreationOptions.CREATOR);
                String s18 = parcel0.readString();
                boolean z2 = wbz.i(parcel0);
                ApiMetadata apiMetadata16 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmnz.gr(parcel0);
                this.b(azxs0, publicKeyCredentialCreationOptions4, s18, z2, apiMetadata16);
                break;
            }
            case 19: {
                IBinder iBinder20 = parcel0.readStrongBinder();
                if(iBinder20 != null) {
                    IInterface iInterface20 = iBinder20.queryLocalInterface("com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyCallbacks");
                    azxs0 = (iInterface20 instanceof bmnx) ? ((bmnx)iInterface20) : new bmnv(iBinder20);
                }
                BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions2 = (BrowserPublicKeyCredentialRequestOptions)wbz.a(parcel0, BrowserPublicKeyCredentialRequestOptions.CREATOR);
                String s19 = parcel0.readString();
                boolean z3 = wbz.i(parcel0);
                ApiMetadata apiMetadata17 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmnz.gr(parcel0);
                this.h(azxs0, browserPublicKeyCredentialRequestOptions2, s19, z3, apiMetadata17);
                break;
            }
            case 20: {
                IBinder iBinder21 = parcel0.readStrongBinder();
                if(iBinder21 != null) {
                    IInterface iInterface21 = iBinder21.queryLocalInterface("com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyCallbacks");
                    azxs0 = (iInterface21 instanceof bmnx) ? ((bmnx)iInterface21) : new bmnv(iBinder21);
                }
                BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions3 = (BrowserPublicKeyCredentialCreationOptions)wbz.a(parcel0, BrowserPublicKeyCredentialCreationOptions.CREATOR);
                String s20 = parcel0.readString();
                boolean z4 = wbz.i(parcel0);
                ApiMetadata apiMetadata18 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmnz.gr(parcel0);
                this.g(azxs0, browserPublicKeyCredentialCreationOptions3, s20, z4, apiMetadata18);
                break;
            }
            case 21: {
                IBinder iBinder22 = parcel0.readStrongBinder();
                if(iBinder22 != null) {
                    IInterface iInterface22 = iBinder22.queryLocalInterface("com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyCallbacks");
                    azxs0 = (iInterface22 instanceof bmnx) ? ((bmnx)iInterface22) : new bmnv(iBinder22);
                }
                HybridRequestData hybridRequestData0 = (HybridRequestData)wbz.a(parcel0, HybridRequestData.CREATOR);
                ApiMetadata apiMetadata19 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmnz.gr(parcel0);
                this.f(((bmnx)azxs0), hybridRequestData0, apiMetadata19);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }

    @Override  // bmoa
    public final void g(bmnx bmnx0, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions0, String s, boolean z, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.cO);
        azug azug0 = this.m(apiMetadata0);
        blkx blkx0 = new blkx(bmnx0, browserPublicKeyCredentialCreationOptions0, s, z, bnaf.d, azug0);
        this.d.b(blkx0);
    }

    @Override  // bmoa
    public final void h(bmnx bmnx0, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions0, String s, boolean z, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.cN);
        azug azug0 = this.m(apiMetadata0);
        blkx blkx0 = new blkx(bmnx0, browserPublicKeyCredentialRequestOptions0, s, z, bnaf.d, azug0);
        this.d.b(blkx0);
    }

    @Override  // bmoa
    public final void i(BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions0, bmnx bmnx0, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.cM);
        bllo bllo0 = new bllo(browserPublicKeyCredentialRequestOptions0, bmnx0, this.m(apiMetadata0));
        this.d.b(bllo0);
    }

    @Override  // bmoa
    @Deprecated
    public final void j(String s, azxs azxs0, StateUpdate stateUpdate0, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.cA);
        azug azug0 = this.m(apiMetadata0);
        bllc bllc0 = new bllc(UUID.fromString(s), azxs0, stateUpdate0, azug0);
        this.d.b(bllc0);
    }

    @Override  // bmoa
    @Deprecated
    public final void k(String s, azxs azxs0, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions0, bmgd bmgd0, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.cz);
        bnad bnad0 = new bnad();
        bnad0.a = bnaf.d;
        bnad0.b = publicKeyCredentialRequestOptions0.e;
        bnad0.f = publicKeyCredentialRequestOptions0.c;
        bnad0.e = String.format("%s_%s", "HEADLESS", "FIDO2_CHIMERA_ACTIVITY_ASSERTION");
        bnae bnae0 = bnad0.a();
        azug azug0 = this.m(apiMetadata0);
        blli blli0 = new blli(bnae0, UUID.fromString(s), azxs0, publicKeyCredentialRequestOptions0, bmgd0, this.b, azug0);
        this.d.b(blli0);
    }

    @Override  // bmoa
    @Deprecated
    public final void l(azxs azxs0, byte[] arr_b, byte[] arr_b1, bmfv bmfv0, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.cB);
        bllq bllq0 = new bllq(azxs0, this.m(apiMetadata0));
        this.d.b(bllq0);
    }

    private final azug m(ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.bv);
        azuf0.g(bbdq.aL);
        azuf0.d(this.b);
        azuf0.c(this.c);
        return azuf0.a();
    }
}

