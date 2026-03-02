import j..util.DesugarArrays;
import j..util.function.Function.-CC;
import j..util.stream.Stream.-CC;
import java.io.File;
import java.util.function.Function;

public final class aohc implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        File[] arr_file = ((File)object0).listFiles();
        return arr_file == null ? Stream.-CC.empty() : DesugarArrays.stream(arr_file);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

