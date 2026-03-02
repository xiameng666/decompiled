import java.util.concurrent.TimeUnit;

public final class eqcn implements evpz {
    public final eqcp a;

    public eqcn(eqcp eqcp0) {
        this.a = eqcp0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        eqoc eqoc1;
        eqcp eqcp0 = this.a;
        if(evql0.n()) {
            String s = "FIDO service api returned with status: " + evql0.j();
            eqcp.a.d(s, new Object[0]);
            eqcp0.b.c();
            new bbll(1, 10).g(new eqco(eqcp0), hyis.a.k().a(), TimeUnit.MILLISECONDS);
            return;
        }
        Exception exception0 = evql0.i();
        if(exception0 != null) {
            eqcp.a.l(exception0);
            if((exception0 instanceof aztb)) {
                int v = ((aztb)exception0).b();
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)eqoc.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((eqoc)hftv0).c = 2;
                ((eqoc)hftv0).b |= 1;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                eqoc eqoc0 = (eqoc)hftp0.b_message;
                eqoc0.b |= 2;
                eqoc0.d = v;
                eqoc1 = (eqoc)hftp0.N_build();
            }
            else {
                eqoc1 = null;
            }
            eqcp0.b.a(10700, "FIDO service api returned exception.", eqoc1);
        }
    }
}

