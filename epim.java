import android.os.RemoteException;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.significantplaces.settings.ConfirmPlaceChimeraActivity;

public final class epim implements cpnt {
    public final double a;
    public final double b;
    public final ConfirmPlaceChimeraActivity c;

    public epim(double f, double f1, ConfirmPlaceChimeraActivity confirmPlaceChimeraActivity0) {
        this.a = f;
        this.b = f1;
        this.c = confirmPlaceChimeraActivity0;
    }

    @Override  // cpnt
    public final void a(cpnp cpnp0) {
        double f = this.a;
        double f1 = this.b;
        cpnp0.i(cpnj.b(new LatLng(f, f1), 16.0f));
        cpnx cpnx0 = cpnp0.c();
        try {
            cpnx0.a.c();
        }
        catch(RemoteException remoteException0) {
            throw new cpsi(remoteException0);
        }
        CircleOptions circleOptions0 = new CircleOptions();
        circleOptions0.a(new LatLng(f, f1));
        circleOptions0.b = this.c.j;
        circleOptions0.c();
        circleOptions0.b();
        circleOptions0.d();
        cpnp0.e(circleOptions0);
    }
}

