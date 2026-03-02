import android.view.View.OnClickListener;
import android.view.View;

public final class bdao implements View.OnClickListener {
    public final bdau a;
    public final gqmd b;

    public bdao(bdau bdau0, gqmd gqmd0) {
        this.a = bdau0;
        this.b = gqmd0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        String s = this.b.k();
        CharSequence charSequence0 = this.a.f.d.getResources().getText(0x7F152683);  // string:pwm_clipboard_label_copied_username "Username"
        this.a.f.f.a(s, charSequence0);
        this.a.f.a();
        this.a.f.e.a(gqsm.ML);
    }
}

