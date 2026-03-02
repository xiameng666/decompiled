import android.accounts.Account;
import j..util.Objects;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class fcqq implements glzn {
    public final fcrb a;
    public final Account b;
    public final long c;
    public final int d;

    public fcqq(fcrb fcrb0, Account account0, long v, int v1) {
        this.a = fcrb0;
        this.b = account0;
        this.c = v;
        this.d = v1;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gide.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gide gide0 = (gide)hftp0.b_message;
        hfuo hfuo0 = gide0.b;
        if(!hfuo0.c()) {
            gide0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(((List)object0), gide0.b);
        gide gide1 = (gide)hftp0.N_build();
        ProtoLiteBuilder hftp1 = fcok.e();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp1.b_message;
        gide1.getClass();
        ghys0.am = gide1;
        ghys0.d |= 0x4000;
        this.a.j.g(hftp1, ghyr.az);
        gmcd gmcd0 = glzd.f(gmbt.h(this.a.e.a(this.b.name, this.c)), new fcqu(this.d, ((List)object0)), this.a.h);
        Objects.requireNonNull(this.a.e);
        return ((gmbt)glzd.g(gmcd0, new fcqv(this.a.e), this.a.h)).i(hzyp.a.b().c(), TimeUnit.SECONDS, this.a.i);
    }
}

