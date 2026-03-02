import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Switch;
import com.google.android.gms.auth.proximity.multidevice.SetFeatureEnabledIntentOperation;

public final class alkm implements View.OnClickListener {
    public final alkt a;
    public final gqus b;
    public final Switch c;

    public alkm(alkt alkt0, gqus gqus0, Switch switch0) {
        this.a = alkt0;
        this.b = gqus0;
        this.c = switch0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Context context0 = this.a.getContext();
        Context context1 = this.a.getContext();
        String s = this.a.a;
        boolean z = this.c.isChecked();
        context0.startService(SetFeatureEnabledIntentOperation.a(context1, s, this.b, z));
        this.c.isChecked();
    }
}

