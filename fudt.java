public final class fudt {
    public static final void a(hfc hfc0, fudu fudu0, goz goz0, int v) {
        fcp fcp0;
        ibuq.f(fudu0, "state");
        goz goz1 = goz0.ao(0xA4AADD0);
        if((((v & 0x30) == 0 ? v | 6 | (goz1.Z(fudu0) ? 0x20 : 16) : v | 6) & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc0 = hfc.e;
            hfc hfc1 = dls.w(hfc0);
            goz1.M(5004770);
            boolean z = goz1.Z(fudu0);
            Object object0 = goz1.j();
            if(z || object0 == gop.a) {
                object0 = new fudp();
                goz1.P(object0);
            }
            goz1.x();
            hfc hfc2 = cqx.a(cru.d(hfc1, false, null, null, null, ((ibth)object0), 14), fpu.a(goz1).F, fulh.a(fule.a, goz1));
            if(hyxx.c()) {
                goz1.M(0xA8802F8C);
                fcp0 = fiqw.b(fpu.a(goz1).F, 0L, goz1, 14);
            }
            else {
                goz1.M(0xA881D269);
                fcp0 = fiqw.b(fpu.a(goz1).I, 0L, goz1, 14);
            }
            goz1.x();
            gze gze0 = gzf.e(0xA7739542, new fuds(fudu0), goz1);
            fira.a(hfc2, fitu.a.e, fcp0, null, null, gze0, goz1, 0x30000, 24);
            goz1 = goz1;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fudq(hfc0, fudu0, v);
        }
    }
}

