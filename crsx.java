public final class crsx extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final crsx a;
    public hfui b;
    public hfui c;
    public hfuo d;
    public hfuo e;
    private static volatile Parser f;

    static {
        crsx crsx0 = new crsx();
        crsx.a = crsx0;
        ProtoLiteMessage.L(crsx.class, ((ProtoLiteMessage)crsx0));
    }

    private crsx() {
        this.b = hfvb.a;
        this.c = hfvb.a;
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
                    return new hfvw(((MessageLite)crsx.a), "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001B\u0004\u001B", new Object[]{"b", "c", "d", crsm.class, "e", crsy.class});
                }
                case 3: {
                    return new crsx();
                }
                case 4: {
                    return new crsw();
                }
                case 5: {
                    return crsx.a;
                }
                case 6: {
                    Object object1 = crsx.f;
                    if(object1 == null) {
                        Class class0 = crsx.class;
                        synchronized(class0) {
                            hfvs0 = crsx.f;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)crsx.a));
                                crsx.f = hfvs0;
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

