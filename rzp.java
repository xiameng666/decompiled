import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface rzp {
    public static final rzo a;

    static {
        rzp.a = rzo.a;
    }

    rzm[] a();
}

