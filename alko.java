import android.app.AlertDialog;
import android.view.View.OnClickListener;
import android.view.View;

public final class alko implements View.OnClickListener {
    public final alkt a;

    public alko(alkt alkt0) {
        this.a = alkt0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        aljd aljd0 = aljd.y(this.a.a, this.a.b, false);
        aljd0.show(this.a.getFragmentManager(), "DisableBetterTogetherDialogFragment");
        this.a.getFragmentManager().aq();
        AlertDialog alertDialog0 = (AlertDialog)aljd0.getDialog();
        alertDialog0.getButton(-1).setAllCaps(false);
        alertDialog0.getButton(-2).setAllCaps(false);
    }
}

