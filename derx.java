import android.content.Intent;
import com.google.android.chimera.android.Activity;

public final class derx implements ibts {
    public final icck a;
    public final dixi b;
    public final Activity c;
    public final gui d;

    public derx(icck icck0, dixi dixi0, Activity activity0, gui gui0) {
        this.a = icck0;
        this.b = dixi0;
        this.c = activity0;
        this.d = gui0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Intent intent0 = (Intent)object0;
        ibuq.f(intent0, "intent");
        deud deud0 = new deud(intent0, this.b, this.c, this.d, null);
        icbb.b(this.a, null, null, deud0, 3);
        return ibom.a;
    }
}

