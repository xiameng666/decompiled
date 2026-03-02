import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class kzq extends kdl {
    public final AccessibilityManager a;
    public final View b;
    public int c;
    public int d;
    private static final Rect e;
    private final Rect f;
    private final Rect g;
    private final Rect h;
    private final int[] i;
    private kzp j;
    private int k;

    static {
        kzq.e = new Rect(0x7FFFFFFF, 0x7FFFFFFF, 0x80000000, 0x80000000);
    }

    public kzq(View view0) {
        this.f = new Rect();
        this.g = new Rect();
        this.h = new Rect();
        this.i = new int[2];
        this.c = 0x80000000;
        this.d = 0x80000000;
        this.k = 0x80000000;
        if(view0 == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.b = view0;
        this.a = (AccessibilityManager)view0.getContext().getSystemService("accessibility");
        view0.setFocusable(true);
        if(view0.getImportantForAccessibility() == 0) {
            view0.setImportantForAccessibility(1);
        }
    }

    private final void A(int v) {
        int v1 = this.k;
        if(v1 == v) {
            return;
        }
        this.k = v;
        this.x(v, 0x80);
        this.x(v1, 0x100);
    }

    @Override  // kdl
    public final khe a(View view0) {
        if(this.j == null) {
            this.j = new kzp(this);
        }
        return this.j;
    }

    @Override  // kdl
    public void c(View view0, khb khb0) {
        super.c(view0, khb0);
        this.o(khb0);
    }

    protected abstract int j(float arg1, float arg2);

    final khb k(int v) {
        if(v == -1) {
            View view0 = this.b;
            khb khb0 = khb.e(view0);
            view0.onInitializeAccessibilityNodeInfo(khb0.a);
            ArrayList arrayList0 = new ArrayList();
            this.l(arrayList0);
            if(khb0.a.getChildCount() > 0 && arrayList0.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                khb0.p(view0, ((Integer)arrayList0.get(v2)).intValue());
            }
            return khb0;
        }
        return this.z(v);
    }

    protected abstract void l(List arg1);

    public final void m(int v) {
        if(v != 0x80000000 && this.a.isEnabled()) {
            View view0 = this.b;
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 != null) {
                AccessibilityEvent accessibilityEvent0 = this.y(v, 0x800);
                accessibilityEvent0.setContentChangeTypes(0);
                viewParent0.requestSendAccessibilityEvent(view0, accessibilityEvent0);
            }
        }
    }

    protected void n(int v, AccessibilityEvent accessibilityEvent0) {
    }

    protected void o(khb khb0) {
    }

    protected abstract void p(int arg1, khb arg2);

    protected void q(int v, boolean z) {
    }

    public final boolean r(int v) {
        if(this.c == v) {
            this.c = 0x80000000;
            this.b.invalidate();
            this.x(v, 0x10000);
            return true;
        }
        return false;
    }

    public final boolean s(int v) {
        if(this.d != v) {
            return false;
        }
        this.d = 0x80000000;
        this.q(v, false);
        this.x(v, 8);
        return true;
    }

    public final boolean t(MotionEvent motionEvent0) {
        if(this.a.isEnabled() && this.a.isTouchExplorationEnabled()) {
            switch(motionEvent0.getAction()) {
                case 7: 
                case 9: {
                    int v = this.j(motionEvent0.getX(), motionEvent0.getY());
                    this.A(v);
                    return v != 0x80000000;
                }
                case 10: {
                    if(this.k != 0x80000000) {
                        this.A(0x80000000);
                        return true;
                    }
                    return false;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    public final boolean u(int v, Rect rect0) {
        Object object0;
        khb khb2;
        ArrayList arrayList0 = new ArrayList();
        this.l(arrayList0);
        bzt bzt0 = new bzt();
        for(int v2 = 0; v2 < arrayList0.size(); ++v2) {
            khb khb0 = this.z(((Integer)arrayList0.get(v2)).intValue());
            bzt0.h(((Integer)arrayList0.get(v2)).intValue(), khb0);
        }
        int v3 = 0x80000000;
        khb khb1 = this.d == 0x80000000 ? null : ((khb)bzu.a(bzt0, this.d));
        int v4 = -1;
        if(v != 1 && v != 2) {
            if(v != 17 && v != 33 && v != 66 && v != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect1 = new Rect();
            int v5 = this.d;
            if(v5 != 0x80000000) {
                this.k(v5).r(rect1);
            }
            else if(rect0 == null) {
                int v6 = this.b.getWidth();
                int v7 = this.b.getHeight();
                switch(v) {
                    case 17: {
                        rect1.set(v6, 0, v6, v7);
                        break;
                    }
                    case 33: {
                        rect1.set(0, v7, v6, v7);
                        break;
                    }
                    case 66: {
                        rect1.set(-1, 0, -1, v7);
                        break;
                    }
                    case 130: {
                        rect1.set(0, -1, v6, -1);
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            else {
                rect1.set(rect0);
            }
            Rect rect2 = new Rect(rect1);
            switch(v) {
                case 17: {
                    rect2.offset(rect1.width() + 1, 0);
                    break;
                }
                case 33: {
                    rect2.offset(0, rect1.height() + 1);
                    break;
                }
                case 66: {
                    rect2.offset(-(rect1.width() + 1), 0);
                    break;
                }
                case 130: {
                    rect2.offset(0, -(rect1.height() + 1));
                    break;
                }
                default: {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
            }
            int v8 = bzt0.c();
            Rect rect3 = new Rect();
            khb2 = null;
            for(int v9 = 0; v9 < v8; ++v9) {
                khb khb3 = kzo.a(bzt0, v9);
                if(khb3 != khb1) {
                    kzn.a(khb3, rect3);
                    if(kzs.e(rect1, rect3, v) && (!kzs.e(rect1, rect2, v) || kzs.d(v, rect1, rect3, rect2) || !kzs.d(v, rect1, rect2, rect3) && kzs.a(kzs.b(v, rect1, rect3), kzs.c(v, rect1, rect3)) < kzs.a(kzs.b(v, rect1, rect2), kzs.c(v, rect1, rect2)))) {
                        rect2.set(rect3);
                        khb2 = khb3;
                    }
                }
            }
        }
        else {
            boolean z = this.b.getLayoutDirection() == 1;
            int v10 = bzt0.c();
            ArrayList arrayList1 = new ArrayList(v10);
            for(int v11 = 0; v11 < v10; ++v11) {
                arrayList1.add(kzo.a(bzt0, v11));
            }
            Collections.sort(arrayList1, new kzr(z));
            switch(v) {
                case 1: {
                    int v12 = khb1 == null ? arrayList1.size() : arrayList1.indexOf(khb1);
                    object0 = v12 - 1 >= 0 ? arrayList1.get(v12 - 1) : null;
                    break;
                }
                case 2: {
                    int v13 = khb1 == null ? -1 : arrayList1.lastIndexOf(khb1);
                    object0 = v13 + 1 >= arrayList1.size() ? null : arrayList1.get(v13 + 1);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
            }
            khb2 = (khb)object0;
        }
        if(khb2 != null) {
            if(bzt0.a) {
                bzu.c(bzt0);
            }
            int v14 = bzt0.d;
            for(int v1 = 0; v1 < v14; ++v1) {
                if(bzt0.c[v1] == khb2) {
                    v4 = v1;
                    break;
                }
            }
            v3 = bzt0.b(v4);
        }
        return this.w(v3);
    }

    public abstract boolean v(int arg1, int arg2, Bundle arg3);

    public final boolean w(int v) {
        if(this.b.isFocused() || this.b.requestFocus()) {
            int v1 = this.d;
            if(v1 != v) {
                if(v1 != 0x80000000) {
                    this.s(v1);
                }
                if(v != 0x80000000) {
                    this.d = v;
                    this.q(v, true);
                    this.x(v, 8);
                    return true;
                }
            }
        }
        return false;
    }

    public final void x(int v, int v1) {
        if(v != 0x80000000 && this.a.isEnabled()) {
            View view0 = this.b;
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 != null) {
                viewParent0.requestSendAccessibilityEvent(view0, this.y(v, v1));
            }
        }
    }

    private final AccessibilityEvent y(int v, int v1) {
        if(v != -1) {
            AccessibilityEvent accessibilityEvent0 = AccessibilityEvent.obtain(v1);
            khb khb0 = this.k(v);
            accessibilityEvent0.getText().add(khb0.j());
            accessibilityEvent0.setContentDescription(khb0.h());
            accessibilityEvent0.setScrollable(khb0.an());
            accessibilityEvent0.setPassword(khb0.am());
            accessibilityEvent0.setEnabled(khb0.ai());
            accessibilityEvent0.setChecked(khb0.a.isChecked());
            this.n(v, accessibilityEvent0);
            if(accessibilityEvent0.getText().isEmpty() && accessibilityEvent0.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEvent0.setClassName(khb0.g());
            accessibilityEvent0.setSource(this.b, v);
            accessibilityEvent0.setPackageName("com.google.android.gms");
            return accessibilityEvent0;
        }
        AccessibilityEvent accessibilityEvent1 = AccessibilityEvent.obtain(v1);
        this.b.onInitializeAccessibilityEvent(accessibilityEvent1);
        return accessibilityEvent1;
    }

    private final khb z(int v) {
        khb khb0 = khb.d();
        khb0.E(true);
        khb0.G(true);
        khb0.y("android.view.View");
        Rect rect0 = kzq.e;
        khb0.u(rect0);
        khb0.v(rect0);
        View view0 = this.b;
        khb0.R(view0);
        this.p(v, khb0);
        if(khb0.j() == null && khb0.h() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect1 = this.g;
        khb0.q(rect1);
        Rect rect2 = this.f;
        khb0.r(rect2);
        if(rect1.equals(rect0) && rect2.equals(rect0)) {
            throw new RuntimeException("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
        }
        int v1 = khb0.a();
        if((v1 & 0x40) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if((v1 & 0x80) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        khb0.P("com.google.android.gms");
        khb0.Z(view0, v);
        if(this.c == v) {
            khb0.s(true);
            khb0.m(0x80);
        }
        else {
            khb0.s(false);
            khb0.m(0x40);
        }
        boolean z = this.d == v;
        if(z) {
            khb0.m(2);
        }
        else if(khb0.aj()) {
            khb0.m(1);
        }
        khb0.H(z);
        int[] arr_v = this.i;
        view0.getLocationOnScreen(arr_v);
        if(rect2.equals(rect0)) {
            khb0.u(rect1);
            Rect rect3 = new Rect();
            rect3.set(rect1);
            if(khb0.b != -1) {
                khb khb1 = khb.d();
                Rect rect4 = new Rect();
                for(int v2 = khb0.b; v2 != -1; v2 = khb1.b) {
                    khb1.S(view0, -1);
                    khb1.u(rect0);
                    this.p(v2, khb1);
                    khb1.q(rect4);
                    rect3.offset(rect4.left, rect4.top);
                }
            }
            view0.getLocationOnScreen(arr_v);
            rect3.offset(arr_v[0] - view0.getScrollX(), arr_v[1] - view0.getScrollY());
            khb0.v(rect3);
            khb0.r(rect2);
        }
        Rect rect5 = this.h;
        if(view0.getLocalVisibleRect(rect5)) {
            rect5.offset(arr_v[0] - view0.getScrollX(), arr_v[1] - view0.getScrollY());
            if(!rect2.intersect(rect5)) {
                return khb0;
            }
            khb0.v(rect2);
            if(rect2.isEmpty() || view0.getWindowVisibility() != 0) {
                return khb0;
            }
            for(ViewParent viewParent0 = view0.getParent(); true; viewParent0 = ((View)viewParent0).getParent()) {
                if(!(viewParent0 instanceof View)) {
                    if(viewParent0 == null) {
                        break;
                    }
                    khb0.af(true);
                    break;
                }
                if(((View)viewParent0).getAlpha() <= 0.0f || ((View)viewParent0).getVisibility() != 0) {
                    break;
                }
            }
        }
        return khb0;
    }
}

