import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.util.UUID;

public final class flxy implements flzo {
    private final long a;
    private final AccountContext b;

    public flxy(long v, AccountContext accountContext0) {
        this.a = v;
        this.b = accountContext0;
    }

    @Override  // flzo
    public final gmcd a(hnxl hnxl0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnqz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        hnxl0.getClass();
        ((hnqz)hftv0).c = hnxl0;
        ((hnqz)hftv0).b |= 1;
        long v = this.a;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hnqz)hftp0.b_message).d = v;
        return gmbu.i(((hnqz)hftp0.N_build()));
    }

    @Override  // flzo
    public final gmcd b(gmcd gmcd0, Object object0) {
        return glzd.g(gmcd0, new flxx(((hnqz)object0)), gmap.a);
    }

    @Override  // flzo
    public final Object c(Object object0) {
        long v = ((hnra)object0).c;
        int v1 = 2;
        switch(((hnra)object0).b) {
            case 0: {
                break;
            }
            case 1: {
                v1 = 3;
                break;
            }
            case 2: {
                v1 = 4;
                break;
            }
            default: {
                v1 = 0;
            }
        }
        if(v1 == 0) {
            v1 = 1;
        }
        if(v1 != 1) {
            return new flkk(v, v1 - 2);
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override  // flzo
    public final void d(UUID uUID0, int v, iapk iapk0, flsl flsl0, long v1) {
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        fmai0.n(this.b.c().f());
        fmai0.o(this.b.d().toStringUtf8());
        fmai0.p(uUID0.toString());
        fmai0.j(25);
        fmai0.m(Integer.valueOf(iapk0.t.r));
        fmai0.f(v);
        fmai0.e(v1);
        flsl0.b(fmai0.a());
    }

    @Override  // flzo
    public final void e(UUID uUID0, Object object0, flsl flsl0, long v) {
        flkk flkk0 = (flkk)object0;
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        fmai0.n(this.b.c().f());
        fmai0.o(this.b.d().toStringUtf8());
        fmai0.p(uUID0.toString());
        fmai0.j(25);
        fmai0.f(1);
        fmai0.e(v);
        flsl0.b(fmai0.a());
    }
}

