import android.content.Context;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;

public final class gbbe {
    public static clcn a(Context context0, String s, String s1, gcsl gcsl0, clck clck0) {
        ExecutorService executorService0 = clhl.b.b(clhr.b);
        ibuq.f(context0, "context");
        ibuq.f(s1, "method");
        ibuq.f(executorService0, "executorService");
        clcj clcj0 = clbv.a(context0).e(gcsp.b(gcsl0.a), clck0, executorService0, -1, 0x1B00);
        List list0 = gcsl0.b;
        HashMap hashMap0 = ggkm.k((list0 == null ? 0 : list0.size() / 2) + 3);
        hashMap0.put("Content-Type", s);
        hashMap0.put("Authorization", "Bearer " + gcsl0.d);
        hashMap0.put("X-Modality", "ANDROID_NATIVE");
        if(list0 != null && !list0.isEmpty()) {
            hashMap0.put("EES-S7E-Mode", "proto");
            int v = list0.size();
            gavs.c(v % 2 == 0, "BE_NU_01", null, "Header arrays must have matching names and values");
            for(int v1 = 0; v1 < v; v1 += 2) {
                String s2 = (String)list0.get(v1);
                String s3 = (String)list0.get(v1 + 1);
                gavs.c(((boolean)(TextUtils.isEmpty(s2) ^ 1)), "BE_NU_02", null, "Header names must be non empty.");
                hashMap0.put(s2, s3);
            }
        }
        String s4 = gcsl0.e;
        if(!TextUtils.isEmpty(s4)) {
            hashMap0.put("Cookie", s4);
        }
        clcj0.m(gcsp.a(hashMap0));
        clcj0.n(s1);
        clcj0.q(context0, (gcsl0.c == null ? ByteBuffer.allocate(0) : ByteBuffer.wrap(gcsl0.c)), clbk.a, clbj.a);
        return clcj0.e();
    }

    public static final hhna b(byte[] arr_b) {
        ibuq.f(arr_b, "<this>");
        if(arr_b.length == 0) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhna.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hhna)hftp0.b_message).b = 502;
            return (hhna)hftp0.N_build();
        }
        return (hhna)gawi.k(arr_b, ((Parser)((ProtoLiteMessage)hhna.a).jf(7, null)));
    }
}

