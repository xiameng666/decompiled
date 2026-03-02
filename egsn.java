import android.view.View.OnClickListener;
import android.view.View;

public final class egsn implements View.OnClickListener {
    public final egsq a;

    public egsn(egsq egsq0) {
        this.a = egsq0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        egsq egsq0 = this.a;
        if(egsq0.at) {
            if(egsq0.ah.f()) {
                egsq0.ah.c(false);
                egsq0.C();
                return;
            }
        }
        else if(!egsq0.ag.isChecked()) {
            egsq0.C();
            return;
        }
        egsd egsd0 = new egsd(egsq0.getContext());
        if(egsq0.ar) {
            egsd0.b(egsq0.b.name, false, 8);
        }
        else {
            egsd0.a(egsq0.b.name, false, 8);
        }
        egsq0.c.c().g(egsq0, new egsf(egsq0));
    }
}

