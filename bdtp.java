public final class bdtp {
    public static final void a(int v, int v1, goz goz0, int v2) {
        goz goz2;
        goz goz1 = goz0.ao(0xD295D9E3);
        int v3 = (v2 & 6) == 0 ? (goz1.V(v) ? 4 : 2) | v2 : v2;
        if((v2 & 0x30) == 0) {
            v3 |= (goz1.V(v1) ? 0x20 : 16);
        }
        if((v3 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            hey hey0 = hfc.e;
            hfc hfc0 = dls.w(hey0);
            iau iau0 = dll.b(dho.a, hei.k, goz1, 0x30);
            int v4 = bdsh.a(gol.c(goz1));
            gzk gzk0 = goz1.ak();
            hfc hfc1 = hew.c(goz1, hfc0);
            ibth ibth0 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            ibtw ibtw0 = iej.e;
            guo.b(goz1, iau0, ibtw0);
            ibtw ibtw1 = iej.d;
            guo.b(goz1, gzk0, ibtw1);
            ibtw ibtw2 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v4))) {
                Integer integer0 = v4;
                goz1.P(integer0);
                goz1.p(integer0, ibtw2);
            }
            ibts ibts0 = iej.g;
            guo.a(goz1, ibts0);
            ibtw ibtw3 = iej.c;
            guo.b(goz1, hfc1, ibtw3);
            hfc hfc2 = cqx.c(hhi.a(dls.k(hey0, 48.0f), eah.a), fpu.a(goz1).h);
            iau iau1 = dhw.a(hei.e, false);
            int v5 = bdsh.a(gol.c(goz1));
            gzk gzk1 = goz1.ak();
            hfc hfc3 = hew.c(goz1, hfc2);
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau1, ibtw0);
            guo.b(goz1, gzk1, ibtw1);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v5))) {
                Integer integer1 = v5;
                goz1.P(integer1);
                goz1.p(integer1, ibtw2);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc3, ibtw3);
            fiso.a(ism.a(v, goz1, v3 & 14), null, null, fpu.a(goz1).a, goz1, 56, 4);
            goz1.z();
            dlv.a(dls.o(hey0, 12.0f), goz1);
            goz2 = goz1;
            fiuk.b(isq.c(v1, goz1), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, fpu.d(goz1).k, goz2, 0, 0, 0x1FFFE);
            goz2.z();
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new bdsq(v, v1, v2);
        }
    }

    public static final void b(bdtr bdtr0, ibth ibth0, ibth ibth1, ibth ibth2, ibth ibth3, ibth ibth4, ibth ibth5, ibth ibth6, goz goz0, int v) {
        goz goz2;
        ibuq.f(bdtr0, "state");
        ibuq.f(ibth0, "onNavigateBack");
        ibuq.f(ibth1, "onUploadCsvFileClicked");
        ibuq.f(ibth2, "onStartImport");
        ibuq.f(ibth3, "onDismissInstallPasswordManagerDialog");
        ibuq.f(ibth4, "onDismissNoCredentialsImportedDialog");
        ibuq.f(ibth5, "onDismissOnlyConflictingCredentialsImportedDialog");
        ibuq.f(ibth6, "onDismissGenericErrorDialog");
        goz goz1 = goz0.ao(1927363670);
        int v1 = (v & 6) == 0 ? (goz1.Z(bdtr0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibth1) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(ibth2) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (goz1.Z(ibth3) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (goz1.Z(ibth4) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v1 |= (goz1.Z(ibth5) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v) == 0) {
            v1 |= (goz1.Z(ibth6) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x492493) == 4793490 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            goz2 = goz1;
            fits.a(null, gzf.e(2020163610, new bdss(ibth0), goz1), gzf.e(0x4688C5DB, new bdsu(ibth2, bdtr0), goz1), null, null, 0, 0L, 0L, null, gzf.e(1685509157, new bdsy(bdtr0, ibth3, ibth1, ibth4, ibth5, ibth6, ibth2), goz1), goz2, 0x300001B0, 505);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new bdsj(bdtr0, ibth0, ibth1, ibth2, ibth3, ibth4, ibth5, ibth6, v);
        }
    }

    public static final void c(goz goz0, int v) {
        int v1 = 0;
        goz goz1 = goz0.ao(-493361700);
        if(v != 0) {
            fits.a(null, bdpw.d, bdpw.e, null, null, 0, 0L, 0L, null, bdpw.f, goz1, 0x300001B0, 505);
            v1 = v;
        }
        else if(!goz1.ac()) {
            fits.a(null, bdpw.d, bdpw.e, null, null, 0, 0L, 0L, null, bdpw.f, goz1, 0x300001B0, 505);
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bdsi(v1);
        }
    }

    public static final void d(bdtt bdtt0, ibth ibth0, ibth ibth1, goz goz0, int v) {
        goz goz2;
        ibuq.f(bdtt0, "state");
        ibuq.f(ibth0, "onMoreAboutImportingClicked");
        ibuq.f(ibth1, "onDone");
        goz goz1 = goz0.ao(1019085522);
        int v1 = (v & 6) == 0 ? (goz1.Z(bdtt0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibth1) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            gze gze0 = gzf.e(0x934514D7, new bdsz(ibth1), goz1);
            gze gze1 = gzf.e(0x8D5421, new bdto(ibth0, bdtt0), goz1);
            goz2 = goz1;
            fits.a(null, bdpw.h, gze0, null, null, 0, 0L, 0L, null, gze1, goz2, 0x300001B0, 505);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new bdsk(bdtt0, ibth0, ibth1, v);
        }
    }

    public static final void e(bdtu bdtu0, ibth ibth0, ibth ibth1, ibth ibth2, ibth ibth3, ibth ibth4, ibth ibth5, ibth ibth6, ibth ibth7, ibth ibth8, goz goz0, int v) {
        goz goz2;
        ibuq.f(bdtu0, "state");
        ibuq.f(ibth0, "onNavigateBack");
        ibuq.f(ibth1, "onUploadCsvFileClicked");
        ibuq.f(ibth2, "onStartImport");
        ibuq.f(ibth3, "onDismissInstallPasswordManagerDialog");
        ibuq.f(ibth4, "onDismissNoCredentialsImportedDialog");
        ibuq.f(ibth5, "onDismissOnlyConflictingCredentialsImportedDialog");
        ibuq.f(ibth6, "onDismissGenericErrorDialog");
        ibuq.f(ibth7, "onMoreAboutImportingClicked");
        ibuq.f(ibth8, "onDone");
        goz goz1 = goz0.ao(1420487337);
        int v1 = (v & 6) == 0 ? (goz1.Z(bdtu0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibth1) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(ibth2) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (goz1.Z(ibth3) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (goz1.Z(ibth4) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v1 |= (goz1.Z(ibth5) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v) == 0) {
            v1 |= (goz1.Z(ibth6) ? 0x800000 : 0x400000);
        }
        if((0x6000000 & v) == 0) {
            v1 |= (goz1.Z(ibth7) ? 0x4000000 : 0x2000000);
        }
        if((0x30000000 & v) == 0) {
            v1 |= (goz1.Z(ibth8) ? 0x20000000 : 0x10000000);
        }
        if((306783379 & v1) == 306783378 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
            goto label_50;
        }
        if((bdtu0 instanceof bdtr)) {
            goz1.M(0xD59B2958);
            goz2 = goz1;
            bdtp.b(((bdtr)bdtu0), ibth0, ibth1, ibth2, ibth3, ibth4, ibth5, ibth6, goz2, v1 & 0x1FFFFF0);
            goz2.x();
            goto label_50;
        }
        goz2 = goz1;
        if((bdtu0 instanceof bdts)) {
            goz2.M(0xDDD31308);
            bdtp.c(goz2, 0);
            goz2.x();
            goto label_50;
        }
        if((bdtu0 instanceof bdtt)) {
            goz2.M(0xDDD4A8B2);
            bdtp.d(((bdtt)bdtu0), ibth7, ibth8, goz2, v1 >> 21 & 0x3F0);
            goz2.x();
        label_50:
            gsb gsb0 = goz2.af();
            if(gsb0 != null) {
                gsb0.d = new bdsp(bdtu0, ibth0, ibth1, ibth2, ibth3, ibth4, ibth5, ibth6, ibth7, ibth8, v);
            }
            return;
        }
        goz2.M(0xD59B21C9);
        goz2.x();
        throw new ibnq();
    }

    public static final void f(ibth ibth0, goz goz0, int v) {
        ibuq.f(ibth0, "onUploadCsv");
        goz goz1 = goz0.ao(0x879E90);
        int v1 = (v & 6) == 0 ? (goz1.Z(ibth0) ? 4 : 2) | v : v;
        if((v1 & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            goz1.M(0xFD1A4951);
            iwg iwg0 = new iwg(null);
            iwg0.j(isq.c(0x7F1526E3, goz1));  // string:pwm_import_credentials_dialog_upload_csv_file_part1 "Or if you already exported 
                                              // your passwords, you can import them by"
            iwg0.j(" ");
            goz1.M(-48602782);
            jbf jbf0 = new jbf(new jat(fpu.a(goz1).a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, jjz.b, null, 0xEFFE), 14);
            goz1.M(5004770);
            Object object0 = goz1.j();
            if((v1 & 14) == 4 || object0 == gop.a) {
                object0 = new bdsn(ibth0);
                goz1.P(object0);
            }
            goz1.x();
            int v2 = iwg0.b(new iwy("uploadcsv", jbf0, ((ixb)object0)));
            try {
                iwg0.j(isq.c(0x7F1526E4, goz1));  // string:pwm_import_credentials_dialog_upload_csv_file_part2 "uploading a CSV file"
            }
            catch(Throwable throwable0) {
                iwg0.k(v2);
                throw throwable0;
            }
            iwg0.k(v2);
            goz1.x();
            iwj iwj0 = iwg0.d();
            goz1.x();
            ebw.b(iwj0, null, jbn.y(fpu.d(goz1).l, fpu.a(goz1).s, 0L, null, null, null, 0L, null, 0, 0L, null, null, 0, 0, null, 0xFFFFFE), null, 0, false, 0, 0, null, goz1, 0, 0, 0x7FA);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bdso(ibth0, v);
        }
    }

    public static final void g(hfc hfc0, ibth ibth0, goz goz0, int v) {
        ibuq.f(ibth0, "onMoreAboutImportingClicked");
        goz goz1 = goz0.ao(0x81FB10C2);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            goz1.M(0xEF7A0138);
            iwg iwg0 = new iwg(null);
            iwg0.j(isq.c(0x7F1526E8, goz1));  // string:pwm_import_credentials_result_screen_description_1 "You can now use your 
                                              // sign-in info through Google Password Manager."
            iwg0.j(" ");
            goz1.M(0xEF7A1A03);
            jbf jbf0 = new jbf(new jat(fpu.a(goz1).a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, jjz.b, null, 0xEFFE), 14);
            goz1.M(5004770);
            Object object0 = goz1.j();
            if((v1 & 0x70) == 0x20 || object0 == gop.a) {
                object0 = new bdsl(ibth0);
                goz1.P(object0);
            }
            goz1.x();
            int v2 = iwg0.b(new iwy("uploadcsv", jbf0, ((ixb)object0)));
            try {
                iwg0.j(isq.c(0x7F1526E9, goz1));  // string:pwm_import_credentials_result_screen_description_2 "More about importing"
            }
            catch(Throwable throwable0) {
                iwg0.k(v2);
                throw throwable0;
            }
            iwg0.k(v2);
            goz1.x();
            iwj iwj0 = iwg0.d();
            goz1.x();
            ebw.b(iwj0, hfc0, jbn.y(fpu.d(goz1).k, fpu.a(goz1).s, 0L, null, null, null, 0L, null, 0, 0L, null, null, 0, 0, null, 0xFFFFFE), null, 0, false, 0, 0, null, goz1, v1 << 3 & 0x70, 0, 2040);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bdsm(hfc0, ibth0, v);
        }
    }
}

