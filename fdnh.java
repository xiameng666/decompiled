public final class fdnh {
    public String a;
    public int b;
    public int c;
    public int d;
    public int e;
    private String f;
    private int g;
    private byte h;

    public final fdni a() {
        if(this.h == 1) {
            String s = this.f;
            if(s != null) {
                int v = this.b;
                if(v != 0) {
                    int v1 = this.c;
                    if(v1 != 0) {
                        int v2 = this.e;
                        if(v2 != 0) {
                            return new fdni(s, v, v1, this.g, this.a, this.d, v2);
                        }
                    }
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.f == null) {
            stringBuilder0.append(" packageName");
        }
        if(this.b == 0) {
            stringBuilder0.append(" transport");
        }
        if(this.c == 0) {
            stringBuilder0.append(" type");
        }
        if(this.h == 0) {
            stringBuilder0.append(" numberOfBytes");
        }
        if(this.e == 0) {
            stringBuilder0.append(" messageDirection");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(int v) {
        this.g = v;
        this.h = 1;
    }

    public final void c(String s) {
        if(s == null) {
            throw new NullPointerException("Null packageName");
        }
        this.f = s;
    }
}

