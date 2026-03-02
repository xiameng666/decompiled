import android.content.Context;
import android.view.accessibility.AccessibilityManager;

public final class ijz {
    private final AccessibilityManager a;

    public ijz(Context context0) {
        Object object0 = context0.getSystemService("accessibility");
        ibuq.d(object0, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.a = (AccessibilityManager)object0;
    }

    public final long a(long v, boolean z, boolean z1) {
        int v1 = 1;
        if(v >= 0x7FFFFFFFL) {
            return v;
        }
        if(z) {
            v1 = 3;
        }
        if(z1) {
            v1 |= 4;
        }
        int v2 = this.a.getRecommendedTimeoutMillis(((int)v), v1);
        return v2 == 0x7FFFFFFF ? 0x7FFFFFFFFFFFFFFFL : ((long)v2);
    }
}

