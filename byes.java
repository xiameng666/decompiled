import android.app.ActivityManager.RunningTaskInfo;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.identity.credentials.shared.AppContextProvider;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.ClearCreationOptionsRequest;
import com.google.android.gms.identitycredentials.ClearCredentialStateRequest;
import com.google.android.gms.identitycredentials.ClearExportRequest;
import com.google.android.gms.identitycredentials.ClearRegistryRequest;
import com.google.android.gms.identitycredentials.CreateCredentialRequest;
import com.google.android.gms.identitycredentials.CredentialInformationRequest;
import com.google.android.gms.identitycredentials.CredentialOption;
import com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupRequest;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.identitycredentials.GetCredentialTransferCapabilitiesRequest;
import com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupRequest;
import com.google.android.gms.identitycredentials.ImportCredentialsRequest;
import com.google.android.gms.identitycredentials.RegisterCreationOptionsRequest;
import com.google.android.gms.identitycredentials.RegisterExportRequest;
import com.google.android.gms.identitycredentials.RegistrationRequest;
import com.google.android.gms.identitycredentials.SignalCredentialStateRequest;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public final class byes extends bxyp implements cjug {
    public static final Set a;
    public final int b;
    private static final bboh c;
    private final cjud d;
    private final Context e;
    private final String f;
    private final String g;

    static {
        byes.c = bboh.b("IDCredApiStub", bbcu.fN);
        List list0 = gfud.e(',').n(hufl.a.c().b());
        ibuq.e(list0, "splitToList(...)");
        byes.a = ibpo.ay(list0);
    }

    public byes(cjud cjud0, Context context0, String s, String s1) {
        ibuq.f(cjud0, "dispatcher");
        ibuq.f(s, "callingPackage");
        super();
        this.d = cjud0;
        this.e = context0;
        this.f = s;
        this.g = s1;
        this.b = Binder.getCallingUid();
    }

    @Override  // bxyq
    public final void a(bxyn bxyn0, ClearCreationOptionsRequest clearCreationOptionsRequest0, ApiMetadata apiMetadata0) {
        ibuq.f(bxyn0, "callbacks");
        ibuq.f(clearCreationOptionsRequest0, "request");
        long v = bxzl.a();
        String s = this.f;
        bxyi bxyi0 = new bxyi(s, this.b, v, this.e);
        if(!hufl.d()) {
            Context context0 = AppContextProvider.a();
            ibuq.e(context0, "getApplicationContext(...)");
            if(!byej.b(s, context0)) {
                bxyn0.a(Status.g, null, ApiMetadata.b);
                return;
            }
        }
        azug azug0 = this.p(apiMetadata0, hufl.d());
        byek byek0 = new byek(bxyn0, bxyi0, clearCreationOptionsRequest0, null);
        cjul.a(this.d, 0x160, "ClearCreationOptions", azug0, byek0);
    }

    @Override  // bxyq
    public final void b(bxyn bxyn0, ClearCredentialStateRequest clearCredentialStateRequest0, ApiMetadata apiMetadata0) {
        ibuq.f(bxyn0, "callbacks");
        ibuq.f(clearCredentialStateRequest0, "request");
        int v = this.b;
        long v1 = bxzl.a();
        bxyi bxyi0 = new bxyi(this.f, v, v1, this.e);
        if(!byes.s()) {
            bxyn0.b(Status.g, null, ApiMetadata.b);
            bxzl.c(v1, v, bxzg.c);
            return;
        }
        azug azug0 = this.p(apiMetadata0, true);
        byel byel0 = new byel(bxyn0, bxyi0, clearCredentialStateRequest0, v1, null);
        cjul.a(this.d, 0x160, "ClearCredentialState", azug0, byel0);
    }

    @Override  // bxyq
    public final void c(bxyn bxyn0, ClearExportRequest clearExportRequest0, ApiMetadata apiMetadata0) {
        ibuq.f(bxyn0, "callbacks");
        ibuq.f(clearExportRequest0, "request");
        long v = bxzl.a();
        String s = this.f;
        bxyi bxyi0 = new bxyi(s, this.b, v, this.e);
        if(!hufl.e()) {
            Context context0 = AppContextProvider.a();
            ibuq.e(context0, "getApplicationContext(...)");
            if(!byej.b(s, context0)) {
                bxyn0.c(Status.g, null, ApiMetadata.b);
                return;
            }
        }
        azug azug0 = this.p(apiMetadata0, hufl.e());
        byem byem0 = new byem(bxyn0, bxyi0, clearExportRequest0, null);
        cjul.a(this.d, 0x160, "ClearExport", azug0, byem0);
    }

    @Override  // bxyq
    public final void d(bxyn bxyn0, ClearRegistryRequest clearRegistryRequest0, ApiMetadata apiMetadata0) {
        ibuq.f(bxyn0, "callbacks");
        ibuq.f(clearRegistryRequest0, "request");
        long v = bxzl.a();
        String s = this.f;
        bxyi bxyi0 = new bxyi(s, this.b, v, this.e);
        if(!hufl.j()) {
            Context context0 = AppContextProvider.a();
            ibuq.e(context0, "getApplicationContext(...)");
            if(!byej.b(s, context0)) {
                bxyn0.d(Status.g, null, ApiMetadata.b);
                return;
            }
        }
        azug azug0 = this.p(apiMetadata0, hufl.j());
        byen byen0 = new byen(bxyn0, bxyi0, clearRegistryRequest0, null);
        cjul.a(this.d, 0x160, "ClearRegistry", azug0, byen0);
    }

    @Override  // bxyq
    public final void e(bxyn bxyn0, CreateCredentialRequest createCredentialRequest0, ApiMetadata apiMetadata0) {
        ibuq.f(bxyn0, "callbacks");
        ibuq.f(createCredentialRequest0, "request");
        long v = bxzl.a();
        int v1 = this.b;
        String s = this.f;
        Context context0 = this.e;
        bxyi bxyi0 = new bxyi(s, v1, v, context0);
        String s1 = createCredentialRequest0.a;
        if(ibuq.m(s1, "androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
            if(!hufl.f()) {
                Context context1 = AppContextProvider.a();
                ibuq.e(context1, "getApplicationContext(...)");
                if(!byej.b(s, context1)) {
                    bxyn0.e(Status.g, null, ApiMetadata.b);
                    bxzl.j(v, v1, bxzh.d, createCredentialRequest0);
                    return;
                }
            }
            byev byev0 = new byev(bxyi0, bxyn0, createCredentialRequest0, null, true, this.p(apiMetadata0, hufl.f()));
            this.d.b(byev0);
            return;
        }
        if(!createCredentialRequest0.c.containsKey("is_conditional_request") && !createCredentialRequest0.c.containsKey("androidx.credentials.BUNDLE_KEY_IS_CONDITIONAL_REQUEST")) {
            if(byej.a(s1)) {
                if(!byes.s()) {
                    bxyn0.e(Status.g, null, ApiMetadata.b);
                    bxzl.j(v, v1, bxzh.d, createCredentialRequest0);
                    return;
                }
                byev byev1 = new byev(bxyi0, bxyn0, createCredentialRequest0, bxvo.a(v), false, this.p(apiMetadata0, true));
                this.d.b(byev1);
                return;
            }
            bxyn0.e(Status.g, null, ApiMetadata.b);
            return;
        }
        if(!hufl.a.c().h()) {
            bxyn0.e(Status.g, null, ApiMetadata.b);
            bxzl.d(v, v1, bxzh.d, createCredentialRequest0, true);
            return;
        }
        Context context2 = AppContextProvider.a();
        ibuq.e(context2, "getApplicationContext(...)");
        if(!byes.r(context2, s)) {
            bxyn0.e(Status.g, null, ApiMetadata.b);
            bxzl.d(v, v1, bxzh.h, createCredentialRequest0, true);
            return;
        }
        Context context3 = AppContextProvider.a();
        ibuq.e(context3, "getApplicationContext(...)");
        byeu byeu0 = new byeu(context3, v, s, v1, bxyn0, createCredentialRequest0, new bxvx(context0, new bycc(context0)), new byce(context0));
        this.d.b(byeu0);
    }

    @Override  // bxyq
    public final void f(bxyn bxyn0, ExportCredentialsToDeviceSetupRequest exportCredentialsToDeviceSetupRequest0, ApiMetadata apiMetadata0) {
        ibuq.f(bxyn0, "callbacks");
        ibuq.f(exportCredentialsToDeviceSetupRequest0, "request");
        bxxx bxxx0 = this.q(exportCredentialsToDeviceSetupRequest0.b);
        if(hufl.g()) {
            Context context0 = AppContextProvider.a();
            ibuq.e(context0, "getApplicationContext(...)");
            if(byej.c(this.f, context0)) {
                byez byez0 = new byez(bxxx0, bxyn0, exportCredentialsToDeviceSetupRequest0, this.p(apiMetadata0, hufl.g()));
                this.d.b(byez0);
                return;
            }
        }
        bxyn0.f(Status.g, null, ApiMetadata.b);
    }

    @Override  // bxyq
    public final void g(bxyn bxyn0, GetCredentialRequest getCredentialRequest0, ApiMetadata apiMetadata0) {
        ibuq.f(bxyn0, "callbacks");
        ibuq.f(getCredentialRequest0, "request");
        int v = this.b;
        long v1 = bxzl.a();
        String s = this.f;
        bxyi bxyi0 = new bxyi(s, v, v1, this.e);
        List list0 = getCredentialRequest0.a;
        if(!(list0 instanceof Collection) || !list0.isEmpty()) {
            for(Object object0: list0) {
                if(byej.a(((CredentialOption)object0).a)) {
                    if(byes.s()) {
                        if(!(list0 instanceof Collection) || !list0.isEmpty()) {
                            for(Object object1: list0) {
                                CredentialOption credentialOption0 = (CredentialOption)object1;
                                AppContextProvider.a();
                            }
                        }
                        byfa byfa0 = new byfa(bxyi0, bxyn0, getCredentialRequest0, this.p(apiMetadata0, true), bxvo.a(v1), false);
                        this.d.b(byfa0);
                        return;
                    }
                    bxyn0.g(Status.g, null, ApiMetadata.b);
                    bxzl.e(v1, v, bxzn.c, getCredentialRequest0);
                    return;
                }
            }
        }
        if(!hufl.k()) {
            Context context0 = AppContextProvider.a();
            ibuq.e(context0, "getApplicationContext(...)");
            if(!byej.b(s, context0)) {
                ((ggtj)byes.c.h()).A("getCredential: API not enabled, requestId: %s", v1);
                bxyn0.g(Status.g, null, ApiMetadata.b);
                bxzl.e(v1, v, bxzn.c, getCredentialRequest0);
                return;
            }
        }
        byfa byfa1 = new byfa(bxyi0, bxyn0, getCredentialRequest0, this.p(apiMetadata0, hufl.k()), null, true);
        this.d.b(byfa1);
    }

    @Override  // bxyq
    public final void h(bxyn bxyn0, CredentialInformationRequest credentialInformationRequest0, ApiMetadata apiMetadata0) {
        ibuq.f(bxyn0, "callbacks");
        ibuq.f(credentialInformationRequest0, "request");
        if(!hufl.a.c().j()) {
            ((ggtj)byes.c.h()).x("GetCredentialInformationApi is not enabled.");
            bxyn0.h(Status.g, null);
            return;
        }
        if(Build.VERSION.SDK_INT < 34) {
            ((ggtj)byes.c.h()).x("GetCredentialInformationApi is not supported on this device.");
            bxyn0.h(Status.g, null);
            return;
        }
        byex byex0 = new byex(bxyn0, credentialInformationRequest0, this.p(apiMetadata0, hufl.f()));
        this.d.b(byex0);
    }

    @Override  // bxyq
    public final void i(bxyn bxyn0, GetCredentialTransferCapabilitiesRequest getCredentialTransferCapabilitiesRequest0, ApiMetadata apiMetadata0) {
        ibuq.f(bxyn0, "callbacks");
        ibuq.f(getCredentialTransferCapabilitiesRequest0, "request");
        bxxx bxxx0 = this.q(getCredentialTransferCapabilitiesRequest0.a);
        if(hufl.h()) {
            Context context0 = AppContextProvider.a();
            ibuq.e(context0, "getApplicationContext(...)");
            if(byej.c(this.f, context0)) {
                byfc byfc0 = new byfc(bxxx0, bxyn0, getCredentialTransferCapabilitiesRequest0, this.p(apiMetadata0, hufl.h()));
                this.d.b(byfc0);
                return;
            }
        }
        bxyn0.i(Status.g, null, ApiMetadata.b);
    }

    @Override  // bxyq
    public final void j(bxyn bxyn0, ImportCredentialsRequest importCredentialsRequest0, ApiMetadata apiMetadata0) {
        ibuq.f(bxyn0, "callbacks");
        ibuq.f(importCredentialsRequest0, "request");
        int v = this.b;
        long v1 = bxzl.a();
        String s = this.f;
        bxyi bxyi0 = new bxyi(s, v, v1, this.e);
        if(!hufl.m()) {
            Context context0 = AppContextProvider.a();
            ibuq.e(context0, "getApplicationContext(...)");
            if(!byej.b(s, context0)) {
                bxyn0.j(Status.g, null, ApiMetadata.b);
                bxzl.f(v1, v, bxzo.c);
                return;
            }
        }
        byfg byfg0 = new byfg(bxyi0, bxyn0, importCredentialsRequest0, this.p(apiMetadata0, hufl.m()));
        this.d.b(byfg0);
    }

    @Override  // bxyq
    public final void k(bxyn bxyn0, ImportCredentialsForDeviceSetupRequest importCredentialsForDeviceSetupRequest0, ApiMetadata apiMetadata0) {
        ibuq.f(bxyn0, "callbacks");
        ibuq.f(importCredentialsForDeviceSetupRequest0, "request");
        bxxx bxxx0 = this.q(importCredentialsForDeviceSetupRequest0.c);
        if(hufl.n()) {
            Context context0 = AppContextProvider.a();
            ibuq.e(context0, "getApplicationContext(...)");
            if(byej.c(this.f, context0)) {
                byff byff0 = new byff(bxxx0, bxyn0, importCredentialsForDeviceSetupRequest0, this.p(apiMetadata0, hufl.n()));
                this.d.b(byff0);
                return;
            }
        }
        bxyn0.k(Status.g, null, ApiMetadata.b);
    }

    @Override  // bxyq
    public final void l(bxyn bxyn0, RegisterCreationOptionsRequest registerCreationOptionsRequest0, ApiMetadata apiMetadata0) {
        ibuq.f(bxyn0, "callbacks");
        ibuq.f(registerCreationOptionsRequest0, "request");
        int v = this.b;
        long v1 = bxzl.a();
        String s = this.f;
        bxyi bxyi0 = new bxyi(s, v, v1, this.e);
        if(!hufl.o()) {
            Context context0 = AppContextProvider.a();
            ibuq.e(context0, "getApplicationContext(...)");
            if(!byej.b(s, context0)) {
                bxyn0.l(Status.g, null, ApiMetadata.b);
                bxzl.g(v1, v, bxzq.c, bxzp.c);
                return;
            }
        }
        azug azug0 = this.p(apiMetadata0, hufl.o());
        byeo byeo0 = new byeo(bxyn0, bxyi0, registerCreationOptionsRequest0, v1, this, null);
        cjul.a(this.d, 0x160, "CreationRegistry", azug0, byeo0);
    }

    @Override  // bxyq
    public final void m(bxyn bxyn0, RegistrationRequest registrationRequest0, ApiMetadata apiMetadata0) {
        ibuq.f(bxyn0, "callbacks");
        ibuq.f(registrationRequest0, "request");
        int v = this.b;
        long v1 = bxzl.a();
        String s = this.f;
        bxyi bxyi0 = new bxyi(s, v, v1, this.e);
        if(!hufl.l()) {
            Context context0 = AppContextProvider.a();
            ibuq.e(context0, "getApplicationContext(...)");
            if(!byej.b(s, context0)) {
                bxyn0.m(Status.g, null, ApiMetadata.b);
                bxzl.g(v1, v, bxzq.b, bxzp.c);
                return;
            }
        }
        azug azug0 = this.p(apiMetadata0, hufl.l());
        byep byep0 = new byep(bxyn0, bxyi0, registrationRequest0, v1, this, null);
        cjul.a(this.d, 0x160, "CredentialRegistry", azug0, byep0);
    }

    @Override  // bxyq
    public final void n(bxyn bxyn0, RegisterExportRequest registerExportRequest0, ApiMetadata apiMetadata0) {
        ibuq.f(bxyn0, "callbacks");
        ibuq.f(registerExportRequest0, "request");
        int v = this.b;
        long v1 = bxzl.a();
        String s = this.f;
        bxyi bxyi0 = new bxyi(s, v, v1, this.e);
        if(!hufl.p()) {
            Context context0 = AppContextProvider.a();
            ibuq.e(context0, "getApplicationContext(...)");
            if(!byej.b(s, context0)) {
                bxyn0.n(Status.g, null, ApiMetadata.b);
                bxzl.g(v1, v, bxzq.d, bxzp.c);
                return;
            }
        }
        azug azug0 = this.p(apiMetadata0, hufl.p());
        byeq byeq0 = new byeq(bxyn0, bxyi0, registerExportRequest0, v1, this, null);
        cjul.a(this.d, 0x160, "CredentialRegistry", azug0, byeq0);
    }

    @Override  // bxyq
    public final void o(bxyn bxyn0, SignalCredentialStateRequest signalCredentialStateRequest0, ApiMetadata apiMetadata0) {
        ibuq.f(bxyn0, "callbacks");
        ibuq.f(signalCredentialStateRequest0, "request");
        long v = bxzl.a();
        String s = this.f;
        bxyi bxyi0 = new bxyi(s, this.b, v, this.e);
        if(hufl.q()) {
            if(hufl.a.c().n()) {
                Context context0 = AppContextProvider.a();
                ibuq.e(context0, "getApplicationContext(...)");
                if(!byes.r(context0, s)) {
                    bxyn0.o(new Status(17, "SignalCredentialState requires app to be in foreground"), null, ApiMetadata.b);
                    return;
                }
            }
            azug azug0 = this.p(apiMetadata0, hufl.q());
            byer byer0 = new byer(bxyn0, bxyi0, signalCredentialStateRequest0, v, null);
            cjul.a(this.d, 0x160, "SignalCredentialState", azug0, byer0);
            return;
        }
        bxyn0.o(Status.g, null, ApiMetadata.b);
    }

    private final azug p(ApiMetadata apiMetadata0, boolean z) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.cm);
        azuf0.g(bbdq.J);
        azuf0.d(this.f);
        azuf0.c(this.g);
        azuf0.h(z);
        return azuf0.a();
    }

    private final bxxx q(Bundle bundle0) {
        ComponentName componentName0 = (ComponentName)bundle0.getParcelable("androidx.identitycredentials.devicesetup.BUNDLE_KEY_COMPONENT_NAME");
        return new bxxx(this.f, this.e, componentName0);
    }

    private static final boolean r(Context context0, String s) {
        Object object0 = context0.getSystemService("activity");
        ibuq.d(object0, "null cannot be cast to non-null type android.app.ActivityManager");
        List list0 = ((ActivityManager)object0).getRunningTasks(1);
        ibuq.e(list0, "getRunningTasks(...)");
        if(list0.isEmpty()) {
            return false;
        }
        ActivityManager.RunningTaskInfo activityManager$RunningTaskInfo0 = (ActivityManager.RunningTaskInfo)list0.get(0);
        Object object1 = null;
        if(activityManager$RunningTaskInfo0 != null) {
            ComponentName componentName0 = activityManager$RunningTaskInfo0.baseActivity;
            if(componentName0 != null) {
                object1 = componentName0.getPackageName();
            }
        }
        return ibuq.m(object1, s);
    }

    private static final boolean s() {
        if(hufl.a.c().w()) {
            ((ggtj)byes.c.h()).x("enablePreuCredmanApi is true");
            return true;
        }
        AppContextProvider.a();
        ((ggtj)byes.c.h()).x("isPreUFlowEnabled is false");
        return false;
    }
}

