import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Pattern;

public final class ajcu {
    private static final baun a;
    private final Pattern b;

    static {
        ajcu.a = new baun("AuthUtil", new String[]{"UrlChecker"});
    }

    public ajcu(Pattern pattern0) {
        this.b = pattern0;
    }

    public static ajcu a(String s) {
        return new ajcu(Pattern.compile(s));
    }

    public final boolean b(String s) {
        if(s == null) {
            return false;
        }
        boolean z = this.b.matcher(s).find();
        if(!z) {
            ajcu.c(s);
        }
        return z;
    }

    private static final void c(String s) {
        try {
            URI uRI0 = new URI(s);
            String s1 = uRI0.getScheme();
            String s2 = uRI0.getHost();
            String s3 = uRI0.getPath();
            ajcu.a.h("Untrusted URL: " + (s1 + "://" + s2 + s3), new Object[0]);
        }
        catch(URISyntaxException uRISyntaxException0) {
            ajcu.a.h("Untrusted URL with URISyntaxException: " + uRISyntaxException0.getMessage(), new Object[0]);
        }
    }
}

