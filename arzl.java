import android.content.Context;
import com.google.android.gms.backup.RestoreData;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

public final class arzl extends cjtm {
    private static final aqql a;
    private final String b;
    private final asaw c;

    static {
        arzl.a = new aqql(new String[]{"GetRestoreDataOperation"});
    }

    public arzl(asaw asaw0, String s, azug azug0) {
        super(0xB5, "GetRestoreData", azug0);
        this.c = asaw0;
        this.b = s;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        aqob aqob0;
        if(this.b != null) {
            if(hqjj.c()) {
                aqob0 = new aqob(context0);
            }
            else if(hqje.C()) {
                aqob0 = new aqok(context0);
            }
            else {
                aqob0 = new aqov(context0);
            }
            long v = new aqjk(context0).b("--");
            if(v == 0L || v == 1L) {
                if(hqje.w()) {
                    v = bbmq.d(context0);
                    goto label_15;
                }
                arzl.a.m("No ancestor Id", new Object[0]);
                throw new cjuh(13, "Device was not restored");
            }
            try {
            label_15:
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hisq.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hisq)hftp0.b_message).d = v;
                ProtoLiteBuilder hftp1 = aqow.a(context0);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hisq hisq0 = (hisq)hftp0.b_message;
                hise hise0 = (hise)hftp1.N_build();
                hise0.getClass();
                hisq0.c = hise0;
                hisq0.b |= 1;
                hisf hisf0 = aqob0.c(((hisq)hftp0.N_build()));
                this.c.a(Status.b, new RestoreData(hfyn.b((hisf0.c == null ? hfwn.a : hisf0.c)), hisf0.d), cckf.d(bbdp.af));
                return;
            }
            catch(IOException | aqxy | iapl exception1) {
                throw new cjuh(7, "Error getting restore data", null, exception1);
            }
            catch(aqyb | aqxu | acse exception0) {
                throw new cjuh(5, "Error getting auth token for account", null, exception0);
            }
        }
        throw new cjuh(5, "accountName cannot be null");
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.a(status0, null, ApiMetadata.b);
    }
}

