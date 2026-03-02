public final class goxx implements goxb {
    public String a;
    public String b;
    public String c;
    public String d;
    public long e;

    @Override  // goxb
    public final Parser a() {
        return (Parser)((ProtoLiteMessage)gdho.a).jf(7, null);
    }

    @Override  // goxb
    public final void b(MessageLite hfvm0) {
        if(!(hfvm0 instanceof gdho)) {
            throw new IllegalArgumentException("The passed proto must be an instance of FinalizeMfaSignInResponse.");
        }
        this.a = bbqr.b(((gdho)hfvm0).d);
        this.b = bbqr.b(((gdho)hfvm0).e);
        this.d = bbqr.b((((gdho)hfvm0).b == 3 ? ((hgau)((gdho)hfvm0).c) : hgau.a).d);
        this.c = bbqr.b((((gdho)hfvm0).b == 3 ? ((hgau)((gdho)hfvm0).c) : hgau.a).b);
        hgau hgau0 = ((gdho)hfvm0).b == 3 ? ((hgau)((gdho)hfvm0).c) : hgau.a;
        this.e = (hgau0.c == null ? hfwn.a : hgau0.c).b;
    }
}

