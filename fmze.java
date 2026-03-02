import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;

public final class fmze implements Runnable {
    public final fmzf a;

    public fmze(fmzf fmzf0) {
        this.a = fmzf0;
    }

    @Override
    public final void run() {
        fmzf fmzf0 = this.a;
        View view0 = fmzf0.f;
        Activity activity0 = null;
        if(view0 == null) {
        label_11:
            if(activity0 != null && !activity0.isFinishing()) {
                fmzf0.d();
                fmzf0.e();
                fmzf0.b.showAtLocation(fmzf0.f, 0, fmzf0.a(), fmzf0.b());
            }
        }
        else {
            Context context0 = fmrf.b(view0.getContext(), iaea.j());
            while(true) {
                if(!(context0 instanceof Activity)) {
                    if(!(context0 instanceof ContextWrapper)) {
                        goto label_11;
                    }
                    context0 = ((ContextWrapper)context0).getBaseContext();
                    continue;
                }
                activity0 = (Activity)context0;
                goto label_11;
            }
        }
    }
}

