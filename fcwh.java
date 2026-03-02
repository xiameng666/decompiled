import android.content.Context;
import android.graphics.Rect;
import android.view.View.AccessibilityDelegate;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

public abstract class fcwh extends View.AccessibilityDelegate {
    public static final String a;
    public static final Rect b;
    public Rect c;
    public Rect d;
    public int[] e;
    public Rect f;
    public List g;
    public final AccessibilityManager h;
    public final View i;
    public final Context j;
    public int k;
    public int l;
    private fcwg m;

    static {
        fcwh.a = View.class.getName();
        fcwh.b = new Rect(0x7FFFFFFF, 0x7FFFFFFF, 0x80000000, 0x80000000);
    }

    public fcwh(View view0) {
        this.k = 0x80000000;
        this.l = 0x80000000;
        this.i = view0;
        Context context0 = view0.getContext();
        this.j = context0;
        this.h = (AccessibilityManager)context0.getSystemService("accessibility");
    }

    protected abstract void a(List arg1);

    public final void b() {
        this.c(-1, 1);
    }

    public final void c(int v, int v1) {
        if(v != 0x80000000 && this.h.isEnabled()) {
            View view0 = this.i;
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 != null) {
                AccessibilityEvent accessibilityEvent0 = this.j(v, 0x800);
                accessibilityEvent0.setContentChangeTypes(v1);
                viewParent0.requestSendAccessibilityEvent(view0, accessibilityEvent0);
            }
        }
    }

    protected abstract void d(int arg1, AccessibilityEvent arg2);

    protected abstract void e(int arg1, AccessibilityNodeInfo arg2);

    public final void f(int v) {
        int v1 = this.l;
        if(v1 == v) {
            return;
        }
        this.l = v;
        this.i(v, 0x80);
        this.i(v1, 0x100);
    }

    public final boolean g(int v) {
        return this.k == v;
    }

    @Override  // android.view.View$AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view0) {
        if(this.m == null) {
            this.m = new fcwg(this);
        }
        return this.m;
    }

    protected abstract boolean h(int arg1, int arg2);

    final void i(int v, int v1) {
        if(v != 0x80000000 && this.h.isEnabled()) {
            View view0 = this.i;
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 != null) {
                viewParent0.requestSendAccessibilityEvent(view0, this.j(v, v1));
            }
        }
    }

    private final AccessibilityEvent j(int v, int v1) {
        if(v != -1) {
            AccessibilityEvent accessibilityEvent0 = AccessibilityEvent.obtain(v1);
            accessibilityEvent0.setEnabled(true);
            accessibilityEvent0.setClassName(fcwh.a);
            this.d(v, accessibilityEvent0);
            if(accessibilityEvent0.getText().isEmpty() && accessibilityEvent0.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEvent0.setPackageName("com.google.android.gms");
            accessibilityEvent0.setSource(this.i, v);
            return accessibilityEvent0;
        }
        AccessibilityEvent accessibilityEvent1 = AccessibilityEvent.obtain(v1);
        this.i.onInitializeAccessibilityEvent(accessibilityEvent1);
        return accessibilityEvent1;
    }
}

