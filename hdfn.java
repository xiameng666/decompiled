public final class hdfn extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hdfn a;
    public hfuo b;
    public hfuo c;
    public static final hfta d;
    private static volatile Parser e;

    static {
        hdfn hdfn0 = new hdfn();
        hdfn.a = hdfn0;
        ProtoLiteMessage.L(hdfn.class, ((ProtoLiteMessage)hdfn0));
        hdfn.d = ProtoLiteMessage.Q(((MessageLite)hcos.a), hdfn0, ((MessageLite)hdfn0), 0x11A60A72, hfxe.k);
    }

    private hdfn() {
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
                    return new hfvw(((MessageLite)hdfn.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001B\u0002\u001B", new Object[]{"b", hdfq.class, "c", hdgg.class});
                }
                case 3: {
                    return new hdfn();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hdfn.a));
                }
                case 5: {
                    return hdfn.a;
                }
                case 6: {
                    Object object1 = hdfn.e;
                    if(object1 == null) {
                        Class class0 = hdfn.class;
                        synchronized(class0) {
                            hfvs0 = hdfn.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hdfn.a));
                                hdfn.e = hfvs0;
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

