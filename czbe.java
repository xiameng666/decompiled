import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.internal.connection.OnStartAdvertisingResultParams;

public final class czbe extends czgb {
    private final azvd a;

    public czbe(azvd azvd0) {
        this.a = azvd0;
    }

    @Override  // czgc
    public final void a(OnStartAdvertisingResultParams onStartAdvertisingResultParams0) {
        Status status0 = czbf.s(onStartAdvertisingResultParams0.a);
        if(status0.e()) {
            czbd czbd0 = new czbd(status0);
            this.a.b(czbd0);
            return;
        }
        this.a.a(status0);
    }
}

