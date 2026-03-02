public abstract class hfts extends ProtoLiteMessage implements hftt {
    public hfth s;

    public hfts() {
        this.s = hfth.a;
    }

    final hfth e() {
        hfth hfth0 = this.s;
        if(hfth0.c) {
            this.s = hfth0.c();
        }
        return this.s;
    }

    public final void f(hfta hfta0) {
        ProtoLiteMessage hftv0 = (ProtoLiteMessage)((ProtoLiteMessage)this).jf(6, null);
        if(hfta0.a == hftv0) {
            return;
        }
        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }

    @Override  // hftt
    public final Object k(hfta hfta0) {
        throw null;
    }

    @Override  // hftt
    public final boolean l(hfta hfta0) {
        throw null;
    }
}

