import android.content.Intent;
import com.google.android.chimera.android.Activity;

public final class ddxq implements ibth {
    public final Activity a;

    public ddxq(Activity activity0) {
        this.a = activity0;
    }

    @Override  // ibth
    public final Object a() {
        Activity activity0 = this.a;
        if(activity0 != null) {
            Intent intent0 = activity0.getIntent();
            activity0.setIntent((intent0 == null ? null : djaj.e(intent0)));
        }
        return ibom.a;
    }
}

