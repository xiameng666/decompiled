import android.view.View.OnClickListener;
import android.view.View;

public final class dwim implements View.OnClickListener {
    public final uq a;
    public final dwip b;

    public dwim(uq uq0, dwip dwip0) {
        this.a = uq0;
        this.b = dwip0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        dwip dwip0 = this.b;
        int v = this.a.fp();
        dwiz dwiz0 = dwip0.a;
        if(dwiz0.a != null && v == ((int)dwiz0.a)) {
            return;
        }
        Integer integer0 = dwiz0.a;
        dwiz0.a = v;
        if(integer0 != null) {
            dwip0.r(integer0.intValue());
        }
        dwip0.r(v);
    }
}

