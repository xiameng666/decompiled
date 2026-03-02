import java.util.HashMap;

public final class hmph extends HashMap {
    private static final byte[] a;

    static {
        hmph.a = new byte[16];
    }

    public static int a(int v) {
        return v > 0x7F ? (v - v % 16) / 16 * 16 + 15 : (v - v % 4) / 4 * 4 + 3;
    }

    public final hmpf b(int v) {
        Integer integer0 = v;
        hmpf hmpf0 = (hmpf)this.get(integer0);
        if(hmpf0 != null) {
            return hmpf0;
        }
        try {
            return hmph.d(v) ? new hmpo(hmpy.I("00000000000FFF078069FFFFFFFFFFFF"), integer0) : new hmpi(hmph.a, integer0);
        }
        catch(hmou unused_ex) {
            throw new hmoy(15);
        }
    }

    public final hmpo c(int v) {
        Integer integer0 = hmph.a(v);
        hmpo hmpo0 = (hmpo)this.get(integer0);
        if(hmpo0 != null) {
            return hmpo0;
        }
        hmpo hmpo1 = new hmpo(hmpy.I("00000000000FFF078069FFFFFFFFFFFF"), integer0);
        this.put(integer0, hmpo1);
        return hmpo1;
    }

    public static boolean d(int v) {
        return v > 0 && v <= 0xFF && v == hmph.a(v);
    }
}

