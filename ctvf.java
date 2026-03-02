import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.multidevice.sync.QuickAccessDevice;
import com.google.android.gms.multidevice.sync.access.QuickAccessApiService;
import java.util.LinkedHashMap;
import java.util.Map;

public final class ctvf extends wby implements IInterface, cjug {
    public final ctpd a;
    public final Map b;
    final QuickAccessApiService c;
    private iced d;

    public ctvf() {
        super("com.google.android.gms.multidevice.sync.internal.IQuickAccessService");
    }

    public ctvf(QuickAccessApiService quickAccessApiService0, ctpd ctpd0) {
        ibuq.f(ctpd0, "rpcClientManager");
        this.c = quickAccessApiService0;
        super("com.google.android.gms.multidevice.sync.internal.IQuickAccessService");
        this.a = ctpd0;
        this.b = new LinkedHashMap();
    }

    private final cubq a(QuickAccessDevice quickAccessDevice0) {
        ykf ykf0 = (ykf)this.b.get(quickAccessDevice0.a);
        return ykf0 == null ? null : new cubq(ykf0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        basa basa3;
        Object object5;
        basa basa2;
        Object object4;
        basa basa1;
        Object object3;
        basa basa0;
        Object object2;
        Object object1;
        Object object0;
        azxs azxs0;
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
                if(iBinder1 == null) {
                    object0 = null;
                }
                else {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.multidevice.sync.internal.IQuickAccessDiscoveryCallbacks");
                    object0 = (iInterface1 instanceof ctva) ? ((ctva)iInterface1) : new ctva(iBinder1);
                }
                ctvf.gr(parcel0);
                ibuq.f(azxs0, "statusCallback");
                ibuq.f(object0, "callback");
                if(this.d == null) {
                    icck icck0 = this.c.d;
                    if(icck0 == null) {
                        ibuq.j("coroutineScope");
                        icck0 = null;
                    }
                    this.d = icbb.b(icck0, null, null, new ctgu(this, ((ctva)object0), null), 3);
                    this.a.c("QuickAccessService");
                    azxs0.a(Status.b);
                }
                else {
                    azxs0.a(Status.d);
                }
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 == null) {
                    object1 = null;
                }
                else {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    object1 = (iInterface2 instanceof azxs) ? ((azxs)iInterface2) : new azxq(iBinder2);
                }
                ctvf.gr(parcel0);
                ibuq.f(object1, "statusCallback");
                iced iced0 = this.d;
                if(iced0 != null) {
                    iceb.a(iced0);
                }
                this.d = null;
                ((azxs)object1).a(Status.b);
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                QuickAccessDevice quickAccessDevice0 = (QuickAccessDevice)wbz.a(parcel0, QuickAccessDevice.CREATOR);
                String s = parcel0.readString();
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 == null) {
                    object2 = null;
                }
                else {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.multidevice.sync.internal.IQuickAccessGetDocumentCallbacks");
                    object2 = (iInterface3 instanceof ctvc) ? ((ctvc)iInterface3) : new ctvc(iBinder3);
                }
                ctvf.gr(parcel0);
                ibuq.f(quickAccessDevice0, "device");
                ibuq.f(s, "documentId");
                ibuq.f(object2, "callback");
                cubq cubq0 = this.a(quickAccessDevice0);
                if(cubq0 == null) {
                    ((ctvc)object2).a(null, ApiMetadata.b);
                    basa0 = QuickAccessApiService.a;
                }
                else {
                    QuickAccessApiService quickAccessApiService0 = this.c;
                    icck icck1 = quickAccessApiService0.d;
                    if(icck1 == null) {
                        ibuq.j("coroutineScope");
                        icck1 = null;
                    }
                    basa0 = new ctgw(icbb.b(icck1, null, null, new ctgn(quickAccessApiService0, quickAccessDevice0, s, cubq0, ((ctvc)object2), null), 3));
                }
                parcel1.writeNoException();
                wbz.h(parcel1, basa0);
                return true;
            }
            case 6: {
                QuickAccessDevice quickAccessDevice1 = (QuickAccessDevice)wbz.a(parcel0, QuickAccessDevice.CREATOR);
                String s1 = parcel0.readString();
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 == null) {
                    object3 = null;
                }
                else {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.multidevice.sync.internal.IQuickAccessGetChildDocumentsCallbacks");
                    object3 = (iInterface4 instanceof ctvb) ? ((ctvb)iInterface4) : new ctvb(iBinder4);
                }
                ctvf.gr(parcel0);
                ibuq.f(quickAccessDevice1, "device");
                ibuq.f(s1, "documentId");
                ibuq.f(object3, "callback");
                cubq cubq1 = this.a(quickAccessDevice1);
                if(cubq1 == null) {
                    ((ctvb)object3).a(ibps.a, ApiMetadata.b);
                    basa1 = QuickAccessApiService.a;
                }
                else {
                    QuickAccessApiService quickAccessApiService1 = this.c;
                    icck icck2 = quickAccessApiService1.d;
                    if(icck2 == null) {
                        ibuq.j("coroutineScope");
                        icck2 = null;
                    }
                    basa1 = new ctgw(icbb.b(icck2, null, null, new ctgm(quickAccessApiService1, quickAccessDevice1, s1, cubq1, ((ctvb)object3), null), 3));
                }
                parcel1.writeNoException();
                wbz.h(parcel1, basa1);
                return true;
            }
            case 7: {
                QuickAccessDevice quickAccessDevice2 = (QuickAccessDevice)wbz.a(parcel0, QuickAccessDevice.CREATOR);
                String s2 = parcel0.readString();
                int v1 = parcel0.readInt();
                int v2 = parcel0.readInt();
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 == null) {
                    object4 = null;
                }
                else {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.multidevice.sync.internal.IQuickAccessGetThumbnailCallbacks");
                    object4 = (iInterface5 instanceof ctvd) ? ((ctvd)iInterface5) : new ctvd(iBinder5);
                }
                ctvf.gr(parcel0);
                ibuq.f(quickAccessDevice2, "device");
                ibuq.f(s2, "documentId");
                ibuq.f(object4, "callback");
                cubq cubq2 = this.a(quickAccessDevice2);
                if(cubq2 == null) {
                    ((ctvd)object4).a(null, ApiMetadata.b);
                    basa2 = QuickAccessApiService.a;
                }
                else {
                    QuickAccessApiService quickAccessApiService2 = this.c;
                    icck icck3 = quickAccessApiService2.d;
                    if(icck3 == null) {
                        ibuq.j("coroutineScope");
                        icck3 = null;
                    }
                    basa2 = new ctgw(icbb.b(icck3, null, null, new ctgo(quickAccessApiService2, quickAccessDevice2, s2, cubq2, ((ctvd)object4), v1, v2, null), 3));
                }
                parcel1.writeNoException();
                wbz.h(parcel1, basa2);
                return true;
            }
            case 8: {
                QuickAccessDevice quickAccessDevice3 = (QuickAccessDevice)wbz.a(parcel0, QuickAccessDevice.CREATOR);
                String s3 = parcel0.readString();
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 == null) {
                    object5 = null;
                }
                else {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.multidevice.sync.internal.IQuickAccessOpenDocumentCallbacks");
                    object5 = (iInterface6 instanceof ctve) ? ((ctve)iInterface6) : new ctve(iBinder6);
                }
                ctvf.gr(parcel0);
                ibuq.f(quickAccessDevice3, "device");
                ibuq.f(s3, "documentId");
                ibuq.f(object5, "callback");
                cubq cubq3 = this.a(quickAccessDevice3);
                if(cubq3 == null) {
                    ((ctve)object5).a(null, ApiMetadata.b);
                    basa3 = QuickAccessApiService.a;
                }
                else {
                    QuickAccessApiService quickAccessApiService3 = this.c;
                    icck icck4 = quickAccessApiService3.d;
                    if(icck4 == null) {
                        ibuq.j("coroutineScope");
                        icck4 = null;
                    }
                    basa3 = new ctgw(icbb.b(icck4, null, null, new ctgs(cubq3, quickAccessApiService3, quickAccessDevice3, s3, ((ctve)object5), null), 3));
                }
                parcel1.writeNoException();
                wbz.h(parcel1, basa3);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

