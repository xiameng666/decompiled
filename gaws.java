import java.util.ArrayList;
import java.util.List;

public final class gaws {
    public static final List a(List list0) {
        ibuq.f(list0, "fieldNumberList");
        List list1 = new ArrayList(ibpo.q(list0, 10));
        for(Object object0: list0) {
            int v = ((Number)object0).intValue();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hcok.a).v_newBuilder();
            ibuq.f(hftp0, "builder");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hcok hcok0 = (hcok)hftp0.b_message;
            hcok0.b |= 1;
            hcok0.c = v;
            ProtoLiteMessage hftv0 = hftp0.N_build();
            ibuq.e(hftv0, "build(...)");
            list1.add(((hcok)hftv0));
        }
        return list1;
    }
}

