public final class gblv {
    public static getm a(ByteString hfsf0, int v) {
        if(hfsf0 == null) {
            return null;
        }
        if(v != 1 && v != 2) {
            return null;
        }
        try {
            gers gers0 = (gers)((Parser)((ProtoLiteMessage)gers.b).jf(7, null)).j(hfsf0);
            return (gers0.c & 0x100) == 0 ? getm.a : ((getm)gawi.h((gers0.m == null ? getm.a : gers0.m).c, ((Parser)((ProtoLiteMessage)getm.a).jf(7, null))));
        }
        catch(hfur unused_ex) {
            return null;
        }
    }
}

