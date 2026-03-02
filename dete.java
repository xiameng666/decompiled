import android.content.Intent;
import com.google.android.chimera.android.Activity;

public final class dete implements ibth {
    public final Activity a;
    public final gui b;

    public dete(Activity activity0, gui gui0) {
        this.a = activity0;
        this.b = gui0;
    }

    @Override  // ibth
    public final Object a() {
        devo.e(this.b).a(new demw(ibps.a));
        Activity activity0 = this.a;
        if(activity0 != null) {
            Intent intent0 = activity0.getIntent();
            activity0.setIntent(new Intent((intent0 == null ? null : intent0.getAction())));
        }
        return ibom.a;
    }
}

