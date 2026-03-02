import com.google.ads.afma.b;
import com.google.android.gms.ads.internal.clearcut.i;

public final class ciym implements ciyn {
    public String a;

    public ciym() {
        this.a = "";
    }

    @Override  // ciyn
    public final ciww a(ProtoLiteMessage hftv0, ciyl ciyl0) {
        return this.d(hftv0, ciyl0);
    }

    @Override  // ciyn
    public final ciww b(ciyl ciyl0) {
        return this.d(null, ciyl0);
    }

    @Override  // ciyn
    public final ciww c(hfki hfki0) {
        String s = this.a;
        ggdy ggdy0 = new ggdy();
        ggqj ggqj0 = hfki0.a.om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            ggdy0.i(ciyc.a(((hfke)object0), s));
        }
        ggqj ggqj1 = hfki0.b.om();
        while(ggqj1.hasNext()) {
            Object object1 = ggqj1.next();
            ggfn ggfn0 = new ggfn();
            ggqj ggqj2 = ((hfkm)object1).a.om();
            while(ggqj2.hasNext()) {
                Object object2 = ggqj2.next();
                ggfn0.i(ciyc.a(((hfke)object2), s));
            }
            ggqj ggqj3 = ((hfkm)object1).b.om();
            while(ggqj3.hasNext()) {
                Object object3 = ggqj3.next();
                ggfn ggfn1 = new ggfn();
                ggqj ggqj4 = ((hfkd)object3).a.om();
                while(ggqj4.hasNext()) {
                    Object object4 = ggqj4.next();
                    ggfn1.i(ciyc.a(((hfke)object4), s));
                }
                ggfn0.i(new cixa(ggfn1.h()));
            }
            ggdy0.i(new ciyf(ggfn0.h()));
        }
        return new ciww(ggdy0.h());
    }

    public final ciww d(ProtoLiteMessage hftv0, ciyl ciyl0) {
        ccuh ccuh0;
        if(ciyl0.a != cdef.E) {
            hfkh hfkh0 = new hfkh();
            hfkh hfkh1 = new hfkh();
            if(ciyl0.e) {
                hfkh1.d(new hfke(3));
            }
            if(ciyl0.c) {
                hfkh1.d(new hfke(76));
            }
            hfkh0.e(hfkh1.c());
            if(!ciyl0.d) {
                Class class0 = ciyl0.b;
                hfkh hfkh2 = new hfkh();
                if(class0.equals(wvy.class)) {
                    ccuh0 = new ccuh();
                }
                else {
                    if(class0.equals(gqxt.class)) {
                        ccuh0 = new ccui();
                        goto label_352;
                    }
                    if(class0.equals(gqfj.class)) {
                        ccuh0 = new cdcl();
                        goto label_352;
                    }
                    if(class0.equals(gzzc.class)) {
                        ccuh0 = new ccuj();
                        goto label_352;
                    }
                    if(class0.equals(abby.class)) {
                        ccuh0 = new ccup();
                        goto label_352;
                    }
                    if(class0.equals(glim.class)) {
                        ccuh0 = new ccuq();
                        goto label_352;
                    }
                    if(class0.equals(ghon.class)) {
                        ccuh0 = new ccuw();
                        goto label_352;
                    }
                    if(class0.equals(ghys.class)) {
                        ccuh0 = new ccus();
                        goto label_352;
                    }
                    if(class0.equals(hkyf.class)) {
                        ccuh0 = new ccuv();
                        goto label_352;
                    }
                    if(class0.equals(giik.class)) {
                        ccuh0 = new ccvb();
                        goto label_352;
                    }
                    if(class0.equals(gemm.class)) {
                        ccuh0 = new ccuk();
                        goto label_352;
                    }
                    if(class0.equals(acra.class)) {
                        ccuh0 = new ccvc();
                        goto label_352;
                    }
                    if(class0.equals(gvij.class)) {
                        ccuh0 = new cdck();
                        goto label_352;
                    }
                    if(class0.equals(ghyc.class)) {
                        ccuh0 = new cdgp();
                        goto label_352;
                    }
                    if(class0.equals(gixr.class)) {
                        ccuh0 = new cdcb();
                        goto label_352;
                    }
                    if(class0.equals(wuc.class)) {
                        ccuh0 = new ccvl();
                        goto label_352;
                    }
                    if(class0.equals(gzzg.class)) {
                        ccuh0 = new ccvd();
                        goto label_352;
                    }
                    if(class0.equals(icxv.class)) {
                        ccuh0 = new ccvf();
                        goto label_352;
                    }
                    if(class0.equals(gzzp.class)) {
                        ccuh0 = new ccvg();
                        goto label_352;
                    }
                    if(class0.equals(gjoc.class)) {
                        ccuh0 = new ccvh();
                        goto label_352;
                    }
                    if(class0.equals(aolm.class)) {
                        ccuh0 = new ccvi();
                        goto label_352;
                    }
                    if(class0.equals(hhbi.class)) {
                        ccuh0 = new ccvj();
                        goto label_352;
                    }
                    if(class0.equals(geaq.class)) {
                        ccuh0 = new ccvk();
                        goto label_352;
                    }
                    if(class0.equals(gkzy.class)) {
                        ccuh0 = new ccvn();
                        goto label_352;
                    }
                    if(class0.equals(gkdt.class)) {
                        ccuh0 = new ccvp();
                        goto label_352;
                    }
                    if(class0.equals(glai.class)) {
                        ccuh0 = new ccvq();
                        goto label_352;
                    }
                    if(class0.equals(gkjd.class)) {
                        ccuh0 = new ccvr();
                        goto label_352;
                    }
                    if(class0.equals(avtp.class)) {
                        ccuh0 = new ccut();
                        goto label_352;
                    }
                    if(class0.equals(gikf.class)) {
                        ccuh0 = new ccvs();
                        goto label_352;
                    }
                    if(class0.equals(gmeo.class)) {
                        ccuh0 = new ccwj();
                        goto label_352;
                    }
                    if(class0.equals(gmij.class)) {
                        ccuh0 = new ccwk();
                        goto label_352;
                    }
                    if(class0.equals(bcsj.class)) {
                        ccuh0 = new ccwl();
                        goto label_352;
                    }
                    if(class0.equals(fqcd.class)) {
                        ccuh0 = new cdfv();
                        goto label_352;
                    }
                    if(class0.equals(gwik.class)) {
                        ccuh0 = new ccwy();
                        goto label_352;
                    }
                    if(class0.equals(gzzv.class)) {
                        ccuh0 = new ccxa();
                        goto label_352;
                    }
                    if(class0.equals(gejt.class)) {
                        ccuh0 = new ccxb();
                        goto label_352;
                    }
                    if(class0.equals(gejc.class)) {
                        ccuh0 = new ccxc();
                        goto label_352;
                    }
                    if(class0.equals(vvc.class)) {
                        ccuh0 = new ccxd();
                        goto label_352;
                    }
                    if(class0.equals(icye.class)) {
                        ccuh0 = new ccxe();
                        goto label_352;
                    }
                    if(class0.equals(gioc.class)) {
                        ccuh0 = new ccxg();
                        goto label_352;
                    }
                    if(class0.equals(giob.class)) {
                        ccuh0 = new ccxf();
                        goto label_352;
                    }
                    if(class0.equals(gqsk.class)) {
                        ccuh0 = new cdca();
                        goto label_352;
                    }
                    if(class0.equals(won.class)) {
                        ccuh0 = new cdhd();
                        goto label_352;
                    }
                    if(class0.equals(gypl.class)) {
                        ccuh0 = new ccxm();
                        goto label_352;
                    }
                    if(class0.equals(icwe.class)) {
                        ccuh0 = new ccxn();
                        goto label_352;
                    }
                    if(class0.equals(hhey.class)) {
                        ccuh0 = new cdfr();
                        goto label_352;
                    }
                    if(class0.equals(hhay.class)) {
                        ccuh0 = new ccxo();
                        goto label_352;
                    }
                    if(class0.equals(blgo.class)) {
                        ccuh0 = new ccxp();
                        goto label_352;
                    }
                    if(class0.equals(gkjb.class)) {
                        ccuh0 = new ccxt();
                        goto label_352;
                    }
                    if(class0.equals(hgzq.class)) {
                        ccuh0 = new ccxs();
                        goto label_352;
                    }
                    if(class0.equals(gpgo.class)) {
                        ccuh0 = new ccxu();
                        goto label_352;
                    }
                    if(class0.equals(bshm.class)) {
                        ccuh0 = new ccxv();
                        goto label_352;
                    }
                    if(class0.equals(b.class)) {
                        ccuh0 = new ccxw();
                        goto label_352;
                    }
                    if(class0.equals(bsjg.class)) {
                        ccuh0 = new ccyd();
                        goto label_352;
                    }
                    if(class0.equals(btbs.class)) {
                        ccuh0 = new ccxx();
                        goto label_352;
                    }
                    if(class0.equals(gixy.class)) {
                        ccuh0 = new ccxy();
                        goto label_352;
                    }
                    if(class0.equals(habu.class)) {
                        ccuh0 = new ccyb();
                        goto label_352;
                    }
                    if(class0.equals(habx.class)) {
                        ccuh0 = new ccyc();
                        goto label_352;
                    }
                    if(class0.equals(i.class)) {
                        ccuh0 = new ccye();
                        goto label_352;
                    }
                    if(class0.equals(gigw.class)) {
                        ccuh0 = new cdbh();
                        goto label_352;
                    }
                    if(class0.equals(btvl.class)) {
                        ccuh0 = new cdbk();
                        goto label_352;
                    }
                    if(class0.equals(btvm.class)) {
                        ccuh0 = new cdbl();
                        goto label_352;
                    }
                    if(class0.equals(hjaq.class)) {
                        ccuh0 = new cdbm();
                        goto label_352;
                    }
                    if(class0.equals(gqyr.class)) {
                        ccuh0 = new ccuu();
                        goto label_352;
                    }
                    if(class0.equals(hgwr.class)) {
                        ccuh0 = new cdbn();
                        goto label_352;
                    }
                    if(class0.equals(hgws.class)) {
                        ccuh0 = new cdbo();
                        goto label_352;
                    }
                    if(class0.equals(bbum.class)) {
                        ccuh0 = new cdbp();
                        goto label_352;
                    }
                    if(class0.equals(glnz.class)) {
                        ccuh0 = new cdbz();
                        goto label_352;
                    }
                    if(class0.equals(gisy.class)) {
                        ccuh0 = new cdcj();
                        goto label_352;
                    }
                    if(class0.equals(hack.class)) {
                        ccuh0 = new cdcn();
                        goto label_352;
                    }
                    if(class0.equals(hacn.class)) {
                        ccuh0 = new cdcm();
                        goto label_352;
                    }
                    if(class0.equals(gkbt.class)) {
                        ccuh0 = new cdcq();
                        goto label_352;
                    }
                    if(class0.equals(hlsz.class)) {
                        ccuh0 = new cdco();
                        goto label_352;
                    }
                    if(class0.equals(fybj.class)) {
                        ccuh0 = new cdcp();
                        goto label_352;
                    }
                    if(class0.equals(gzzk.class)) {
                        ccuh0 = new ccve();
                        goto label_352;
                    }
                    if(class0.equals(gjak.class)) {
                        ccuh0 = new cddf();
                        goto label_352;
                    }
                    if(class0.equals(gjag.class)) {
                        ccuh0 = new cdde();
                        goto label_352;
                    }
                    if(class0.equals(fkpo.class)) {
                        ccuh0 = new cddg();
                        goto label_352;
                    }
                    if(class0.equals(hgvh.class)) {
                        ccuh0 = new cdeg();
                        goto label_352;
                    }
                    if(class0.equals(gizg.class)) {
                        ccuh0 = new cdeh();
                        goto label_352;
                    }
                    if(class0.equals(csoq.class)) {
                        ccuh0 = new cdei();
                        goto label_352;
                    }
                    if(class0.equals(habi.class)) {
                        ccuh0 = new cdej();
                        goto label_352;
                    }
                    if(class0.equals(hiat.class)) {
                        ccuh0 = new ccwm();
                        goto label_352;
                    }
                    if(class0.equals(gdzx.class)) {
                        ccuh0 = new cdek();
                        goto label_352;
                    }
                    if(class0.equals(hefq.class)) {
                        ccuh0 = new cdel();
                        goto label_352;
                    }
                    if(class0.equals(hapr.class)) {
                        ccuh0 = new cdeo();
                        goto label_352;
                    }
                    if(class0.equals(gisr.class)) {
                        ccuh0 = new cdes();
                        goto label_352;
                    }
                    if(class0.equals(gilz.class)) {
                        ccuh0 = new cdeq();
                        goto label_352;
                    }
                    if(class0.equals(gilw.class)) {
                        ccuh0 = new cdep();
                        goto label_352;
                    }
                    if(class0.equals(gima.class)) {
                        ccuh0 = new cder();
                        goto label_352;
                    }
                    if(class0.equals(hlsf.class)) {
                        ccuh0 = new cdex();
                        goto label_352;
                    }
                    if(class0.equals(hadn.class)) {
                        ccuh0 = new cdey();
                        goto label_352;
                    }
                    if(class0.equals(igtg.class)) {
                        ccuh0 = new cdez();
                        goto label_352;
                    }
                    if(class0.equals(gjiu.class)) {
                        ccuh0 = new cdfg();
                        goto label_352;
                    }
                    if(class0.equals(gitd.class)) {
                        ccuh0 = new cdfh();
                        goto label_352;
                    }
                    if(class0.equals(giui.class)) {
                        ccuh0 = new cdfi();
                        goto label_352;
                    }
                    if(class0.equals(hgzv.class)) {
                        ccuh0 = new cdfn();
                        goto label_352;
                    }
                    if(class0.equals(btai.class)) {
                        ccuh0 = new cdfs();
                        goto label_352;
                    }
                    if(class0.equals(elpp.class)) {
                        ccuh0 = new ccux();
                        goto label_352;
                    }
                    if(class0.equals(elpl.class)) {
                        ccuh0 = new ccuy();
                        goto label_352;
                    }
                    if(class0.equals(elro.class)) {
                        ccuh0 = new ccuz();
                        goto label_352;
                    }
                    if(class0.equals(gzkh.class)) {
                        ccuh0 = new cdbq();
                        goto label_352;
                    }
                    if(class0.equals(gjpw.class)) {
                        ccuh0 = new ccxr();
                        goto label_352;
                    }
                    if(class0.equals(gjzl.class)) {
                        ccuh0 = new cdgc();
                        goto label_352;
                    }
                    if(class0.equals(ginp.class)) {
                        ccuh0 = new cdft();
                        goto label_352;
                    }
                    if(class0.equals(gjpv.class)) {
                        ccuh0 = new cdfu();
                        goto label_352;
                    }
                    if(class0.equals(hhes.class)) {
                        ccuh0 = new cdgm();
                        goto label_352;
                    }
                    if(class0.equals(ewge.class)) {
                        ccuh0 = new cdgn();
                        goto label_352;
                    }
                    if(class0.equals(gimr.class)) {
                        ccuh0 = new cdgo();
                        goto label_352;
                    }
                    if(class0.equals(ghyl.class)) {
                        ccuh0 = new cdhb();
                        goto label_352;
                    }
                    if(class0.equals(hfgj.class)) {
                        ccuh0 = new cdhc();
                        goto label_352;
                    }
                    if(class0.equals(gkbj.class)) {
                        ccuh0 = new cdhg();
                        goto label_352;
                    }
                    if(class0.equals(gluc.class)) {
                        ccuh0 = new ccvo();
                        goto label_352;
                    }
                    if(!class0.equals(gild.class)) {
                        throw new IllegalArgumentException(a.b(class0, "Proto ", " does not have a corresponding MetricNcc class."));
                    }
                    ccuh0 = new cdhh();
                }
            label_352:
                hfkh2.e(ccuh0.a());
                if(hftv0 != null) {
                    hfkh2.e(ccuh0.b(((MessageLite)hftv0)));
                }
                hfkh0.e(hfkh2.c());
                return this.c(hfkh0.c());
            }
            return this.c(hfkh0.c());
        }
        return new ciww(ggna.a);
    }

    @Override  // ciyn
    public final void e(String s) {
        this.a = s;
    }
}

