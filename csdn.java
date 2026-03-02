import android.view.View.OnClickListener;
import android.view.View;

public final class csdn implements View.OnClickListener {
    public final csdp a;

    public csdn(csdp csdp0) {
        this.a = csdp0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        crxn.c().Q(30, this.a.a.getText().toString(), csgn.f(view0), hhct.aO, System.currentTimeMillis(), Integer.valueOf(this.a.d));
        this.a.z(true);
    }
}

