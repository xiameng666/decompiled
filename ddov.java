import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.sharing.QrCodeMetadata;
import j..util.Objects;

public final class ddov extends wby implements ddow {
    final evqp a;

    public ddov() {
        super("com.google.android.gms.nearby.sharing.internal.IQrCodeMetadataResultListener");
    }

    public ddov(ddsc ddsc0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(ddsc0);
        super("com.google.android.gms.nearby.sharing.internal.IQrCodeMetadataResultListener");
    }

    @Override  // ddow
    public final void a(int v) {
        aztb aztb0 = new aztb(new Status(v));
        this.a.a(aztb0);
    }

    @Override  // ddow
    public final void b(QrCodeMetadata qrCodeMetadata0) {
        this.a.b(qrCodeMetadata0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                QrCodeMetadata qrCodeMetadata0 = (QrCodeMetadata)wbz.a(parcel0, QrCodeMetadata.CREATOR);
                ddov.gr(parcel0);
                this.b(qrCodeMetadata0);
                return true;
            }
            case 2: {
                int v1 = parcel0.readInt();
                ddov.gr(parcel0);
                this.a(v1);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

