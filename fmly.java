import java.security.InvalidParameterException;

public enum fmly {
    STACK_CARD(0),
    STANDALONE_CARD(1),
    CARD_CAROUSEL(2);

    public final int d;

    private fmly(int v1) {
        this.d = v1;
    }

    public static fmly a(int v) {
        fmly fmly0 = (fmly)ggch.k(fmly.values()).c(new fmlx(v)).g();
        if(fmly0 != null) {
            return fmly0;
        }
        throw new InvalidParameterException("Invalid CardType.");
    }
}

