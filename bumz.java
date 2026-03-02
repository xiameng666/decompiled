import android.view.View.OnClickListener;
import android.view.View;

public final class bumz implements View.OnClickListener {
    public final buna a;
    public final hivj b;

    public bumz(buna buna0, hivj hivj0) {
        this.a = buna0;
        this.b = hivj0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        buna buna0 = this.a;
        buku buku0 = buna0.ag;
        if(buku0 != null) {
            hiwv hiwv0 = this.b.b == null ? hiwv.a : this.b.b;
            buli buli0 = buku0.a.aF;
            ibuq.f(hiwv0, "<set-?>");
            buli0.b = hiwv0;
            buku0.a.B();
        }
        buna0.dismiss();
    }
}

