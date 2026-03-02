public final class dmnv {
    public final String a;
    public final ggeo b;
    public String c;
    private final dmgk d;

    public dmnv(ggeo ggeo0, String s, dmgk dmgk0) {
        this.c = "";
        this.b = ggeo0;
        this.a = s;
        this.d = dmgk0;
    }

    public final void a(hahw hahw0, int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hahz.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((hahz)hftv0).d = 7;
        String s = this.a;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hahz)hftp1.b_message).e = s;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hahy.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        hahy hahy0 = (hahy)hftp2.b_message;
        hahy0.b = hahw0.a();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((hahy)hftp2.b_message).c = v - 2;
        hahy hahy1 = (hahy)hftp2.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hahz hahz0 = (hahz)hftp1.b_message;
        hahy1.getClass();
        hahz0.c = hahy1;
        hahz0.b = 6;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp0.b_message;
        hahz hahz1 = (hahz)hftp1.N_build();
        hahz1.getClass();
        hapr0.ca = hahz1;
        hapr0.h |= 0x100;
        this.b(hftp0);
    }

    public final void b(ProtoLiteBuilder hftp0) {
        this.d.d(hftp0, this.c);
    }
}

