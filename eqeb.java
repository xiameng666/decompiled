import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.SourceDevice;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import j..util.Objects;

final class eqeb extends cuvg {
    final eqed a;

    public eqeb(eqed eqed0) {
        Objects.requireNonNull(eqed0);
        this.a = eqed0;
        super();
    }

    @Override  // cuvg
    public final void b(String s, cuvf cuvf0) {
        baun baun0 = eqed.a;
        baun0.d("Incoming connection request from %s", new Object[]{s});
        if(hyhm.a.b().c()) {
            eqtn eqtn0 = this.a.e;
            if(eqtn0 != null) {
                baun0.d("Stop fastpair advertising.", new Object[0]);
                eqtn0.a();
            }
        }
        String s1 = cuvf0.a;
        eqed eqed0 = this.a;
        eqed0.h = eqnf.b(s1);
        eqnf eqnf0 = eqed0.h;
        if(eqnf0 == null) {
            baun0.j("With name: %s", new Object[]{s1});
        }
        else {
            baun0.j("With name: %s", new Object[]{eqnf0});
            int v = eqsh.z(eqnf0.a());
            ProtoLiteBuilder hftp0 = eqed0.c.f;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gjmz)hftp0.b_message).h = v - 1;
            ((gjmz)hftp0.b_message).b |= 0x20;
        }
        String s2 = eqed0.f;
        if(s2 != null) {
            baun0.d("Connection to %s already in progress", new Object[]{s2});
            eqed0.d.f(s);
            return;
        }
        eqmz eqmz0 = eqed0.g;
        eqmj eqmj0 = eqed0.j;
        if(eqmj0 != null && eqmz0 != null) {
            eqed0.f = s;
            String s3 = cuvf0.b;
            String s4 = eqng.a(s3, eqmz0.a().d());
            if(eqed0.n != null) {
                eqed0.o = new epwf(eqhi.a(1, s3, eqed0.n), eqmj0, eqed0.d);
            }
            eqed0.i = s4;
            eqmu eqmu0 = new eqmu(eqed0.p, eqed0.r);
            eqed0.d.c(s, eqmu0);
            eqmg eqmg0 = eqed0.c.e;
            ProtoLiteBuilder hftp1 = eqmg0.b;
            int v1 = glwy.a(SystemClock.elapsedRealtime() - eqmg0.a);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gjpj gjpj0 = (gjpj)hftp1.b_message;
            gjpj0.b |= 2;
            gjpj0.d = v1;
            if(eqed0.h == null || !eqed0.h.i()) {
                baun0.j(a.a(s4, "Forwarding pin (", ") to bootstrap controller."), new Object[0]);
                ((eqmv)eqmj0).a.b(s4);
            }
        }
    }

    @Override  // cuvg
    public final void c(String s, cuvl cuvl0) {
        eqed eqed0 = this.a;
        if(!s.equals(eqed0.f)) {
            eqed.a.j("Unexpected endpoint (%s) result %s", new Object[]{s, cuvl0.a});
            return;
        }
        eqmj eqmj0 = eqed0.j;
        if(eqmj0 == null) {
            return;
        }
        Status status0 = cuvl0.a;
        if(!status0.e()) {
            int v = status0.i;
            eqed.a.m("Connection to %s rejected (%d)", new Object[]{s, v});
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)eqoc.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((eqoc)hftv0).c = 1;
            ((eqoc)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            eqoc eqoc0 = (eqoc)hftp0.b_message;
            eqoc0.b |= 2;
            eqoc0.d = v;
            eqmj0.d(v, ((eqoc)hftp0.N_build()));
            ProtoLiteBuilder hftp1 = eqed0.c.e.b;
            ProtoLiteMessage hftv1 = hftp1.b_message;
            int v1 = ((gjpj)hftv1).f + 1;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            gjpj gjpj0 = (gjpj)hftp1.b_message;
            gjpj0.b |= 8;
            gjpj0.f = v1;
            eqed0.f = null;
            return;
        }
        baun baun0 = eqed.a;
        baun0.d("Connected to source device %s", new Object[]{s});
        eqmg eqmg0 = eqed0.c.e;
        ProtoLiteBuilder hftp2 = eqmg0.b;
        int v2 = glwy.a(SystemClock.elapsedRealtime() - eqmg0.a);
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gjpj gjpj1 = (gjpj)hftp2.b_message;
        gjpj1.b |= 4;
        gjpj1.e = v2;
        cuvm cuvm0 = eqed0.d;
        cuvm0.s();
        TargetConnectionArgs targetConnectionArgs0 = new TargetConnectionArgs();
        targetConnectionArgs0.b = new SourceDevice();
        targetConnectionArgs0.a.add(Integer.valueOf(2));
        if(eqed0.o != null && (eqed0.h != null && eqed0.h.i())) {
            baun0.j("Attempting to connect to source with out-of-band", new Object[0]);
            eqed0.k = eqed0.o.b(s);
            return;
        }
        eqmj0.a(new eqgo(cuvm0, s), targetConnectionArgs0);
    }

    @Override  // cuvg
    public final void d(String s) {
        eqed eqed0 = this.a;
        eqmj eqmj0 = eqed0.j;
        if(eqed0.f != null && eqmj0 != null) {
            eqed.a.d("Disconnected from source device. %s", new Object[]{s});
            ProtoLiteBuilder hftp0 = eqed0.c.e.b;
            ProtoLiteMessage hftv0 = hftp0.b_message;
            int v = ((gjpj)hftv0).g + 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjpj gjpj0 = (gjpj)hftp0.b_message;
            gjpj0.b |= 16;
            gjpj0.g = v;
            eqed0.i = null;
            eqed0.f = null;
            eqmj0.c();
            eqed0.j = null;
        }
    }
}

