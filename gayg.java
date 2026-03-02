import j..util.DesugarCollections;
import java.util.List;

public final class gayg implements gcqf {
    private final gaym a;
    private final long b;
    private gkzj c;

    public gayg(gaym gaym0, long v) {
        ibuq.f(gaym0, "eventLogger");
        super();
        this.a = gaym0;
        this.b = v;
        gkzj gkzj0 = (gkzj)((ProtoLiteMessage)gkzk.a).v_newBuilder();
        ibuq.e(gkzj0, "newBuilder(...)");
        this.c = gkzj0;
    }

    @Override  // gcqf
    public final void a(gkyz gkyz0, List list0) {
        ibuq.f(gkyz0, "status");
        ibuq.f(list0, "unsupportedPodlTags");
        gkzj gkzj0 = this.c;
        gkwk gkwk0 = gkwj.a(((ProtoLiteMessage)gkzh.a).v_newBuilder());
        gkwk0.c(gkzb.d);
        gkwk0.b(gkyz0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkzi.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        List list1 = DesugarCollections.unmodifiableList(((gkzi)hftp0.b_message).b);
        ibuq.e(list1, "getUnsupportedPdolTagList(...)");
        new hfxu(list1);
        ibuq.f(list0, "values");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkzi gkzi0 = (gkzi)hftp0.b_message;
        hfuo hfuo0 = gkzi0.b;
        if(!hfuo0.c()) {
            gkzi0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(list0, gkzi0.b);
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((gkzi)hftv0), "value");
        ProtoLiteBuilder hftp1 = gkwk0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gkzh gkzh0 = (gkzh)hftp1.b_message;
        ((gkzi)hftv0).getClass();
        gkzh0.d = (gkzi)hftv0;
        gkzh0.c = 5;
        gkzj0.a(gkwk0.a());
    }

    @Override  // gcqf
    public final void b(gkyz gkyz0, int v) {
        gcqe.a(this, gkyz0, v);
    }

    @Override  // gcqf
    public final void c(gkyz gkyz0, List list0, int v) {
        ibuq.f(gkyz0, "status");
        ibuq.f(list0, "successfulTags");
        gkzj gkzj0 = this.c;
        gkwk gkwk0 = gkwj.a(((ProtoLiteMessage)gkzh.a).v_newBuilder());
        gkwk0.c(gkzb.c);
        gkwk0.b(gkyz0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkzl.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkzl gkzl0 = (gkzl)hftp0.b_message;
        gkzl0.b |= 1;
        gkzl0.c = v;
        List list1 = DesugarCollections.unmodifiableList(gkzl0.d);
        ibuq.e(list1, "getSuccessfulTagList(...)");
        new hfxu(list1);
        ibuq.f(list0, "values");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkzl gkzl1 = (gkzl)hftp0.b_message;
        hfuo hfuo0 = gkzl1.d;
        if(!hfuo0.c()) {
            gkzl1.d = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(list0, gkzl1.d);
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((gkzl)hftv0), "value");
        ProtoLiteBuilder hftp1 = gkwk0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gkzh gkzh0 = (gkzh)hftp1.b_message;
        ((gkzl)hftv0).getClass();
        gkzh0.d = (gkzl)hftv0;
        gkzh0.c = 4;
        gkzj0.a(gkwk0.a());
    }

    @Override  // gcqf
    public final void d(gkyz gkyz0, String s) {
        ibuq.f(gkyz0, "status");
        gkzj gkzj0 = this.c;
        gkwk gkwk0 = gkwj.a(((ProtoLiteMessage)gkzh.a).v_newBuilder());
        gkwk0.c(gkzb.b);
        gkwk0.b(gkyz0);
        if(s != null) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkzm.a).v_newBuilder();
            ibuq.f(hftp0, "builder");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkzm gkzm0 = (gkzm)hftp0.b_message;
            gkzm0.b |= 1;
            gkzm0.c = s;
            ProtoLiteMessage hftv0 = hftp0.N_build();
            ibuq.e(hftv0, "build(...)");
            ibuq.f(((gkzm)hftv0), "value");
            ProtoLiteBuilder hftp1 = gkwk0.a;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gkzh gkzh0 = (gkzh)hftp1.b_message;
            ((gkzm)hftv0).getClass();
            gkzh0.d = (gkzm)hftv0;
            gkzh0.c = 3;
        }
        gkzj0.a(gkwk0.a());
    }

    @Override  // gcqf
    public final void e(gkzf gkzf0, gkzd gkzd0) {
        gkxf gkxf0;
        ibuq.f(gkzf0, "nfcEventType");
        ibuq.f(gkzd0, "nfcEventStatus");
        gkyx gkyx0 = gkyw.a(((ProtoLiteMessage)gkxt.a).v_newBuilder());
        gkyx0.b(gkwx.B);
        ProtoLiteBuilder hftp0 = gkyx0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkxt gkxt0 = (gkxt)hftp0.b_message;
        gkxt0.b |= 0x20;
        gkxt0.l = this.b;
        switch(gkzd0.ordinal()) {
            case 1: {
                gkxf0 = gkxf.b;
                break;
            }
            case 2: {
                gkxf0 = gkxf.d;
                break;
            }
            default: {
                gkxf0 = gkxf.e;
            }
        }
        ibuq.f(gkxf0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gkxt)hftp0.b_message).m = gkxf0.g;
        ((gkxt)hftp0.b_message).b |= 0x40;
        gkzj gkzj0 = this.c;
        if(!gkzj0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gkzj0).ensureMutable();
        }
        ((gkzk)gkzj0.b_message).d = gkzf0.e;
        ((gkzk)gkzj0.b_message).b |= 2;
        if(!gkzj0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gkzj0).ensureMutable();
        }
        ((gkzk)gkzj0.b_message).e = gkzd0.i;
        ((gkzk)gkzj0.b_message).b |= 4;
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)gkzj0).N_build();
        ibuq.e(hftv0, "build(...)");
        gkyx0.c(((gkzk)hftv0));
        gkxt gkxt1 = gkyx0.a();
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gkxt1).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gkxt1));
        ibuq.e(hftp1, "toBuilder(...)");
        this.a.f(hftp1);
        gkzj gkzj1 = (gkzj)((ProtoLiteMessage)gkzk.a).v_newBuilder();
        ibuq.e(gkzj1, "newBuilder(...)");
        this.c = gkzj1;
    }
}

