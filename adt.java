import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;

public final class adt extends adc {
    @Override  // adc
    public final Intent a(Context context0, Object object0) {
        Intent intent0 = (Intent)object0;
        ibuq.f(intent0, "input");
        return intent0;
    }

    @Override  // adc
    public final Object b(int v, Intent intent0) {
        return new ActivityResult(v, intent0);
    }
}

