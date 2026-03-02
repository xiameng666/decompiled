import android.os.Parcel;
import com.google.android.gms.maps.internal.CreatorImpl;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import j..util.Objects;

public final class cppg extends wby implements cpph {
    public cpph a;
    final CreatorImpl b;

    public cppg() {
        super("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    public cppg(CreatorImpl creatorImpl0) {
        Objects.requireNonNull(creatorImpl0);
        this.b = creatorImpl0;
        super("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        this.a = null;
    }

    @Override  // cpph
    public final bjgw a(CameraPosition cameraPosition0) {
        cpoz cpoz0 = new cpoz(this, cameraPosition0);
        return this.b.a(cpoz0);
    }

    @Override  // cpph
    public final bjgw b(LatLng latLng0) {
        cppa cppa0 = new cppa(this, latLng0);
        return this.b.a(cppa0);
    }

    @Override  // cpph
    public final bjgw c(LatLngBounds latLngBounds0, int v) {
        cpor cpor0 = new cpor(this, latLngBounds0, v);
        return this.b.a(cpor0);
    }

    @Override  // cpph
    public final bjgw d(LatLngBounds latLngBounds0, int v, int v1, int v2) {
        cpos cpos0 = new cpos(this, latLngBounds0, v, v1, v2);
        return this.b.a(cpos0);
    }

    @Override  // cpph
    public final bjgw e(LatLng latLng0, float f) {
        cppb cppb0 = new cppb(this, latLng0, f);
        return this.b.a(cppb0);
    }

    @Override  // cpph
    public final bjgw f(float f, float f1) {
        cpov cpov0 = new cpov(this, f, f1);
        return this.b.a(cpov0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                bjgw bjgw0 = this.i();
                parcel1.writeNoException();
                wbz.h(parcel1, bjgw0);
                return true;
            }
            case 2: {
                bjgw bjgw1 = this.j();
                parcel1.writeNoException();
                wbz.h(parcel1, bjgw1);
                return true;
            }
            case 3: {
                float f = parcel0.readFloat();
                float f1 = parcel0.readFloat();
                cppg.gr(parcel0);
                bjgw bjgw2 = this.f(f, f1);
                parcel1.writeNoException();
                wbz.h(parcel1, bjgw2);
                return true;
            }
            case 4: {
                float f2 = parcel0.readFloat();
                cppg.gr(parcel0);
                bjgw bjgw3 = this.k(f2);
                parcel1.writeNoException();
                wbz.h(parcel1, bjgw3);
                return true;
            }
            case 5: {
                float f3 = parcel0.readFloat();
                cppg.gr(parcel0);
                bjgw bjgw4 = this.g(f3);
                parcel1.writeNoException();
                wbz.h(parcel1, bjgw4);
                return true;
            }
            case 6: {
                float f4 = parcel0.readFloat();
                int v1 = parcel0.readInt();
                int v2 = parcel0.readInt();
                cppg.gr(parcel0);
                bjgw bjgw5 = this.h(f4, v1, v2);
                parcel1.writeNoException();
                wbz.h(parcel1, bjgw5);
                return true;
            }
            case 7: {
                CameraPosition cameraPosition0 = (CameraPosition)wbz.a(parcel0, CameraPosition.CREATOR);
                cppg.gr(parcel0);
                bjgw bjgw6 = this.a(cameraPosition0);
                parcel1.writeNoException();
                wbz.h(parcel1, bjgw6);
                return true;
            }
            case 8: {
                LatLng latLng0 = (LatLng)wbz.a(parcel0, LatLng.CREATOR);
                cppg.gr(parcel0);
                bjgw bjgw7 = this.b(latLng0);
                parcel1.writeNoException();
                wbz.h(parcel1, bjgw7);
                return true;
            }
            case 9: {
                LatLng latLng1 = (LatLng)wbz.a(parcel0, LatLng.CREATOR);
                float f5 = parcel0.readFloat();
                cppg.gr(parcel0);
                bjgw bjgw8 = this.e(latLng1, f5);
                parcel1.writeNoException();
                wbz.h(parcel1, bjgw8);
                return true;
            }
            case 10: {
                LatLngBounds latLngBounds0 = (LatLngBounds)wbz.a(parcel0, LatLngBounds.CREATOR);
                int v3 = parcel0.readInt();
                cppg.gr(parcel0);
                bjgw bjgw9 = this.c(latLngBounds0, v3);
                parcel1.writeNoException();
                wbz.h(parcel1, bjgw9);
                return true;
            }
            case 11: {
                LatLngBounds latLngBounds1 = (LatLngBounds)wbz.a(parcel0, LatLngBounds.CREATOR);
                int v4 = parcel0.readInt();
                int v5 = parcel0.readInt();
                int v6 = parcel0.readInt();
                cppg.gr(parcel0);
                bjgw bjgw10 = this.d(latLngBounds1, v4, v5, v6);
                parcel1.writeNoException();
                wbz.h(parcel1, bjgw10);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // cpph
    public final bjgw g(float f) {
        cpox cpox0 = new cpox(this, f);
        return this.b.a(cpox0);
    }

    @Override  // cpph
    public final bjgw h(float f, int v, int v1) {
        cpoy cpoy0 = new cpoy(this, f, v, v1);
        return this.b.a(cpoy0);
    }

    @Override  // cpph
    public final bjgw i() {
        cpot cpot0 = new cpot(this);
        return this.b.a(cpot0);
    }

    @Override  // cpph
    public final bjgw j() {
        cpou cpou0 = new cpou(this);
        return this.b.a(cpou0);
    }

    @Override  // cpph
    public final bjgw k(float f) {
        cpow cpow0 = new cpow(this, f);
        return this.b.a(cpow0);
    }
}

