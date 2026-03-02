import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;

public final class ipn implements GestureDetector.OnGestureListener {
    final ipo a;

    public ipn(ipo ipo0) {
        this.a = ipo0;
        super();
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public final boolean onDown(MotionEvent motionEvent0) {
        return true;
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public final boolean onFling(MotionEvent motionEvent0, MotionEvent motionEvent1, float f, float f1) {
        ipo ipo0 = this.a;
        int v = ipo0.b;
        int v1 = 2;
        if(v == 1) {
            if((Math.abs(f) > Math.abs(f1))) {
                if((f > 0.0f)) {
                    v1 = 1;
                }
                hib hib0 = new hib(v1);
                ipo0.a.a(hib0);
                return true;
            }
        }
        else if(v == 2 && (Math.abs(f1) > Math.abs(f))) {
            if((f1 > 0.0f)) {
                v1 = 1;
            }
            hib hib1 = new hib(v1);
            ipo0.a.a(hib1);
        }
        return true;
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public final void onLongPress(MotionEvent motionEvent0) {
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent0, MotionEvent motionEvent1, float f, float f1) {
        return true;
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public final void onShowPress(MotionEvent motionEvent0) {
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent0) {
        return true;
    }
}

