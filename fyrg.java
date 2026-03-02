import android.animation.ValueAnimator;
import android.content.Context;

final class fyrg extends lkj {
    @Override  // lkj
    public final float a(Object object0) {
        return ((fyrh)object0).d() * 10000.0f;
    }

    @Override  // lkj
    public final void b(Object object0, float f) {
        ((fyrh)object0).f(f / 10000.0f);
        if(((fyrh)object0).j.c(true)) {
            if(((fyrh)object0).d == null) {
                Context context0 = ((fyrh)object0).i;
                ((fyrh)object0).f = fyoy.a(context0, 0x7F0408E3, fycp.a);  // attr:motionEasingStandardInterpolator
                ((fyrh)object0).g = fyoy.a(context0, 0x7F0408DB, fycp.a);  // attr:motionEasingEmphasizedAccelerateInterpolator
                ((fyrh)object0).d = new ValueAnimator();
                ((fyrh)object0).d.setDuration(500L);
                ((fyrh)object0).d.setFloatValues(new float[]{0.0f, 1.0f});
                ((fyrh)object0).d.setInterpolator(null);
                ((fyrh)object0).d.addUpdateListener(new fyre(((fyrh)object0)));
            }
            float f1 = ((fyrh)object0).c(((int)f));
            if(f1 != ((fyrh)object0).c) {
                if(((fyrh)object0).d.isRunning()) {
                    ((fyrh)object0).d.cancel();
                }
                ((fyrh)object0).c = f1;
                if(f1 == 1.0f) {
                    ((fyrh)object0).e = ((fyrh)object0).f;
                    ((fyrh)object0).d.start();
                    return;
                }
                ((fyrh)object0).e = ((fyrh)object0).g;
                ((fyrh)object0).d.reverse();
                return;
            }
            if(!((fyrh)object0).d.isRunning()) {
                ((fyrh)object0).e(f1);
            }
        }
    }
}

