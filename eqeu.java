import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;

final class eqeu extends cjtm {
    public final eqiw a;
    private final epyt b;
    private final Handler c;

    public eqeu(eqiw eqiw0, epyt epyt0, Handler handler0, azug azug0) {
        super(76, "GetEsimActivationPayloadOperation", azug0);
        this.b = epyt0;
        this.c = handler0;
        this.a = eqiw0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        this.b.b().s(new bbre(this.c), new eqet(this));
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.e(status0, null);
    }
}

