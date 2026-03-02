import android.view.View.OnClickListener;
import android.view.View;

public final class bdax implements View.OnClickListener {
    public final bdbg a;
    public final gqmd b;

    public bdax(bdbg bdbg0, gqmd gqmd0) {
        this.a = bdbg0;
        this.b = gqmd0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        String s = this.b.k();
        ((bfqr)this.a.f).a.a.a(s, ((bfqr)this.a.f).a.getResources().getText(0x7F152683));  // string:pwm_clipboard_label_copied_username "Username"
    }
}

