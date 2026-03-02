import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.ExperimentTokens;

public final class eirq extends eiqt {
    public final eirs a;
    private final eiqg b;

    public eirq(eiqg eiqg0, String s, String s1, String s2, String s3) {
        super("GetExperimentTokensOperationCall", (s == null ? hlse.j : hlse.k), ((boolean)("com.google.android.gms".equals(s3) ^ 1)));
        batl.s(eiqg0);
        this.b = eiqg0;
        this.a = new eirs(s, s1, null, s2);
    }

    @Override  // eiqt
    public final hlrh b() {
        hlrg hlrg0 = (hlrg)((ProtoLiteMessage)hlrh.a).v_newBuilder();
        eirs eirs0 = this.a;
        String s = eirs0.a;
        if(s != null) {
            if(!hlrg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlrg0).ensureMutable();
            }
            hlrh hlrh0 = (hlrh)hlrg0.b_message;
            hlrh0.b |= 1;
            hlrh0.c = s;
        }
        String s1 = eirs0.b;
        if(s1 != null) {
            if(!hlrg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlrg0).ensureMutable();
            }
            hlrh hlrh1 = (hlrh)hlrg0.b_message;
            hlrh1.b();
            hlrh1.f.add(s1);
        }
        return (hlrh)((ProtoLiteBuilder)hlrg0).N_build();
    }

    @Override  // eiqt
    public final void i(Context context0, eiox eiox0) {
        ExperimentTokens experimentTokens0 = this.a.f(eiox0);
        this.b.d(Status.b, experimentTokens0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.d(status0, null);
    }
}

