public final class hlsr extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hlsr a;
    private static volatile Parser b;

    static {
        hlsr hlsr0 = new hlsr();
        hlsr.a = hlsr0;
        ProtoLiteMessage.L(hlsr.class, ((ProtoLiteMessage)hlsr0));
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
                    return new hfvw(((MessageLite)hlsr.a), "\u0001\u0000", null);
                }
                case 3: {
                    return new hlsr();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hlsr.a));
                }
                case 5: {
                    return hlsr.a;
                }
                case 6: {
                    Object object1 = hlsr.b;
                    if(object1 == null) {
                        Class class0 = hlsr.class;
                        synchronized(class0) {
                            hfvs0 = hlsr.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hlsr.a));
                                hlsr.b = hfvs0;
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

