import dagger.internal.Factory;

public final class clrr implements Factory {
    @Override  // ibnf, ibne
    public final Object get() {
        bblp bblp0 = new bblp(0x7FFFFFFF, 9);
        foew foew0 = new foew();
        foew0.a = bblp0;
        return foew0.a();
    }
}

