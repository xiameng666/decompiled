public final class hdeq extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hdeq a;
    public hfui b;
    public static final hfta c;
    private static volatile Parser d;

    static {
        hdeq hdeq0 = new hdeq();
        hdeq.a = hdeq0;
        ProtoLiteMessage.L(hdeq.class, ((ProtoLiteMessage)hdeq0));
        hdeq.c = ProtoLiteMessage.Q(((MessageLite)hcnu.a), hdeq0, ((MessageLite)hdeq0), 462181704, hfxe.k);
    }

    private hdeq() {
        this.b = hfvb.a;
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
                    return new hfvw(((MessageLite)hdeq.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"b"});
                }
                case 3: {
                    return new hdeq();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hdeq.a));
                }
                case 5: {
                    return hdeq.a;
                }
                case 6: {
                    Object object1 = hdeq.d;
                    if(object1 == null) {
                        Class class0 = hdeq.class;
                        synchronized(class0) {
                            hfvs0 = hdeq.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hdeq.a));
                                hdeq.d = hfvs0;
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

