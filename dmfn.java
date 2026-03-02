import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class dmfn implements View.OnClickListener {
    public final dmfu a;
    public final String b;

    public dmfn(dmfu dmfu0, String s) {
        this.a = dmfu0;
        this.b = s;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        dmqk dmqk0 = new dmqk();
        dmqk0.d(this.a.b);
        dmqk0.i(this.b);
        dmqk0.e(13);
        Intent intent0 = dmqk0.c();
        this.a.a.startActivityForResult(intent0, 1200);
        this.a.c.f("CARD_STATUS_DETAILS");
    }
}

