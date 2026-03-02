public final class hfbx extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hfbx a;
    public hfuo b;
    public hfuo c;
    private static volatile Parser d;

    static {
        hfbx hfbx0 = new hfbx();
        hfbx.a = hfbx0;
        ProtoLiteMessage.L(hfbx.class, ((ProtoLiteMessage)hfbx0));
    }

    private hfbx() {
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
                    return new hfvw(((MessageLite)hfbx.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001B\u0002\u001B", new Object[]{"b", hfbk.class, "c", hfbn.class});
                }
                case 3: {
                    return new hfbx();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hfbx.a));
                }
                case 5: {
                    return hfbx.a;
                }
                case 6: {
                    Object object1 = hfbx.d;
                    if(object1 == null) {
                        Class class0 = hfbx.class;
                        synchronized(class0) {
                            hfvs0 = hfbx.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hfbx.a));
                                hfbx.d = hfvs0;
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

