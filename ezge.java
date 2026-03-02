import j..lang.Iterable.-EL;
import j..util.Collection.-EL;
import j..util.Objects;
import j..util.function.UnaryOperator.-CC;
import j..util.stream.Stream.-CC;
import j..util.stream.Stream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.Function;

public final class ezge {
    public static final glww a;

    static {
        ezge.a = new glww(new int[]{3, 0, 1, 2});
    }

    public static final gged_interceptors a(List list0, Function function0, ggef ggef0, ggeo ggeo0) {
        ggdy ggdy0 = new ggdy();
        ggeo ggeo1 = (ggeo)Collection.-EL.stream(list0).collect(ggaf.b(new ezgc(), UnaryOperator.-CC.identity()));
        LinkedHashSet linkedHashSet0 = new LinkedHashSet(list0);
        while(!linkedHashSet0.isEmpty()) {
            Object object0 = linkedHashSet0.iterator().next();
            String s = ((ezgp)object0).a();
            Stream stream0 = Stream.-CC.of(s);
            Objects.requireNonNull(ggeo1);
            ezfv ezfv0 = new ezfv(ggeo1);
            ezfw ezfw0 = new ezfw();
            gged_interceptors gged0 = (gged_interceptors)Stream.-CC.concat(Collection.-EL.stream(ggef0.b(((Integer)Objects.requireNonNull(((Integer)ggeo0.getOrDefault(s, Integer.valueOf(-1))))))), stream0).distinct().map(ezfv0).filter(ezfw0).collect(ggaf.a);
            Objects.requireNonNull(linkedHashSet0);
            Iterable.-EL.forEach(gged0, new ezgd(linkedHashSet0));
            ggdy0.i(((ezgp)function0.apply(gged0)));
        }
        return ggdy0.h();
    }
}

