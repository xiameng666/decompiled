import android.view.View.OnClickListener;
import android.view.View;

public final class aafj implements View.OnClickListener {
    public final aafw a;

    public aafj(aafw aafw0) {
        this.a = aafw0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        aary aary0 = this.a.z();
        String s = aary0.b.d().b;
        ibuq.e(s, "getAccountName(...)");
        fhru fhru0 = new fhru(new aaro(s));
        aary0.f.l(fhru0);
        aary0.m.e();
    }
}

