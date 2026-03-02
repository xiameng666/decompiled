public final class hlss extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hlss a;
    private static volatile Parser b;

    static {
        hlss hlss0 = new hlss();
        hlss.a = hlss0;
        ProtoLiteMessage.L(hlss.class, ((ProtoLiteMessage)hlss0));
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
                    return new hfvw(((MessageLite)hlss.a), "\u0001\u0000", null);
                }
                case 3: {
                    return new hlss();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hlss.a));
                }
                case 5: {
                    return hlss.a;
                }
                case 6: {
                    Object object1 = hlss.b;
                    if(object1 == null) {
                        Class class0 = hlss.class;
                        synchronized(class0) {
                            hfvs0 = hlss.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hlss.a));
                                hlss.b = hfvs0;
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

