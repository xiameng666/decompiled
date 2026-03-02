public final class hcjo extends hfts implements hftt {
    public static final hcjo a;
    public int b;
    public Object c;
    private static volatile Parser d;
    private byte e;

    static {
        hcjo hcjo0 = new hcjo();
        hcjo.a = hcjo0;
        ProtoLiteMessage.L(hcjo.class, ((ProtoLiteMessage)hcjo0));
    }

    private hcjo() {
        this.b = 0;
        this.e = 2;
    }

    @Override  // ProtoLiteMessage
    public final Object jf(int v, Object object0) {
        Parser hfvs0;
        if(v != 0) {
            switch(v - 1) {
                case 0: {
                    return (byte)this.e;
                }
                case 2: {
                    return new hfvw(((MessageLite)hcjo.a), "\u0004\u0003\u0001\u0000\u0001\u0005\u0003\u0000\u0000\u0000\u0001=\u0000\u0003;\u0000\u0005;\u0000", new Object[]{"c", "b"});
                }
                case 3: {
                    return new hcjo();
                }
                case 4: {
                    return new hftr(hcjo.a);
                }
                case 5: {
                    return hcjo.a;
                }
                case 6: {
                    Object object1 = hcjo.d;
                    if(object1 == null) {
                        Class class0 = hcjo.class;
                        synchronized(class0) {
                            hfvs0 = hcjo.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hcjo.a));
                                hcjo.d = hfvs0;
                            }
                        }
                        return hfvs0;
                    }
                    return object1;
                }
                default: {
                    this.e = object0 == null ? 0 : 1;
                    return null;
                }
            }
        }
        throw null;
    }
}

