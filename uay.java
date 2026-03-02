import java.nio.charset.Charset;
import java.security.MessageDigest;

public interface uay {
    public static final Charset a;

    static {
        uay.a = Charset.forName("UTF-8");
    }

    void a(MessageDigest arg1);

    @Override
    boolean equals(Object arg1);

    @Override
    int hashCode();
}

