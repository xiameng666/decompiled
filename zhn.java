import j..util.DesugarCollections;

public final class zhn {
    private static final baun a;

    static {
        zhn.a = new baun("AccountSettings", new String[]{"RepositoryConverters"});
    }

    public static grxr a(byte[] arr_b) {
        if(arr_b == null) {
            return null;
        }
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)grxr.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return (grxr)hftv0;
        }
        catch(hfur hfur0) {
            zhn.a.g("Failed to convert ByteArray to Resource.", hfur0, new Object[0]);
            return null;
        }
    }

    public static grxw b(byte[] arr_b) {
        if(arr_b == null) {
            return null;
        }
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)grxw.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return (grxw)hftv0;
        }
        catch(hfur hfur0) {
            zhn.a.g("Failed to convert ByteArray to ResourceKey.", hfur0, new Object[0]);
            return null;
        }
    }

    public static byte[] c(grxw grxw0) {
        if(grxw0 == null) {
            return null;
        }
        grxu grxu0 = (grxu)((ProtoLiteMessage)grxw.a).v_newBuilder();
        int v = grxw0.c;
        if(!grxu0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grxu0).ensureMutable();
        }
        grxw grxw1 = (grxw)grxu0.b_message;
        grxw1.b |= 1;
        grxw1.c = v;
        grxu0.a(ggfz.b(DesugarCollections.unmodifiableMap(grxw0.d)));
        return ((grxw)((ProtoLiteBuilder)grxu0).N_build()).toBytesArray();
    }

    public static byte[] d(grxr grxr0) {
        return grxr0 == null ? null : grxr0.toBytesArray();
    }
}

