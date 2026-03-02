import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;

public final class fvwc implements View.OnTouchListener {
    public final fvwf a;

    public fvwc(fvwf fvwf0) {
        this.a = fvwf0;
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        switch(motionEvent0.getAction()) {
            case 0: {
                RippleDrawable rippleDrawable0 = (RippleDrawable)this.a.a.getBackground();
                rippleDrawable0.setHotspot(motionEvent0.getX(), motionEvent0.getY());
                rippleDrawable0.setColor(ColorStateList.valueOf(this.a.getResources().getColor(0x7F061273)));  // color:take_action_mute_pink
                return false;
            }
            case 1: {
                view0.performClick();
                return false;
            }
            default: {
                return false;
            }
        }
    }
}

