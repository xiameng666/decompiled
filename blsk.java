import android.content.Intent;

public final class blsk {
    public static final int a;
    private static final bboh b;

    static {
        blsk.b = bnaa.a("AuthenticatorUtils");
    }

    public static bnae a(Intent intent0) {
        byte[] arr_b;
        bnae bnae0;
        if(intent0 == null) {
            bnad bnad0 = new bnad();
            bnad0.a = bnaf.s;
            return bnad0.a();
        }
        if(intent0.hasExtra("session_id")) {
            int v = intent0.getIntExtra("session_id", 0);
            bnad bnad1 = new bnad();
            bnad1.a = bnaf.s;
            bnad1.b = v;
            bnae0 = bnad1.a();
        }
        else {
            bnad bnad2 = new bnad();
            bnad2.a = bnaf.s;
            bnae0 = bnad2.a();
        }
        if(intent0.hasExtra("client_eid")) {
            try {
                if(intent0.getStringExtra("client_eid") == null) {
                    arr_b = null;
                }
                else {
                    String s = intent0.getStringExtra("client_eid");
                    gftb.check(s);
                    arr_b = ghjc.d.q(s);
                }
                gftb.check(arr_b);
                bnad bnad3 = bnae0.a();
                bnad3.c = arr_b;
                bnae0 = bnad3.a();
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                a.ae(blsk.b.j(), "Failed to decode base64 client eid.", illegalArgumentException0);
            }
        }
        if(intent0.hasExtra("experiment_id_list")) {
            int[] arr_v = intent0.getIntArrayExtra("experiment_id_list");
            if(arr_v != null) {
                bnad bnad4 = bnae0.a();
                bnad4.d = arr_v;
                return bnad4.a();
            }
        }
        return bnae0;
    }
}

