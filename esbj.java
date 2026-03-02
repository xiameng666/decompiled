import j..util.function.Function.-CC;
import java.util.function.Function;
import java.util.regex.Matcher;

public final class esbj implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        String s = ((hlwj)object0).d.toStringUtf8();
        Matcher matcher0 = esbl.g.matcher(s);
        int v = 0;
        if(matcher0.find()) {
            String s1 = matcher0.group(1);
            if(s1 != null) {
                v = Integer.parseInt(s1) / 100000;
            }
        }
        return v;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

