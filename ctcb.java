import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.multidevice.XdFeatureListenerOptions;
import com.google.android.gms.multidevice.apis.featuresettingsapi.FeatureSettingsApiService;

public final class ctcb extends wby implements cjug, ctcc {
    public final csxk a;
    public final ctdo b;
    private final cjts c;
    private final cssd d;
    private final String e;
    private final String f;

    public ctcb() {
        super("com.google.android.gms.multidevice.internal.IFeatureSettingsService");
    }

    public ctcb(cjts cjts0, csxk csxk0, cssd cssd0, ctdo ctdo0, String s, String s1) {
        ibuq.f(csxk0, "settingsManager");
        ibuq.f(s, "callingPackage");
        super("com.google.android.gms.multidevice.internal.IFeatureSettingsService");
        this.c = cjts0;
        this.a = csxk0;
        this.d = cssd0;
        this.b = ctdo0;
        this.e = s;
        this.f = s1;
        ((ggtj)FeatureSettingsApiService.a.h()).x("Created API Stub.");
    }

    @Override  // ctcc
    public final void a(ctbz ctbz0, int v, ApiMetadata apiMetadata0) {
        ibuq.f(ctbz0, "callback");
        ccmq.a().a(bbdg.qf);
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.dq);
        azuf0.g(bbdq.x);
        azuf0.d(this.e);
        azuf0.c(this.f);
        azug azug0 = azuf0.a();
        csru csru0 = new csru(this, v, ctbz0, null);
        cjul.a(this.c, 355, "GetXdFeatureStatus", azug0, csru0);
    }

    @Override  // ctcc
    public final void b(azxs azxs0, ctck ctck0, XdFeatureListenerOptions xdFeatureListenerOptions0, ApiMetadata apiMetadata0) {
        ibuq.f(azxs0, "callback");
        ibuq.f(ctck0, "featureListener");
        ibuq.f(xdFeatureListenerOptions0, "options");
        ccmq.a().a(bbdg.qd);
        ((ggtj)FeatureSettingsApiService.a.h()).S("registerXdFeatureStatusListener(featureKeys: %s, enableImmediateCallback: %s)", xdFeatureListenerOptions0.a(), xdFeatureListenerOptions0.b());
        cssb cssb0 = new cssb(ctck0, xdFeatureListenerOptions0, this.c);
        cssd cssd0 = this.d;
        synchronized(cssd0.b) {
            cssd0.b.put(cssb0.d, cssb0);
        }
        if(cssb0.b.b()) {
            cssd0.a(cssb0, ((csyf)cssd0.a.g().b()).e);
        }
        azxs0.a(Status.b);
    }

    @Override  // ctcc
    public final void c(azxs azxs0, ctck ctck0, ApiMetadata apiMetadata0) {
        ibuq.f(azxs0, "callback");
        ibuq.f(ctck0, "featureListener");
        ccmq.a().a(bbdg.qe);
        ibuq.f(ctck0, "listener");
        synchronized(this.d.b) {
            Object object0 = this.d.b.remove(ctck0.asBinder());
        }
        if(object0 != null) {
            azxs0.a(Status.b);
            return;
        }
        azxs0.a(Status.d);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        azxs azxs1;
        azxs azxs0;
        ctbz ctbz0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.multidevice.internal.IFeatureSettingsCallback");
                    ctbz0 = (iInterface0 instanceof ctbz) ? ((ctbz)iInterface0) : new ctbx(iBinder0);
                }
                int v1 = parcel0.readInt();
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ctcb.gr(parcel0);
                this.a(ctbz0, v1, apiMetadata0);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    ctbz0 = (iInterface1 instanceof azxs) ? ((azxs)iInterface1) : new azxq(iBinder1);
                }
                int v2 = parcel0.readInt();
                boolean z = wbz.i(parcel0);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ctcb.gr(parcel0);
                ibuq.f(ctbz0, "callback");
                ccmq.a().a(bbdg.qg);
                azuf azuf0 = azug.b(apiMetadata1);
                azuf0.f(azud.a);
                azuf0.e(bbdp.dq);
                azuf0.g(bbdq.x);
                azuf0.d(this.e);
                azuf0.c(this.f);
                azug azug0 = azuf0.a();
                csrv csrv0 = new csrv(v2, z, this, ((azxs)ctbz0), null);
                cjul.a(this.c, 355, "SetXdFeatureState", azug0, csrv0);
                break;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 == null) {
                    azxs0 = null;
                }
                else {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    azxs0 = (iInterface2 instanceof azxs) ? ((azxs)iInterface2) : new azxq(iBinder2);
                }
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.multidevice.internal.IXdFeatureStatusListener");
                    ctbz0 = (iInterface3 instanceof ctck) ? ((ctck)iInterface3) : new ctci(iBinder3);
                }
                XdFeatureListenerOptions xdFeatureListenerOptions0 = (XdFeatureListenerOptions)wbz.a(parcel0, XdFeatureListenerOptions.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ctcb.gr(parcel0);
                this.b(azxs0, ((ctck)ctbz0), xdFeatureListenerOptions0, apiMetadata2);
                break;
            }
            case 4: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 == null) {
                    azxs1 = null;
                }
                else {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    azxs1 = (iInterface4 instanceof azxs) ? ((azxs)iInterface4) : new azxq(iBinder4);
                }
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.multidevice.internal.IXdFeatureStatusListener");
                    ctbz0 = (iInterface5 instanceof ctck) ? ((ctck)iInterface5) : new ctci(iBinder5);
                }
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ctcb.gr(parcel0);
                this.c(azxs1, ((ctck)ctbz0), apiMetadata3);
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

