import com.google.android.gms.audit.LogAuditRecordsRequest;

public final class egsa implements evpo {
    public final egsd a;
    public final grkf b;
    public final String c;

    public egsa(egsd egsd0, grkf grkf0, String s) {
        this.a = egsd0;
        this.b = grkf0;
        this.c = s;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        String s = (String)evql0.j();
        egsd egsd0 = this.a;
        String s1 = bapf.c(egsd0.c);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grkn.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grkn grkn0 = (grkn)hftp0.b_message;
        s1.getClass();
        grkn0.b |= 1;
        grkn0.c = s1;
        grkn grkn1 = (grkn)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grkr.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        grkr grkr0 = (grkr)hftp1.b_message;
        grkn1.getClass();
        grkr0.d = grkn1;
        grkr0.b |= 4;
        if(s != null) {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grko.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            grko grko0 = (grko)hftp2.b_message;
            grko0.b = 1;
            grko0.c = s;
            grko grko1 = (grko)hftp2.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            grkr grkr1 = (grkr)hftp1.b_message;
            grko1.getClass();
            grkr1.c = grko1;
            grkr1.b |= 1;
        }
        grkf grkf0 = this.b;
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg0 = (grkg)grkf0.b_message;
        grkr grkr2 = (grkr)hftp1.N_build();
        grkr2.getClass();
        grkg0.e = grkr2;
        grkg0.b |= 2;
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        String s2 = this.c;
        grkg grkg1 = (grkg)grkf0.b_message;
        grkr grkr3 = (grkr)hftp1.N_build();
        grkr3.getClass();
        grkg1.d = grkr3;
        grkg1.b |= 1;
        acqo acqo0 = new acqo();
        acqo0.b = 0x88;
        acqo0.a = 2;
        acqo0.b(((grkg)((ProtoLiteBuilder)grkf0).N_build()).toBytesArray());
        if(s2 != null) {
            acqo0.c = s2;
        }
        LogAuditRecordsRequest logAuditRecordsRequest0 = acqo0.a();
        return egsd0.b.b(logAuditRecordsRequest0);
    }
}

