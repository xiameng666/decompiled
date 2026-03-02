import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.blindauth.services.BlindauthApiService;
import com.google.android.gms.chimera.modules.blindauth.AppContextProvider;

public final class ifvu extends wby implements IInterface {
    final BlindauthApiService a;

    public ifvu() {
        super("org.chromium.components.ip_protection_auth.common.IIpProtectionAuthService");
    }

    public ifvu(BlindauthApiService blindauthApiService0) {
        this.a = blindauthApiService0;
        super("org.chromium.components.ip_protection_auth.common.IIpProtectionAuthService");
    }

    public static void a(ifvt ifvt0, int v) {
        try {
            Parcel parcel0 = ifvt0.jo();
            parcel0.writeInt(v);
            ifvt0.jq(2, parcel0);
        }
        catch(RemoteException remoteException0) {
            ((ggtj)((ggtj)((ggtj)BlindauthApiService.a.j()).s(remoteException0)).t(ggti.d)).x("Failed to report error via reportError()");
        }
    }

    public static void c(ifvv ifvv0, int v) {
        try {
            Parcel parcel0 = ifvv0.jo();
            parcel0.writeInt(v);
            ifvv0.jq(2, parcel0);
        }
        catch(RemoteException remoteException0) {
            ((ggtj)((ggtj)((ggtj)BlindauthApiService.a.j()).s(remoteException0)).t(ggti.d)).x("Failed to report error via reportError()");
        }
    }

    public static void d(ifvw ifvw0, int v) {
        try {
            Parcel parcel0 = ifvw0.jo();
            parcel0.writeInt(v);
            ifvw0.jq(2, parcel0);
        }
        catch(RemoteException remoteException0) {
            ((ggtj)((ggtj)((ggtj)BlindauthApiService.a.j()).s(remoteException0)).t(ggti.d)).x("Failed to report error via reportError()");
        }
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        hfkp hfkp0;
        Object object2;
        hfkr hfkr0;
        Object object1;
        hfkn hfkn0;
        Object object0;
        if(v != 1) {
            switch(v) {
                case 2: {
                    byte[] arr_b = parcel0.createByteArray();
                    IBinder iBinder0 = parcel0.readStrongBinder();
                    if(iBinder0 == null) {
                        object0 = null;
                    }
                    else {
                        IInterface iInterface0 = iBinder0.queryLocalInterface("org.chromium.components.ip_protection_auth.common.IIpProtectionAuthAndSignCallback");
                        object0 = (iInterface0 instanceof ifvt) ? ((ifvt)iInterface0) : new ifvt(iBinder0);
                    }
                    ifvu.gr(parcel0);
                    ibuq.f(arr_b, "requestBytes");
                    ibuq.f(object0, "callback");
                    this.a.e.a(bbdg.xb);
                    try {
                        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hfkn.a), arr_b, 0, arr_b.length, hftc.a);
                        ProtoLiteMessage.P_makeImmutable(hftv0);
                        hfkn0 = (hfkn)hftv0;
                        ibuq.c(hfkn0);
                    }
                    catch(hfur hfur0) {
                        throw new IllegalArgumentException("Failed to parse AuthAndSignRequest", hfur0);
                    }
                    String[] arr_s = AppContextProvider.a().getPackageManager().getPackagesForUid(Binder.getCallingUid());
                    if(arr_s != null) {
                        String s = (String)ibpg.D(arr_s);
                        BlindauthApiService blindauthApiService0 = this.a;
                        Context context0 = AppContextProvider.a();
                        ibuq.e(context0, "getApplicationContext(...)");
                        ibuq.c(s);
                        if(BlindauthApiService.c(context0, s)) {
                            atpu atpu0 = new atpu(blindauthApiService0, hfkn0, this, ((ifvt)object0), s, null);
                            icbb.b(blindauthApiService0.c, null, null, atpu0, 3);
                            parcel1.writeNoException();
                            return true;
                        }
                        ((ggtj)BlindauthApiService.a.j()).x("Calling app does not have internet permission");
                        throw new SecurityException("Calling app does not have internet permission");
                    }
                    ((ggtj)BlindauthApiService.a.j()).x("Calling package name cannot be retrieved for IP Protection Auth");
                    throw new SecurityException("Calling package name cannot be retrieved for IP Protection Auth");
                }
                case 3: {
                    byte[] arr_b1 = parcel0.createByteArray();
                    IBinder iBinder1 = parcel0.readStrongBinder();
                    if(iBinder1 == null) {
                        object1 = null;
                    }
                    else {
                        IInterface iInterface1 = iBinder1.queryLocalInterface("org.chromium.components.ip_protection_auth.common.IIpProtectionGetProxyConfigCallback");
                        object1 = (iInterface1 instanceof ifvw) ? ((ifvw)iInterface1) : new ifvw(iBinder1);
                    }
                    ifvu.gr(parcel0);
                    ibuq.f(arr_b1, "requestBytes");
                    ibuq.f(object1, "callback");
                    if(!hqnj.a.c().d()) {
                        throw new UnsupportedOperationException("GetProxyConfig is not enabled");
                    }
                    this.a.e.a(bbdg.xc);
                    try {
                        ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hfkr.a), arr_b1, 0, arr_b1.length, hftc.a);
                        ProtoLiteMessage.P_makeImmutable(hftv1);
                        hfkr0 = (hfkr)hftv1;
                        ibuq.c(hfkr0);
                    }
                    catch(hfur hfur1) {
                        throw new IllegalArgumentException("Failed to parse GetProxyConfigRequest", hfur1);
                    }
                    String[] arr_s1 = AppContextProvider.a().getPackageManager().getPackagesForUid(Binder.getCallingUid());
                    if(arr_s1 != null) {
                        String s1 = (String)ibpg.D(arr_s1);
                        BlindauthApiService blindauthApiService1 = this.a;
                        Context context1 = AppContextProvider.a();
                        ibuq.e(context1, "getApplicationContext(...)");
                        ibuq.c(s1);
                        if(BlindauthApiService.c(context1, s1)) {
                            atpw atpw0 = new atpw(blindauthApiService1, hfkr0, this, ((ifvw)object1), null);
                            icbb.b(blindauthApiService1.c, null, null, atpw0, 3);
                            parcel1.writeNoException();
                            return true;
                        }
                        ((ggtj)BlindauthApiService.a.j()).x("Calling app does not have internet permission");
                        throw new SecurityException("Calling app does not have internet permission");
                    }
                    ((ggtj)BlindauthApiService.a.j()).x("Calling package name cannot be retrieved for IP Protection GetProxyConfig");
                    throw new SecurityException("Calling package name cannot be retrieved for IP Protection GetProxyConfig");
                }
                default: {
                    return false;
                }
            }
        }
        byte[] arr_b2 = parcel0.createByteArray();
        IBinder iBinder2 = parcel0.readStrongBinder();
        if(iBinder2 == null) {
            object2 = null;
        }
        else {
            IInterface iInterface2 = iBinder2.queryLocalInterface("org.chromium.components.ip_protection_auth.common.IIpProtectionGetInitialDataCallback");
            object2 = (iInterface2 instanceof ifvv) ? ((ifvv)iInterface2) : new ifvv(iBinder2);
        }
        ifvu.gr(parcel0);
        ibuq.f(arr_b2, "requestBytes");
        ibuq.f(object2, "callback");
        this.a.e.a(bbdg.xa);
        try {
            ProtoLiteMessage hftv2 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hfkp.a), arr_b2, 0, arr_b2.length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv2);
            hfkp0 = (hfkp)hftv2;
            ibuq.c(hfkp0);
        }
        catch(hfur hfur2) {
            throw new IllegalArgumentException("Failed to parse GetInitialDataRequest", hfur2);
        }
        String[] arr_s2 = AppContextProvider.a().getPackageManager().getPackagesForUid(Binder.getCallingUid());
        if(arr_s2 != null) {
            String s2 = (String)ibpg.D(arr_s2);
            BlindauthApiService blindauthApiService2 = this.a;
            Context context2 = AppContextProvider.a();
            ibuq.e(context2, "getApplicationContext(...)");
            ibuq.c(s2);
            if(BlindauthApiService.c(context2, s2)) {
                atpv atpv0 = new atpv(blindauthApiService2, hfkp0, this, ((ifvv)object2), null);
                icbb.b(blindauthApiService2.c, null, null, atpv0, 3);
                parcel1.writeNoException();
                return true;
            }
            ((ggtj)BlindauthApiService.a.j()).x("Calling app does not have internet permission");
            throw new SecurityException("Calling app does not have internet permission");
        }
        ((ggtj)BlindauthApiService.a.j()).x("Calling package name cannot be retrieved for IP Protection Auth");
        throw new SecurityException("Calling package name cannot be retrieved for IP Protection Auth");
    }
}

