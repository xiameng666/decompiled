import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Pair;
import com.google.android.gms.auth.api.proxy.AuthChimeraService;
import com.google.android.gms.auth.api.proxy.ProxyGrpcRequest;
import com.google.android.gms.auth.api.proxy.ProxyRequest;

public final class ahwx extends wby implements ahwy, cjug {
    public final AuthChimeraService a;
    private final cjts b;
    private final baqr c;
    private final Object d;
    private volatile byk e;

    public ahwx() {
        super("com.google.android.gms.auth.api.internal.IAuthService");
    }

    public ahwx(AuthChimeraService authChimeraService0, cjts cjts0, baqr baqr0) {
        super("com.google.android.gms.auth.api.internal.IAuthService");
        this.d = new Object();
        this.c = baqr0;
        this.b = cjts0;
        this.a = authChimeraService0;
    }

    @Override  // ahwy
    public final void a(ahwv ahwv0) {
        aidh aidh0 = new aidh(this.c, ahwv0);
        this.b.b(aidh0);
    }

    @Override  // ahwy
    public final void b(ahwv ahwv0, ProxyRequest proxyRequest0) {
        aidj aidj0 = new aidj(this.c, ahwv0, proxyRequest0);
        this.b.b(aidj0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        ahwv ahwv0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthCallbacks");
                    ahwv0 = (iInterface0 instanceof ahwv) ? ((ahwv)iInterface0) : new ahwt(iBinder0);
                }
                ProxyRequest proxyRequest0 = (ProxyRequest)wbz.a(parcel0, ProxyRequest.CREATOR);
                ahwx.gr(parcel0);
                this.b(ahwv0, proxyRequest0);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthCallbacks");
                    ahwv0 = (iInterface1 instanceof ahwv) ? ((ahwv)iInterface1) : new ahwt(iBinder1);
                }
                ProxyGrpcRequest proxyGrpcRequest0 = (ProxyGrpcRequest)wbz.a(parcel0, ProxyGrpcRequest.CREATOR);
                ahwx.gr(parcel0);
                if(this.e == null) {
                    synchronized(this.d) {
                        if(this.e == null) {
                            this.e = new aida(this);
                        }
                    }
                }
                bbfe_BaseGrpcServer bbfe0 = (bbfe_BaseGrpcServer)this.e.d(new Pair(proxyGrpcRequest0.b, ((int)proxyGrpcRequest0.c)));
                aidi aidi0 = new aidi(ahwv0);
                this.b.b(aidi0);
                break;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthCallbacks");
                    ahwv0 = (iInterface2 instanceof ahwv) ? ((ahwv)iInterface2) : new ahwt(iBinder2);
                }
                ahwx.gr(parcel0);
                this.a(ahwv0);
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

