import j..util.Collection.-EL;
import j..util.stream.Collector;
import j..util.stream.Stream;
import java.util.function.Function;

public final class ehrw implements gfsi {
    public final Function a;

    public ehrw(Function function0) {
        this.a = function0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Stream stream0 = Collection.-EL.stream(((ehtw)object0).d).map(new ehrx());
        Collector collector0 = ggaf.a;
        gged_interceptors gged0 = (gged_interceptors)stream0.collect(collector0);
        gged_interceptors gged1 = (gged_interceptors)this.a.apply(gged0);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ehtw)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ehtw)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ehtw)hftp0.b_message).d = hfvb.a;
        Iterable iterable0 = (Iterable)Collection.-EL.stream(gged1).map(new ehrr()).collect(collector0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ehtw ehtw0 = (ehtw)hftp0.b_message;
        hfui hfui0 = ehtw0.d;
        if(!hfui0.c()) {
            ehtw0.d = ProtoLiteMessage.D(hfui0);
        }
        hfrj.E(iterable0, ehtw0.d);
        return (ehtw)hftp0.N_build();
    }
}

