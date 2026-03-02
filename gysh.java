public final class gysh extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gysh a;
    private static volatile Parser b;

    static {
        gysh gysh0 = new gysh();
        gysh.a = gysh0;
        ProtoLiteMessage.L(gysh.class, ((ProtoLiteMessage)gysh0));
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
                    return new hfvw(((MessageLite)gysh.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gysh();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gysh.a));
                }
                case 5: {
                    return gysh.a;
                }
                case 6: {
                    Object object1 = gysh.b;
                    if(object1 == null) {
                        Class class0 = gysh.class;
                        synchronized(class0) {
                            hfvs0 = gysh.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gysh.a));
                                gysh.b = hfvs0;
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

