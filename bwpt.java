public final class bwpt extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final bwpt a;
    private static volatile Parser b;

    static {
        bwpt bwpt0 = new bwpt();
        bwpt.a = bwpt0;
        ProtoLiteMessage.L(bwpt.class, ((ProtoLiteMessage)bwpt0));
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
                    return new hfvw(((MessageLite)bwpt.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new bwpt();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)bwpt.a));
                }
                case 5: {
                    return bwpt.a;
                }
                case 6: {
                    Object object1 = bwpt.b;
                    if(object1 == null) {
                        Class class0 = bwpt.class;
                        synchronized(class0) {
                            hfvs0 = bwpt.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)bwpt.a));
                                bwpt.b = hfvs0;
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

