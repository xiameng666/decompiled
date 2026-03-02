import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.chimera.config.ModuleManager.FeatureCheck;
import com.google.android.chimera.config.ModuleManager.FeatureRequest;
import com.google.android.chimera.config.ModuleManager.FeatureRequestListener;
import com.google.android.chimera.config.ModuleManager;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class bwif implements bwih {
    public static final bboh a;
    public ModuleManager b;
    public bwim c;
    public bbku d;
    public final Map e;
    public bwii f;
    public bwgv g;
    private static final Set h;
    private final Context i;
    private final bwiz j;

    static {
        bwif.a = bboh.b("HomeStubModuleLoader", bbcu.fA);
        bwif.h = ibqg.c(new String[]{bwgm.v.a, faly.a.a, bwja.a.a, "threadnetwork_agent"});
    }

    public bwif(Context context0) {
        ibuq.f(context0, "context");
        super();
        this.i = context0;
        this.e = new LinkedHashMap();
        this.j = new bwiz(context0);
    }

    public final ModuleManager a() {
        ModuleManager moduleManager0 = this.b;
        if(moduleManager0 != null) {
            return moduleManager0;
        }
        ibuq.j("moduleManager");
        return null;
    }

    public final bwim b() {
        bwim bwim0 = this.c;
        if(bwim0 != null) {
            return bwim0;
        }
        ibuq.j("hubAdvertisingClient");
        return null;
    }

    @Override  // bwih
    public final void c() {
        hfuo hfuo0 = htyb.c().b;
        ibuq.e(hfuo0, "getElementList(...)");
        if(!hfuo0.isEmpty()) {
            bboh bboh0 = bwif.a;
            ((ggtj)bboh0.j()).x("**** Emergency uninstall of Home dependency modules requested. ****");
            for(Object object0: hfuo0) {
                String s = (String)object0;
                if(bwif.h.contains(s)) {
                    ibuq.c(s);
                    if(!this.i(s)) {
                        continue;
                    }
                    ModuleManager.FeatureRequest moduleManager$FeatureRequest0 = new ModuleManager.FeatureRequest();
                    moduleManager$FeatureRequest0.unrequestFeature(s);
                    moduleManager$FeatureRequest0.setForceUnrequest();
                    moduleManager$FeatureRequest0.setUrgent(new bwie(s));
                    if(this.a().requestFeatures(moduleManager$FeatureRequest0)) {
                        ((ggtj)bboh0.h()).B("%s module UN-request accepted by GmsCore.", s);
                    }
                    else {
                        ((ggtj)bboh0.j()).B("GmsCore refused %s module UN-request.", s);
                    }
                }
                else {
                    ((ggtj)bboh0.j()).B("Emergency uninstall of %s is not supported.", s);
                }
            }
        }
        if(!htyb.c().b.contains(bwgm.v.a)) {
            if(!htyb.a.d().h()) {
                ((ggtj)bwif.a.h()).x("Stub sees download_always flag FALSE.");
                return;
            }
            if(htxy.a.b().c() && !this.j.a()) {
                ((ggtj)bwif.a.h()).x("Home download not enabled: this device does not support energy modes.");
                return;
            }
            if(htxy.d()) {
                bwgv bwgv0 = this.g;
                if(bwgv0 == null) {
                    ibuq.j("ghpMetricsLogger");
                    bwgv0 = null;
                }
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)habn.a).v_newBuilder();
                ibuq.f(hftp0, "builder");
                habm habm0 = habm.u;
                ibuq.f(habm0, "value");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                habn habn0 = (habn)hftp0.b_message;
                habn0.e = habm0.a();
                habn0.b |= 1;
                ProtoLiteMessage hftv0 = hftp0.N_build();
                ibuq.e(hftv0, "build(...)");
                bwgv0.a(((habn)hftv0));
            }
            bwiz bwiz0 = this.j;
            if(bwiz0.a()) {
                bboh bboh1 = bwif.a;
                ((ggtj)bboh1.h()).B("Current system energy mode: %s", bwiy.a(bwiz0.b));
                if(bwiy.c(bwiz0.b)) {
                    ((ggtj)bboh1.h()).x("System is in high energy mode.");
                    this.g(false);
                    if(htxy.d() && htxy.c()) {
                        ((ggtj)bboh1.h()).x("Stopping Hub advertisements");
                        bwim bwim0 = this.b();
                        Intent intent0 = new Intent().setClassName(((bwin)bwim0).b, "com.google.android.gms.home.stub.GhpHubAdvertisingService");
                        if(!((bwin)bwim0).b.stopService(intent0)) {
                            ((ggtj)bwin.a.j()).x("No advertising service to stop");
                        }
                    }
                    return;
                }
                if(htxy.d() && htxy.c()) {
                    ((ggtj)bboh1.h()).x("Starting Ghp Hub advertisements");
                    bwim bwim1 = this.b();
                    ibuq.f(bwhm.e, "runState");
                    Intent intent1 = new Intent();
                    intent1.setClassName(((bwin)bwim1).b, "com.google.android.gms.home.stub.GhpHubAdvertisingService");
                    intent1.putExtra("rs", bwio.a(bwhm.e));
                    if(((bwin)bwim1).b.startService(intent1) == null) {
                        ((ggtj)bwin.a.j()).x("Error starting Hub Advertising service");
                        ((ggtj)bboh1.j()).z("Failed to start Ghp Hub advertisements: %d", -1);
                    }
                }
                ((ggtj)bboh1.h()).x("Monitoring for energy mode changes");
                ibuq.f(this.i, "context");
                Intent intent2 = new Intent();
                intent2.setClassName(this.i, "com.google.android.gms.home.stub.PowerMonitoringService");
                this.i.startService(intent2);
                return;
            }
            ((ggtj)bwif.a.h()).x("Stub sees download_always flag (no power modes).");
            this.g(false);
            return;
        }
        ((ggtj)bwif.a.h()).x("Emergency uninstall of HOME is enabled.");
    }

    public final boolean d(String s, ModuleManager.FeatureRequestListener moduleManager$FeatureRequestListener0) {
        if(htyb.c().b.contains(s)) {
            ((ggtj)bwif.a.h()).x("Skip downloading %s module: emergency uninstall is enabled.");
            return true;
        }
        if(this.i(s)) {
            ((ggtj)bwif.a.h()).B("Skip downloading %s module:stub sees module already available.", s);
            return true;
        }
        bwii bwii0 = this.e();
        ibuq.f(s, "moduleName");
        bbup bbup0 = bbuo.a(((ProtoLiteMessage)bbum.a).v_newBuilder());
        bbup0.b(bbul.aG);
        bbux bbux0 = bbuw.a(((ProtoLiteMessage)bbuv.a).v_newBuilder());
        bbux0.c(s);
        bbux0.d(bbut.b);
        bbux0.e(bbuu.b);
        bbux0.b(SystemClock.elapsedRealtime());
        bbup0.c(bbux0.a());
        bwii0.a(bbup0.a());
        bwib bwib0 = new bwib(this, s, moduleManager$FeatureRequestListener0);
        bwia bwia0 = new bwia(this, s);
        ModuleManager.FeatureRequest moduleManager$FeatureRequest0 = new ModuleManager.FeatureRequest();
        moduleManager$FeatureRequest0.requestFeatureAtAnyVersion(s);
        moduleManager$FeatureRequest0.setUrgent(new bwid(bwib0, s, this));
        if(!this.a().requestFeatures(moduleManager$FeatureRequest0)) {
            ((ggtj)bwif.a.j()).B("GmsCore refused %s module request.", s);
            bwia0.a();
            return false;
        }
        ((ggtj)bwif.a.h()).B("%s module request accepted by GmsCore.", s);
        return true;
    }

    public final bwii e() {
        bwii bwii0 = this.f;
        if(bwii0 != null) {
            return bwii0;
        }
        ibuq.j("metricsLogger");
        return null;
    }

    public final void f() {
        Provider provider0 = DoubleCheck.b(new bwiw());
        Provider provider1 = DoubleCheck.b(new bwgp());
        Provider provider2 = DoubleCheck.b(bwgn.a);
        Provider provider3 = DoubleCheck.b(bwgt.a);
        this.b = (ModuleManager)provider0.get();
        this.f = new bwii(new bwgr(bwij.a(), ((ayud)provider1.get()), new azts(bwij.a(), new faig()), ((cfsl)provider2.get())));
        this.c = new bwin(bwij.a());
        this.d = new bbll(4, 10);
        this.g = (bwgv)provider3.get();
    }

    @Override  // bwih
    public final void g(boolean z) {
        if(z) {
            bwii bwii0 = this.e();
            ibuq.e(bwgm.v.a, "getName(...)");
            ibuq.f(bwgm.v.a, "moduleName");
            bbup bbup0 = bbuo.a(((ProtoLiteMessage)bbum.a).v_newBuilder());
            bbup0.b(bbul.aG);
            bbux bbux0 = bbuw.a(((ProtoLiteMessage)bbuv.a).v_newBuilder());
            bbux0.c(bwgm.v.a);
            bbux0.d(bbut.c);
            bbux0.e(bbuu.b);
            bbux0.b(SystemClock.elapsedRealtime());
            bbup0.c(bbux0.a());
            bwii0.a(bbup0.a());
        }
        ibuq.e(bwgm.v.a, "getName(...)");
        if(!this.d(bwgm.v.a, null)) {
            return;
        }
        ibuq.e(faly.a.a, "getName(...)");
        bwif.h(this, faly.a.a);
        if(htyb.a.d().i()) {
            if(this.i.getSystemService("thread_network") != null) {
                bwif.h(this, "threadnetwork_agent");
                return;
            }
            ((ggtj)bwif.a.h()).x("Not downloading Thread module: Thread feature not available.");
            return;
        }
        ((ggtj)bwif.a.h()).x("Thread download is not enabled.");
    }

    static void h(bwif bwif0, String s) {
        bwif0.d(s, null);
    }

    private final boolean i(String s) {
        if(htyb.a.d().j()) {
            ((ggtj)bwif.a.h()).B("Flag-forced to assume %s module is not installed.", s);
            return false;
        }
        ModuleManager.FeatureCheck moduleManager$FeatureCheck0 = new ModuleManager.FeatureCheck();
        moduleManager$FeatureCheck0.checkFeatureAtAnyVersion(s);
        return this.a().checkFeaturesAreAvailable(moduleManager$FeatureCheck0) == 0;
    }
}

