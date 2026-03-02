public final class ahge extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ahge a;
    public boolean b;
    public boolean c;
    public ByteString d;
    private static volatile Parser e;

    static {
        ahge ahge0 = new ahge();
        ahge.a = ahge0;
        ProtoLiteMessage.L(ahge.class, ((ProtoLiteMessage)ahge0));
    }

    private ahge() {
        this.d = ByteString.b;
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
                    return new hfvw(((MessageLite)ahge.a), "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\n", new Object[]{"b", "c", "d"});
                }
                case 3: {
                    return new ahge();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ahge.a));
                }
                case 5: {
                    return ahge.a;
                }
                case 6: {
                    Object object1 = ahge.e;
                    if(object1 == null) {
                        Class class0 = ahge.class;
                        synchronized(class0) {
                            hfvs0 = ahge.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ahge.a));
                                ahge.e = hfvs0;
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

