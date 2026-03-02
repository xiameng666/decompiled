import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Locale;

public final class hmlx {
    public static byte a(String s) {
        return (byte)((Character.digit(s.charAt(0), 16) << 4) + Character.digit(s.charAt(1), 16));
    }

    public static int b(int v, int v1) {
        int v2 = v - v1;
        return v2 <= 0 ? -v2 : v2;
    }

    public static int c(byte[] arr_b, int v) {
        int v1 = arr_b[v];
        return (v1 & 0xFFFFFF80) == 0xFFFFFF80 ? (v1 & 0x7F) + 1 : 1;
    }

    public static int d(byte[] arr_b, int v) {
        int v1 = hmlx.c(arr_b, v);
        byte[] arr_b1 = new byte[v1];
        System.arraycopy(arr_b, v, arr_b1, 0, v1);
        if((arr_b[v] & 0xFFFFFF80) == 0xFFFFFF80) {
            byte[] arr_b2 = new byte[v1 - 1];
            System.arraycopy(arr_b1, 1, arr_b2, 0, v1 - 1);
            arr_b1 = arr_b2;
        }
        int v3 = 0;
        for(int v2 = 0; v2 < arr_b1.length; ++v2) {
            v3 = v3 << 8 | arr_b1[v2] & 0xFF;
        }
        return v3;
    }

    public static hmli e(List list0) {
        for(Object object0: list0) {
            hmli hmli0 = (hmli)object0;
            if(hmli0.b) {
                return hmli0;
            }
        }
        return null;
    }

    public static hmli f(hmli hmli0, hmli hmli1) {
        if(!hmli0.b) {
            return hmli1.b ? hmli1 : null;
        }
        return hmli0;
    }

    public static String g(byte[] arr_b) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < arr_b.length; ++v) {
            stringBuilder0.append(String.format("%02X", ((byte)arr_b[v])));
        }
        return stringBuilder0.toString();
    }

    public static String h(byte b) {
        return String.format("%02X", b);
    }

    public static String i(String s) {
        for(Object object0: hmke.d) {
            String s1 = (String)object0;
            if(s.equals(s1)) {
                return s1;
            }
        }
        return null;
    }

    public static Locale j(String s) {
        String[] arr_s = s.split("_");
        if(arr_s.length == 1) {
            return new Locale(arr_s[0].trim());
        }
        switch(arr_s.length) {
            case 2: {
                return new Locale(arr_s[0].trim(), arr_s[1].trim());
            }
            case 3: {
                return new Locale(arr_s[0].trim(), arr_s[1].trim(), arr_s[2].trim());
            }
            default: {
                return hmke.e;
            }
        }
    }

    public static boolean k(String s) {
        try {
            new BigDecimal(s);
            return true;
        }
        catch(NumberFormatException unused_ex) {
            return false;
        }
    }

    public static byte[] l(byte[] arr_b, int v) {
        byte[] arr_b1 = new byte[v];
        System.arraycopy(arr_b, 0, arr_b1, v - arr_b.length, arr_b.length);
        return arr_b1;
    }

    public static byte[] m(byte[] arr_b) {
        return hmlx.n(new String(arr_b, Charset.forName("US-ASCII")));
    }

    public static byte[] n(String s) {
        int v = s.length();
        byte[] arr_b = new byte[v / 2];
        for(int v1 = 0; v1 < v; v1 += 2) {
            arr_b[v1 / 2] = (byte)((Character.digit(s.charAt(v1), 16) << 4) + Character.digit(s.charAt(v1 + 1), 16));
        }
        return arr_b;
    }

    public static byte[] o(byte[] arr_b) {
        byte[] arr_b1 = new byte[arr_b.length];
        for(int v = 0; v < arr_b.length; ++v) {
            arr_b1[v] = arr_b[arr_b.length - 1 - v];
        }
        return arr_b1;
    }

    public static void p(byte[] arr_b) {
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            byte b = 0;
            for(int v2 = 0; v2 < 8; ++v2) {
                int v3 = v1 & 1;
                v1 >>= 1;
                b = (byte)(((byte)(b + b)) | v3);
            }
            arr_b[v] = b;
        }
    }
}

