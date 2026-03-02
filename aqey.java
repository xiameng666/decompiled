public final class aqey extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final aqey a;
    private static volatile Parser b;

    static {
        aqey aqey0 = new aqey();
        aqey.a = aqey0;
        ProtoLiteMessage.L(aqey.class, ((ProtoLiteMessage)aqey0));
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
                    return new hfvw(((MessageLite)aqey.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new aqey();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)aqey.a));
                }
                case 5: {
                    return aqey.a;
                }
                case 6: {
                    Object object1 = aqey.b;
                    if(object1 == null) {
                        Class class0 = aqey.class;
                        synchronized(class0) {
                            hfvs0 = aqey.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)aqey.a));
                                aqey.b = hfvs0;
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

