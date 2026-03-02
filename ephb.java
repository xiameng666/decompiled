import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.significantplaces.SignificantPlaceParceable;
import com.google.android.gms.significantplaces.SignificantPlacesRequest;
import java.util.Set;

public final class ephb extends wby implements cjug, ephc {
    public final epgj a;
    private final Context b;
    private final cjts c;
    private final ClientIdentity d;
    private final Set e;

    public ephb() {
        super("com.google.android.gms.significantplaces.internal.ISignificantPlacesService");
    }

    public ephb(Context context0, epgj epgj0, cjts cjts0, ClientIdentity clientIdentity0, Set set0) {
        ibuq.f(epgj0, "impl");
        ibuq.f(set0, "allowedCallers");
        super("com.google.android.gms.significantplaces.internal.ISignificantPlacesService");
        this.b = context0;
        this.a = epgj0;
        this.c = cjts0;
        this.d = clientIdentity0;
        this.e = set0;
    }

    @Override  // ephc
    public final void a(epgw epgw0) {
        ibuq.f(epgw0, "callback");
        this.d();
        new ccmp().a(bbdg.wx);
        epgn epgn0 = new epgn(epgw0, this, null);
        cjul.b(this.c, 396, "getSignificantPlacesCount", epgn0);
    }

    @Override  // ephc
    public final void b(SignificantPlacesRequest significantPlacesRequest0, epgz epgz0, azxs azxs0) {
        ibuq.f(significantPlacesRequest0, "request");
        ibuq.f(epgz0, "listener");
        ibuq.f(azxs0, "callback");
        this.d();
        String s = epgz0.getClass().getSimpleName();
        String s1 = Integer.toHexString(System.identityHashCode(epgz0.asBinder()));
        ClientIdentity clientIdentity0 = this.d.g(this.b, significantPlacesRequest0.a, s + "@" + s1);
        clientIdentity0.k(this.b, new String[]{"android.permission.ACCESS_FINE_LOCATION"});
        new ccmp().a(bbdg.wu);
        epgp epgp0 = new epgp(new epgk(this, significantPlacesRequest0, epgz0, clientIdentity0), azxs0);
        this.c.b(epgp0);
    }

    @Override  // ephc
    public final void c(epgz epgz0, epgt epgt0) {
        ibuq.f(epgz0, "listener");
        ibuq.f(epgt0, "callback");
        this.d();
        new ccmp().a(bbdg.wv);
        epgq epgq0 = new epgq(epgt0, new epgl(this, epgz0));
        this.c.b(epgq0);
    }

    public final void d() {
        ClientIdentity clientIdentity0 = this.d;
        if(!this.e.contains(clientIdentity0.e)) {
            clientIdentity0.l(this.b);
        }
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        Object object1;
        Object object0;
        epgz epgz1;
        epgz epgz0;
        epgw epgw0 = null;
        switch(v) {
            case 2: {
                SignificantPlacesRequest significantPlacesRequest0 = (SignificantPlacesRequest)wbz.a(parcel0, SignificantPlacesRequest.CREATOR);
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    epgz0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.significantplaces.internal.ISignificantPlacesListener");
                    epgz0 = (iInterface0 instanceof epgz) ? ((epgz)iInterface0) : new epgx(iBinder0);
                }
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    epgw0 = (iInterface1 instanceof azxs) ? ((azxs)iInterface1) : new azxq(iBinder1);
                }
                ephb.gr(parcel0);
                this.b(significantPlacesRequest0, epgz0, ((azxs)epgw0));
                break;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 == null) {
                    epgz1 = null;
                }
                else {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.significantplaces.internal.ISignificantPlacesListener");
                    epgz1 = (iInterface2 instanceof epgz) ? ((epgz)iInterface2) : new epgx(iBinder2);
                }
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.significantplaces.internal.IBooleanStatusCallback");
                    epgw0 = (iInterface3 instanceof epgt) ? ((epgt)iInterface3) : new epgr(iBinder3);
                }
                ephb.gr(parcel0);
                this.c(epgz1, ((epgt)epgw0));
                break;
            }
            case 4: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.significantplaces.internal.IIntStatusCallback");
                    epgw0 = (iInterface4 instanceof epgw) ? ((epgw)iInterface4) : new epgu(iBinder4);
                }
                ephb.gr(parcel0);
                this.a(epgw0);
                break;
            }
            case 5: {
                SignificantPlaceParceable significantPlaceParceable0 = (SignificantPlaceParceable)wbz.a(parcel0, SignificantPlaceParceable.CREATOR);
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 == null) {
                    object0 = null;
                }
                else {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.significantplaces.internal.IBooleanStatusCallback");
                    object0 = (iInterface5 instanceof epgt) ? ((epgt)iInterface5) : new epgr(iBinder5);
                }
                ephb.gr(parcel0);
                ibuq.f(significantPlaceParceable0, "significantPlaceParceable");
                ibuq.f(object0, "callback");
                this.d();
                epgm epgm0 = new epgm(((epgt)object0), this, significantPlaceParceable0, null);
                cjul.b(this.c, 396, "addSignificantPlace", epgm0);
                break;
            }
            case 6: {
                String s = parcel0.readString();
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 == null) {
                    object1 = null;
                }
                else {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.significantplaces.internal.IBooleanStatusCallback");
                    object1 = (iInterface6 instanceof epgt) ? ((epgt)iInterface6) : new epgr(iBinder6);
                }
                ephb.gr(parcel0);
                ibuq.f(s, "id");
                ibuq.f(object1, "callback");
                this.d();
                epgo epgo0 = new epgo(((epgt)object1), this, s, null);
                cjul.b(this.c, 396, "removeSignificantPlace", epgo0);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

