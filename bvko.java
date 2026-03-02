import android.content.Context;
import com.google.android.chimera.android.Activity;

public final class bvko implements ibts {
    public final ibts a;

    public bvko(ibts ibts0) {
        this.a = ibts0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((Context)object0), "context");
        Activity activity0 = (((Context)object0) instanceof Activity) ? ((Activity)(((Context)object0))) : null;
        if(activity0 != null) {
            this.a.a(activity0);
        }
        return ibom.a;
    }
}

