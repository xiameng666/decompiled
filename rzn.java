import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface rzn {
    boolean a() default false;

    boolean b() default false;

    ryz[] c();
}

