public final class bwke extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final bwke a;
    public hfuo b;
    private static volatile Parser c;

    static {
        bwke bwke0 = new bwke();
        bwke.a = bwke0;
        ProtoLiteMessage.L(bwke.class, ((ProtoLiteMessage)bwke0));
    }

    private bwke() {
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
                    return new hfvw(((MessageLite)bwke.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", bwkd.class});
                }
                case 3: {
                    return new bwke();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)bwke.a));
                }
                case 5: {
                    return bwke.a;
                }
                case 6: {
                    Object object1 = bwke.c;
                    if(object1 == null) {
                        Class class0 = bwke.class;
                        synchronized(class0) {
                            hfvs0 = bwke.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)bwke.a));
                                bwke.c = hfvs0;
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

