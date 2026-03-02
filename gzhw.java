public final class gzhw extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gzhw a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gzhw gzhw0 = new gzhw();
        gzhw.a = gzhw0;
        ProtoLiteMessage.L(gzhw.class, ((ProtoLiteMessage)gzhw0));
    }

    private gzhw() {
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
                    return new hfvw(((MessageLite)gzhw.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", gzhv.class});
                }
                case 3: {
                    return new gzhw();
                }
                case 4: {
                    return new gzhu();
                }
                case 5: {
                    return gzhw.a;
                }
                case 6: {
                    Object object1 = gzhw.c;
                    if(object1 == null) {
                        Class class0 = gzhw.class;
                        synchronized(class0) {
                            hfvs0 = gzhw.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gzhw.a));
                                gzhw.c = hfvs0;
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

