import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.common.api.ApiMetadata;

public final class abxs implements azys {
    public final UsageInfo[] a;

    public abxs(UsageInfo[] arr_usageInfo) {
        this.a = arr_usageInfo;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        abxu abxu0 = (abxu)object0;
        abxq abxq0 = new abxq(((evqp)object1));
        abxo abxo0 = abxu0.i();
        ApiMetadata apiMetadata0 = cclr.a(abxu0.r);
        abxo0.b(abxq0, this.a, apiMetadata0);
    }
}

