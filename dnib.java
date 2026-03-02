import android.content.Intent;
import android.net.Uri;
import android.view.View.OnClickListener;
import android.view.View;

public final class dnib implements View.OnClickListener {
    public final dnjs a;
    public final dxev b;

    public dnib(dnjs dnjs0, dxev dxev0) {
        this.a = dnjs0;
        this.b = dxev0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.i.d(hami.y);
        hkhr hkhr0 = this.b.c == null ? hkhr.b : this.b.c;
        hjwt hjwt0 = hkhr0.d == null ? hjwt.a : hkhr0.d;
        String s = "&id=" + (hjwt0.c == null ? hjwv.a : hjwt0.c).b;
        hkhr hkhr1 = this.b.c == null ? hkhr.b : this.b.c;
        String s1 = ((hkhr1.d == null ? hjwt.a : hkhr1.d).b & 1) == 0 ? hwnz.c() : hwnz.c() + s;
        Intent intent0 = new Intent("android.intent.action.VIEW").setData(Uri.parse(s1));
        this.a.e.startActivity(intent0);
    }
}

