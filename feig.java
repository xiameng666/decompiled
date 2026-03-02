import android.os.Message;
import j..util.Objects;

final class feig extends fefk {
    final feil a;

    public feig(feil feil0) {
        Objects.requireNonNull(feil0);
        this.a = feil0;
        super();
    }

    @Override  // fefk
    public final String a() {
        return "ConnectedState";
    }

    @Override  // fefk
    public final boolean d(Message message0) {
        switch(message0.what) {
            case 1: {
                return true;
            }
            case 5: {
                feil feil0 = this.a;
                fekd fekd0 = feil0.l;
                if(fekd0 == null) {
                    feil0.g.b();
                    return true;
                }
                fekd0.a(feil0.m, false);
                return true;
            }
            case 2: 
            case 4: 
            case 6: {
                this.a.w(this.a.u);
                return true;
            }
            default: {
                feil.c(this.a, message0);
                return false;
            }
        }
    }
}

