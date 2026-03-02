public final class hdbf extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hdbf a;
    private static volatile Parser b;
    private hfvh c;

    static {
        hdbf hdbf0 = new hdbf();
        hdbf.a = hdbf0;
        ProtoLiteMessage.L(hdbf.class, ((ProtoLiteMessage)hdbf0));
    }

    private hdbf() {
        this.c = hfvh.a;
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
                    return new hfvw(((MessageLite)hdbf.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", hdbe.a});
                }
                case 3: {
                    return new hdbf();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hdbf.a));
                }
                case 5: {
                    return hdbf.a;
                }
                case 6: {
                    Object object1 = hdbf.b;
                    if(object1 == null) {
                        Class class0 = hdbf.class;
                        synchronized(class0) {
                            hfvs0 = hdbf.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hdbf.a));
                                hdbf.b = hfvs0;
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

