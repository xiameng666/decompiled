import java.util.regex.Pattern;

public final class gqjb {
    private final gqja a;

    public gqjb() {
        this.a = new gqja();
    }

    public final Pattern a(String s) {
        gqja gqja0 = this.a;
        Pattern pattern0 = (Pattern)gqja0.a(s);
        if(pattern0 == null) {
            pattern0 = Pattern.compile(s);
            gqja0.b(s, pattern0);
        }
        return pattern0;
    }
}

