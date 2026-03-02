import android.content.Intent;
import com.google.android.chimera.android.Activity;

public final class ddvu implements ibth {
    public final Activity a;
    public final nry b;

    public ddvu(Activity activity0, nry nry0) {
        this.a = activity0;
        this.b = nry0;
    }

    @Override  // ibth
    public final Object a() {
        Activity activity0 = this.a;
        if(activity0 != null) {
            Intent intent0 = activity0.getIntent();
            if(intent0 != null) {
                intent0.setAction("com.google.android.gms.SHARE_NEARBY");
            }
        }
        ddvv ddvv0 = new ddvv(this.b);
        this.b.k("home/send", ddvv0);
        return ibom.a;
    }
}

