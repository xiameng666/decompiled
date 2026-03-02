import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.chimera.modules.fido.AppContextProvider;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.fido.credentialstore.KeyCreationRequestOptions;

public final class bmcx extends wby implements bmcy, cjug {
    private final cjts a;
    private final String b;
    private final String c;

    public bmcx() {
        super("com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService");
    }

    public bmcx(cjts cjts0, String s, String s1) {
        super("com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService");
        this.b = s;
        this.c = s1;
        this.a = cjts0;
    }

    @Override  // bmcy
    public final void a(azxs azxs0, String s, long v, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.cU);
        blij blij0 = new blij(azxs0, s, v, this.i(apiMetadata0));
        this.a.b(blij0);
    }

    @Override  // bmcy
    public final void b(azxs azxs0, Account account0, String s, byte[] arr_b, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.cS);
        if(account0 == null) {
            azuf azuf0 = azug.b(apiMetadata0);
            azuf0.e(bbdp.bv);
            azuf0.g(bbdq.aL);
            azuf0.d(this.b);
            azuf0.c(this.c);
            bliw bliw0 = new bliw(azxs0, s, arr_b, azuf0.a());
            this.a.b(bliw0);
            return;
        }
        azuf azuf1 = azug.b(apiMetadata0);
        azuf1.e(bbdp.bv);
        azuf1.g(bbdq.aL);
        azuf1.d(this.b);
        azuf1.c(this.c);
        blja blja0 = new blja(azxs0, account0, s, arr_b, azuf1.a());
        this.a.b(blja0);
    }

    @Override  // bmcy
    public final void c(bmde bmde0, KeyCreationRequestOptions keyCreationRequestOptions0, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.cQ);
        bljg bljg0 = new bljg(bmde0, keyCreationRequestOptions0, this.i(apiMetadata0));
        this.a.b(bljg0);
    }

    @Override  // bmcy
    public final void d(bmde bmde0, String s, byte[] arr_b, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.cR);
        bljo bljo0 = new bljo(bmde0, s, arr_b, this.i(apiMetadata0));
        this.a.b(bljo0);
    }

    @Override  // bmcy
    public final void e(bmdb bmdb0, Account account0, String s, byte[] arr_b, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.cW);
        bljt bljt0 = new bljt(bmdb0, account0, s, arr_b, this.i(apiMetadata0));
        this.a.b(bljt0);
    }

    @Override  // bmcy
    public final void f(bmdk bmdk0, String s, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.cT);
        blju blju0 = new blju(bmdk0, s, this.i(apiMetadata0));
        this.a.b(blju0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        bmde bmde0 = null;
        switch(v) {
            case 2: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fido.credentialstore.internal.IKeyDataCallbacks");
                    bmde0 = (iInterface0 instanceof bmde) ? ((bmde)iInterface0) : new bmdc(iBinder0);
                }
                KeyCreationRequestOptions keyCreationRequestOptions0 = (KeyCreationRequestOptions)wbz.a(parcel0, KeyCreationRequestOptions.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmcx.gr(parcel0);
                this.c(bmde0, keyCreationRequestOptions0, apiMetadata0);
                break;
            }
            case 3: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.fido.credentialstore.internal.IKeyDataCallbacks");
                    bmde0 = (iInterface1 instanceof bmde) ? ((bmde)iInterface1) : new bmdc(iBinder1);
                }
                String s = parcel0.readString();
                byte[] arr_b = parcel0.createByteArray();
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmcx.gr(parcel0);
                this.d(bmde0, s, arr_b, apiMetadata1);
                break;
            }
            case 4: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    bmde0 = (iInterface2 instanceof azxs) ? ((azxs)iInterface2) : new azxq(iBinder2);
                }
                String s1 = parcel0.readString();
                byte[] arr_b1 = parcel0.createByteArray();
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmcx.gr(parcel0);
                ccmq.a().a(bbdg.cS);
                bliw bliw0 = new bliw(((azxs)bmde0), s1, arr_b1, this.i(apiMetadata2));
                this.a.b(bliw0);
                break;
            }
            case 5: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.fido.credentialstore.internal.ILongValueCallbacks");
                    bmde0 = (iInterface3 instanceof bmdk) ? ((bmdk)iInterface3) : new bmdi(iBinder3);
                }
                String s2 = parcel0.readString();
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmcx.gr(parcel0);
                this.f(((bmdk)bmde0), s2, apiMetadata3);
                break;
            }
            case 6: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    bmde0 = (iInterface4 instanceof azxs) ? ((azxs)iInterface4) : new azxq(iBinder4);
                }
                String s3 = parcel0.readString();
                long v1 = parcel0.readLong();
                ApiMetadata apiMetadata4 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmcx.gr(parcel0);
                this.a(((azxs)bmde0), s3, v1, apiMetadata4);
                break;
            }
            case 7: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.fido.credentialstore.internal.IKeyDataListCallbacks");
                    bmde0 = (iInterface5 instanceof bmdh) ? ((bmdh)iInterface5) : new bmdf(iBinder5);
                }
                String s4 = parcel0.readString();
                ApiMetadata apiMetadata5 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmcx.gr(parcel0);
                this.g(((bmdh)bmde0), s4, apiMetadata5);
                break;
            }
            case 8: {
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.fido.credentialstore.internal.IGetPasskeysCallbacks");
                    bmde0 = (iInterface6 instanceof bmdb) ? ((bmdb)iInterface6) : new bmcz(iBinder6);
                }
                Account account0 = (Account)wbz.a(parcel0, Account.CREATOR);
                String s5 = parcel0.readString();
                byte[] arr_b2 = parcel0.createByteArray();
                ApiMetadata apiMetadata6 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmcx.gr(parcel0);
                this.e(((bmdb)bmde0), account0, s5, arr_b2, apiMetadata6);
                break;
            }
            case 9: {
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.fido.credentialstore.internal.IKeyDataCallbacks");
                    bmde0 = (iInterface7 instanceof bmde) ? ((bmde)iInterface7) : new bmdc(iBinder7);
                }
                byte[] arr_b3 = parcel0.createByteArray();
                ApiMetadata apiMetadata7 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmcx.gr(parcel0);
                ccmq.a().a(bbdg.cY);
                bljq bljq0 = new bljq(bmde0, arr_b3, new bljz(AppContextProvider.a()), this.i(apiMetadata7));
                this.a.b(bljq0);
                break;
            }
            case 10: {
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 != null) {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    bmde0 = (iInterface8 instanceof azxs) ? ((azxs)iInterface8) : new azxq(iBinder8);
                }
                byte[] arr_b4 = parcel0.createByteArray();
                ApiMetadata apiMetadata8 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmcx.gr(parcel0);
                ccmq.a().a(bbdg.cZ);
                new bljz(AppContextProvider.a());
                bliv bliv0 = new bliv(((azxs)bmde0), arr_b4, this.i(apiMetadata8));
                this.a.b(bliv0);
                break;
            }
            case 11: {
                IBinder iBinder9 = parcel0.readStrongBinder();
                if(iBinder9 != null) {
                    IInterface iInterface9 = iBinder9.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    bmde0 = (iInterface9 instanceof azxs) ? ((azxs)iInterface9) : new azxq(iBinder9);
                }
                Account account1 = (Account)wbz.a(parcel0, Account.CREATOR);
                String s6 = parcel0.readString();
                byte[] arr_b5 = parcel0.createByteArray();
                ApiMetadata apiMetadata9 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmcx.gr(parcel0);
                this.b(((azxs)bmde0), account1, s6, arr_b5, apiMetadata9);
                break;
            }
            case 12: {
                IBinder iBinder10 = parcel0.readStrongBinder();
                if(iBinder10 != null) {
                    IInterface iInterface10 = iBinder10.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    bmde0 = (iInterface10 instanceof azxs) ? ((azxs)iInterface10) : new azxq(iBinder10);
                }
                Account account2 = (Account)wbz.a(parcel0, Account.CREATOR);
                byte[] arr_b6 = parcel0.createByteArray();
                ApiMetadata apiMetadata10 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmcx.gr(parcel0);
                this.h(((azxs)bmde0), account2, arr_b6, apiMetadata10);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }

    @Override  // bmcy
    public final void g(bmdh bmdh0, String s, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.cV);
        azug azug0 = this.i(apiMetadata0);
        blkk blkk0 = new blkk(bmdh0, s, new ajes(AppContextProvider.a()), new bljz(AppContextProvider.a()), fofa.a(), azug0);
        this.a.b(blkk0);
    }

    @Override  // bmcy
    public final void h(azxs azxs0, Account account0, byte[] arr_b, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.cX);
        blkt blkt0 = new blkt(azxs0, account0, arr_b, this.i(apiMetadata0));
        this.a.b(blkt0);
    }

    private final azug i(ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.bv);
        azuf0.g(bbdq.aL);
        azuf0.d(this.b);
        azuf0.c(this.c);
        return azuf0.a();
    }
}

