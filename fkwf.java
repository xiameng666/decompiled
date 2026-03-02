import java.util.concurrent.CancellationException;

public final class fkwf implements glzn {
    public final fkwk a;
    public final String b;

    public fkwf(fkwk fkwk0, String s) {
        this.a = fkwk0;
        this.b = s;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        fkwi fkwi0;
        gmcd gmcd1;
        if(!((Boolean)object0).booleanValue()) {
            return gmbu.h(new Exception("Failed to add file group!"));
        }
        fkwk fkwk0 = this.a;
        fkwj fkwj0 = new fkwj();
        fjaa fjaa0 = fjab.a();
        fjaa0.a = gfsx.m(fkwk0.a);
        fjaa0.b("photos_filegroup_" + this.b);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fizr.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((fizr)hftv0).d = 1;
        ((fizr)hftv0).b |= 2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((fizr)hftp0.b_message).c = 2;
        ((fizr)hftp0.b_message).b |= 1;
        fjaa0.b = gfsx.m(((fizr)hftp0.N_build()));
        fjaa0.c = gfsx.m(new fkwh(fkwk0, fkwj0));
        fjab fjab0 = fjaa0.a();
        gmcd gmcd0 = fkwk0.b.b(fjab0);
        synchronized(fkwj0.a) {
            fkwj0.c = gmcd0;
            if(fkwj0.b) {
                gmcd0.cancel(true);
            }
        }
        synchronized(fkwj0.a) {
            gftb.check(fkwj0.c);
            gmcd1 = fkwj0.c;
            fkwi0 = new fkwi(fkwj0);
        }
        return gdtf.f(gmcd1, CancellationException.class, fkwi0, gmap.a);
    }
}

