public final class hnsf extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hnsf a;
    public hfvh b;
    private static volatile Parser c;

    static {
        hnsf hnsf0 = new hnsf();
        hnsf.a = hnsf0;
        ProtoLiteMessage.L(hnsf.class, ((ProtoLiteMessage)hnsf0));
    }

    private hnsf() {
        this.b = hfvh.a;
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
                    return new hfvw(((MessageLite)hnsf.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", hnse.a});
                }
                case 3: {
                    return new hnsf();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hnsf.a));
                }
                case 5: {
                    return hnsf.a;
                }
                case 6: {
                    Object object1 = hnsf.c;
                    if(object1 == null) {
                        Class class0 = hnsf.class;
                        synchronized(class0) {
                            hfvs0 = hnsf.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hnsf.a));
                                hnsf.c = hfvs0;
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

