import com.google.android.libraries.surveys.SurveyData;
import com.google.android.location.quake.ealert.ux.EAlertUxArgs;
import j..util.Objects;

final class fvwh implements frqw {
    final EAlertUxArgs a;
    final fvwj b;

    public fvwh(fvwj fvwj0, EAlertUxArgs eAlertUxArgs0) {
        this.a = eAlertUxArgs0;
        Objects.requireNonNull(fvwj0);
        this.b = fvwj0;
        super();
    }

    @Override  // frqw
    public final void a(String s, frqv frqv0) {
        ((ggtj)fvwj.a.i()).R("Failed to fetch survey (trigger id: %s, error: %s.)", s, frqv0);
    }

    @Override  // frqw
    public final void b(SurveyData surveyData0) {
        fvwi fvwi0 = new fvwi(this.b, this.a);
        frqn frqn0 = new frqn(this.b.c.getContainerActivity(), surveyData0);
        frqn0.b(0x7F0B1D58, Integer.valueOf(340));  // id:prompt_parent_sheet
        frqn0.c(11);
        frqn0.b = fvwi0;
        frqm.a(frqn0.a());
    }
}

