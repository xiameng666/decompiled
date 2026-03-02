import android.content.ClipData;
import android.content.Intent;
import com.google.android.chimera.android.Activity;

public final class detf implements ibts {
    public final Activity a;
    public final icck b;
    public final gui c;

    public detf(Activity activity0, icck icck0, gui gui0) {
        this.a = activity0;
        this.b = icck0;
        this.c = gui0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Intent intent0;
        ibuq.f(((ClipData)object0), "it");
        Activity activity0 = this.a;
        if(activity0 == null) {
            intent0 = new Intent();
        }
        else {
            intent0 = activity0.getIntent();
            if(intent0 == null) {
                intent0 = new Intent();
            }
        }
        intent0.setAction("android.intent.action.SEND_MULTIPLE");
        intent0.setType("*/*");
        intent0.setClipData(((ClipData)object0));
        detm detm0 = new detm(activity0, intent0, this.c, null);
        icbb.b(this.b, null, null, detm0, 3);
        return ibom.a;
    }
}

