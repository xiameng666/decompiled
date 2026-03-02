import android.view.View.OnClickListener;
import android.view.View;

public final class bdaz implements View.OnClickListener {
    public final bdbg a;
    public final gqmd b;

    public bdaz(bdbg bdbg0, gqmd gqmd0) {
        this.a = bdbg0;
        this.b = gqmd0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        String s = ((grdf)((bedg)this.b.j()).b.d()).a;
        beln beln0 = ((bfqs)this.a.g).a.a;
        CharSequence charSequence0 = ((bfqs)this.a.g).a.getResources().getText(0x7F1508B0);  // string:common_password "Password"
        beln0.f.b(s, charSequence0);
        beln0.b();
    }
}

