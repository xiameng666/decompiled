import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.FeatureLayerOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;

public final class cppn extends wby implements cppo {
    public cppn() {
        super("com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    @Override  // cppo
    public final Location a() {
        return new Location("null_provider");
    }

    @Override  // cppo
    public final cpqy b() {
        return new cpqx();
    }

    @Override  // cppo
    public final cpri c() {
        return new cprh();
    }

    @Override  // cppo
    public final CameraPosition d() {
        return new CameraPosition(new LatLng(0.0, 0.0), 0.0f, 0.0f, 0.0f);
    }

    @Override  // cppo
    public final cpsw e(CircleOptions circleOptions0) {
        return new cpsv();
    }

    @Override  // cppo
    public final cpta f(GroundOverlayOptions groundOverlayOptions0) {
        return new cpsz();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                CameraPosition cameraPosition0 = this.d();
                parcel1.writeNoException();
                wbz.g(parcel1, cameraPosition0);
                return true;
            }
            case 2: {
                parcel1.writeNoException();
                parcel1.writeFloat(1.0f);
                return true;
            }
            case 3: {
                parcel1.writeNoException();
                parcel1.writeFloat(1.0f);
                return true;
            }
            case 4: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if((iInterface0 instanceof bjgw)) {
                        bjgw bjgw0 = (bjgw)iInterface0;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if((iInterface1 instanceof bjgw)) {
                        bjgw bjgw1 = (bjgw)iInterface1;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if((iInterface2 instanceof bjgw)) {
                        bjgw bjgw2 = (bjgw)iInterface2;
                    }
                }
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.maps.internal.ICancelableCallback");
                    if((iInterface3 instanceof cppi)) {
                        cppi cppi0 = (cppi)iInterface3;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if((iInterface4 instanceof bjgw)) {
                        bjgw bjgw3 = (bjgw)iInterface4;
                    }
                }
                parcel0.readInt();
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.maps.internal.ICancelableCallback");
                    if((iInterface5 instanceof cppi)) {
                        cppi cppi1 = (cppi)iInterface5;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                PolylineOptions polylineOptions0 = (PolylineOptions)wbz.a(parcel0, PolylineOptions.CREATOR);
                cppn.gr(parcel0);
                cptl cptl0 = new cptl();
                parcel1.writeNoException();
                wbz.h(parcel1, cptl0);
                return true;
            }
            case 10: {
                PolygonOptions polygonOptions0 = (PolygonOptions)wbz.a(parcel0, PolygonOptions.CREATOR);
                cppn.gr(parcel0);
                cpti cpti0 = new cpti();
                parcel1.writeNoException();
                wbz.h(parcel1, cpti0);
                return true;
            }
            case 11: {
                MarkerOptions markerOptions0 = (MarkerOptions)wbz.a(parcel0, MarkerOptions.CREATOR);
                cppn.gr(parcel0);
                cpte cpte0 = new cpte();
                parcel1.writeNoException();
                wbz.h(parcel1, cpte0);
                return true;
            }
            case 12: {
                GroundOverlayOptions groundOverlayOptions0 = (GroundOverlayOptions)wbz.a(parcel0, GroundOverlayOptions.CREATOR);
                cppn.gr(parcel0);
                cpsz cpsz0 = new cpsz();
                parcel1.writeNoException();
                wbz.h(parcel1, cpsz0);
                return true;
            }
            case 13: {
                TileOverlayOptions tileOverlayOptions0 = (TileOverlayOptions)wbz.a(parcel0, TileOverlayOptions.CREATOR);
                cppn.gr(parcel0);
                cpto cpto0 = new cpto();
                parcel1.writeNoException();
                wbz.h(parcel1, cpto0);
                return true;
            }
            case 14: {
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 16: {
                parcel0.readInt();
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 17: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 18: {
                wbz.i(parcel0);
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 19: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 20: {
                wbz.i(parcel0);
                cppn.gr(parcel0);
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 21: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 22: {
                wbz.i(parcel0);
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 23: {
                Location location0 = new Location("null_provider");
                parcel1.writeNoException();
                wbz.g(parcel1, location0);
                return true;
            }
            case 24: {
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                    if((iInterface6 instanceof cppq)) {
                        cppq cppq0 = (cppq)iInterface6;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 25: {
                cprh cprh0 = new cprh();
                parcel1.writeNoException();
                wbz.h(parcel1, cprh0);
                return true;
            }
            case 26: {
                cpqx cpqx0 = new cpqx();
                parcel1.writeNoException();
                wbz.h(parcel1, cpqx0);
                return true;
            }
            case 27: {
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraChangeListener");
                    if((iInterface7 instanceof cppx)) {
                        cppx cppx0 = (cppx)iInterface7;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 28: {
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 != null) {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapClickListener");
                    if((iInterface8 instanceof cpqj)) {
                        cpqj cpqj0 = (cpqj)iInterface8;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 29: {
                IBinder iBinder9 = parcel0.readStrongBinder();
                if(iBinder9 != null) {
                    IInterface iInterface9 = iBinder9.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapLongClickListener");
                    if((iInterface9 instanceof cpql)) {
                        cpql cpql0 = (cpql)iInterface9;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 30: {
                IBinder iBinder10 = parcel0.readStrongBinder();
                if(iBinder10 != null) {
                    IInterface iInterface10 = iBinder10.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
                    if((iInterface10 instanceof cpqn)) {
                        cpqn cpqn0 = (cpqn)iInterface10;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 0x1F: {
                IBinder iBinder11 = parcel0.readStrongBinder();
                if(iBinder11 != null) {
                    IInterface iInterface11 = iBinder11.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    if((iInterface11 instanceof cpqo)) {
                        cpqo cpqo0 = (cpqo)iInterface11;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 0x20: {
                IBinder iBinder12 = parcel0.readStrongBinder();
                if(iBinder12 != null) {
                    IInterface iInterface12 = iBinder12.queryLocalInterface("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
                    if((iInterface12 instanceof cpqf)) {
                        cpqf cpqf0 = (cpqf)iInterface12;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 33: {
                IBinder iBinder13 = parcel0.readStrongBinder();
                if(iBinder13 != null) {
                    IInterface iInterface13 = iBinder13.queryLocalInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                    if((iInterface13 instanceof cppp)) {
                        cppp cppp0 = (cppp)iInterface13;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 35: {
                CircleOptions circleOptions0 = (CircleOptions)wbz.a(parcel0, CircleOptions.CREATOR);
                cppn.gr(parcel0);
                cpsv cpsv0 = new cpsv();
                parcel1.writeNoException();
                wbz.h(parcel1, cpsv0);
                return true;
            }
            case 36: {
                IBinder iBinder14 = parcel0.readStrongBinder();
                if(iBinder14 != null) {
                    IInterface iInterface14 = iBinder14.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
                    if((iInterface14 instanceof cpqq)) {
                        cpqq cpqq0 = (cpqq)iInterface14;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 37: {
                IBinder iBinder15 = parcel0.readStrongBinder();
                if(iBinder15 != null) {
                    IInterface iInterface15 = iBinder15.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
                    if((iInterface15 instanceof cpqp)) {
                        cpqp cpqp0 = (cpqp)iInterface15;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 38: {
                IBinder iBinder16 = parcel0.readStrongBinder();
                if(iBinder16 != null) {
                    IInterface iInterface16 = iBinder16.queryLocalInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                    if((iInterface16 instanceof cpqz)) {
                        cpqz cpqz0 = (cpqz)iInterface16;
                    }
                }
                IBinder iBinder17 = parcel0.readStrongBinder();
                if(iBinder17 != null) {
                    IInterface iInterface17 = iBinder17.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if((iInterface17 instanceof bjgw)) {
                        bjgw bjgw4 = (bjgw)iInterface17;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 39: {
                parcel0.readInt();
                parcel0.readInt();
                parcel0.readInt();
                parcel0.readInt();
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 40: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 41: {
                wbz.i(parcel0);
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 42: {
                IBinder iBinder18 = parcel0.readStrongBinder();
                if(iBinder18 != null) {
                    IInterface iInterface18 = iBinder18.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
                    if((iInterface18 instanceof cpqk)) {
                        cpqk cpqk0 = (cpqk)iInterface18;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 44: {
                cptb cptb0 = new cptb();
                parcel1.writeNoException();
                wbz.h(parcel1, cptb0);
                return true;
            }
            case 45: {
                IBinder iBinder19 = parcel0.readStrongBinder();
                if(iBinder19 != null) {
                    IInterface iInterface19 = iBinder19.queryLocalInterface("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
                    if((iInterface19 instanceof cpqe)) {
                        cpqe cpqe0 = (cpqe)iInterface19;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 51: {
                wbz.i(parcel0);
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 53: {
                IBinder iBinder20 = parcel0.readStrongBinder();
                if(iBinder20 != null) {
                    IInterface iInterface20 = iBinder20.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapReadyCallback");
                    if((iInterface20 instanceof cpqm)) {
                        cpqm cpqm0 = (cpqm)iInterface20;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 54: {
                Bundle bundle0 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 55: {
                parcel1.writeNoException();
                return true;
            }
            case 56: {
                parcel1.writeNoException();
                return true;
            }
            case 57: {
                parcel1.writeNoException();
                return true;
            }
            case 58: {
                parcel1.writeNoException();
                return true;
            }
            case 59: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 60: {
                Bundle bundle1 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                cppn.gr(parcel0);
                parcel1.writeNoException();
                wbz.g(parcel1, bundle1);
                return true;
            }
            case 61: {
                parcel0.readString();
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 71: {
                IBinder iBinder21 = parcel0.readStrongBinder();
                if(iBinder21 != null) {
                    IInterface iInterface21 = iBinder21.queryLocalInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                    if((iInterface21 instanceof cpqz)) {
                        cpqz cpqz1 = (cpqz)iInterface21;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 80: {
                IBinder iBinder22 = parcel0.readStrongBinder();
                if(iBinder22 != null) {
                    IInterface iInterface22 = iBinder22.queryLocalInterface("com.google.android.gms.maps.internal.IOnPoiClickListener");
                    if((iInterface22 instanceof cpqs)) {
                        cpqs cpqs0 = (cpqs)iInterface22;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 81: {
                Bundle bundle2 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 82: {
                parcel1.writeNoException();
                return true;
            }
            case 83: {
                IBinder iBinder23 = parcel0.readStrongBinder();
                if(iBinder23 != null) {
                    IInterface iInterface23 = iBinder23.queryLocalInterface("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
                    if((iInterface23 instanceof cpqd)) {
                        cpqd cpqd0 = (cpqd)iInterface23;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 84: {
                IBinder iBinder24 = parcel0.readStrongBinder();
                if(iBinder24 != null) {
                    IInterface iInterface24 = iBinder24.queryLocalInterface("com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener");
                    if((iInterface24 instanceof cpqh)) {
                        cpqh cpqh0 = (cpqh)iInterface24;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 85: {
                IBinder iBinder25 = parcel0.readStrongBinder();
                if(iBinder25 != null) {
                    IInterface iInterface25 = iBinder25.queryLocalInterface("com.google.android.gms.maps.internal.IOnPolygonClickListener");
                    if((iInterface25 instanceof cpqt)) {
                        cpqt cpqt0 = (cpqt)iInterface25;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 86: {
                IBinder iBinder26 = parcel0.readStrongBinder();
                if(iBinder26 != null) {
                    IInterface iInterface26 = iBinder26.queryLocalInterface("com.google.android.gms.maps.internal.IOnInfoWindowCloseListener");
                    if((iInterface26 instanceof cpqg)) {
                        cpqg cpqg0 = (cpqg)iInterface26;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 87: {
                IBinder iBinder27 = parcel0.readStrongBinder();
                if(iBinder27 != null) {
                    IInterface iInterface27 = iBinder27.queryLocalInterface("com.google.android.gms.maps.internal.IOnPolylineClickListener");
                    if((iInterface27 instanceof cpqu)) {
                        cpqu cpqu0 = (cpqu)iInterface27;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 89: {
                IBinder iBinder28 = parcel0.readStrongBinder();
                if(iBinder28 != null) {
                    IInterface iInterface28 = iBinder28.queryLocalInterface("com.google.android.gms.maps.internal.IOnCircleClickListener");
                    if((iInterface28 instanceof cpqc)) {
                        cpqc cpqc0 = (cpqc)iInterface28;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 91: {
                MapStyleOptions mapStyleOptions0 = (MapStyleOptions)wbz.a(parcel0, MapStyleOptions.CREATOR);
                cppn.gr(parcel0);
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 92: {
                parcel0.readFloat();
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 93: {
                parcel0.readFloat();
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 94: {
                parcel1.writeNoException();
                return true;
            }
            case 0x5F: {
                LatLngBounds latLngBounds0 = (LatLngBounds)wbz.a(parcel0, LatLngBounds.CREATOR);
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 0x60: {
                IBinder iBinder29 = parcel0.readStrongBinder();
                if(iBinder29 != null) {
                    IInterface iInterface29 = iBinder29.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
                    if((iInterface29 instanceof cpqb)) {
                        cpqb cpqb0 = (cpqb)iInterface29;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 97: {
                IBinder iBinder30 = parcel0.readStrongBinder();
                if(iBinder30 != null) {
                    IInterface iInterface30 = iBinder30.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraMoveListener");
                    if((iInterface30 instanceof cpqa)) {
                        cpqa cpqa0 = (cpqa)iInterface30;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 98: {
                IBinder iBinder31 = parcel0.readStrongBinder();
                if(iBinder31 != null) {
                    IInterface iInterface31 = iBinder31.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraMoveCanceledListener");
                    if((iInterface31 instanceof cppz)) {
                        cppz cppz0 = (cppz)iInterface31;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 99: {
                IBinder iBinder32 = parcel0.readStrongBinder();
                if(iBinder32 != null) {
                    IInterface iInterface32 = iBinder32.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraIdleListener");
                    if((iInterface32 instanceof cppy)) {
                        cppy cppy0 = (cppy)iInterface32;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 101: {
                parcel1.writeNoException();
                return true;
            }
            case 102: {
                parcel1.writeNoException();
                return true;
            }
            case 107: {
                IBinder iBinder33 = parcel0.readStrongBinder();
                if(iBinder33 != null) {
                    IInterface iInterface33 = iBinder33.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationClickListener");
                    if((iInterface33 instanceof cpqr)) {
                        cpqr cpqr0 = (cpqr)iInterface33;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 109: {
                cptc cptc0 = new cptc();
                parcel1.writeNoException();
                wbz.h(parcel1, cptc0);
                return true;
            }
            case 110: {
                IBinder iBinder34 = parcel0.readStrongBinder();
                if(iBinder34 != null) {
                    IInterface iInterface34 = iBinder34.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapCapabilitiesChangedListener");
                    if((iInterface34 instanceof cpqi)) {
                        cpqi cpqi0 = (cpqi)iInterface34;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 0x6F: {
                IBinder iBinder35 = parcel0.readStrongBinder();
                if(iBinder35 != null) {
                    IInterface iInterface35 = iBinder35.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapCapabilitiesChangedListener");
                    if((iInterface35 instanceof cpqi)) {
                        cpqi cpqi1 = (cpqi)iInterface35;
                    }
                }
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 0x70: {
                FeatureLayerOptions featureLayerOptions0 = (FeatureLayerOptions)wbz.a(parcel0, FeatureLayerOptions.CREATOR);
                cppn.gr(parcel0);
                cpsx cpsx0 = new cpsx();
                parcel1.writeNoException();
                wbz.h(parcel1, cpsx0);
                return true;
            }
            case 0x71: {
                parcel0.readInt();
                cppn.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 0x72: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 0x73: {
                parcel0.readString();
                cppn.gr(parcel0);
                parcel1.writeNoException();
                parcel1.writeString("map is null");
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // cppo
    public final cptf g(MarkerOptions markerOptions0) {
        return new cpte();
    }

    @Override  // cppo
    public final cptj h(PolygonOptions polygonOptions0) {
        return new cpti();
    }

    @Override  // cppo
    public final cptm i(PolylineOptions polylineOptions0) {
        return new cptl();
    }

    @Override  // cppo
    public final void j(bjgw bjgw0) {
    }

    @Override  // cppo
    public final void k() {
    }

    @Override  // cppo
    public final void l(bjgw bjgw0) {
    }

    @Override  // cppo
    public final void m(boolean z) {
    }

    @Override  // cppo
    public final void n(int v, int v1, int v2, int v3) {
    }

    @Override  // cppo
    public final void o() {
    }

    @Override  // cppo
    public final void p() {
    }

    @Override  // cppo
    public final void q(cppx cppx0) {
    }

    @Override  // cppo
    public final void v(cppy cppy0) {
    }

    @Override  // cppo
    public final void w(cpqb cpqb0) {
    }

    @Override  // cppo
    public final void x(cpqj cpqj0) {
    }

    @Override  // cppo
    public final void y(cpqn cpqn0) {
    }

    @Override  // cppo
    public final void z(cpqq cpqq0) {
    }
}

