import j..util.function.Function.-CC;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public final class cdmd implements UnaryOperator {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        glim glim0 = (glim)((cddb)object0).d();
        if(glim0 != null) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)glim0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)glim0));
            cczl cczl0 = (cczl)cdme.a.mr();
            if(!((glil)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((glil)hftp0))).ensureMutable();
            }
            glim glim1 = (glim)((glil)hftp0).b_message;
            cczl0.getClass();
            glim1.B = cczl0;
            glim1.b |= 0x10000;
            return ((cddb)object0).c(((ProtoLiteMessage)(((glim)((ProtoLiteBuilder)(((glil)hftp0))).N_build()))));
        }
        return (cddb)object0;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

