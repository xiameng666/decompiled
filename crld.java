import j..util.Objects;

final class crld implements Runnable {
    final String a;
    final String b;
    final String c;
    final long d;
    final crih e;

    public crld(crih crih0, String s, String s1, String s2, long v) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = v;
        Objects.requireNonNull(crih0);
        this.e = crih0;
        super();
    }

    @Override
    public final void run() {
        String s = this.a;
        if(s == null) {
            this.e.a.aa(this.b, null);
            return;
        }
        crns crns0 = new crns(this.c, s, this.d);
        this.e.a.aa(this.b, crns0);
    }
}

