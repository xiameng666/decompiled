import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ListView;

public abstract class rt implements View.OnAttachStateChangeListener, View.OnTouchListener {
    private final float a;
    private final int b;
    final View c;
    public boolean d;
    private final int e;
    private Runnable f;
    private Runnable g;
    private int h;
    private final int[] i;

    public rt(View view0) {
        this.i = new int[2];
        this.c = view0;
        view0.setLongClickable(true);
        view0.addOnAttachStateChangeListener(this);
        this.a = (float)ViewConfiguration.get(view0.getContext()).getScaledTouchSlop();
        this.b = 100;
        this.e = (100 + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public abstract nr a();

    protected boolean b() {
        throw null;
    }

    protected boolean c() {
        nr nr0 = this.a();
        if(nr0 != null && nr0.x()) {
            nr0.m();
        }
        return true;
    }

    public final void d() {
        Runnable runnable0 = this.g;
        if(runnable0 != null) {
            this.c.removeCallbacks(runnable0);
        }
        Runnable runnable1 = this.f;
        if(runnable1 != null) {
            this.c.removeCallbacks(runnable1);
        }
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        boolean z3;
        boolean z2;
        boolean z = this.d;
        if(z) {
            View view1 = this.c;
            nr nr0 = this.a();
            if(nr0 != null && nr0.x()) {
                ListView listView0 = nr0.dB();
                if(listView0 != null && ((rl)listView0).isShown()) {
                    MotionEvent motionEvent1 = MotionEvent.obtainNoHistory(motionEvent0);
                    view1.getLocationOnScreen(this.i);
                    motionEvent1.offsetLocation(((float)this.i[0]), ((float)this.i[1]));
                    listView0.getLocationOnScreen(this.i);
                    motionEvent1.offsetLocation(((float)(-this.i[0])), ((float)(-this.i[1])));
                    boolean z1 = ((rl)listView0).a(motionEvent1, this.h);
                    motionEvent1.recycle();
                    switch(motionEvent0.getActionMasked()) {
                        case 1: 
                        case 3: {
                            z2 = false;
                            break;
                        }
                        default: {
                            z2 = true;
                        }
                    }
                    if(z1 && z2) {
                        z3 = true;
                        this.d = z3;
                        return z3 || z;
                    }
                }
                z3 = !this.c();
                this.d = z3;
                return z3 || z;
            }
            else {
                z3 = !this.c();
            }
        }
        else {
            View view2 = this.c;
            if(view2.isEnabled()) {
                switch(motionEvent0.getActionMasked()) {
                    case 0: {
                        this.h = motionEvent0.getPointerId(0);
                        if(this.f == null) {
                            this.f = new rr(this);
                        }
                        view2.postDelayed(this.f, ((long)this.b));
                        if(this.g == null) {
                            this.g = new rs(this);
                        }
                        view2.postDelayed(this.g, ((long)this.e));
                        z3 = false;
                        break;
                    }
                    case 2: {
                        int v = motionEvent0.findPointerIndex(this.h);
                        if(v >= 0) {
                            float f = motionEvent0.getX(v);
                            float f1 = motionEvent0.getY(v);
                            if(f < -this.a || f1 < -this.a || f >= ((float)(view2.getRight() - view2.getLeft())) + this.a || f1 >= ((float)(view2.getBottom() - view2.getTop())) + this.a) {
                                this.d();
                                view2.getParent().requestDisallowInterceptTouchEvent(true);
                                z3 = this.b();
                            }
                            else {
                                z3 = false;
                            }
                        }
                        else {
                            z3 = false;
                        }
                        break;
                    }
                    case 1: 
                    case 3: {
                        this.d();
                        z3 = false;
                        break;
                    }
                    default: {
                        z3 = false;
                    }
                }
            }
            else {
                z3 = false;
            }
            if(z3) {
                long v1 = SystemClock.uptimeMillis();
                MotionEvent motionEvent2 = MotionEvent.obtain(v1, v1, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEvent2);
                motionEvent2.recycle();
            }
        }
        this.d = z3;
        return z3 || z;
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
        this.d = false;
        this.h = -1;
        Runnable runnable0 = this.f;
        if(runnable0 != null) {
            this.c.removeCallbacks(runnable0);
        }
    }
}

