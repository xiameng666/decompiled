import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.Set;

public final class ayvr extends aytx {
    public ayvr(ayvs ayvs0, ByteString hfsf0) {
        super(ayvs0);
        hftr hftr0 = this.n;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hlpp hlpp0 = (hlpp)hftr0.b_message;
        hlpp0.b |= 0x800;
        hlpp0.j = hfsf0;
    }

    @Override  // aytx
    public final aytx b() {
        for(Object object0: ((ayvs)this.a).n) {
            this = ((ayvq)object0).a();
            if(this == null) {
                return null;
            }
        }
        return this;
    }

    @Override  // aytx
    public final LogEventParcelable c() {
        gikn gikn0 = this.c;
        if(gikn0 != null) {
            hftr hftr0 = this.n;
            ByteString hfsf0 = gikn0.getDefaultInstanceForType();
            if(!hftr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr0).ensureMutable();
            }
            hlpp hlpp0 = (hlpp)hftr0.b_message;
            hlpp0.b |= 0x80000;
            hlpp0.m = hfsf0;
        }
        hlpp hlpp1 = (hlpp)((ProtoLiteBuilder)this.n).N_build();
        ayvs ayvs0 = (ayvs)this.a;
        PlayLoggerContext playLoggerContext0 = new PlayLoggerContext(ayvs0.i, aytu.a(ayvs0.g), this.j, this.i, this.f(), null, false, ayvs0.j);
        byte[] arr_b = hlpp1.toBytesArray();
        int[] arr_v = aytu.g(this.d);
        String[] arr_s = null;
        String[] arr_s1 = this.e == null ? null : ((String[])this.e.toArray(aytu.b));
        int[] arr_v1 = aytu.g(this.f);
        ExperimentTokens[] arr_experimentTokens = this.g == null ? null : ((ExperimentTokens[])this.g.toArray(aytu.a));
        Set set0 = this.h;
        if(set0 != null) {
            arr_s = (String[])set0.toArray(aytu.b);
        }
        return new LogEventParcelable(playLoggerContext0, hlpp1, arr_b, arr_v, arr_s1, arr_v1, arr_experimentTokens, arr_s, hlpp1.g, null);
    }

    @Override  // aytx
    public final evql d() {
        if(this.b) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        this.b = true;
        return ((ayvs)this.a).m.h(this);
    }
}

