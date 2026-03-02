public final class foyx {
    public int a;
    public gfsx b;
    public byte c;
    public int d;
    private boolean e;

    public foyx() {
        throw null;
    }

    public foyx(byte[] arr_b) {
        this.b = gfqx.a;
    }

    public final foyy a() {
        if(this.c == 3) {
            int v = this.d;
            if(v != 0) {
                return new foyy(v, this.a, this.e, this.b);
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.d == 0) {
            stringBuilder0.append(" enablement");
        }
        if((this.c & 1) == 0) {
            stringBuilder0.append(" batchSize");
        }
        if((this.c & 2) == 0) {
            stringBuilder0.append(" enableUrlAutoSanitization");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(boolean z) {
        this.e = z;
        this.c = (byte)(this.c | 2);
    }

    public final void c(boolean z) {
        this.d = z ? 3 : 2;
    }
}

