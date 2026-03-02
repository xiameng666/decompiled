import android.net.Uri;
import android.view.View.OnClickListener;
import android.view.View;

public final class bgmn implements View.OnClickListener {
    public final bgmo a;
    public final String b;
    public final Uri c;

    public bgmn(bgmo bgmo0, Uri uri0) {
        this.a = bgmo0;
        this.b = "LEARN_MORE_PASSWORD_MANAGER_SCREEN";
        this.c = uri0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.a.a(this.b, this.c.toString());
    }
}

