import android.app.Activity;
import android.app.AlertDialog;
import androidx.preference.Preference;

public final class eknk implements ohi {
    public final eknt a;
    public final Activity b;

    public eknk(eknt eknt0, Activity activity0) {
        this.a = eknt0;
        this.b = activity0;
    }

    @Override  // ohi
    public final boolean b(Preference preference0, Object object0) {
        ibuq.f(preference0, "<unused var>");
        ibuq.d(object0, "null cannot be cast to non-null type kotlin.Boolean");
        eknt eknt0 = this.a;
        if(((Boolean)object0).booleanValue()) {
            eknt0.K(this.b, true);
            return true;
        }
        AlertDialog alertDialog0 = eknt0.ah;
        if(alertDialog0 == null) {
            ibuq.j("disableV5Dialog");
            alertDialog0 = null;
        }
        alertDialog0.show();
        return false;
    }
}

