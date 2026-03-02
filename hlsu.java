public final class hlsu extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hlsu a;
    private static volatile Parser b;

    static {
        hlsu hlsu0 = new hlsu();
        hlsu.a = hlsu0;
        ProtoLiteMessage.L(hlsu.class, ((ProtoLiteMessage)hlsu0));
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
                    return new hfvw(((MessageLite)hlsu.a), "\u0001\u0000", null);
                }
                case 3: {
                    return new hlsu();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hlsu.a));
                }
                case 5: {
                    return hlsu.a;
                }
                case 6: {
                    Object object1 = hlsu.b;
                    if(object1 == null) {
                        Class class0 = hlsu.class;
                        synchronized(class0) {
                            hfvs0 = hlsu.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hlsu.a));
                                hlsu.b = hfvs0;
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

