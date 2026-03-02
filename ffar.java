public final class ffar extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ffar a;
    public hfvh b;
    private static volatile Parser c;

    static {
        ffar ffar0 = new ffar();
        ffar.a = ffar0;
        ProtoLiteMessage.L(ffar.class, ((ProtoLiteMessage)ffar0));
    }

    private ffar() {
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
                    return new hfvw(((MessageLite)ffar.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", ffaq.a});
                }
                case 3: {
                    return new ffar();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ffar.a));
                }
                case 5: {
                    return ffar.a;
                }
                case 6: {
                    Object object1 = ffar.c;
                    if(object1 == null) {
                        Class class0 = ffar.class;
                        synchronized(class0) {
                            hfvs0 = ffar.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ffar.a));
                                ffar.c = hfvs0;
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

