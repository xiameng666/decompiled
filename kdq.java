import android.content.Context;
import android.view.GestureDetector.OnGestureListener;
import android.view.GestureDetector;
import android.view.MotionEvent;

@Deprecated
public final class kdq {
    public final GestureDetector a;

    public kdq(Context context0, GestureDetector.OnGestureListener gestureDetector$OnGestureListener0) {
        this.a = new GestureDetector(context0, gestureDetector$OnGestureListener0, null);
    }

    public final void a(boolean z) {
        this.a.setIsLongpressEnabled(z);
    }

    public final boolean b(MotionEvent motionEvent0) {
        return this.a.onTouchEvent(motionEvent0);
    }
}

