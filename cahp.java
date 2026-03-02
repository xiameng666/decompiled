import android.content.Context;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;

public final class cahp implements ibts {
    public final Context a;
    public final caie b;

    public cahp(Context context0, caie caie0) {
        this.a = context0;
        this.b = caie0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((ActivityResult)object0), "activityResult");
        Context context0 = this.a;
        if(((ActivityResult)object0).a == -1) {
            Toast.makeText(context0, "Key retrieval resolved successfully.", 1).show();
            this.b.e.a();
            return ibom.a;
        }
        Toast.makeText(context0, "Key retrieval failed.", 1).show();
        return ibom.a;
    }
}

