public final class buqr {
    private static final buqm a;
    private static final buqn b;

    static {
        buqr.a = new buqm();
        buqr.b = new buqn();
    }

    public static final fhvp a(hiwq hiwq0) {
        ibuq.f(hiwq0, "smuiCategory");
        hfta hfta0 = hjcc.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hjas.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hjbo.a).v_newBuilder();
        hjbi hjbi0 = buqr.d(hiwq0);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hjbo hjbo0 = (hjbo)hftp1.b_message;
        hjbi0.getClass();
        hjbo0.c = hjbi0;
        hjbo0.b |= 2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hjas hjas0 = (hjas)hftp0.b_message;
        hjbo hjbo1 = (hjbo)hftp1.N_build();
        hjbo1.getClass();
        hjas0.c = hjbo1;
        hjas0.b |= 0x200;
        return new fhvp(hfta0, hftp0.N_build());
    }

    public static final fhvu b(hiwq hiwq0) {
        ibuq.f(hiwq0, "smuiCategory");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hjbz.a).v_newBuilder();
        hjbi hjbi0 = buqr.d(hiwq0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hjbz hjbz0 = (hjbz)hftp0.b_message;
        hjbi0.getClass();
        hjbz0.c = hjbi0;
        hjbz0.b |= 1;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hjby.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hjby hjby0 = (hjby)hftp1.b_message;
        ((hjbz)hftv0).getClass();
        hjby0.c = (hjbz)hftv0;
        hjby0.b |= 8;
        ProtoLiteMessage hftv1 = hftp1.N_build();
        ibuq.e(hftv1, "build(...)");
        return new fhvu(hjcc.b, ((hjby)hftv1));
    }

    public static final hjau c(hiwo hiwo0) {
        ibuq.f(hiwo0, "category");
        hisb hisb0 = (hisb)buqr.a.kt(hiwo0);
        if(hisb0 == null) {
            hisb0 = hisb.a;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hjau.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hjat.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hjat hjat0 = (hjat)hftp1.b_message;
        hjat0.c = hisb0.a();
        hjat0.b |= 4;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hjau hjau0 = (hjau)hftp0.b_message;
        hjat hjat1 = (hjat)hftp1.N_build();
        hjat1.getClass();
        hjau0.c = hjat1;
        hjau0.b |= 0x20;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hjau)hftv0;
    }

    private static final hjbi d(hiwq hiwq0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hjbi.a).v_newBuilder();
        ibuq.e(hftp0, "newBuilder(...)");
        hiwp hiwp0 = hiwp.b(hiwq0.b) == null ? hiwp.f : hiwp.b(hiwq0.b);
        hisd hisd0 = (hisd)buqr.b.kt(hiwp0);
        if(hisd0 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hjbi hjbi0 = (hjbi)hftp0.b_message;
            hjbi0.c = hisd0.a();
            hjbi0.b |= 1;
        }
        hiwo hiwo0 = hiwo.b(hiwq0.c) == null ? hiwo.l : hiwo.b(hiwq0.c);
        hisb hisb0 = (hisb)buqr.a.kt(hiwo0);
        if(hisb0 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hjbi hjbi1 = (hjbi)hftp0.b_message;
            hjbi1.d = hisb0.a();
            hjbi1.b |= 2;
        }
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hjbi)hftv0;
    }
}

