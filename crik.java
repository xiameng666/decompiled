import android.os.Parcel;
import com.google.android.gms.measurement.internal.TriggerUriParcel;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class crik extends wby implements cril {
    final AtomicReference a;

    public crik() {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    public crik(croz croz0, AtomicReference atomicReference0) {
        this.a = atomicReference0;
        Objects.requireNonNull(croz0);
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override  // cril
    public final void a(List list0) {
        synchronized(this.a) {
            this.a.set(list0);
            this.a.notifyAll();
        }
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 2) {
            ArrayList arrayList0 = parcel0.createTypedArrayList(TriggerUriParcel.CREATOR);
            crik.gr(parcel0);
            this.a(arrayList0);
            return true;
        }
        return false;
    }
}

