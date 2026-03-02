import android.util.Log;

public final class fdbc implements evpo {
    public final fdbf a;
    public final ffco b;

    public fdbc(fdbf fdbf0, ffco ffco0) {
        this.a = fdbf0;
        this.b = ffco0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        fdbf fdbf0 = this.a;
        ffco ffco0 = this.b;
        if(evql0.n()) {
            if(Log.isLoggable("wearable.ConsentRecord", 3)) {
                Log.d("wearable.ConsentRecord", "watch specific consents exits, updating it");
            }
            if(ffco0.g.isEmpty()) {
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ffco0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)ffco0));
                String s = (String)evql0.j();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ffco ffco1 = (ffco)hftp0.b_message;
                s.getClass();
                ffco1.b |= 16;
                ffco1.g = s;
                hfwn hfwn0 = hfyn.l();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ffco ffco2 = (ffco)hftp0.b_message;
                hfwn0.getClass();
                ffco2.h = hfwn0;
                ffco2.b |= 0x20;
                ffco0 = (ffco)hftp0.N_build();
            }
            return fdbf0.f(ffco0, false);
        }
        if(((evqu)evql0).d) {
            if(Log.isLoggable("wearable.ConsentRecord", 5)) {
                Log.w("wearable.ConsentRecord", "updateOptInConsent cancelled");
            }
            return evrg.b();
        }
        if(Log.isLoggable("wearable.ConsentRecord", 5)) {
            Log.w("wearable.ConsentRecord", "watch specific consents doesn\'t exits, updating global consents");
        }
        return fdbf0.g(ffco0);
    }
}

