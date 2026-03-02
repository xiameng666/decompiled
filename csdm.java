import android.view.View.OnClickListener;
import android.view.View;

public final class csdm implements View.OnClickListener {
    public final csdp a;

    public csdm(csdp csdp0) {
        this.a = csdp0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        crxn.c().Q(28, this.a.b.getText().toString(), csgn.f(view0), hhct.aM, System.currentTimeMillis(), Integer.valueOf(this.a.d));
        this.a.z(false);
    }
}

