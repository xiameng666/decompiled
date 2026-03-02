@Deprecated
public final class gyqb extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gyqb a;
    private static volatile Parser b;

    static {
        gyqb gyqb0 = new gyqb();
        gyqb.a = gyqb0;
        ProtoLiteMessage.L(gyqb.class, ((ProtoLiteMessage)gyqb0));
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
                    return new hfvw(((MessageLite)gyqb.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gyqb();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gyqb.a));
                }
                case 5: {
                    return gyqb.a;
                }
                case 6: {
                    Object object1 = gyqb.b;
                    if(object1 == null) {
                        Class class0 = gyqb.class;
                        synchronized(class0) {
                            hfvs0 = gyqb.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gyqb.a));
                                gyqb.b = hfvs0;
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

