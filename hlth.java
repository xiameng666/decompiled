public final class hlth extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hlth a;
    private static volatile Parser b;

    static {
        hlth hlth0 = new hlth();
        hlth.a = hlth0;
        ProtoLiteMessage.L(hlth.class, ((ProtoLiteMessage)hlth0));
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
                    return new hfvw(((MessageLite)hlth.a), "\u0001\u0000", null);
                }
                case 3: {
                    return new hlth();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hlth.a));
                }
                case 5: {
                    return hlth.a;
                }
                case 6: {
                    Object object1 = hlth.b;
                    if(object1 == null) {
                        Class class0 = hlth.class;
                        synchronized(class0) {
                            hfvs0 = hlth.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hlth.a));
                                hlth.b = hfvs0;
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

