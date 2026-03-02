public final class aqdn extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final aqdn a;
    public hfvh b;
    private static volatile Parser c;

    static {
        aqdn aqdn0 = new aqdn();
        aqdn.a = aqdn0;
        ProtoLiteMessage.L(aqdn.class, ((ProtoLiteMessage)aqdn0));
    }

    private aqdn() {
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
                    return new hfvw(((MessageLite)aqdn.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", aqdm.a});
                }
                case 3: {
                    return new aqdn();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)aqdn.a));
                }
                case 5: {
                    return aqdn.a;
                }
                case 6: {
                    Object object1 = aqdn.c;
                    if(object1 == null) {
                        Class class0 = aqdn.class;
                        synchronized(class0) {
                            hfvs0 = aqdn.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)aqdn.a));
                                aqdn.c = hfvs0;
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

