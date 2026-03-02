import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class dxkd implements View.OnClickListener {
    public final dxkg a;
    public final String b;

    public dxkd(dxkg dxkg0, String s) {
        this.a = dxkg0;
        this.b = s;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Intent intent0 = dlnf.be(this.a.u, this.b, dlnd.t);
        this.a.u.startActivity(intent0);
    }
}

