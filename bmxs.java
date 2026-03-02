import android.content.DialogInterface.OnShowListener;
import android.content.DialogInterface;

public final class bmxs implements DialogInterface.OnShowListener {
    public final bmxu a;
    public final fyfv b;

    public bmxs(bmxu bmxu0, fyfv fyfv0) {
        this.a = bmxu0;
        this.b = fyfv0;
    }

    @Override  // android.content.DialogInterface$OnShowListener
    public final void onShow(DialogInterface dialogInterface0) {
        this.a.ak = this.b.a();
        this.a.al.e(this.a.ak);
        this.a.y();
    }
}

