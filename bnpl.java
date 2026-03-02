import java.io.IOException;

public final class bnpl implements gfsi {
    public final bnqg a;
    public final String b;

    public bnpl(bnqg bnqg0, String s) {
        this.a = bnqg0;
        this.b = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        gfsx gfsx0 = gggq.c(((fqyf)object0).b, new bnpe(this.b));
        boolean z = gfsx0.i();
        bnqg bnqg0 = this.a;
        if(!z) {
            return gfqx.a;
        }
        try {
            hfuo hfuo0 = ((fqxl)gfsx0.d()).l;
            return bpsq.d(bnqg0.b, hfuo0).b(new bnpf(gfsx0));
        }
        catch(IOException | acse exception0) {
            a.ae(bnqg.a.j(), "Failed getting account from Oid list", exception0);
            return gfqx.a;
        }
    }
}

