import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.android.Activity;

public final class depw implements ibts {
    public final Context a;
    public final Activity b;

    public depw(Context context0, Activity activity0) {
        this.a = context0;
        this.b = activity0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((Uri)object0), "uri");
        Intent intent0 = djaj.d(((Uri)object0), this.a.getPackageManager());
        Activity activity0 = this.b;
        if(activity0 != null) {
            activity0.startActivity(intent0);
        }
        if(activity0 != null) {
            activity0.finishAndRemoveTask();
        }
        return ibom.a;
    }
}

