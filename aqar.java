import com.google.android.gms.autofill.metrics.MetricsContext;

public final class aqar implements gful_cronetEngineProvider {
    public final gfsx a;
    public final ando b;
    public final amny c;

    public aqar(gfsx gfsx0, ando ando0, amny amny0) {
        this.a = gfsx0;
        this.b = ando0;
        this.c = amny0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aoll.a).v_newBuilder();
        aoht aoht0 = aoan.c(((MetricsContext)this.a.d()));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aoll aoll0 = (aoll)hftp0.b_message;
        aoht0.getClass();
        aoll0.c = aoht0;
        aoll0.b |= 1;
        int v = this.b.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((aoll)hftp0.b_message).d = v;
        int v1 = aoan.k(this.c);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((aoll)hftp0.b_message).e = v1 - 2;
        return (aoll)hftp0.N_build();
    }
}

