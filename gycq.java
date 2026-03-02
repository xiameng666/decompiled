public final class gycq extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gycq a;
    public hfuf b;
    private static volatile Parser c;

    static {
        gycq gycq0 = new gycq();
        gycq.a = gycq0;
        ProtoLiteMessage.L(gycq.class, ((ProtoLiteMessage)gycq0));
    }

    private gycq() {
        this.b = hfty.a;
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
                    return new hfvw(((MessageLite)gycq.a), "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\'", new Object[]{"b"});
                }
                case 3: {
                    return new gycq();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gycq.a));
                }
                case 5: {
                    return gycq.a;
                }
                case 6: {
                    Object object1 = gycq.c;
                    if(object1 == null) {
                        Class class0 = gycq.class;
                        synchronized(class0) {
                            hfvs0 = gycq.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gycq.a));
                                gycq.c = hfvs0;
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

