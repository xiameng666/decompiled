public final class gbko implements ibts {
    public final byte[] a;
    public final String b;
    public final String c;

    public gbko(byte[] arr_b, String s, String s1) {
        this.a = arr_b;
        this.b = s;
        this.c = s1;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        try(owg owg0 = ((oxi)object0).a("UPDATE actionTable SET actionResponse = ? WHERE sessionId = ? AND actionId = ?")) {
            owg0.e(1, this.a);
            owg0.h(2, this.b);
            owg0.h(3, this.c);
            owg0.k();
        }
        return ibom.a;
    }
}

