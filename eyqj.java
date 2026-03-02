import android.view.View.OnClickListener;
import android.view.View;

public final class eyqj implements View.OnClickListener {
    public final eyqp a;

    public eyqj(eyqp eyqp0) {
        this.a = eyqp0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        eyzy eyzy0 = this.a.ah;
        if(eyzy0 == null) {
            ibuq.j("googleHelpLauncherHelper");
            eyzy0 = null;
        }
        eyzy0.a("watch-unlock");
    }
}

