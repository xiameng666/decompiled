import android.content.Context;

public final class cjml implements ibtw {
    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        ibuq.f(((Context)object0), "context");
        ibuq.f(((String)object1), "featureName");
        avzd avzd0 = new avzd();
        avzd0.a(((String)object1));
        return avze.a(((Context)object0), avzd0) == 0 ? Boolean.valueOf(true) : Boolean.valueOf(false);
    }
}

