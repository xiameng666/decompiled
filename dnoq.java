// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class dnoq extends Enum {
    public static final enum dnoq a;
    public static final enum dnoq b;
    public static final enum dnoq c;
    public static final enum dnoq d;
    public static final enum dnoq e;
    public static final enum dnoq f;
    public static final enum dnoq g;
    public static final enum dnoq h;
    public final Integer i;
    public final Integer j;
    public final Integer k;
    public final boolean l;
    public final fryv m;
    public final frxs n;
    private static final dnoq[] o;
    private final Integer p;

    static {
        dnoq.a = new dnoq("NONE", 0, null, null, null, null, 0x1F);
        Integer integer0 = (int)0x7F0402FC;  // attr:colorOnSurfaceVariant
        dnoq.b = new dnoq("NO_NFC_TOKEN", 1, ((int)0x7F151BCA), integer0, null, null, 28);  // string:pay_add_to_wallet "Add to Wallet"
        Integer integer1 = (int)0x7F0402F7;  // attr:colorOnSurface
        dnoq.c = new dnoq("HAS_NFC", 2, null, null, ((int)0x7F080528), integer1, 19);  // drawable:gs_contactless_vd_theme_24
        dnoq.d = new dnoq("NFC_DEFAULT", 3, ((int)0x7F151E19), integer0, ((int)0x7F080526), integer1, 16);  // string:pay_fops_list_default_tap_to_pay "Default for tap to pay"
        Integer integer2 = (int)0x7F151E13;  // string:pay_fops_finish_set_up "Finish setup"
        Integer integer3 = (int)0x7F04030C;  // attr:colorPrimary
        Integer integer4 = (int)0x7F08067B;  // drawable:gs_warning_vd_theme_24
        dnoq.e = new dnoq("PENDING_ACTIVATION", 4, integer2, integer3, integer4, integer3, 16);
        dnoq.f = new dnoq("IDENTITY_VERIFICATION_REQUIRED", 5, integer2, integer3, integer4, integer3, 16);
        Integer integer5 = (int)0x7F0402C1;  // attr:colorError
        dnoq.g = new dnoq("SUSPENDED", 6, ((int)0x7F152224), integer5, ((int)0x7F080569), integer5, false);  // string:pay_suspended "Suspended"
        dnoq.h = new dnoq("PIX_BANK_REQUIRE_FIX", 7, ((int)0x7F152052), integer3, integer4, integer3, 16);  // string:pay_pix_fix_bank_account_label "Relink account"
        dnoq[] arr_dnoq = {dnoq.a, dnoq.b, dnoq.c, dnoq.d, dnoq.e, dnoq.f, dnoq.g, dnoq.h};
        dnoq.o = arr_dnoq;
        ibsn.a(arr_dnoq);
    }

    public dnoq(String s, int v, Integer integer0, Integer integer1, Integer integer2, Integer integer3, int v1) {
        if(1 == (v1 & 1)) {
            integer0 = null;
        }
        if((v1 & 2) != 0) {
            integer1 = null;
        }
        if((v1 & 4) != 0) {
            integer2 = null;
        }
        if((v1 & 8) != 0) {
            integer3 = null;
        }
        this(s, v, integer0, integer1, integer2, integer3, true);
    }

    private dnoq(String s, int v, Integer integer0, Integer integer1, Integer integer2, Integer integer3, boolean z) {
        super(s, v);
        this.i = integer0;
        this.p = integer1;
        this.j = integer2;
        this.k = integer3;
        this.l = z;
        frxo frxo0 = null;
        this.m = integer0 == null ? null : new fryr(((int)integer0));
        if(integer1 != null) {
            frxo0 = new frxo(((int)integer1));
        }
        this.n = frxo0;
    }

    public static dnoq[] values() {
        return (dnoq[])dnoq.o.clone();
    }
}

