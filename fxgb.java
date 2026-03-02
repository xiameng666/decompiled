import android.content.Context;
import android.media.AudioManager;
import android.os.VibratorManager;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.chimera.modules.location.base.AppContextProvider;
import j..util.Objects;
import j..util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class fxgb implements Runnable {
    @Override
    public final void run() {
        fxek fxek1;
        fxgq fxgq1;
        fxgg fxgg0;
        Optional optional1;
        Optional optional0;
        fwqx fwqx0;
        fxfs fxfs0;
        fxdm fxdm0;
        fxdc fxdc0;
        Context context0 = ModuleManager.requireSubmoduleContext(AppContextProvider.a(), "earthquake_detection");
        if(!fxgs.e(context0)) {
            return;
        }
        synchronized(fxgr.class) {
            if(fxgr.b == null) {
                fxgr.b = new fxgr(context0);
                fxgr fxgr0 = fxgr.b;
                if(huwd.g() > 0L) {
                    try {
                        huwd.g();
                        Thread.sleep(huwd.g());
                    }
                    catch(InterruptedException unused_ex) {
                    }
                }
                fxgr0.h = new fxpk("EQMon");
                Context context1 = fxgr0.e;
                int v1 = 2;
                fxeg fxeg0 = new fxeg(context1, new fxnw(2, fxgr0.h));
                fxft fxft0 = new fxft();
                Objects.requireNonNull(fxeg0);
                fxgi fxgi0 = new fxgi(fxeg0);
                fxfv fxfv0 = new fxfv();
                fxgr0.h.d = new fxpp(context1, 2, bbnk.a, fxgr.a, fxft0, fxgi0, fxfv0);
                huwd huwd0 = huwd.a;
                if(!huwd0.n().av()) {
                    fxgr0.h.k(new fxpa("QPower", new fxen(context1, new fxnw(3, fxgr0.h))));
                }
                if(huwd0.n().aD()) {
                    fxpk fxpk0 = fxgr0.h;
                    Objects.requireNonNull(fxeg0);
                    fxpk0.k(new fxeh(new fxgi(fxeg0)));
                }
                if(huwd0.n().aE()) {
                    fxgr0.h.k(new fxpa("QStat", new fxdw(cmuz.a(), new fxnw(26, fxgr0.h))));
                }
                fxgs fxgs0 = new fxgs(context1, fxpb.h(huwd0.n().aj(), huwd0.n().ag()), new fxnw(1, fxgr0.h));
                fxgr0.h.k(new fxpa("QSettings", fxgs0));
                if(huwd0.n().aN()) {
                    fxej fxej0 = new fxej(context1, new fxnw(16, fxgr0.h));
                    fxgr0.h.k(new fxpa("QMem", fxej0));
                }
                fxgr0.h.k(new fxpa("QLocation", fxeg0));
                if(!huwd0.n().aw()) {
                    fxdp fxdp0 = new fxdp(context1, new fxnw(4, fxgr0.h));
                    fxgr0.h.k(new fxpa("QMotion", fxdp0));
                }
                if(huwd0.n().aA()) {
                    fxdc0 = new fxdc();
                    fxgr0.h.k(fxdc0);
                }
                else {
                    fxdc0 = new fxfw();
                }
                fxdc fxdc1 = fxdc0;
                long[] arr_v = null;
                if(huwd.A()) {
                    fxdm0 = new fxdm(new fxnw(27, fxgr0.h), ((AudioManager)context1.getSystemService("audio")), new bbll(1, 9));
                    fxgr0.h.k(new fxpa("AudSt", fxdm0));
                }
                else {
                    fxdm0 = null;
                }
                if(fxdm0 == null) {
                    fxdm0 = new fxfx();
                }
                fxgr0.h.k(new fxpm(huwd0.n().Q(), huwd0.n().M(), fxgr0.g));
                fxfp fxfp0 = new fxfp(new fxgd(), new fxfy());
                bbng bbng0 = fxgr0.f;
                fxgr0.h.k(new fxgz());
                if(huwd.k() == 0L) {
                    fxfs0 = new fxfz();
                }
                else {
                    fxfs0 = new fxfs(context1, new fxnw(11, fxgr0.h));
                    fxgr0.h.k(new fxpa("QScreen", fxfs0));
                }
                String s = huwd0.n().ai();
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: gfud.e(',').n(s)) {
                    List list0 = gfud.e(':').n(((String)object0));
                    list0.get(0);
                    list0.get(1);
                    arrayList0.add(new fxoo(Long.parseLong(((String)list0.get(0))), Integer.parseInt(((String)list0.get(1)))));
                    fxdc1 = fxdc1;
                }
                gged_interceptors gged0 = gged_interceptors.i(gged_interceptors.i(arrayList0));
                fxor fxor0 = new fxor(new bblp(1, 9));
                gmcd gmcd0 = fxor0.b.a();
                try {
                    fwqx0 = (fwqx)gmcd0.get();
                }
                catch(InterruptedException | ExecutionException unused_ex) {
                    goto label_87;
                }
                arr_v = new long[fwqx0.b.size()];
                for(int v2 = 0; v2 < fwqx0.b.size(); ++v2) {
                    arr_v[v2] = fwqx0.b.a(v2);
                }
                Arrays.sort(arr_v);
            label_87:
                Arrays.toString(arr_v);
                fxot fxot0 = new fxot(bbng0, gged0, arr_v, fxor0);
                if(bbqa.c()) {
                    long v3 = huwd.m() * 1000L;
                    fxnw fxnw0 = new fxnw(24, fxgr0.h);
                    VibratorManager vibratorManager0 = (VibratorManager)fxgr0.e.getSystemService("vibrator_manager");
                    optional0 = vibratorManager0 == null ? Optional.empty() : Optional.of(new fxhj(vibratorManager0, fxnw0, v3));
                }
                else {
                    optional0 = Optional.empty();
                }
                if(optional0.isPresent()) {
                    fxgr0.h.k(new fxpa("Vib", ((fxov)optional0.get())));
                    optional1 = Optional.of(optional0.get());
                }
                else {
                    optional1 = Optional.empty();
                }
                if(!huwd.v()) {
                    v1 = 1;
                }
                fxek fxek0 = new fxek(new fxga(fxgr0, fxfs0, optional1, fxdm0, fxdc1), fxot0, v1);
                fxdn fxdn0 = new fxdn(new fxgd(), new fxnw(14, fxgr0.h));
                fxgr0.h.k(new fxpa("QBackoff", fxdn0));
                fxgr0.h.k(new fxnt());
                if(!huwe.h() && !huwe.i() && !huwe.g()) {
                    fxgg0 = new fxgh();
                }
                else {
                    fxdq fxdq0 = new fxdq(new fxge(fxgr0), new fxgf());
                    Objects.requireNonNull(fxdq0);
                    fxgg fxgg1 = new fxgg(fxdq0);
                    fxgr0.h.k(fxdq0);
                    fxgg0 = fxgg1;
                }
                Objects.requireNonNull(fxeg0);
                fxgi fxgi1 = new fxgi(fxeg0);
                Objects.requireNonNull(fxek0);
                fxgj fxgj0 = new fxgj(fxek0);
                Objects.requireNonNull(fxek0);
                fxfr fxfr0 = new fxfr(fxgi1, fxdn0, fxfp0, fxgj0, new fxgk(fxek0), new fxgl(fxgr0, fxdn0, fxgg0, fxfp0, optional1, fxfs0, fxot0));
                fxgr0.h.k(fxfr0);
                if(huwe.a.e().n()) {
                    fxgd fxgd0 = new fxgd();
                    bbib bbib0 = new bbib(fxgr0.e);
                    fxeo fxeo0 = new fxeo(fxgr0.e, fxgd0, bbib0);
                    fxgr0.h.k(fxeo0);
                }
                Context context2 = fxgr0.e;
                Objects.requireNonNull(fxeg0);
                fxgq fxgq0 = new fxgq(context2, new fxgi(fxeg0));
                if(huwd.v()) {
                    fxpk fxpk1 = fxgr0.h;
                    Objects.requireNonNull(fxeg0);
                    fxgq1 = fxgq0;
                    fxek1 = fxek0;
                    fxpk1.k(new fxgn(context2, new fxgi(fxeg0), fxgq0, fxek0, new fxfu(fxgr0)));
                }
                else {
                    fxek1 = fxek0;
                    fxgq1 = fxgq0;
                }
                fxgr0.h.k(fxgq1);
                fxgo fxgo0 = new fxgo();
                fxgr.d = fxgo0;
                fxgr0.h.k(fxgo0);
                fxgr0.h.k(fxek1);
                fxgr0.h.h();
            }
        }
    }
}

