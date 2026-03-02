import android.view.View.OnClickListener;
import android.view.View;

public final class bdfu implements View.OnClickListener {
    public final bdho a;

    public bdfu(bdho bdho0) {
        this.a = bdho0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        bfnb bfnb0 = this.a.d;
        if(bfnb0 == null) {
            ibuq.j("screenLockAuthenticationLauncherForImport");
            bfnb0 = null;
        }
        bfnb0.a();
    }
}

