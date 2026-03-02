public final class fqgs implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        boolean z = 1 == (((ByteString)object0).a(0) & 1);
        int v = ((ByteString)object0).a(1) & 0xFF;
        int v1 = ((ByteString)object0).a(2) & 0xFF | v << 8;
        if(v1 == 0xFFFF) {
            fqoa fqoa0 = new fqoa(null);
            fqoa0.b(z);
            return fqoa0.a();
        }
        fqoa fqoa1 = new fqoa(null);
        fqoa1.b(z);
        fqoa1.c(v1 * 100);
        return fqoa1.a();
    }
}

