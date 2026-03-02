import j..util.function.Function.-CC;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;

public final class enlc implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        emko emko0 = (emko)((Map.Entry)object0).getValue();
        List list0 = emko0.e.subList(0, Math.min(3, emko0.e.size()));
        ggek ggek0 = new ggek();
        for(Object object1: list0) {
            emkm emkm0 = emkm.a;
            emkm emkm1 = (emkm)emko0.c.get(((Long)object1));
            if(emkm1 != null) {
                emkm0 = emkm1;
            }
            ggek0.i(((Long)object1), emkm0);
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)emko0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)emko0));
        if(!((emkj)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((emkj)hftp0))).ensureMutable();
        }
        ((emko)((emkj)hftp0).b_message).e = hfvb.a;
        ((emkj)hftp0).a(list0);
        if(!((emkj)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((emkj)hftp0))).ensureMutable();
        }
        ((emko)((emkj)hftp0).b_message).b().clear();
        ((emkj)hftp0).k(ggek0.b());
        return (emko)((ProtoLiteBuilder)(((emkj)hftp0))).N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

