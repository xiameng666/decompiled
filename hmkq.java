import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public final class hmkq {
    private final hmlg a;
    private final hmkv b;
    private final hmqm c;

    public hmkq(hmlg hmlg0, hmqm hmqm0) {
        this.c = hmqm0;
        this.a = hmlg0;
        this.b = new hmkv(hmlg0);
    }

    public final hmkf a(ByteBuffer byteBuffer0, String s, String s1) {
        if(byteBuffer0 == null) {
            hmli hmli0 = this.a.f.a().a();
            ByteBuffer byteBuffer1 = ByteBuffer.allocate(1);
            byteBuffer0 = (ByteBuffer)this.b.b(hmli0, byteBuffer1);
        }
        String s2 = hmkq.i(s1);
        hmlx.g(byteBuffer0.array());
        return new hmkf(byteBuffer0, hmkq.j(s), "yyyy-MM-dd\'T\'HH:mm:ss.SSSXXX", true, hmlx.j(s2));
    }

    public final hmkf b(hmli hmli0, String s, String s1, String s2) {
        hmli hmli1 = this.h(hmli0);
        String s3 = hmkq.j(s);
        String s4 = hmkq.i(s2);
        Object object0 = hmli1.a;
        if((object0 instanceof ByteBuffer)) {
            if(s1 != null && !s1.isEmpty()) {
                hmlx.g(((ByteBuffer)hmli1.a).array());
                return new hmkf(((ByteBuffer)hmli1.a), s3, s1, false, hmlx.j(s4));
            }
            return new hmkf(((ByteBuffer)hmli1.a), s3, "yyyy-MM-dd\'T\'HH:mm:ss.SSSXXX", false, hmlx.j(s4));
        }
        if((object0 instanceof hmkg)) {
            return s1 == null || s1.isEmpty() ? new hmkf(((hmkg)hmli1.a).a.longValue(), s3, "yyyy-MM-dd\'T\'HH:mm:ss.SSSXXX", hmlx.j(s4)) : new hmkf(((hmkg)hmli1.a).a.longValue(), s3, s1, s4);
        }
        if((object0 instanceof String)) {
            return s1 == null || s1.isEmpty() ? new hmkf(((String)hmli1.a), s3, "yyyy-MM-dd\'T\'HH:mm:ss.SSSXXX", hmlx.j(s4)) : new hmkf(((String)hmli1.a), s3, s1, hmlx.j(s4));
        }
        if((object0 instanceof hmkf)) {
            hmkf hmkf0 = (hmkf)hmli1.a;
            return s1 == null || s1.isEmpty() ? new hmkf(hmkf0.b().a.longValue(), s3, "yyyy-MM-dd\'T\'HH:mm:ss.SSSXXX", hmlx.j(s4)) : new hmkf(hmkf0.b().a.longValue(), s3, s1, s4);
        }
        hmki hmki0 = new hmki("Data conversion currently not supported...");
        this.c.a("Data conversion currently not supported...", hmki0);
        throw new hmki("Data conversion currently not supported...");
    }

    public final hmli c(hmli hmli0, String s) {
        hmli hmli1 = this.h(hmli0);
        switch(s) {
            case "I": {
                return new hmli(((hmkg)hmli1.d(hmkg.a(BigInteger.valueOf(1L)))));
            }
            case "b": {
                return new hmli(((hmkg)hmli1.d(hmkg.a(Byte.valueOf(((byte)1))))));
            }
            case "ba": {
                return new hmli(((ByteBuffer)hmli1.d(ByteBuffer.wrap(new byte[]{0}))));
            }
            case "d": {
                return new hmli(((hmkg)hmli1.d(hmkg.a(Double.valueOf(0.0)))));
            }
            case "dt": {
                return new hmli(((hmkf)hmli1.d(new hmkf(1L))));
            }
            case "f": {
                return new hmli(((hmkg)hmli1.d(hmkg.a(Float.valueOf(0.0f)))));
            }
            case "i": {
                return new hmli(((hmkg)hmli1.d(hmkg.a(Integer.valueOf(0)))));
            }
            case "l": {
                return new hmli(((hmkg)hmli1.d(hmkg.a(Long.valueOf(0L)))));
            }
            case "s": {
                return new hmli(((String)hmli1.d("")));
            }
            case "sh": {
                return new hmli(((hmkg)hmli1.d(hmkg.a(Short.valueOf(((short)1))))));
            }
            default: {
                throw new hmki("Data conversion currently not supported.");
            }
        }
    }

    public final hmli d(hmli hmli0, String s, String s1) {
        hmli hmli1 = this.h(hmli0);
        if(s != null && !s.isEmpty()) {
            switch(s) {
                case "I": {
                    return this.c(new hmli(((hmkg)hmli1.d(hmkg.a(BigInteger.valueOf(0L))))), s1);
                }
                case "b": {
                    return this.c(new hmli(((hmkg)hmli1.d(hmkg.a(Byte.valueOf(((byte)0)))))), s1);
                }
                case "ba": {
                    return this.c(new hmli(((ByteBuffer)hmli1.d(ByteBuffer.wrap(new byte[]{0})))), s1);
                }
                case "d": {
                    return this.c(new hmli(((hmkg)hmli1.d(hmkg.a(Double.valueOf(0.0))))), s1);
                }
                case "dt": {
                    return this.c(new hmli(((hmkf)hmli1.d(new hmkf(1L)))), s1);
                }
                case "f": {
                    return this.c(new hmli(((hmkg)hmli1.d(hmkg.a(Float.valueOf(0.0f))))), s1);
                }
                case "i": {
                    return this.c(new hmli(((hmkg)hmli1.d(hmkg.a(Integer.valueOf(0))))), s1);
                }
                case "l": {
                    return this.c(new hmli(((hmkg)hmli1.d(hmkg.a(Long.valueOf(0L))))), s1);
                }
                case "s": {
                    return this.c(new hmli(((String)hmli1.d(""))), s1);
                }
                case "sh": {
                    return this.c(new hmli(((hmkg)hmli1.d(hmkg.a(Short.valueOf(((short)0)))))), s1);
                }
                default: {
                    throw new hmki("Data conversion currently not supported.");
                }
            }
        }
        return this.c(hmli1, s1);
    }

    public final String e(ByteBuffer byteBuffer0, String s) {
        byte[] arr_b;
        if(byteBuffer0 == null) {
            hmli hmli0 = this.a.f.a().a();
            ByteBuffer byteBuffer1 = ByteBuffer.allocate(1);
            arr_b = ((ByteBuffer)this.b.b(hmli0, byteBuffer1)).array();
        }
        else {
            arr_b = byteBuffer0.array();
        }
        String s1 = hmlx.i(s);
        hmlx.g(arr_b);
        if(s1 != null) {
            if(s1.equals("none")) {
                return new String(arr_b, StandardCharsets.US_ASCII);
            }
            Charset.forName(s1);
            return new String(arr_b, Charset.forName(s1));
        }
        this.c.a("Not supported string encoding : " + s, new hmki("Not supported string encoding : " + s));
        throw new hmki("Not supported string encoding : " + s);
    }

    public final ByteBuffer f(ByteBuffer byteBuffer0, int v) {
        byte[] arr_b;
        if(byteBuffer0 == null) {
            hmli hmli0 = this.a.f.a().a();
            ByteBuffer byteBuffer1 = ByteBuffer.allocate(1);
            arr_b = ((ByteBuffer)this.b.b(hmli0, byteBuffer1)).array();
        }
        else {
            arr_b = byteBuffer0.array();
        }
        hmlx.g(arr_b);
        for(int v2 = 0; v2 < arr_b.length; ++v2) {
            arr_b[v2] = Byte.parseByte(String.format("%x", ((byte)arr_b[v2])));
        }
        for(int v1 = 0; v1 < arr_b.length; ++v1) {
            arr_b[v1] = Byte.parseByte(Byte.toString(arr_b[v1]), v);
        }
        hmlx.g(arr_b);
        return ByteBuffer.wrap(arr_b);
    }

    public final ByteBuffer g(String s, String s1) {
        if(s == null) {
            hmli hmli0 = this.a.f.a().a();
            s = (String)this.b.b(hmli0, "");
        }
        String s2 = hmlx.i(s1);
        if(s2 != null) {
            if(s2.equals("none")) {
                hmlx.g(s.getBytes(StandardCharsets.US_ASCII));
                return ByteBuffer.wrap(s.getBytes(StandardCharsets.US_ASCII));
            }
            hmlx.g(s.getBytes(Charset.forName(s2)));
            return ByteBuffer.wrap(s.getBytes(Charset.forName(s2)));
        }
        this.c.a("Not supported string encoding : " + s1, new hmki("Not supported string encoding : " + s1));
        throw new hmki("Not supported string encoding : " + s1);
    }

    private final hmli h(hmli hmli0) {
        return hmli0 == null ? this.a.f.a().a() : hmli0;
    }

    private static final String i(String s) {
        return s == null || s.isEmpty() ? hmke.e.toString() : s;
    }

    private static final String j(String s) {
        return s == null || s.isEmpty() ? "UTC" : s;
    }
}

