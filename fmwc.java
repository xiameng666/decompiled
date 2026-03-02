public final class fmwc {
    public gfsx a;
    public fmeo b;
    public int c;
    public boolean d;
    public byte e;
    private boolean f;

    public fmwc() {
        throw null;
    }

    public fmwc(fmwd fmwd0) {
        this.a = gfqx.a;
        this.a = fmwd0.a;
        this.b = fmwd0.b;
        this.c = fmwd0.c;
        this.d = fmwd0.d;
        this.f = fmwd0.e;
        this.e = 7;
    }

    public fmwc(byte[] arr_b) {
        this.a = gfqx.a;
    }

    public final fmwd a() {
        if(this.e == 7) {
            fmeo fmeo0 = this.b;
            if(fmeo0 != null) {
                return new fmwd(this.a, fmeo0, this.c, this.d, this.f);
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.b == null) {
            stringBuilder0.append(" senderProfile");
        }
        if((this.e & 1) == 0) {
            stringBuilder0.append(" threadPosition");
        }
        if((this.e & 2) == 0) {
            stringBuilder0.append(" hasTombstone");
        }
        if((this.e & 4) == 0) {
            stringBuilder0.append(" bottomLabelVisible");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(boolean z) {
        this.f = z;
        this.e = (byte)(this.e | 4);
    }
}

