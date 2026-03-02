import android.view.View.OnClickListener;
import android.view.View;

public final class aach implements View.OnClickListener {
    public final zjn a;
    public final aacc b;

    public aach(zjn zjn0, aacc aacc0) {
        this.a = zjn0;
        this.b = aacc0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        zjn zjn0 = this.a;
        zjo zjo0 = zjn0.b;
        if(zjo0 != null) {
            aacc aacc0 = this.b;
            int v = zjo0.d;
            switch(zjn0.c - 1) {
                case 0: {
                    goto label_7;
                }
                case 1: {
                    goto label_10;
                }
            }
            return;
        label_7:
            if(v == 1) {
                aacc0.a(zjo0.a);
                return;
            label_10:
                if(v == 1) {
                    gftb.check(((aann)aacc0).a.g);
                    grxw grxw0 = ((aann)aacc0).a.g.b();
                    ((aann)aacc0).a.a.f(zjo0.a, grxw0);
                    return;
                }
                aacc0.a(zjo0.a);
            }
        }
    }
}

