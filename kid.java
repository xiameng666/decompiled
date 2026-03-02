import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;

final class kid implements Runnable {
    final kie a;

    public kid(kie kie0) {
        this.a = kie0;
        super();
    }

    @Override
    public final void run() {
        kie kie0 = this.a;
        if(!kie0.e) {
            return;
        }
        if(kie0.c) {
            kie0.c = false;
            long v = AnimationUtils.currentAnimationTimeMillis();
            kie0.a.e = v;
            kie0.a.g = -1L;
            kie0.a.f = v;
            kie0.a.h = 0.5f;
        }
        kic kic0 = kie0.a;
        if(kic0.g > 0L && AnimationUtils.currentAnimationTimeMillis() > kic0.g + ((long)kic0.i) || !kie0.b()) {
            kie0.e = false;
            return;
        }
        if(kie0.d) {
            kie0.d = false;
            long v1 = SystemClock.uptimeMillis();
            MotionEvent motionEvent0 = MotionEvent.obtain(v1, v1, 3, 0.0f, 0.0f, 0);
            kie0.b.onTouchEvent(motionEvent0);
            motionEvent0.recycle();
        }
        if(kic0.f == 0L) {
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }
        long v2 = AnimationUtils.currentAnimationTimeMillis();
        float f = kic0.a(v2);
        long v3 = v2 - kic0.f;
        kic0.f = v2;
        kie0.f.scrollListBy(((int)(((float)v3) * (-4.0f * f * f + f * 4.0f) * kic0.d)));
        kie0.b.postOnAnimation(this);
    }
}

