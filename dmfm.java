import android.content.Intent;
import android.net.Uri;
import android.view.View.OnClickListener;
import android.view.View;

public final class dmfm implements View.OnClickListener {
    public final dmfu a;
    public final String b;

    public dmfm(dmfu dmfu0, String s) {
        this.a = dmfu0;
        this.b = s;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(this.b));
        this.a.a.startActivity(intent0);
        this.a.c.f("CARD_STATUS_LEARN_MORE");
        view0.setClickable(true);
    }
}

