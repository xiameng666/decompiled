public final class hdnw extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hdnw a;
    public int b;
    public Object c;
    public static final hfta d;
    private static volatile Parser e;

    static {
        hdnw hdnw0 = new hdnw();
        hdnw.a = hdnw0;
        ProtoLiteMessage.L(hdnw.class, ((ProtoLiteMessage)hdnw0));
        hdnw.d = ProtoLiteMessage.Q(((MessageLite)hcqv.a), hdnw0, ((MessageLite)hdnw0), 232060283, hfxe.k);
    }

    private hdnw() {
        this.b = 0;
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
                    return new hfvw(((MessageLite)hdnw.a), "\u0004\u0001\u0001\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002;\u0000", new Object[]{"c", "b"});
                }
                case 3: {
                    return new hdnw();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hdnw.a));
                }
                case 5: {
                    return hdnw.a;
                }
                case 6: {
                    Object object1 = hdnw.e;
                    if(object1 == null) {
                        Class class0 = hdnw.class;
                        synchronized(class0) {
                            hfvs0 = hdnw.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hdnw.a));
                                hdnw.e = hfvs0;
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

