public final class gioe extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gioe a;
    public static final hfta b;
    private static volatile Parser c;

    static {
        gioe gioe0 = new gioe();
        gioe.a = gioe0;
        ProtoLiteMessage.L(gioe.class, ((ProtoLiteMessage)gioe0));
        gioe.b = ProtoLiteMessage.Q(((MessageLite)gikm.a), gioe0, ((MessageLite)gioe0), 0xA9, hfxe.k);
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
                    return new hfvw(((MessageLite)gioe.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gioe();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gioe.a));
                }
                case 5: {
                    return gioe.a;
                }
                case 6: {
                    Object object1 = gioe.c;
                    if(object1 == null) {
                        Class class0 = gioe.class;
                        synchronized(class0) {
                            hfvs0 = gioe.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gioe.a));
                                gioe.c = hfvs0;
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

