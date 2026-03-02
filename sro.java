public final class sro {
    public final srk a;
    public final srn b;
    private final byte[] c;

    public sro(srk srk0, srn srn0, byte[] arr_b) {
        this.a = srk0;
        this.b = srn0;
        this.c = stm.a(arr_b);
    }

    public final stl a() {
        byte[] arr_b = stm.a(this.c);
        return new stl(this.a, this.b.a, this.b.b, this.b.c, this.b.d, arr_b);
    }
}

