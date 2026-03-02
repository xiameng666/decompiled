import android.util.Pair;

public final class fcky implements evqf {
    public final fcln a;

    public fcky(fcln fcln0) {
        this.a = fcln0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        fcln fcln0 = this.a;
        Pair pair0 = (Pair)object0;
        try {
            byte[] arr_b = (byte[])pair0.second;
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)aqfl.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            fcln0.i.l(((aqfl)hftv0));
            fclm[] arr_fclm = fclm.values();
            fcln0.b(arr_fclm[((int)(((Integer)pair0.first)))]);
        }
        catch(hfur hfur0) {
            fcln.a.g("Failed to deserialize the previous backup data. Fallback to start restore flow", hfur0, new Object[0]);
            fcln0.b(fclm.a);
        }
    }
}

