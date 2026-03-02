public final class gqqf extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gqqf a;
    private static volatile Parser b;

    static {
        gqqf gqqf0 = new gqqf();
        gqqf.a = gqqf0;
        ProtoLiteMessage.L(gqqf.class, ((ProtoLiteMessage)gqqf0));
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
                    return new hfvw(((MessageLite)gqqf.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gqqf();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gqqf.a));
                }
                case 5: {
                    return gqqf.a;
                }
                case 6: {
                    Object object1 = gqqf.b;
                    if(object1 == null) {
                        Class class0 = gqqf.class;
                        synchronized(class0) {
                            hfvs0 = gqqf.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gqqf.a));
                                gqqf.b = hfvs0;
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

