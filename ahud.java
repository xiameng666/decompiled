import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class ahud extends wby implements ahue {
    final evqp a;

    public ahud() {
        super("com.google.android.gms.auth.api.identity.internal.ISortAccountsByLastUsedForCreatePasswordPasskeyCallback");
    }

    public ahud(ahwl ahwl0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(ahwl0);
        super("com.google.android.gms.auth.api.identity.internal.ISortAccountsByLastUsedForCreatePasswordPasskeyCallback");
    }

    @Override  // ahue
    public final void a(Status status0, List list0) {
        azzf.b(status0, gged_interceptors.i(list0), this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            ArrayList arrayList0 = parcel0.createTypedArrayList(Account.CREATOR);
            ahud.gr(parcel0);
            this.a(status0, arrayList0);
            return true;
        }
        return false;
    }
}

