import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class bmru implements View.OnClickListener {
    public final bmsd a;

    public bmru(bmsd bmsd0) {
        this.a = bmsd0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.a.l(blhf.W);
        Intent intent0 = new Intent("android.settings.ADD_ACCOUNT_SETTINGS");
        intent0.putExtra("account_types", new String[]{"com.google"});
        this.a.c.b(intent0);
    }
}

