import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.trustagent.internal.ParcelableTrustAgentEvent;

public final class ezdt extends wby implements ezdu {
    private final ezbo a;

    public ezdt() {
        super("com.google.android.gms.trustagent.internal.ITrustletService");
    }

    public ezdt(ezbo ezbo0) {
        super("com.google.android.gms.trustagent.internal.ITrustletService");
        this.a = ezbo0;
    }

    @Override  // ezdu
    public final Bundle a() {
        Bundle bundle0;
        synchronized(this) {
            bundle0 = this.a.d();
        }
        return bundle0;
    }

    @Override  // ezdu
    public final void b() {
        synchronized(this) {
            this.a.kR();
        }
    }

    @Override  // ezdu
    public final void c(ezdx ezdx0) {
        synchronized(this) {
            batl.s(ezdx0);
            synchronized(this.a.a) {
                this.a.c = ezdx0;
            }
            this.a.o();
        }
    }

    @Override  // ezdu
    public final void d(ParcelableTrustAgentEvent parcelableTrustAgentEvent0) {
        synchronized(this) {
            ProtoLiteBuilder hftp0 = parcelableTrustAgentEvent0.a();
            this.a.w(hftp0);
        }
    }

    @Override  // ezdu
    public final boolean e() {
        synchronized(this) {
        }
        return this.a.b;
    }

    @Override  // ezdu
    public final boolean f() {
        boolean z;
        synchronized(this) {
            z = this.a.q();
        }
        return z;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        ezdx ezdx0;
        switch(v) {
            case 1: {
                boolean z = this.i();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 2: {
                boolean z1 = this.e();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z1));
                return true;
            }
            case 3: {
                boolean z2 = this.h();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z2));
                return true;
            }
            case 4: {
                boolean z3 = this.f();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z3));
                return true;
            }
            case 5: {
                boolean z4 = this.g();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z4));
                return true;
            }
            case 6: {
                ParcelableTrustAgentEvent parcelableTrustAgentEvent0 = (ParcelableTrustAgentEvent)wbz.a(parcel0, ParcelableTrustAgentEvent.CREATOR);
                ezdt.gr(parcel0);
                this.d(parcelableTrustAgentEvent0);
                return true;
            }
            case 7: {
                ParcelableTrustAgentEvent parcelableTrustAgentEvent1 = (ParcelableTrustAgentEvent)wbz.a(parcel0, ParcelableTrustAgentEvent.CREATOR);
                ezdt.gr(parcel0);
                this.j(parcelableTrustAgentEvent1);
                return true;
            }
            case 8: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    ezdx0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.trustagent.internal.ITrustletServiceCallback");
                    ezdx0 = (iInterface0 instanceof ezdx) ? ((ezdx)iInterface0) : new ezdv(iBinder0);
                }
                ezdt.gr(parcel0);
                this.c(ezdx0);
                return true;
            }
            case 9: {
                Bundle bundle0 = this.a();
                parcel1.writeNoException();
                wbz.g(parcel1, bundle0);
                return true;
            }
            case 10: {
                this.b();
                return true;
            }
            case 11: {
                parcel0.readLong();
                ezdt.gr(parcel0);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // ezdu
    public final boolean g() {
        boolean z;
        synchronized(this) {
            z = this.a.r();
        }
        return z;
    }

    @Override  // ezdu
    public final boolean h() {
        boolean z;
        synchronized(this) {
            z = this.a.s();
        }
        return z;
    }

    @Override  // ezdu
    public final boolean i() {
        boolean z;
        synchronized(this) {
            z = this.a.t();
        }
        return z;
    }

    public final void j(ParcelableTrustAgentEvent parcelableTrustAgentEvent0) {
        synchronized(this) {
            ProtoLiteBuilder hftp0 = parcelableTrustAgentEvent0.a();
            ghyk ghyk0 = this.a.e();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((ghyl)hftp0.b_message).c = ghyk0.g;
            ((ghyl)hftp0.b_message).b |= 1;
        }
    }
}

