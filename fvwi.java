import com.google.android.libraries.surveys.SurveyMetadata;
import com.google.android.location.quake.ealert.ux.EAlertUxArgs;
import j..util.Objects;

final class fvwi implements frqq {
    final EAlertUxArgs a;

    public fvwi(fvwj fvwj0, EAlertUxArgs eAlertUxArgs0) {
        this.a = eAlertUxArgs0;
        Objects.requireNonNull(fvwj0);
        super();
    }

    @Override  // frqq
    public final void a(SurveyMetadata surveyMetadata0) {
    }

    @Override  // frqq
    public final void b(SurveyMetadata surveyMetadata0, Integer integer0) {
    }

    @Override  // frqq
    public final void c(SurveyMetadata surveyMetadata0, frqo frqo0) {
        ((ggtj)fvwj.a.i()).B("Failed to present survey (error: %s.)", frqo0);
    }

    @Override  // frqq
    public final void d(SurveyMetadata surveyMetadata0) {
    }

    @Override  // frqq
    public final void e(SurveyMetadata surveyMetadata0) {
        if(huqb.a.s().aH()) {
            fxmt.b();
            cczb cczb0 = cedm.v().b(((gful_cronetEngineProvider)new fxmy(this.a.h, this.a.i, fxmt.c(this.a.k), surveyMetadata0.c)));
            cczb0.c = (int)28;
            cczb0.a();
        }
    }
}

