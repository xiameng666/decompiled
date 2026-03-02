import android.os.Parcel;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceStateMapImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;

public final class bcwc extends wby implements bcwd {
    private azvd a;
    private azvd b;
    private azvd c;
    private azvd d;
    private final bcvs e;

    public bcwc() {
        super("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
    }

    public bcwc(azvd azvd0, azvd azvd1, azvd azvd2, azvd azvd3, bcvs bcvs0) {
        super("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
        this.a = azvd0;
        this.b = azvd1;
        this.c = azvd2;
        this.d = azvd3;
        this.e = bcvs0;
    }

    @Override  // bcwd
    public final void a(Status status0, DataHolder dataHolder0) {
        azvd azvd0 = this.c;
        if(azvd0 == null) {
            xti.a("ContextManagerPendingResult", "Unexpected callback to onStateResult");
            return;
        }
        azvd0.b(new bcvw(this, dataHolder0, status0));
        this.c = null;
        this.h(status0);
    }

    @Override  // bcwd
    public final void b(Status status0, FenceStateImpl fenceStateImpl0) {
        xti.a("ContextManagerPendingResult", "Unexpected callback to onFenceEvaluateResult");
    }

    @Override  // bcwd
    public final void c(Status status0, FenceStateMapImpl fenceStateMapImpl0) {
        xti.a("ContextManagerPendingResult", "Unexpected callback to onFenceQueryResult");
    }

    @Override  // bcwd
    public final void d(Status status0, Snapshot snapshot0) {
        azvd azvd0 = this.d;
        if(azvd0 == null) {
            xti.a("ContextManagerPendingResult", "Unexpected callback to onSnapshotResult");
            return;
        }
        azvd0.b(new bcvx(this, status0, snapshot0));
        this.d = null;
        this.h(status0);
    }

    @Override  // bcwd
    public final void e(Status status0) {
        azvd azvd0 = this.a;
        if(azvd0 == null) {
            xti.a("ContextManagerPendingResult", "Unexpected callback to onStatusResult.");
            return;
        }
        azvd0.b(status0);
        this.a = null;
        this.h(status0);
    }

    @Override  // bcwd
    public final void f(Status status0, WriteBatchImpl writeBatchImpl0) {
        xti.a("ContextManagerPendingResult", "Unexpected callback to onWriteBatchResult");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                bcwc.gr(parcel0);
                this.e(status0);
                break;
            }
            case 2: {
                Status status1 = (Status)wbz.a(parcel0, Status.CREATOR);
                DataHolder dataHolder0 = (DataHolder)wbz.a(parcel0, DataHolder.CREATOR);
                DataHolder dataHolder1 = (DataHolder)wbz.a(parcel0, DataHolder.CREATOR);
                bcwc.gr(parcel0);
                this.g(status1, dataHolder0);
                break;
            }
            case 3: {
                Status status2 = (Status)wbz.a(parcel0, Status.CREATOR);
                WriteBatchImpl writeBatchImpl0 = (WriteBatchImpl)wbz.a(parcel0, WriteBatchImpl.CREATOR);
                bcwc.gr(parcel0);
                this.f(status2, writeBatchImpl0);
                break;
            }
            case 5: {
                Status status3 = (Status)wbz.a(parcel0, Status.CREATOR);
                DataHolder dataHolder2 = (DataHolder)wbz.a(parcel0, DataHolder.CREATOR);
                bcwc.gr(parcel0);
                this.a(status3, dataHolder2);
                break;
            }
            case 6: {
                Status status4 = (Status)wbz.a(parcel0, Status.CREATOR);
                Snapshot snapshot0 = (Snapshot)wbz.a(parcel0, Snapshot.CREATOR);
                bcwc.gr(parcel0);
                this.d(status4, snapshot0);
                break;
            }
            case 7: {
                Status status5 = (Status)wbz.a(parcel0, Status.CREATOR);
                FenceStateMapImpl fenceStateMapImpl0 = (FenceStateMapImpl)wbz.a(parcel0, FenceStateMapImpl.CREATOR);
                bcwc.gr(parcel0);
                this.c(status5, fenceStateMapImpl0);
                break;
            }
            case 8: {
                Status status6 = (Status)wbz.a(parcel0, Status.CREATOR);
                FenceStateImpl fenceStateImpl0 = (FenceStateImpl)wbz.a(parcel0, FenceStateImpl.CREATOR);
                bcwc.gr(parcel0);
                this.b(status6, fenceStateImpl0);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }

    @Override  // bcwd
    public final void g(Status status0, DataHolder dataHolder0) {
        azvd azvd0 = this.b;
        if(azvd0 == null) {
            xti.a("ContextManagerPendingResult", "Unexpected callback to onReadResult.");
            return;
        }
        azvd0.b(new bcvv(this, dataHolder0, status0));
        this.b = null;
        this.h(status0);
    }

    private final void h(Status status0) {
        bcvs bcvs0 = this.e;
        if(bcvs0 != null && status0.e()) {
            bcvk bcvk0 = bcvs0.a;
            if(bcvk0 != null) {
                synchronized(bcvk0.d) {
                    bcvk0.b = null;
                    bcvk0.c = null;
                }
            }
        }
    }
}

