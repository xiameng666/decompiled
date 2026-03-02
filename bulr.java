import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View;

public final class bulr implements View.OnClickListener {
    public final buma a;

    public bulr(buma buma0) {
        this.a = buma0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.aA.a(bbdg.xA);
        this.a.aD.d(gltz.e, view0);
        acp acp0 = this.a.aw;
        Context context0 = this.a.requireContext();
        acp0.b(busq.a.a(context0, this.a.av, this.a.ay, 9));
    }
}

