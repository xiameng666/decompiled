public final class gypm extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gypm a;
    private static volatile Parser b;

    static {
        gypm gypm0 = new gypm();
        gypm.a = gypm0;
        ProtoLiteMessage.L(gypm.class, ((ProtoLiteMessage)gypm0));
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
                    return new hfvw(((MessageLite)gypm.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gypm();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gypm.a));
                }
                case 5: {
                    return gypm.a;
                }
                case 6: {
                    Object object1 = gypm.b;
                    if(object1 == null) {
                        Class class0 = gypm.class;
                        synchronized(class0) {
                            hfvs0 = gypm.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gypm.a));
                                gypm.b = hfvs0;
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

