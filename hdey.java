public final class hdey extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hdey a;
    public hfui b;
    public static final hfta c;
    private static volatile Parser d;

    static {
        hdey hdey0 = new hdey();
        hdey.a = hdey0;
        ProtoLiteMessage.L(hdey.class, ((ProtoLiteMessage)hdey0));
        hdey.c = ProtoLiteMessage.Q(((MessageLite)hcnu.a), hdey0, ((MessageLite)hdey0), 0xFCB580B, hfxe.k);
    }

    private hdey() {
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
                    return new hfvw(((MessageLite)hdey.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0014", new Object[]{"b"});
                }
                case 3: {
                    return new hdey();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hdey.a));
                }
                case 5: {
                    return hdey.a;
                }
                case 6: {
                    Object object1 = hdey.d;
                    if(object1 == null) {
                        Class class0 = hdey.class;
                        synchronized(class0) {
                            hfvs0 = hdey.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hdey.a));
                                hdey.d = hfvs0;
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

