import android.os.Message;
import j..util.Objects;

final class feik extends fefk {
    final feil a;

    public feik(feil feil0) {
        Objects.requireNonNull(feil0);
        this.a = feil0;
        super();
    }

    @Override  // fefk
    public final String a() {
        return "ServiceOnState";
    }

    @Override  // fefk
    public final boolean d(Message message0) {
        switch(message0.what) {
            case 1: {
                feil feil0 = this.a;
                feil0.b(true);
                if(feil0.b.getState() == 12) {
                    feil0.w(feil0.u);
                    return true;
                }
                break;
            }
            case 2: {
                this.a.b(false);
                this.a.w(this.a.p);
                return true;
            }
            case 3: {
                this.a.w(this.a.u);
                return true;
            }
            case 4: {
                break;
            }
            default: {
                feil.c(this.a, message0);
                return false;
            }
        }
        return true;
    }
}

