import android.content.Context;
import androidx.activity.result.ActivityResult;
import com.google.android.chimera.android.Activity;

public final class deqb implements ibts {
    public final icck a;
    public final dixi b;
    public final Activity c;
    public final Context d;

    public deqb(icck icck0, dixi dixi0, Activity activity0, Context context0) {
        this.a = icck0;
        this.b = dixi0;
        this.c = activity0;
        this.d = context0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ActivityResult activityResult0 = (ActivityResult)object0;
        ibuq.f(activityResult0, "result");
        deuh deuh0 = new deuh(this.b, activityResult0, this.c, this.d, null);
        icbb.b(this.a, null, null, deuh0, 3);
        return ibom.a;
    }
}

