import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class bmrx implements View.OnClickListener {
    public final bmsd a;

    public bmrx(bmsd bmsd0) {
        this.a = bmsd0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.a.l(blhf.ab);
        Intent intent0 = new Intent("android.app.action.SET_NEW_PASSWORD");
        this.a.c.b(intent0);
    }
}

