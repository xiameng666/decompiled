public final class sxf {
    public static sqy a(String s) {
        return new sqy(s, srg.f);
    }

    public static sqy b(String s) {
        return new sqy(s, srg.a(new byte[]{106, (byte)0x85}));
    }

    public static sqy c() {
        return new sqy("Memory quota exceeded", srg.k);
    }

    public static sqy d(String s) {
        return new sqy(s, srg.j);
    }

    public static sqy e(String s) {
        return new sqy(s, srg.i);
    }

    public static sqy f(String s) {
        return new sqy(s, srg.r);
    }

    public static sqy g(String s) {
        return new sqy(s, srg.s);
    }

    public static sqy h(String s) {
        return new sqy(s, srg.t);
    }

    public static sqy i(Byte byte0, Byte byte1) {
        if(byte0 != null && byte1 != null) {
            return new sqy("Invalid " + ("P1=" + str.a(byte0.byteValue()) + ", P2=" + str.a(byte1.byteValue())), srg.o);
        }
        if(byte0 != null) {
            return new sqy("Invalid " + ("P1=" + str.a(byte0.byteValue())), srg.o);
        }
        return byte1 == null ? new sqy("Invalid P1/P2", srg.o) : new sqy("Invalid " + ("P2=" + str.a(byte1.byteValue())), srg.o);
    }
}

