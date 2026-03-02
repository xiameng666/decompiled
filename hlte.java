public final class hlte extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hlte a;
    private static volatile Parser b;

    static {
        hlte hlte0 = new hlte();
        hlte.a = hlte0;
        ProtoLiteMessage.L(hlte.class, ((ProtoLiteMessage)hlte0));
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
                    return new hfvw(((MessageLite)hlte.a), "\u0001\u0000", null);
                }
                case 3: {
                    return new hlte();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hlte.a));
                }
                case 5: {
                    return hlte.a;
                }
                case 6: {
                    Object object1 = hlte.b;
                    if(object1 == null) {
                        Class class0 = hlte.class;
                        synchronized(class0) {
                            hfvs0 = hlte.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hlte.a));
                                hlte.b = hfvs0;
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

