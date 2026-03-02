import com.google.android.gms.audit.LogAuditRecordsRequest;

public final class befn implements evqk {
    public final befy a;
    public final grns b;

    public befn(befy befy0, grns grns0) {
        this.a = befy0;
        this.b = grns0;
    }

    @Override  // evqk
    public final evql a(Object object0) {
        ibuq.c(((grkr)object0));
        grkf grkf0 = (grkf)((ProtoLiteMessage)grkg.a).v_newBuilder();
        ibuq.f(grkf0, "builder");
        grkz grkz0 = grky.a(((ProtoLiteMessage)grku.a).v_newBuilder());
        grkz0.c(gqub.gG);
        grkx grkx0 = grkw.a(((ProtoLiteMessage)grkv.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grmt.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        grnr grnr0 = grnq.a(((ProtoLiteMessage)grnp.a).v_newBuilder());
        grnr0.b(grno.c);
        grnp grnp0 = grnr0.a();
        ibuq.f(grnp0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grmt grmt0 = (grmt)hftp0.b_message;
        grnp0.getClass();
        grmt0.c = grnp0;
        grmt0.b |= 1;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((grmt)hftv0), "value");
        ProtoLiteBuilder hftp1 = grkx0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        grkv grkv0 = (grkv)hftp1.b_message;
        ((grmt)hftv0).getClass();
        grkv0.x = (grmt)hftv0;
        grkv0.c |= 0x80000000;
        grkz0.b(grkx0.a());
        grku grku0 = grkz0.a();
        ibuq.f(grku0, "value");
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grns grns0 = this.b;
        grkg grkg0 = (grkg)grkf0.b_message;
        grku0.getClass();
        grkg0.f = grku0;
        grkg0.b |= 4;
        ibuq.f(grns0, "value");
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg1 = (grkg)grkf0.b_message;
        grns0.getClass();
        grkg1.g = grns0;
        grkg1.b |= 8;
        ibuq.f(((grkr)object0), "value");
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg2 = (grkg)grkf0.b_message;
        ((grkr)object0).getClass();
        grkg2.d = (grkr)object0;
        grkg2.b |= 1;
        ibuq.f(((grkr)object0), "value");
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg3 = (grkg)grkf0.b_message;
        ((grkr)object0).getClass();
        grkg3.e = (grkr)object0;
        grkg3.b |= 2;
        ProtoLiteMessage hftv1 = ((ProtoLiteBuilder)grkf0).N_build();
        ibuq.e(hftv1, "build(...)");
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grkh.a).v_newBuilder();
        ibuq.f(hftp2, "builder");
        ByteString hfsf0 = ByteString.copyFrom(acqi.a());
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        grkh grkh0 = (grkh)hftp2.b_message;
        grkh0.b |= 1;
        grkh0.c = hfsf0;
        ProtoLiteMessage hftv2 = hftp2.N_build();
        ibuq.e(hftv2, "build(...)");
        acqo acqo0 = new acqo();
        acqo0.b = gqtt.cu.eR;
        acqo0.a = 2;
        acqo0.b(((grkg)hftv1).toBytesArray());
        acqo0.c = this.a.d;
        acqo0.d = ((grkh)hftv2).toBytesArray();
        LogAuditRecordsRequest logAuditRecordsRequest0 = acqo0.a();
        return this.a.b.b(logAuditRecordsRequest0);
    }
}

