import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;

final class cqur extends azzi {
    final azyf a;

    public cqur(cqut cqut0, azyd_linstner azyd0, azyf azyf0) {
        this.a = azyf0;
        Objects.requireNonNull(cqut0);
        super(azyd0);
    }

    @Override  // azzi
    protected final void a(azsr azsr0, evqp evqp0) {
        cqvy cqvy0 = (cqvy)azsr0;
        ApiMetadata apiMetadata0 = cclr.a(cqvy0.r);
        cqvy0.t(this.a, apiMetadata0);
        evqp0.b(Boolean.valueOf(true));
    }
}

