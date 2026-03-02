import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;

public final class aajh implements View.OnTouchListener {
    public final aajp a;

    public aajh(aajp aajp0) {
        this.a = aajp0;
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        if(motionEvent0.getAction() == 1) {
            view0.performClick();
            return false;
        }
        this.a.ag.clearFocus();
        return false;
    }
}

