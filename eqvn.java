import android.content.Context;
import com.google.android.gms.common.api.Status;

public final class eqvn extends cjtm {
    private final equm a;
    private final eqvw b;

    public eqvn(eqvw eqvw0, equm equm0, azug azug0) {
        super(76, "CleanRestoreInformationOperation", azug0);
        this.b = eqvw0;
        this.a = equm0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        equm.a.d("CleanRestoreInformation", new Object[0]);
        erol erol0 = new erol();
        gmbu.t(this.a.c.b.a.b(erol0, gmap.a), new equl(this.a, this.b), gmap.a);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.b(status0);
    }
}

