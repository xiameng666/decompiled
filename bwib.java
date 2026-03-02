import android.os.SystemClock;
import com.google.android.chimera.config.ModuleManager.FeatureRequestListener;

public final class bwib extends ModuleManager.FeatureRequestListener {
    final bwif a;
    private final String b;
    private final ModuleManager.FeatureRequestListener c;

    public bwib(bwif bwif0, String s, ModuleManager.FeatureRequestListener moduleManager$FeatureRequestListener0) {
        ibuq.f(s, "moduleName");
        this.a = bwif0;
        super();
        this.b = s;
        this.c = moduleManager$FeatureRequestListener0;
    }

    @Override  // com.google.android.chimera.config.ModuleManager$FeatureRequestProgressListener
    public final void onRequestComplete(int v) {
        ggtj ggtj0 = (ggtj)bwif.a.h();
        String s = this.b;
        ggtj0.H("ModuleFeatureRequestListener.onRequestComplete(%d) for module %s", v, s);
        switch(v) {
            case 0: {
                bwii bwii0 = this.a.e();
                ibuq.f(s, "moduleName");
                bbup bbup0 = bbuo.a(((ProtoLiteMessage)bbum.a).v_newBuilder());
                bbup0.b(bbul.aH);
                bbux bbux0 = bbuw.a(((ProtoLiteMessage)bbuv.a).v_newBuilder());
                bbux0.c(s);
                bbux0.e(bbuu.b);
                bbux0.b(SystemClock.elapsedRealtime());
                bbup0.c(bbux0.a());
                bwii0.a(bbup0.a());
                break;
            }
            case 1: {
                this.a.e().b(s, 1);
                break;
            }
            case 2: {
                this.a.e().b(s, 2);
                break;
            }
            default: {
                this.a.e().b(s, v);
            }
        }
        ModuleManager.FeatureRequestListener moduleManager$FeatureRequestListener0 = this.c;
        if(moduleManager$FeatureRequestListener0 != null) {
            moduleManager$FeatureRequestListener0.onRequestComplete(v);
        }
    }
}

