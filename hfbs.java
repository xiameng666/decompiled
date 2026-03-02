public final class hfbs extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hfbs a;
    public hfuo b;
    private static volatile Parser c;

    static {
        hfbs hfbs0 = new hfbs();
        hfbs.a = hfbs0;
        ProtoLiteMessage.L(hfbs.class, ((ProtoLiteMessage)hfbs0));
    }

    private hfbs() {
        this.b = hfvv.a;
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
                    return new hfvw(((MessageLite)hfbs.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", hfbr.class});
                }
                case 3: {
                    return new hfbs();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hfbs.a));
                }
                case 5: {
                    return hfbs.a;
                }
                case 6: {
                    Object object1 = hfbs.c;
                    if(object1 == null) {
                        Class class0 = hfbs.class;
                        synchronized(class0) {
                            hfvs0 = hfbs.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hfbs.a));
                                hfbs.c = hfvs0;
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

