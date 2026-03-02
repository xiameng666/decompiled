import java.nio.charset.StandardCharsets;

public final class gynd {
    private final byte[] a;

    private gynd(byte[] arr_b) {
        this.a = arr_b;
    }

    public static byte a(String s) {
        try {
            byte[] arr_b = ghjc.f.e().q(s);
            if(arr_b.length == 8) {
                return arr_b[0];
            }
        }
        catch(IllegalArgumentException unused_ex) {
        }
        return 0;
    }

    public static gynd b(gync gync0, String s, String s1) {
        byte[] arr_b;
        if(gfta.c(s)) {
            throw new IllegalArgumentException("OEM ID must be non-empty");
        }
        if(s.length() != 4) {
            throw new IllegalArgumentException("OEM ID must be 4 characters long");
        }
        try {
            arr_b = ghjc.f.e().q(s);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new IllegalArgumentException("Bad OEM ID string", illegalArgumentException0);
        }
        if(gfta.c(s1)) {
            throw new IllegalArgumentException("Device ID must be non-empty");
        }
        String s2 = gfqz.d(s1);
        byte[] arr_b1 = ghgc.a.c(s2, StandardCharsets.UTF_8).e();
        return new gynd(new byte[]{gync0.d, arr_b[0], arr_b[1], arr_b1[0], arr_b1[1], arr_b1[2], arr_b1[3], arr_b1[4]});
    }

    public final byte[] c() {
        return (byte[])this.a.clone();
    }
}

