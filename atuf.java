import android.content.Intent;
import com.google.android.gms.cast.activity.CastHatsChimeraActivity;
import com.google.android.libraries.surveys.SurveyMetadata;
import j..util.Objects;

public final class atuf implements frqq {
    final CastHatsChimeraActivity a;

    public atuf(CastHatsChimeraActivity castHatsChimeraActivity0) {
        Objects.requireNonNull(castHatsChimeraActivity0);
        this.a = castHatsChimeraActivity0;
        super();
    }

    @Override  // frqq
    public final void a(SurveyMetadata surveyMetadata0) {
        CastHatsChimeraActivity.j.m("didAnswerOpenTextQuestion");
        Intent intent0 = CastHatsChimeraActivity.a(4);
        intent0.putExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_SURVEY_METADATA", surveyMetadata0);
        this.a.sendBroadcast(intent0);
    }

    @Override  // frqq
    public final void b(SurveyMetadata surveyMetadata0, Integer integer0) {
        CastHatsChimeraActivity.j.n("didAnswerSingleSelectQuestion: choice=%d", integer0);
        Intent intent0 = CastHatsChimeraActivity.a(3);
        intent0.putExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_SURVEY_METADATA", surveyMetadata0);
        this.a.sendBroadcast(intent0);
        this.a.setResult(0);
    }

    @Override  // frqq
    public final void c(SurveyMetadata surveyMetadata0, frqo frqo0) {
        CastHatsChimeraActivity.j.n("onPresentSurveyFailed: errorType=%s", frqo0);
        Intent intent0 = CastHatsChimeraActivity.a(2);
        intent0.putExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_SURVEY_METADATA", surveyMetadata0);
        intent0.putExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_PRESENT_SURVEY_ERROR_TYPE", frqo0.toString());
        this.a.sendBroadcast(intent0);
        this.a.finish();
    }

    @Override  // frqq
    public final void d(SurveyMetadata surveyMetadata0) {
        CastHatsChimeraActivity.j.m("onSurveyClosed");
        Intent intent0 = CastHatsChimeraActivity.a(1);
        intent0.putExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_SURVEY_METADATA", surveyMetadata0);
        this.a.sendBroadcast(intent0);
        this.a.setResult(-1);
        this.a.finish();
    }

    @Override  // frqq
    public final void e(SurveyMetadata surveyMetadata0) {
        CastHatsChimeraActivity.j.m("onSurveyPrompted");
        Intent intent0 = CastHatsChimeraActivity.a(0);
        intent0.putExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_SURVEY_METADATA", surveyMetadata0);
        this.a.sendBroadcast(intent0);
    }
}

