import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.location.os.real.RealActivityRecognitionServiceClient.ActivityResultsReceiver;

public final class fwvb {
    private final Context a;
    private final lvj b;
    private final RealActivityRecognitionServiceClient.ActivityResultsReceiver c;

    public fwvb(Context context0) {
        this.a = context0;
        this.b = lvj.a(context0);
        this.c = new RealActivityRecognitionServiceClient.ActivityResultsReceiver(this);
    }

    public final void a() {
        hedk hedk0 = new hedk("com.google.android.gms");
        PendingIntent pendingIntent0 = this.c();
        hedk0.l(pendingIntent0);
        if(hedk0.a(this.a) == null) {
            pendingIntent0.cancel();
        }
    }

    public final void b(long v) {
        cmmo cmmo0 = new cmmo();
        cmmo0.c(v);
        cmmo0.c = true;
        cmmo0.e = "ActivityTransitionApi:AR";
        if(humo.e()) {
            cmmo0.i = "activity_recognition_provider";
        }
        ActivityRecognitionRequest activityRecognitionRequest0 = cmmo0.a();
        hedk hedk0 = new hedk("com.google.android.gms");
        hedk0.g(true);
        hedk0.f(activityRecognitionRequest0, this.c());
        if(hedk0.a(this.a) != null) {
            String s = gzkq.a("com.google.android.location.internal.action.AR_TRANSITION_RESULT");
            if(s != null) {
                IntentFilter intentFilter0 = new IntentFilter(s);
                this.b.c(this.c, intentFilter0);
            }
        }
    }

    private final PendingIntent c() {
        Intent intent0 = new Intent();
        intent0.setComponent(new ComponentName(this.a, "com.google.android.location.internal.PendingIntentCallbackService"));
        intent0.setPackage("com.google.android.gms");
        intent0.setAction("com.google.android.location.internal.action.AR_TRANSITION_RESULT");
        return PendingIntent.getService(this.a, 0, intent0, 0xA000000);
    }
}

