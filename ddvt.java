import android.content.Intent;
import com.google.android.chimera.android.Activity;

public final class ddvt implements ibth {
    public final Activity a;
    public final nry b;

    public ddvt(Activity activity0, nry nry0) {
        this.a = activity0;
        this.b = nry0;
    }

    @Override  // ibth
    public final Object a() {
        Activity activity0 = this.a;
        if(activity0 != null) {
            Intent intent0 = activity0.getIntent();
            if(intent0 != null) {
                intent0.setAction("com.google.android.gms.RECEIVE_NEARBY");
            }
        }
        ddvq ddvq0 = new ddvq(this.b);
        this.b.k("home/receive", ddvq0);
        return ibom.a;
    }
}

