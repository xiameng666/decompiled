import j..time.Instant;
import j..util.Optional;
import java.security.SecureRandom;

public final class azla {
    public static final bboh a;
    public final azke b;
    public final fgvt c;
    public final azlr d;
    private final gemk e;
    private final azog f;
    private final azoq g;
    private final azod h;
    private final azom i;
    private final SecureRandom j;

    static {
        azla.a = bboh.b("CobaltLoggerImpl", bbcu.fZ);
    }

    public azla(gemk gemk0, azke azke0, fgvt fgvt0, azog azog0, azoq azoq0, azlr azlr0, azod azod0, azom azom0, SecureRandom secureRandom0) {
        this.e = gemk0;
        this.b = azke0;
        this.c = fgvt0;
        this.f = azog0;
        this.g = azoq0;
        this.d = azlr0;
        this.h = azod0;
        this.i = azom0;
        this.j = secureRandom0;
    }

    public final aziq a(int v, int v1) {
        return (aziq)azjg.c(v, v1).orElseThrow(new azky(this, v, v1));
    }

    public final genf b(int v, int v1) {
        Optional optional0 = azjg.a(this.e, v);
        return optional0.isEmpty() ? ((genf)Optional.empty().orElseThrow(new azkx(this, v, v1))) : ((genf)azjg.b(((geml)optional0.get()), v1).orElseThrow(new azkx(this, v, v1)));
    }

    public final Optional c(String s, int v, int v1) {
        Optional optional0 = this.f.a(s);
        if(!optional0.isEmpty()) {
            return optional0;
        }
        this.d.b("APP_VERSION_LOOKUP_FAILURE", v, v1);
        throw new cjuh(8, String.format("Package %s calling Cobalt is not installed, this should not be possible", s));
    }

    public final Optional d(genf genf0, int v, int v1, int v2) {
        try {
            for(Object object0: genf0.c) {
                gena gena0 = (gena)object0;
                if(v2 == gena0.b) {
                    return Optional.of(gena0);
                }
            }
            if(genf0.f.contains(Integer.valueOf(v2))) {
                throw new azje(a.f(v2, "The metric ", " has been deleted"));
            }
            throw new azjf(a.f(v2, "The metric ", " does not exist"));
        }
        catch(azje unused_ex) {
            this.d.b("DELETED_METRIC", v, v1);
            ((ggtj)((ggtj)azla.a.h()).ar(0x64F)).X("Ignoring deleted metric %d in project: %d-%d", Integer.valueOf(v2), Integer.valueOf(v), Integer.valueOf(v1));
            return Optional.empty();
        }
        catch(azjf azjf0) {
            this.d.b("INVALID_METRIC_PARAMS", v, v1);
            throw new cjuh(10, String.format("Metric not found in the Cobalt registry: %d-%d-%d", v, v1, v2), null, azjf0);
        }
    }

    // This method was un-flattened
    public final void e(int v, int v1, int v2, long v3, int[] arr_v, String s, Optional optional0, Instant instant0, gena gena0) {
        azmy azmy0;
        azks azks1;
        genu genu2;
        long v19;
        int v18;
        gemu gemu0;
        int v17;
        int v16;
        int v14;
        azmg azmg0;
        genu genu1;
        azkz azkz1;
        azki azki1;
        genm genm1;
        ggfp ggfp1;
        azla azla0 = this;
        int v4 = v;
        String s1 = s;
        Instant instant1 = instant0;
        azkp azkp0 = new azkp(v4, v1);
        azke azke0 = azla0.b;
        azke0.c(azkp0, instant1);
        int v5 = azlf.a(gena0, instant1);
        azki azki0 = new azki(glww.e(arr_v));
        int v6 = aznt.a(s1, ((String)optional0.get()));
        if(v6 - 2 <= (gena0.g == null ? gemv.a : gena0.g).b) {
            azkz azkz0 = new azkz(azla0.d);
            azol azol0 = null;
            for(Object object0: gena0.h) {
                genm genm0 = (genm)object0;
                if(geng.b(genm0.s) != 2 && v6 - 2 > genm0.s || !genm0.t && !azla0.h.a(azkz0) || genk.a(genm0.f) == 17 && !hrcb.e() || genk.a(genm0.f) == 15 && (!hrcb.f() || gemz.a(gena0.c) != 10) || genk.a(genm0.f) == 19 && (!hrcb.g() || gemz.a(gena0.c) != 10)) {
                    continue;
                }
                ggfp ggfp0 = ggnj.a;
                if(genm0.o.size() > 0) {
                    if(azol0 == null) {
                        azol0 = azla0.i.a(v4, v1, s1);
                    }
                    switch(azol0.b) {
                        case 1: {
                            ggfp0 = azol0.a;
                            break;
                        }
                        case 4: {
                            azkz0.a();
                            continue;
                        }
                        default: {
                            continue;
                        }
                    }
                }
                Optional optional1 = Optional.empty();
                if(genm0.p > 0 && !genm0.q.isEmpty()) {
                    if(hrcf.c()) {
                        ggfp1 = ggfp0;
                        genm1 = genm0;
                        optional1 = Optional.of(Integer.valueOf(azof.a(azke0.a(azla0.j, instant1), v4, v1, genm0.q, genm0.p)));
                        goto label_40;
                    }
                    else {
                        azki1 = azki0;
                        azkz1 = azkz0;
                        goto label_125;
                    }
                    goto label_38;
                }
                else {
                label_38:
                    genm1 = genm0;
                    ggfp1 = ggfp0;
                }
            label_40:
                azks azks0 = new azks(new azkp(v4, v1), v2, genm1.e);
                genu genu0 = azla0.g.a(genm1, optional0, ggfp1, optional1);
                int v7 = gena0.c;
            alab1:
                switch((gemz.a(v7) == 0 ? 1 : gemz.a(v7)) - 2) {
                    case 8: {
                        genu1 = genu0;
                        int v8 = genm1.f;
                        int v9 = genk.a(v8) == 0 ? 1 : genk.a(v8);
                        if(v9 - 2 != 17) {
                            switch(v9 - 2) {
                                case 12: {
                                    int v10 = genm1.k;
                                    int v11 = geni.a(v10) == 0 ? 1 : geni.a(v10);
                                    if(v11 - 2 != 7 && v11 - 2 != 8) {
                                        throw new AssertionError("Unrecognized or unsupported LocalAggregationProcedure: " + v10);
                                    }
                                    azmg0 = new azmk();
                                    break alab1;
                                }
                                case 11: 
                                case 13: {
                                    break;
                                }
                                default: {
                                    throw new AssertionError("Occurrence metric with unrecognized or unsupported ReportType: " + v8);
                                }
                            }
                        }
                        azmg0 = new azmg(v3);
                        break;
                    }
                    case 9: {
                        int v12 = genm1.f;
                        if((genk.a(v12) == 0 ? 1 : genk.a(v12)) - 2 != 15) {
                            throw new AssertionError("Integer metric with unrecognized or unsupported ReportType: " + v12);
                        }
                        gemr gemr0 = genm1.j == null ? gemr.a : genm1.j;
                        int v13 = gemr0.b;
                        if(v13 == 0) {
                            genu1 = genu0;
                        }
                        else {
                            genu1 = genu0;
                            switch(v13) {
                                case 1: {
                                    v14 = 1;
                                    break;
                                }
                                case 2: {
                                    v14 = 2;
                                    break;
                                }
                                default: {
                                    throw null;
                                }
                            }
                        }
                        switch(v14 - 1) {
                            case 0: {
                                goto label_75;
                            }
                            case 1: {
                                goto label_89;
                            }
                            case 2: {
                                throw new AssertionError("IntegerBuckets configuration not set");
                            }
                        }
                        throw new RuntimeException(null, null);
                    label_75:
                        gemo gemo0 = v13 == 1 ? ((gemo)gemr0.c) : gemo.a;
                        int v15 = gemo0.c;
                        double f = (double)gemo0.d;
                        if(v3 < gemo0.b) {
                            v16 = 0;
                            goto label_101;
                        }
                        else {
                            v16 = 1;
                            while(true) {
                                if(v16 >= v15 + 1) {
                                    v17 = v15 + 1;
                                    goto label_95;
                                }
                                if(((double)v3) < Math.ceil(((double)gemo0.b) + f)) {
                                    goto label_101;
                                }
                                f *= (double)gemo0.e;
                                ++v16;
                            }
                        label_89:
                            gemu0 = v13 == 2 ? ((gemu)gemr0.c) : gemu.a;
                            v18 = gemu0.c;
                            v19 = gemu0.b;
                            v16 = 0;
                        }
                        while(true) {
                            if(v16 >= v18 + 1) {
                                v17 = v18 + 1;
                            label_95:
                                v16 = v17;
                                break;
                            }
                            if(v3 < v19) {
                                break;
                            }
                            v19 += (long)gemu0.d;
                            ++v16;
                        }
                    label_101:
                        azmg0 = new azmj(v16);
                        break;
                    }
                    default: {
                        throw new AssertionError("Unrecognized or unsupported MetricType: " + v7);
                    }
                }
                int v20 = genm1.r;
                switch((genw.a(v20) == 0 ? 1 : genw.a(v20)) - 2) {
                    case 1: {
                        azki1 = azki0;
                        azkz1 = azkz0;
                        genu2 = genu1;
                        azks1 = azks0;
                        azmy0 = new azmy(azks1, v5, genu2, azki1, genm1.m, azmg0);
                        break;
                    }
                    case 2: {
                        azki1 = azki0;
                        azkz1 = azkz0;
                        genu2 = genu1;
                        azks1 = azks0;
                        azmy0 = new azmv(azks1, v5, genu2, azki1, genm1.m, azmg0);
                        break;
                    }
                    case 3: {
                        azkz1 = azkz0;
                        azks1 = azks0;
                        azki1 = azki0;
                        genu2 = genu1;
                        azmy0 = new azmt(azks1, v5, genu2, azki1, genm1.m, azmg0);
                        break;
                    }
                    default: {
                        throw new AssertionError("Unrecognized or unsupported SystemProfileSelection: " + v20);
                    }
                }
                azka azka0 = new azka(azke0, azks1, v5, azmy0, genu2);
                v5 = v5;
                azke0.a.j(azka0);
            label_125:
                azla0 = this;
                s1 = s;
                instant1 = instant0;
                azkz0 = azkz1;
                azki0 = azki1;
                azol0 = azol0;
                v4 = v;
                continue;
            }
        }
    }
}

