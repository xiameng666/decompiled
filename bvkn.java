import android.content.Context;
import android.net.Uri;
import com.google.android.chimera.android.Activity;

public final class bvkn implements ibts {
    public final buwj a;

    public bvkn(buwj buwj0) {
        this.a = buwj0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((Context)object0), "context");
        Activity activity0 = (((Context)object0) instanceof Activity) ? ((Activity)(((Context)object0))) : null;
        if(activity0 != null) {
            Uri uri0 = Uri.parse(((String)((gfur_Suppliers)bajn.d).ofInstance_));
            this.a.a.d(uri0, activity0);
        }
        return ibom.a;
    }
}

