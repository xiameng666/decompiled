public final class hfkb extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hfug a;
    public static final hfkb b;
    public int c;
    public int d;
    public hfuf e;
    private static volatile Parser f;

    static {
        hfkb.a = new hfjy();
        hfkb hfkb0 = new hfkb();
        hfkb.b = hfkb0;
        ProtoLiteMessage.L(hfkb.class, ((ProtoLiteMessage)hfkb0));
    }

    private hfkb() {
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
                    return new hfvw(((MessageLite)hfkb.b), "\u0000\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0001\u0000\u0002\f\u0003,\u0004\f", new Object[]{"d", "e", "c"});
                }
                case 3: {
                    return new hfkb();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hfkb.b));
                }
                case 5: {
                    return hfkb.b;
                }
                case 6: {
                    Object object1 = hfkb.f;
                    if(object1 == null) {
                        Class class0 = hfkb.class;
                        synchronized(class0) {
                            hfvs0 = hfkb.f;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hfkb.b));
                                hfkb.f = hfvs0;
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

