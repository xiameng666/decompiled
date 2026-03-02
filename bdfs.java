import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class bdfs implements DialogInterface.OnClickListener {
    public final bdho a;

    public bdfs(bdho bdho0) {
        this.a = bdho0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        bfnb bfnb0 = this.a.c;
        if(bfnb0 == null) {
            ibuq.j("screenLockAuthenticationLauncherForExport");
            bfnb0 = null;
        }
        bfnb0.a();
    }
}

