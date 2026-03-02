import android.os.Message;
import j..util.Objects;

final class feij extends fefk {
    final feil a;

    public feij(feil feil0) {
        Objects.requireNonNull(feil0);
        this.a = feil0;
        super();
    }

    @Override  // fefk
    public final String a() {
        return "ServiceOffState";
    }

    @Override  // fefk
    public final boolean d(Message message0) {
        switch(message0.what) {
            case 1: {
                this.a.w(this.a.t);
                break;
            }
            case 2: {
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

