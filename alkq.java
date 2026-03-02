import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Switch;

public final class alkq implements View.OnClickListener {
    public final alkt a;
    public final Switch b;

    public alkq(alkt alkt0, Switch switch0) {
        this.a = alkt0;
        this.b = switch0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        alkt alkt0 = this.a;
        if(this.b.isChecked()) {
            if(almv.a(alkt0.getContext())) {
                alkt0.y(true);
                return;
            }
            alkt0.d.c();
            return;
        }
        alkt0.y(false);
    }
}

