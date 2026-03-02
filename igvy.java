public class igvy extends igvx {
    public byte[] e;

    public igvy(igvt igvt0) {
        this(igvt0, "IIN", 24);
    }

    public igvy(igvt igvt0, String s) {
        this(igvt0, s, 0x20);
    }

    public igvy(igvt igvt0, String s, int v) {
        super(igvt0, s, null);
        this.e = null;
        if(v / 8 <= 0) {
            throw new Exception("Cannot have 0 or less bytes in IPEBytes");
        }
        this.e = igvt0.h(v / 8);
        this.c = igvt0.c;
    }

    public igvy(igvt igvt0, String s, byte[] arr_b) {
        this(igvt0, s, 24);
    }

    @Override  // igvx
    public final Object b() {
        return this.e;
    }

    @Override  // igvx
    public String toString() {
        return igvq.c(this.e);
    }
}

