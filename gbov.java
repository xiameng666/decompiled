import java.util.List;

public final class gbov {
    public static final long a(hcnu hcnu0) {
        ibuq.f(hcnu0, "<this>");
        return (hcnu0.c == null ? hcos.a : hcnu0.c).c;
    }

    public static final hcqv b(gbot gbot0, long v, hcno hcno0) {
        ibuq.f(hcno0, "clientState");
        hcqu hcqu0 = hcqt.a(((hftr)((ProtoLiteMessage)hcqv.a).v_newBuilder()));
        hcqu0.b(gbot0.a());
        hcqu0.e();
        hcqu0.d(v);
        hfta hfta0 = hcrd.f;
        ibuq.e(hfta0, "dataStateConditionExtension");
        hcqx hcqx0 = hcqw.a(((ProtoLiteMessage)hcrd.a).v_newBuilder());
        hcqx0.b(hcqz.g);
        ibuq.f(hcno0, "value");
        ProtoLiteBuilder hftp0 = hcqx0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcrd hcrd0 = (hcrd)hftp0.b_message;
        hcno0.getClass();
        hcrd0.d = hcno0;
        hcrd0.c = 7;
        hcqu0.c(hfta0, hcqx0.a());
        return hcqu0.a();
    }

    public static final hcqv c(gbot gbot0, long v, hcog hcog0) {
        ibuq.f(hcog0, "valueMatch");
        hcqu hcqu0 = hcqt.a(((hftr)((ProtoLiteMessage)hcqv.a).v_newBuilder()));
        hcqu0.b(gbot0.a());
        hcqu0.e();
        hcqu0.d(v);
        hfta hfta0 = hcrd.f;
        ibuq.e(hfta0, "dataStateConditionExtension");
        hcqx hcqx0 = hcqw.a(((ProtoLiteMessage)hcrd.a).v_newBuilder());
        hcqx0.b(hcqz.b);
        ibuq.f(hcog0, "value");
        ProtoLiteBuilder hftp0 = hcqx0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hcrd)hftp0.b_message).d = (int)hcog0.g;
        ((hcrd)hftp0.b_message).c = 2;
        hcqu0.c(hfta0, hcqx0.a());
        return hcqu0.a();
    }

    public static final hcrz d(long v, hcog hcog0) {
        ibuq.f(hcog0, "newState");
        hcry hcry0 = hcrx.a(((hftr)((ProtoLiteMessage)hcrz.a).v_newBuilder()));
        hcry0.d();
        hcry0.c(v);
        hfta hfta0 = hcrs.f;
        ibuq.e(hfta0, "dataResultingActionExtension");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hcrs.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        hcrr hcrr0 = hcrr.c;
        ibuq.f(hcrr0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hcrs)hftp0.b_message).e = hcrr0.j;
        ((hcrs)hftp0.b_message).b |= 1;
        ibuq.f(hcog0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hcrs)hftp0.b_message).d = (int)hcog0.g;
        ((hcrs)hftp0.b_message).c = 3;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        hcry0.b(hfta0, ((hcrs)hftv0));
        return hcry0.a();
    }

    public static final hcsi e(gbot gbot0, long v) {
        hcsh hcsh0 = hcsg.a(((hftr)((ProtoLiteMessage)hcsi.a).v_newBuilder()));
        hcsh0.c(gbot0.b());
        hcsh0.e();
        hcsh0.d(v);
        hfta hfta0 = hdrq.d;
        ibuq.e(hfta0, "nodeTriggerExtension");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hdrq.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        hdrp hdrp0 = hdrp.b;
        ibuq.f(hdrp0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hdrq)hftp0.b_message).c = hdrp0.k;
        ((hdrq)hftp0.b_message).b |= 1;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        hcsh0.b(hfta0, ((hdrq)hftv0));
        return hcsh0.a();
    }

    public static final hcsi f(gbot gbot0, hcse hcse0, long[] arr_v) {
        ibuq.f(hcse0, "triggerType");
        hcsh hcsh0 = hcsg.a(((hftr)((ProtoLiteMessage)hcsi.a).v_newBuilder()));
        hcsh0.c(gbot0.b());
        hcsh0.e();
        List list0 = ibpg.M(arr_v);
        ibuq.f(list0, "values");
        hcsh0.a.u(list0);
        hfta hfta0 = hcsf.d;
        ibuq.e(hfta0, "stateChangeDataTriggerExtension");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hcsf.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ibuq.f(hcse0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hcsf)hftp0.b_message).c = hcse0.f;
        ((hcsf)hftp0.b_message).b |= 1;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        hcsh0.b(hfta0, ((hcsf)hftv0));
        return hcsh0.a();
    }

    public static final hftr g(gbot gbot0) {
        hftr hftr0 = (hftr)((ProtoLiteMessage)hcnu.a).v_newBuilder();
        hftr hftr1 = (hftr)((ProtoLiteMessage)hcos.a).v_newBuilder();
        long v = gbot0.c();
        if(!hftr1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr1).ensureMutable();
        }
        hcos hcos0 = (hcos)hftr1.b_message;
        hcos0.b |= 1;
        hcos0.c = v;
        hcos hcos1 = (hcos)((ProtoLiteBuilder)hftr1).N_build();
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hcnu hcnu0 = (hcnu)hftr0.b_message;
        hcos1.getClass();
        hcnu0.c = hcos1;
        hcnu0.b |= 1;
        return hftr0;
    }

    public static final hftr h(long[] arr_v) {
        hftr hftr0 = (hftr)((ProtoLiteMessage)hcrz.a).v_newBuilder();
        hftr0.s(ibpg.M(arr_v));
        return hftr0;
    }

    public static final hftr i(gbot gbot0, long[] arr_v) {
        hftr hftr0 = (hftr)((ProtoLiteMessage)hcsi.a).v_newBuilder();
        int v = gbot0.b();
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hcsi hcsi0 = (hcsi)hftr0.b_message;
        hcsi0.b |= 1;
        hcsi0.d = v;
        hftr0.u(ibpg.M(arr_v));
        return hftr0;
    }

    public static final hftr j(hcnu hcnu0, gbot gbot0) {
        ibuq.f(hcnu0, "<this>");
        hftr hftr0 = (hftr)((ProtoLiteMessage)hdrl.a).v_newBuilder();
        long v = gbot0.e();
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hdrl hdrl0 = (hdrl)hftr0.b_message;
        hdrl0.b |= 1;
        hdrl0.c = v;
        long v1 = (hcnu0.c == null ? hcos.a : hcnu0.c).c;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hdrl hdrl1 = (hdrl)hftr0.b_message;
        hdrl1.b |= 4;
        hdrl1.e = v1;
        return hftr0;
    }
}

