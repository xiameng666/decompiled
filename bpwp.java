import j..util.function.BiFunction.-CC;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public final class bpwp implements BinaryOperator {
    public final BiFunction andThen(Function function0) {
        return BiFunction.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0, Object object1) {
        fqxj fqxj0 = (fqxj)object0;
        fqxj fqxj1 = (fqxj)object1;
        gftb.checkTrue(fqxj0.d.equals(fqxj1.d));
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)fqxj0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)fqxj0));
        fqxi fqxi0 = (fqxi)hftp0;
        fqxi0.a(fqxj1.c);
        return (fqxj)((ProtoLiteBuilder)fqxi0).N_build();
    }
}

