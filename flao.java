public final class flao {
    public hfuc a;
    public fgvt b;
    public ggtl c;
    private frii d;

    public final flap a() {
        frii frii0 = this.d;
        if(frii0 != null) {
            fgvt fgvt0 = this.b;
            if(fgvt0 != null) {
                ggtl ggtl0 = this.c;
                if(ggtl0 != null) {
                    return new flap(this.a, frii0, fgvt0, ggtl0);
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.d == null) {
            stringBuilder0.append(" pdsFactory");
        }
        if(this.b == null) {
            stringBuilder0.append(" clock");
        }
        if(this.c == null) {
            stringBuilder0.append(" logger");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(frii frii0) {
        if(frii0 == null) {
            throw new NullPointerException("Null pdsFactory");
        }
        this.d = frii0;
    }
}

