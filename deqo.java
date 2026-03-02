import android.content.Intent;
import com.google.android.chimera.android.Activity;

public final class deqo implements ibts {
    public final Activity a;
    public final boolean b;
    public final gui c;
    public final gra d;

    public deqo(Activity activity0, boolean z, gui gui0, gra gra0) {
        this.a = activity0;
        this.b = z;
        this.c = gui0;
        this.d = gra0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((lto)object0), "$this$LifecycleStartEffect");
        gui gui0 = this.c;
        iced iced0 = (iced)devo.e(gui0).a(deei.a);
        iced iced1 = (iced)devo.e(gui0).a(deds.a);
        iced iced2 = (iced)devo.e(gui0).a(dedm.a);
        iced iced3 = (iced)devo.e(gui0).a(dedo.a);
        Activity activity0 = this.a;
        boolean z = false;
        if(activity0 != null) {
            Intent intent0 = activity0.getIntent();
            if(intent0 != null && !intent0.hasExtra("share_target_bytes") && !this.b) {
                z = true;
            }
        }
        devo.g(this.d, z);
        devo.e(gui0).a(denf.a);
        return new deug(iced0, iced1, iced2, iced3);
    }
}

