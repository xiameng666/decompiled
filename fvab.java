import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.location.activity.util.ActivityRecognitionHelper.LastActivityReceiver;

public final class fvab {
    public final bbpj a;
    public volatile ActivityRecognitionResult b;
    private final BroadcastReceiver c;
    private final Context d;

    public fvab(Context context0) {
        this.d = context0;
        this.a = bbpj.a(context0);
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("com.google.android.location.activity.ACTIVITY_RESULT");
        ActivityRecognitionHelper.LastActivityReceiver activityRecognitionHelper$LastActivityReceiver0 = new ActivityRecognitionHelper.LastActivityReceiver(this);
        this.c = activityRecognitionHelper$LastActivityReceiver0;
        lvj.a(context0).c(activityRecognitionHelper$LastActivityReceiver0, intentFilter0);
    }
}

