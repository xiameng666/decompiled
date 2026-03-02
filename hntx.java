public final class hntx extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hntx a;
    public ByteString b;
    public boolean c;
    public boolean d;
    public hfuf e;
    private static volatile Parser f;

    static {
        hntx hntx0 = new hntx();
        hntx.a = hntx0;
        ProtoLiteMessage.L(hntx.class, ((ProtoLiteMessage)hntx0));
    }

    private hntx() {
        this.b = ByteString.b;
        this.e = hfty.a;
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
                    return new hfvw(((MessageLite)hntx.a), "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\n\u0002\u0007\u0003\u0007\u0004,", new Object[]{"b", "c", "d", "e"});
                }
                case 3: {
                    return new hntx();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hntx.a));
                }
                case 5: {
                    return hntx.a;
                }
                case 6: {
                    Object object1 = hntx.f;
                    if(object1 == null) {
                        Class class0 = hntx.class;
                        synchronized(class0) {
                            hfvs0 = hntx.f;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hntx.a));
                                hntx.f = hfvs0;
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

