import android.database.Cursor;

public final class esjj implements bboe {
    @Override  // bboe
    public final Object a(Object object0) {
        byte[] arr_b = ((Cursor)object0).getBlob(((Cursor)object0).getColumnIndexOrThrow("psd_logs"));
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ftke.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return (ftke)hftv0;
        }
        catch(hfur hfur0) {
            a.ae(esjl.a.i(), "Unable to parse Logs PSD proto bytes.", hfur0);
            return ftke.a;
        }
    }
}

