import android.view.View.OnClickListener;
import android.view.View;

public final class bdap implements View.OnClickListener {
    public final bdau a;
    public final gqmd b;

    public bdap(bdau bdau0, gqmd gqmd0) {
        this.a = bdau0;
        this.b = gqmd0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        String s = ((grdf)((bedg)this.b.j()).b.d()).a;
        CharSequence charSequence0 = this.a.f.d.getResources().getText(0x7F1508B0);  // string:common_password "Password"
        this.a.f.f.b(s, charSequence0);
        this.a.f.a();
        this.a.f.e.a(gqsm.MK);
    }
}

