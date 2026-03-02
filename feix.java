import android.os.Message;
import j..util.Objects;

final class feix extends fefk {
    final feiy a;

    public feix(feiy feiy0) {
        Objects.requireNonNull(feiy0);
        this.a = feiy0;
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
                this.a.w(this.a.j);
                break;
            }
            case 2: {
                break;
            }
            default: {
                feiy.i(this.a, message0);
                return false;
            }
        }
        return true;
    }
}

