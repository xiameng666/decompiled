import com.google.android.gms.trustagent.activeunlock.primary.ui.setup.ExplanationFragment;

public final class eyyf extends ibuo implements ibts {
    public eyyf(Object object0) {
        super(1, object0, ExplanationFragment.class, "updateState", "updateState(Lcom/google/android/gms/trustagent/activeunlock/primary/ui/setup/ExplanationUiState;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        eyyx eyyx0 = (eyyx)object0;
        ibuq.f(eyyx0, "p0");
        ExplanationFragment explanationFragment0 = (ExplanationFragment)this.e;
        gafh gafh0 = explanationFragment0.I();
        ibuq.c(gafh0);
        gafh0.c(eyyx0.a.a);
        gafh0.e(explanationFragment0.requireContext(), eyyx0.a.b);
        explanationFragment0.d.c(eyyx0.b);
        return ibom.a;
    }
}

