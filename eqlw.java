import android.content.Context;
import com.google.android.chimera.config.ModuleManager.ModuleInfo;
import com.google.android.chimera.config.ModuleManager;

public final class eqlw {
    private eqlu a;
    private eqlv b;

    public final eqlu a() {
        gftb.r(this.b == null, "Don\'t use getTargetHelper() and getSourceHelper() at the same time!");
        if(this.a == null) {
            this.a = new eqlu();
        }
        return this.a;
    }

    public final eqlv b() {
        gftb.r(this.a == null, "Don\'t use getTargetHelper() and getSourceHelper() at the same time!");
        if(this.b == null) {
            this.b = new eqlv();
        }
        return this.b;
    }

    public static void c(Context context0, ProtoLiteBuilder hftp0) {
        for(Object object0: ModuleManager.get(context0).getAllModules()) {
            ModuleManager.ModuleInfo moduleManager$ModuleInfo0 = (ModuleManager.ModuleInfo)object0;
            if("com.google.android.gms.smartdevice".equals(moduleManager$ModuleInfo0.moduleId)) {
                if(!"com.google.android.gms".equals((moduleManager$ModuleInfo0.moduleApk == null ? null : moduleManager$ModuleInfo0.moduleApk.apkPackageName))) {
                    String s = moduleManager$ModuleInfo0.moduleApk.apkPackageName;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gjoc gjoc0 = (gjoc)hftp0.b_message;
                    s.getClass();
                    gjoc0.b |= 16;
                    gjoc0.g = s;
                }
                int v = moduleManager$ModuleInfo0.moduleVersion;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gjoc gjoc1 = (gjoc)hftp0.b_message;
                gjoc1.b |= 0x20;
                gjoc1.h = v;
                return;
            }
        }
    }
}

