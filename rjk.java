import android.content.Intent;
import j..time.Instant;
import java.util.Map;
import java.util.Objects;

public final class rjk implements lpp {
    private final ibth a;
    private final Intent b;
    private final ibth c;
    private final rjr d;
    private boolean e;

    public rjk(ibth ibth0, Intent intent0, ibth ibth1, rjr rjr0) {
        ibuq.f(intent0, "intent");
        super();
        this.a = ibth0;
        this.b = intent0;
        this.c = ibth1;
        this.d = rjr0;
    }

    @Override  // lpp
    public final void a(lps lps0, lpe lpe0) {
        long v2;
        switch(lpe0.ordinal()) {
            case 2: {
                long v = rnx.b(this.b);
                long v1 = -1L;
                if(v == -1L) {
                    Objects.toString(this.a);
                    sct.e("OnboardingApiContract", this.a.toString() + " does not contain node id.");
                    v2 = -1L;
                }
                else {
                    v2 = v;
                }
                rjr rjr0 = this.d;
                rpv rpv0 = rqa.c;
                Instant instant0 = Instant.now();
                ibuq.f(instant0, "timestamp");
                rpv0.a(new rpb(rjr0.o(), v2, instant0));
                if(v2 != -1L) {
                    Long long0 = v2;
                    Map map0 = rjr.a;
                    if(map0.containsKey(long0)) {
                        Long long1 = (Long)map0.get(long0);
                        if(long1 != null) {
                            v1 = (long)long1;
                        }
                        Instant instant1 = Instant.now();
                        ibuq.f(instant1, "timestamp");
                        rpv0.a(new rpd(rjr0.o(), v1, v2, instant1));
                        map0.remove(long0);
                    }
                }
                return;
            }
            case 3: 
            case 4: {
                this.b();
                return;
            }
            case 5: {
                this.b();
                Long long2 = rnx.b(this.b);
                rjr.a.remove(long2);
                return;
            }
            case 0: 
            case 1: 
            case 6: {
                return;
            }
            default: {
                throw new ibnq();
            }
        }
    }

    private final void b() {
        if(!this.e && ((Boolean)this.c.a()).booleanValue()) {
            this.e = true;
            long v = rnx.b(this.b);
            Instant instant0 = Instant.now();
            ibuq.f(instant0, "timestamp");
            roz roz0 = new roz(this.d.o(), v, instant0);
            rqa.c.a(roz0);
        }
    }
}

