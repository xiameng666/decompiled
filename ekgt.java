import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.romanesco.protomodel.SourceStatsEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public final class ekgt extends cjtm {
    private static final bboh a;
    private final ekfh b;
    private final String c;
    private final long d;

    static {
        ekgt.a = bboh.b("CBR_FetchGmsStatsOp", bbcu.bN);
    }

    public ekgt(ekfh ekfh0, String s, long v, azug azug0) {
        super(0x87, "FetchGmsBackupStatsOps", azug0);
        this.b = ekfh0;
        this.c = s;
        this.d = v;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        String s = this.c;
        long v = this.d;
        gsug gsug0 = ekgy.a.b(s, Long.toString(v));
        ArrayList arrayList0 = new ArrayList();
        if(gsug0 == null) {
            ((ggtj)((ggtj)ekgt.a.i()).ar(0x351A)).Q("No response found in cache for  account %s, deviceId %d", s, v);
            ApiMetadata apiMetadata0 = cckf.d(bbdp.ez);
            this.b.f(Status.d, arrayList0, apiMetadata0);
            return;
        }
        HashMap hashMap0 = new HashMap();
        for(Object object0: gsug0.c) {
            gsva gsva0 = (gsva)object0;
            if(hashMap0.containsKey(gsva0.i)) {
                hashMap0.put(gsva0.i, Integer.valueOf(((int)(((Integer)hashMap0.get(gsva0.i)))) + 1));
            }
            else {
                hashMap0.put(gsva0.i, Integer.valueOf(1));
            }
        }
        for(Object object1: hashMap0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            arrayList0.add(new SourceStatsEntity(((String)map$Entry0.getKey()), ((Integer)map$Entry0.getValue()), ((int)("com.google".equals(map$Entry0.getKey()) ? 0 : ((int)(((Integer)map$Entry0.getValue())))))));
        }
        ((ggtj)((ggtj)ekgt.a.h()).ar(0x3519)).X("Number of source stats found for account %s, device %d : %d", s, Long.valueOf(v), Integer.valueOf(arrayList0.size()));
        ApiMetadata apiMetadata1 = cckf.d(bbdp.ez);
        this.b.f(Status.b, arrayList0, apiMetadata1);
    }

    @Override  // cjtm
    public final void j(Status status0) {
    }
}

