import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;
import java.util.concurrent.Executor;

public final class bmda extends wby implements bmdb {
    final evqp a;
    final Executor b;

    public bmda() {
        super("com.google.android.gms.fido.credentialstore.internal.IGetPasskeysCallbacks");
    }

    public bmda(bmdz bmdz0, evqp evqp0, Executor executor0) {
        this.a = evqp0;
        this.b = executor0;
        Objects.requireNonNull(bmdz0);
        super("com.google.android.gms.fido.credentialstore.internal.IGetPasskeysCallbacks");
    }

    @Override  // bmdb
    public final void a(Status status0, ParcelFileDescriptor parcelFileDescriptor0, ApiMetadata apiMetadata0) {
        if(parcelFileDescriptor0 == null) {
            aztb aztb0 = baqb.a(status0);
            this.a.a(aztb0);
            return;
        }
        bmdx bmdx0 = new bmdx(parcelFileDescriptor0, this.a);
        this.b.execute(bmdx0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            ParcelFileDescriptor parcelFileDescriptor0 = (ParcelFileDescriptor)wbz.a(parcel0, ParcelFileDescriptor.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            bmda.gr(parcel0);
            this.a(status0, parcelFileDescriptor0, apiMetadata0);
            return true;
        }
        return false;
    }
}

