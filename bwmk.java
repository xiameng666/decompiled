import android.content.Context;
import android.os.SystemClock;
import android.util.TimingLogger;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import j..util.Objects;

final class bwmk extends bwzp {
    final boolean a;
    final boolean b;
    final ggfp c;
    final bwmx d;

    public bwmk(bwmx bwmx0, gltq gltq0, boolean z, boolean z1, ggfp ggfp0) {
        this.a = z;
        this.b = z1;
        this.c = ggfp0;
        Objects.requireNonNull(bwmx0);
        this.d = bwmx0;
        super(gltq0);
    }

    @Override  // bwzp
    public final void w() {
        glol glol0;
        long v = SystemClock.elapsedRealtime();
        TimingLogger timingLogger0 = new TimingLogger("Icing", "post-init");
        bwmx bwmx0 = this.d;
        bxax bxax0 = bwmx0.f;
        if(bxax0 == null) {
            bwne.k("Failed to update app params.");
            return;
        }
        Context context0 = bwmx0.b;
        if(bxax0.D()) {
            cljp.a(context0).f(elfn.c(false));
        }
        if(this.a) {
            bwmx0.q.b();
        }
        else {
            boolean z = this.b;
            if(z) {
                gged_interceptors gged0 = bwmx0.e().l();
                int v1 = ((ggna)gged0).c;
                for(int v2 = 0; v2 < v1; ++v2) {
                    bwnq bwnq0 = (bwnq)gged0.get(v2);
                    bwog bwog0 = bwmx.b(bwur.E(bwnq0));
                    if(bwmx0.m == null || !bwmx0.m.x(bwnq0.j, bwnq0.c, bwog0)) {
                        bwmx0.r.d("add_all_active_corpora_failed");
                        bwne.g("Add corpus from %s failed", bwnq0.f);
                    }
                }
            }
            NativeIndex nativeIndex0 = bwmx0.m;
            if(nativeIndex0 == null) {
                bwne.k("Failed to get native index.");
                return;
            }
            if(z && !nativeIndex0.z(bwux.a())) {
                bwne.k("Failed to rebuild index.");
            }
            bwoj bwoj0 = bwux.a();
            byte[] arr_b = NativeIndex.nativeRestoreIndex(nativeIndex0.b, bwoj0.toBytesArray());
            try {
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)glol.a), arr_b, 0, arr_b.length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                glol0 = (glol)hftv0;
            }
            catch(hfur hfur0) {
                bwne.j(hfur0, "Failed parsing index restoration stats response", new Object[0]);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glol.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((glol)hftp0.b_message).c = 4;
                ((glol)hftp0.b_message).b |= 1;
                glol0 = (glol)hftp0.N_build();
            }
            timingLogger0.addSplit("index-restored");
            bwmx bwmx1 = this.d;
            bwts bwts0 = bwmx1.r;
            long v3 = huax.a.g().m();
            if(bwts0.m(v3, false)) {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)glnz.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                glnz glnz0 = (glnz)hftp1.b_message;
                glol0.getClass();
                glnz0.E = glol0;
                glnz0.c |= 0x1000;
                if(huae.g()) {
                    bwts0.t(hftp1);
                    bwts0.a.d(cdef.dJ, 6012, hftp1);
                }
                else {
                    bwts0.s(6012, hftp1, v3);
                }
            }
            if(System.currentTimeMillis() > bxax0.e() + hubd.a.b().a()) {
                bwne.k("No maintenance for too long");
                bwts0.d("no_maint_too_long");
                bwmx1.s();
                timingLogger0.addSplit("forced-maintenance");
            }
            ggfp ggfp0 = this.c;
            if(ggfp0 != null && !ggfp0.isEmpty()) {
                bwne.l("%d corpora need re-polling", Integer.valueOf(ggfp0.size()));
                ggqj ggqj0 = ggfp0.om();
                while(ggqj0.hasNext()) {
                    Object object0 = ggqj0.next();
                    bwvl bwvl0 = (bwvl)object0;
                    bwvg bwvg0 = bwmx1.n;
                    if(bwvg0 != null) {
                        bwnr bwnr0 = bwmx1.e().e(bwvl0);
                        if(bwnr0 != null) {
                            bwny bwny0 = bwnr0.d == null ? bwny.a : bwnr0.d;
                            if((bwnx.a(bwny0.d) == 0 || bwnx.a(bwny0.d) == 1) && bwur.F((bwnr0.c == null ? bwnq.a : bwnr0.c)) && bwmx.J((bwnr0.c == null ? bwnq.a : bwnr0.c).d)) {
                                bwvg0.a(bwvl0);
                            }
                        }
                    }
                }
                bwrc bwrc0 = bwmx1.p;
                if(bwrc0 != null) {
                    bwrc0.c();
                }
            }
            if(!nativeIndex0.y()) {
                bwne.k("Failed to delete usage reports.");
            }
            Context context1 = bwmx1.b;
            if(bxax0.C()) {
                bwkf.b(context1);
            }
        }
        this.d.z(glro.b, v);
        timingLogger0.dumpToLog();
        bwne.k("Post-init done");
    }
}

