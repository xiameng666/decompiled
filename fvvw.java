import android.util.Log;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.location.ealert.ux.EAlertSafetyInfoChimeraActivity;

public final class fvvw implements fcfc {
    public final EAlertSafetyInfoChimeraActivity a;

    public fvvw(EAlertSafetyInfoChimeraActivity eAlertSafetyInfoChimeraActivity0) {
        this.a = eAlertSafetyInfoChimeraActivity0;
    }

    @Override  // fcfc
    public final void a(MessageEventParcelable messageEventParcelable0) {
        Log.i("EAlertSafetyInfoAct", "message received");
        String s = messageEventParcelable0.b;
        if(s.hashCode() == -1175900796 && s.equals("/ealert_mute_alarm")) {
            fvwf fvwf0 = this.a.j;
            if(fvwf0 != null) {
                fvwf0.z(true);
            }
            return;
        }
        Log.i("EAlertSafetyInfoAct", "unrecognized path received: " + s);
    }
}

