import android.app.Activity;
import com.google.android.libraries.surveys.SurveyData;

public final class ehlf implements frqw {
    private static final bboh a;
    private final frqq b;
    private final Activity c;

    static {
        ehlf.a = bboh.b("SIRqstSurveyCallback", bbcu.dO);
    }

    public ehlf(frqq frqq0, Activity activity0) {
        ibuq.f(frqq0, "surveyEventListener");
        ibuq.f(activity0, "activity");
        super();
        this.b = frqq0;
        this.c = activity0;
    }

    @Override  // frqw
    public final void a(String s, frqv frqv0) {
        ibuq.f(s, "triggerId");
        ibuq.f(frqv0, "errorType");
        ((ggtj)ehlf.a.i()).R("Failed to fetch survey (trigger id: %s, error: %s)", s, new gpnd(gpnc.a, frqv0));
    }

    @Override  // frqw
    public final void b(SurveyData surveyData0) {
        frqn frqn0 = new frqn(this.c, surveyData0);
        frqn0.b(0x7F0B1D58, Integer.valueOf(340));  // id:prompt_parent_sheet
        frqn0.b = this.b;
        frqm.a(frqn0.a());
    }
}

