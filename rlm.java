import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface rlm {
    public static final rll a;

    static {
        rlm.a = rll.a;
    }

    Class a();
}

