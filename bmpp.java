import android.content.DialogInterface.OnShowListener;
import android.content.DialogInterface;

public final class bmpp implements DialogInterface.OnShowListener {
    public final bmqj a;
    public final fyfv b;

    public bmpp(bmqj bmqj0, fyfv fyfv0) {
        this.a = bmqj0;
        this.b = fyfv0;
    }

    @Override  // android.content.DialogInterface$OnShowListener
    public final void onShow(DialogInterface dialogInterface0) {
        bmqj bmqj0 = this.a;
        bmqj0.ak = this.b.a();
        bmqj0.aj.e(bmqj0.ak);
        int v = bmqj0.requireArguments().getInt("start_ui", -1);
        if(v != -1) {
            bmqj0.ai.y(v);
            bmqj0.z();
        }
    }
}

