import com.google.android.chimera.config.ModuleManager.FeatureCheck;
import com.google.android.chimera.config.ModuleManager.FeatureRequest;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.learning.module.ModuleUpdatedIntentOperation;
import j..util.Objects;
import java.util.concurrent.TimeUnit;

public final class ccfm implements gmbg {
    final ModuleManager a;
    final long b;
    final cbyw c;
    final cbzh d;
    final fmzu e;

    public ccfm(ModuleUpdatedIntentOperation moduleUpdatedIntentOperation0, ModuleManager moduleManager0, long v, cbyw cbyw0, cbzh cbzh0, fmzu fmzu0) {
        this.a = moduleManager0;
        this.b = v;
        this.c = cbyw0;
        this.d = cbzh0;
        this.e = fmzu0;
        Objects.requireNonNull(moduleUpdatedIntentOperation0);
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        this.d.c(696);
        this.e.close();
    }

    @Override  // gmbg
    public final void b(Object object0) {
        ModuleManager.FeatureCheck moduleManager$FeatureCheck0 = new ModuleManager.FeatureCheck();
        moduleManager$FeatureCheck0.checkFeatureAtAnyVersion("brella_dynamite");
        ModuleManager moduleManager0 = this.a;
        boolean z = true;
        switch(moduleManager0.checkFeaturesAreAvailable(moduleManager$FeatureCheck0)) {
            case 0: 
            case 2: {
                break;
            }
            default: {
                z = false;
            }
        }
        TimeUnit timeUnit0 = TimeUnit.SECONDS;
        hfwn hfwn0 = ((fnaq)object0).c;
        if(hfwn0 == null) {
            hfwn0 = hfwn.a;
        }
        if(z && (timeUnit0.toMillis(hfwn0.b) < this.b || !this.c.P())) {
            ModuleManager.FeatureRequest moduleManager$FeatureRequest0 = new ModuleManager.FeatureRequest();
            moduleManager$FeatureRequest0.unrequestFeature("brella_dynamite");
            if(moduleManager0.requestFeatures(moduleManager$FeatureRequest0)) {
                this.d.e(698, ((fnaq)object0).d);
            }
            else {
                this.d.c(697);
            }
        }
        else {
            this.d.b(603);
        }
        this.e.close();
    }
}

