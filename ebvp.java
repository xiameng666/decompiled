import com.google.android.gms.pay.PayApiError;
import j..util.Optional;

public final class ebvp implements evqc {
    public final ebvs a;
    public final ficj b;

    public ebvp(ebvs ebvs0, ficj ficj0) {
        this.a = ebvs0;
        this.b = ficj0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.ae(ebvs.a.j(), "Exception occurs during MfiSignInAndInitializeChipOperation", exception0);
        PayApiError payApiError0 = new PayApiError();
        Optional optional0 = ebza.e(exception0);
        ibuq.e(optional0, "tryGetReportableErrorFromThrowable(...)");
        payApiError0.b = (String)ibvp.a(optional0, exception0.toString());
        this.a.c.m(payApiError0);
        hhza hhza0 = hhyz.a(((ProtoLiteMessage)hhzb.a).v_newBuilder());
        hhza0.b(2);
        Optional optional1 = ebza.g(exception0);
        ibuq.e(optional1, "tryGetUnifiedError(...)");
        String s = ((dynd)ibvp.a(optional1, dynd.a)).toString();
        ibuq.e(s, "toString(...)");
        hhza0.c(s);
        hhzb hhzb0 = hhza0.a();
        this.b.b(hhzb0);
        this.b.close();
    }
}

