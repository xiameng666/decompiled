public final class hfjx extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hfjx a;
    private static volatile Parser b;
    private hfvh c;

    static {
        hfjx hfjx0 = new hfjx();
        hfjx.a = hfjx0;
        ProtoLiteMessage.L(hfjx.class, ((ProtoLiteMessage)hfjx0));
    }

    private hfjx() {
        this.c = hfvh.a;
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
                    return new hfvw(((MessageLite)hfjx.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", hfjw.a});
                }
                case 3: {
                    return new hfjx();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hfjx.a));
                }
                case 5: {
                    return hfjx.a;
                }
                case 6: {
                    Object object1 = hfjx.b;
                    if(object1 == null) {
                        Class class0 = hfjx.class;
                        synchronized(class0) {
                            hfvs0 = hfjx.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hfjx.a));
                                hfjx.b = hfvs0;
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

