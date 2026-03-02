import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configurations;
import j..time.Duration;

public final class eisk extends eiqt {
    private final bboh a;
    private final String b;
    private final eiqg c;
    private final eisl d;

    public eisk(eiqg eiqg0, String s, eisl eisl0) {
        super("RegisterSyncOperationCall", hlse.t);
        this.a = bboh.b("RegisterSyncOperation", bbcu.al);
        this.b = s;
        batl.s(eiqg0);
        this.c = eiqg0;
        this.d = eisl0;
    }

    @Override  // eiqt
    public final hlrh b() {
        hlrg hlrg0 = (hlrg)((ProtoLiteMessage)hlrh.a).v_newBuilder();
        eisl eisl0 = this.d;
        gocn gocn0 = eisl0.a;
        String s = gocn0.g;
        if(!hlrg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlrg0).ensureMutable();
        }
        hlrh hlrh0 = (hlrh)hlrg0.b_message;
        s.getClass();
        hlrh0.b |= 1;
        hlrh0.c = s;
        int v = gocn0.c == 2 ? ((int)(((Integer)gocn0.d))) : 0;
        if(!hlrg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlrg0).ensureMutable();
        }
        hlrh hlrh1 = (hlrh)hlrg0.b_message;
        hlrh1.b |= 2;
        hlrh1.d = v;
        hlrg0.a(gocn0.i);
        eisn eisn0 = eisl0.b;
        if(eisn0 != null) {
            if(!hlrg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlrg0).ensureMutable();
            }
            hlrh hlrh2 = (hlrh)hlrg0.b_message;
            hlrh2.b |= 0x100;
            hlrh2.j = eisn0.b.x;
        }
        return (hlrh)((ProtoLiteBuilder)hlrg0).N_build();
    }

    @Override  // eiqt
    public final hlrv c() {
        hlrs hlrs0 = this.d.c;
        return hlrs0 == null ? null : ((hlrv)((ProtoLiteBuilder)hlrs0).N_build());
    }

    @Override  // eiqt
    public final void i(Context context0, eiox eiox0) {
        hlrs hlrs0;
        eisl eisl0 = this.d;
        Configurations configurations0 = eisl0.a(context0, eiox0);
        if(!hxmk.d()) {
            ((ggtj)this.a.h()).B("Not retrying registerSync since Sync__retry_register_sync is %s", Boolean.valueOf(hxmk.d()));
        }
        else if(eisk.m(configurations0)) {
            hxmk hxmk0 = hxmk.a;
            hfuo hfuo0 = hxmk0.c().m().b;
            String s = this.b;
            if(hfuo0.contains(eipn.d(s))) {
                long v = hxmk0.c().i();
                long v1 = hxmk0.c().h();
                long v2 = v;
                Configurations configurations1 = configurations0;
                while(eisk.m(configurations1) && v2 > 0L) {
                    ((ggtj)this.a.j()).Y("Retrying registerSync for %s, attempt %d / %d, delay %d ms", s, Long.valueOf(v - v2 + 1L), Long.valueOf(v), Long.valueOf(v1));
                    try {
                        glxt.a(Duration.ofMillis(v1));
                        hlrs0 = eisl0.c;
                    }
                    catch(InterruptedException interruptedException0) {
                        ((ggtj)((ggtj)this.a.i()).s(interruptedException0)).B("Interruption while waiting to retry registerSync for %s", this.b);
                        throw new eipa(0x7369, "Interrupted while waiting to retry registerSync.");
                    }
                    if(hlrs0 != null) {
                        if(hlrs0.a_defaultInstance.isImmutable()) {
                            throw new IllegalArgumentException("Default instance must be immutable.");
                        }
                        hlrs0.b_message = ((ProtoLiteBuilder)hlrs0).P_newInstance();
                    }
                    configurations1 = eisl0.a(context0, eiox0);
                    --v2;
                    v1 *= hxmk0.c().g();
                }
                if(eisk.m(configurations1)) {
                    ((ggtj)this.a.j()).A("Configs are still empty after %d retries", v);
                    throw new eioz(0x736A, "Failed to registerSync for " + s + " after " + v + " retries.");
                }
            }
            else {
                ((ggtj)this.a.h()).B("Not retrying registerSync since package: %s is not in Sync__retry_register_sync_static_config_packages.", eipn.d(this.b));
            }
        }
        this.c.f(Status.b, configurations0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.f(status0, null);
    }

    private static boolean m(Configurations configurations0) {
        return hxmk.a.c().w() ? gfta.c(configurations0.a) : configurations0.g <= 0L;
    }
}

