import com.google.android.libraries.surveys.SurveyMetadata;

public final class ehlg implements frqq {
    private static final bboh a;

    static {
        ehlg.a = bboh.b("SISurveyEventListener", bbcu.dO);
    }

    @Override  // frqq
    public final void a(SurveyMetadata surveyMetadata0) {
    }

    @Override  // frqq
    public final void b(SurveyMetadata surveyMetadata0, Integer integer0) {
    }

    @Override  // frqq
    public final void c(SurveyMetadata surveyMetadata0, frqo frqo0) {
        ibuq.f(frqo0, "errorType");
        ((ggtj)ehlg.a.i()).X("onPresentSurveyFailed Trigger ID %s, Survey ID: %s, Error type: %s", surveyMetadata0.a, surveyMetadata0.b, frqo0);
    }

    @Override  // frqq
    public final void d(SurveyMetadata surveyMetadata0) {
        ((ggtj)ehlg.a.h()).R("onSurveyClosed Trigger ID %s, Survey ID: %s", surveyMetadata0.a, surveyMetadata0.b);
    }

    @Override  // frqq
    public final void e(SurveyMetadata surveyMetadata0) {
        ((ggtj)ehlg.a.h()).R("onSurveyPrompted Trigger ID %s, Survey ID: %s", surveyMetadata0.a, surveyMetadata0.b);
    }
}

