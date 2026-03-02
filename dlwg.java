import java.util.concurrent.TimeUnit;

public final class dlwg {
    private final fhwb a;
    private final fich b;
    private final String c;

    public dlwg(fhwb fhwb0, fich fich0, String s) {
        ibuq.f(fhwb0, "semanticLogger");
        ibuq.f(fich0, "veSloManager");
        super();
        this.a = fhwb0;
        this.b = fich0;
        this.c = s;
    }

    public final ficj a(hjrn hjrn0) {
        ibuq.f(hjrn0, "bulletin");
        if(!hwfq.c()) {
            return null;
        }
        ficj ficj0 = this.b.a(60L, TimeUnit.SECONDS);
        fhvz fhvz0 = fhwa.a(0x397AB);
        fhvz0.c(fhwp.b(this.c));
        fhvz0.b(dlwf.a(hjrn0));
        fhwa fhwa0 = fhvz0.a();
        this.a.a(fhwa0);
        return ficj0;
    }

    public final ficj b(hjrn hjrn0) {
        ibuq.f(hjrn0, "bulletin");
        if(!hwfq.c()) {
            return null;
        }
        ficj ficj0 = this.b.a(60L, TimeUnit.SECONDS);
        fhvz fhvz0 = fhwa.a(0x3977B);
        fhvz0.c(fhwp.b(this.c));
        fhvz0.b(dlwf.a(hjrn0));
        fhwa fhwa0 = fhvz0.a();
        this.a.a(fhwa0);
        return ficj0;
    }

    public final void c(hjrn hjrn0, ficj ficj0) {
        ibuq.f(hjrn0, "bulletin");
        if(hwfq.c() && ficj0 != null) {
            fhvz fhvz0 = fhwa.a(0x397AA);
            fhvz0.c(fhwp.b(this.c));
            fhvz0.b(ficj0.a());
            fhvz0.b(dlwf.a(hjrn0));
            fhwa fhwa0 = fhvz0.a();
            this.a.a(fhwa0);
            ficj0.c(1);
            ficj0.close();
        }
    }

    public final void d(hjrn hjrn0, ficj ficj0) {
        ibuq.f(hjrn0, "bulletin");
        if(hwfq.c() && ficj0 != null) {
            fhvz fhvz0 = fhwa.a(0x3977C);
            fhvz0.c(fhwp.b(this.c));
            fhvz0.b(ficj0.a());
            fhvz0.b(dlwf.a(hjrn0));
            fhwa fhwa0 = fhvz0.a();
            this.a.a(fhwa0);
            ficj0.c(1);
            ficj0.close();
        }
    }

    public final void e(int v, int v1) {
        if(!hwfq.c()) {
            return;
        }
        fhwb fhwb0 = this.a;
        fhvz fhvz0 = fhwa.a(0x3E1BB);
        fhvz0.c(fhwp.b(this.c));
        gjca gjca0 = gjbz.a(((gjcd)((ProtoLiteMessage)gjce.a).v_newBuilder()));
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjda.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gjda)hftv0).b |= 1;
        ((gjda)hftv0).c = (long)v1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjda gjda0 = (gjda)hftp0.b_message;
        gjda0.b |= 2;
        gjda0.d = v;
        ProtoLiteMessage hftv1 = hftp0.N_build();
        ibuq.e(hftv1, "build(...)");
        ibuq.f(((gjda)hftv1), "value");
        gjcd gjcd0 = gjca0.a;
        if(!gjcd0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gjcd0).ensureMutable();
        }
        gjce gjce0 = (gjce)gjcd0.b_message;
        ((gjda)hftv1).getClass();
        gjce0.p = (gjda)hftv1;
        gjce0.b |= 0x200000;
        fhvz0.b(douc.a(gjca0.a()));
        fhwb0.a(fhvz0.a());
    }
}

