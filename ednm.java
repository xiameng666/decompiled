import android.content.Intent;
import com.google.android.gms.pay.HomeIntentArgs;
import com.google.android.gms.pay.IntentSource;

public final class ednm {
    public static final int a(Intent intent0) {
        ibuq.f(intent0, "<this>");
        Integer integer0 = ednm.b(intent0);
        return integer0 == null ? 0 : ((int)integer0);
    }

    public static final Integer b(Intent intent0) {
        HomeIntentArgs homeIntentArgs0 = ednn.a(intent0.getExtras()).n;
        if(homeIntentArgs0 != null) {
            return homeIntentArgs0.b == null ? null : ((int)homeIntentArgs0.b.a);
        }
        return null;
    }

    public static final Integer c(Intent intent0) {
        IntentSource intentSource0 = ednn.a(intent0.getExtras()).d;
        return intentSource0 == null ? null : ((int)intentSource0.a);
    }

    public static final boolean d(Intent intent0) {
        ibuq.f(intent0, "<this>");
        return ednm.a(intent0) == 1;
    }
}

