public final class hnxu extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hnxu a;
    private static volatile Parser b;

    static {
        hnxu hnxu0 = new hnxu();
        hnxu.a = hnxu0;
        ProtoLiteMessage.L(hnxu.class, ((ProtoLiteMessage)hnxu0));
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
                    return new hfvw(((MessageLite)hnxu.a), "\u0000\u0000", null);
                }
                case 3: {
                    return new hnxu();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hnxu.a));
                }
                case 5: {
                    return hnxu.a;
                }
                case 6: {
                    Object object1 = hnxu.b;
                    if(object1 == null) {
                        Class class0 = hnxu.class;
                        synchronized(class0) {
                            hfvs0 = hnxu.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hnxu.a));
                                hnxu.b = hfvs0;
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

