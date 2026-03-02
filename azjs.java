public final class azjs {
    public azks a;
    public azki b;
    private long c;
    private int d;
    private long e;
    private azii f;
    private byte g;

    public azjs() {
    }

    public azjs(azjt azjt0) {
        this.c = azjt0.a;
        this.a = azjt0.b;
        this.d = azjt0.c;
        this.e = azjt0.d;
        this.b = azjt0.e;
        this.f = azjt0.f;
        this.g = 7;
    }

    public final azjt a() {
        if(this.g == 7) {
            azks azks0 = this.a;
            if(azks0 != null) {
                azki azki0 = this.b;
                if(azki0 != null) {
                    azii azii0 = this.f;
                    if(azii0 != null) {
                        return new azjt(this.c, azks0, this.d, this.e, azki0, azii0);
                    }
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if((this.g & 1) == 0) {
            stringBuilder0.append(" id");
        }
        if(this.a == null) {
            stringBuilder0.append(" reportKey");
        }
        if((this.g & 2) == 0) {
            stringBuilder0.append(" dayIndex");
        }
        if((this.g & 4) == 0) {
            stringBuilder0.append(" systemProfileHash");
        }
        if(this.b == null) {
            stringBuilder0.append(" eventVector");
        }
        if(this.f == null) {
            stringBuilder0.append(" aggregateValue");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(azii azii0) {
        if(azii0 == null) {
            throw new NullPointerException("Null aggregateValue");
        }
        this.f = azii0;
    }

    public final void c(int v) {
        this.d = v;
        this.g = (byte)(this.g | 2);
    }

    public final void d(long v) {
        this.c = v;
        this.g = (byte)(this.g | 1);
    }

    public final void e(long v) {
        this.e = v;
        this.g = (byte)(this.g | 4);
    }
}

