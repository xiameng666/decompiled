import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ekqo extends wby implements ekqp {
    final evqp a;

    public ekqo() {
        super("com.google.android.gms.scheduler.ISchedulerCallbacks");
    }

    public ekqo(ektm ektm0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(ektm0);
        super("com.google.android.gms.scheduler.ISchedulerCallbacks");
    }

    @Override  // ekqp
    public final void a(Status status0, ApiMetadata apiMetadata0) {
        azzf.b(status0, null, this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            ekqo.gr(parcel0);
            this.a(status0, apiMetadata0);
            return true;
        }
        return false;
    }
}

