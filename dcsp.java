public final class dcsp implements ibth {
    public final dcsr a;

    public dcsp(dcsr dcsr0) {
        this.a = dcsr0;
    }

    @Override  // ibth
    public final Object a() {
        gmms gmms0 = (gmms)gnby.a(new gnoe());
        ibuq.e(gmms0, "aes256GcmHkdf1MBTemplate(...)");
        return dcsq.c(dcsq.a(this.a.a(gmms0), "fileEncryption"));
    }
}

