import android.content.Context;
import com.google.android.gms.clearcut.sampler.SamplerConfigParcelable;
import com.google.android.gms.clearcut.sampler.SamplerDecisionParcelable;
import com.google.android.gms.common.api.Status;
import j..time.Duration;
import j..time.Instant;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;

final class azdt extends cjtm {
    final SamplerConfigParcelable a;
    final azdv b;
    public static final int c;
    private final Instant d;
    private final Supplier e;

    public azdt(Context context0, SamplerConfigParcelable samplerConfigParcelable0, azdv azdv0) {
        Instant instant0 = Instant.now();
        azds azds0 = new azds(context0);
        super(414, "getSamplingDecision");
        this.b = azdv0;
        this.a = samplerConfigParcelable0;
        this.d = instant0;
        this.e = azds0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        SamplerDecisionParcelable samplerDecisionParcelable0;
        SamplerConfigParcelable samplerConfigParcelable0 = this.a;
        Status status0 = Status.b;
        double f = samplerConfigParcelable0.b;
        boolean z = false;
        if(Double.compare(f, 0.0) >= 0) {
            int v = Double.compare(f, 1.0);
            if(v > 0) {
                samplerDecisionParcelable0 = new SamplerDecisionParcelable(false, 0x7FFFFFFFFFFFFFFFL);
            }
            else if(f == 0.0) {
                samplerDecisionParcelable0 = new SamplerDecisionParcelable(false, 0x7FFFFFFFFFFFFFFFL);
            }
            else if(v == 0) {
                samplerDecisionParcelable0 = new SamplerDecisionParcelable(true, 0x7FFFFFFFFFFFFFFFL);
            }
            else {
                Instant instant0 = this.d;
                Supplier supplier0 = this.e;
                long v1 = (long)(((Long)supplier0.get()));
                Duration duration0 = Duration.ofDays(samplerConfigParcelable0.d);
                Duration duration1 = Duration.ofDays(samplerConfigParcelable0.c);
                gftb.checkTrue(((boolean)(duration0.isZero() ^ 1)));
                gftb.checkTrue(((boolean)(duration1.isZero() ^ 1)));
                gftb.checkTrue(duration1.compareTo(duration0) >= 0);
                Duration duration2 = duration0.multipliedBy(((long)Math.abs(((int)(v1 % ((long)(((int)(duration1.toSeconds() / duration0.toSeconds())))))))));
                Instant instant1 = Instant.ofEpochMilli(duration1.multipliedBy(azdq.a(instant0, duration1)).plus(duration2).toMillis());
                if(instant1.isAfter(instant0)) {
                    instant1 = instant1.minus(duration1);
                }
                Instant instant2 = instant1.plus(duration1);
                azdp azdp0 = new azdp(azdq.a(instant0.plus(duration2), duration1), instant2);
                long v2 = azdp0.a;
                ghga ghga0 = ghgz.a.h();
                String s = samplerConfigParcelable0.e;
                if(gfta.c(s)) {
                    ghga0.k(((long)samplerConfigParcelable0.a));
                }
                else {
                    ghga0.m(s, StandardCharsets.UTF_8);
                }
                ghga0.k(((Long)supplier0.get()).longValue());
                ghga0.k(v2);
                if(Math.abs(ghga0.s().c()) < ((long)(f * 9223372036854776000.0))) {
                    z = true;
                }
                samplerDecisionParcelable0 = new SamplerDecisionParcelable(z, azdp0.b.toEpochMilli());
            }
        }
        else {
            samplerDecisionParcelable0 = new SamplerDecisionParcelable(false, 0x7FFFFFFFFFFFFFFFL);
        }
        this.b.a(status0, samplerDecisionParcelable0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        SamplerDecisionParcelable samplerDecisionParcelable0 = new SamplerDecisionParcelable(true, 0x8000000000000000L);
        this.b.a(status0, samplerDecisionParcelable0);
    }
}

