import j..util.function.Function.-CC;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;

public final class aldf implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return ((Map.Entry)object0).getValue() == null ? String.format("%s apps (Profile #%s)", ((int)0), ((int)((ywf)((Map.Entry)object0).getKey()).a)) : String.format("%s apps (Profile #%s)", ((List)((Map.Entry)object0).getValue()).size(), ((int)((ywf)((Map.Entry)object0).getKey()).a));
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

