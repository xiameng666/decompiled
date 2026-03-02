import com.google.android.chimera.config.InvalidConfigException;

public final class eqfe implements Runnable {
    public final eqff a;
    public final epzg b;

    public eqfe(eqff eqff0, epzg epzg0) {
        this.a = eqff0;
        this.b = epzg0;
    }

    @Override
    public final void run() {
        eqff eqff0 = this.a;
        eqff0.a.c.b();
        try {
            eqlw.c(eqff0.a.b, eqff0.a.l);
        }
        catch(InvalidConfigException invalidConfigException0) {
            eqme.a.l(invalidConfigException0);
        }
        int v = bbnp.o(this.b.a.getResources()) ? 5 : 2;
        ProtoLiteBuilder hftp0 = eqff0.a.g;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjmq)hftp0.b_message).f = v - 1;
        ((gjmq)hftp0.b_message).b |= 8;
    }
}

