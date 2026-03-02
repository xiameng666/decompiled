import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

public final class inq extends ViewGroup {
    public final HashMap a;
    public final HashMap b;

    public inq(Context context0) {
        super(context0);
        this.setClipChildren(false);
        this.a = new HashMap();
        this.b = new HashMap();
    }

    @Override  // android.view.ViewGroup
    protected final void dispatchDraw(Canvas canvas0) {
    }

    @Override  // android.view.ViewGroup
    public final boolean dispatchTouchEvent(MotionEvent motionEvent0) {
        return true;
    }

    @Override  // android.view.ViewGroup
    public final ViewParent invalidateChildInParent(int[] arr_v, Rect rect0) {
        return null;
    }

    @Override  // android.view.ViewGroup
    public final void onDescendantInvalidated(View view0, View view1) {
    }

    @Override  // android.view.ViewGroup
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        for(Object object0: this.a.keySet()) {
            ((jmw)object0).layout(((jmw)object0).getLeft(), ((jmw)object0).getTop(), ((jmw)object0).getRight(), ((jmw)object0).getBottom());
        }
    }

    @Override  // android.view.View
    protected final void onMeasure(int v, int v1) {
        if(View.MeasureSpec.getMode(v) != 0x40000000) {
            hxt.c("widthMeasureSpec should be EXACTLY");
        }
        if(View.MeasureSpec.getMode(v1) != 0x40000000) {
            hxt.c("heightMeasureSpec should be EXACTLY");
        }
        this.setMeasuredDimension(View.MeasureSpec.getSize(v), View.MeasureSpec.getSize(v1));
        for(Object object0: this.a.keySet()) {
            jmw jmw0 = (jmw)object0;
            int v2 = jmw0.t;
            if(v2 != 0x80000000) {
                int v3 = jmw0.u;
                if(v3 != 0x80000000) {
                    jmw0.measure(v2, v3);
                }
            }
        }
    }

    @Override  // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.cleanupLayoutState(this);
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            ify ify0 = (ify)this.a.get(view0);
            if(view0.isLayoutRequested() && ify0 != null) {
                ify.ax(ify0, false, 7);
            }
        }
    }

    @Override  // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

