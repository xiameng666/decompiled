public final class gskp extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gskp a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        gskp gskp0 = new gskp();
        gskp.a = gskp0;
        ProtoLiteMessage.L(gskp.class, ((ProtoLiteMessage)gskp0));
    }

    private gskp() {
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
                    return new hfvw(((MessageLite)gskp.a), "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", gsla.class, gskk.class, gsmi.class});
                }
                case 3: {
                    return new gskp();
                }
                case 4: {
                    return new ProtoLiteBuilder(null, null);
                }
                case 5: {
                    return gskp.a;
                }
                case 6: {
                    Object object1 = gskp.d;
                    if(object1 == null) {
                        Class class0 = gskp.class;
                        synchronized(class0) {
                            hfvs0 = gskp.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gskp.a));
                                gskp.d = hfvs0;
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

