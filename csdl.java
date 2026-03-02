import android.view.View.OnClickListener;
import android.view.View;

public final class csdl implements View.OnClickListener {
    public final csdp a;

    public csdl(csdp csdp0) {
        this.a = csdp0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        csdp csdp0 = this.a;
        crxn.c().Q(29, csdp0.a.getText().toString(), csgn.f(view0), hhct.aN, System.currentTimeMillis(), Integer.valueOf(csdp0.d));
        if(!csdp0.c.pageDown(false)) {
            csdp0.y(true);
        }
    }
}

