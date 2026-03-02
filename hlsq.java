public final class hlsq extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hlsq a;
    private static volatile Parser b;

    static {
        hlsq hlsq0 = new hlsq();
        hlsq.a = hlsq0;
        ProtoLiteMessage.L(hlsq.class, ((ProtoLiteMessage)hlsq0));
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
                    return new hfvw(((MessageLite)hlsq.a), "\u0001\u0000", null);
                }
                case 3: {
                    return new hlsq();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hlsq.a));
                }
                case 5: {
                    return hlsq.a;
                }
                case 6: {
                    Object object1 = hlsq.b;
                    if(object1 == null) {
                        Class class0 = hlsq.class;
                        synchronized(class0) {
                            hfvs0 = hlsq.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hlsq.a));
                                hlsq.b = hfvs0;
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

