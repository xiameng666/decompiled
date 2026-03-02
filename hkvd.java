public final class hkvd extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hfug a;
    public static final hfug b;
    public static final hkvd c;
    public int d;
    public hfuf e;
    public hfuf f;
    private static volatile Parser g;

    static {
        hkvd.a = new hkux();
        hkvd.b = new hkuy();
        hkvd hkvd0 = new hkvd();
        hkvd.c = hkvd0;
        ProtoLiteMessage.L(hkvd.class, ((ProtoLiteMessage)hkvd0));
    }

    private hkvd() {
        this.e = hfty.a;
        this.f = hfty.a;
    }

    @Override  // ProtoLiteMessage
    public final Object jf(int v, Object object0) {
        Parser hfvs0;
        if(v != 0) {
            switch(v - 1) {
                case 0: {
                    return (byte)1;
                }
                case 2: {
                    return new hfvw(((MessageLite)hkvd.c), "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\f\u0002,\u0003,", new Object[]{"d", "e", "f"});
                }
                case 3: {
                    return new hkvd();
                }
                case 4: {
                    return new hkvb();
                }
                case 5: {
                    return hkvd.c;
                }
                case 6: {
                    Object object1 = hkvd.g;
                    if(object1 == null) {
                        Class class0 = hkvd.class;
                        synchronized(class0) {
                            hfvs0 = hkvd.g;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkvd.c));
                                hkvd.g = hfvs0;
                            }
                        }
                        return hfvs0;
                    }
                    return object1;
                }
                default: {
                    throw null;
                }
            }
        }
        throw null;
    }
}

