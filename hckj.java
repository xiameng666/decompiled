public final class hckj extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hckj a;
    public hfuo b;
    public hfuo c;
    private static volatile Parser d;

    static {
        hckj hckj0 = new hckj();
        hckj.a = hckj0;
        ProtoLiteMessage.L(hckj.class, ((ProtoLiteMessage)hckj0));
    }

    private hckj() {
        this.b = hfvv.a;
        this.c = hfvv.a;
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
                    return new hfvw(((MessageLite)hckj.a), "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u001A\u0003\u001A", new Object[]{"c", "b"});
                }
                case 3: {
                    return new hckj();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hckj.a));
                }
                case 5: {
                    return hckj.a;
                }
                case 6: {
                    Object object1 = hckj.d;
                    if(object1 == null) {
                        Class class0 = hckj.class;
                        synchronized(class0) {
                            hfvs0 = hckj.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hckj.a));
                                hckj.d = hfvs0;
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

