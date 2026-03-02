import j..util.Collection.-EL;
import j..util.function.Function.-CC;
import java.util.AbstractMap.SimpleEntry;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;

public final class aped implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)apag.a).v_newBuilder();
        String s = (String)((Map.Entry)object0).getKey();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        apag apag0 = (apag)hftp0.b_message;
        s.getClass();
        apag0.b = s;
        if(((List)((Map.Entry)object0).getValue()).size() == 1) {
            int v = apet.f(((hhem)((List)((Map.Entry)object0).getValue()).get(0)), 98, 0) ? 4 : 2;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            apag apag1 = (apag)hftp0.b_message;
            apag1.c = apaf.a(v);
            return new AbstractMap.SimpleEntry(((String)((Map.Entry)object0).getKey()), ((apag)hftp0.N_build()));
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        apag apag2 = (apag)hftp0.b_message;
        apag2.c = apaf.a(3);
        hftp0.cF(((gged_interceptors)Collection.-EL.stream(((List)((Map.Entry)object0).getValue())).map(new apdx()).filter(new apei()).collect(ggaf.a)));
        return new AbstractMap.SimpleEntry(((String)((Map.Entry)object0).getKey()), ((apag)hftp0.N_build()));
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

