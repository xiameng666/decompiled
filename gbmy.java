import java.util.ArrayList;
import java.util.List;

public final class gbmy {
    public static final hdrl a(hdrl hdrl0, long v, gbpb gbpb0, gbot gbot0) {
        ibuq.f(hdrl0, "<this>");
        ibuq.f(gbot0, "clientIdGenerator");
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hdrl0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hdrl0));
        long v1 = gbot0.e();
        if(!((hftr)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((hftr)hftp0))).ensureMutable();
        }
        hdrl hdrl1 = (hdrl)((hftr)hftp0).b_message;
        hdrl1.b |= 1;
        hdrl1.c = v1;
        if(!((hftr)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((hftr)hftp0))).ensureMutable();
        }
        hdrl hdrl2 = (hdrl)((hftr)hftp0).b_message;
        hdrl2.b |= 4;
        hdrl2.e = v;
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)(((hftr)hftp0))).N_build();
        ibuq.e(hftv0, "build(...)");
        byi byi0 = new byi(null);
        for(Object object0: gbpb.a(((hdrl)hftv0))) {
            long v2 = ((hdrl)object0).c;
            ibuq.c(((hdrl)object0));
            byi0.h(v2, gbmy.a(((hdrl)object0), v, gbpb0, gbot0));
        }
        if(byi0.k()) {
            return (hdrl)hftv0;
        }
        hdrl hdrl3 = gbpb.b(((hdrl)hftv0), byi0);
        ibuq.e(hdrl3, "updateChildren(...)");
        return hdrl3;
    }

    public static final List b(hdrl hdrl0, List list0, gbpb gbpb0, gbot gbot0) {
        ibuq.f(hdrl0, "<this>");
        ibuq.f(gbot0, "clientIdGenerator");
        List list1 = new ArrayList();
        for(Object object0: list0) {
            list1.add(gbmy.a(hdrl0, ((Number)object0).longValue(), gbpb0, gbot0));
        }
        return list1;
    }
}

