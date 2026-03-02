import com.google.android.gms.autofill.metrics.MetricsContext;

public final class aqcd implements gful_cronetEngineProvider {
    public final gfsx a;

    public aqcd(gfsx gfsx0) {
        this.a = gfsx0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aokk.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((aokk)hftp0.b_message).d = 1;
        ((aokk)hftp0.b_message).b |= 2;
        aoht aoht0 = aoan.c(((MetricsContext)this.a.d()));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        aoht0.getClass();
        ((aokk)hftv0).c = aoht0;
        ((aokk)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        aokk aokk0 = (aokk)hftp0.b_message;
        aokk0.b |= 4;
        aokk0.e = false;
        return (aokk)hftp0.N_build();
    }
}

