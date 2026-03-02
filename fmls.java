public final class fmls {
    public fmlw a;
    public String b;
    private ByteString c;
    private int d;
    private int e;
    private String f;
    private byte g;

    public final fmlt a() {
        if(this.g == 3 && this.a != null && this.c != null && this.f != null) {
            return new fmlt(this.a, this.b, this.c, this.d, this.e, this.f);
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.a == null) {
            stringBuilder0.append(" mediaSource");
        }
        if(this.c == null) {
            stringBuilder0.append(" thumbnail");
        }
        if((this.g & 1) == 0) {
            stringBuilder0.append(" width");
        }
        if((this.g & 2) == 0) {
            stringBuilder0.append(" height");
        }
        if(this.f == null) {
            stringBuilder0.append(" mediaDescription");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(int v) {
        this.e = v;
        this.g = (byte)(this.g | 2);
    }

    public final void c(String s) {
        if(s == null) {
            throw new NullPointerException("Null mediaDescription");
        }
        this.f = s;
    }

    public final void d(int v) {
        this.d = v;
        this.g = (byte)(this.g | 1);
    }

    public final void e(byte[] arr_b) {
        this.c = ByteString.copyFrom(arr_b);
    }
}

