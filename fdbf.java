import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.wearable.PutDataRequest;
import j..util.DesugarArrays;
import j..util.Objects;
import j..util.stream.Stream;
import java.util.List;

public final class fdbf {
    public final fcer a;
    public final fcfg b;
    public final fcej c;
    private final fced d;

    public fdbf(fcer fcer0, fcfg fcfg0, fcej fcej0, fced fced0) {
        this.a = fcer0;
        this.b = fcfg0;
        this.c = fcej0;
        this.d = fced0;
    }

    public final evql a() {
        return this.b.g().g(new fdax(this)).g(new fday());
    }

    public final evql b(String s) {
        if(!fdci.b()) {
            if(Log.isLoggable("wearable.ConsentRecord", 3)) {
                Log.d("wearable.ConsentRecord", "ConsentsPerWatch is not enabled, will read Global Consents");
            }
            return this.a();
        }
        if(TextUtils.isEmpty(s)) {
            if(Log.isLoggable("wearable.ConsentRecord", 5)) {
                Log.w("wearable.ConsentRecord", "Watch\'s nodeId is not provided, will read Global Consents");
            }
            return this.a();
        }
        if(Log.isLoggable("wearable.ConsentRecord", 3)) {
            Log.d("wearable.ConsentRecord", "ConsentsPerWatch is enabled, will read from watch specific DataItem");
        }
        return this.c(s).e(new fdbd(this));
    }

    public final evql c(String s) {
        return this.b.g().g(new fdao(this, s)).g(new fdaw());
    }

    public final evql d(boolean z) {
        fdfy fdfy0 = new fdfy(this.c.a, this.c.D, z);
        this.c.D.c(fdfy0);
        return batf.c(fdfy0);
    }

    public final evql e(ffco ffco0) {
        return this.f(ffco0, true);
    }

    public final evql f(ffco ffco0, boolean z) {
        if(!fdci.b()) {
            if(Log.isLoggable("wearable.ConsentRecord", 4)) {
                Log.i("wearable.ConsentRecord", "ConsentPerWatch feature is not enabled, not recording consent per watch");
            }
            return this.g(fdbf.k(ffco0));
        }
        String s = ffco0.g;
        boolean z1 = ffco0.d;
        if(TextUtils.isEmpty(s)) {
            if(Log.isLoggable("wearable.ConsentRecord", 6)) {
                Log.e("wearable.ConsentRecord", "NodeId is null, cannot proceed with ConsentPerWatch request");
            }
            return evrg.c(new IllegalArgumentException("nodeId is not set"));
        }
        if(Log.isLoggable("wearable.ConsentRecord", 4)) {
            Log.i("wearable.ConsentRecord", "Updating consents for watch: " + s);
        }
        PutDataRequest putDataRequest0 = PutDataRequest.a(("/privacy_settings/" + s));
        putDataRequest0.c = ffco0.toBytesArray();
        return z ? this.d.g("consents_per_watch", 0).g(new fdbe(this, s, ffco0, z1, putDataRequest0)) : this.h(z1, new PutDataRequest[]{putDataRequest0});
    }

    public final evql g(ffco ffco0) {
        PutDataRequest putDataRequest0 = PutDataRequest.a("/privacy_settings");
        putDataRequest0.c = ffco0.toBytesArray();
        return this.h(ffco0.d, new PutDataRequest[]{putDataRequest0});
    }

    public final evql h(boolean z, PutDataRequest[] arr_putDataRequest) {
        Stream stream0 = DesugarArrays.stream(arr_putDataRequest);
        Objects.requireNonNull(this.a);
        evql evql0 = evrg.e(((List)stream0.map(new fdaq(this.a)).collect(ggaf.a)));
        evql0.b(new fdar());
        evql0.A(new fdas());
        evql0.a(new fdat());
        evql evql1 = evql0.g(new fdau(this, z));
        evql1.z(new fdav());
        return evql1;
    }

    public static fdbf i(Context context0) {
        return new fdbf(fcfo.c(context0), fcfo.e(context0), fcfo.b(context0), fcfo.a(context0));
    }

    public static ffco j(fceu fceu0) {
        byte[] arr_b = fceu0.c();
        try {
            batl.s(arr_b);
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ffco.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return (ffco)hftv0;
        }
        catch(hfur hfur0) {
            throw new IllegalStateException("Failed to parse consent record from dataitem", hfur0);
        }
    }

    public static ffco k(ffco ffco0) {
        if((ffco0.b & 16) != 0) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ffco0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)ffco0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ffco ffco1 = (ffco)hftp0.b_message;
            ffco1.b &= -17;
            ffco1.g = ffco.a.g;
            return (ffco)hftp0.N_build();
        }
        return ffco0;
    }
}

