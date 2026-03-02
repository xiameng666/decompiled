import android.os.Parcel;
import com.google.android.gms.auth.folsom.SecurityDomainMember;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class ajtt extends wby implements ajtu {
    final evqp a;

    public ajtt() {
        super("com.google.android.gms.auth.folsom.internal.ISecurityDomainMembersCallback");
    }

    public ajtt(ajuu ajuu0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(ajuu0);
        super("com.google.android.gms.auth.folsom.internal.ISecurityDomainMembersCallback");
    }

    @Override  // ajtu
    public final void a(Status status0, List list0, ApiMetadata apiMetadata0) {
        if(status0.e()) {
            this.a.b(list0);
            return;
        }
        aztb aztb0 = baqb.a(status0);
        this.a.a(aztb0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            ArrayList arrayList0 = parcel0.createTypedArrayList(SecurityDomainMember.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            ajtt.gr(parcel0);
            this.a(status0, arrayList0, apiMetadata0);
            return true;
        }
        return false;
    }
}

