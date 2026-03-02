public final class hdju extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hdju a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        hdju hdju0 = new hdju();
        hdju.a = hdju0;
        ProtoLiteMessage.L(hdju.class, ((ProtoLiteMessage)hdju0));
    }

    private hdju() {
        this.b = 0;
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
                    return new hfvw(((MessageLite)hdju.a), "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", hdjx.class, hdjv.class});
                }
                case 3: {
                    return new hdju();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hdju.a));
                }
                case 5: {
                    return hdju.a;
                }
                case 6: {
                    Object object1 = hdju.d;
                    if(object1 == null) {
                        Class class0 = hdju.class;
                        synchronized(class0) {
                            hfvs0 = hdju.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hdju.a));
                                hdju.d = hfvs0;
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

