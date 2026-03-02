public final class hnrw extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hnrw a;
    public hfuo b;
    private static volatile Parser c;

    static {
        hnrw hnrw0 = new hnrw();
        hnrw.a = hnrw0;
        ProtoLiteMessage.L(hnrw.class, ((ProtoLiteMessage)hnrw0));
    }

    private hnrw() {
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
                    return new hfvw(((MessageLite)hnrw.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", hnry.class});
                }
                case 3: {
                    return new hnrw();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hnrw.a));
                }
                case 5: {
                    return hnrw.a;
                }
                case 6: {
                    Object object1 = hnrw.c;
                    if(object1 == null) {
                        Class class0 = hnrw.class;
                        synchronized(class0) {
                            hfvs0 = hnrw.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hnrw.a));
                                hnrw.c = hfvs0;
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

