public final class hdng extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hdng a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        hdng hdng0 = new hdng();
        hdng.a = hdng0;
        ProtoLiteMessage.L(hdng.class, ((ProtoLiteMessage)hdng0));
    }

    private hdng() {
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
                    return new hfvw(((MessageLite)hdng.a), "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", hdne.class, hdnf.class});
                }
                case 3: {
                    return new hdng();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hdng.a));
                }
                case 5: {
                    return hdng.a;
                }
                case 6: {
                    Object object1 = hdng.d;
                    if(object1 == null) {
                        Class class0 = hdng.class;
                        synchronized(class0) {
                            hfvs0 = hdng.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hdng.a));
                                hdng.d = hfvs0;
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

