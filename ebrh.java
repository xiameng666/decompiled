import android.content.Context;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.DebitSePrepaidCardRequest;
import com.google.android.gms.pay.ProtoSafeParcelable;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;
import j..util.Optional;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

@cmcs(a = cmcr.g)
public final class ebrh extends ebav {
    final Optional a;
    dytd b;
    ebwl c;
    private static final bboh d = null;
    private final donp e;
    private final DebitSePrepaidCardRequest f;
    private final String g;
    private final gtni h;
    private static final int n = 4;

    static {
        ebrh.d = bboh.b("Pay", bbcu.cZ);
    }

    public ebrh(DebitSePrepaidCardRequest debitSePrepaidCardRequest0, String s, donp donp0, azug azug0) {
        super("DebitSePrepaidCard", s, azug0);
        this.a = Optional.empty();
        this.e = donp0;
        this.f = debitSePrepaidCardRequest0;
        this.g = s;
        this.h = dypl.g(debitSePrepaidCardRequest0.b);
    }

    @Override  // ebaw
    protected final void b(Context context0) {
        dylc dylc0;
        evql evql0;
        String s1;
        String s;
        try {
            s = this.f.a.name;
            s1 = acso.e(context0, s);
        }
        catch(acse | IOException exception0) {
            a.aq(ebrh.d.i(), "Failed to fetch account ID", '\u2FE9', exception0);
            this.e.x(eccq.a);
            return;
        }
        dola dola0 = dlmg.a(AppContextProvider.a(), s, bbqr.c(s1));
        done done0 = new done();
        dmgr dmgr0 = new dmgr(this.g);
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        ebkk ebkk0 = new ebkk(dola0, dmgr0, done0, domv0, new edop());
        ((AndroidInjector)this.a.orElse(ebkk0)).inject(this);
        dyna dyna0 = dypl.e(this.f.b);
        String s2 = this.f.d;
        if(dyna0 == dyna.a) {
            this.e.x(Status.d);
            this.c.c(this.h, ebrh.n, 20);
            return;
        }
        if(s2 == null) {
            this.e.x(Status.d);
            this.c.c(this.h, ebrh.n, 21);
            return;
        }
        try {
            dytd dytd0 = this.b;
            dypj dypj0 = dytd0.c;
            if(dyna0 != null && dylv.l.contains(dyna0)) {
                dywk dywk0 = new dywk(new dywo(dypj0.b, dyna0, s2), Optional.of(dyna0), hhag.l);
                evql0 = dypj0.b.d(dywk0);
            }
            else {
                evql0 = evrg.c(new fsim(dynd.m, "WALLET.MFC_DEBIT_UNSUPPORTED_FOR_SP", dyna0));
            }
            evql0.b(new dyta(dytd0));
            evql0.A(new dyrh());
            dylc0 = (dylc)evrg.n(evql0);
        }
        catch(ExecutionException | InterruptedException exception1) {
            a.aq(ebrh.d.i(), "Error while debiting a Secure Element card", '\u2FE8', exception1);
            Optional optional0 = ebza.f(exception1);
            Status status0 = new Status(8, ((String)ebza.d(optional0).orElse(exception1.toString())));
            this.e.x(status0);
            this.c.i(this.h, ebrh.n, optional0);
            return;
        }
        if(dylc0 == null) {
            this.e.q(Status.d, null);
            this.c.c(this.h, ebrh.n, 22);
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dyfd.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((dyfd)hftp0.b_message).c = dylc0;
        ((dyfd)hftp0.b_message).b |= 1;
        ProtoSafeParcelable protoSafeParcelable0 = ftqe.b(((MessageLite)(((dyfd)hftp0.N_build()))));
        this.e.q(Status.b, protoSafeParcelable0);
        this.c.g(this.h, ebrh.n);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        a.F(ebrh.d.i(), "Failed DEBIT operation on a Secure Element card", '\u2FEA');
        this.e.x(Status.d);
        ebwl ebwl0 = this.c;
        if(ebwl0 != null) {
            ebwl0.b(this.h, ebrh.n, status0);
        }
    }
}

