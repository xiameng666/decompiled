public final class gkil extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gkil a;
    private static volatile Parser b;

    static {
        gkil gkil0 = new gkil();
        gkil.a = gkil0;
        ProtoLiteMessage.L(gkil.class, ((ProtoLiteMessage)gkil0));
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
                    return new hfvw(((MessageLite)gkil.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gkil();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gkil.a));
                }
                case 5: {
                    return gkil.a;
                }
                case 6: {
                    Object object1 = gkil.b;
                    if(object1 == null) {
                        Class class0 = gkil.class;
                        synchronized(class0) {
                            hfvs0 = gkil.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gkil.a));
                                gkil.b = hfvs0;
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

