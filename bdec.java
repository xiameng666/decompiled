import android.view.View.OnClickListener;
import android.view.View;

public final class bdec implements View.OnClickListener {
    public final bdee a;
    public final bedc b;

    public bdec(bdee bdee0, bedc bedc0) {
        this.a = bdee0;
        this.b = bedc0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        bedc bedc0 = this.b;
        ibuq.f(bedc0, "entry");
        bdef bdef0 = this.a.e;
        belv belv0 = bdef0.a;
        if(hsas.d()) {
            ibuq.f(bedc0, "blocklistEntry");
            icbb.b(lsc.a(belv0), null, null, new belu(belv0, bedc0, null), 3);
            return;
        }
        ibuq.f(bedc0, "blocklistEntry");
        belv0.b.a(bedc0).g(bdef0.b.getViewLifecycleOwner(), new bdeo(new bden(bdef0.b)));
    }
}

