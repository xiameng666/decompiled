public final class hesv extends hfts implements hftt {
    public static final hesv a;
    private static volatile Parser b;
    private byte c;

    static {
        hesv hesv0 = new hesv();
        hesv.a = hesv0;
        ProtoLiteMessage.L(hesv.class, ((ProtoLiteMessage)hesv0));
    }

    private hesv() {
        this.c = 2;
    }

    @Override  // ProtoLiteMessage
    public final Object jf(int v, Object object0) {
        Parser hfvs0;
        if(v != 0) {
            switch(v - 1) {
                case 0: {
                    return (byte)this.c;
                }
                case 2: {
                    return new hfvw(((MessageLite)hesv.a), "\u0001\u0000", null);
                }
                case 3: {
                    return new hesv();
                }
                case 4: {
                    return new hftr(hesv.a);
                }
                case 5: {
                    return hesv.a;
                }
                case 6: {
                    Object object1 = hesv.b;
                    if(object1 == null) {
                        Class class0 = hesv.class;
                        synchronized(class0) {
                            hfvs0 = hesv.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hesv.a));
                                hesv.b = hfvs0;
                            }
                        }
                        return hfvs0;
                    }
                    return object1;
                }
                default: {
                    this.c = object0 == null ? 0 : 1;
                    return null;
                }
            }
        }
        throw null;
    }
}

