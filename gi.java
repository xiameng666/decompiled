import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;

public abstract class gi {
    public abstract Object a(Object arg1);

    public abstract Object b(Object arg1, Object arg2, Object arg3);

    public abstract Object c(Object arg1);

    public abstract void d(Object arg1, View arg2);

    public abstract void e(Object arg1, ArrayList arg2);

    public abstract void f(ViewGroup arg1, Object arg2);

    private static boolean g(List list0, View view0, int v) {
        for(int v1 = 0; v1 < v; ++v1) {
            if(list0.get(v1) == view0) {
                return true;
            }
        }
        return false;
    }

    public abstract void h(Object arg1, View arg2, ArrayList arg3);

    public abstract void i(Object arg1, Rect arg2);

    public abstract void j(Object arg1, View arg2);

    public abstract void k(Object arg1, View arg2, ArrayList arg3);

    public abstract void l(Object arg1, ArrayList arg2, ArrayList arg3);

    public abstract boolean m(Object arg1);

    public boolean n() {
        throw null;
    }

    public boolean o(Object object0) {
        throw null;
    }

    public abstract Object p(Object arg1, Object arg2);

    public abstract void q(Object arg1, Object arg2, ArrayList arg3, Object arg4, ArrayList arg5);

    public void r(Object object0, jyv jyv0, Runnable runnable0) {
        throw null;
    }

    public Object s(ViewGroup viewGroup0, Object object0) {
        return null;
    }

    public void t(Object object0) {
    }

    public void u(Object object0, Runnable runnable0) {
    }

    protected static void v(List list0, View view0) {
        int v = list0.size();
        if(!gi.g(list0, view0, v)) {
            if(view0.getTransitionName() != null) {
                list0.add(view0);
            }
            for(int v1 = v; v1 < list0.size(); ++v1) {
                View view1 = (View)list0.get(v1);
                if((view1 instanceof ViewGroup)) {
                    int v2 = ((ViewGroup)view1).getChildCount();
                    for(int v3 = 0; v3 < v2; ++v3) {
                        View view2 = ((ViewGroup)view1).getChildAt(v3);
                        if(!gi.g(list0, view2, v) && view2.getTransitionName() != null) {
                            list0.add(view2);
                        }
                    }
                }
            }
        }
    }

    public void w(Object object0, float f) {
    }

    protected static boolean x(List list0) {
        return list0 == null || list0.isEmpty();
    }

    protected static final void y(View view0, Rect rect0) {
        if(!view0.isAttachedToWindow()) {
            return;
        }
        RectF rectF0 = new RectF();
        rectF0.set(0.0f, 0.0f, ((float)view0.getWidth()), ((float)view0.getHeight()));
        view0.getMatrix().mapRect(rectF0);
        rectF0.offset(((float)view0.getLeft()), ((float)view0.getTop()));
        for(ViewParent viewParent0 = view0.getParent(); (viewParent0 instanceof View); viewParent0 = ((View)viewParent0).getParent()) {
            rectF0.offset(((float)(-((View)viewParent0).getScrollX())), ((float)(-((View)viewParent0).getScrollY())));
            ((View)viewParent0).getMatrix().mapRect(rectF0);
            rectF0.offset(((float)((View)viewParent0).getLeft()), ((float)((View)viewParent0).getTop()));
        }
        int[] arr_v = new int[2];
        view0.getRootView().getLocationOnScreen(arr_v);
        rectF0.offset(((float)arr_v[0]), ((float)arr_v[1]));
        rect0.set(Math.round(rectF0.left), Math.round(rectF0.top), Math.round(rectF0.right), Math.round(rectF0.bottom));
    }

    public void z(Object object0, jyv jyv0, Runnable runnable0, Runnable runnable1) {
        runnable1.run();
    }
}

