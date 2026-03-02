import j..util.function.Function.-CC;
import java.util.function.Function;

public final class fcme implements Function {
    public final fcmj a;
    public final String b;
    public final String c;

    public fcme(fcmj fcmj0, String s, String s1) {
        this.a = fcmj0;
        this.b = s;
        this.c = s1;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        String s = (String)object0;
        return fckl.h(this.a.i.a, this.b, this.c).b();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

