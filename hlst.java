public final class hlst extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hlst a;
    private static volatile Parser b;

    static {
        hlst hlst0 = new hlst();
        hlst.a = hlst0;
        ProtoLiteMessage.L(hlst.class, ((ProtoLiteMessage)hlst0));
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
                    return new hfvw(((MessageLite)hlst.a), "\u0001\u0000", null);
                }
                case 3: {
                    return new hlst();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hlst.a));
                }
                case 5: {
                    return hlst.a;
                }
                case 6: {
                    Object object1 = hlst.b;
                    if(object1 == null) {
                        Class class0 = hlst.class;
                        synchronized(class0) {
                            hfvs0 = hlst.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hlst.a));
                                hlst.b = hfvs0;
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

