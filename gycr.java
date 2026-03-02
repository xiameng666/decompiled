public final class gycr extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gycr a;
    public hfuf b;
    private static volatile Parser c;

    static {
        gycr gycr0 = new gycr();
        gycr.a = gycr0;
        ProtoLiteMessage.L(gycr.class, ((ProtoLiteMessage)gycr0));
    }

    private gycr() {
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
                    return new hfvw(((MessageLite)gycr.a), "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\'", new Object[]{"b"});
                }
                case 3: {
                    return new gycr();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gycr.a));
                }
                case 5: {
                    return gycr.a;
                }
                case 6: {
                    Object object1 = gycr.c;
                    if(object1 == null) {
                        Class class0 = gycr.class;
                        synchronized(class0) {
                            hfvs0 = gycr.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gycr.a));
                                gycr.c = hfvs0;
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

