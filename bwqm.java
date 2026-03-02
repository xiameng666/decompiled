public final class bwqm extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final bwqm a;
    public hfuo b;
    public hfuo c;
    private static volatile Parser d;

    static {
        bwqm bwqm0 = new bwqm();
        bwqm.a = bwqm0;
        ProtoLiteMessage.L(bwqm.class, ((ProtoLiteMessage)bwqm0));
    }

    private bwqm() {
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
                    return new hfvw(((MessageLite)bwqm.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001B\u0002\u001A", new Object[]{"b", bwqk.class, "c"});
                }
                case 3: {
                    return new bwqm();
                }
                case 4: {
                    return new bwql();
                }
                case 5: {
                    return bwqm.a;
                }
                case 6: {
                    Object object1 = bwqm.d;
                    if(object1 == null) {
                        Class class0 = bwqm.class;
                        synchronized(class0) {
                            hfvs0 = bwqm.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)bwqm.a));
                                bwqm.d = hfvs0;
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

