import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ahhh implements gmbg {
    final String a;
    final long b;
    final aggd c;

    public ahhh(aggd aggd0, String s, long v) {
        this.a = s;
        this.b = v;
        Objects.requireNonNull(aggd0);
        this.c = aggd0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        this.c(bxma.i(throwable0).a());
    }

    @Override  // gmbg
    public final void b(Object object0) {
        this.c(Status.b);
    }

    private final void c(Status status0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghqb.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aggd aggd0 = this.c;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((ghqb)hftv0).b |= 1;
        ((ghqb)hftv0).c = this.a;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        aggd0.a.getClass();
        ((ghqb)hftv1).b |= 16;
        ((ghqb)hftv1).f = aggd0.a;
        int v = status0.i;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghqb ghqb0 = (ghqb)hftp0.b_message;
        ghqb0.b |= 4;
        ghqb0.d = v;
        long v1 = SystemClock.elapsedRealtime() - this.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghqb ghqb1 = (ghqb)hftp0.b_message;
        ghqb1.b |= 8;
        ghqb1.e = v1;
        ghqb ghqb2 = (ghqb)hftp0.N_build();
        aggd0.b.d(ghqb2);
    }
}

