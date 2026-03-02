import com.google.android.gms.common.api.Status;

public final class ebym implements dpuf {
    public final ebyo a;
    public final String b;
    public final String c;

    public ebym(ebyo ebyo0, String s, String s1) {
        this.a = ebyo0;
        this.b = s;
        this.c = s1;
    }

    @Override  // dpuf
    public final void a(dpui dpui0) {
        ebyo ebyo0 = this.a;
        if((dpui0.getCause() instanceof dpuk)) {
            Throwable throwable0 = dpui0.getCause();
            ibuq.d(throwable0, "null cannot be cast to non-null type com.google.android.gms.pay.net.api.TapAndPayApiException");
            if("Secure element card was not found.".equals(((dpuk)throwable0).a.f)) {
                ebyo0.a(this.b, this.c);
                return;
            }
        }
        a.ae(ebyo.a.i(), "Failed to dissociate Octopus card on backend", dpui0);
        ebyo0.c.x(Status.d);
    }
}

