import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

public final class kig extends kdl {
    @Override  // kdl
    public final void b(View view0, AccessibilityEvent accessibilityEvent0) {
        super.b(view0, accessibilityEvent0);
        accessibilityEvent0.setClassName(ScrollView.class.getName());
        accessibilityEvent0.setScrollable(((NestedScrollView)view0).d() > 0);
        accessibilityEvent0.setScrollX(((NestedScrollView)view0).getScrollX());
        accessibilityEvent0.setScrollY(((NestedScrollView)view0).getScrollY());
        accessibilityEvent0.setMaxScrollX(((NestedScrollView)view0).getScrollX());
        accessibilityEvent0.setMaxScrollY(((NestedScrollView)view0).d());
    }

    @Override  // kdl
    public final void c(View view0, khb khb0) {
        super.c(view0, khb0);
        khb0.y(ScrollView.class.getName());
        if(((NestedScrollView)view0).isEnabled()) {
            int v = ((NestedScrollView)view0).d();
            if(v > 0) {
                khb0.W(true);
                if(((NestedScrollView)view0).getScrollY() > 0) {
                    khb0.n(kgx.n);
                    khb0.n(kgx.y);
                }
                if(((NestedScrollView)view0).getScrollY() < v) {
                    khb0.n(kgx.m);
                    khb0.n(kgx.A);
                }
            }
        }
    }

    @Override  // kdl
    public final boolean i(View view0, int v, Bundle bundle0) {
        if(super.i(view0, v, bundle0)) {
            return true;
        }
        if(!((NestedScrollView)view0).isEnabled()) {
            return false;
        }
        int v1 = ((NestedScrollView)view0).getHeight();
        Rect rect0 = new Rect();
        if(((NestedScrollView)view0).getMatrix().isIdentity() && ((NestedScrollView)view0).getGlobalVisibleRect(rect0)) {
            v1 = rect0.height();
        }
        switch(v) {
            case 0x2000: 
            case 0x1020038: {
                int v4 = v1 - ((NestedScrollView)view0).getPaddingBottom() - ((NestedScrollView)view0).getPaddingTop();
                int v5 = Math.max(((NestedScrollView)view0).getScrollY() - v4, 0);
                if(v5 != ((NestedScrollView)view0).getScrollY()) {
                    ((NestedScrollView)view0).A(v5);
                    return true;
                }
                return false;
            }
            case 0x1000: 
            case 0x102003A: {
                int v2 = v1 - ((NestedScrollView)view0).getPaddingBottom() - ((NestedScrollView)view0).getPaddingTop();
                int v3 = Math.min(((NestedScrollView)view0).getScrollY() + v2, ((NestedScrollView)view0).d());
                if(v3 != ((NestedScrollView)view0).getScrollY()) {
                    ((NestedScrollView)view0).A(v3);
                    return true;
                }
                return false;
            }
            default: {
                return false;
            }
        }
    }
}

