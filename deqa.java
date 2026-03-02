import android.content.Intent;
import com.google.android.chimera.android.Activity;
import java.util.ArrayList;
import java.util.List;

public final class deqa implements ibts {
    public final Activity a;
    public final icck b;
    public final dixi c;

    public deqa(Activity activity0, icck icck0, dixi dixi0) {
        this.a = activity0;
        this.b = icck0;
        this.c = dixi0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((List)object0), "uris");
        if(!((List)object0).isEmpty()) {
            Activity activity0 = this.a;
            if(activity0 != null) {
                Intent intent0 = activity0.getIntent();
                if(intent0 != null) {
                    intent0.setAction("android.intent.action.SEND_MULTIPLE");
                    intent0.setType("*/*");
                    intent0.putParcelableArrayListExtra("android.intent.extra.STREAM", new ArrayList(((List)object0)));
                    deuf deuf0 = new deuf(this.c, activity0, intent0, null);
                    icbb.b(this.b, null, null, deuf0, 3);
                }
            }
        }
        return ibom.a;
    }
}

