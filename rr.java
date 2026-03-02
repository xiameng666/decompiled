import android.view.ViewParent;

final class rr implements Runnable {
    final rt a;

    public rr(rt rt0) {
        this.a = rt0;
        super();
    }

    @Override
    public final void run() {
        ViewParent viewParent0 = this.a.c.getParent();
        if(viewParent0 != null) {
            viewParent0.requestDisallowInterceptTouchEvent(true);
        }
    }
}

