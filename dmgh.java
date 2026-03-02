import android.content.Intent;
import com.google.android.chimera.IntentOperation;

public abstract class dmgh extends IntentOperation {
    protected abstract void a(Intent arg1);

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(intent0 == null) {
            return;
        }
        this.a(intent0);
    }
}

