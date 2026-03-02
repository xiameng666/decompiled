import android.content.Intent;
import android.net.Uri;
import android.view.View.OnClickListener;
import android.view.View;

public final class dxqm implements View.OnClickListener {
    public final dzdl a;
    public final dxqw b;

    public dxqm(dzdl dzdl0, dxqw dxqw0) {
        this.a = dzdl0;
        this.b = dxqw0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(((String)this.a.p.get())));
        this.b.requireContext().startActivity(intent0);
        this.b.S();
    }
}

