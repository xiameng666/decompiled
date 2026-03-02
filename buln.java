import android.view.View.OnClickListener;
import android.view.View;

public final class buln implements View.OnClickListener {
    public final bulo a;
    public final hivi b;

    public buln(bulo bulo0, hivi hivi0) {
        this.a = bulo0;
        this.b = hivi0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        bulo bulo0 = this.a;
        buku buku0 = bulo0.ag;
        if(buku0 != null) {
            hiwt hiwt0 = this.b.b == null ? hiwt.a : this.b.b;
            buli buli0 = buku0.a.aF;
            ibuq.f(hiwt0, "<set-?>");
            buli0.c = hiwt0;
            buku0.a.B();
        }
        bulo0.dismiss();
    }
}

