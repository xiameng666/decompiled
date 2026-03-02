import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mobilesubscription.serviceconfig.CheckAuthStatusResponse;
import com.google.android.gms.mobilesubscription.serviceconfig.GetPhoneNumbersRequest;
import com.google.android.gms.mobilesubscription.serviceconfig.UserKey;

public final class epyq implements evqk {
    public final epys a;
    public final csml b;

    public epyq(epys epys0, csml csml0) {
        this.a = epys0;
        this.b = csml0;
    }

    @Override  // evqk
    public final evql a(Object object0) {
        if(((CheckAuthStatusResponse)object0) == null) {
            return evrg.c(new NullPointerException("Auth status is null"));
        }
        UserKey userKey0 = ((CheckAuthStatusResponse)object0).e;
        String s = ((CheckAuthStatusResponse)object0).a;
        if(userKey0 == null) {
            return evrg.c(new Exception("user key is null"));
        }
        if(TextUtils.isEmpty(s)) {
            return evrg.c(new Exception("empty request id"));
        }
        this.a.b = userKey0;
        GetPhoneNumbersRequest getPhoneNumbersRequest0 = new GetPhoneNumbersRequest();
        getPhoneNumbersRequest0.a = s;
        getPhoneNumbersRequest0.b = userKey0;
        batl.c(getPhoneNumbersRequest0.a != null, "Need a non-null request_id.");
        azzc azzc0 = new azzc();
        azzc0.a = new csmd(this.b, getPhoneNumbersRequest0);
        azzc0.c = new Feature[]{csma.a};
        azzc0.d = 0x4076;
        return this.b.jn(azzc0.a());
    }
}

