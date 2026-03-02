import com.google.android.gms.trustagent.activeunlock.primary.ui.setup.ExplanationFragment;
import dagger.android.AndroidInjector;

final class eymf implements AndroidInjector {
    private final eymy a;

    public eymf(eymy eymy0) {
        this.a = eymy0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ExplanationFragment explanationFragment0 = (ExplanationFragment)object0;
        explanationFragment0.a = new eynd();
        explanationFragment0.b = (eyet)this.a.aP.get();
        explanationFragment0.c = exeg.a();
    }
}

