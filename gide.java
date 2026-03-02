public final class gide extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gide a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gide gide0 = new gide();
        gide.a = gide0;
        ProtoLiteMessage.L(gide.class, ((ProtoLiteMessage)gide0));
    }

    private gide() {
        this.b = hfvv.a;
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
                    return new hfvw(((MessageLite)gide.a), "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001A", new Object[]{"b"});
                }
                case 3: {
                    return new gide();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gide.a));
                }
                case 5: {
                    return gide.a;
                }
                case 6: {
                    Object object1 = gide.c;
                    if(object1 == null) {
                        Class class0 = gide.class;
                        synchronized(class0) {
                            hfvs0 = gide.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gide.a));
                                gide.c = hfvs0;
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

