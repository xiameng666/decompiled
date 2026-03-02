import android.content.Context;
import com.google.android.chimera.config.ModuleManager.ModuleInfo;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.chimera.modules.ipa.AppContextProvider;
import java.util.Iterator;
import java.util.Random;

public final class cakj {
    public static final int a;
    private static cakj b;
    private final Context c;
    private final Random d;
    private final faik e;
    private int f;

    static {
        bboh.b("GmscoreIpa", bbcu.ee);
    }

    public cakj() {
        this.f = -1;
        Context context0 = AppContextProvider.a();
        this.c = context0;
        this.d = new Random();
        this.e = faih.a(context0);
    }

    public static cakj a() {
        synchronized(cakj.class) {
            synchronized(cakj.class) {
                if(cakj.b == null) {
                    cakj.b = new cakj();
                }
            }
        }
        return cakj.b;
    }

    public final void b(gisx gisx0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gisy.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gisy gisy0 = (gisy)hftp0.b_message;
        gisx0.getClass();
        gisy0.g = gisx0;
        gisy0.b |= 16;
        this.e(hftp0, huhz.b());
    }

    public final void c(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gisz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gisz)hftp0.b_message).b = v;
        gisz gisz0 = (gisz)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gisy.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gisy gisy0 = (gisy)hftp1.b_message;
        gisz0.getClass();
        gisy0.e = gisz0;
        gisy0.b |= 1;
        this.e(hftp1, huhz.b());
    }

    public final void d(gitb gitb0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gisy.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gisy gisy0 = (gisy)hftp0.b_message;
        gitb0.getClass();
        gisy0.f = gitb0;
        gisy0.b |= 2;
        long v = huhz.b();
        if((gitb0.b & 2) != 0 && huhz.o()) {
            v = huhz.a.h().z();
        }
        this.e(hftp0, v);
    }

    final void e(ProtoLiteBuilder hftp0, long v) {
        int v1;
        if(v > 0L && this.d.nextInt(((int)v)) == 0) {
            if(this.f < 0) {
                try {
                    Iterator iterator0 = ModuleManager.get(AppContextProvider.a()).getAllModules().iterator();
                    while(true) {
                    label_3:
                        if(!iterator0.hasNext()) {
                            goto label_12;
                        }
                        Object object0 = iterator0.next();
                        ModuleManager.ModuleInfo moduleManager$ModuleInfo0 = (ModuleManager.ModuleInfo)object0;
                        if(moduleManager$ModuleInfo0.moduleId.equals("com.google.android.gms.ipa")) {
                            this.f = moduleManager$ModuleInfo0.moduleVersion;
                            goto label_12;
                        }
                    }
                }
                catch(Exception unused_ex) {
                    this.f = 0;
                    goto label_12;
                }
                goto label_3;
            }
            else {
            label_12:
                v1 = this.f;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
            }
            ((gisy)hftp0.b_message).c = v1;
            long v2 = bbrc.h();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gisy)hftp0.b_message).d = v2;
            this.e.cp().b(new caki(hftp0));
        }
    }
}

