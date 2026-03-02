import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.phone.internal.SmsRetrieverEvent;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

public final class ahxj {
    public static final bboh a;
    public final ahyx b;
    public final gfza c;
    public final aiah d;
    public final aiak e;
    public final aiab f;
    public final aiaa g;
    public final aiaf h;

    static {
        ahxj.a = bboh.b("AutofillRequestHandler", bbcu.cD);
    }

    public ahxj(aiak aiak0, aiab aiab0, aiaa aiaa0, aiaf aiaf0) {
        this.b = new ahxh(this);
        this.c = new gfza();
        this.d = new ahzp();
        gftb.check(aiak0);
        gftb.check(aiab0);
        gftb.check(aiaa0);
        gftb.check(aiaf0);
        this.e = aiak0;
        this.f = aiab0;
        this.g = aiaa0;
        this.h = aiaf0;
    }

    static long a() {
        return hppz.a.b().a() * 1000L;
    }

    static long b() {
        return hppw.b() * 1000L;
    }

    public final void c(String s, long v, int v1) {
        gfza gfza0 = this.c;
        gged_interceptors gged0 = gged_interceptors.i(gfza0.z());
        int v2 = gged0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            String s1 = (String)gged0.get(v3);
            gged_interceptors gged1 = gged_interceptors.i(gfza0.g(s1));
            gfza0.h(s1);
            Context context0 = this.e.b();
            if(context0 == null) {
                ((ggtj)ahxj.a.j()).x("Cannot borrow context. Ignore notifying sms code found.");
            }
            else if(hpqh.c()) {
                this.g.d(s1, s);
            }
            else if(!aicl.e(context0, s1)) {
                int v4 = gged1.size();
                for(int v5 = 0; v5 < v4; ++v5) {
                    aicq aicq0 = aicr.n(s1, v - ((long)(((Long)gged1.get(v5)))), 10, v1);
                    this.g.a(aicq0);
                }
                this.g.e(s1, 36501);
            }
            else if(new aiaw(context0).a() == 2) {
                int v6 = gged1.size();
                for(int v7 = 0; v7 < v6; ++v7) {
                    aicq aicq1 = aicr.n(s1, v - ((long)(((Long)gged1.get(v7)))), 11, v1);
                    this.g.a(aicq1);
                }
                this.g.e(s1, 36502);
            }
            else {
                for(int v8 = 0; v8 < gged1.size(); ++v8) {
                    long v9 = v - ((long)(((Long)gged1.get(v8))));
                    if(v8 == 0) {
                        aicq aicq2 = aicr.n(s1, v9, 0, v1);
                        this.g.a(aicq2);
                    }
                    else {
                        aiaa aiaa0 = this.g;
                        SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
                        aiao.d(24, smsRetrieverEvent0);
                        aiao.h(((int)TimeUnit.MILLISECONDS.toSeconds(v9)), smsRetrieverEvent0);
                        if(s1 != null) {
                            aiao.a(s1, smsRetrieverEvent0);
                        }
                        aiaa0.a(new aicq(smsRetrieverEvent0, true));
                    }
                }
                this.g.d(s1, s);
            }
        }
    }

    public final void d(long v) {
        long v1 = v - ahxj.b();
        ggdy ggdy0 = new ggdy();
        Iterator iterator0 = this.c.w().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(((long)(((Long)map$Entry0.getValue()))) <= v1) {
                ggdy0.i(((String)map$Entry0.getKey()));
                iterator0.remove();
            }
        }
        gged_interceptors gged0 = ggdy0.h();
        if(!gged0.isEmpty()) {
            int v2 = ((ggna)gged0).c;
            for(int v3 = 0; v3 < v2; ++v3) {
                String s = (String)gged0.get(v3);
                aiaa aiaa0 = this.g;
                SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
                aiao.d(13, smsRetrieverEvent0);
                if(s != null) {
                    aiao.a(s, smsRetrieverEvent0);
                }
                aiaa0.a(new aicq(smsRetrieverEvent0, true));
                Intent intent0 = ahxe.d(s);
                aiaa0.a.h.c(intent0);
            }
        }
    }
}

