import java.security.SecureRandom;

public final class bxzm {
    public static final bxzl a;
    public static final ibnn b;
    public static final SecureRandom c;

    static {
        bxzm.a = new bxzl();
        bxzm.b = new ibnz(new bxzk());
        bxzm.c = new SecureRandom();
    }

    public static final int a(String s) {
        switch(s.hashCode()) {
            case 0x9BF589AC: {
                return s.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL") ? bxzj.d.e : bxzj.a.e;
            }
            case 0xDF99CEC7: {
                return s.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL") ? bxzj.b.e : bxzj.a.e;
            }
            case -95037569: {
                return s.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL") ? bxzj.c.e : bxzj.a.e;
            }
            default: {
                return bxzj.a.e;
            }
        }
    }
}

