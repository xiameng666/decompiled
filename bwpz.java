public final class bwpz extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final bwpz a;
    public hfuo b;
    private static volatile Parser c;

    static {
        bwpz bwpz0 = new bwpz();
        bwpz.a = bwpz0;
        ProtoLiteMessage.L(bwpz.class, ((ProtoLiteMessage)bwpz0));
    }

    private bwpz() {
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
                    return new hfvw(((MessageLite)bwpz.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", bwpy.class});
                }
                case 3: {
                    return new bwpz();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)bwpz.a));
                }
                case 5: {
                    return bwpz.a;
                }
                case 6: {
                    Object object1 = bwpz.c;
                    if(object1 == null) {
                        Class class0 = bwpz.class;
                        synchronized(class0) {
                            hfvs0 = bwpz.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)bwpz.a));
                                bwpz.c = hfvs0;
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

