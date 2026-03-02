public final class clba {
    public ckcq a;
    public String b;
    public String c;
    public MessageLite d;
    private boolean e;

    public clba() {
        throw null;
    }

    public clba(byte[] arr_b) {
        this.a = ckkp.a;
        this.b = "";
        this.c = "";
        this.e = false;
    }

    public final void a(String s, String s1) {
        this.b = this.b + "&" + s + "=" + s1;
    }

    public final void b(String s) {
        if(!this.b.isEmpty()) {
            throw new IllegalStateException("setCompileTimeConstantParameters can only be called when there aren\'t compile time constants set or added before.");
        }
        if(!s.isEmpty()) {
            if(s.startsWith("?")) {
                s = "&" + s.substring(1);
            }
            if(!s.startsWith("&")) {
                s = "&" + s;
            }
        }
        this.b = s;
    }

    public final void c(MessageLite hfvm0, ckcp ckcp0, cldd cldd0) {
        if(this.e) {
            throw new UnsupportedOperationException("Proto url parameters can be only set once.");
        }
        this.e = true;
        this.c = cldd0.a(hfvm0);
        this.d = hfvm0;
        this.a = ckcp0.a;
    }
}

