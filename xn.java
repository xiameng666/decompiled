import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;

final class xn extends GestureDetector.SimpleOnGestureListener {
    public boolean a;
    final xr b;

    public xn(xr xr0) {
        this.b = xr0;
        super();
        this.a = true;
    }

    @Override  // android.view.GestureDetector$SimpleOnGestureListener
    public final boolean onDown(MotionEvent motionEvent0) {
        return true;
    }

    @Override  // android.view.GestureDetector$SimpleOnGestureListener
    public final void onLongPress(MotionEvent motionEvent0) {
        if(this.a) {
            xr xr0 = this.b;
            View view0 = xr0.e(motionEvent0);
            if(view0 != null) {
                uq uq0 = xr0.m.o(view0);
                if(uq0 != null) {
                    xm xm0 = xr0.j;
                    if((xm0.c(xr0.m, uq0) & 0xFF0000) != 0) {
                        int v = motionEvent0.getPointerId(0);
                        int v1 = xr0.i;
                        if(v == v1) {
                            int v2 = motionEvent0.findPointerIndex(v1);
                            float f = motionEvent0.getX(v2);
                            float f1 = motionEvent0.getY(v2);
                            xr0.c = f;
                            xr0.d = f1;
                            xr0.f = 0.0f;
                            xr0.e = 0.0f;
                            xm0.i();
                            xr0.l(uq0, 2);
                        }
                    }
                }
            }
        }
    }
}

