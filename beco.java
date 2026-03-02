import android.content.Intent;
import com.google.android.gms.credential.manager.invocationparams.CallerInfo;

public final class beco {
    public static void a(Intent intent0, CallerInfo callerInfo0) {
        if(callerInfo0 != null) {
            intent0.putExtra("utm_source", callerInfo0.a);
            intent0.putExtra("utm_medium", callerInfo0.b);
            intent0.putExtra("utm_campaign", callerInfo0.c);
            intent0.putExtra("utm_content", callerInfo0.d);
        }
    }
}

