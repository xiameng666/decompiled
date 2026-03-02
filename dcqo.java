import j..util.Objects;
import java.util.Locale;

public final class dcqo {
    final jqt a;

    public dcqo(dcqq dcqq0, jqt jqt0) {
        this.a = jqt0;
        Objects.requireNonNull(dcqq0);
        super();
    }

    public final void a(sor sor0) {
        String s;
        cunf cunf0 = dcvz.a.b();
        int v = sor0.a;
        if(v == 100) {
            s = "TOS_RESPONSE_MISSING";
        }
        else {
            switch(v) {
                case 1: {
                    s = "FAILED";
                    break;
                }
                case 2: {
                    s = "SUCCESS";
                    break;
                }
                case 3: {
                    s = "CALLER_VERIFICATION_FAILURE";
                    break;
                }
                case 4: {
                    s = "API_DISABLED";
                    break;
                }
                case 5: {
                    s = "NOT_IMPLEMENTED";
                    break;
                }
                case 6: {
                    s = "RUNNING";
                    break;
                }
                case 7: {
                    s = "INSTALL_DISABLED";
                    break;
                }
                case 8: {
                    s = "FAILED_NEEDS_USER_CONSENT";
                    break;
                }
                default: {
                    s = "UNKNOWN";
                }
            }
        }
        cunf0.h("Phonesky P2P service connected status: %s.", String.format(Locale.ENGLISH, "[%d]%s", v, s));
        if(v == 2) {
            this.a.b(Boolean.valueOf(true));
            return;
        }
        this.a.b(Boolean.valueOf(false));
    }
}

