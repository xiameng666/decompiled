import java.util.Map.Entry;

public final class claw {
    public ckcq a;
    public ckdh b;
    public gghp c;
    public gghp d;
    private boolean e;

    public claw() {
        throw null;
    }

    public claw(byte[] arr_b) {
        this.a = ckkp.a;
        this.b = ckdh.a;
        this.e = false;
        this.c = new gfza();
        this.d = new gfza();
    }

    public final void a(String s, String s1) {
        this.c.v(s, s1);
    }

    public final void b(MessageLite hfvm0, ckcp ckcp0, clcr clcr0) {
        if(this.e) {
            throw new UnsupportedOperationException("Proto headers can be only set once.");
        }
        this.e = true;
        this.d = clcr0.a(hfvm0);
        this.a = ckcp0.a;
        long v = 0L;
        for(Object object0: this.d.w()) {
            v += (long)(((String)((Map.Entry)object0).getKey()).length() + ((String)((Map.Entry)object0).getValue()).length());
        }
        this.b = ckdh.b("", v, v, false, gged_interceptors.l(hfvm0));
    }
}

