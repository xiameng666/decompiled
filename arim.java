import j..util.Objects;

public final class arim {
    public boolean a;
    public final arin b;

    protected arim(arin arin0) {
        Objects.requireNonNull(arin0);
        this.b = arin0;
        super();
        this.a = false;
    }

    public final void a(int v, int v1, String s) {
        if(this.a) {
            arin.a.d("Listener.onError called after abortRequest", new Object[0]);
            return;
        }
        String s1 = bbqr.c(s);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ascm.a).v_newBuilder();
        ascl ascl0 = ascl.d;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ascm)hftp0.b_message).c = ascl0.g;
        ((ascm)hftp0.b_message).b |= 1;
        ascm ascm0 = (ascm)hftp0.N_build();
        ascj ascj0 = arin.k(v, v1, s1);
        this.b.h(ascm0, ascj0);
        ((arjh)this.b).u.b(false);
        ((arjh)this.b).n();
    }
}

