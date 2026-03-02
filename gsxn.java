public final class gsxn extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gsxn a;
    public ByteString b;
    public hfuo c;
    public hfuo d;
    public hfuo e;
    private static volatile Parser f;

    static {
        gsxn gsxn0 = new gsxn();
        gsxn.a = gsxn0;
        ProtoLiteMessage.L(gsxn.class, ((ProtoLiteMessage)gsxn0));
    }

    private gsxn() {
        this.b = ByteString.b;
        this.c = hfvv.a;
        this.d = hfvv.a;
        this.e = hfvv.a;
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
                    return new hfvw(((MessageLite)gsxn.a), "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0003\u0000\u0001\n\u0002\u001B\u0003\u001B\u0004\u001B", new Object[]{"b", "c", gsxo.class, "d", gsyf.class, "e", gsya.class});
                }
                case 3: {
                    return new gsxn();
                }
                case 4: {
                    return new gsxm();
                }
                case 5: {
                    return gsxn.a;
                }
                case 6: {
                    Object object1 = gsxn.f;
                    if(object1 == null) {
                        Class class0 = gsxn.class;
                        synchronized(class0) {
                            hfvs0 = gsxn.f;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gsxn.a));
                                gsxn.f = hfvs0;
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

