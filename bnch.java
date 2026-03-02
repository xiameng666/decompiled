import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;

public final class bnch implements azys {
    public final bncl a;
    public final BrowserSignRequestParams b;
    public final bncq c;

    public bnch(bncl bncl0, BrowserSignRequestParams browserSignRequestParams0, bncq bncq0) {
        this.a = bncl0;
        this.b = browserSignRequestParams0;
        this.c = bncq0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bnfv bnfv0 = (bnfv)object0;
        bnft bnft0 = (bnft)bnfv0.H();
        bncj bncj0 = new bncj(this.a, ((evqp)object1));
        ApiMetadata apiMetadata0 = cclr.a(bnfv0.r);
        bnft0.a(bncj0, this.b, this.c, apiMetadata0);
    }
}

