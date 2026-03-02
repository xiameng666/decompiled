import android.view.View.OnClickListener;
import android.view.View;

public final class eaem implements View.OnClickListener {
    public final eaeu a;
    public final eadc b;

    public eaem(eaeu eaeu0, eadc eadc0) {
        this.a = eaeu0;
        this.b = eadc0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.B().a(fhvv.d(), view0);
        this.b.b.a();
    }
}

