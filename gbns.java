import android.graphics.Rect;
import android.util.ArrayMap;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo;

public final class gbns extends TouchDelegate implements View.OnLayoutChangeListener {
    public final bzs a;
    public final bzs b;
    public TouchDelegate c;
    private static final Rect d;

    static {
        gbns.d = new Rect();
    }

    public gbns(View view0) {
        super(gbns.d, view0);
        this.a = new bzs();
        this.b = new bzs();
    }

    public final void a(View view0) {
        Rect rect0 = (Rect)this.b.get(view0);
        gftb.check(rect0);
        Rect rect1 = new Rect();
        view0.getHitRect(rect1);
        rect1.left -= rect0.left;
        rect1.top -= rect0.top;
        rect1.right += rect0.right;
        rect1.bottom += rect0.bottom;
        TouchDelegate touchDelegate0 = new TouchDelegate(rect1, view0);
        this.a.put(view0, touchDelegate0);
    }

    @Override  // android.view.TouchDelegate
    public final AccessibilityNodeInfo.TouchDelegateInfo getTouchDelegateInfo() {
        bzs bzs0 = this.a;
        ArrayMap arrayMap0 = new ArrayMap(bzs0.d_num);
        int v = bzs0.d_num;
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = (View)bzs0.f(v1);
            TouchDelegate touchDelegate0 = (TouchDelegate)bzs0.get(view0);
            gftb.check(touchDelegate0);
            AccessibilityNodeInfo.TouchDelegateInfo accessibilityNodeInfo$TouchDelegateInfo0 = touchDelegate0.getTouchDelegateInfo();
            for(int v2 = 0; v2 < accessibilityNodeInfo$TouchDelegateInfo0.getRegionCount(); ++v2) {
                arrayMap0.put(accessibilityNodeInfo$TouchDelegateInfo0.getRegionAt(v2), view0);
            }
        }
        return arrayMap0.isEmpty() ? super.getTouchDelegateInfo() : new AccessibilityNodeInfo.TouchDelegateInfo(arrayMap0);
    }

    @Override  // android.view.View$OnLayoutChangeListener
    public final void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        this.a(view0);
    }

    @Override  // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        boolean z = false;
        if(v == 0) {
            if(motionEvent0.getPointerCount() > 1) {
                return false;
            }
            bzs bzs0 = this.a;
            int v1 = bzs0.d_num;
            for(int v2 = 0; v2 < v1; ++v2) {
                if(((View)bzs0.f(v2)).isShown()) {
                    TouchDelegate touchDelegate0 = (TouchDelegate)bzs0.i(v2);
                    float f = motionEvent0.getX();
                    float f1 = motionEvent0.getY();
                    boolean z1 = touchDelegate0.onTouchEvent(motionEvent0);
                    motionEvent0.setLocation(f, f1);
                    if(z1) {
                        this.c = touchDelegate0;
                        return true;
                    }
                }
            }
            return false;
        }
        if(this.c != null && this.c.onTouchEvent(motionEvent0)) {
            z = true;
        }
        if(v != 1 && v != 0x20) {
            return z;
        }
        this.c = null;
        return z;
    }
}

