import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.folsom.RecoveryRequest;
import com.google.android.gms.auth.folsom.SharedKey;
import com.google.android.gms.common.api.ApiMetadata;
import java.util.UUID;

public final class ajth extends wby implements ajti, cjug {
    private final cjts a;
    private final String b;
    private final boolean c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final int h;
    private final boolean i;
    private final String j;
    private final String k;

    public ajth() {
        super("com.google.android.gms.auth.folsom.internal.IKeyRetrievalService");
    }

    public ajth(cjts cjts0, String s, boolean z, String s1, String s2, String s3, String s4, int v, boolean z1, String s5, String s6) {
        super("com.google.android.gms.auth.folsom.internal.IKeyRetrievalService");
        this.a = cjts0;
        this.b = s;
        this.c = z;
        this.d = s1;
        this.e = s2;
        this.f = s3;
        if(s4 == null) {
            s4 = UUID.randomUUID().toString();
        }
        this.g = s4;
        this.h = v;
        this.i = z1;
        this.j = s5;
        this.k = s6;
    }

    @Override  // ajti
    public final void A(ajtc ajtc0, String s, int v, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.T);
        azuf0.g(bbdq.j);
        azuf0.d(this.j);
        azuf0.c(this.k);
        azug azug0 = azuf0.a();
        ajwo ajwo0 = new ajwo(ajtc0, this.b, s, v, this.d, this.e, this.f, this.g, azug0);
        this.a.b(ajwo0);
    }

    @Override  // ajti
    public final void a(azxs azxs0, String s, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.T);
        azuf0.g(bbdq.j);
        azuf0.d(this.j);
        azuf0.c(this.k);
        azug azug0 = azuf0.a();
        ajvo ajvo0 = new ajvo(azxs0, s, this.b, azug0);
        this.a.b(ajvo0);
    }

    @Override  // ajti
    public final void b(azxs azxs0, String s, String s1, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.T);
        azuf0.g(bbdq.j);
        azuf0.d(this.j);
        azuf0.c(this.k);
        azug azug0 = azuf0.a();
        ajvp ajvp0 = new ajvp(azxs0, this.b, s, s1, this.g, azug0);
        this.a.b(ajvp0);
    }

    @Override  // ajti
    public final void c(ajst ajst0, String s, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.T);
        azuf0.g(bbdq.j);
        azuf0.d(this.j);
        azuf0.c(this.k);
        ajvq ajvq0 = new ajvq(ajst0, s, azuf0.a());
        this.a.b(ajvq0);
    }

    @Override  // ajti
    public final void d(azxs azxs0, String s, byte[] arr_b, byte[] arr_b1, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.T);
        azuf0.g(bbdq.j);
        azuf0.d(this.j);
        azuf0.c(this.k);
        azug azug0 = azuf0.a();
        ajvr ajvr0 = new ajvr(azxs0, this.b, s, arr_b, arr_b1, this.g, azug0);
        this.a.b(ajvr0);
    }

    @Override  // ajti
    public final void e(azxs azxs0, String s, String s1, byte[] arr_b, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.T);
        azuf0.g(bbdq.j);
        azuf0.d(this.j);
        azuf0.c(this.k);
        azug azug0 = azuf0.a();
        ajvs ajvs0 = new ajvs(azxs0, this.b, s, s1, arr_b, this.g, azug0);
        this.a.b(ajvs0);
    }

    @Override  // ajti
    public final void f(ajsw ajsw0, RecoveryRequest recoveryRequest0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.T);
        azuf0.g(bbdq.j);
        azuf0.d(this.j);
        azuf0.c(this.k);
        azug azug0 = azuf0.a();
        ajvu ajvu0 = new ajvu(ajsw0, recoveryRequest0, this.g, azug0);
        this.a.b(ajvu0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        ajtf ajtf0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IKeyRetrievalConsentCallback");
                    ajtf0 = (iInterface0 instanceof ajtf) ? ((ajtf)iInterface0) : new ajtd(iBinder0);
                }
                String s = parcel0.readString();
                boolean z = wbz.i(parcel0);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajth.gr(parcel0);
                this.x(ajtf0, s, z, apiMetadata0);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IKeyRetrievalConsentCallback");
                    ajtf0 = (iInterface1 instanceof ajtf) ? ((ajtf)iInterface1) : new ajtd(iBinder1);
                }
                String s1 = parcel0.readString();
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajth.gr(parcel0);
                this.g(ajtf0, s1, apiMetadata1);
                break;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IKeyRetrievalSyncStatusCallback");
                    ajtf0 = (iInterface2 instanceof ajtl) ? ((ajtl)iInterface2) : new ajtj(iBinder2);
                }
                String s2 = parcel0.readString();
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajth.gr(parcel0);
                this.k(((ajtl)ajtf0), s2, apiMetadata2);
                break;
            }
            case 4: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IKeyRetrievalCallback");
                    ajtf0 = (iInterface3 instanceof ajtc) ? ((ajtc)iInterface3) : new ajta(iBinder3);
                }
                String s3 = parcel0.readString();
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajth.gr(parcel0);
                this.p(((ajtc)ajtf0), s3, apiMetadata3);
                break;
            }
            case 5: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.auth.folsom.internal.ISharedKeyCallback");
                    ajtf0 = (iInterface4 instanceof ajtx) ? ((ajtx)iInterface4) : new ajtv(iBinder4);
                }
                String s4 = parcel0.readString();
                ApiMetadata apiMetadata4 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajth.gr(parcel0);
                this.h(((ajtx)ajtf0), s4, apiMetadata4);
                break;
            }
            case 6: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IKeyRetrievalCallback");
                    ajtf0 = (iInterface5 instanceof ajtc) ? ((ajtc)iInterface5) : new ajta(iBinder5);
                }
                String s5 = parcel0.readString();
                SharedKey[] arr_sharedKey = (SharedKey[])parcel0.createTypedArray(SharedKey.CREATOR);
                ApiMetadata apiMetadata5 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajth.gr(parcel0);
                this.y(((ajtc)ajtf0), s5, arr_sharedKey, apiMetadata5);
                break;
            }
            case 7: {
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IStringListCallback");
                    ajtf0 = (iInterface6 instanceof ajua) ? ((ajua)iInterface6) : new ajty(iBinder6);
                }
                String s6 = parcel0.readString();
                ApiMetadata apiMetadata6 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajth.gr(parcel0);
                this.m(((ajua)ajtf0), s6, apiMetadata6);
                break;
            }
            case 8: {
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IRecoveryResultCallback");
                    ajtf0 = (iInterface7 instanceof ajtr) ? ((ajtr)iInterface7) : new ajtp(iBinder7);
                }
                RecoveryRequest recoveryRequest0 = (RecoveryRequest)wbz.a(parcel0, RecoveryRequest.CREATOR);
                ApiMetadata apiMetadata7 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajth.gr(parcel0);
                this.z(((ajtr)ajtf0), recoveryRequest0, apiMetadata7);
                break;
            }
            case 9: {
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 != null) {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IByteArrayListCallback");
                    ajtf0 = (iInterface8 instanceof ajsz) ? ((ajsz)iInterface8) : new ajsx(iBinder8);
                }
                String s7 = parcel0.readString();
                ApiMetadata apiMetadata8 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajth.gr(parcel0);
                this.o(((ajsz)ajtf0), s7, apiMetadata8);
                break;
            }
            case 10: {
                IBinder iBinder9 = parcel0.readStrongBinder();
                if(iBinder9 != null) {
                    IInterface iInterface9 = iBinder9.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IByteArrayCallback");
                    ajtf0 = (iInterface9 instanceof ajsw) ? ((ajsw)iInterface9) : new ajsu(iBinder9);
                }
                String s8 = parcel0.readString();
                ApiMetadata apiMetadata9 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajth.gr(parcel0);
                this.i(((ajsw)ajtf0), s8, apiMetadata9);
                break;
            }
            case 11: {
                IBinder iBinder10 = parcel0.readStrongBinder();
                if(iBinder10 != null) {
                    IInterface iInterface10 = iBinder10.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    ajtf0 = (iInterface10 instanceof azxs) ? ((azxs)iInterface10) : new azxq(iBinder10);
                }
                String s9 = parcel0.readString();
                byte[] arr_b = parcel0.createByteArray();
                int v1 = parcel0.readInt();
                ApiMetadata apiMetadata10 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajth.gr(parcel0);
                this.l(ajtf0, s9, arr_b, v1, apiMetadata10);
                break;
            }
            case 12: {
                IBinder iBinder11 = parcel0.readStrongBinder();
                if(iBinder11 != null) {
                    IInterface iInterface11 = iBinder11.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IKeyRetrievalCallback");
                    ajtf0 = (iInterface11 instanceof ajtc) ? ((ajtc)iInterface11) : new ajta(iBinder11);
                }
                String s10 = parcel0.readString();
                int v2 = parcel0.readInt();
                ApiMetadata apiMetadata11 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajth.gr(parcel0);
                this.A(((ajtc)ajtf0), s10, v2, apiMetadata11);
                break;
            }
            case 13: {
                IBinder iBinder12 = parcel0.readStrongBinder();
                if(iBinder12 != null) {
                    IInterface iInterface12 = iBinder12.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IKeyRetrievalCallback");
                    ajtf0 = (iInterface12 instanceof ajtc) ? ((ajtc)iInterface12) : new ajta(iBinder12);
                }
                String s11 = parcel0.readString();
                ApiMetadata apiMetadata12 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajth.gr(parcel0);
                this.q(((ajtc)ajtf0), s11, apiMetadata12);
                break;
            }
            case 14: {
                IBinder iBinder13 = parcel0.readStrongBinder();
                if(iBinder13 != null) {
                    IInterface iInterface13 = iBinder13.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    ajtf0 = (iInterface13 instanceof azxs) ? ((azxs)iInterface13) : new azxq(iBinder13);
                }
                String s12 = parcel0.readString();
                ApiMetadata apiMetadata13 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajth.gr(parcel0);
                this.v(((azxs)ajtf0), s12, apiMetadata13);
                break;
            }
            case 15: {
                IBinder iBinder14 = parcel0.readStrongBinder();
                if(iBinder14 != null) {
                    IInterface iInterface14 = iBinder14.queryLocalInterface("com.google.android.gms.auth.folsom.internal.ISecurityDomainMembersCallback");
                    ajtf0 = (iInterface14 instanceof ajtu) ? ((ajtu)iInterface14) : new ajts(iBinder14);
                }
                String s13 = parcel0.readString();
                ApiMetadata apiMetadata14 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajth.gr(parcel0);
                this.n(((ajtu)ajtf0), s13, apiMetadata14);
                break;
            }
            case 16: {
                IBinder iBinder15 = parcel0.readStrongBinder();
                if(iBinder15 != null) {
                    IInterface iInterface15 = iBinder15.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IByteArrayCallback");
                    ajtf0 = (iInterface15 instanceof ajsw) ? ((ajsw)iInterface15) : new ajsu(iBinder15);
                }
                RecoveryRequest recoveryRequest1 = (RecoveryRequest)wbz.a(parcel0, RecoveryRequest.CREATOR);
                ApiMetadata apiMetadata15 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajth.gr(parcel0);
                this.f(((ajsw)ajtf0), recoveryRequest1, apiMetadata15);
                break;
            }
            case 17: {
                IBinder iBinder16 = parcel0.readStrongBinder();
                if(iBinder16 != null) {
                    IInterface iInterface16 = iBinder16.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IBooleanCallback");
                    ajtf0 = (iInterface16 instanceof ajst) ? ((ajst)iInterface16) : new ajsr(iBinder16);
                }
                String s14 = parcel0.readString();
                ApiMetadata apiMetadata16 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajth.gr(parcel0);
                this.c(((ajst)ajtf0), s14, apiMetadata16);
                break;
            }
            case 18: {
                IBinder iBinder17 = parcel0.readStrongBinder();
                if(iBinder17 != null) {
                    IInterface iInterface17 = iBinder17.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    ajtf0 = (iInterface17 instanceof azxs) ? ((azxs)iInterface17) : new azxq(iBinder17);
                }
                String s15 = parcel0.readString();
                ApiMetadata apiMetadata17 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajth.gr(parcel0);
                this.a(((azxs)ajtf0), s15, apiMetadata17);
                break;
            }
            case 19: {
                IBinder iBinder18 = parcel0.readStrongBinder();
                if(iBinder18 != null) {
                    IInterface iInterface18 = iBinder18.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IByteArrayCallback");
                    ajtf0 = (iInterface18 instanceof ajsw) ? ((ajsw)iInterface18) : new ajsu(iBinder18);
                }
                String s16 = parcel0.readString();
                ApiMetadata apiMetadata18 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajth.gr(parcel0);
                azuf azuf0 = azug.b(apiMetadata18);
                azuf0.f(azud.a);
                azuf0.e(bbdp.T);
                azuf0.g(bbdq.j);
                azuf0.d(this.j);
                azuf0.c(this.k);
                azug azug0 = azuf0.a();
                ajvw ajvw0 = new ajvw(ajtf0, this.b, s16, this.g, azug0);
                this.a.b(ajvw0);
                break;
            }
            case 20: {
                IBinder iBinder19 = parcel0.readStrongBinder();
                if(iBinder19 != null) {
                    IInterface iInterface19 = iBinder19.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IProductKeyCallback");
                    ajtf0 = (iInterface19 instanceof ajto) ? ((ajto)iInterface19) : new ajtm(iBinder19);
                }
                String s17 = parcel0.readString();
                String s18 = parcel0.readString();
                ApiMetadata apiMetadata19 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajth.gr(parcel0);
                this.j(((ajto)ajtf0), s17, s18, apiMetadata19);
                break;
            }
            case 21: {
                IBinder iBinder20 = parcel0.readStrongBinder();
                if(iBinder20 != null) {
                    IInterface iInterface20 = iBinder20.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    ajtf0 = (iInterface20 instanceof azxs) ? ((azxs)iInterface20) : new azxq(iBinder20);
                }
                String s19 = parcel0.readString();
                byte[] arr_b1 = parcel0.createByteArray();
                byte[] arr_b2 = parcel0.createByteArray();
                ApiMetadata apiMetadata20 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajth.gr(parcel0);
                this.d(ajtf0, s19, arr_b1, arr_b2, apiMetadata20);
                break;
            }
            case 22: {
                IBinder iBinder21 = parcel0.readStrongBinder();
                if(iBinder21 != null) {
                    IInterface iInterface21 = iBinder21.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    ajtf0 = (iInterface21 instanceof azxs) ? ((azxs)iInterface21) : new azxq(iBinder21);
                }
                String s20 = parcel0.readString();
                String s21 = parcel0.readString();
                ApiMetadata apiMetadata21 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajth.gr(parcel0);
                this.b(((azxs)ajtf0), s20, s21, apiMetadata21);
                break;
            }
            case 23: {
                IBinder iBinder22 = parcel0.readStrongBinder();
                if(iBinder22 != null) {
                    IInterface iInterface22 = iBinder22.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    ajtf0 = (iInterface22 instanceof azxs) ? ((azxs)iInterface22) : new azxq(iBinder22);
                }
                String s22 = parcel0.readString();
                String s23 = parcel0.readString();
                byte[] arr_b3 = parcel0.createByteArray();
                ApiMetadata apiMetadata22 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajth.gr(parcel0);
                this.e(ajtf0, s22, s23, arr_b3, apiMetadata22);
                break;
            }
            case 24: {
                IBinder iBinder23 = parcel0.readStrongBinder();
                if(iBinder23 != null) {
                    IInterface iInterface23 = iBinder23.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    ajtf0 = (iInterface23 instanceof azxs) ? ((azxs)iInterface23) : new azxq(iBinder23);
                }
                String s24 = parcel0.readString();
                byte[] arr_b4 = parcel0.createByteArray();
                byte[] arr_b5 = parcel0.createByteArray();
                ApiMetadata apiMetadata23 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajth.gr(parcel0);
                this.w(ajtf0, s24, arr_b4, arr_b5, apiMetadata23);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }

    @Override  // ajti
    public final void g(ajtf ajtf0, String s, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.T);
        azuf0.g(bbdq.j);
        azuf0.d(this.j);
        azuf0.c(this.k);
        azug azug0 = azuf0.a();
        ajvv ajvv0 = new ajvv(ajtf0, this.b, s, this.g, azug0);
        this.a.b(ajvv0);
    }

    @Override  // ajti
    public final void h(ajtx ajtx0, String s, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.T);
        azuf0.g(bbdq.j);
        azuf0.d(this.j);
        azuf0.c(this.k);
        azug azug0 = azuf0.a();
        ajvx ajvx0 = new ajvx(ajtx0, this.b, s, this.c, this.g, this.i, azug0);
        this.a.b(ajvx0);
    }

    @Override  // ajti
    public final void i(ajsw ajsw0, String s, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.T);
        azuf0.g(bbdq.j);
        azuf0.d(this.j);
        azuf0.c(this.k);
        azug azug0 = azuf0.a();
        ajvy ajvy0 = new ajvy(ajsw0, this.b, s, azug0);
        this.a.b(ajvy0);
    }

    @Override  // ajti
    public final void j(ajto ajto0, String s, String s1, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.T);
        azuf0.g(bbdq.j);
        azuf0.d(this.j);
        azuf0.c(this.k);
        azug azug0 = azuf0.a();
        ajvz ajvz0 = new ajvz(ajto0, this.b, s, s1, this.g, azug0);
        this.a.b(ajvz0);
    }

    @Override  // ajti
    public final void k(ajtl ajtl0, String s, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.T);
        azuf0.g(bbdq.j);
        azuf0.d(this.j);
        azuf0.c(this.k);
        azug azug0 = azuf0.a();
        ajwb ajwb0 = new ajwb(ajtl0, this.b, s, this.g, azug0);
        this.a.b(ajwb0);
    }

    @Override  // ajti
    public final void l(azxs azxs0, String s, byte[] arr_b, int v, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.T);
        azuf0.g(bbdq.j);
        azuf0.d(this.j);
        azuf0.c(this.k);
        azug azug0 = azuf0.a();
        ajwc ajwc0 = new ajwc(azxs0, this.b, s, arr_b, v, this.g, this.h, azug0);
        this.a.b(ajwc0);
    }

    @Override  // ajti
    public final void m(ajua ajua0, String s, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.T);
        azuf0.g(bbdq.j);
        azuf0.d(this.j);
        azuf0.c(this.k);
        azug azug0 = azuf0.a();
        ajwa ajwa0 = new ajwa(ajua0, this.b, s, azug0);
        this.a.b(ajwa0);
    }

    @Override  // ajti
    public final void n(ajtu ajtu0, String s, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.T);
        azuf0.g(bbdq.j);
        azuf0.d(this.j);
        azuf0.c(this.k);
        azug azug0 = azuf0.a();
        ajwe ajwe0 = new ajwe(ajtu0, this.b, s, this.g, azug0);
        this.a.b(ajwe0);
    }

    @Override  // ajti
    public final void o(ajsz ajsz0, String s, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.T);
        azuf0.g(bbdq.j);
        azuf0.d(this.j);
        azuf0.c(this.k);
        azug azug0 = azuf0.a();
        ajwg ajwg0 = new ajwg(ajsz0, s, this.g, azug0);
        this.a.b(ajwg0);
    }

    @Override  // ajti
    public final void p(ajtc ajtc0, String s, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.T);
        azuf0.g(bbdq.j);
        azuf0.d(this.j);
        azuf0.c(this.k);
        azug azug0 = azuf0.a();
        ajwh ajwh0 = new ajwh(ajtc0, this.b, s, this.g, azug0);
        this.a.b(ajwh0);
    }

    @Override  // ajti
    public final void q(ajtc ajtc0, String s, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.T);
        azuf0.g(bbdq.j);
        azuf0.d(this.j);
        azuf0.c(this.k);
        azug azug0 = azuf0.a();
        ajwi ajwi0 = new ajwi(ajtc0, this.b, s, this.g, azug0);
        this.a.b(ajwi0);
    }

    @Override  // ajti
    public final void v(azxs azxs0, String s, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.T);
        azuf0.g(bbdq.j);
        azuf0.d(this.j);
        azuf0.c(this.k);
        azug azug0 = azuf0.a();
        ajwj ajwj0 = new ajwj(azxs0, this.b, s, this.g, azug0);
        this.a.b(ajwj0);
    }

    @Override  // ajti
    public final void w(azxs azxs0, String s, byte[] arr_b, byte[] arr_b1, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.T);
        azuf0.g(bbdq.j);
        azuf0.d(this.j);
        azuf0.c(this.k);
        azug azug0 = azuf0.a();
        ajwk ajwk0 = new ajwk(azxs0, this.b, s, arr_b, arr_b1, this.g, azug0);
        this.a.b(ajwk0);
    }

    @Override  // ajti
    public final void x(ajtf ajtf0, String s, boolean z, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.T);
        azuf0.g(bbdq.j);
        azuf0.d(this.j);
        azuf0.c(this.k);
        azug azug0 = azuf0.a();
        ajwl ajwl0 = new ajwl(ajtf0, this.b, s, z, this.g, this.i, azug0);
        this.a.b(ajwl0);
    }

    @Override  // ajti
    public final void y(ajtc ajtc0, String s, SharedKey[] arr_sharedKey, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.T);
        azuf0.g(bbdq.j);
        azuf0.d(this.j);
        azuf0.c(this.k);
        azug azug0 = azuf0.a();
        ajwm ajwm0 = new ajwm(ajtc0, this.b, s, arr_sharedKey, this.c, this.g, this.h, azug0);
        this.a.b(ajwm0);
    }

    @Override  // ajti
    public final void z(ajtr ajtr0, RecoveryRequest recoveryRequest0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.T);
        azuf0.g(bbdq.j);
        azuf0.d(this.j);
        azuf0.c(this.k);
        azug azug0 = azuf0.a();
        ajwn ajwn0 = new ajwn(ajtr0, recoveryRequest0, this.g, azug0);
        this.a.b(ajwn0);
    }
}

