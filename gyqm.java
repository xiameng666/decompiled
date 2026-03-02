public final class gyqm extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gyqm a;
    private static volatile Parser b;

    static {
        gyqm gyqm0 = new gyqm();
        gyqm.a = gyqm0;
        ProtoLiteMessage.L(gyqm.class, ((ProtoLiteMessage)gyqm0));
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
                    return new hfvw(((MessageLite)gyqm.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gyqm();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gyqm.a));
                }
                case 5: {
                    return gyqm.a;
                }
                case 6: {
                    Object object1 = gyqm.b;
                    if(object1 == null) {
                        Class class0 = gyqm.class;
                        synchronized(class0) {
                            hfvs0 = gyqm.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gyqm.a));
                                gyqm.b = hfvs0;
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

