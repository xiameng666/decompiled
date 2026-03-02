import android.content.Context;
import com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable;
import com.google.android.gms.clearcut.internal.LogErrorParcelable;
import com.google.android.gms.common.api.Status;

public final class azep extends cjtm {
    private final azcx a;
    private final BatchedLogErrorParcelable b;
    private final cjtn c;

    public azep(azcx azcx0, BatchedLogErrorParcelable batchedLogErrorParcelable0, cjtn cjtn0) {
        super(40, "LogErrorOperation");
        this.a = azcx0;
        this.b = batchedLogErrorParcelable0;
        this.c = cjtn0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        Status status2;
        if(!hqzs.a.b().a()) {
            throw new cjuh(31006, "Operation disabled");
        }
        if(!this.c.e()) {
            throw new cjuh(31006, "Operation disallowed");
        }
        if(!hqzy.f()) {
            this.a.c(Status.d);
            return;
        }
        azbj azbj0 = azbk.a();
        azbj0.g();
        Status status0 = Status.b;
        Status status1 = status0;
        for(Object object0: this.b.a) {
            String s = ((LogErrorParcelable)object0).a;
            int v = ((LogErrorParcelable)object0).c;
            switch(((LogErrorParcelable)object0).b) {
                case 1002: {
                    azbj0.d(azbb.a, v);
                    status2 = status0;
                    break;
                }
                case 1003: {
                    azbj0.f(s, azbc.p, v);
                    status2 = status0;
                    break;
                }
                case 1006: {
                    azbj0.f(s, azbc.l, v);
                    status2 = status0;
                    break;
                }
                case 31004: {
                    azbj0.f(s, azbc.ad, v);
                    status2 = status0;
                    break;
                }
                default: {
                    status2 = Status.d;
                }
            }
            if(!status2.e()) {
                status1 = Status.d;
            }
        }
        this.a.c(status1);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.c(status0);
    }
}

