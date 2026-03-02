import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import java.util.LinkedHashMap;

public final class krf {
    public static final String a = "id";
    public static final String b = "type";
    public static final String c = "rpId";
    public static final String d = "challenge";
    public static final String e = "appid";
    public static final String f = "thirdPartyPayment";
    public static final String g = "authenticatorSelection";
    public static final String h = "requireResidentKey";
    public static final String i = "residentKey";
    public static final String j = "authenticatorAttachment";
    public static final String k = "timeout";
    public static final String l = "excludeCredentials";
    public static final String m = "transports";
    public static final String n = "rp";
    public static final String o = "name";
    public static final String p = "icon";
    public static final String q = "alg";
    public static final String r = "user";
    public static final String s = "displayName";
    public static final String t = "extensions";
    public static final String u = "attestation";
    public static final String v = "pubKeyCredParams";
    public static final LinkedHashMap w;

    static {
        ibns[] arr_ibns = new ibns[12];
        kme kme0 = new kme();
        arr_ibns[0] = new ibns(ErrorCode.h, kme0);
        klt klt0 = new klt();
        arr_ibns[1] = new ibns(ErrorCode.e, klt0);
        klw klw0 = new klw(null);
        arr_ibns[2] = new ibns(ErrorCode.l, klw0);
        klu klu0 = new klu();
        arr_ibns[3] = new ibns(ErrorCode.i, klu0);
        klv klv0 = new klv();
        arr_ibns[4] = new ibns(ErrorCode.j, klv0);
        kly kly0 = new kly();
        arr_ibns[5] = new ibns(ErrorCode.b, kly0);
        klx klx0 = new klx();
        arr_ibns[6] = new ibns(ErrorCode.g, klx0);
        klz klz0 = new klz();
        arr_ibns[7] = new ibns(ErrorCode.d, klz0);
        kma kma0 = new kma();
        arr_ibns[8] = new ibns(ErrorCode.k, kma0);
        kmb kmb0 = new kmb();
        arr_ibns[9] = new ibns(ErrorCode.a, kmb0);
        kmc kmc0 = new kmc();
        arr_ibns[10] = new ibns(ErrorCode.c, kmc0);
        kmd kmd0 = new kmd();
        arr_ibns[11] = new ibns(ErrorCode.f, kmd0);
        krf.w = ibpz.h(arr_ibns);
    }
}

