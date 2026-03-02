import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Switch;
import com.google.android.gms.auth.proximity.phonehub.UpdateLocalFeatureStateIntentOperation;

public final class alkr implements View.OnClickListener {
    public final alkt a;
    public final Switch b;

    public alkr(alkt alkt0, Switch switch0) {
        this.a = alkt0;
        this.b = switch0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        boolean z = this.b.isChecked();
        String s = this.a.a;
        this.a.getContext().startService(UpdateLocalFeatureStateIntentOperation.b(this.a.getContext(), s, z));
        this.a.c.P(z);
    }
}

