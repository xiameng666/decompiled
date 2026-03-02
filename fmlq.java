public final class fmlq {
    public fmjm a;
    public String b;
    private ByteString c;
    private int d;
    private int e;
    private String f;
    private byte g;

    public final fmlr a() {
        if(this.g == 3) {
            fmjm fmjm0 = this.a;
            if(fmjm0 != null) {
                ByteString hfsf0 = this.c;
                if(hfsf0 != null) {
                    String s = this.f;
                    if(s != null) {
                        return new fmlr(fmjm0, this.b, hfsf0, this.d, this.e, s);
                    }
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.a == null) {
            stringBuilder0.append(" mediaId");
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
            stringBuilder0.append(" imageDescription");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(int v) {
        this.e = v;
        this.g = (byte)(this.g | 2);
    }

    public final void c(String s) {
        if(s == null) {
            throw new NullPointerException("Null imageDescription");
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

