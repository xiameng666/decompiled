import com.google.android.gms.trustagent.activeunlock.primary.ui.setup.ExplanationFragment;
import dagger.android.AndroidInjector;

final class eykv implements AndroidInjector {
    private final eylm a;

    public eykv(eylm eylm0) {
        this.a = eylm0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ExplanationFragment explanationFragment0 = (ExplanationFragment)object0;
        explanationFragment0.a = new eynd();
        explanationFragment0.b = (eyet)this.a.aN.get();
        explanationFragment0.c = exeg.a();
    }
}

