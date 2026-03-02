import android.accounts.Account;
import j..util.Objects;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public final class arye implements aqzl {
    final Account a;
    final boolean b;
    final aryf c;

    public arye(aryf aryf0, Account account0, boolean z) {
        this.a = account0;
        this.b = z;
        Objects.requireNonNull(aryf0);
        this.c = aryf0;
        super();
    }

    @Override  // aqzl
    public final Object a() {
        try {
            aqpj aqpj0 = this.c.c;
            Account account0 = this.a;
            try {
                aqjh aqjh0 = new aqjh(this.b, account0);
                ((glyq)aqpj0.c.a.b(aqjh0, gmap.a)).u();
                aqpj.a.j("ETU status for account " + account0.toString() + " saved to " + this.b, new Object[0]);
                if(this.b) {
                    aqpi aqpi0 = aqpj0.b;
                    if(gfta.c(((String)((glyq)aqpi0.a()).u()))) {
                        ((glyq)aqpi0.b(account0.name)).u();
                    }
                }
            }
            catch(ExecutionException | InterruptedException exception0) {
                throw new IOException("Failed to set Account ETU Status", exception0);
            }
            aryg aryg0 = this.c.d;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gicm.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gicm gicm0 = (gicm)hftp0.b_message;
            gicm0.b |= 1;
            gicm0.c = true;
            gicm gicm1 = (gicm)hftp0.N_build();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ghys ghys0 = (ghys)hftp1.b_message;
            gicm1.getClass();
            ghys0.T = gicm1;
            ghys0.c |= 0x800000;
            aryg0.a(((ghys)hftp1.N_build()), ghyr.ac);
            return Boolean.valueOf(true);
        }
        catch(IOException iOException0) {
            aryf.a.g("Failed to save the ETU account", iOException0, new Object[0]);
            aryf aryf0 = this.c;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gicm.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gicm gicm2 = (gicm)hftp2.b_message;
            gicm2.b |= 1;
            gicm2.c = false;
            gicm gicm3 = (gicm)hftp2.N_build();
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ghys ghys1 = (ghys)hftp3.b_message;
            gicm3.getClass();
            ghys1.T = gicm3;
            ghys1.c |= 0x800000;
            ghys ghys2 = (ghys)hftp3.N_build();
            aryf0.d.a(ghys2, ghyr.ac);
            return Boolean.valueOf(false);
        }
    }

    @Override  // aqzl
    public final void b(Object object0) {
        if(((Boolean)object0).booleanValue()) {
            aryf.a.j("ETU account successfully saved", new Object[0]);
        }
    }
}

