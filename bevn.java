import android.content.Intent;
import android.net.Uri;
import android.view.View.OnClickListener;
import android.view.View;

public final class bevn implements View.OnClickListener {
    public final bevp a;
    public final String b;

    public bevn(bevp bevp0, String s) {
        this.a = bevp0;
        this.b = s;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.e.a.c.a(gqsm.NI);
        Intent intent0 = new ank().a().a;
        intent0.setData(Uri.parse(this.b));
        intent0.addFlags(0x14000000);
        this.a.e.a.b.b(intent0);
    }
}

