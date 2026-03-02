import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import java.util.ArrayList;
import java.util.List;

public class eqij extends wby implements eqik {
    protected final azvd a;

    protected eqij(azvd azvd0) {
        super("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
        this.a = azvd0;
    }

    @Override  // eqik
    public void a(Status status0) {
        throw new UnsupportedOperationException();
    }

    @Override  // eqik
    public void b(Status status0) {
        throw new UnsupportedOperationException();
    }

    @Override  // eqik
    public void c(Status status0, List list0) {
        throw new UnsupportedOperationException();
    }

    @Override  // eqik
    public void d(Status status0) {
        throw new UnsupportedOperationException();
    }

    @Override  // eqik
    public void e(Status status0) {
        throw new UnsupportedOperationException();
    }

    @Override  // eqik
    public void f(Status status0) {
        throw new UnsupportedOperationException();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                eqij.gr(parcel0);
                this.j(status0);
                return true;
            }
            case 2: {
                Status status1 = (Status)wbz.a(parcel0, Status.CREATOR);
                eqij.gr(parcel0);
                this.k(status1);
                return true;
            }
            case 3: {
                Status status2 = (Status)wbz.a(parcel0, Status.CREATOR);
                eqij.gr(parcel0);
                this.d(status2);
                return true;
            }
            case 4: {
                Status status3 = (Status)wbz.a(parcel0, Status.CREATOR);
                eqij.gr(parcel0);
                this.b(status3);
                return true;
            }
            case 5: {
                Status status4 = (Status)wbz.a(parcel0, Status.CREATOR);
                eqij.gr(parcel0);
                this.e(status4);
                return true;
            }
            case 6: {
                Status status5 = (Status)wbz.a(parcel0, Status.CREATOR);
                eqij.gr(parcel0);
                this.f(status5);
                return true;
            }
            case 7: {
                Status status6 = (Status)wbz.a(parcel0, Status.CREATOR);
                eqij.gr(parcel0);
                this.h(status6);
                return true;
            }
            case 8: {
                Status status7 = (Status)wbz.a(parcel0, Status.CREATOR);
                eqij.gr(parcel0);
                this.l(status7);
                return true;
            }
            case 9: {
                Status status8 = (Status)wbz.a(parcel0, Status.CREATOR);
                ArrayList arrayList0 = parcel0.createTypedArrayList(BootstrapAccount.CREATOR);
                eqij.gr(parcel0);
                this.c(status8, arrayList0);
                return true;
            }
            case 10: {
                Status status9 = (Status)wbz.a(parcel0, Status.CREATOR);
                eqij.gr(parcel0);
                this.i(status9);
                return true;
            }
            case 11: {
                Status status10 = (Status)wbz.a(parcel0, Status.CREATOR);
                eqij.gr(parcel0);
                this.a(status10);
                return true;
            }
            case 12: {
                Status status11 = (Status)wbz.a(parcel0, Status.CREATOR);
                eqij.gr(parcel0);
                this.g(status11);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // eqik
    public final void g(Status status0) {
        throw new UnsupportedOperationException();
    }

    @Override  // eqik
    public void h(Status status0) {
        throw new UnsupportedOperationException();
    }

    @Override  // eqik
    public void i(Status status0) {
        throw new UnsupportedOperationException();
    }

    @Override  // eqik
    public void j(Status status0) {
        throw new UnsupportedOperationException();
    }

    @Override  // eqik
    public void k(Status status0) {
        throw new UnsupportedOperationException();
    }

    @Override  // eqik
    public final void l(Status status0) {
        throw new UnsupportedOperationException();
    }
}

