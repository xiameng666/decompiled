import android.content.Context;
import android.os.Process;

public final class eqnh {
    private final Context a;

    public eqnh(Context context0) {
        this.a = context0;
    }

    public final gmcd a(clcf clcf0, MessageLite hfvm0, ProtoLiteMessage hftv0, fhaj fhaj0, ckcp ckcp0, clby clby0) {
        clda clda0 = clbv.a(this.a).c(clcf0, 1, hftv0, new bblp(1, 9), Process.myUid(), 0x5300);
        clda0.B("POST");
        clda0.D(this.a, hfvm0, fhaj0, ckcp0);
        clda0.A(clby0);
        return clda0.t().a();
    }
}

