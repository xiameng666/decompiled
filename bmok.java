import android.app.PendingIntent;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.gms.fido.fido2.ui.AuthenticateChimeraActivity;

public final class bmok implements lqj {
    public final AuthenticateChimeraActivity a;

    public bmok(AuthenticateChimeraActivity authenticateChimeraActivity0) {
        this.a = authenticateChimeraActivity0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        if(((PendingIntent)object0) != null) {
            IntentSenderRequest intentSenderRequest0 = new acy(((PendingIntent)object0).getIntentSender()).a();
            this.a.v.b(intentSenderRequest0);
        }
    }
}

