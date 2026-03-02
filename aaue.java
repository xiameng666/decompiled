import j..util.Objects;

public final class aaue implements Runnable {
    final int a;
    final int b;
    final int c;
    final aauf d;

    public aaue(aauf aauf0, int v, int v1, int v2) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        Objects.requireNonNull(aauf0);
        this.d = aauf0;
        super();
    }

    @Override
    public final void run() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqxt.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gqwt.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gqwq.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gqwq)hftp2.b_message).c = 3;
        ((gqwq)hftp2.b_message).b |= 1;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gqwr.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        int v = this.a;
        ProtoLiteMessage hftv0 = hftp3.b_message;
        ((gqwr)hftv0).b |= 4;
        ((gqwr)hftv0).f = v;
        if(!hftv0.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp3.b_message;
        ((gqwr)hftv1).b |= 1;
        ((gqwr)hftv1).c = this.b;
        if(!hftv1.isImmutable()) {
            hftp3.ensureMutable();
        }
        aauf aauf0 = this.d;
        ProtoLiteMessage hftv2 = hftp3.b_message;
        ((gqwr)hftv2).b |= 2;
        ((gqwr)hftv2).d = this.c;
        if(!hftv2.isImmutable()) {
            hftp3.ensureMutable();
        }
        gqwr gqwr0 = (gqwr)hftp3.b_message;
        hfuf hfuf0 = gqwr0.e;
        if(!hfuf0.c()) {
            gqwr0.e = ProtoLiteMessage.C(hfuf0);
        }
        hfrj.E(aauf0.a, gqwr0.e);
        gqwr gqwr1 = (gqwr)hftp3.N_build();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gqwq gqwq0 = (gqwq)hftp2.b_message;
        gqwr1.getClass();
        gqwq0.g = gqwr1;
        gqwq0.b |= 16;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gqwt gqwt0 = (gqwt)hftp1.b_message;
        gqwq gqwq1 = (gqwq)hftp2.N_build();
        gqwq1.getClass();
        gqwt0.c = gqwq1;
        gqwt0.b |= 8;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqxt gqxt0 = (gqxt)hftp0.b_message;
        gqwt gqwt1 = (gqwt)hftp1.N_build();
        gqwt1.getClass();
        gqxt0.e = gqwt1;
        gqxt0.b |= 8;
        aauf0.e(v, ((gqxt)hftp0.N_build()));
        aauf0.c.remove(this);
    }
}

