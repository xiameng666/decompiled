import android.view.accessibility.AccessibilityNodeInfo.RangeInfo;

public final class kha {
    final Object a;

    public kha(Object object0) {
        this.a = object0;
    }

    public static kha a(float f, float f1, float f2) {
        return new kha(AccessibilityNodeInfo.RangeInfo.obtain(1, f, f1, f2));
    }
}

