import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.AcceptParams;
import com.google.android.gms.nearby.sharing.internal.CancelParams;
import com.google.android.gms.nearby.sharing.internal.ConsentToContactsUploadParams;
import com.google.android.gms.nearby.sharing.internal.GetAccountParams;
import com.google.android.gms.nearby.sharing.internal.GetActionsParams;
import com.google.android.gms.nearby.sharing.internal.GetAllowPermissionAutoParams;
import com.google.android.gms.nearby.sharing.internal.GetContactsCountParams;
import com.google.android.gms.nearby.sharing.internal.GetContactsParams;
import com.google.android.gms.nearby.sharing.internal.GetDataUsageParams;
import com.google.android.gms.nearby.sharing.internal.GetDeviceAccountIdParams;
import com.google.android.gms.nearby.sharing.internal.GetDeviceNameParams;
import com.google.android.gms.nearby.sharing.internal.GetDeviceVisibilityParams;
import com.google.android.gms.nearby.sharing.internal.GetDownloadsDirectoryParams;
import com.google.android.gms.nearby.sharing.internal.GetIntentParams;
import com.google.android.gms.nearby.sharing.internal.GetOptInStatusParams;
import com.google.android.gms.nearby.sharing.internal.GetReachablePhoneNumbersParams;
import com.google.android.gms.nearby.sharing.internal.GetShareTargetsParams;
import com.google.android.gms.nearby.sharing.internal.GetVisibilityParams;
import com.google.android.gms.nearby.sharing.internal.HasConsentedToContactsUploadParams;
import com.google.android.gms.nearby.sharing.internal.IgnoreConsentParams;
import com.google.android.gms.nearby.sharing.internal.InstallParams;
import com.google.android.gms.nearby.sharing.internal.InvalidateIntentParams;
import com.google.android.gms.nearby.sharing.internal.IsConsentIgnoredParams;
import com.google.android.gms.nearby.sharing.internal.IsEnabledParams;
import com.google.android.gms.nearby.sharing.internal.IsFastInitNotificationEnabledParams;
import com.google.android.gms.nearby.sharing.internal.IsOptedInParams;
import com.google.android.gms.nearby.sharing.internal.OpenParams;
import com.google.android.gms.nearby.sharing.internal.OptInByRemoteCopyParams;
import com.google.android.gms.nearby.sharing.internal.OptInParams;
import com.google.android.gms.nearby.sharing.internal.RegisterCloudSharingReceiverParams;
import com.google.android.gms.nearby.sharing.internal.RegisterInstallCallbackParams;
import com.google.android.gms.nearby.sharing.internal.RegisterReceiveSurfaceParams;
import com.google.android.gms.nearby.sharing.internal.RegisterSendSurfaceParams;
import com.google.android.gms.nearby.sharing.internal.RegisterSharingProviderParams;
import com.google.android.gms.nearby.sharing.internal.RegisterStateObserverParams;
import com.google.android.gms.nearby.sharing.internal.RejectParams;
import com.google.android.gms.nearby.sharing.internal.ResetParams;
import com.google.android.gms.nearby.sharing.internal.SendParams;
import com.google.android.gms.nearby.sharing.internal.SetAccountParams;
import com.google.android.gms.nearby.sharing.internal.SetAllowPermissionAutoParams;
import com.google.android.gms.nearby.sharing.internal.SetDataUsageParams;
import com.google.android.gms.nearby.sharing.internal.SetDeviceNameParams;
import com.google.android.gms.nearby.sharing.internal.SetDeviceVisibilityParams;
import com.google.android.gms.nearby.sharing.internal.SetDownloadsDirectoryParams;
import com.google.android.gms.nearby.sharing.internal.SetEnabledParams;
import com.google.android.gms.nearby.sharing.internal.SetFastInitNotificationEnabledParams;
import com.google.android.gms.nearby.sharing.internal.SetVisibilityParams;
import com.google.android.gms.nearby.sharing.internal.StartQrCodeSessionParams;
import com.google.android.gms.nearby.sharing.internal.StopQrCodeSessionParams;
import com.google.android.gms.nearby.sharing.internal.SyncParams;
import com.google.android.gms.nearby.sharing.internal.UnregisterInstallCallbackParams;
import com.google.android.gms.nearby.sharing.internal.UnregisterReceiveSurfaceParams;
import com.google.android.gms.nearby.sharing.internal.UnregisterSendSurfaceParams;
import com.google.android.gms.nearby.sharing.internal.UnregisterSharingProviderParams;
import com.google.android.gms.nearby.sharing.internal.UnregisterStateObserverParams;
import com.google.android.gms.nearby.sharing.internal.UpdateSelectedContactsParams;
import j..util.Objects;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.NoSuchElementException;

public final class dchp extends ddos {
    public final String a;
    public final int b;
    public final int c;
    public final azxr d;
    final NearbySharingChimeraService e;
    private final String f;
    private final int g;
    private final cupq h;
    private final Map i;
    private final Map j;
    private final Map k;
    private final Map l;
    private final Map m;

    public dchp(NearbySharingChimeraService nearbySharingChimeraService0, String s, int v, int v1, String s1) {
        Objects.requireNonNull(nearbySharingChimeraService0);
        this.e = nearbySharingChimeraService0;
        super();
        this.d = new dchf(this);
        this.i = new bxd();
        this.j = new bxd();
        this.k = new bxd();
        this.l = new bxd();
        this.m = new bxd();
        this.a = s;
        this.b = v;
        this.c = v1;
        this.f = s1;
        this.h = new cupq(nearbySharingChimeraService0.N);
        this.g = Binder.getCallingUid();
    }

    @Override  // ddos
    public final void A(IsFastInitNotificationEnabledParams isFastInitNotificationEnabledParams0) {
        batl.s(isFastInitNotificationEnabledParams0.a);
        dcdl dcdl0 = new dcdl(this, isFastInitNotificationEnabledParams0);
        this.e.aj(dcdl0);
    }

    @Override  // ddos
    public final void B(IsOptedInParams isOptedInParams0) {
        batl.s(isOptedInParams0.a);
        dcdp dcdp0 = new dcdp(this, isOptedInParams0);
        this.e.aj(dcdp0);
    }

    @Override  // ddos
    public final void D(OpenParams openParams0) {
        batl.s(openParams0.a);
        batl.s(openParams0.b);
        ShareTarget shareTarget0 = openParams0.a;
        dcvz.a.b().i("Package %s has requested to open the attachments of %s", this.a, shareTarget0.b);
        dcfj dcfj0 = new dcfj(this, openParams0, shareTarget0);
        this.e.aj(dcfj0);
    }

    @Override  // ddos
    public final void E(OptInParams optInParams0) {
        batl.s(optInParams0.a);
        dcvz.a.b().h("Package %s has requested to opt in", this.a);
        dcdq dcdq0 = new dcdq(this, optInParams0);
        this.e.aj(dcdq0);
    }

    @Override  // ddos
    public final void H(OptInByRemoteCopyParams optInByRemoteCopyParams0) {
        batl.s(optInByRemoteCopyParams0.a);
        dcvz.a.b().h("Package %s has requested to opt in by remote copy", this.a);
        dcep dcep0 = new dcep(this, optInByRemoteCopyParams0);
        this.e.aj(dcep0);
    }

    @Override  // ddos
    public final void I(RegisterCloudSharingReceiverParams registerCloudSharingReceiverParams0) {
        dcvz.a.b().j("Package %s has requested to register receiver session %s for cloud sharing %s", this.a, registerCloudSharingReceiverParams0.c, registerCloudSharingReceiverParams0.b);
        dcfi dcfi0 = new dcfi(this, registerCloudSharingReceiverParams0);
        this.e.aj(dcfi0);
    }

    @Override  // ddos
    public final void J(RegisterInstallCallbackParams registerInstallCallbackParams0) {
        ddok ddok0 = registerInstallCallbackParams0.a;
        int v = registerInstallCallbackParams0.b;
        batl.s(ddok0);
        batl.s(registerInstallCallbackParams0.c);
        boolean z = true;
        switch(v) {
            case 0: {
                break;
            }
            case 1: {
                v = 1;
                break;
            }
            default: {
                z = false;
            }
        }
        batl.b(z);
        Map map0 = this.m;
        if(map0.containsKey(ddok0.asBinder())) {
            throw new IllegalArgumentException("registerInstallCallback failed. Already registered.");
        }
        dchj dchj0 = new dchj(this, ddok0);
        dceg dceg0 = new dceg(this, ddok0);
        map0.put(ddok0.asBinder(), new dchl(dchj0, dceg0));
        cunf cunf0 = dcvz.a.b();
        String s = NearbySharingChimeraService.G(v);
        cunf0.i("Package %s has requested to register a install callback of type %s", this.a, s);
        try {
            ddok0.asBinder().linkToDeath(dceg0, 0);
        }
        catch(RemoteException unused_ex) {
            dceg0.binderDied();
        }
        dceh dceh0 = new dceh(this, registerInstallCallbackParams0, dchj0, v);
        this.e.aj(dceh0);
    }

    @Override  // ddos
    public final void K(RegisterReceiveSurfaceParams registerReceiveSurfaceParams0) {
        boolean z1;
        ddpr ddpr0 = registerReceiveSurfaceParams0.a;
        int v = registerReceiveSurfaceParams0.b;
        batl.s(ddpr0);
        batl.s(registerReceiveSurfaceParams0.c);
        boolean z = true;
        if(v != 0 && v != 1) {
            switch(v) {
                case 2: {
                    z1 = true;
                    break;
                }
                case 3: {
                    v = 3;
                    z1 = true;
                    break;
                }
                default: {
                    z1 = false;
                }
            }
        }
        else {
            z1 = true;
        }
        batl.b(z1);
        if(registerReceiveSurfaceParams0.e != null && v == 0) {
            v = 0;
            z = false;
        }
        batl.b(z);
        Map map0 = this.i;
        if(map0.containsKey(ddpr0.asBinder())) {
            throw new IllegalArgumentException("registerReceiveSurface failed. Already registered.");
        }
        dchi dchi0 = new dchi(this, ddpr0);
        dcgb dcgb0 = new dcgb(this, ddpr0);
        map0.put(ddpr0.asBinder(), new dchm(dchi0, dcgb0));
        try {
            ddpr0.asBinder().linkToDeath(dcgb0, 0);
        }
        catch(RemoteException unused_ex) {
            dcgb0.binderDied();
        }
        cunf cunf0 = dcvz.a.b();
        String s = NearbySharingChimeraService.G(v);
        cunf0.i("Package %s has requested to register a receive surface of type %s", this.a, s);
        dcgc dcgc0 = new dcgc(this, registerReceiveSurfaceParams0, dchi0, v);
        this.e.aj(dcgc0);
    }

    @Override  // ddos
    public final void L(RegisterSendSurfaceParams registerSendSurfaceParams0) {
        int v1;
        ddpr ddpr0 = registerSendSurfaceParams0.a;
        ddpc ddpc0 = registerSendSurfaceParams0.b;
        int v = registerSendSurfaceParams0.c;
        batl.s(ddpr0);
        batl.s(ddpc0);
        batl.s(registerSendSurfaceParams0.d);
        boolean z = true;
        if(v != 0 && v != 1) {
            switch(v) {
                case 2: 
                case 3: 
                case 5: {
                    v1 = v;
                    break;
                }
                case 6: {
                    v1 = 6;
                    break;
                }
                default: {
                    v1 = v;
                    z = false;
                }
            }
        }
        else {
            v1 = v;
        }
        batl.b(z);
        Map map0 = this.j;
        if(map0.containsKey(ddpr0.asBinder())) {
            throw new IllegalArgumentException("registerSendSurface failed. Already registered.");
        }
        dchg dchg0 = new dchg(this, ddpr0);
        dchh dchh0 = new dchh(this, ddpc0);
        dcgz dcgz0 = new dcgz(this, ddpr0);
        map0.put(ddpr0.asBinder(), new dchn(dchg0, dcgz0));
        try {
            ddpr0.asBinder().linkToDeath(dcgz0, 0);
        }
        catch(RemoteException unused_ex) {
            dcgz0.binderDied();
        }
        cunf cunf0 = dcvz.a.b();
        String s = dcme.a(v1);
        cunf0.i("Package %s has requested to register a send surface of type %s", this.a, s);
        dcha dcha0 = new dcha(this, registerSendSurfaceParams0, dchg0, dchh0, v1);
        this.e.aj(dcha0);
    }

    @Override  // ddos
    public final void M(RegisterSharingProviderParams registerSharingProviderParams0) {
        ddoh ddoh0 = registerSharingProviderParams0.b;
        batl.s(ddoh0);
        IBinder iBinder0 = ddoh0.a;
        Map map0 = this.k;
        if(map0.containsKey(iBinder0)) {
            throw new IllegalArgumentException("registerSharingProvider failed. Already registered.");
        }
        String s = Integer.toString(Objects.hashCode(ddoh0));
        dijm dijm0 = this.e.c;
        Objects.requireNonNull(this.e);
        dceq dceq0 = new dceq(this.e);
        Objects.requireNonNull(this.e);
        dcfb dcfb0 = new dcfb(this.e);
        Objects.requireNonNull(this.e);
        dcfm dcfm0 = new dcfm(this.e);
        dfss dfss0 = new dfss(this.e.P);
        dftj dftj0 = new dftj(this.a, s, ddoh0, dgge.a, this.e.aa, dijm0, dceq0, dcfb0, dcfm0, dfss0);
        dcfx dcfx0 = new dcfx(this, ddoh0);
        map0.put(iBinder0, new dchk(dftj0, dcfx0));
        try {
            iBinder0.linkToDeath(dcfx0, 0);
        }
        catch(RemoteException unused_ex) {
            dcfx0.binderDied();
        }
        dcgi dcgi0 = new dcgi(this, registerSharingProviderParams0, dftj0, s);
        this.e.aj(dcgi0);
    }

    @Override  // ddos
    public final void N(RegisterStateObserverParams registerStateObserverParams0) {
        ddpi ddpi0 = registerStateObserverParams0.a;
        batl.s(ddpi0);
        batl.s(registerStateObserverParams0.b);
        IBinder iBinder0 = ddpi0.asBinder();
        Map map0 = this.l;
        if(map0.containsKey(iBinder0)) {
            throw new IllegalArgumentException("registerStateObserver failed. Already registered.");
        }
        dcgs dcgs0 = new dcgs(ddpi0);
        dcgu dcgu0 = new dcgu(this, ddpi0);
        map0.put(ddpi0.asBinder(), new dcho(dcgs0, dcgu0));
        dcvz.a.b().h("Package %s has requested to register a state observer", this.a);
        try {
            ddpi0.asBinder().linkToDeath(dcgu0, 0);
        }
        catch(RemoteException unused_ex) {
            dcgu0.binderDied();
        }
        dcgv dcgv0 = new dcgv(this, registerStateObserverParams0, dcgs0);
        this.e.aj(dcgv0);
    }

    @Override  // ddos
    public final void O(RejectParams rejectParams0) {
        batl.s(rejectParams0.a);
        batl.s(rejectParams0.b);
        dcvz.a.b().i("Package %s has requested to reject the connection with %s", this.a, rejectParams0.a.b);
        dcdt dcdt0 = new dcdt(this, rejectParams0);
        this.e.aj(dcdt0);
    }

    @Override  // ddos
    public final void P(ResetParams resetParams0) {
        batl.s(resetParams0.a);
        dcvz.a.b().h("Package %s has requested to reset", this.a);
        dcgo dcgo0 = new dcgo(this, resetParams0);
        this.e.aj(dcgo0);
    }

    @Override  // ddos
    public final void Q(SendParams sendParams0) {
        batl.t(sendParams0.a, "null shareTarget");
        batl.t(sendParams0.b, "null intent");
        batl.t(sendParams0.c, "null callback");
        dcvz.a.b().i("Package %s has requested to send to %s", this.a, sendParams0.a.b);
        dcft dcft0 = new dcft(this, sendParams0);
        this.e.aj(dcft0);
    }

    @Override  // ddos
    public final void R(SetAccountParams setAccountParams0) {
        batl.s(setAccountParams0.b);
        batl.s(setAccountParams0.a);
        batl.b(Objects.equals(setAccountParams0.a.type, "com.google"));
        dcvz.a.b().i("Package %s has requested to set the account to %s", this.a, setAccountParams0.a.name);
        dcfe dcfe0 = new dcfe(this, setAccountParams0);
        this.e.aj(dcfe0);
    }

    @Override  // ddos
    public final void S(SetAllowPermissionAutoParams setAllowPermissionAutoParams0) {
        batl.s(setAllowPermissionAutoParams0.b);
        dcvz.a.b().i("Package %s has requested to change allow permission auto to %b", this.a, Boolean.valueOf(setAllowPermissionAutoParams0.a));
        dcgy dcgy0 = new dcgy(this, setAllowPermissionAutoParams0);
        this.e.aj(dcgy0);
    }

    @Override  // ddos
    public final void T(SetDataUsageParams setDataUsageParams0) {
        batl.s(setDataUsageParams0.b);
        cunf cunf0 = dcvz.a.b();
        String s = this.e.D(setDataUsageParams0.a);
        cunf0.i("Package %s has requested to set data usage to %s", this.a, s);
        dcgh dcgh0 = new dcgh(this, setDataUsageParams0);
        this.e.aj(dcgh0);
    }

    @Override  // ddos
    public final void U(SetDeviceNameParams setDeviceNameParams0) {
        batl.s(setDeviceNameParams0.a);
        batl.s(setDeviceNameParams0.b);
        dcvz.a.b().i("Package %s has requested to set device name to %s", this.a, setDeviceNameParams0.a);
        dcew dcew0 = new dcew(this, setDeviceNameParams0);
        this.e.aj(dcew0);
    }

    @Override  // ddos
    public final void V(SetDeviceVisibilityParams setDeviceVisibilityParams0) {
        int v2;
        int v = setDeviceVisibilityParams0.b;
        long v1 = setDeviceVisibilityParams0.c;
        String s = setDeviceVisibilityParams0.d;
        batl.s(setDeviceVisibilityParams0.a);
        boolean z = false;
        batl.d(Long.compare(v1, -1L) > 0, "Invalid visibility duration %i", new Object[]{v1});
        if(v != 1 && v != 3) {
            switch(v) {
                case 0: {
                    v2 = 0;
                    z = true;
                    break;
                }
                case 4: {
                    z = true;
                    v2 = 4;
                    break;
                }
                default: {
                    v2 = v;
                }
            }
        }
        else {
            z = true;
            v2 = v;
        }
        batl.d(z, "Invalid visibility [%i]", new Object[]{v2});
        cunf cunf0 = dcvz.a.b();
        String s1 = djbr.t(v2);
        cunf0.i("Package %s has requested to set device visibility to %s", this.a, s1);
        dcen dcen0 = new dcen(this, setDeviceVisibilityParams0, v2, v1, s);
        this.e.aj(dcen0);
    }

    @Override  // ddos
    public final void W(SetDownloadsDirectoryParams setDownloadsDirectoryParams0) {
        batl.s(setDownloadsDirectoryParams0.b);
        batl.s(setDownloadsDirectoryParams0.a);
        dcvz.a.b().i("Package %s has requested to set downloads directory to %s", this.a, setDownloadsDirectoryParams0.a);
        dcge dcge0 = new dcge(this, setDownloadsDirectoryParams0);
        this.e.aj(dcge0);
    }

    @Override  // ddos
    public final void X(SetEnabledParams setEnabledParams0) {
        batl.s(setEnabledParams0.b);
        dcvz.a.b().i("Package %s has requested to set enabled to %b", this.a, Boolean.valueOf(setEnabledParams0.a));
        dcfk dcfk0 = new dcfk(this, setEnabledParams0);
        this.e.aj(dcfk0);
    }

    @Override  // ddos
    public final void Y(SetFastInitNotificationEnabledParams setFastInitNotificationEnabledParams0) {
        batl.s(setFastInitNotificationEnabledParams0.a);
        dcvz.a.b().i("Package %s has requested to set fast init notification to %b", this.a, Boolean.valueOf(setFastInitNotificationEnabledParams0.b));
        dcgd dcgd0 = new dcgd(this, setFastInitNotificationEnabledParams0);
        this.e.aj(dcgd0);
    }

    @Override  // ddos
    public final void Z(SetVisibilityParams setVisibilityParams0) {
        batl.s(setVisibilityParams0.b);
        int v = setVisibilityParams0.a;
        boolean z = true;
        if(v != 1 && v != 3) {
            switch(v) {
                case 0: {
                    v = 0;
                    break;
                }
                case 4: {
                    break;
                }
                default: {
                    z = false;
                }
            }
        }
        batl.b(z);
        cunf cunf0 = dcvz.a.b();
        String s = djbr.t(v);
        cunf0.i("Package %s has requested to set visibility to %s", this.a, s);
        dcgj dcgj0 = new dcgj(this, setVisibilityParams0, v);
        this.e.aj(dcgj0);
    }

    public final int a(String[] arr_s) {
        if(bbqa.c() || hvrc.a.b().u()) {
            String s = this.a;
            String s1 = s;
            for(Object object0: hvqs.a.aT().cU().b) {
                String s2 = (String)object0;
                if(s2.contains(s)) {
                    s1 = s2.substring(s2.indexOf(":") + 1);
                }
            }
            for(int v = 0; v < arr_s.length; ++v) {
                String s3 = arr_s[v];
                if(!gxyh.c(this.e.N, s3, s1, this.f)) {
                    dcvz.a.e().i("Missing permission: %s does not have required permission %s", s1, s3);
                    return cvax.a(s3);
                }
            }
            this.h.b(s1, this.g, this.f, arr_s);
        }
        return 0;
    }

    @Override  // ddos
    public final void aa(StartQrCodeSessionParams startQrCodeSessionParams0) {
        batl.s(startQrCodeSessionParams0.a);
        dcvz.a.b().h("Package %s has requested to start a QR Code session", this.a);
        dceu dceu0 = () -> try {
            byte[] arr_b = startQrCodeSessionParams0.b;
            if(arr_b != null) {
                NearbySharingChimeraService nearbySharingChimeraService0 = this.e;
                if(hvqz.H()) {
                    if(arr_b.length == 0) {
                        dcvz.a.e().p("Trying to start QR code session with key without a valid key.", new Object[0]);
                        return;
                    }
                    nearbySharingChimeraService0.a.B(arr_b);
                    return;
                }
                dcvz.a.e().p("QR code with symmetricKey featue not supported.", new Object[0]);
                return;
            }
            this.e.au(startQrCodeSessionParams0.c, startQrCodeSessionParams0.a, 4);
        }
        catch(GeneralSecurityException | IOException exception0) {
            dcvz.a.e().f(exception0).p("Failed to invoke StartQrCodeSession callback.", new Object[0]);
        };
        this.e.aj(dceu0);
    }

    @Override  // ddos
    public final void ab(StopQrCodeSessionParams stopQrCodeSessionParams0) {
        batl.s(stopQrCodeSessionParams0.a);
        dcvz.a.b().h("Package %s has requested to stop a QR Code session", this.a);
        dcfp dcfp0 = new dcfp(this, stopQrCodeSessionParams0);
        this.e.aj(dcfp0);
    }

    @Override  // ddos
    public final void ac(SyncParams syncParams0) {
        batl.s(syncParams0.a);
        batl.o(syncParams0.b, 1, 2, "params.getSyncPurpose()");
        dcvz.a.b().h("Package %s has requested to sync", this.a);
        dcer dcer0 = new dcer(this, syncParams0);
        this.e.aj(dcer0);
    }

    @Override  // ddos
    public final void ad(UnregisterInstallCallbackParams unregisterInstallCallbackParams0) {
        ddok ddok0 = unregisterInstallCallbackParams0.a;
        batl.s(ddok0);
        batl.s(unregisterInstallCallbackParams0.b);
        IBinder iBinder0 = ddok0.asBinder();
        dchl dchl0 = (dchl)this.m.remove(iBinder0);
        if(dchl0 == null) {
            throw new IllegalArgumentException("unregisterInstallCallback failed. Unknown InstallUpdateCallback");
        }
        try {
            ddok0.asBinder().unlinkToDeath(dchl0.b, 0);
        }
        catch(NoSuchElementException unused_ex) {
        }
        dcvz.a.b().h("Package %s has requested to unregister a install callback", this.a);
        dcff dcff0 = new dcff(this, unregisterInstallCallbackParams0, dchl0);
        this.e.aj(dcff0);
    }

    @Override  // ddos
    public final void ae(UnregisterReceiveSurfaceParams unregisterReceiveSurfaceParams0) {
        ddpr ddpr0 = unregisterReceiveSurfaceParams0.a;
        batl.s(ddpr0);
        batl.s(unregisterReceiveSurfaceParams0.b);
        IBinder iBinder0 = ddpr0.asBinder();
        dchm dchm0 = (dchm)this.i.remove(iBinder0);
        if(dchm0 == null) {
            throw new IllegalArgumentException("unregisterReceiveSurface failed. Unknown TransferUpdateCallback");
        }
        try {
            ddpr0.asBinder().unlinkToDeath(dchm0.b, 0);
        }
        catch(NoSuchElementException unused_ex) {
        }
        dcvz.a.b().h("Package %s has requested to unregister a receive surface", this.a);
        dcgx dcgx0 = new dcgx(this, unregisterReceiveSurfaceParams0, dchm0);
        this.e.aj(dcgx0);
    }

    @Override  // ddos
    public final void af(UnregisterSendSurfaceParams unregisterSendSurfaceParams0) {
        ddpr ddpr0 = unregisterSendSurfaceParams0.a;
        batl.s(ddpr0);
        batl.s(unregisterSendSurfaceParams0.b);
        IBinder iBinder0 = ddpr0.asBinder();
        dchn dchn0 = (dchn)this.j.remove(iBinder0);
        if(dchn0 == null) {
            throw new IllegalArgumentException("unregisterSendSurface failed. Unknown TransferUpdateCallback");
        }
        try {
            ddpr0.asBinder().unlinkToDeath(dchn0.b, 0);
        }
        catch(NoSuchElementException unused_ex) {
        }
        dcvz.a.b().h("Package %s has requested to unregister a send surface", this.a);
        dcfo dcfo0 = new dcfo(this, unregisterSendSurfaceParams0, dchn0);
        this.e.aj(dcfo0);
    }

    @Override  // ddos
    public final void ag(UnregisterSharingProviderParams unregisterSharingProviderParams0) {
        ddoh ddoh0 = unregisterSharingProviderParams0.b;
        batl.s(ddoh0);
        IBinder iBinder0 = ddoh0.a;
        dchk dchk0 = (dchk)this.k.remove(iBinder0);
        if(dchk0 == null) {
            throw new IllegalArgumentException("unregisterSharingProvider failed. Unknown ExternalSharingProvider");
        }
        try {
            iBinder0.unlinkToDeath(dchk0.b, 0);
        }
        catch(NoSuchElementException unused_ex) {
        }
        dcei dcei0 = new dcei(this, unregisterSharingProviderParams0, dchk0);
        this.e.aj(dcei0);
    }

    @Override  // ddos
    public final void ah(UnregisterStateObserverParams unregisterStateObserverParams0) {
        ddpi ddpi0 = unregisterStateObserverParams0.a;
        batl.s(ddpi0);
        batl.s(unregisterStateObserverParams0.b);
        IBinder iBinder0 = ddpi0.asBinder();
        dcho dcho0 = (dcho)this.l.remove(iBinder0);
        if(dcho0 == null) {
            throw new IllegalArgumentException("unregisterStateObserver failed. Unknown StateUpdateCallback");
        }
        try {
            ddpi0.asBinder().unlinkToDeath(dcho0.b, 0);
        }
        catch(NoSuchElementException unused_ex) {
        }
        dcvz.a.b().h("Package %s has requested to unregister a state observer", this.a);
        dcgm dcgm0 = new dcgm(this, unregisterStateObserverParams0, dcho0);
        this.e.aj(dcgm0);
    }

    @Override  // ddos
    public final void ai(UpdateSelectedContactsParams updateSelectedContactsParams0) {
        batl.s(updateSelectedContactsParams0.a);
        batl.s(updateSelectedContactsParams0.b);
        batl.s(updateSelectedContactsParams0.c);
        dcvz.a.b().h("Package %s has requested to update the selected contacts", this.a);
        dcgl dcgl0 = new dcgl(this, updateSelectedContactsParams0);
        this.e.aj(dcgl0);
    }

    @Override  // ddos
    public final void aj() {
    }

    @Override  // ddos
    public final void ak() {
    }

    @Override  // ddos
    public final void c(AcceptParams acceptParams0) {
        batl.s(acceptParams0.a);
        batl.s(acceptParams0.b);
        dcvz.a.b().i("Package %s has requested to accept the connection with %s", this.a, acceptParams0.a.b);
        dcdz dcdz0 = new dcdz(this, acceptParams0);
        this.e.aj(dcdz0);
    }

    @Override  // ddos
    public final void d(CancelParams cancelParams0) {
        batl.s(cancelParams0.a);
        batl.s(cancelParams0.b);
        dcvz.a.b().i("Package %s has requested to cancel the connection with %s", this.a, cancelParams0.a.b);
        dcek dcek0 = new dcek(this, cancelParams0);
        this.e.aj(dcek0);
    }

    @Override  // ddos
    public final void e(ConsentToContactsUploadParams consentToContactsUploadParams0) {
        batl.s(consentToContactsUploadParams0.a);
        dcvz.a.b().h("Package %s has requested to consent to contacts upload", this.a);
        dcdj dcdj0 = new dcdj(this, consentToContactsUploadParams0);
        this.e.aj(dcdj0);
    }

    @Override  // ddos
    public final void f(GetAccountParams getAccountParams0) {
        batl.s(getAccountParams0.a);
        dcds dcds0 = new dcds(this, getAccountParams0);
        this.e.aj(dcds0);
    }

    @Override  // ddos
    public final void g(GetActionsParams getActionsParams0) {
        batl.s(getActionsParams0.b);
        batl.s(getActionsParams0.a);
        dcgr dcgr0 = new dcgr(this, getActionsParams0, getActionsParams0.a);
        this.e.aj(dcgr0);
    }

    @Override  // ddos
    public final void h(GetAllowPermissionAutoParams getAllowPermissionAutoParams0) {
        batl.s(getAllowPermissionAutoParams0.a);
        dcfh dcfh0 = new dcfh(this, getAllowPermissionAutoParams0);
        this.e.aj(dcfh0);
    }

    @Override  // ddos
    public final void i(GetContactsParams getContactsParams0) {
        batl.s(getContactsParams0.a);
        boolean z = true;
        batl.b(getContactsParams0.b >= 0);
        if(getContactsParams0.c < 0) {
            z = false;
        }
        batl.b(z);
        dcgt dcgt0 = new dcgt(this, getContactsParams0);
        this.e.aj(dcgt0);
    }

    @Override  // ddos
    public final void j(GetContactsCountParams getContactsCountParams0) {
        batl.s(getContactsCountParams0.a);
        dcfw dcfw0 = new dcfw(this, getContactsCountParams0);
        this.e.aj(dcfw0);
    }

    @Override  // ddos
    public final void k(GetDataUsageParams getDataUsageParams0) {
        batl.s(getDataUsageParams0.a);
        dces dces0 = new dces(this, getDataUsageParams0);
        this.e.aj(dces0);
    }

    @Override  // ddos
    public final void l(GetDeviceAccountIdParams getDeviceAccountIdParams0) {
        batl.s(getDeviceAccountIdParams0.a);
        dcfn dcfn0 = new dcfn(this, getDeviceAccountIdParams0);
        this.e.aj(dcfn0);
    }

    @Override  // ddos
    public final void m(GetDeviceNameParams getDeviceNameParams0) {
        batl.s(getDeviceNameParams0.a);
        dchc dchc0 = new dchc(this, getDeviceNameParams0);
        this.e.aj(dchc0);
    }

    @Override  // ddos
    public final void n(GetDeviceVisibilityParams getDeviceVisibilityParams0) {
        batl.s(getDeviceVisibilityParams0.a);
        dcga dcga0 = new dcga(this, getDeviceVisibilityParams0);
        this.e.aj(dcga0);
    }

    @Override  // ddos
    public final void o(GetDownloadsDirectoryParams getDownloadsDirectoryParams0) {
        batl.s(getDownloadsDirectoryParams0.a);
        dcfg dcfg0 = new dcfg(this, getDownloadsDirectoryParams0);
        this.e.aj(dcfg0);
    }

    @Override  // ddos
    public final void p(GetIntentParams getIntentParams0) {
        batl.s(getIntentParams0.a);
        dcel dcel0 = new dcel(this, getIntentParams0);
        this.e.aj(dcel0);
    }

    @Override  // ddos
    public final void q(GetOptInStatusParams getOptInStatusParams0) {
        batl.s(getOptInStatusParams0.a);
        dche dche0 = new dche(this, getOptInStatusParams0);
        this.e.aj(dche0);
    }

    @Override  // ddos
    public final void r(GetReachablePhoneNumbersParams getReachablePhoneNumbersParams0) {
        batl.s(getReachablePhoneNumbersParams0.b);
        batl.s(getReachablePhoneNumbersParams0.a);
        dcdh dcdh0 = new dcdh(this, getReachablePhoneNumbersParams0);
        this.e.aj(dcdh0);
    }

    @Override  // ddos
    public final void s(GetShareTargetsParams getShareTargetsParams0) {
        batl.s(getShareTargetsParams0.b);
        int v = getShareTargetsParams0.a;
        boolean z = true;
        switch(v) {
            case 0: {
                break;
            }
            case 1: {
                v = 1;
                break;
            }
            default: {
                z = false;
            }
        }
        batl.d(z, "ShareTargetType should be INCOMING(0) or OUTGOING(1) only. Now is %d", new Object[]{v});
        dcdi dcdi0 = new dcdi(this, getShareTargetsParams0, v);
        this.e.aj(dcdi0);
    }

    @Override  // ddos
    public final void t(GetVisibilityParams getVisibilityParams0) {
        batl.s(getVisibilityParams0.a);
        dcfu dcfu0 = new dcfu(this, getVisibilityParams0);
        this.e.aj(dcfu0);
    }

    @Override  // ddos
    public final void u(HasConsentedToContactsUploadParams hasConsentedToContactsUploadParams0) {
        batl.s(hasConsentedToContactsUploadParams0.a);
        dchb dchb0 = new dchb(this, hasConsentedToContactsUploadParams0);
        this.e.aj(dchb0);
    }

    @Override  // ddos
    public final void v(IgnoreConsentParams ignoreConsentParams0) {
        batl.s(ignoreConsentParams0.d);
        batl.b(ignoreConsentParams0.b == 1 || ignoreConsentParams0.b == 2);
        dcvz.a.b().h("Package %s has requested to ignore consent", this.a);
        dcgw dcgw0 = new dcgw(this, ignoreConsentParams0);
        this.e.aj(dcgw0);
    }

    @Override  // ddos
    public final void w(InstallParams installParams0) {
        batl.s(installParams0.a);
        batl.s(installParams0.c);
        ShareTarget shareTarget0 = installParams0.a;
        Attachment attachment0 = dizi.c(shareTarget0.e(), installParams0.b);
        batl.s(attachment0);
        batl.l(attachment0.i() || attachment0.a() == 3);
        dcvz.a.b().i("Package %s has requested to install the attachments of %s", this.a, shareTarget0.b);
        new bbln(9, new dcfl(this, installParams0, shareTarget0)).start();
    }

    @Override  // ddos
    public final void x(InvalidateIntentParams invalidateIntentParams0) {
        batl.s(invalidateIntentParams0.a);
        batl.s(invalidateIntentParams0.b);
        if(hvqz.X()) {
            try {
                invalidateIntentParams0.b.a(13);
            }
            catch(RemoteException remoteException0) {
                dcvz.a.e().f(remoteException0).p("Failed to invoke invalidateIntent callback.", new Object[0]);
            }
            return;
        }
        dcvz.a.b().h("Package %s has requested to invalidate the intent", this.a);
        dcgg dcgg0 = new dcgg(this, invalidateIntentParams0);
        this.e.aj(dcgg0);
    }

    @Override  // ddos
    public final void y(IsConsentIgnoredParams isConsentIgnoredParams0) {
        batl.s(isConsentIgnoredParams0.c);
        batl.b(isConsentIgnoredParams0.b == 1 || isConsentIgnoredParams0.b == 2);
        dcfa dcfa0 = new dcfa(this, isConsentIgnoredParams0);
        this.e.aj(dcfa0);
    }

    @Override  // ddos
    public final void z(IsEnabledParams isEnabledParams0) {
        batl.s(isEnabledParams0.a);
        dcdw dcdw0 = new dcdw(this, isEnabledParams0);
        this.e.aj(dcdw0);
    }
}

