import java.util.ArrayList;
import java.util.List;

public final class fkbt implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1 = new ArrayList();
        for(Object object2: ((List)object0)) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glnz.a).v_newBuilder();
            gloz gloz0 = ((fkbf)object2).a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((glnz)hftv0).A = gloz0;
            ((glnz)hftv0).b |= 0x80000000;
            glnx glnx0 = ((fkbf)object2).b;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((glnz)hftp0.b_message).m = glnx0;
            ((glnz)hftp0.b_message).b |= 0x100;
            ((List)object1).add(((glnz)hftp0.N_build()));
        }
        return object1;
    }
}

