public final class hlwc extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hlwc a;
    private static volatile Parser b;
    private hfvh c;

    static {
        hlwc hlwc0 = new hlwc();
        hlwc.a = hlwc0;
        ProtoLiteMessage.L(hlwc.class, ((ProtoLiteMessage)hlwc0));
    }

    private hlwc() {
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
                    return new hfvw(((MessageLite)hlwc.a), "\u0001\u0001\u0000\u0000\n\n\u0001\u0001\u0000\u0000\n2", new Object[]{"c", hlwb.a});
                }
                case 3: {
                    return new hlwc();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hlwc.a));
                }
                case 5: {
                    return hlwc.a;
                }
                case 6: {
                    Object object1 = hlwc.b;
                    if(object1 == null) {
                        Class class0 = hlwc.class;
                        synchronized(class0) {
                            hfvs0 = hlwc.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hlwc.a));
                                hlwc.b = hfvs0;
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

