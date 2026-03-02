import android.database.Cursor;

public final class etrv implements bboe {
    @Override  // bboe
    public final Object a(Object object0) {
        String s = ((Cursor)object0).getString(3);
        if(s == null) {
            return null;
        }
        String s1 = ((Cursor)object0).getString(7);
        if(s1 == null) {
            return null;
        }
        long v = ((Cursor)object0).getLong(5);
        long v1 = ((Cursor)object0).getLong(6);
        byte[] arr_b = ((Cursor)object0).getBlob(8);
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)etsm.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            etsm etsm0 = (etsm)hftv0;
            return new etsd(s, s1, etsm0, v, v1, etsm0.e);
        }
        catch(hfur hfur0) {
            a.ae(etse.a.j(), "proto unreadable", hfur0);
            return null;
        }
    }
}

