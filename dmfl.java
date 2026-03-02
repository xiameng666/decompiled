import android.view.View.OnClickListener;
import android.view.View;

public final class dmfl implements View.OnClickListener {
    public final dmfu a;
    public final String b;

    public dmfl(dmfu dmfu0, String s) {
        this.a = dmfu0;
        this.b = s;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        view0.setClickable(false);
        ibuq.c(view0);
        dmfu dmfu0 = this.a;
        Object object0 = dmfu0.f.a(view0);
        if(object0 != null) {
            icbb.b(((icck)object0), null, null, new dmfs(dmfu0, this.b, view0, null), 3);
            return;
        }
        ((ggtj)dmfu0.g.i()).x("No lifecycle scope found for the view");
    }
}

