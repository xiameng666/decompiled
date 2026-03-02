import android.accounts.Account;
import android.content.Context;

public final class aqnh implements aqni {
    private final aqjk a;
    private final aqee b;

    public aqnh(Context context0) {
        this(new aqjk(context0), new aqee(context0));
    }

    public aqnh(aqjk aqjk0, aqee aqee0) {
        this.a = aqjk0;
        this.b = aqee0;
    }

    public final aqft a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aqft.a).v_newBuilder();
        Account account0 = this.b.a();
        if(account0 != null && this.a.i()) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            aqft aqft0 = (aqft)hftp0.b_message;
            aqft0.b |= 1;
            aqft0.c = true;
            String s = account0.name;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            aqft aqft1 = (aqft)hftp0.b_message;
            s.getClass();
            aqft1.b |= 2;
            aqft1.d = s;
            return (aqft)hftp0.N_build();
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aqft aqft2 = (aqft)hftp0.b_message;
        aqft2.b |= 1;
        aqft2.c = false;
        return (aqft)hftp0.N_build();
    }

    @Override  // aqni
    public final aqft b(aqvd aqvd0) {
        return this.a();
    }

    @Override  // aqni
    public final aqfx c() {
        return aqfx.g;
    }

    @Override  // aqni
    public final gfsx d(aqvd aqvd0) {
        return gfqx.a;
    }

    @Override  // aqni
    public final boolean e(Account account0, aqvd aqvd0) {
        this.b.c(account0);
        this.a.f(true);
        return this.a.i();
    }
}

