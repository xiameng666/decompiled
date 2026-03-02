// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class azud extends Enum {
    public static final enum azud a;
    public static final enum azud b;
    public static final enum azud c;
    public static final enum azud d;
    public final hfkb e;
    private static final azud[] f;

    static {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfkb.b).v_newBuilder();
        hfka hfka0 = hfka.d;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hfkb hfkb0 = (hfkb)hftp0.b_message;
        hfkb0.d = hfka0.a();
        azud.a = new azud("PROVISION_OF_SERVICE_INFRASTRUCTURE", 0, ((hfkb)hftp0.N_build()));
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hfkb.b).v_newBuilder();
        hfka hfka1 = hfka.w;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hfkb hfkb1 = (hfkb)hftp1.b_message;
        hfkb1.d = hfka1.a();
        azud.b = new azud("TRUST_SAFETY_ANTI_FRAUD", 1, ((hfkb)hftp1.N_build()));
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hfkb.b).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp2.b_message;
        ((hfkb)hftv0).c = 1;
        hfka hfka2 = hfka.a;
        if(!hftv0.isImmutable()) {
            hftp2.ensureMutable();
        }
        hfkb hfkb2 = (hfkb)hftp2.b_message;
        hfkb2.d = hfka2.a();
        azud.c = new azud("CROSS_USE_OFFERED_TOGETHER", 2, ((hfkb)hftp2.N_build()));
        azud.d = new azud("MODULE_RESPONSIBLE_FOR_PERFORMING_EVALUATIONS", 3, hfkb.b);
        azud.f = new azud[]{azud.a, azud.b, azud.c, azud.d};
    }

    private azud(String s, int v, hfkb hfkb0) {
        super(s, v);
        this.e = hfkb0;
    }

    public static azud[] values() {
        return (azud[])azud.f.clone();
    }
}

