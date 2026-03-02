import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.TypedValue;

public final class ehnl implements ehne {
    public final int a;
    public ValueAnimator b;
    public final ValueAnimator c;
    public static final int d;
    private final Context e;
    private final int f;

    static {
        bboh.b("ViewHighlighterImpl", bbcu.dO);
    }

    public ehnl(Context context0) {
        ibuq.f(context0, "ctx");
        super();
        this.e = context0;
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(0x101030E, typedValue0, true);
        int v = typedValue0.resourceId;
        this.a = v;
        int v1 = context0.getColor(0x7F060E01);  // color:preference_highlight_color
        this.f = v1;
        ValueAnimator valueAnimator0 = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{v, v1});
        ibuq.e(valueAnimator0, "ofObject(...)");
        valueAnimator0.setDuration(200L);
        valueAnimator0.setRepeatMode(2);
        valueAnimator0.setRepeatCount(4);
        this.b = valueAnimator0;
        ValueAnimator valueAnimator1 = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{v1, v});
        valueAnimator1.setDuration(500L);
        ibuq.c(valueAnimator1);
        this.c = valueAnimator1;
    }

    @Override  // ehne
    public final void a(oij oij0) {
        ibuq.f(oij0, "holder");
        oij0.n(false);
        oij0.a.postDelayed(new ehnh(this, oij0), 900L);
    }
}

