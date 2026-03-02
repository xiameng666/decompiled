public final class fkrm {
    public String a;
    public int b;
    private long c;
    private fkjt d;
    private byte e;

    public final fkrn a() {
        if(this.e == 1 && this.a != null && this.b != 0 && this.d != null) {
            return new fkrn(this.c, this.a, this.b, this.d);
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.e == 0) {
            stringBuilder0.append(" buildId");
        }
        if(this.a == null) {
            stringBuilder0.append(" variantId");
        }
        if(this.b == 0) {
            stringBuilder0.append(" lookupReason");
        }
        if(this.d == null) {
            stringBuilder0.append(" offlineLookupStrategy");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(long v) {
        this.c = v;
        this.e = 1;
    }

    public final void c(fkjt fkjt0) {
        if(fkjt0 == null) {
            throw new NullPointerException("Null offlineLookupStrategy");
        }
        this.d = fkjt0;
    }
}

