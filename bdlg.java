import android.app.PendingIntent;
import androidx.activity.result.IntentSenderRequest;

public final class bdlg implements ibts {
    public final acp a;

    public bdlg(acp acp0) {
        this.a = acp0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        PendingIntent pendingIntent0 = (PendingIntent)object0;
        ibuq.c(pendingIntent0);
        IntentSenderRequest intentSenderRequest0 = new acy(pendingIntent0).a();
        this.a.b(intentSenderRequest0);
        return ibom.a;
    }
}

