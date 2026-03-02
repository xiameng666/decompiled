import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

public final class ljp implements Runnable {
    public final ljq a;

    public ljp(ljq ljq0) {
        this.a = ljq0;
    }

    @Override
    public final void run() {
        int v2;
        View view0;
        ljq ljq0 = this.a;
        int v = ljq0.b.h;
        boolean z = ljq0.a == 3;
        if(z) {
            view0 = ljq0.c.c(3);
            v2 = (view0 == null ? 0 : -view0.getWidth()) + v;
        }
        else {
            view0 = ljq0.c.c(5);
            v2 = ljq0.c.getWidth() - v;
        }
        if(view0 != null && (z && view0.getLeft() < v2 || !z && view0.getLeft() > v2)) {
            DrawerLayout drawerLayout0 = ljq0.c;
            if(drawerLayout0.a(view0) == 0) {
                ljm ljm0 = (ljm)view0.getLayoutParams();
                ljq0.b.m(view0, v2, view0.getTop());
                ljm0.c = true;
                drawerLayout0.invalidate();
                ljq0.m();
                if(!drawerLayout0.b) {
                    long v3 = SystemClock.uptimeMillis();
                    MotionEvent motionEvent0 = MotionEvent.obtain(v3, v3, 3, 0.0f, 0.0f, 0);
                    int v4 = drawerLayout0.getChildCount();
                    for(int v1 = 0; v1 < v4; ++v1) {
                        drawerLayout0.getChildAt(v1).dispatchTouchEvent(motionEvent0);
                    }
                    motionEvent0.recycle();
                    drawerLayout0.b = true;
                }
            }
        }
    }
}

