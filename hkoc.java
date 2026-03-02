public final class hkoc extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkoc a;
    public hfuo b;
    public boolean c;
    public ByteString d;
    private static volatile Parser e;

    static {
        hkoc hkoc0 = new hkoc();
        hkoc.a = hkoc0;
        ProtoLiteMessage.L(hkoc.class, ((ProtoLiteMessage)hkoc0));
    }

    private hkoc() {
        this.b = hfvv.a;
        this.d = ByteString.b;
    }

    public static void b(hkoc hkoc0) {
        hkoc0.c = false;
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
                    return new hfvw(((MessageLite)hkoc.a), "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001B\u0002\u0007\u0003\n", new Object[]{"b", hkob.class, "c", "d"});
                }
                case 3: {
                    return new hkoc();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkoc.a));
                }
                case 5: {
                    return hkoc.a;
                }
                case 6: {
                    Object object1 = hkoc.e;
                    if(object1 == null) {
                        Class class0 = hkoc.class;
                        synchronized(class0) {
                            hfvs0 = hkoc.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkoc.a));
                                hkoc.e = hfvs0;
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

