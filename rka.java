import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({})
public @interface rka {
    rjx a() default rjx.b;

    rjz b();

    boolean c() default false;
}

