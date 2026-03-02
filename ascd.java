public final class ascd extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ascd a;
    public hfvh b;
    private static volatile Parser c;

    static {
        ascd ascd0 = new ascd();
        ascd.a = ascd0;
        ProtoLiteMessage.L(ascd.class, ((ProtoLiteMessage)ascd0));
    }

    private ascd() {
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
                    return new hfvw(((MessageLite)ascd.a), "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", ascc.a});
                }
                case 3: {
                    return new ascd();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ascd.a));
                }
                case 5: {
                    return ascd.a;
                }
                case 6: {
                    Object object1 = ascd.c;
                    if(object1 == null) {
                        Class class0 = ascd.class;
                        synchronized(class0) {
                            hfvs0 = ascd.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ascd.a));
                                ascd.c = hfvs0;
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

