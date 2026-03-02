import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager.ModuleInfo;
import com.google.android.chimera.config.ModuleManager;

final class aavj implements gful_cronetEngineProvider {
    private static final ggfp a;
    private final ModuleManager b;

    static {
        aavj.a = ggfp.K("accountsettings", "octarine");
    }

    public aavj(ModuleManager moduleManager0) {
        this.b = moduleManager0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ggek ggek0 = new ggek();
        try {
            for(Object object0: this.b.getAllModules()) {
                ModuleManager.ModuleInfo moduleManager$ModuleInfo0 = (ModuleManager.ModuleInfo)object0;
                if(moduleManager$ModuleInfo0 != null) {
                    String s = moduleManager$ModuleInfo0.moduleId;
                    if(s != null) {
                        String s1 = s.replace("com.google.android.gms.", "");
                        if(aavj.a.contains(s1)) {
                            ggek0.i(s1, moduleManager$ModuleInfo0);
                        }
                    }
                }
            }
        }
        catch(InvalidConfigException invalidConfigException0) {
            aavk.b.e("Can\'t retrieve module versions", invalidConfigException0, new Object[0]);
        }
        return ggek0.b();
    }
}

