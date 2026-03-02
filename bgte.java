import android.content.Context;
import j..util.function.Consumer.-CC;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

public final class bgte extends fxpd implements Consumer {
    private final bgpa a;
    private final esaa b;
    private final AtomicBoolean c;
    private final AtomicBoolean d;

    static {
        bgrz.a("MsgHndlr");
    }

    public bgte(Context context0, bgpa bgpa0) {
        super("MsgHndlr");
        this.c = new AtomicBoolean(false);
        this.d = new AtomicBoolean(true);
        this.a = bgpa0;
        this.b = new esaa(context0, 1, "CrisisAlertsRcv", "Receiving Crisis Alert Message", "com.google.android.gms");
    }

    @Override  // fxpd
    public final void a() {
        this.c.set(true);
        if(this.d.getAndSet(false)) {
            this.h.d(9);
        }
        this.j();
    }

    @Override
    public final void accept(Object object0) {
        hfwn hfwn0 = ((hgud)object0).c;
        if(hfwn0 == null) {
            hfwn0 = hfwn.a;
        }
        hfyn.b(hfwn0);
        bgrz.b(((hguc)((hgud)object0).d.get(0)));
        this.c.get();
        if(!this.c.get()) {
            return;
        }
        erzz erzz0 = this.b.a("Receiving Crisis Alert Message", 5000L);
        this.h.e(5, new bgtd(((hgud)object0), erzz0));
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }

    @Override  // fxpd
    public final void b(fxpi fxpi0) {
        this.c.set(false);
    }

    @Override  // fxpd
    public final boolean c(fxpj fxpj0) {
        switch(fxpj0.a) {
            case 5: {
                try {
                    this.a.a(((bgtd)fxpj0.b).a.d, true);
                }
                finally {
                    ((bgtd)fxpj0.b).b.a();
                }
                return true;
            }
            case 9: {
                this.a.b();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

