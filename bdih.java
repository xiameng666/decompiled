import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class bdih extends wby implements bdii {
    private final evqp a;

    public bdih() {
        super("com.google.android.gms.credential.manager.common.IStringCallback");
    }

    public bdih(evqp evqp0) {
        super("com.google.android.gms.credential.manager.common.IStringCallback");
        this.a = evqp0;
    }

    @Override  // bdii
    public final void a(Status status0, String s, ApiMetadata apiMetadata0) {
        azzf.b(status0, (status0.e() ? ((bdij)Enum.valueOf(bdij.class, s)) : null), this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            String s = parcel0.readString();
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            bdih.gr(parcel0);
            this.a(status0, s, apiMetadata0);
            return true;
        }
        return false;
    }
}

