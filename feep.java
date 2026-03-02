import android.os.Message;
import j..util.Objects;

final class feep extends fefk {
    final feeq a;

    public feep(feeq feeq0) {
        Objects.requireNonNull(feeq0);
        this.a = feeq0;
        super();
    }

    @Override  // fefk
    public final String a() {
        return "ServiceOnState";
    }

    @Override  // fefk
    public final void b() {
        feeq feeq0 = this.a;
        feeq0.b();
        if(((fczq)feeq0.g.get()).f) {
            if(feeq0.b.getState() == 12) {
                feeq0.E(12);
            }
            return;
        }
        feeq0.x(3);
    }

    @Override  // fefk
    public final boolean d(Message message0) {
        feeq feeq0 = this.a;
        boolean z = ((fczq)feeq0.g.get()).f;
        int v = message0.what;
        if(v != 2) {
            switch(v) {
                case 3: {
                    feeq0.b();
                    if(!z) {
                        feeq0.B(feeq0.p);
                        return true;
                    }
                    if(feeq0.b.getState() == 12) {
                        feeq0.B(feeq0.m);
                        return true;
                    }
                    return true;
                }
                case 12: {
                    break;
                }
                default: {
                    return feeq0.i(message0);
                }
            }
            feeq0.B(feeq0.p);
            return true;
        }
        else if(message0.arg1 == 12 && z) {
            feeq0.B(feeq0.m);
        }
        return true;
    }
}

