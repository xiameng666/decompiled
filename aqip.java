import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.backup.ParcelableDevice;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.ArrayList;

public final class aqip extends cjtm {
    private static final aqql a;
    private final asas b;
    private final aqwe c;
    private final Account d;

    static {
        aqip.a = new aqql(new String[]{"GetAvailableRestoreSets"});
    }

    public aqip(aqee aqee0, aqwe aqwe0, asas asas0, Account account0, azug azug0) {
        super(201, "GetAvailableRestoreSets", azug0);
        gftb.check(asas0);
        this.b = asas0;
        this.c = aqwe0;
        if(account0 == null) {
            account0 = aqee0.a();
            gftb.check(account0);
        }
        this.d = account0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        Account account0 = this.d;
        aqip.a.j("Getting the restore sets for %s", new Object[]{account0.name});
        try {
            String s = new adgg(context0).b(context0, account0, "android");
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aqfa.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            aqfa.b(((aqfa)hftp0.b_message));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            aqfa aqfa0 = (aqfa)hftp0.b_message;
            aqfa0.b |= 0x20;
            aqfa0.d = true;
            int v = (int)hqjw.a.b().a();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            aqfa aqfa1 = (aqfa)hftp0.b_message;
            aqfa1.b |= 1;
            aqfa1.c = v;
            aqfa aqfa2 = (aqfa)hftp0.N_build();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)aqfe.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            aqfe aqfe0 = (aqfe)hftp1.b_message;
            s.getClass();
            aqfe0.b |= 16;
            aqfe0.f = s;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            aqfe aqfe1 = (aqfe)hftp1.b_message;
            aqfa2.getClass();
            aqfe1.m = aqfa2;
            aqfe1.b |= 0x1000;
            if(hqhk.c()) {
                long v1 = bbmq.d(context0);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                aqfe aqfe2 = (aqfe)hftp1.b_message;
                aqfe2.b |= 2;
                aqfe2.d = v1;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                aqfe aqfe3 = (aqfe)hftp1.b_message;
                aqfe3.b |= 1;
                aqfe3.c = 0L;
            }
            else {
                long v2 = bbmq.d(context0);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                aqfe aqfe4 = (aqfe)hftp1.b_message;
                aqfe4.b |= 1;
                aqfe4.c = v2;
            }
            aqfo aqfo0 = this.c.c(account0, hftp1);
            aqwg.b(aqfo0);
            int v3 = aqfo0.g.size();
            ArrayList arrayList0 = new ArrayList(v3);
            for(int v4 = 0; v4 < v3; ++v4) {
                arrayList0.add(new ParcelableDevice(((aqfl)aqfo0.g.get(v4)).toBytesArray()));
            }
            ApiMetadata apiMetadata0 = cckf.d(bbdp.aa);
            this.b.a(arrayList0, apiMetadata0);
        }
        catch(aqxw | IOException | acse exception0) {
            aqip.a.g("Error getting the restore sets", exception0, new Object[0]);
            this.j(Status.d);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        aqip.a.f("Failure, status=", new Object[]{status0.toString()});
        this.b.a(ggna.a, ApiMetadata.b);
    }
}

