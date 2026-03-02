import com.google.android.libraries.surveys.SurveyData;
import j..util.Objects;

public final class bvwr implements frqw {
    final int a;
    final bvws b;

    public bvwr(bvws bvws0, int v) {
        this.a = v;
        Objects.requireNonNull(bvws0);
        this.b = bvws0;
        super();
    }

    @Override  // frqw
    public final void a(String s, frqv frqv0) {
        ((ggtj)bvws.a.j()).R("Request failed for trigger id: %s with ErrorType: %s", s, frqv0);
    }

    @Override  // frqw
    public final void b(SurveyData surveyData0) {
        frqn frqn0 = new frqn(this.b.c, surveyData0);
        frqn0.b(this.a, Integer.valueOf(1000));
        frqm.a(frqn0.a());
    }
}

