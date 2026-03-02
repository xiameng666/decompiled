public final class rsn extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final rsn a;
    public hfvh b;
    private static volatile Parser c;

    static {
        rsn rsn0 = new rsn();
        rsn.a = rsn0;
        ProtoLiteMessage.L(rsn.class, ((ProtoLiteMessage)rsn0));
    }

    private rsn() {
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
                    return new hfvw(((MessageLite)rsn.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", rsm.a});
                }
                case 3: {
                    return new rsn();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)rsn.a));
                }
                case 5: {
                    return rsn.a;
                }
                case 6: {
                    Object object1 = rsn.c;
                    if(object1 == null) {
                        Class class0 = rsn.class;
                        synchronized(class0) {
                            hfvs0 = rsn.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)rsn.a));
                                rsn.c = hfvs0;
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

