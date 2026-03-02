@Deprecated
public final class ajan extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ajan a;
    private static volatile Parser b;

    static {
        ajan ajan0 = new ajan();
        ajan.a = ajan0;
        ProtoLiteMessage.L(ajan.class, ((ProtoLiteMessage)ajan0));
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
                    return new hfvw(((MessageLite)ajan.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new ajan();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ajan.a));
                }
                case 5: {
                    return ajan.a;
                }
                case 6: {
                    Object object1 = ajan.b;
                    if(object1 == null) {
                        Class class0 = ajan.class;
                        synchronized(class0) {
                            hfvs0 = ajan.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ajan.a));
                                ajan.b = hfvs0;
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

