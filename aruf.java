import android.content.Context;
import java.io.IOException;

public final class aruf {
    private final aqql a;
    private final Context b;

    public aruf(Context context0) {
        this.a = new aqql(new String[]{"MmsDataBytesFetcher"});
        this.b = context0;
    }

    public final long a(long v) {
        aqob aqob0;
        try {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hisq.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hisq)hftp0.b_message).d = v;
            Context context0 = this.b;
            ProtoLiteBuilder hftp1 = aqow.a(context0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hisq hisq0 = (hisq)hftp0.b_message;
            hise hise0 = (hise)hftp1.N_build();
            hise0.getClass();
            hisq0.c = hise0;
            hisq0.b |= 1;
            hisq hisq1 = (hisq)hftp0.N_build();
            if(hqjj.c()) {
                aqob0 = new aqob(context0);
            }
            else if(hqje.C()) {
                aqob0 = new aqok(context0);
            }
            else {
                aqob0 = new aqov(context0);
            }
            return aqob0.c(hisq1).d;
        }
        catch(aqxy | aqxu | aqyb | IOException | acse | iapl exception0) {
            this.a.g("Got exception while trying to fetch MMS size", exception0, new Object[0]);
            return 0L;
        }
    }
}

