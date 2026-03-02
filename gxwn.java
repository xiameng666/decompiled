public final class gxwn {
    private cxqw a;
    private ByteString b;
    private ByteString c;
    private String d;
    private cxkh e;

    public final gxwo a() {
        cxqw cxqw0 = this.a;
        if(cxqw0 != null) {
            ByteString hfsf0 = this.b;
            if(hfsf0 != null) {
                ByteString hfsf1 = this.c;
                if(hfsf1 != null) {
                    String s = this.d;
                    if(s != null) {
                        cxkh cxkh0 = this.e;
                        if(cxkh0 != null) {
                            return new gxwo(cxqw0, hfsf0, hfsf1, s, cxkh0);
                        }
                    }
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.a == null) {
            stringBuilder0.append(" storedDiscoveryItem");
        }
        if(this.b == null) {
            stringBuilder0.append(" accountKey");
        }
        if(this.c == null) {
            stringBuilder0.append(" sha256AccountKeyPublicAddress");
        }
        if(this.d == null) {
            stringBuilder0.append(" bleAddress");
        }
        if(this.e == null) {
            stringBuilder0.append(" footprintsGroupInfo");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(ByteString hfsf0) {
        if(hfsf0 == null) {
            throw new NullPointerException("Null accountKey");
        }
        this.b = hfsf0;
    }

    public final void c(String s) {
        if(s == null) {
            throw new NullPointerException("Null bleAddress");
        }
        this.d = s;
    }

    public final void d(cxkh cxkh0) {
        if(cxkh0 == null) {
            throw new NullPointerException("Null footprintsGroupInfo");
        }
        this.e = cxkh0;
    }

    public final void e(ByteString hfsf0) {
        if(hfsf0 == null) {
            throw new NullPointerException("Null sha256AccountKeyPublicAddress");
        }
        this.c = hfsf0;
    }

    public final void f(cxqw cxqw0) {
        if(cxqw0 == null) {
            throw new NullPointerException("Null storedDiscoveryItem");
        }
        this.a = cxqw0;
    }
}

