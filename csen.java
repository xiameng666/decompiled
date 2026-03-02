import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.Window;

public final class csen implements View.OnClickListener {
    public final csep a;
    public final AlertDialog b;
    public final Context c;

    public csen(csep csep0, AlertDialog alertDialog0, Context context0) {
        this.a = csep0;
        this.b = alertDialog0;
        this.c = context0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.ai.onClick(view0);
        AlertDialog alertDialog0 = this.b;
        alertDialog0.setCancelable(false);
        try {
            Window window0 = alertDialog0.getWindow();
            if(window0 != null) {
                window0.setLayout(window0.getDecorView().getWidth(), window0.getDecorView().getHeight());
            }
        }
        catch(NullPointerException nullPointerException0) {
            a.ae(csep.ah.j(), "Couldn\'t set loading dialog size", nullPointerException0);
        }
        alertDialog0.setContentView(LayoutInflater.from(this.c).inflate(0x7F0E0814, null, false));  // layout:progress_spinner_view
    }
}

