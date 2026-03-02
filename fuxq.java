import android.content.Context;
import android.content.Intent;

public final class fuxq {
    public static final Intent a(Context context0) {
        Intent intent0 = new Intent().setClassName(context0, "com.google.android.location.settings.DrivingConditionProvider");
        intent0.setAction("ActivityTransition");
        return intent0;
    }
}

