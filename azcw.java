import android.os.Parcel;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public class azcw extends wby implements azcx {
    public azcw() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    @Override  // azcx
    public void a(Status status0) {
        throw new UnsupportedOperationException();
    }

    @Override  // azcx
    public final void b(Status status0) {
        throw new UnsupportedOperationException();
    }

    @Override  // azcx
    public void c(Status status0) {
        throw new UnsupportedOperationException();
    }

    @Override  // azcx
    public void d(Status status0) {
        throw new UnsupportedOperationException();
    }

    @Override  // azcx
    public final void e(DataHolder dataHolder0) {
        throw new UnsupportedOperationException();
    }

    @Override  // azcx
    public final void f(Status status0) {
        throw new UnsupportedOperationException();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                azcw.gr(parcel0);
                this.d(status0);
                return true;
            }
            case 2: {
                Status status1 = (Status)wbz.a(parcel0, Status.CREATOR);
                azcw.gr(parcel0);
                this.a(status1);
                return true;
            }
            case 3: {
                Status status2 = (Status)wbz.a(parcel0, Status.CREATOR);
                parcel0.readLong();
                azcw.gr(parcel0);
                this.h(status2);
                return true;
            }
            case 4: {
                Status status3 = (Status)wbz.a(parcel0, Status.CREATOR);
                azcw.gr(parcel0);
                this.f(status3);
                return true;
            }
            case 5: {
                Status status4 = (Status)wbz.a(parcel0, Status.CREATOR);
                parcel0.readLong();
                azcw.gr(parcel0);
                this.g(status4);
                return true;
            }
            case 6: {
                Status status5 = (Status)wbz.a(parcel0, Status.CREATOR);
                LogEventParcelable[] arr_logEventParcelable = (LogEventParcelable[])parcel0.createTypedArray(LogEventParcelable.CREATOR);
                azcw.gr(parcel0);
                throw new UnsupportedOperationException();
            }
            case 7: {
                DataHolder dataHolder0 = (DataHolder)wbz.a(parcel0, DataHolder.CREATOR);
                azcw.gr(parcel0);
                this.e(dataHolder0);
                return true;
            }
            case 8: {
                Status status6 = (Status)wbz.a(parcel0, Status.CREATOR);
                azcw.gr(parcel0);
                this.c(status6);
                return true;
            }
            case 9: {
                Status status7 = (Status)wbz.a(parcel0, Status.CREATOR);
                azcw.gr(parcel0);
                this.b(status7);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // azcx
    public final void g(Status status0) {
        throw new UnsupportedOperationException();
    }

    @Override  // azcx
    public final void h(Status status0) {
        throw new UnsupportedOperationException();
    }
}

