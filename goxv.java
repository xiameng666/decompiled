public final class goxv implements goxb {
    public String a;
    public String b;
    public String c;
    public String d;
    public long e;

    @Override  // goxb
    public final Parser a() {
        return (Parser)((ProtoLiteMessage)gdhm.a).jf(7, null);
    }

    @Override  // goxb
    public final void b(MessageLite hfvm0) {
        if(!(hfvm0 instanceof gdhm)) {
            throw new IllegalArgumentException("The passed proto must be an instance of FinalizeMfaEnrollmentResponse.");
        }
        this.a = bbqr.b(((gdhm)hfvm0).d);
        this.b = bbqr.b(((gdhm)hfvm0).e);
        this.d = bbqr.b((((gdhm)hfvm0).b == 3 ? ((hgau)((gdhm)hfvm0).c) : hgau.a).d);
        this.c = bbqr.b((((gdhm)hfvm0).b == 3 ? ((hgau)((gdhm)hfvm0).c) : hgau.a).b);
        hgau hgau0 = ((gdhm)hfvm0).b == 3 ? ((hgau)((gdhm)hfvm0).c) : hgau.a;
        this.e = (hgau0.c == null ? hfwn.a : hgau0.c).b;
    }
}

