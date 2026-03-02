import android.content.Intent;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tapandpay.firstparty.UnifiedTokenizationRequest;
import com.google.android.gms.tapandpay.firstparty.UnifiedTokenizationResponse;
import java.util.concurrent.ExecutionException;

public final class garh extends gaok {
    private final etgl b;

    public garh(gamx gamx0) {
        super(gamx0);
        this.b = new etgl(gamx0.a);
    }

    @Override  // gamu
    public final ganp a(gano gano0) {
        ibuq.f(gano0, "actionRequest");
        String s = garg.b(gano0).b;
        String s1 = garg.b(gano0).c;
        ibuq.f(gano0, "<this>");
        byte[] arr_b = ByteString.copyFrom(gano0.a.getByteArrayExtra("extra_unified_tokenization_request")).toByteArray();
        ibuq.f(gano0, "<this>");
        ibuq.e(gano0.a, "getIntent(...)");
        Integer integer0 = gcvb.a(gano0.a, "extra_request_code");
        ibuq.f(gano0, "<this>");
        ibuq.e(gano0.a, "getIntent(...)");
        Integer integer1 = gcvb.a(gano0.a, "extra_result_code");
        ibuq.f(gano0, "<this>");
        Intent intent0 = (Intent)jwh.a(gano0.a, "extra_activity_result_data", Intent.class);
        ftiw ftiw0 = null;
        UnifiedTokenizationRequest unifiedTokenizationRequest0 = new UnifiedTokenizationRequest(s, s1, arr_b, integer0, integer1, (intent0 == null ? null : intent0.getExtras()));
        try {
            azzc azzc0 = new azzc();
            azzc0.a = new etcp(this.b, unifiedTokenizationRequest0);
            int v = 1;
            azzc0.c = new Feature[]{eseb.I};
            azzc0.b = false;
            azzc0.d = 2202;
            azzd azzd0 = azzc0.a();
            UnifiedTokenizationResponse unifiedTokenizationResponse0 = (UnifiedTokenizationResponse)gawm.a(this.b.jn(azzd0), null);
            ibuq.c(unifiedTokenizationResponse0);
            ibuq.f(unifiedTokenizationResponse0, "response");
            byte[] arr_b1 = unifiedTokenizationResponse0.b;
            if(arr_b1 != null) {
                ftiw0 = (ftiw)gawi.g(arr_b1, ((Parser)((ProtoLiteMessage)ftiw.a).jf(7, null)));
            }
            switch(unifiedTokenizationResponse0.a) {
                case 0: {
                    if(ftiw0 != null && ftiw0.b == 29) {
                        ganp ganp0 = ganp.h(0);
                        byte[] arr_b2 = (ftiw0.b == 29 ? ((ByteString)ftiw0.c) : ByteString.b).toByteArray();
                        ganp0.a.putExtra("extra_unified_tokenization_response", arr_b2);
                        return ganp0;
                    }
                    return new ganp(ganp.d(ftis.b(2)));
                }
                case 1: {
                    if(ftiw0 != null && ftiw0.b == 1) {
                        int v1 = ftis.c(((ftit)ftiw0.c).b);
                        if(v1 != 0) {
                            v = v1;
                        }
                        return new ganp(ganp.d(ftis.b(v)));
                    }
                    return new ganp(ganp.d(ftis.b(2)));
                }
                case 2: {
                    ganp ganp1 = ganp.h(0);
                    ibuq.e(ganp1.a, "getIntent(...)");
                    gcvb.b(ganp1.a, "extra_response_request_code", unifiedTokenizationResponse0.c);
                    ganp1.a.putExtra("extra_pending_intent", unifiedTokenizationResponse0.d);
                    return ganp1;
                }
                default: {
                    return new ganp(ganp.d(ftis.b(2)));
                }
            }
        }
        catch(InterruptedException unused_ex) {
            return new ganp(ganp.d(ftis.b(2)));
        }
        catch(ExecutionException unused_ex) {
            return new ganp(ganp.d(ftis.b(2)));
        }
    }
}

