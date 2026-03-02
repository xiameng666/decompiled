import android.accounts.Account;
import j..time.Duration;
import java.util.concurrent.Executor;

public final class bnqm {
    public final Account a;
    public final fquu b;
    public final bnla c;
    private final fgvt d;
    private final bpam e;
    private final Executor f;
    private final fqwg g;
    private final fqvw h;
    private final fqwt i;

    public bnqm(Account account0, fgvt fgvt0, fqwg fqwg0, fquu fquu0, fqvw fqvw0, fqwt fqwt0, bnla bnla0, bpam bpam0, Executor executor0) {
        this.a = account0;
        this.d = fgvt0;
        this.g = fqwg0;
        this.b = fquu0;
        this.h = fqvw0;
        this.i = fqwt0;
        this.c = bnla0;
        this.e = bpam0;
        this.f = executor0;
    }

    public final gmcd a(bnql bnql0, long v) {
        gsyz gsyz0 = bnql0.a.c == null ? gsyz.a : bnql0.a.c;
        gszs gszs0 = bnql0.a.h == null ? gszs.a : bnql0.a.h;
        gtbr gtbr0 = fqvf.d(fqvf.l((gtac.b(bnql0.a.l) == 0 ? 1 : gtac.b(bnql0.a.l)), bnql0.c.a, fraq.a((gszr.b(gszs0.e) == null ? gszr.e : gszr.b(gszs0.e))), bnql0.a.k, this.d.d().minus(Duration.ofHours(this.g.c())).getEpochSecond(), ((int)Duration.ofHours(this.g.b()).toSeconds()), v));
        this.e.b(gsyz0, this.a, gtbr0);
        return gdta.g(this.i.b(bnql0.c)).i(new bnqj(this, gsyz0, bnql0.c, gtbr0, v, bnql0, bnql0.a, bnql0.c.a), this.f);
    }

    public final gmcd b(gsyz gsyz0, fqwq fqwq0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtap.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtap gtap0 = (gtap)hftp0.b_message;
        fqwq0.d.getClass();
        gtap0.d = fqwq0.d;
        gtap0.c = 9;
        ByteString hfsf0 = fqvf.i(this.h.a(), fqwq0.a);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtap gtap1 = (gtap)hftp0.b_message;
        hfsf0.getClass();
        gtap1.e = hfsf0;
        gtap gtap2 = (gtap)hftp0.N_build();
        gtdj gtdj0 = (gtdj)this.c.a.q(cmlp.a, ckfh.b);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gtcb.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gtcb)hftp1.b_message).e = gsyz0;
        ((gtcb)hftp1.b_message).b |= 1;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gtca.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gtca gtca0 = (gtca)hftp2.b_message;
        gtap2.getClass();
        gtca0.c = gtap2;
        gtca0.b |= 1;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gtcb gtcb0 = (gtcb)hftp1.b_message;
        gtca gtca1 = (gtca)hftp2.N_build();
        gtca1.getClass();
        gtcb0.d = gtca1;
        gtcb0.c = 2;
        return gdta.g(bnka.a(gtdj0.a(((gtcb)hftp1.N_build())), "notifyServerBeforeRotation")).i(new bnqi(fqwq0), this.f);
    }

    public final gmcd c(bnql bnql0, long v) {
        gsyz gsyz0 = bnql0.a.c == null ? gsyz.a : bnql0.a.c;
        return gdta.g(this.b.o(gsyz0, false)).i(new bnqk(this, gsyz0, bnql0.c, bnql0.a, v), this.f);
    }

    public final void d(gsyz gsyz0) {
        this.e.a(gsyz0);
    }
}

