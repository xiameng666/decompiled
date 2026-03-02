import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class cqke implements View.OnClickListener {
    public final cqkf a;

    public cqke(cqkf cqkf0) {
        this.a = cqkf0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Intent intent0 = new Intent("android.app.action.SET_NEW_PASSWORD");
        this.a.b.b(intent0);
    }
}

