import android.text.TextUtils;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.issuer.RequestTokenizeChimeraActivity;

public final class etjv implements evqf {
    public final RequestTokenizeChimeraActivity a;

    public etjv(RequestTokenizeChimeraActivity requestTokenizeChimeraActivity0) {
        this.a = requestTokenizeChimeraActivity0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        RequestTokenizeChimeraActivity requestTokenizeChimeraActivity0 = this.a;
        String s = requestTokenizeChimeraActivity0.getIntent().getStringExtra("authAccount");
        if(!TextUtils.isEmpty(s) && (((AccountInfo)object0) == null || !((AccountInfo)object0).b.equals(s))) {
            String[] arr_s = requestTokenizeChimeraActivity0.F();
            for(int v = 0; v < arr_s.length; ++v) {
                String s1 = arr_s[v];
                if(s1.equals(s)) {
                    requestTokenizeChimeraActivity0.b(s1);
                    return;
                }
            }
        }
        if(((AccountInfo)object0) == null) {
            String[] arr_s1 = requestTokenizeChimeraActivity0.F();
            if(arr_s1.length == 0) {
                ((ggtj)RequestTokenizeChimeraActivity.j.h()).x("No accounts available");
                requestTokenizeChimeraActivity0.finish();
                return;
            }
            requestTokenizeChimeraActivity0.b(arr_s1[0]);
            return;
        }
        requestTokenizeChimeraActivity0.o = (AccountInfo)object0;
        if(requestTokenizeChimeraActivity0.D != null) {
            requestTokenizeChimeraActivity0.p = new esgi(((AccountInfo)object0), esge.d(), requestTokenizeChimeraActivity0);
            etlf etlf0 = requestTokenizeChimeraActivity0.D;
            esgi esgi0 = requestTokenizeChimeraActivity0.p;
            ibuq.f(esgi0, "newRequestContext");
            etlf0.l = (AccountInfo)object0;
            etlf0.m = esgi0;
            etlf0.j();
        }
        requestTokenizeChimeraActivity0.D();
    }
}

