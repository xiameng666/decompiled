import android.location.Location;
import android.os.IInterface;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public interface cppo extends IInterface {
    Location a();

    cpqy b();

    cpri c();

    CameraPosition d();

    cpsw e(CircleOptions arg1);

    cpta f(GroundOverlayOptions arg1);

    cptf g(MarkerOptions arg1);

    cptj h(PolygonOptions arg1);

    cptm i(PolylineOptions arg1);

    void j(bjgw arg1);

    void k();

    void l(bjgw arg1);

    void m(boolean arg1);

    void n(int arg1, int arg2, int arg3, int arg4);

    void o();

    void p();

    void q(cppx arg1);

    void v(cppy arg1);

    void w(cpqb arg1);

    void x(cpqj arg1);

    void y(cpqn arg1);

    void z(cpqq arg1);
}

