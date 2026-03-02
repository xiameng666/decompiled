import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.chimera.config.ModuleManager.ModuleApkInfo;
import com.google.android.chimera.config.ModuleManager.ModuleInfo;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.chimera.modules.accountsettings.AppContextProvider;
import j..time.Duration;
import java.util.TimeZone;

@ibnh
public final class aavk {
    static final String[] a;
    public static final baun b;
    public final Context c;
    private static final gful_cronetEngineProvider d;
    private final gful_cronetEngineProvider e;
    private final gful_cronetEngineProvider f;
    private final gful_cronetEngineProvider g;
    private final aauo h;

    static {
        aavk.a = new String[]{"com.google.android.webview", "com.android.webview"};
        aavk.b = new baun("AccountSettings", new String[]{"RequestContextHelper"});
        aavk.d = gfus.b(((gful_cronetEngineProvider)new aavh()), Duration.ofHours(1L));
    }

    public aavk(ModuleManager moduleManager0, aauo aauo0) {
        this.c = AppContextProvider.a();
        this.h = aauo0;
        this.e = gfus.b(((gful_cronetEngineProvider)new aavj(moduleManager0)), Duration.ofHours(1L));
        this.f = gfus.b(((gful_cronetEngineProvider)new aavi(this)), Duration.ofMillis(hojn.a.g().p()));
        this.g = aavk.d;
    }

    public final grvm a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grvm.a).v_newBuilder();
        String s = Build.VERSION.RELEASE;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grvm grvm0 = (grvm)hftp0.b_message;
        s.getClass();
        grvm0.b |= 1;
        grvm0.c = s;
        String s1 = Integer.toString(Build.VERSION.SDK_INT);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grvm grvm1 = (grvm)hftp0.b_message;
        s1.getClass();
        grvm1.b |= 2;
        grvm1.d = s1;
        String s2 = Integer.toString(0xF1B18AD);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grvm grvm2 = (grvm)hftp0.b_message;
        s2.getClass();
        grvm2.b |= 16;
        grvm2.f = s2;
        if(hojn.n()) {
            String s3 = (String)this.f.mr();
            if(s3 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                grvm grvm3 = (grvm)hftp0.b_message;
                grvm3.b |= 4;
                grvm3.e = s3;
            }
        }
        gful_cronetEngineProvider gful0 = this.e;
        ModuleManager.ModuleInfo moduleManager$ModuleInfo0 = (ModuleManager.ModuleInfo)((ggeo)gful0.mr()).get("accountsettings");
        if(moduleManager$ModuleInfo0 != null) {
            String s4 = Integer.toString(moduleManager$ModuleInfo0.moduleVersion);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            s4.getClass();
            ((grvm)hftv0).b |= 0x20;
            ((grvm)hftv0).g = s4;
            ModuleManager.ModuleApkInfo moduleManager$ModuleApkInfo0 = moduleManager$ModuleInfo0.moduleApk;
            if(moduleManager$ModuleApkInfo0 != null) {
                String s5 = moduleManager$ModuleApkInfo0.apkVersionName;
                if(s5 != null) {
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    grvm grvm4 = (grvm)hftp0.b_message;
                    grvm4.b |= 0x40;
                    grvm4.h = s5;
                }
            }
        }
        ModuleManager.ModuleInfo moduleManager$ModuleInfo1 = (ModuleManager.ModuleInfo)((ggeo)gful0.mr()).get("octarine");
        String s6 = moduleManager$ModuleInfo1 == null ? null : Integer.toString(moduleManager$ModuleInfo1.moduleVersion);
        if(s6 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grvm grvm5 = (grvm)hftp0.b_message;
            grvm5.b |= 0x80;
            grvm5.i = s6;
        }
        return (grvm)hftp0.N_build();
    }

    public final grxq b(String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grxq.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        boolean z = true;
        ((grxq)hftp0.b_message).c = 1;
        ((grxq)hftp0.b_message).b |= 1;
        grvk grvk0 = this.h.b();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grxq grxq0 = (grxq)hftp0.b_message;
        grvk0.getClass();
        grxq0.d = grvk0;
        grxq0.b |= 2;
        grvm grvm0 = this.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grxq grxq1 = (grxq)hftp0.b_message;
        grvm0.getClass();
        grxq1.e = grvm0;
        grxq1.b |= 4;
        String s1 = TimeZone.getDefault().getID();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grxq grxq2 = (grxq)hftp0.b_message;
        s1.getClass();
        grxq2.b |= 8;
        grxq2.f = s1;
        int v = this.c.getResources().getDisplayMetrics().densityDpi;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grxq grxq3 = (grxq)hftp0.b_message;
        grxq3.b |= 16;
        grxq3.g = v;
        if(AppContextProvider.a().getResources().getConfiguration().getLayoutDirection() != 1) {
            z = false;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grxq grxq4 = (grxq)hftp0.b_message;
        grxq4.b |= 0x40;
        grxq4.h = z;
        boolean z1 = ((Boolean)this.g.mr()).booleanValue();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((grxq)hftv0).b |= 0x200;
        ((grxq)hftv0).i = z1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        grxq grxq5 = (grxq)hftp0.b_message;
        grxq5.b |= 0x400;
        grxq5.j = s;
        return (grxq)hftp0.N_build();
    }
}

