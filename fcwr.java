import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.wearable.backup.wear.lskfui.pattern.LockPatternView;
import j..util.Objects;
import java.util.List;

public final class fcwr extends fcwh {
    public final LockPatternView m;
    private Rect n;
    private final SparseArray o;

    public fcwr(LockPatternView lockPatternView0, View view0) {
        Objects.requireNonNull(lockPatternView0);
        this.m = lockPatternView0;
        super(view0);
        this.n = new Rect();
        this.o = new SparseArray();
        for(int v = 1; v < 10; ++v) {
            fcwq fcwq0 = new fcwq(this, this.j(v));
            this.o.put(v, fcwq0);
        }
    }

    @Override  // fcwh
    protected final void a(List list0) {
        if(this.m.c) {
            for(int v = 1; v < 10; ++v) {
                list0.add(Integer.valueOf(v));
            }
        }
    }

    @Override  // fcwh
    protected final void d(int v, AccessibilityEvent accessibilityEvent0) {
        fcwq fcwq0 = (fcwq)this.o.get(v);
        if(fcwq0 != null) {
            accessibilityEvent0.getText().add(fcwq0.a);
        }
    }

    @Override  // fcwh
    protected final void e(int v, AccessibilityNodeInfo accessibilityNodeInfo0) {
        accessibilityNodeInfo0.setText(this.j(v));
        accessibilityNodeInfo0.setContentDescription(this.j(v));
        LockPatternView lockPatternView0 = this.m;
        if(lockPatternView0.c) {
            accessibilityNodeInfo0.setFocusable(true);
            if(this.k(v)) {
                accessibilityNodeInfo0.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
                accessibilityNodeInfo0.setClickable(this.k(v));
            }
        }
        Rect rect0 = this.n;
        float f = lockPatternView0.a((v - 1) % 3);
        float f1 = lockPatternView0.b((v - 1) / 3);
        rect0.left = (int)(f - lockPatternView0.d);
        rect0.right = (int)(f + lockPatternView0.d);
        rect0.top = (int)(f1 - lockPatternView0.d);
        rect0.bottom = (int)(f1 + lockPatternView0.d);
        accessibilityNodeInfo0.setBoundsInParent(rect0);
    }

    @Override  // fcwh
    protected final boolean h(int v, int v1) {
        if(v1 != 16) {
            return false;
        }
        super.c(v, 0);
        this.i(v, 1);
        return true;
    }

    private final String j(int v) {
        return this.m.getResources().getString(0x7F15363C, new Object[]{String.valueOf(v)});  // string:wearable_lockscreen_access_pattern_cell_added_verbose "Cell %1$s added"
    }

    private final boolean k(int v) {
        return v != 0x80000000 && !this.m.a[(v - 1) / 3][(v - 1) % 3];
    }

    @Override  // android.view.View$AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view0, AccessibilityEvent accessibilityEvent0) {
        super.onPopulateAccessibilityEvent(view0, accessibilityEvent0);
        LockPatternView lockPatternView0 = this.m;
        if(!lockPatternView0.c) {
            accessibilityEvent0.setContentDescription(lockPatternView0.getContext().getText(0x7F15363B));  // string:wearable_lockscreen_access_pattern_area "Pattern area."
        }
    }
}

