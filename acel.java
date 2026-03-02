import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;

public final class acel extends FrameLayout {
    public final aceu a;
    public acdc b;
    public accz c;
    public acek d;
    public boolean e;
    public boolean f;
    public accn g;

    public acel(Context context0) {
        super(context0);
        this.f = true;
        aceu aceu0 = new aceu(context0);
        this.a = aceu0;
        aceu0.ac = this;
        aceu0.ao(null);
        this.addView(aceu0, new FrameLayout.LayoutParams(-1, -1));
    }

    public final void a(int v) {
        this.a.ah = v;
        aces aces0 = this.a.ag;
        if(aces0 != null) {
            aces0.d(v);
        }
    }

    public final void b() {
        if(this.e) {
            View view0 = this.a.getChildAt(0);
            int v = Math.max(0, this.a.c(view0));
            if(this.f && v >= this.b.W()) {
                if(this.d.getVisibility() != 0) {
                    this.c.S(this.b.G());
                }
                this.d.setVisibility(0);
                return;
            }
            if(this.d.getVisibility() != 8) {
                this.b.S(this.c.G());
            }
            this.d.setVisibility(8);
        }
    }

    public final boolean c(MotionEvent motionEvent0) {
        return this.a.onTouchEvent(motionEvent0);
    }

    @Override  // android.view.ViewGroup
    public final boolean onInterceptHoverEvent(MotionEvent motionEvent0) {
        aces aces0 = this.a.ag;
        return aces0 != null && aces0.k(motionEvent0) || super.onInterceptHoverEvent(motionEvent0);
    }

    @Override  // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        aces aces0 = this.a.ag;
        return aces0 != null && aces0.k(motionEvent0) || super.onInterceptTouchEvent(motionEvent0);
    }

    @Override  // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        aces aces0 = this.a.ag;
        return aces0 != null && aces0.l(motionEvent0) || super.onTouchEvent(motionEvent0);
    }
}

