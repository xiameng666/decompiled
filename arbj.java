public final class arbj extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final arbj a;
    private static volatile Parser b;

    static {
        arbj arbj0 = new arbj();
        arbj.a = arbj0;
        ProtoLiteMessage.L(arbj.class, ((ProtoLiteMessage)arbj0));
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
                    return new hfvw(((MessageLite)arbj.a), "\u0000\u0000", null);
                }
                case 3: {
                    return new arbj();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)arbj.a));
                }
                case 5: {
                    return arbj.a;
                }
                case 6: {
                    Object object1 = arbj.b;
                    if(object1 == null) {
                        Class class0 = arbj.class;
                        synchronized(class0) {
                            hfvs0 = arbj.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)arbj.a));
                                arbj.b = hfvs0;
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

