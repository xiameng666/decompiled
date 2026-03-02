import android.accounts.Account;
import android.content.Context;

public final class aqnj implements aqni {
    private static final asdc a;
    private final aqjk b;
    private final Context c;

    static {
        aqnj.a = asdc.a;
    }

    public aqnj(Context context0) {
        this.c = context0;
        this.b = new aqjk(context0);
    }

    public final aqft a() {
        boolean z1;
        boolean z = false;
        if(!hqje.a.m().Y()) {
            z1 = aqnj.a.h(this.c);
        }
        else if(this.b.i() && aqnj.a.h(this.c)) {
            z1 = true;
        }
        else {
            z1 = false;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aqft.a).v_newBuilder();
        if(z1 || hqil.a.j().P()) {
            z = true;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aqft aqft0 = (aqft)hftp0.b_message;
        aqft0.b |= 1;
        aqft0.c = z;
        return (aqft)hftp0.N_build();
    }

    @Override  // aqni
    public final aqft b(aqvd aqvd0) {
        return this.a();
    }

    @Override  // aqni
    public final aqfx c() {
        return aqfx.i;
    }

    @Override  // aqni
    public final gfsx d(aqvd aqvd0) {
        return gfqx.a;
    }

    @Override  // aqni
    public final boolean e(Account account0, aqvd aqvd0) {
        aqnj.a.a(this.c, true);
        return aqnj.a.h(this.c);
    }
}

