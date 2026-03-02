public final class ffca extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ffca a;
    public hfvh b;
    private static volatile Parser c;

    static {
        ffca ffca0 = new ffca();
        ffca.a = ffca0;
        ProtoLiteMessage.L(ffca.class, ((ProtoLiteMessage)ffca0));
    }

    private ffca() {
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
                    return new hfvw(((MessageLite)ffca.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", ffbz.a});
                }
                case 3: {
                    return new ffca();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ffca.a));
                }
                case 5: {
                    return ffca.a;
                }
                case 6: {
                    Object object1 = ffca.c;
                    if(object1 == null) {
                        Class class0 = ffca.class;
                        synchronized(class0) {
                            hfvs0 = ffca.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ffca.a));
                                ffca.c = hfvs0;
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

