import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;

public final class dwdp implements View.OnClickListener {
    public final dwef a;
    public final dweg b;

    public dwdp(dwef dwef0, dweg dweg0) {
        this.a = dwef0;
        this.b = dweg0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        fhvw fhvw0 = this.a.B();
        fhvv fhvv0 = fhvv.d();
        Button button0 = this.a.am;
        if(button0 == null) {
            ibuq.j("acceptButton");
            button0 = null;
        }
        fhvw0.a(fhvv0, button0);
        this.b.a.d.a();
    }
}

