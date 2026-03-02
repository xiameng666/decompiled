// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
final class dnnp extends Enum {
    public static final enum dnnp a;
    public static final enum dnnp b;
    public static final enum dnnp c;
    public static final enum dnnp d;
    public static final enum dnnp e;
    public static final enum dnnp f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final Integer k;
    public final Integer l;
    private static final dnnp[] m;

    static {
        dnnp.a = new dnnp("DISABLED", 0, null, null, null, null, null, null, 0x3F);
        dnnp.b = new dnnp("DEFAULT_ENABLED", 1, ((int)0x7F151CDA), ((int)0x7F14012E), null, null, null, null, 60);  // string:pay_default_for_contactless "Default for tap to pay"
        Integer integer0 = (int)0x7F151E82;  // string:pay_hold_near_reader "Hold to reader"
        dnnp.c = new dnnp("ENABLED", 2, integer0, ((int)0x7F14012F), null, null, null, null, 60);  // raw:contactless_icon_lottie
        dnnp.d = new dnnp("ENABLED_QP", 3, integer0, null, ((int)0x7F080A03), ((int)0x7F080A04), null, null, 50);  // drawable:pay_quicpay_card_network_icon
        dnnp.e = new dnnp("ENABLED_ID", 4, integer0, null, ((int)0x7F0809DE), null, null, null, 58);  // drawable:pay_id_card_network_icon
        Integer integer1 = (int)0x7F0402C1;  // attr:colorError
        dnnp.f = new dnnp("LOCKED", 5, ((int)0x7F151F4A), null, ((int)0x7F0805BB), null, integer1, integer1, 10);  // string:pay_locked "Locked"
        dnnp[] arr_dnnp = {dnnp.a, dnnp.b, dnnp.c, dnnp.d, dnnp.e, dnnp.f};
        dnnp.m = arr_dnnp;
        ibsn.a(arr_dnnp);
    }

    public dnnp(String s, int v, Integer integer0, Integer integer1, Integer integer2, Integer integer3, Integer integer4, Integer integer5, int v1) {
        super(s, v);
        if(1 == (v1 & 1)) {
            integer0 = null;
        }
        this.g = integer0;
        if((v1 & 2) != 0) {
            integer1 = null;
        }
        this.h = integer1;
        if((v1 & 4) != 0) {
            integer2 = null;
        }
        this.i = integer2;
        if((v1 & 8) != 0) {
            integer3 = null;
        }
        this.j = integer3;
        if((v1 & 16) != 0) {
            integer4 = null;
        }
        this.k = integer4;
        if((v1 & 0x20) != 0) {
            integer5 = null;
        }
        this.l = integer5;
    }

    public static dnnp[] values() {
        return (dnnp[])dnnp.m.clone();
    }
}

