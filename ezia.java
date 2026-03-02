import com.google.android.gms.trustagent.trustlet.device.ui.TrustedUiDevice;
import j..util.Collection.-EL;
import j..util.Comparator.-CC;
import j..util.function.Function.-CC;
import j..util.function.UnaryOperator.-CC;
import java.util.function.Function;

public final class ezia implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        gged_interceptors gged0 = (gged_interceptors)object0;
        gged_interceptors gged1 = (gged_interceptors)Collection.-EL.stream(gged0).map(new ezjj()).flatMap(new ezjq()).map(new ezjr()).distinct().collect(ggaf.a);
        ggeo ggeo0 = (ggeo)Collection.-EL.stream(gged0).map(new ezjj()).flatMap(new ezjq()).map(new ezjv()).flatMap(new ezjw()).distinct().collect(ggaf.b(new ezjx(), UnaryOperator.-CC.identity()));
        String s = ((TrustedUiDevice)gged0.get(0)).c;
        int v = (int)(((Integer)Collection.-EL.stream(gged0).map(new ezjp()).max(Comparator.-CC.naturalOrder()).orElse(Integer.valueOf(0))));
        return new TrustedUiDevice(((gged_interceptors)Collection.-EL.stream(gged1).map(new ezjm(ggeo0)).collect(ggaf.a)), s, v);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

