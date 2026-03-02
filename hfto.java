final class hfto implements hfvk {
    public static final hfto a;

    static {
        hfto.a = new hfto();
    }

    @Override  // hfvk
    public final hfvj a(Class class0) {
        if(ProtoLiteMessage.class.isAssignableFrom(class0)) {
            try {
                Class class1 = class0.asSubclass(ProtoLiteMessage.class);
                ProtoLiteMessage hftv0 = (ProtoLiteMessage)ProtoLiteMessage.defaultInstanceMap.get(class1);
                if(hftv0 == null) {
                    try {
                        Class.forName(class1.getName(), true, class1.getClassLoader());
                    }
                    catch(ClassNotFoundException classNotFoundException0) {
                        throw new IllegalStateException("Class initialization cannot fail.", classNotFoundException0);
                    }
                    hftv0 = (ProtoLiteMessage)ProtoLiteMessage.defaultInstanceMap.get(class1);
                }
                if(hftv0 == null) {
                    hftv0 = (ProtoLiteMessage)((ProtoLiteMessage)hfwy.g(class1)).jf(6, null);
                    if(hftv0 == null) {
                        throw new IllegalStateException();
                    }
                    ProtoLiteMessage.defaultInstanceMap.put(class1, hftv0);
                    return (hfvj)hftv0.jf(3, null);
                }
                return (hfvj)hftv0.jf(3, null);
            }
            catch(Exception exception0) {
                throw new RuntimeException("Unable to get message info for " + class0.getName(), exception0);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + class0.getName());
    }

    @Override  // hfvk
    public final boolean b(Class class0) {
        return ProtoLiteMessage.class.isAssignableFrom(class0);
    }
}

