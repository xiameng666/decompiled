public final class gzfx extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gzfx a;
    public int b;
    public boolean c;
    private static volatile Parser d;

    static {
        gzfx gzfx0 = new gzfx();
        gzfx.a = gzfx0;
        ProtoLiteMessage.L(gzfx.class, ((ProtoLiteMessage)gzfx0));
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
                    return new hfvw(((MessageLite)gzfx.a), "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0007", new Object[]{"b", "c"});
                }
                case 3: {
                    return new gzfx();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gzfx.a));
                }
                case 5: {
                    return gzfx.a;
                }
                case 6: {
                    Object object1 = gzfx.d;
                    if(object1 == null) {
                        Class class0 = gzfx.class;
                        synchronized(class0) {
                            hfvs0 = gzfx.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gzfx.a));
                                gzfx.d = hfvs0;
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

