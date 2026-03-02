import java.io.ByteArrayOutputStream;

public final class ttd extends tix {
    private final String a;

    public ttd() {
        this.a = "ttd";
    }

    @Override  // tix
    public final ten a(ten ten0) {
        return new teu(ten0.g());
    }

    @Override  // tix
    public final teo b(tgn tgn0, ten ten0) {
        byte[] arr_b5;
        tre tre2;
        trf trf0;
        tta tta2;
        tjk.f("Processing GPO: {}", new Object[]{((teu)ten0).e()});
        ((tqo)tgn0).j();
        if(tgn0.e && !tgn0.f && !tgn0.b()) {
            if(((teu)ten0).a() == 0 && ((teu)ten0).b() == 0) {
                if(((teu)ten0).f()) {
                    if(((teu)ten0).d() == 0x100) {
                        tin tin0 = new tin(tjs.d("0000"));
                        tim tim0 = new tim(tjs.d("000000000000"));
                        tip tip0 = new tip(tjs.d("0000000000"));
                        tis tis0 = new tis(tjs.d("00"));
                        tir tir0 = new tir(tjs.d("000000"));
                        tgn0.i.c(tin0);
                        tgn0.i.c(tim0);
                        tgn0.i.c(tip0);
                        tgn0.i.c(tis0);
                        tgn0.i.c(tir0);
                        tjk.f("Parsing PDOL in GPO {}", new Object[]{((teu)ten0)});
                        thk thk0 = new thk(((tsg)tgn0.b.a().d(tsg.a)).b(thk.a));
                        thk0.d();
                        tjk.f(" Processing PDOL as found FCI template: {}", new Object[]{thk0});
                        byte[] arr_b = ((teu)ten0).i();
                        tjk.f(" Data received from terminal: {}", new Object[]{arr_b});
                        int v = 0;
                        for(Object object0: thk0.e) {
                            v += ((tfb)object0).a;
                        }
                        if(arr_b.length == v) {
                            tfd tfd0 = thk0.n(arr_b);
                            tfe tfe0 = tfd0.b(new tfg(til.a));
                            if(tfe0 != null) {
                                tjk.f("Amount Authorized PDOL {}", new Object[]{tfe0.d()});
                                try {
                                    Long.parseLong(tjs.c(tfe0.d(), false));
                                }
                                catch(NumberFormatException unused_ex) {
                                    tjk.f("Amount Authorized is not numeric", new Object[0]);
                                    throw new teq(tes.j);
                                }
                            }
                            tgl tgl0 = tgn0.i;
                            tgl0.d(tfd0);
                            tjk.f("Performing Card Risk Management", new Object[0]);
                            tjk.f("Card Risk Management - performing Terminal Checks", new Object[0]);
                            tgl tgl1 = tgn0.j;
                            tqx tqx0 = tgl1.w();
                            tta tta0 = tgl0.o();
                            if(!tta0.j(0, 4)) {
                                tjk.f("CDA not supported by terminal.", new Object[0]);
                                tqx0.s();
                            }
                            if(!tta0.j(0, 3)) {
                                tjk.f("Online only terminal.", new Object[0]);
                                tqx0.s();
                            }
                            tio tio0 = tgl0.a(tio.a) ? new tio(tgl0.b(tio.a)) : null;
                            if(tio0 == null) {
                                tjk.f("Card Risk Management - Terminal Type Not Specified by Terminal", new Object[0]);
                            }
                            else {
                                tjk.f("Card Risk Management - Terminal Type: {}", new Object[]{tio0.toString()});
                                if((tio0.a(0) & 15) == 3 || (tio0.a(0) & 15) == 6) {
                                    tjk.f("Card Risk Management - Unable to go online indicated by Termimal", new Object[0]);
                                    tqx0.e(0, 7, true);
                                }
                            }
                            tgl1.c(tqx0);
                            tjk.f("Card Risk Management - performing Transaction Checks", new Object[0]);
                            tgg tgg0 = tgn0.b;
                            tge tge0 = tgg0.a();
                            tib tib0 = trq.a;
                            trq trq0 = (trq)tge0.d(tib0);
                            tsh tsh0 = (tsh)tge0.d(tsh.a);
                            tqx tqx1 = tgl1.w();
                            tqw tqw0 = tgl1.v();
                            tre tre0 = tgl1.y();
                            tqr tqr0 = ((tqm)tge0).h();
                            trb trb0 = tsh0.f(new tfg(trb.a)) ? new trb(tsh0.b(trb.a)) : null;
                            tta tta1 = tgl0.o();
                            trq0.n();
                            til til0 = tgl0.f();
                            tjk.f("dgiInternalData: {}", new Object[]{trq0.d()});
                            if(til0 != null && !til0.n()) {
                                tjk.f("Amount Authorized: {}", new Object[]{til0.toString()});
                                tqx1.r();
                                tqx1.s();
                                tjk.f("Card Risk Management - Perform Check For Multicurrency And International", new Object[0]);
                                tqs tqs0 = tsh0.i();
                                tiq tiq0 = tgl0.j();
                                thi thi0 = tsh0.h();
                                tin tin1 = tgl0.h();
                                tjk.f("ApplicationCurrencyCode: {}", new Object[]{tqs0.toString()});
                                tjk.f("TransactionCurrencyCode: {}", new Object[]{tiq0.toString()});
                                tjk.f("IssuerCountryCode: {}", new Object[]{thi0.toString()});
                                tjk.f("TerminalCountryCode: {}", new Object[]{tin1.toString()});
                                String s = new tjp(tqs0.k()).toString();
                                String s1 = new tjp(tiq0.k()).toString();
                                String s2 = new tjp(thi0.k()).toString();
                                tta2 = tta1;
                                String s3 = new tjp(tin1.k()).toString();
                                if(!s.equals(s1)) {
                                    tqx1.n();
                                    if(s2.equals(s3)) {
                                        tqx1.o();
                                    }
                                    else {
                                        tqx1.p();
                                    }
                                }
                                else if(!s2.equals(s3)) {
                                    tqx1.q();
                                }
                                tjk.f("CVR: {}", new Object[]{tqx1.toString()});
                                long v1 = 0L;
                                if(tqx1.j(0, 2)) {
                                    tjk.f("Card and Terminal Currency do not match", new Object[0]);
                                    if(!tgn0.i.p().n()) {
                                        if(!tre0.r()) {
                                            trl trl0 = ((tqo)tgn0).l.A();
                                            long v2 = trl0.n();
                                            tjk.f("increment mcu {}", new Object[]{trl0.k()});
                                            try {
                                                if(v2 + 1L < 0L) {
                                                    throw new tfu(tft.n);
                                                }
                                                String s4 = Long.toHexString(v2 + 1L);
                                                byte[] arr_b1 = tjs.d((s4.length() % 2 == 1 ? "0" + s4 : Long.toHexString(v2 + 1L)));
                                                if(arr_b1.length > 2) {
                                                    throw new tfu(tft.n);
                                                }
                                                byte[] arr_b2 = new byte[2];
                                                for(int v3 = 0; v3 < arr_b1.length && v3 < 2; ++v3) {
                                                    arr_b2[1 - v3] = arr_b1[arr_b1.length - 1 - v3];
                                                }
                                                trl0.f(arr_b2);
                                            }
                                            catch(tfu tfu0) {
                                                tfu0.printStackTrace();
                                            }
                                            ((tqo)tgn0).l.c(trl0);
                                        }
                                        trq trq1 = (trq)tgn0.b.a().d(trq.a);
                                        trl trl1 = ((tqo)tgn0).l.A();
                                        trk trk0 = trq1.n();
                                        tjk.f("check mcu", new Object[0]);
                                        if(trk0 == null) {
                                            tjk.f("mculimit is null", new Object[0]);
                                        }
                                        else {
                                            long v4 = trl1.n();
                                            try {
                                                v1 = Long.parseLong(tjs.b(trk0.k()));
                                            }
                                            catch(NumberFormatException unused_ex) {
                                            }
                                            if(v4 > v1) {
                                                tjk.f("mcu exceeded", new Object[0]);
                                                tqx1.e(1, 5, true);
                                                tqw0.q();
                                            }
                                        }
                                    }
                                }
                                else {
                                    switch(tgl0.n().k()[0]) {
                                        case 1: {
                                            trf0 = trq0.m();
                                            break;
                                        }
                                        case 2: {
                                            trf0 = new trg(trq0.b(trg.a));
                                            break;
                                        }
                                        case 3: {
                                            trf0 = new trh(trq0.b(trh.a));
                                            break;
                                        }
                                        case 4: {
                                            trf0 = new tri(trq0.b(tri.a));
                                            break;
                                        }
                                        case 5: {
                                            trf0 = new trj(trq0.b(trj.a));
                                            break;
                                        }
                                        default: {
                                            trf0 = trq0.m();
                                        }
                                    }
                                    tjk.f("Perform transaction amount checks", new Object[0]);
                                    long v5 = Long.parseLong(tjs.b(til0.k()));
                                    long v6 = Long.parseLong(tjs.b(trf0.m(0)));
                                    long v7 = Long.parseLong(tjs.b(trf0.m(6)));
                                    tjk.f("totalUnauthSpendAmount: {}", new Object[]{((tqo)tgn0).i().n()});
                                    tjk.f("arl: {}", new Object[]{v7});
                                    tjk.f("authAmount: {}", new Object[]{v5});
                                    tjk.f("cptl: {}", new Object[]{v6});
                                    tre tre1 = tgl1.y();
                                    if(v5 > v6) {
                                        tjk.f("Amount Authorized exceeds CPTL", new Object[0]);
                                        tqx1.e(3, 0, true);
                                    }
                                    else {
                                        if(v5 > v7) {
                                            tjk.f("Amount Authorized exceeds ARL", new Object[0]);
                                            if(!tre1.r()) {
                                                tqx1.e(3, 1, true);
                                                tqw0.q();
                                            }
                                        }
                                        tjk.f("End performTransactionAmountChecks", new Object[0]);
                                    }
                                    tjk.f("Perform Authentication Amount Checks", new Object[0]);
                                    if(!tgl0.p().n()) {
                                        tjk.f("Purchase transaction", new Object[0]);
                                        if(tgl1.y().r()) {
                                            tre2 = tre0;
                                        }
                                        else if(!trq0.p()) {
                                            tjk.f("UTCSL is not zero", new Object[0]);
                                            trm trm0 = ((tqo)tgn0).i();
                                            tjk.f("update TUSA", new Object[0]);
                                            long v8 = trm0.n() + Long.parseLong(tjs.b(til0.k()));
                                            if(v8 < 0L) {
                                                throw new tfu(tft.e);
                                            }
                                            long v9 = v8;
                                            int v10 = 0;
                                            while(Long.compare(v9, 0L) != 0) {
                                                ++v10;
                                                v9 /= 10L;
                                            }
                                            int v11 = v10 % 2;
                                            int v12 = v11 == 0 ? v10 / 2 : (v10 + 1) / 2;
                                            if(v12 > 6) {
                                                throw new tfu(tft.e);
                                            }
                                            byte[] arr_b3 = new byte[v12];
                                            long v13 = v8;
                                            int v14 = 0;
                                            while(v14 < v10) {
                                                byte b = (byte)(((int)(v13 % 10L)));
                                                if(v14 == v10 - 1 && v11 != 0) {
                                                    arr_b3[v14 / 2] = b;
                                                }
                                                else if(v14 % 2 == 0) {
                                                    arr_b3[v14 / 2] = b;
                                                }
                                                else {
                                                    arr_b3[v14 / 2] = (byte)(((byte)(((int)(v13 % 10L)) << 4)) | arr_b3[v14 / 2]);
                                                }
                                                v13 /= 10L;
                                                ++v14;
                                                tre0 = tre0;
                                                v11 = v11;
                                                v10 = v10;
                                            }
                                            tre2 = tre0;
                                            for(int v15 = 0; v15 < v12 / 2; ++v15) {
                                                byte b1 = arr_b3[v15];
                                                int v16 = v12 - v15 - 1;
                                                arr_b3[v15] = arr_b3[v16];
                                                arr_b3[v16] = b1;
                                            }
                                            byte[] arr_b4 = new byte[6];
                                            for(int v17 = 0; v17 < v12; ++v17) {
                                                arr_b4[5 - v17] = arr_b3[v12 - 1 - v17];
                                            }
                                            trm0.f(arr_b4);
                                            ((tqo)tgn0).l.c(trm0);
                                            tgg0.b.a(((tqo)tgn0).l.C());
                                        }
                                        else {
                                            tre2 = tre0;
                                            tjk.f("UTCSL is zero", new Object[0]);
                                            tqx1.t();
                                            tqw0.q();
                                        }
                                        trq trq2 = (trq)tgg0.a().d(tib0);
                                        tjk.f("check UTCSL", new Object[0]);
                                        long v18 = ((tqo)tgn0).l.B().n();
                                        trn trn0 = trq2.o();
                                        try {
                                            v1 = Long.parseLong(tjs.b(trn0.k()));
                                        }
                                        catch(NumberFormatException unused_ex) {
                                        }
                                        if(v18 <= v1) {
                                            goto label_262;
                                        }
                                        tjk.f("UTCSL exceeded", new Object[0]);
                                        tjk.f("UTCSL exceeded", new Object[0]);
                                        tqx1.t();
                                        tqw0.q();
                                        goto label_262;
                                    }
                                }
                                tre2 = tre0;
                                goto label_262;
                            }
                            tre2 = tre0;
                            tta2 = tta1;
                            tjk.f("Amount Authorized is zero", new Object[0]);
                            tqx1.e(3, 2, true);
                            if(trq0.j().j(0, 3)) {
                                tjk.f("Applying card risk management to zero", new Object[0]);
                                tqx1.s();
                                if(trq0.p()) {
                                    tjk.f("card Upper Total Contactless Spend Limit is zero", new Object[0]);
                                    if(!tre2.r()) {
                                        tjk.f("passcode verification not valid", new Object[0]);
                                        tqx1.t();
                                        tqw0.q();
                                    }
                                }
                            label_262:
                                if(tre2.r()) {
                                    tqw0.p();
                                }
                                if(tqw0.s()) {
                                    tjk.f("CVM Required by Card", new Object[0]);
                                    tjk.f("TTI contains online PIN {}", new Object[]{Boolean.valueOf(tta2.n())});
                                    if(!tqr0.j(0, 4) || trb0 == null) {
                                        goto label_282;
                                    }
                                    for(Object object1: trb0.n()) {
                                        tjk.f("CVM Option {}", new Object[]{((trd)object1).k()});
                                    }
                                    tjk.f("CVM List contains online PIN {}", new Object[]{Boolean.valueOf(trb0.o(trc.a))});
                                    if(trb0.o(trc.a) && tta2.n()) {
                                        tjk.f("CVM List contains online PIN and Terminal supports online PIN", new Object[0]);
                                    }
                                    else if(trb0.o(trc.c)) {
                                        tjk.f("CVM List contains Interac Passcode option", new Object[0]);
                                        tqx1.e(2, 2, true);
                                        tre2.o();
                                        goto label_288;
                                    label_282:
                                        tjk.f("CV processing cannot be performed", new Object[0]);
                                        tre2.o();
                                        tgn0.j.c(tqx1);
                                        tgn0.j.c(tqw0);
                                        tgn0.j.c(tre2);
                                        throw new teq(tes.c);
                                    }
                                }
                            label_288:
                                tgl tgl2 = tgn0.j;
                                tgl2.c(tqx1);
                                tgl2.c(tqw0);
                                tgl2.c(tre2);
                                tjk.f("Card Risk Management - End Transaction Checks", new Object[0]);
                                tjk.f("End Card Risk Management", new Object[0]);
                                tjk.f("COS: {}", new Object[]{((tqo)tgn0).g().toString()});
                                if(tgl2.v().s() && ((tqo)tgn0).g().n() && tgl2.w().j(2, 2) && tgl2.y().j(1, 1)) {
                                    tqy tqy0 = ((tqo)tgn0).l;
                                    tjk.f("CVM Required by card, CTI:{}, CVR:{}, MSI:{}", new Object[]{tgl2.v().toString(), tgl2.w().toString(), tgl2.y().toString()});
                                    if(!tgl2.w().j(3, 1)) {
                                        if(tgl2.w().j(1, 5)) {
                                            tjk.f("CDCVM required, MCAL threshold exceeded. Multicurrency Unauthenticated Counter: {}", new Object[]{tqy0.A().toString()});
                                            throw new tfu(tft.r);
                                        }
                                        tjk.f("CDCVM required, Total Contactless Spend Limit threshold exceeded. Total Unauthenticated Spend Amount: {}", new Object[]{tqy0.B().toString()});
                                        throw new tfu(tft.q);
                                    }
                                    tjk.f("CDCVM required, ARL exceeded.", new Object[0]);
                                    throw new tfu(tft.j);
                                }
                                tgn0.getClass();
                                tjk.f("updateTransactionWithSukAndCvmData()", new Object[0]);
                                tgg tgg1 = tgn0.b;
                                tgn0.h = ((tfo)tgg1.b).b();
                                tql tql0 = tgn0.e();
                                if(tql0 != null) {
                                    tgl2.c((tql0.a == null ? null : new tgp(tql0.a)));
                                }
                                tfx tfx0 = tgn0.a;
                                if((tfx0 instanceof tfy)) {
                                    tfy tfy0 = (tfy)tfx0;
                                    tjk.f("PIN provided", new Object[0]);
                                }
                                tjk.f("processGPOCommand start", new Object[0]);
                                trz trz0 = (trz)tgg1.a().d(trz.a);
                                tqr tqr1 = trz0.h();
                                tqq tqq0 = new tqq(trz0.b(tqq.a));
                                tqw tqw1 = tgl2.v();
                                tgl2.c(tqr1);
                                tgl2.c(tqq0);
                                tgc[] arr_tgc = {tqr1, tqq0, tqw1};
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                                    for(int v19 = 0; v19 < 3; ++v19) {
                                        arr_tgc[v19].l().b(byteArrayOutputStream0);
                                    }
                                    arr_b5 = byteArrayOutputStream0.toByteArray();
                                }
                                catch(tev tev0) {
                                    throw new RuntimeException(tev0);
                                }
                                teo teo0 = new teo(new tgc(arr_b5, thn.b).l().c(), tes.g);
                                ((tqo)tgn0).m = ((teu)ten0).i();
                                tgn0.f = true;
                                tjk.f("processGPOCommand end", new Object[0]);
                                return teo0;
                            }
                            tjk.f("Not applying card risk management to zero amount", new Object[0]);
                            tgl1.c(tqx1);
                            tgl1.c(tqw0);
                            throw new teq("Zero dollar transaction not allowed", tes.c);
                        }
                        tjk.f(" Length of PDOL data received not equal to PDOL requested", new Object[0]);
                        throw new teq(tes.j);
                    }
                    tjk.f("Processing [GPO] - Le required and is non-zero", new Object[0]);
                    throw new teq("Le required and is non-zero", tes.k);
                }
                tjk.f("Processing [GPO] - Le absent", new Object[0]);
                throw new teq("Le absent", tes.k);
            }
            tjk.f("Processing [GPO] - incorrect P1/P2", new Object[0]);
            throw new teq("incorrect P1/P2", tes.f);
        }
        tjk.f("Invalid state - SELECT must be performed", new Object[0]);
        throw new teq("Invalid state - SELECT must be performed", tes.c);
    }

    @Override
    public final String toString() {
        return this.getClass().getName();
    }
}

