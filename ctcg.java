import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;

public final class ctcg extends wby implements cjug, ctch {
    public final csxk a;
    private final cjts b;
    private final String c;
    private final String d;

    public ctcg() {
        super("com.google.android.gms.multidevice.internal.IProfileService");
    }

    public ctcg(cjts cjts0, csxk csxk0, String s, String s1) {
        ibuq.f(csxk0, "settingsManager");
        ibuq.f(s, "callingPackage");
        super("com.google.android.gms.multidevice.internal.IProfileService");
        this.b = cjts0;
        this.a = csxk0;
        this.c = s;
        this.d = s1;
    }

    @Override  // ctch
    public final void a(ctbv ctbv0, ApiMetadata apiMetadata0) {
        ibuq.f(ctbv0, "callback");
        ccmq.a().a(bbdg.ql);
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.dq);
        azuf0.g(bbdq.x);
        azuf0.d(this.c);
        azuf0.c(this.d);
        azug azug0 = azuf0.a();
        cssg cssg0 = new cssg(this, ctbv0, null);
        cjul.a(this.b, 356, "GetAssociatedGaias", azug0, cssg0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        azxs azxs1;
        azxs azxs0;
        Object object1;
        Object object0;
        ctbv ctbv0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    object0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.multidevice.internal.IMultideviceSettingCallback");
                    object0 = (iInterface0 instanceof ctcd) ? ((ctcd)iInterface0) : new ctcd(iBinder0);
                }
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ctcg.gr(parcel0);
                ibuq.f(object0, "callback");
                ccmq.a().a(bbdg.qj);
                azuf azuf0 = azug.b(apiMetadata0);
                azuf0.f(azud.a);
                azuf0.e(bbdp.dq);
                azuf0.g(bbdq.x);
                azuf0.d(this.c);
                azuf0.c(this.d);
                azug azug0 = azuf0.a();
                cssi cssi0 = new cssi(((ctcd)object0), this, null);
                cjul.a(this.b, 356, "GetMultideviceSettingStatus", azug0, cssi0);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 == null) {
                    object1 = null;
                }
                else {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.multidevice.internal.IDeviceNameCallback");
                    object1 = (iInterface1 instanceof ctbw) ? ((ctbw)iInterface1) : new ctbw(iBinder1);
                }
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ctcg.gr(parcel0);
                ibuq.f(object1, "callback");
                ccmq.a().a(bbdg.qk);
                azuf azuf1 = azug.b(apiMetadata1);
                azuf1.f(azud.a);
                azuf1.e(bbdp.dq);
                azuf1.g(bbdq.x);
                azuf1.d(this.c);
                azuf1.c(this.d);
                azug azug1 = azuf1.a();
                cssh cssh0 = new cssh(((ctbw)object1), this, null);
                cjul.a(this.b, 356, "GetDeviceName", azug1, cssh0);
                break;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.multidevice.internal.IAssociatedGaiasCallback");
                    ctbv0 = (iInterface2 instanceof ctbv) ? ((ctbv)iInterface2) : new ctbt(iBinder2);
                }
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ctcg.gr(parcel0);
                this.a(ctbv0, apiMetadata2);
                break;
            }
            case 4: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 == null) {
                    azxs0 = null;
                }
                else {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    azxs0 = (iInterface3 instanceof azxs) ? ((azxs)iInterface3) : new azxq(iBinder3);
                }
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.multidevice.internal.IProfileListener");
                    ctbv0 = (iInterface4 instanceof ctce) ? ((ctce)iInterface4) : new ctce(iBinder4);
                }
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ctcg.gr(parcel0);
                ibuq.f(azxs0, "callback");
                ibuq.f(ctbv0, "profileListener");
                break;
            }
            case 5: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 == null) {
                    azxs1 = null;
                }
                else {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    azxs1 = (iInterface5 instanceof azxs) ? ((azxs)iInterface5) : new azxq(iBinder5);
                }
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.multidevice.internal.IProfileListener");
                    ctbv0 = (iInterface6 instanceof ctce) ? ((ctce)iInterface6) : new ctce(iBinder6);
                }
                ApiMetadata apiMetadata4 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ctcg.gr(parcel0);
                ibuq.f(azxs1, "callback");
                ibuq.f(ctbv0, "profileListener");
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

