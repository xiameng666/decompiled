import android.database.Cursor;

public final class esjy implements bboe {
    @Override  // bboe
    public final Object a(Object object0) {
        eskf eskf0;
        gtfo gtfo0;
        byte[] arr_b = ((Cursor)object0).getBlob(((Cursor)object0).getColumnIndexOrThrow("card"));
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gtfo.b), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            gtfo0 = (gtfo)hftv0;
        }
        catch(hfur hfur0) {
            throw new IllegalArgumentException(hfur0);
        }
        int v = ((Cursor)object0).getInt(((Cursor)object0).getColumnIndexOrThrow("network_id"));
        int v1 = gtfp.c(gtfo0.h) == 0 ? 1 : gtfp.c(gtfo0.h);
        switch(v) {
            case 9: {
                eskf0 = eskf.a;
                break;
            }
            case 10: {
                eskf0 = eskf.b;
                break;
            }
            default: {
                switch(v1 - 2) {
                    case 10: {
                        eskf0 = eskf.a;
                        break;
                    }
                    case 11: {
                        eskf0 = eskf.b;
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException("Unknown PostpaidServiceProvider for CardNetwork " + v);
                    }
                }
            }
        }
        int v2 = ((Cursor)object0).getInt(((Cursor)object0).getColumnIndexOrThrow("pending_state"));
        String s = ((Cursor)object0).getString(((Cursor)object0).getColumnIndexOrThrow("activation_method"));
        String s1 = ((Cursor)object0).getString(((Cursor)object0).getColumnIndexOrThrow("bundle_id"));
        String s2 = ((Cursor)object0).getString(((Cursor)object0).getColumnIndexOrThrow("session_id"));
        byte[] arr_b1 = ((Cursor)object0).getBlob(((Cursor)object0).getColumnIndexOrThrow("bundle_handle"));
        return ((Cursor)object0).getInt(((Cursor)object0).getColumnIndexOrThrow("is_default")) == 1 ? new eskg(gtfo0, v2, eskf0, s, s1, s2, arr_b1, true, ((Cursor)object0).getLong(((Cursor)object0).getColumnIndexOrThrow("provisioning_time_s"))) : new eskg(gtfo0, v2, eskf0, s, s1, s2, arr_b1, false, ((Cursor)object0).getLong(((Cursor)object0).getColumnIndexOrThrow("provisioning_time_s")));
    }
}

