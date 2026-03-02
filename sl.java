import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;

final class sl implements View.OnTouchListener {
    final sn a;

    public sl(sn sn0) {
        this.a = sn0;
        super();
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        int v = motionEvent0.getAction();
        int v1 = (int)motionEvent0.getX();
        int v2 = (int)motionEvent0.getY();
        if(v == 0) {
            sn sn0 = this.a;
            if(sn0.r != null && sn0.r.isShowing() && v1 >= 0 && v1 < sn0.r.getWidth() && v2 >= 0 && v2 < sn0.r.getHeight()) {
                sn0.p.postDelayed(sn0.o, 0xFAL);
                return false;
            }
        }
        else if(v == 1) {
            this.a.p.removeCallbacks(this.a.o);
        }
        return false;
    }
}

