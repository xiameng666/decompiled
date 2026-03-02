import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class eqbj implements Runnable {
    final eqbk a;

    public eqbj(eqbk eqbk0) {
        Objects.requireNonNull(eqbk0);
        this.a = eqbk0;
        super();
    }

    @Override
    public final void run() {
        batl.e(this.a.b.c);
        this.a.b.b.t(2);
        eqlz.a(this.a.b.b, 8);
        eqik eqik0 = this.a.a;
        Bundle bundle0 = this.a.c;
        eqao eqao0 = this.a.b.d;
        if(eqao0.s()) {
            try {
                epzx epzx0 = ((eqaq)eqao0).k;
                if(epzx0 != null) {
                    batl.m(epzx0.k, "Bootstrap needs to first be paused before it can be resumed.");
                    if(bundle0.containsKey("pendingIntentResult") && epzx0.m != null) {
                        epzx.f.j("Resuming bootstrap, pending intents are completed", new Object[0]);
                        bundle0.getInt("pendingIntentResult");
                        if(epzx0.m.e.decrementAndGet() == 0) {
                            epzx0.k = false;
                        }
                    }
                    else {
                        epzx0.k = false;
                        if(epzx0.o) {
                            epzx0.n(eqsh.f(bundle0.getParcelableArrayList("accounts")));
                        }
                        else {
                            epzl epzl0 = epzx0.l;
                            if(epzl0 == null) {
                                epzx.f.f("resumeBootstrap called but SourceAccountTransferController was null!", new Object[0]);
                            }
                            else {
                                epzl0.b(bundle0.getParcelableArrayList("accounts"));
                            }
                        }
                    }
                }
            }
            finally {
                eqao.k(eqik0, new Status(0));
            }
            return;
        }
        eqao.a.f("No connection in progress.", new Object[0]);
        eqao.k(eqik0, new Status(10567));
    }
}

