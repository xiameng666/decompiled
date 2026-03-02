public final class dxer extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final dxer a;
    public hfuo b;
    private static volatile Parser c;

    static {
        dxer dxer0 = new dxer();
        dxer.a = dxer0;
        ProtoLiteMessage.L(dxer.class, ((ProtoLiteMessage)dxer0));
    }

    private dxer() {
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
                    return new hfvw(((MessageLite)dxer.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", hkgx.class});
                }
                case 3: {
                    return new dxer();
                }
                case 4: {
                    return new dxeq();
                }
                case 5: {
                    return dxer.a;
                }
                case 6: {
                    Object object1 = dxer.c;
                    if(object1 == null) {
                        Class class0 = dxer.class;
                        synchronized(class0) {
                            hfvs0 = dxer.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)dxer.a));
                                dxer.c = hfvs0;
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

