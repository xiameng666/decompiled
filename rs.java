import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

final class rs implements Runnable {
    final rt a;

    public rs(rt rt0) {
        this.a = rt0;
        super();
    }

    @Override
    public final void run() {
        rt rt0 = this.a;
        rt0.d();
        View view0 = rt0.c;
        if(view0.isEnabled() && !view0.isLongClickable() && rt0.b()) {
            view0.getParent().requestDisallowInterceptTouchEvent(true);
            long v = SystemClock.uptimeMillis();
            MotionEvent motionEvent0 = MotionEvent.obtain(v, v, 3, 0.0f, 0.0f, 0);
            view0.onTouchEvent(motionEvent0);
            motionEvent0.recycle();
            rt0.d = true;
        }
    }
}

