import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.List;

final class xh implements ub {
    final xr a;

    public xh(xr xr0) {
        this.a = xr0;
        super();
    }

    @Override  // ub
    public final void c(boolean z) {
        if(!z) {
            return;
        }
        this.a.l(null, 0);
    }

    @Override  // ub
    public final boolean i(RecyclerView recyclerView0, MotionEvent motionEvent0) {
        xr xr0 = this.a;
        xr0.q.onTouchEvent(motionEvent0);
        int v = motionEvent0.getActionMasked();
        xp xp0 = null;
        if(v == 0) {
            xr0.i = motionEvent0.getPointerId(0);
            xr0.c = motionEvent0.getX();
            xr0.d = motionEvent0.getY();
            VelocityTracker velocityTracker0 = xr0.o;
            if(velocityTracker0 != null) {
                velocityTracker0.recycle();
            }
            xr0.o = VelocityTracker.obtain();
            if(xr0.b == null) {
                List list0 = xr0.l;
                if(!list0.isEmpty()) {
                    View view0 = xr0.e(motionEvent0);
                    for(int v1 = list0.size() - 1; v1 >= 0; --v1) {
                        xp xp1 = (xp)list0.get(v1);
                        if(xp1.h.a == view0) {
                            xp0 = xp1;
                            break;
                        }
                    }
                }
                if(xp0 != null) {
                    xr0.c -= xp0.l;
                    xr0.d -= xp0.m;
                    uq uq0 = xp0.h;
                    xr0.h(uq0, true);
                    if(xr0.a.remove(uq0.a)) {
                        xr0.j.e(xr0.m, uq0);
                    }
                    xr0.l(uq0, xp0.i);
                    xr0.m(motionEvent0, xr0.k, 0);
                }
            }
        }
        else if(v != 1 && v != 3) {
            int v2 = xr0.i;
            if(v2 != -1) {
                int v3 = motionEvent0.findPointerIndex(v2);
                if(v3 >= 0) {
                    xr0.g(v, motionEvent0, v3);
                }
            }
        }
        else {
            xr0.i = -1;
            xr0.l(null, 0);
        }
        VelocityTracker velocityTracker1 = xr0.o;
        if(velocityTracker1 != null) {
            velocityTracker1.addMovement(motionEvent0);
        }
        return xr0.b != null;
    }

    @Override  // ub
    public final void k(MotionEvent motionEvent0) {
        xr xr0 = this.a;
        xr0.q.onTouchEvent(motionEvent0);
        VelocityTracker velocityTracker0 = xr0.o;
        if(velocityTracker0 != null) {
            velocityTracker0.addMovement(motionEvent0);
        }
        if(xr0.i != -1) {
            int v = motionEvent0.getActionMasked();
            int v1 = motionEvent0.findPointerIndex(xr0.i);
            if(v1 >= 0) {
                xr0.g(v, motionEvent0, v1);
            }
            int v2 = 0;
            uq uq0 = xr0.b;
            if(uq0 != null) {
                switch(v) {
                    case 1: {
                        xr0.l(null, 0);
                        xr0.i = -1;
                        return;
                    }
                    case 2: {
                        if(v1 >= 0) {
                            xr0.m(motionEvent0, xr0.k, v1);
                            xr0.i(uq0);
                            xr0.m.removeCallbacks(xr0.n);
                            xr0.n.run();
                            xr0.m.invalidate();
                            return;
                        }
                        break;
                    }
                    case 3: {
                        VelocityTracker velocityTracker1 = xr0.o;
                        if(velocityTracker1 != null) {
                            velocityTracker1.clear();
                        }
                        xr0.l(null, 0);
                        xr0.i = -1;
                        return;
                    }
                    case 6: {
                        int v3 = motionEvent0.getActionIndex();
                        if(motionEvent0.getPointerId(v3) == xr0.i) {
                            if(v3 == 0) {
                                v2 = 1;
                            }
                            xr0.i = motionEvent0.getPointerId(v2);
                            xr0.m(motionEvent0, xr0.k, v3);
                            return;
                        }
                        break;
                    }
                }
            }
        }
    }
}

