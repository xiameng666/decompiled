public final class hlta extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hlta a;
    private static volatile Parser b;

    static {
        hlta hlta0 = new hlta();
        hlta.a = hlta0;
        ProtoLiteMessage.L(hlta.class, ((ProtoLiteMessage)hlta0));
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
                    return new hfvw(((MessageLite)hlta.a), "\u0001\u0000", null);
                }
                case 3: {
                    return new hlta();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hlta.a));
                }
                case 5: {
                    return hlta.a;
                }
                case 6: {
                    Object object1 = hlta.b;
                    if(object1 == null) {
                        Class class0 = hlta.class;
                        synchronized(class0) {
                            hfvs0 = hlta.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hlta.a));
                                hlta.b = hfvs0;
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

