import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface.OnShowListener;
import android.content.DialogInterface;

public final class cseo implements DialogInterface.OnShowListener {
    public final csep a;
    public final AlertDialog b;
    public final Context c;

    public cseo(csep csep0, AlertDialog alertDialog0, Context context0) {
        this.a = csep0;
        this.b = alertDialog0;
        this.c = context0;
    }

    @Override  // android.content.DialogInterface$OnShowListener
    public final void onShow(DialogInterface dialogInterface0) {
        this.a.ao = this.b.getButton(-1);
        this.a.ao.setOnClickListener(new csen(this.a, this.b, this.c));
        this.a.ap = this.b.getButton(-2);
        this.a.ap.setOnClickListener(this.a.aj);
    }
}

