public final class dxep extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final dxep a;
    public hfuo b;
    public hfuo c;
    private static volatile Parser d;

    static {
        dxep dxep0 = new dxep();
        dxep.a = dxep0;
        ProtoLiteMessage.L(dxep.class, ((ProtoLiteMessage)dxep0));
    }

    private dxep() {
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
                    return new hfvw(((MessageLite)dxep.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001B\u0002\u001B", new Object[]{"b", dxev.class, "c", hkgx.class});
                }
                case 3: {
                    return new dxep();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)dxep.a));
                }
                case 5: {
                    return dxep.a;
                }
                case 6: {
                    Object object1 = dxep.d;
                    if(object1 == null) {
                        Class class0 = dxep.class;
                        synchronized(class0) {
                            hfvs0 = dxep.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)dxep.a));
                                dxep.d = hfvs0;
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

