import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.ClientPublicKey;
import com.google.android.gms.auth.cryptauth.Payload;
import com.google.android.gms.common.api.ApiMetadata;
import java.util.ArrayList;
import java.util.List;

public final class ajgw extends wby implements ajgx, cjug {
    private final cjts a;
    private final String b;
    private final String c;

    public ajgw() {
        super("com.google.android.gms.auth.cryptauth.internal.ICryptauthService");
    }

    public ajgw(cjts cjts0, String s, String s1) {
        super("com.google.android.gms.auth.cryptauth.internal.ICryptauthService");
        this.b = s;
        this.c = s1;
        this.a = cjts0;
    }

    @Override  // ajgx
    public final void a(ajhp ajhp0, String s, Account account0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.R);
        azuf0.g(bbdq.L);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ajjq ajjq0 = new ajjq(ajhp0, s, account0, azuf0.a());
        this.a.b(ajjq0);
    }

    @Override  // ajgx
    public final void b(ajhs ajhs0, byte[] arr_b, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.R);
        azuf0.g(bbdq.L);
        azuf0.d(this.b);
        azuf0.c(this.c);
        azug azug0 = azuf0.a();
        ajjs ajjs0 = new ajjs(ajhs0, arr_b, fofa.a(), azug0);
        this.a.b(ajjs0);
    }

    @Override  // ajgx
    public final void c(ajhd ajhd0, byte[] arr_b, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.R);
        azuf0.g(bbdq.L);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ajjt ajjt0 = new ajjt(ajhd0, arr_b, azuf0.a());
        this.a.b(ajjt0);
    }

    @Override  // ajgx
    public final void d(ajhd ajhd0, String s, Account account0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.R);
        azuf0.g(bbdq.L);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ajju ajju0 = new ajju(ajhd0, s, account0, azuf0.a());
        this.a.b(ajju0);
    }

    @Override  // ajgx
    public final void e(ajhg ajhg0, Account account0, String s, String s1, byte[] arr_b, byte[] arr_b1, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.R);
        azuf0.g(bbdq.L);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ajjv ajjv0 = new ajjv(ajhg0, account0, s, s1, arr_b, arr_b1, azuf0.a());
        this.a.b(ajjv0);
    }

    @Override  // ajgx
    public final void f(ajhj ajhj0, Account account0, String s, String s1, byte[] arr_b, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.R);
        azuf0.g(bbdq.L);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ajjw ajjw0 = new ajjw(ajhj0, account0, s, s1, arr_b, azuf0.a());
        this.a.b(ajjw0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        ajhy ajhy0 = null;
        switch(v) {
            case 2: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IKeyRegistrationResultCallback");
                    ajhy0 = (iInterface0 instanceof ajhy) ? ((ajhy)iInterface0) : new ajhw(iBinder0);
                }
                int v1 = parcel0.readInt();
                ArrayList arrayList0 = parcel0.createStringArrayList();
                String s = parcel0.readString();
                Account account0 = (Account)wbz.a(parcel0, Account.CREATOR);
                ArrayList arrayList1 = wbz.b(parcel0);
                byte[] arr_b = parcel0.createByteArray();
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajgw.gr(parcel0);
                this.j(ajhy0, v1, arrayList0, s, account0, arrayList1, arr_b, apiMetadata0);
                break;
            }
            case 3: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IKeyRegistrationResultCallback");
                    ajhy0 = (iInterface1 instanceof ajhy) ? ((ajhy)iInterface1) : new ajhw(iBinder1);
                }
                int v2 = parcel0.readInt();
                String s1 = parcel0.readString();
                Account account1 = (Account)wbz.a(parcel0, Account.CREATOR);
                byte[] arr_b1 = parcel0.createByteArray();
                byte[] arr_b2 = parcel0.createByteArray();
                byte[] arr_b3 = parcel0.createByteArray();
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajgw.gr(parcel0);
                this.k(ajhy0, v2, s1, account1, arr_b1, arr_b2, arr_b3, apiMetadata1);
                break;
            }
            case 4: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.ISignedResultCallback");
                    ajhy0 = (iInterface2 instanceof ajik) ? ((ajik)iInterface2) : new ajii(iBinder2);
                }
                String s2 = parcel0.readString();
                Account account2 = (Account)wbz.a(parcel0, Account.CREATOR);
                Payload payload0 = (Payload)wbz.a(parcel0, Payload.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajgw.gr(parcel0);
                this.w(((ajik)ajhy0), s2, account2, payload0, apiMetadata2);
                break;
            }
            case 5: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.ISignCryptResultCallback");
                    ajhy0 = (iInterface3 instanceof ajih) ? ((ajih)iInterface3) : new ajif(iBinder3);
                }
                String s3 = parcel0.readString();
                String s4 = parcel0.readString();
                Account account3 = (Account)wbz.a(parcel0, Account.CREATOR);
                Payload payload1 = (Payload)wbz.a(parcel0, Payload.CREATOR);
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajgw.gr(parcel0);
                this.v(((ajih)ajhy0), s3, s4, account3, payload1, apiMetadata3);
                break;
            }
            case 6: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IVerifyDecryptCallback");
                    ajhy0 = (iInterface4 instanceof ajin) ? ((ajin)iInterface4) : new ajil(iBinder4);
                }
                parcel0.readString();
                String s5 = parcel0.readString();
                Account account4 = (Account)wbz.a(parcel0, Account.CREATOR);
                Payload payload2 = (Payload)wbz.a(parcel0, Payload.CREATOR);
                ApiMetadata apiMetadata4 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajgw.gr(parcel0);
                azuf azuf0 = azug.b(apiMetadata4);
                azuf0.f(azud.a);
                azuf0.e(bbdp.R);
                azuf0.g(bbdq.L);
                azuf0.d(this.b);
                azuf0.c(this.c);
                ajkm ajkm0 = new ajkm(ajhy0, s5, account4, payload2, azuf0.a());
                this.a.b(ajkm0);
                break;
            }
            case 7: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IVerifyDecryptCallback");
                    ajhy0 = (iInterface5 instanceof ajin) ? ((ajin)iInterface5) : new ajil(iBinder5);
                }
                String s6 = parcel0.readString();
                byte[] arr_b4 = parcel0.createByteArray();
                Payload payload3 = (Payload)wbz.a(parcel0, Payload.CREATOR);
                ApiMetadata apiMetadata5 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajgw.gr(parcel0);
                this.y(((ajin)ajhy0), s6, arr_b4, payload3, apiMetadata5);
                break;
            }
            case 8: {
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IExportedSymmetricKeyCallback");
                    ajhy0 = (iInterface6 instanceof ajha) ? ((ajha)iInterface6) : new ajgy(iBinder6);
                }
                String s7 = parcel0.readString();
                Account account5 = (Account)wbz.a(parcel0, Account.CREATOR);
                ApiMetadata apiMetadata6 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajgw.gr(parcel0);
                this.o(((ajha)ajhy0), s7, account5, apiMetadata6);
                break;
            }
            case 9: {
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IRetrievePublicKeyCallback");
                    ajhy0 = (iInterface7 instanceof ajie) ? ((ajie)iInterface7) : new ajic(iBinder7);
                }
                String s8 = parcel0.readString();
                Account account6 = (Account)wbz.a(parcel0, Account.CREATOR);
                ApiMetadata apiMetadata7 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajgw.gr(parcel0);
                this.p(((ajie)ajhy0), s8, account6, apiMetadata7);
                break;
            }
            case 10: {
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 != null) {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IExportedSymmetricKeyCallback");
                    ajhy0 = (iInterface8 instanceof ajha) ? ((ajha)iInterface8) : new ajgy(iBinder8);
                }
                String s9 = parcel0.readString();
                Account account7 = (Account)wbz.a(parcel0, Account.CREATOR);
                ClientPublicKey clientPublicKey0 = (ClientPublicKey)wbz.a(parcel0, ClientPublicKey.CREATOR);
                ApiMetadata apiMetadata8 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajgw.gr(parcel0);
                this.i(((ajha)ajhy0), s9, account7, clientPublicKey0, apiMetadata8);
                break;
            }
            case 11: {
                IBinder iBinder9 = parcel0.readStrongBinder();
                if(iBinder9 != null) {
                    IInterface iInterface9 = iBinder9.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IKeyInvalidationResultCallback");
                    ajhy0 = (iInterface9 instanceof ajhv) ? ((ajhv)iInterface9) : new ajht(iBinder9);
                }
                int v3 = parcel0.readInt();
                String s10 = parcel0.readString();
                Account account8 = (Account)wbz.a(parcel0, Account.CREATOR);
                ArrayList arrayList2 = wbz.b(parcel0);
                ApiMetadata apiMetadata9 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajgw.gr(parcel0);
                this.h(((ajhv)ajhy0), v3, s10, account8, arrayList2, apiMetadata9);
                break;
            }
            case 12: {
                IBinder iBinder10 = parcel0.readStrongBinder();
                if(iBinder10 != null) {
                    IInterface iInterface10 = iBinder10.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.ISignedResultCallback");
                    ajhy0 = (iInterface10 instanceof ajik) ? ((ajik)iInterface10) : new ajii(iBinder10);
                }
                byte[] arr_b5 = parcel0.createByteArray();
                String s11 = parcel0.readString();
                byte[] arr_b6 = parcel0.createByteArray();
                ApiMetadata apiMetadata10 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajgw.gr(parcel0);
                this.x(((ajik)ajhy0), arr_b5, s11, arr_b6, apiMetadata10);
                break;
            }
            case 13: {
                IBinder iBinder11 = parcel0.readStrongBinder();
                if(iBinder11 != null) {
                    IInterface iInterface11 = iBinder11.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IHmacResultCallback");
                    ajhy0 = (iInterface11 instanceof ajhj) ? ((ajhj)iInterface11) : new ajhh(iBinder11);
                }
                Account account9 = (Account)wbz.a(parcel0, Account.CREATOR);
                String s12 = parcel0.readString();
                String s13 = parcel0.readString();
                byte[] arr_b7 = parcel0.createByteArray();
                ApiMetadata apiMetadata11 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajgw.gr(parcel0);
                this.f(((ajhj)ajhy0), account9, s12, s13, arr_b7, apiMetadata11);
                break;
            }
            case 14: {
                IBinder iBinder12 = parcel0.readStrongBinder();
                if(iBinder12 != null) {
                    IInterface iInterface12 = iBinder12.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IHkdfResultCallback");
                    ajhy0 = (iInterface12 instanceof ajhg) ? ((ajhg)iInterface12) : new ajhe(iBinder12);
                }
                Account account10 = (Account)wbz.a(parcel0, Account.CREATOR);
                String s14 = parcel0.readString();
                String s15 = parcel0.readString();
                byte[] arr_b8 = parcel0.createByteArray();
                byte[] arr_b9 = parcel0.createByteArray();
                ApiMetadata apiMetadata12 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajgw.gr(parcel0);
                this.e(((ajhg)ajhy0), account10, s14, s15, arr_b8, arr_b9, apiMetadata12);
                break;
            }
            case 15: {
                IBinder iBinder13 = parcel0.readStrongBinder();
                if(iBinder13 != null) {
                    IInterface iInterface13 = iBinder13.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IIncrementAndGetCounterCallback");
                    ajhy0 = (iInterface13 instanceof ajhm) ? ((ajhm)iInterface13) : new ajhk(iBinder13);
                }
                byte[] arr_b10 = parcel0.createByteArray();
                ApiMetadata apiMetadata13 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajgw.gr(parcel0);
                this.g(((ajhm)ajhy0), arr_b10, apiMetadata13);
                break;
            }
            case 16: {
                IBinder iBinder14 = parcel0.readStrongBinder();
                if(iBinder14 != null) {
                    IInterface iInterface14 = iBinder14.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    ajhy0 = (iInterface14 instanceof azxs) ? ((azxs)iInterface14) : new azxq(iBinder14);
                }
                String s16 = parcel0.readString();
                Account account11 = (Account)wbz.a(parcel0, Account.CREATOR);
                int v4 = parcel0.readInt();
                byte[] arr_b11 = parcel0.createByteArray();
                ArrayList arrayList3 = parcel0.createStringArrayList();
                ApiMetadata apiMetadata14 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajgw.gr(parcel0);
                this.l(((azxs)ajhy0), s16, account11, v4, arr_b11, arrayList3, apiMetadata14);
                break;
            }
            case 17: {
                IBinder iBinder15 = parcel0.readStrongBinder();
                if(iBinder15 != null) {
                    IInterface iInterface15 = iBinder15.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IRetrieveDeviceSyncMetadataCallback");
                    ajhy0 = (iInterface15 instanceof ajib) ? ((ajib)iInterface15) : new ajhz(iBinder15);
                }
                String s17 = parcel0.readString();
                Account account12 = (Account)wbz.a(parcel0, Account.CREATOR);
                ApiMetadata apiMetadata15 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajgw.gr(parcel0);
                this.m(((ajib)ajhy0), s17, account12, apiMetadata15);
                break;
            }
            case 18: {
                IBinder iBinder16 = parcel0.readStrongBinder();
                if(iBinder16 != null) {
                    IInterface iInterface16 = iBinder16.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IRetrieveDeviceSyncMetadataCallback");
                    ajhy0 = (iInterface16 instanceof ajib) ? ((ajib)iInterface16) : new ajhz(iBinder16);
                }
                String s18 = parcel0.readString();
                ApiMetadata apiMetadata16 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajgw.gr(parcel0);
                this.n(((ajib)ajhy0), s18, apiMetadata16);
                break;
            }
            case 19: {
                IBinder iBinder17 = parcel0.readStrongBinder();
                if(iBinder17 != null) {
                    IInterface iInterface17 = iBinder17.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IHaveKeyCallback");
                    ajhy0 = (iInterface17 instanceof ajhd) ? ((ajhd)iInterface17) : new ajhb(iBinder17);
                }
                String s19 = parcel0.readString();
                Account account13 = (Account)wbz.a(parcel0, Account.CREATOR);
                ApiMetadata apiMetadata17 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajgw.gr(parcel0);
                this.d(((ajhd)ajhy0), s19, account13, apiMetadata17);
                break;
            }
            case 20: {
                IBinder iBinder18 = parcel0.readStrongBinder();
                if(iBinder18 != null) {
                    IInterface iInterface18 = iBinder18.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    ajhy0 = (iInterface18 instanceof azxs) ? ((azxs)iInterface18) : new azxq(iBinder18);
                }
                String s20 = parcel0.readString();
                Account account14 = (Account)wbz.a(parcel0, Account.CREATOR);
                int v5 = parcel0.readInt();
                ArrayList arrayList4 = wbz.b(parcel0);
                ApiMetadata apiMetadata18 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajgw.gr(parcel0);
                this.q(((azxs)ajhy0), s20, account14, v5, arrayList4, apiMetadata18);
                break;
            }
            case 21: {
                IBinder iBinder19 = parcel0.readStrongBinder();
                if(iBinder19 != null) {
                    IInterface iInterface19 = iBinder19.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IHaveKeyCallback");
                    ajhy0 = (iInterface19 instanceof ajhd) ? ((ajhd)iInterface19) : new ajhb(iBinder19);
                }
                byte[] arr_b12 = parcel0.createByteArray();
                ApiMetadata apiMetadata19 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajgw.gr(parcel0);
                this.c(((ajhd)ajhy0), arr_b12, apiMetadata19);
                break;
            }
            case 22: {
                IBinder iBinder20 = parcel0.readStrongBinder();
                if(iBinder20 != null) {
                    IInterface iInterface20 = iBinder20.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IKeyHandleResultCallback");
                    ajhy0 = (iInterface20 instanceof ajhp) ? ((ajhp)iInterface20) : new ajhn(iBinder20);
                }
                String s21 = parcel0.readString();
                Account account15 = (Account)wbz.a(parcel0, Account.CREATOR);
                ApiMetadata apiMetadata20 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajgw.gr(parcel0);
                this.a(((ajhp)ajhy0), s21, account15, apiMetadata20);
                break;
            }
            case 23: {
                IBinder iBinder21 = parcel0.readStrongBinder();
                if(iBinder21 != null) {
                    IInterface iInterface21 = iBinder21.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IKeyInfoResultCallback");
                    ajhy0 = (iInterface21 instanceof ajhs) ? ((ajhs)iInterface21) : new ajhq(iBinder21);
                }
                byte[] arr_b13 = parcel0.createByteArray();
                ApiMetadata apiMetadata21 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajgw.gr(parcel0);
                this.b(((ajhs)ajhy0), arr_b13, apiMetadata21);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }

    @Override  // ajgx
    public final void g(ajhm ajhm0, byte[] arr_b, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.R);
        azuf0.g(bbdq.L);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ajjx ajjx0 = new ajjx(ajhm0, arr_b, azuf0.a());
        this.a.b(ajjx0);
    }

    @Override  // ajgx
    public final void h(ajhv ajhv0, int v, String s, Account account0, List list0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.R);
        azuf0.g(bbdq.L);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ajjy ajjy0 = new ajjy(ajhv0, v, s, account0, list0, azuf0.a());
        this.a.b(ajjy0);
    }

    @Override  // ajgx
    public final void i(ajha ajha0, String s, Account account0, ClientPublicKey clientPublicKey0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.R);
        azuf0.g(bbdq.L);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ajjz ajjz0 = new ajjz(ajha0, s, account0, clientPublicKey0, azuf0.a());
        this.a.b(ajjz0);
    }

    @Override  // ajgx
    public final void j(ajhy ajhy0, int v, List list0, String s, Account account0, List list1, byte[] arr_b, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.nd);
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.R);
        azuf0.g(bbdq.L);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ajkb ajkb0 = new ajkb(ajhy0, v, list0, s, account0, list1, arr_b, azuf0.a());
        this.a.b(ajkb0);
    }

    @Override  // ajgx
    public final void k(ajhy ajhy0, int v, String s, Account account0, byte[] arr_b, byte[] arr_b1, byte[] arr_b2, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.R);
        azuf0.g(bbdq.L);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ajka ajka0 = new ajka(ajhy0, v, s, s, account0, arr_b, arr_b1, arr_b2, azuf0.a());
        this.a.b(ajka0);
    }

    @Override  // ajgx
    public final void l(azxs azxs0, String s, Account account0, int v, byte[] arr_b, List list0, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.ne);
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.R);
        azuf0.g(bbdq.L);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ajkc ajkc0 = new ajkc(azxs0, s, account0, v, arr_b, list0, azuf0.a());
        this.a.b(ajkc0);
    }

    @Override  // ajgx
    public final void m(ajib ajib0, String s, Account account0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.R);
        azuf0.g(bbdq.L);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ajke ajke0 = new ajke(ajib0, s, account0, azuf0.a());
        this.a.b(ajke0);
    }

    @Override  // ajgx
    public final void n(ajib ajib0, String s, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.R);
        azuf0.g(bbdq.L);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ajkd ajkd0 = new ajkd(ajib0, s, azuf0.a());
        this.a.b(ajkd0);
    }

    @Override  // ajgx
    public final void o(ajha ajha0, String s, Account account0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.R);
        azuf0.g(bbdq.L);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ajkf ajkf0 = new ajkf(ajha0, s, account0, azuf0.a());
        this.a.b(ajkf0);
    }

    @Override  // ajgx
    public final void p(ajie ajie0, String s, Account account0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.R);
        azuf0.g(bbdq.L);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ajkg ajkg0 = new ajkg(ajie0, s, account0, azuf0.a());
        this.a.b(ajkg0);
    }

    @Override  // ajgx
    public final void q(azxs azxs0, String s, Account account0, int v, List list0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.R);
        azuf0.g(bbdq.L);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ajkh ajkh0 = new ajkh(azxs0, s, account0, v, list0, azuf0.a());
        this.a.b(ajkh0);
    }

    @Override  // ajgx
    public final void v(ajih ajih0, String s, String s1, Account account0, Payload payload0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.R);
        azuf0.g(bbdq.L);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ajki ajki0 = new ajki(ajih0, s, s1, account0, payload0, azuf0.a());
        this.a.b(ajki0);
    }

    @Override  // ajgx
    public final void w(ajik ajik0, String s, Account account0, Payload payload0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.R);
        azuf0.g(bbdq.L);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ajkk ajkk0 = new ajkk(ajik0, s, account0, payload0, azuf0.a());
        this.a.b(ajkk0);
    }

    @Override  // ajgx
    public final void x(ajik ajik0, byte[] arr_b, String s, byte[] arr_b1, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.R);
        azuf0.g(bbdq.L);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ajkj ajkj0 = new ajkj(ajik0, arr_b, s, arr_b1, azuf0.a());
        this.a.b(ajkj0);
    }

    @Override  // ajgx
    public final void y(ajin ajin0, String s, byte[] arr_b, Payload payload0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.R);
        azuf0.g(bbdq.L);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ajkl ajkl0 = new ajkl(ajin0, s, arr_b, payload0, azuf0.a());
        this.a.b(ajkl0);
    }
}

