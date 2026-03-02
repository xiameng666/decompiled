import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.location.quake.ealert.ux.EAlertUxArgs;

public final class fvwe implements View.OnClickListener {
    public final fvwf a;

    public fvwe(fvwf fvwf0) {
        this.a = fvwf0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        fvwf fvwf0 = this.a;
        fvwf0.E();
        Intent intent0 = new Intent("com.google.android.location.ealert.ux.EALERT_SAFETY_INFO");
        intent0.putExtra("EALERT_UX_EXTRA", "EALERT_SAFETY_RT");
        intent0.putExtra("EALERT_TAKE_ACTION_ARGS", fvwf0.ag);
        intent0.setClassName("com.google.android.gms", "com.google.android.location.ealert.ux.EAlertSafetyInfoActivity");
        intent0.setFlags(0x10008000);
        fvwf0.startActivity(intent0);
        if(fvwf0.ag != null) {
            fxmt.b().a(fvwf0.ag.h, fvwf0.ag.i, fvwf0.ag.k, 4);
        }
        fxmr.b(fvwf0.c, EAlertUxArgs.a(2, huqb.i(), fvwf0.ag));
        fvwf0.c.finish();
    }
}

