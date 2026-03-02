public final class bdql {
    public static final void a(hqf hqf0, int v, Integer integer0, bdou bdou0, bdou bdou1, goz goz0, int v1, int v2) {
        gze gze0;
        bdou bdou4;
        bdou bdou3;
        Integer integer2;
        hqf hqf2;
        goz goz2;
        bdou bdou2;
        Integer integer1;
        hqf hqf1;
        int v3;
        goz goz1 = goz0.ao(0x7D707F0D);
        if((v2 & 1) != 0) {
            v3 = v1 | 6;
            hqf1 = hqf0;
        }
        else if((v1 & 6) == 0) {
            hqf1 = hqf0;
            v3 = (goz1.X(hqf1) ? 4 : 2) | v1;
        }
        else {
            hqf1 = hqf0;
            v3 = v1;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v3 |= (goz1.V(v) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            integer1 = integer0;
        }
        else if((v1 & 0x180) == 0) {
            integer1 = integer0;
            v3 |= (goz1.X(integer1) ? 0x100 : 0x80);
        }
        else {
            integer1 = integer0;
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0xC00) == 0) {
            v3 |= (goz1.X(bdou0) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
            bdou2 = bdou1;
        }
        else if((v1 & 0x6000) == 0) {
            bdou2 = bdou1;
            v3 |= (goz1.X(bdou2) ? 0x4000 : 0x2000);
        }
        else {
            bdou2 = bdou1;
        }
        if((v3 & 9363) == 9362 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
            hqf2 = hqf1;
            integer2 = integer1;
            bdou3 = bdou2;
        }
        else {
            if(1 == (v2 & 1)) {
                hqf1 = null;
            }
            Integer integer3 = (v2 & 4) == 0 ? integer1 : null;
            if((v2 & 16) == 0) {
                gze0 = null;
                bdou4 = bdou2;
            }
            else {
                bdou4 = null;
                gze0 = null;
            }
            ibth ibth0 = bdou0.b;
            goz1.M(0xE34D15B7);
            gze gze1 = hqf1 == null ? null : gzf.e(850807246, new bdqe(hqf1), goz1);
            goz1.x();
            goz1.M(-481465800);
            if(integer3 != null) {
                gze0 = gzf.e(0xFCF0EC21, new bdqf(integer3), goz1);
            }
            goz1.x();
            goz2 = goz1;
            fiqf.b(ibth0, gzf.e(0x2AF611C5, new bdqh(bdou0), goz1), null, gzf.e(0x1C2E6003, new bdqj(bdou4), goz1), gze1, gzf.e(224833089, new bdqk(v), goz1), gze0, null, 0L, 0.0f, 0L, 0L, 0L, null, goz2, 0x30C30, 0, 0x3F84);
            hqf2 = hqf1;
            bdou3 = bdou4;
            integer2 = integer3;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new bdqd(hqf2, v, integer2, bdou0, bdou3, v1, v2);
        }
    }
}

