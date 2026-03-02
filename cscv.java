import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class cscv implements View.OnClickListener {
    public final csdd a;

    public cscv(csdd csdd0) {
        this.a = csdd0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.a.startActivity(new Intent("android.settings.MANAGE_ALL_SIM_PROFILES_SETTINGS"));
    }
}

