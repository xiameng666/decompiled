import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class dxkc implements View.OnClickListener {
    public final dxkg a;
    public final String b;

    public dxkc(dxkg dxkg0, String s) {
        this.a = dxkg0;
        this.b = s;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Intent intent0 = dlnf.x(this.b);
        this.a.u.startActivity(intent0);
    }
}

