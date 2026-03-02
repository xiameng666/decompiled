import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.api.Status;

final class eqbk extends cjtm {
    public final eqik a;
    public final eqbv b;
    public final Bundle c;
    private final Handler d;

    public eqbk(eqik eqik0, Bundle bundle0, eqbv eqbv0, Handler handler0, azug azug0) {
        super(75, "ResumeBootstrapOperation", azug0);
        this.a = eqik0;
        this.b = eqbv0;
        this.c = bundle0;
        this.d = handler0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        eqbj eqbj0 = new eqbj(this);
        this.d.post(eqbj0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.h(status0);
    }
}

