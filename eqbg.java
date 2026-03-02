import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

final class eqbg extends cjtm {
    public final eqik a;
    public final eqbv b;
    private final Handler c;

    public eqbg(eqik eqik0, eqbv eqbv0, Handler handler0, azug azug0) {
        super(75, "GetBootstrappableAccountsOperation", azug0);
        this.a = eqik0;
        this.b = eqbv0;
        this.c = handler0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        eqbf eqbf0 = new eqbf(this);
        this.c.post(eqbf0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ArrayList arrayList0 = new ArrayList();
        this.a.c(status0, arrayList0);
    }
}

