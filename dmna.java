import android.view.View.OnClickListener;
import android.view.View;

public final class dmna implements View.OnClickListener {
    public final dmlv a;
    public final dmnb b;

    public dmna(dmlv dmlv0, dmnb dmnb0) {
        this.a = dmlv0;
        this.b = dmnb0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        int v = this.a.h ^ 1;
        this.a.h = v;
        this.b.x.setChecked(((boolean)v));
        ibth ibth0 = this.b.t;
        if(ibth0 != null) {
            ibth0.a();
        }
    }
}

