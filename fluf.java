import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.util.UUID;

public final class fluf implements glzm {
    public final flvd a;
    public final gmcd b;
    public final gfsi c;
    public final UUID d;
    public final AccountContext e;

    public fluf(flvd flvd0, gmcd gmcd0, gfsi gfsi0, UUID uUID0, AccountContext accountContext0) {
        this.a = flvd0;
        this.b = gmcd0;
        this.c = gfsi0;
        this.d = uUID0;
        this.e = accountContext0;
    }

    @Override  // glzm
    public final gmcd a() {
        fmbl fmbl0 = (fmbl)gmbu.r(this.b);
        if(fmbl0 == null) {
            return gmbu.h(new iapl(iapk.j));
        }
        byte[] arr_b = glwl.e(fmbl0.b);
        ProtoLiteBuilder hftp0 = flvr.b(this.a.a, arr_b, this.d);
        hnxb hnxb0 = flwu.c(this.e.c().f());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnxl hnxl0 = (hnxl)hftp0.b_message;
        hnxb0.getClass();
        hnxl0.h = hnxb0;
        hnxl0.b |= 2;
        hnxl hnxl1 = (hnxl)hftp0.N_build();
        return (gmcd)this.c.apply(hnxl1);
    }
}

