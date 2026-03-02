public final class bnpg implements gftc {
    public final ByteString a;

    public bnpg(ByteString hfsf0) {
        this.a = hfsf0;
    }

    @Override  // gftc
    public final boolean a(Object object0) {
        fqzw fqzw0 = ((fqxl)object0).d;
        if(fqzw0 == null) {
            fqzw0 = fqzw.a;
        }
        return fqzw0.d.equals(this.a);
    }
}

