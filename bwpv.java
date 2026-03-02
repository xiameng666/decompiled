public final class bwpv extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final bwpv a;
    public hfuo b;
    private static volatile Parser c;

    static {
        bwpv bwpv0 = new bwpv();
        bwpv.a = bwpv0;
        ProtoLiteMessage.L(bwpv.class, ((ProtoLiteMessage)bwpv0));
    }

    private bwpv() {
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
                    return new hfvw(((MessageLite)bwpv.a), "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001B", new Object[]{"b", bwpu.class});
                }
                case 3: {
                    return new bwpv();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)bwpv.a));
                }
                case 5: {
                    return bwpv.a;
                }
                case 6: {
                    Object object1 = bwpv.c;
                    if(object1 == null) {
                        Class class0 = bwpv.class;
                        synchronized(class0) {
                            hfvs0 = bwpv.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)bwpv.a));
                                bwpv.c = hfvs0;
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

