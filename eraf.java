import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.quickstart.AccountTransferOptions;
import com.google.android.gms.smartdevice.quickstart.TargetQuickStartChimeraService;
import com.google.android.gms.smartdevice.quickstart.TargetQuickStartOptions;
import com.google.android.gms.smartdevice.quickstart.WifiConnectionResult;
import com.google.android.gms.smartdevice.quickstart.WifiTransferOptions;
import com.google.android.gms.smartdevice.quickstart.api.TargetQuickStartApiService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class eraf extends wby implements cjug, erag {
    public eqwx a;
    public eqzx b;
    private final Context c;
    private final cjts d;
    private final eqwu e;
    private final eray f;
    private azox g;
    private eqxa h;
    private final String i;
    private final String j;
    private int k;

    public eraf() {
        super("com.google.android.gms.smartdevice.quickstart.internal.ITargetQuickStartApiService");
    }

    public eraf(Context context0, cjts cjts0, String s, String s1) {
        super("com.google.android.gms.smartdevice.quickstart.internal.ITargetQuickStartApiService");
        this.k = 1;
        this.i = s;
        this.j = s1;
        this.c = context0;
        this.d = cjts0;
        this.f = eray.i(context0);
        this.e = new eqzz(this);
    }

    @Override  // erag
    public final void a(azxs azxs0, eqwx eqwx0, ApiMetadata apiMetadata0) {
        baun baun0 = TargetQuickStartApiService.a;
        baun0.d("Handle registerCallbacks()", new Object[0]);
        if(eqwx0 != null) {
            this.a = eqwx0;
            azxs0.a(Status.b);
            return;
        }
        baun0.m("registerCallbacks() called with null!", new Object[0]);
        azxs0.a(new Status(10));
    }

    @Override  // erag
    public final void b(erad erad0, AccountTransferOptions accountTransferOptions0, ApiMetadata apiMetadata0) {
        baun baun0 = TargetQuickStartApiService.a;
        baun0.d("Handle requestAccountTransfer()", new Object[0]);
        if(this.h == null) {
            erad0.a(new Status(10901), null);
            return;
        }
        if(this.b != null) {
            baun0.m("Cannot call requestAccountTransfer() while another operation is running!", new Object[0]);
            erad0.a(new Status(10), null);
            return;
        }
        eqxa eqxa0 = this.h;
        batl.s(eqxa0);
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.eP);
        azuf0.g(bbdq.aT);
        azuf0.d(this.i);
        azuf0.c(this.j);
        azug azug0 = azuf0.a();
        eqzw eqzw0 = new eqzw(accountTransferOptions0, this, eqxa0, erad0, this.f, azug0);
        this.b = eqzw0;
        this.d.b(eqzw0);
    }

    @Override  // erag
    public final void c(erad erad0, TargetQuickStartOptions targetQuickStartOptions0, int v, ApiMetadata apiMetadata0) {
        baun baun0 = TargetQuickStartApiService.a;
        baun0.d("Handle start()", new Object[0]);
        if(this.a == null) {
            baun0.f("Missing client callbacks! Call registerCallbacks() first!", new Object[0]);
            erad0.b(new Status(10), null);
            return;
        }
        if(this.b == null) {
            if(targetQuickStartOptions0.d == -1L) {
                baun0.m("Cannot call start() with no session ID!", new Object[0]);
                erad0.b(new Status(10), null);
                return;
            }
            if(this.h == null) {
                eqxa eqxa0 = this.g();
                this.h = eqxa0;
                if(eqxa0 == null) {
                    erad0.b(new Status(10553), null);
                    return;
                }
            }
            this.k = v;
            eqwx eqwx0 = this.a;
            batl.s(eqwx0);
            eqxa eqxa1 = this.h;
            batl.s(eqxa1);
            azuf azuf0 = azug.b(apiMetadata0);
            azuf0.f(azud.a);
            azuf0.e(bbdp.eP);
            azuf0.g(bbdq.aT);
            azuf0.d(this.i);
            azuf0.c(this.j);
            azug azug0 = azuf0.a();
            eqzy eqzy0 = new eqzy(this, targetQuickStartOptions0, v, erad0, eqwx0, eqxa1, this.e, azug0);
            this.b = eqzy0;
            this.d.b(eqzy0);
            return;
        }
        baun0.m("Cannot call start() while another operation is running!", new Object[0]);
        erad0.b(new Status(10), null);
    }

    @Override  // erag
    public final void d(azxs azxs0, ApiMetadata apiMetadata0) {
        TargetQuickStartApiService.a.d("Handle stop()", new Object[0]);
        azxs0.a((this.f() ? Status.b : new Status(10901)));
    }

    public final void e(eqzx eqzx0, Status status0) {
        baun baun0 = TargetQuickStartApiService.a;
        baun0.d("Operation %s finished with status %s", new Object[]{eqzx0.p(), status0.b()});
        if(this.b != eqzx0) {
            baun0.m("Finished operation was not same as the pending one!", new Object[0]);
            return;
        }
        this.b = null;
    }

    public final boolean f() {
        Context context0;
        eqzx eqzx0 = this.b;
        if(eqzx0 != null) {
            eqzx0.b();
        }
        this.a = null;
        eqxa eqxa0 = this.h;
        if(eqxa0 == null && this.g == null) {
            return false;
        }
        if(eqxa0 == null) {
        label_39:
            if(this.g != null) {
                context0 = this.c;
                bbic bbic2 = bbic.a();
                azox azox2 = this.g;
                batl.s(azox2);
                bbic2.c(context0, azox2);
                this.g = null;
                if(this.k == 3) {
                    TargetQuickStartApiService.a.d("Keep internal service alive for CosmicRay", new Object[0]);
                    return true;
                }
                TargetQuickStartChimeraService.g(context0);
            }
        }
        else {
            try {
                try {
                    if(this.k != 3) {
                        eqxa0.j();
                        this.h = null;
                    }
                    goto label_39;
                }
                catch(RemoteException remoteException0) {
                }
                TargetQuickStartApiService.a.g("Failed to call stopAdvertising(): ", remoteException0, new Object[0]);
                if(this.g != null) {
                    goto label_15;
                }
                return true;
            }
            catch(Throwable throwable0) {
                goto label_27;
            }
        label_15:
            context0 = this.c;
            bbic bbic0 = bbic.a();
            azox azox0 = this.g;
            batl.s(azox0);
            bbic0.c(context0, azox0);
            this.g = null;
            if(this.k == 3) {
                TargetQuickStartApiService.a.d("Keep internal service alive for CosmicRay", new Object[0]);
                return true;
            }
            TargetQuickStartChimeraService.g(context0);
            return true;
        label_27:
            if(this.g != null) {
                Context context1 = this.c;
                bbic bbic1 = bbic.a();
                azox azox1 = this.g;
                batl.s(azox1);
                bbic1.c(context1, azox1);
                this.g = null;
                if(this.k == 3) {
                    TargetQuickStartApiService.a.d("Keep internal service alive for CosmicRay", new Object[0]);
                }
                else {
                    TargetQuickStartChimeraService.g(context1);
                }
            }
            throw throwable0;
        }
        return true;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        erad erad1;
        azxs azxs0;
        erad erad0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    azxs0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    azxs0 = (iInterface0 instanceof azxs) ? ((azxs)iInterface0) : new azxq(iBinder0);
                }
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.smartdevice.quickstart.ITargetQuickStartClientCallbacks");
                    erad0 = (iInterface1 instanceof eqwx) ? ((eqwx)iInterface1) : new eqwv(iBinder1);
                }
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eraf.gr(parcel0);
                this.a(azxs0, ((eqwx)erad0), apiMetadata0);
                break;
            }
            case 2: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.smartdevice.quickstart.internal.ITargetQuickStartApiCallbacks");
                    erad0 = (iInterface2 instanceof erad) ? ((erad)iInterface2) : new erab(iBinder2);
                }
                TargetQuickStartOptions targetQuickStartOptions0 = (TargetQuickStartOptions)wbz.a(parcel0, TargetQuickStartOptions.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eraf.gr(parcel0);
                this.c(erad0, targetQuickStartOptions0, 1, apiMetadata1);
                break;
            }
            case 3: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    erad0 = (iInterface3 instanceof azxs) ? ((azxs)iInterface3) : new azxq(iBinder3);
                }
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eraf.gr(parcel0);
                this.d(((azxs)erad0), apiMetadata2);
                break;
            }
            case 4: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 == null) {
                    erad1 = null;
                }
                else {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.smartdevice.quickstart.internal.ITargetQuickStartApiCallbacks");
                    erad erad2 = (iInterface4 instanceof erad) ? ((erad)iInterface4) : new erab(iBinder4);
                    erad1 = erad2;
                }
                WifiTransferOptions wifiTransferOptions0 = (WifiTransferOptions)wbz.a(parcel0, WifiTransferOptions.CREATOR);
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eraf.gr(parcel0);
                baun baun0 = TargetQuickStartApiService.a;
                baun0.d("Handle requestWifiTransfer()", new Object[0]);
                if(this.h == null) {
                    erad1.c(new Status(10901), null);
                }
                else if(this.b == null) {
                    eqxa eqxa0 = this.h;
                    batl.s(eqxa0);
                    azuf azuf0 = azug.b(apiMetadata3);
                    azuf0.f(azud.a);
                    azuf0.e(bbdp.eP);
                    azuf0.g(bbdq.aT);
                    azuf0.d(this.i);
                    azuf0.c(this.j);
                    eraa eraa0 = new eraa(wifiTransferOptions0, this, eqxa0, erad1, azuf0.a());
                    this.b = eraa0;
                    this.d.b(eraa0);
                }
                else {
                    baun0.m("Cannot call requestWifiTransfer() while another operation is running!", new Object[0]);
                    erad1.c(new Status(10), null);
                }
                break;
            }
            case 5: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.smartdevice.quickstart.internal.ITargetQuickStartApiCallbacks");
                    erad0 = (iInterface5 instanceof erad) ? ((erad)iInterface5) : new erab(iBinder5);
                }
                AccountTransferOptions accountTransferOptions0 = (AccountTransferOptions)wbz.a(parcel0, AccountTransferOptions.CREATOR);
                ApiMetadata apiMetadata4 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eraf.gr(parcel0);
                this.b(erad0, accountTransferOptions0, apiMetadata4);
                break;
            }
            case 6: {
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    erad0 = (iInterface6 instanceof azxs) ? ((azxs)iInterface6) : new azxq(iBinder6);
                }
                WifiConnectionResult wifiConnectionResult0 = (WifiConnectionResult)wbz.a(parcel0, WifiConnectionResult.CREATOR);
                ApiMetadata apiMetadata5 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eraf.gr(parcel0);
                baun baun1 = TargetQuickStartApiService.a;
                baun1.d("Handle informWifiConnectionResult()", new Object[0]);
                eqxa eqxa1 = this.h;
                if(eqxa1 == null) {
                    ((azxs)erad0).a(new Status(10901));
                }
                else if(this.b == null) {
                    eqxa1.b(wifiConnectionResult0);
                }
                else {
                    baun1.m("Cannot call informWifiConnectionResult() while another operation is running!", new Object[0]);
                    ((azxs)erad0).a(new Status(10));
                }
                break;
            }
            case 7: {
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.smartdevice.quickstart.internal.ITargetQuickStartApiCallbacks");
                    erad0 = (iInterface7 instanceof erad) ? ((erad)iInterface7) : new erab(iBinder7);
                }
                TargetQuickStartOptions targetQuickStartOptions1 = (TargetQuickStartOptions)wbz.a(parcel0, TargetQuickStartOptions.CREATOR);
                int v1 = parcel0.readInt();
                ApiMetadata apiMetadata6 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eraf.gr(parcel0);
                this.c(erad0, targetQuickStartOptions1, v1, apiMetadata6);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }

    private final eqxa g() {
        azox azox0 = new azox();
        this.g = azox0;
        try {
            bbic bbic0 = bbic.a();
            Intent intent0 = new Intent().setClassName(this.c, "com.google.android.gms.smartdevice.quickstart.TargetQuickStartService");
            bbic0.d(this.c, intent0, azox0, 1);
            IBinder iBinder0 = azox0.b(5000L, TimeUnit.MILLISECONDS);
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.smartdevice.quickstart.ITargetQuickStartService");
            eqxa eqxa0 = (iInterface0 instanceof eqxa) ? ((eqxa)iInterface0) : new eqwy(iBinder0);
            if(eqxa0 == null) {
                TargetQuickStartApiService.a.f("Failed to bind to internal TargetQuickStartChimeraService: null binder", new Object[0]);
            }
            return eqxa0;
        }
        catch(InterruptedException | TimeoutException exception0) {
            TargetQuickStartApiService.a.g("Failed to bind to internal TargetQuickStartChimeraService: ", exception0, new Object[0]);
            bbic.a().c(this.c, azox0);
            return null;
        }
    }
}

