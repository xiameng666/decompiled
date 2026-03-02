import android.os.Process;
import com.google.android.gms.auth.proximity.RemoteDevice;

public final class alao implements alaz {
    public static final baun a;
    public final albe b;
    public final String c;
    public final alce d;
    public final alnb e;
    public int f;
    final alau g;
    private final bbpj h;

    static {
        alao.a = new baun("ProximityAuth", new String[]{"ExoConnection"});
    }

    public alao(albe albe0, String s, alce alce0, alnb alnb0, bbpj bbpj0) {
        this.f = 0;
        this.b = albe0;
        this.e = alnb0;
        this.g = alnb0 == null ? null : new alau(alnb0);
        albe0.m = new alaj(this);
        albe0.n = new alak(this);
        albe0.o = new alal();
        this.c = s;
        this.d = alce0;
        this.h = bbpj0;
    }

    @Override  // alaz
    public final void a(boolean z, String s) {
        baun baun0 = alao.a;
        baun0.h("sendGetAppsAccessStateResponse. state:%s", new Object[]{Boolean.valueOf(z)});
        if(!this.h(s)) {
            baun0.d("Ignore sending GetAppsAccessStateResponse. Account is not match:%s", new Object[]{s});
            return;
        }
        alol.a(s).k(z);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aldn.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((aldn)hftv0).b = 1;
        aldk aldk0 = z ? aldk.c : aldk.b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        aldn aldn0 = (aldn)hftp0.b_message;
        aldn0.c = aldk0.a();
        aldn aldn1 = (aldn)hftp0.N_build();
        String s1 = this.c;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)aldl.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        aldl aldl0 = (aldl)hftp1.b_message;
        aldn1.getClass();
        aldl0.c = aldn1;
        aldl0.b = 8;
        alan.a(s1, ((aldl)hftp1.N_build()));
    }

    public final void b(boolean z) {
        alao.a.h("sendAppPolicyStateMessage", new Object[0]);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aldp.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((aldp)hftp0.b_message).b = (z ? 4 : 3) - 2;
        aldp aldp0 = (aldp)hftp0.N_build();
        String s = this.c;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)aldl.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        aldl aldl0 = (aldl)hftp1.b_message;
        aldp0.getClass();
        aldl0.c = aldp0;
        aldl0.b = 10;
        alan.a(s, ((aldl)hftp1.N_build()));
    }

    public final void c(aldt aldt0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aldl.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aldl aldl0 = (aldl)hftp0.b_message;
        aldt0.getClass();
        aldl0.c = aldt0;
        aldl0.b = 6;
        aldl aldl1 = (aldl)hftp0.N_build();
        alan.a(this.c, aldl1);
    }

    public final void d(aldw aldw0) {
        alao.a.h("Sending signaling response", new Object[0]);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aldl.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aldl aldl0 = (aldl)hftp0.b_message;
        aldw0.getClass();
        aldl0.c = aldw0;
        aldl0.b = 2;
        aldl aldl1 = (aldl)hftp0.N_build();
        alan.a(this.c, aldl1);
    }

    public final void e(aldx aldx0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aldl.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aldl aldl0 = (aldl)hftp0.b_message;
        aldx0.getClass();
        aldl0.c = aldx0;
        aldl0.b = 9;
        aldl aldl1 = (aldl)hftp0.N_build();
        alan.a(this.c, aldl1);
        if(hpzm.D()) {
            for(Object object0: alpa.b().d()) {
                ((aloz)object0).p(true);
            }
        }
    }

    public final void f() {
        if(hpzc.g()) {
            alce alce0 = this.d;
            if(alce0.c()) {
                alao.a.h("Stopping proximity checks", new Object[0]);
                alce0.a();
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aldx.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((aldx)hftp0.b_message).b = 2;
                this.e(((aldx)hftp0.N_build()));
            }
        }
        this.f = 3;
    }

    public final boolean g(int v) {
        if(!hpzm.s()) {
            alao.a.f("XPF-getPendingIntentForUser() called but enableCrossProfileConnector is off.", new Object[0]);
            return false;
        }
        if(this.e == null) {
            alao.a.f("XPF-getPendingIntentForUser() called but connector is null", new Object[0]);
            return false;
        }
        if(this.g == null) {
            alao.a.f("XPF-getPendingIntentForUser() called but profilePendingIntentCreator is null", new Object[0]);
            return false;
        }
        if(!hpzm.A()) {
            alao.a.f("XPF-getPendingIntentForUser() called but enablePersonalToWorkStreaming is off.", new Object[0]);
            return false;
        }
        if(!this.h.h()) {
            alao.a.f("XPF-getPendingIntentForUser() called on personal profile.", new Object[0]);
            return false;
        }
        if(v == Process.myUserHandle().getIdentifier()) {
            alao.a.f("XPF-getPendingIntentForUser() called for the current user id.", new Object[0]);
            return false;
        }
        return true;
    }

    public final boolean h(String s) {
        akzn akzn0 = akzn.c();
        String s1 = this.c;
        RemoteDevice remoteDevice0 = akzn0.b(s1);
        if(remoteDevice0 == null) {
            alao.a.m("Failed to get RemoteDevice data for device ID %s", new Object[]{s1});
            return false;
        }
        return remoteDevice0.d.equals(s);
    }
}

