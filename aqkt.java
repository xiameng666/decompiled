import android.content.Intent;
import com.google.android.chimera.IntentOperation;

public abstract class aqkt extends IntentOperation {
    private static final baun a;

    static {
        aqkt.a = aqql.a("UserAwareIntentOperation");
    }

    public abstract void a(Intent arg1);

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(hqhn.e() && !aqzv.a()) {
            aqkt.a.d("User not 0, ignoring intent " + intent0, new Object[0]);
            return;
        }
        this.a(intent0);
    }
}

