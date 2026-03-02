import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public final class cppm extends wbx implements cppo {
    public cppm(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    @Override  // cppo
    public final Location a() {
        Parcel parcel0 = this.hM(23, this.jo());
        Location location0 = (Location)wbz.a(parcel0, Location.CREATOR);
        parcel0.recycle();
        return location0;
    }

    @Override  // cppo
    public final cpqy b() {
        cpqy cpqy0;
        Parcel parcel0 = this.hM(26, this.jo());
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            cpqy0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            cpqy0 = (iInterface0 instanceof cpqy) ? ((cpqy)iInterface0) : new cpqw(iBinder0);
        }
        parcel0.recycle();
        return cpqy0;
    }

    @Override  // cppo
    public final cpri c() {
        cpri cpri0;
        Parcel parcel0 = this.hM(25, this.jo());
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            cpri0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            cpri0 = (iInterface0 instanceof cpri) ? ((cpri)iInterface0) : new cprg(iBinder0);
        }
        parcel0.recycle();
        return cpri0;
    }

    @Override  // cppo
    public final CameraPosition d() {
        Parcel parcel0 = this.hM(1, this.jo());
        CameraPosition cameraPosition0 = (CameraPosition)wbz.a(parcel0, CameraPosition.CREATOR);
        parcel0.recycle();
        return cameraPosition0;
    }

    @Override  // cppo
    public final cpsw e(CircleOptions circleOptions0) {
        cpsw cpsw0;
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, circleOptions0);
        Parcel parcel1 = this.hM(35, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            cpsw0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
            cpsw0 = (iInterface0 instanceof cpsw) ? ((cpsw)iInterface0) : new cpsu(iBinder0);
        }
        parcel1.recycle();
        return cpsw0;
    }

    @Override  // cppo
    public final cpta f(GroundOverlayOptions groundOverlayOptions0) {
        cpta cpta0;
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, groundOverlayOptions0);
        Parcel parcel1 = this.hM(12, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            cpta0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
            cpta0 = (iInterface0 instanceof cpta) ? ((cpta)iInterface0) : new cpsy(iBinder0);
        }
        parcel1.recycle();
        return cpta0;
    }

    @Override  // cppo
    public final cptf g(MarkerOptions markerOptions0) {
        cptf cptf0;
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, markerOptions0);
        Parcel parcel1 = this.hM(11, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            cptf0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            cptf0 = (iInterface0 instanceof cptf) ? ((cptf)iInterface0) : new cptd(iBinder0);
        }
        parcel1.recycle();
        return cptf0;
    }

    @Override  // cppo
    public final cptj h(PolygonOptions polygonOptions0) {
        cptj cptj0;
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, polygonOptions0);
        Parcel parcel1 = this.hM(10, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            cptj0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            cptj0 = (iInterface0 instanceof cptj) ? ((cptj)iInterface0) : new cpth(iBinder0);
        }
        parcel1.recycle();
        return cptj0;
    }

    @Override  // cppo
    public final cptm i(PolylineOptions polylineOptions0) {
        cptm cptm0;
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, polylineOptions0);
        Parcel parcel1 = this.hM(9, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            cptm0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            cptm0 = (iInterface0 instanceof cptm) ? ((cptm)iInterface0) : new cptk(iBinder0);
        }
        parcel1.recycle();
        return cptm0;
    }

    @Override  // cppo
    public final void j(bjgw bjgw0) {
        Parcel parcel0 = this.jo();
        wbz.h(parcel0, bjgw0);
        this.jp(5, parcel0);
    }

    @Override  // cppo
    public final void k() {
        this.jp(14, this.jo());
    }

    @Override  // cppo
    public final void l(bjgw bjgw0) {
        Parcel parcel0 = this.jo();
        wbz.h(parcel0, bjgw0);
        this.jp(4, parcel0);
    }

    @Override  // cppo
    public final void m(boolean z) {
        Parcel parcel0 = this.jo();
        parcel0.writeInt(((int)z));
        this.jp(22, parcel0);
    }

    @Override  // cppo
    public final void n(int v, int v1, int v2, int v3) {
        Parcel parcel0 = this.jo();
        parcel0.writeInt(v);
        parcel0.writeInt(v1);
        parcel0.writeInt(v2);
        parcel0.writeInt(v3);
        this.jp(39, parcel0);
    }

    @Override  // cppo
    public final void o() {
        Parcel parcel0 = this.jo();
        parcel0.writeInt(1);
        this.jp(41, parcel0);
    }

    @Override  // cppo
    public final void p() {
        Parcel parcel0 = this.jo();
        parcel0.writeInt(1);
        Parcel parcel1 = this.hM(20, parcel0);
        wbz.i(parcel1);
        parcel1.recycle();
    }

    @Override  // cppo
    public final void q(cppx cppx0) {
        Parcel parcel0 = this.jo();
        wbz.h(parcel0, cppx0);
        this.jp(27, parcel0);
    }

    @Override  // cppo
    public final void v(cppy cppy0) {
        Parcel parcel0 = this.jo();
        wbz.h(parcel0, cppy0);
        this.jp(99, parcel0);
    }

    @Override  // cppo
    public final void w(cpqb cpqb0) {
        Parcel parcel0 = this.jo();
        wbz.h(parcel0, cpqb0);
        this.jp(0x60, parcel0);
    }

    @Override  // cppo
    public final void x(cpqj cpqj0) {
        Parcel parcel0 = this.jo();
        wbz.h(parcel0, cpqj0);
        this.jp(28, parcel0);
    }

    @Override  // cppo
    public final void y(cpqn cpqn0) {
        Parcel parcel0 = this.jo();
        wbz.h(parcel0, cpqn0);
        this.jp(30, parcel0);
    }

    @Override  // cppo
    public final void z(cpqq cpqq0) {
        Parcel parcel0 = this.jo();
        wbz.h(parcel0, cpqq0);
        this.jp(36, parcel0);
    }
}

