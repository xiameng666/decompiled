public final class gkia extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gkia a;
    private static volatile Parser b;

    static {
        gkia gkia0 = new gkia();
        gkia.a = gkia0;
        ProtoLiteMessage.L(gkia.class, ((ProtoLiteMessage)gkia0));
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
                    return new hfvw(((MessageLite)gkia.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gkia();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gkia.a));
                }
                case 5: {
                    return gkia.a;
                }
                case 6: {
                    Object object1 = gkia.b;
                    if(object1 == null) {
                        Class class0 = gkia.class;
                        synchronized(class0) {
                            hfvs0 = gkia.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gkia.a));
                                gkia.b = hfvs0;
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

