import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

public final class eqvy extends wby implements cjug, eqvz {
    private final equm a;
    private final String b;
    private final String c;
    private final equm d;
    private final cjts e;

    public eqvy() {
        super("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupService");
    }

    public eqvy(cjvl cjvl0, Context context0, boolean z, String s, String s1) {
        super("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupService");
        this.b = s;
        this.c = s1;
        this.e = new cjts(context0, cjvl0, new bblp(1, 10));
        eqlr eqlr0 = new eqlr(context0);
        eqlr0.b(s, z);
        this.a = new equm(context0, 200, eqlr0);
        this.d = new equm(context0, 100, eqlr0);
    }

    @Override  // eqvz
    public final void a(eqvw eqvw0, String s, String s1, Bundle bundle0, ApiMetadata apiMetadata0) {
        azug azug0 = this.c(apiMetadata0, false);
        equq equq0 = new equq(eqvw0, this.d, s, s1, bundle0, azug0);
        this.e.b(equq0);
    }

    private final azug c(ApiMetadata apiMetadata0, boolean z) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.eP);
        azuf0.g(bbdq.aT);
        azuf0.d(this.b);
        azuf0.c(this.c);
        azuf0.h(z);
        return azuf0.a();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        eqvw eqvw0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
                    eqvw0 = (iInterface0 instanceof eqvw) ? ((eqvw)iInterface0) : new eqvu(iBinder0);
                }
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eqvy.gr(parcel0);
                azug azug0 = this.c(apiMetadata0, true);
                equn equn0 = new equn(eqvw0, this.d, azug0);
                this.e.b(equn0);
                return true;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
                    eqvw0 = (iInterface1 instanceof eqvw) ? ((eqvw)iInterface1) : new eqvu(iBinder1);
                }
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eqvy.gr(parcel0);
                azug azug1 = this.c(apiMetadata1, true);
                equt equt0 = new equt(eqvw0, this.d, azug1);
                this.e.b(equt0);
                return true;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
                    eqvw0 = (iInterface2 instanceof eqvw) ? ((eqvw)iInterface2) : new eqvu(iBinder2);
                }
                HandshakeData handshakeData0 = (HandshakeData)wbz.a(parcel0, HandshakeData.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eqvy.gr(parcel0);
                azug azug2 = this.c(apiMetadata2, true);
                equs equs0 = new equs(eqvw0, this.d, handshakeData0, azug2);
                this.e.b(equs0);
                return true;
            }
            case 4: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
                    eqvw0 = (iInterface3 instanceof eqvw) ? ((eqvw)iInterface3) : new eqvu(iBinder3);
                }
                HandshakeData handshakeData1 = (HandshakeData)wbz.a(parcel0, HandshakeData.CREATOR);
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eqvy.gr(parcel0);
                azug azug3 = this.c(apiMetadata3, true);
                equr equr0 = new equr(eqvw0, this.d, handshakeData1, azug3);
                this.e.b(equr0);
                return true;
            }
            case 5: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
                    eqvw0 = (iInterface4 instanceof eqvw) ? ((eqvw)iInterface4) : new eqvu(iBinder4);
                }
                HandshakeData handshakeData2 = (HandshakeData)wbz.a(parcel0, HandshakeData.CREATOR);
                ApiMetadata apiMetadata4 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eqvy.gr(parcel0);
                azug azug4 = this.c(apiMetadata4, true);
                equp equp0 = new equp(eqvw0, handshakeData2, this.a, azug4);
                this.e.b(equp0);
                return true;
            }
            case 6: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
                    eqvw0 = (iInterface5 instanceof eqvw) ? ((eqvw)iInterface5) : new eqvu(iBinder5);
                }
                HandshakeData handshakeData3 = (HandshakeData)wbz.a(parcel0, HandshakeData.CREATOR);
                ApiMetadata apiMetadata5 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eqvy.gr(parcel0);
                azug azug5 = this.c(apiMetadata5, true);
                equo equo0 = new equo(eqvw0, this.a, handshakeData3, azug5);
                this.e.b(equo0);
                return true;
            }
            case 7: {
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
                    eqvw0 = (iInterface6 instanceof eqvw) ? ((eqvw)iInterface6) : new eqvu(iBinder6);
                }
                ApiMetadata apiMetadata6 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eqvy.gr(parcel0);
                azug azug6 = this.c(apiMetadata6, true);
                eqvp eqvp0 = new eqvp(eqvw0, this.d, azug6);
                this.e.b(eqvp0);
                return true;
            }
            case 8: {
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
                    eqvw0 = (iInterface7 instanceof eqvw) ? ((eqvw)iInterface7) : new eqvu(iBinder7);
                }
                ApiMetadata apiMetadata7 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eqvy.gr(parcel0);
                azug azug7 = this.c(apiMetadata7, true);
                eqvs eqvs0 = new eqvs(eqvw0, this.d, azug7);
                this.e.b(eqvs0);
                return true;
            }
            case 9: {
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 != null) {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
                    eqvw0 = (iInterface8 instanceof eqvw) ? ((eqvw)iInterface8) : new eqvu(iBinder8);
                }
                String s = parcel0.readString();
                String s1 = parcel0.readString();
                Bundle bundle0 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                ApiMetadata apiMetadata8 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eqvy.gr(parcel0);
                this.a(eqvw0, s, s1, bundle0, apiMetadata8);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

