import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class ahlc extends wby implements ahld, cjug {
    private final cjts a;
    private final String b;
    private final String c;

    public ahlc() {
        super("com.google.android.gms.auth.api.earlyupdate.internal.IEarlyUpdateService");
    }

    public ahlc(cjts cjts0, String s, String s1) {
        super("com.google.android.gms.auth.api.earlyupdate.internal.IEarlyUpdateService");
        this.a = cjts0;
        this.b = s;
        this.c = s1;
    }

    private final azug a(ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.E);
        azuf0.g(bbdq.j);
        azuf0.d(this.b);
        azuf0.c(this.c);
        return azuf0.a();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        ahla ahla0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.api.earlyupdate.internal.IEarlyUpdateCallbacks");
                    ahla0 = (iInterface0 instanceof ahla) ? ((ahla)iInterface0) : new ahla(iBinder0);
                }
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahlc.gr(parcel0);
                ahlk ahlk0 = new ahlk(ahla0, Binder.getCallingUid(), this.a(apiMetadata0));
                this.a.b(ahlk0);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.auth.api.earlyupdate.internal.IEarlyUpdateCallbacks");
                    ahla0 = (iInterface1 instanceof ahla) ? ((ahla)iInterface1) : new ahla(iBinder1);
                }
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahlc.gr(parcel0);
                ahll ahll0 = new ahll(ahla0, Binder.getCallingUid(), this.a(apiMetadata1));
                this.a.b(ahll0);
                break;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.auth.api.earlyupdate.internal.IEarlyUpdateCallbacks");
                    ahla0 = (iInterface2 instanceof ahla) ? ((ahla)iInterface2) : new ahla(iBinder2);
                }
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahlc.gr(parcel0);
                ApiMetadata apiMetadata3 = cckf.d(bbdp.E);
                ahla0.a(Status.d, false, apiMetadata3);
                break;
            }
            case 4: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.auth.api.earlyupdate.internal.IEarlyUpdateCallbacks");
                    ahla0 = (iInterface3 instanceof ahla) ? ((ahla)iInterface3) : new ahla(iBinder3);
                }
                ApiMetadata apiMetadata4 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahlc.gr(parcel0);
                ahlg ahlg0 = new ahlg(ahla0, this.a(apiMetadata4));
                this.a.b(ahlg0);
                break;
            }
            case 5: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    ahla0 = (iInterface4 instanceof azxs) ? ((azxs)iInterface4) : new azxq(iBinder4);
                }
                Bundle bundle0 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                ApiMetadata apiMetadata5 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahlc.gr(parcel0);
                ccmq.a().a(bbdg.pK);
                ahlk ahlk1 = new ahlk(((azxs)ahla0), Binder.getCallingUid(), bundle0, this.a(apiMetadata5));
                this.a.b(ahlk1);
                break;
            }
            case 6: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    ahla0 = (iInterface5 instanceof azxs) ? ((azxs)iInterface5) : new azxq(iBinder5);
                }
                Bundle bundle1 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                ApiMetadata apiMetadata6 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahlc.gr(parcel0);
                ccmq.a().a(bbdg.pL);
                ahll ahll1 = new ahll(((azxs)ahla0), Binder.getCallingUid(), this.a(apiMetadata6));
                this.a.b(ahll1);
                break;
            }
            case 7: {
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    ahla0 = (iInterface6 instanceof azxs) ? ((azxs)iInterface6) : new azxq(iBinder6);
                }
                Bundle bundle2 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                ApiMetadata apiMetadata7 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahlc.gr(parcel0);
                ccmq.a().a(bbdg.pM);
                ahlg ahlg1 = new ahlg(((azxs)ahla0), this.a(apiMetadata7));
                this.a.b(ahlg1);
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

