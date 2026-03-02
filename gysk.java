public final class gysk extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gysk a;
    private static volatile Parser b;

    static {
        gysk gysk0 = new gysk();
        gysk.a = gysk0;
        ProtoLiteMessage.L(gysk.class, ((ProtoLiteMessage)gysk0));
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
                    return new hfvw(((MessageLite)gysk.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gysk();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gysk.a));
                }
                case 5: {
                    return gysk.a;
                }
                case 6: {
                    Object object1 = gysk.b;
                    if(object1 == null) {
                        Class class0 = gysk.class;
                        synchronized(class0) {
                            hfvs0 = gysk.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gysk.a));
                                gysk.b = hfvs0;
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

