import j..util.function.Function.-CC;
import java.util.function.Function;

public final class euqj implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ggtj ggtj0 = (ggtj)((ggtj)euqk.a.h()).ar(0x4047);
        ftiu ftiu0 = ((ftiw)object0).b == 5 ? ((ftiu)((ftiw)object0).c) : ftiu.a;
        gtjo gtjo0 = ftiu0.c == null ? gtjo.a : ftiu0.c;
        ggtj0.B("Trusted Provisioning IDV outcome: %s", (gtmy.b(gtjo0.c) == null ? gtmy.e : gtmy.b(gtjo0.c)));
        return ((ftiw)object0).b == 5 ? ((ftiu)((ftiw)object0).c) : ftiu.a;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

