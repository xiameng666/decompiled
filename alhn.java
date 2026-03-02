import android.content.Context;
import com.google.android.chimera.config.ModuleManager.FeatureCheck;
import com.google.android.chimera.config.ModuleManager.FeatureRequest;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import java.util.List;

public final class alhn {
    private static final baun a;
    private final alhp b;
    private final ModuleManager c;
    private final Context d;

    static {
        alhn.a = new baun("ProximityAuth", new String[]{"FeatureLoader"});
    }

    public alhn(Context context0, ModuleManager moduleManager0, alhp alhp0) {
        this.d = context0;
        this.b = alhp0;
        this.c = moduleManager0;
    }

    public final void a() {
        hpzf hpzf0 = hpzf.a;
        if(!hpzf0.b().a()) {
            aliu aliu0 = new aliu();
            if(hpzf0.b().b()) {
                ModuleManager.FeatureCheck moduleManager$FeatureCheck0 = new ModuleManager.FeatureCheck();
                String s = amjy.a.a;
                moduleManager$FeatureCheck0.checkFeatureAtAnyVersion(s);
                int v = this.c.checkFeaturesAreAvailable(moduleManager$FeatureCheck0);
                baun baun0 = alhn.a;
                baun0.h("auth_easyunlock module load status: %d", new Object[]{v});
                if(v != 0) {
                    List list0 = alft.b(this.d, false, null);
                    if(list0 != null) {
                        for(Object object0: list0) {
                            if(((SyncedCryptauthDevice)object0).l.contains(gqus.c.name())) {
                                baun0.h("Requesting features since there is an eligible device.", new Object[0]);
                                aliu0.r(0);
                                aliu aliu1 = new aliu();
                                alit alit0 = aliu1.a("feature_requester_request_time");
                                alho alho0 = new alho(this.b, aliu1, alit0);
                                ModuleManager.FeatureRequest moduleManager$FeatureRequest0 = new ModuleManager.FeatureRequest();
                                moduleManager$FeatureRequest0.requestFeatureAtLatestVersion(s);
                                moduleManager$FeatureRequest0.setUrgent(alho0);
                                this.b.a.requestFeatures(moduleManager$FeatureRequest0);
                                return;
                            }
                        }
                    }
                    aliu0.r(1);
                    return;
                }
                aliu0.r(3);
                return;
            }
            aliu0.r(2);
            return;
        }
        alhn.a.h("Unrequesting features due to killswitch", new Object[0]);
        ModuleManager.FeatureRequest moduleManager$FeatureRequest1 = new ModuleManager.FeatureRequest();
        moduleManager$FeatureRequest1.unrequestFeature(amjy.a.a);
        this.b.a.requestFeatures(moduleManager$FeatureRequest1);
    }
}

