public final class foea {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public int h;
    private String i;
    private boolean j;
    private boolean k;
    private byte l;
    private int m;

    public final foec a() {
        if(this.l == 3) {
            String s = this.i;
            if(s != null) {
                int v = this.m;
                if(v != 0) {
                    int v1 = this.h;
                    if(v1 != 0) {
                        int v2 = this.g;
                        if(v2 != 0) {
                            return new foec(s, this.j, this.a, this.b, this.c, this.d, this.k, v, v1, this.e, this.f, v2);
                        }
                    }
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.i == null) {
            stringBuilder0.append(" accountName");
        }
        if((this.l & 1) == 0) {
            stringBuilder0.append(" isMetadataAvailable");
        }
        if((this.l & 2) == 0) {
            stringBuilder0.append(" isG1User");
        }
        if(this.m == 0) {
            stringBuilder0.append(" isDasherUser");
        }
        if(this.h == 0) {
            stringBuilder0.append(" isUnicornUser");
        }
        if(this.g == 0) {
            stringBuilder0.append(" ageRange");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(String s) {
        if(s == null) {
            throw new NullPointerException("Null accountName");
        }
        this.i = s;
    }

    public final void c(boolean z) {
        this.k = z;
        this.l = (byte)(this.l | 2);
    }

    public final void d(boolean z) {
        this.j = z;
        this.l = (byte)(this.l | 1);
    }

    public final void e(int v) {
        if(v == 0) {
            throw new NullPointerException("Null isDasherUser");
        }
        this.m = v;
    }
}

