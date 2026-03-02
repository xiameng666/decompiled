import android.content.Context;
import android.webkit.JavascriptInterface;
import com.google.android.chimera.config.ModuleManager.ModuleInfo;
import com.google.android.chimera.config.ModuleManager;

public final class epqc {
    private final Context a;
    private final epqb b;

    public epqc(Context context0, epqb epqb0) {
        this.a = context0;
        this.b = epqb0;
    }

    @JavascriptInterface
    public void cancel() {
        ((epqa)this.b).b.q(gfqx.a);
    }

    @JavascriptInterface
    public int getModuleVersion() {
        int v = epvd.b;
        Context context0 = this.a;
        if(v != -1) {
            return v;
        }
        try {
            for(Object object0: ModuleManager.get(context0).getAllModules()) {
                ModuleManager.ModuleInfo moduleManager$ModuleInfo0 = (ModuleManager.ModuleInfo)object0;
                if(moduleManager$ModuleInfo0.moduleId.equals("com.google.android.gms.signin")) {
                    epvd.b = moduleManager$ModuleInfo0.moduleVersion;
                    return moduleManager$ModuleInfo0.moduleVersion;
                }
            }
        }
        catch(Exception exception0) {
            epvd.a.g("Failed to get the module version: %s", exception0, new Object[0]);
        }
        return -1;
    }

    @JavascriptInterface
    public void setConsentResult(String s) {
        gfsx gfsx0 = gfsx.m(s);
        ((epqa)this.b).b.q(gfsx0);
    }

    @JavascriptInterface
    public void showView() {
        ((xob)((du)this.b).requireContext()).runOnUiThread(new eppv(((epqa)this.b)));
    }
}

