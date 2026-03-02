import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.sharing.Contact;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class ddnz extends wby implements ddoa {
    final evqp a;

    public ddnz() {
        super("com.google.android.gms.nearby.sharing.internal.IContactsResultListener");
    }

    public ddnz(ddsc ddsc0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(ddsc0);
        super("com.google.android.gms.nearby.sharing.internal.IContactsResultListener");
    }

    @Override  // ddoa
    public final void a(List list0) {
        this.a.b(list0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                ArrayList arrayList0 = parcel0.createTypedArrayList(Contact.CREATOR);
                ddnz.gr(parcel0);
                this.a(arrayList0);
                return true;
            }
            case 2: {
                int v1 = parcel0.readInt();
                ddnz.gr(parcel0);
                aztb aztb0 = new aztb(new Status(v1));
                this.a.a(aztb0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

