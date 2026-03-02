import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.AlertDialog;
import android.app.Dialog;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import j..util.Objects;

final class azvg implements Runnable {
    final azvh a;
    private final azve b;

    public azvg(azvh azvh0, azve azve0) {
        Objects.requireNonNull(azvh0);
        this.a = azvh0;
        super();
        this.b = azve0;
    }

    @Override
    public final void run() {
        azvh azvh0 = this.a;
        if(azvh0.b) {
            azve azve0 = this.b;
            ConnectionResult connectionResult0 = azve0.b;
            if(connectionResult0.c()) {
                azxy azxy0 = azvh0.e;
                Activity activity0 = azvh0.o();
                batl.s(connectionResult0.d);
                azxy0.startActivityForResult(GoogleApiActivity.a(activity0, connectionResult0.d, azve0.a, false), 1);
                return;
            }
            azpm azpm0 = azvh0.d;
            Activity activity1 = azvh0.o();
            int v = connectionResult0.c;
            if(azpm0.k(activity1, v, null) == null) {
                goto label_20;
            }
            Activity activity2 = azvh0.o();
            azxy azxy1 = azvh0.e;
            Dialog dialog0 = azpm0.i(activity2, v, new bara(azpm0.k(activity2, v, "d"), azxy1), azvh0);
            if(dialog0 != null) {
                azpm0.d(activity2, dialog0, "GooglePlayServicesErrorDialog", azvh0);
                return;
            label_20:
                if(v == 18) {
                    Activity activity3 = azvh0.o();
                    ProgressBar progressBar0 = new ProgressBar(activity3, null, 0x101007A);
                    progressBar0.setIndeterminate(true);
                    progressBar0.setVisibility(0);
                    AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(activity3);
                    alertDialog$Builder0.setView(progressBar0);
                    alertDialog$Builder0.setMessage(baqw.c(activity3, 18));
                    alertDialog$Builder0.setPositiveButton("", null);
                    AlertDialog alertDialog0 = alertDialog$Builder0.create();
                    azpm0.d(activity3, alertDialog0, "GooglePlayServicesUpdatingDialog", azvh0);
                    azpm0.b(azvh0.o().getApplicationContext(), new azvf(this, alertDialog0));
                    return;
                }
                azvh0.g(connectionResult0, azve0.a);
            }
        }
    }
}

