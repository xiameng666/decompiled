import java.security.MessageDigest;

public final class qvq {
    public static final qvf a(qvb qvb0, byte[] arr_b, byte[] arr_b1) {
        int v36;
        int v32;
        int v28;
        qvm qvm1;
        byte b8;
        int v26;
        byte[] arr_b18;
        byte b7;
        int v25;
        byte b5;
        qvc qvc1;
        qvd qvd0;
        int v23;
        int v22;
        byte[] arr_b13;
        int v13;
        byte b2;
        int v8;
        int v3;
        qvs qvs0 = qvt.a();
        byte[] arr_b2 = qvs0.c;
        if(arr_b2[14] == -68) {
            arr_b2[14] = -91;
            int v = qvb0.b;
            int v1 = arr_b2[27];
            byte[] arr_b3 = qvs0.r(0x51F02);
            byte[] arr_b4 = new byte[4];
            qvf qvf0 = new qvf();
            switch(qvs0.b[6]) {
                case 2: 
                case 4: {
                    throw new qux(27014);
                }
                case 5: {
                    throw new qux(27014);
                }
                default: {
                    if(arr_b2[17] != -94) {
                        throw new qux(27013);
                    }
                    if(qvb0.c == 0 && (v & 0x2F) == 0) {
                        int v2 = (byte)(v & 0xFFFFFFC0);
                        if(v2 != 0xFFFFFFC0) {
                            if(qvb0.f != 3 && qvb0.f != 4) {
                                throw new qux(0x6700);
                            }
                            byte[] arr_b5 = v1 == 0xFFFFFF87 ? qvs0.q(0x11F0D) : qvs0.q(0x11F0C);
                            if(arr_b5 == null) {
                                throw new qux(27013);
                            }
                            if(qvb0.d != arr_b5[0]) {
                                throw new qux(0x6700);
                            }
                            if((v & 16) == 16) {
                                v3 = 92;
                            }
                            else {
                                if(qvr.a.b.equals(qve.d) && qvz.a(4, 8) == 92 && qwc.a(arr_b3, 0, 1) == 92 && v2 != 0) {
                                    throw new qux(27014);
                                }
                                v3 = -91;
                            }
                            if(v3 == 92 && qwc.a(arr_b3, 0, 1) == -91) {
                                throw new qux(27013);
                            }
                            if(arr_b2[0x1F] == -57) {
                                arr_b2[0x1F] = arr_b2[26] == -67 && v1 == 19 && qwc.a(qvb0.e, arr_b5[5] + 2, (byte)0x80) == 92 ? 0x72 : (byte)0x90;
                                if(v1 == 0xFFFFFF87) {
                                    arr_b2[0x1F] = 0x72;
                                }
                            }
                            if(v1 == 19) {
                                int v4 = qwc.c(qvs0.a, 18);
                                if(v4 != 0xFFFF && v4 != qwc.c(qvb0.e, ((int)arr_b5[6]))) {
                                    arr_b2[0x1F] = 0x72;
                                }
                                if(qvs0.o(73500)) {
                                    byte[] arr_b6 = qvs0.q(73500);
                                    byte[] arr_b7 = qvb0.e;
                                    int v5 = arr_b5[2];
                                    int v6 = 0;
                                    while(v6 < 6) {
                                        int v7 = v5 + v6;
                                        v8 = v3;
                                        int v9 = (short)(qwc.d(((byte)0), arr_b7[v7]) - qwc.d(((byte)0), arr_b6[v7]));
                                        if(v9 <= 0) {
                                            if(v9 < 0) {
                                                goto label_59;
                                            }
                                            v6 = (short)(v6 + 1);
                                            v3 = v8;
                                            continue;
                                        }
                                        arr_b2[0x1F] = 0x72;
                                        goto label_59;
                                    }
                                    v8 = v3;
                                    if(v6 != 6) {
                                        arr_b2[0x1F] = 0x72;
                                    }
                                }
                                else {
                                    v8 = v3;
                                }
                            label_59:
                                byte[] arr_b8 = new byte[6];
                                System.arraycopy(qvb0.e, ((int)arr_b5[2]), arr_b8, 0, 6);
                                qvs0.l(0x51F11, arr_b8);
                                byte[] arr_b9 = new byte[2];
                                System.arraycopy(qvb0.e, ((int)arr_b5[6]), arr_b9, 0, 2);
                                qvs0.l(0x51F19, arr_b9);
                            }
                            else {
                                v8 = v3;
                                if(v2 == 0x40) {
                                    v2 = 0xFFFFFF80;
                                }
                            }
                            qvs qvs1 = qvt.a();
                            byte[] arr_b10 = qvs1.c;
                            int v10 = arr_b10[18] == -91 ? 4402 : 0x102;
                            if(qvz.a(4, 0x20) != 92) {
                                if(arr_b10[23] == -91 && (arr_b10[0x1F] == 0x72 || arr_b10[0x20] == 92)) {
                                    v10 |= 0x40C0;
                                }
                            }
                            else if(arr_b10[23] == -91 && (arr_b10[36] != 92 || arr_b10[37] != 92)) {
                                if(arr_b10[0x1F] == 0x72) {
                                    byte[] arr_b11 = qvs1.a;
                                    int v11 = arr_b11[0x20];
                                    if(v11 != -1) {
                                        byte b = (byte)(arr_b11[34] + 1);
                                        if(b > v11) {
                                            v10 |= 0x40C0;
                                        }
                                        else {
                                            arr_b11[34] = b;
                                        }
                                    }
                                }
                                if(arr_b10[0x1F] == 0xFFFFFF90) {
                                    byte[] arr_b12 = qvs1.a;
                                    int v12 = arr_b12[33];
                                    if(v12 != -1) {
                                        byte b1 = (byte)(arr_b12[35] + 1);
                                        if(b1 <= v12) {
                                            arr_b12[35] = b1;
                                        }
                                        else {
                                            v10 |= 0x40C0;
                                        }
                                    }
                                }
                            }
                            if((v10 & 0xFFFFC0C0) == 0x40C0) {
                                qvs0.g = quw.d;
                                if(arr_b2[26] != -67) {
                                    throw new qux(quw.b, null);
                                }
                                b2 = 0;
                            }
                            else {
                                b2 = (v10 & 0x3030) == 0x1030 || v2 == 0 ? 0 : (byte)0x80;
                            }
                            if(b2 == 0) {
                                qvz.b(0, 0x30);
                                v13 = -91;
                            }
                            else {
                                qvz.c(0, 0x20);
                                v13 = v8;
                            }
                            if(v13 == 92) {
                                qvz.c(2, 2);
                            }
                            if(v1 == 0xFFFFFF87) {
                                qvz.b(1, 0xFE);
                                qvz.b(2, 0xFF);
                            }
                            if(v1 == 19) {
                                byte b3 = (byte)qvb0.d;
                                arr_b13 = new byte[qvb0.d + 9];
                                arr_b13[0] = b3;
                                int v14 = qwc.b(qvb0.e, ((int)arr_b5[2]), arr_b13, 1, 6);
                                int v15 = qwc.b(qvb0.e, ((int)arr_b5[3]), arr_b13, v14, 6);
                                int v16 = qwc.b(qvb0.e, ((int)arr_b5[4]), arr_b13, v15, 2);
                                int v17 = qwc.b(qvb0.e, ((int)arr_b5[5]), arr_b13, v16, 5);
                                int v18 = qwc.b(qvb0.e, ((int)arr_b5[6]), arr_b13, v17, 2);
                                int v19 = qwc.b(qvb0.e, ((int)arr_b5[7]), arr_b13, v18, 3);
                                int v20 = qwc.b(qvb0.e, ((int)arr_b5[8]), arr_b13, v19, 1);
                                int v21 = qwc.b(qvb0.e, ((int)arr_b5[1]), arr_b13, v20, 4);
                                qwc.b(qvb0.e, ((int)arr_b5[1]), arr_b4, 0, 4);
                                v22 = qwc.b(arr_b3, 0, arr_b13, v21, 2);
                            }
                            else {
                                byte b4 = (byte)qvb0.d;
                                arr_b13 = new byte[qvb0.d + 7];
                                arr_b13[0] = b4;
                                v22 = qwc.b(qvb0.e, ((int)arr_b5[1]), arr_b13, 1, 4);
                                qwc.b(qvb0.e, ((int)arr_b5[1]), arr_b4, 0, 4);
                            }
                            byte[] arr_b14 = qvs0.b;
                            if(arr_b14[16] == 92) {
                                v23 = qwc.c(arr_b14, 0);
                                qvd0 = null;
                            }
                            else {
                                qvd0 = qvs0.h;
                                v23 = qvd0 == null ? qwc.c(arr_b14, 0) : qvd0.d;
                            }
                            if(v23 == 0xFFFF) {
                                arr_b2[46] = 92;
                                v23 = 0xFFFF;
                            }
                            qwc.b(arr_b2, 19, arr_b13, qwc.l(arr_b13, v22, ((short)v23)), 4);
                            byte[] arr_b15 = new byte[8];
                            qvm qvm0 = qvs0.h();
                            int v24 = qvm0.f(arr_b13, arr_b15);
                            if(v24 < 0 || v23 > v24) {
                                throw new qux(27013);
                            }
                            if(v24 > qvs0.a()) {
                                throw new qux(27013);
                            }
                            byte[] arr_b16 = qvs0.b;
                            if(arr_b16[16] == 92) {
                                if(v24 != v23) {
                                    qwc.l(arr_b16, 0, ((short)v24));
                                }
                                qvc qvc0 = qvs0.d(v24);
                                if(qvc0 == null) {
                                    throw new qux(27013);
                                }
                                qvc1 = qvc0;
                                qvd0 = null;
                            }
                            else {
                                if(qvd0 == null) {
                                    qvd0 = qvs0.g(v24);
                                    if(qvd0 == null) {
                                        throw new qux(0x6F00);
                                    }
                                    qvs0.h = qvd0;
                                }
                                else {
                                    qvs0.h = null;
                                }
                                if(qvd0 == null) {
                                    throw new qux(27013);
                                }
                                qvc1 = null;
                            }
                            String s = qvs0.i(92);
                            if(s == null) {
                                b5 = b2;
                            }
                            else {
                                b5 = b2;
                                qvs0.c().b(qvr.a.c, "HCECLIENT_META_DATA", s);
                            }
                            qvs qvs2 = qvt.a();
                            byte[] arr_b17 = qvs2.b[16] == 92 ? null : qvd0.g;
                            if(v1 == 19) {
                                byte b6 = qvs2.a[8];
                                switch(b6) {
                                    case -1: {
                                        throw new qux(0x6F00);
                                    }
                                    case 1: {
                                        v25 = arr_b17 == null ? 11 : 27;
                                        if(qvs2.o(0x11F10)) {
                                            v25 += qvs2.q(0x11F10).length;
                                        }
                                        break;
                                    }
                                    default: {
                                        v25 = 8;
                                    }
                                }
                                b7 = qvs2.a[7];
                                if(b7 == 0) {
                                    throw new qux(0x6F00);
                                }
                                arr_b18 = arr_b5;
                                v26 = v25;
                                b8 = b6;
                                v1 = 19;
                            }
                            else {
                                b7 = qvs2.a[6];
                                if(b7 == 0) {
                                    throw new qux(0x6F00);
                                }
                                arr_b18 = arr_b5;
                                v26 = 7;
                                b8 = 2;
                            }
                            if(v13 == 92) {
                                v26 += 3;
                            }
                            byte[] arr_b19 = new byte[v26];
                            if(v13 == 92) {
                                qvm1 = qvm0;
                                int v27 = qwc.l(arr_b19, 0, (short)0x9F10);
                                arr_b19[v27] = (byte)(v26 - 3);
                                v28 = v27 + 2;
                                arr_b19[v27 + 1] = (byte)(v26 - 4);
                            }
                            else {
                                qvm1 = qvm0;
                                arr_b19[0] = (byte)(v26 - 1);
                                v28 = 1;
                            }
                            arr_b19[v28] = qvs2.b[16] == 92 ? qvc1.c : qvd0.e;
                            arr_b19[v28 + 1] = b7;
                            byte[] arr_b20 = qvs2.c;
                            int v29 = qwc.b(arr_b20, 19, arr_b19, v28 + 2, 4);
                            if(v1 == 19) {
                                arr_b19[v29] = b8;
                                if(b8 == 1) {
                                    int v30 = v29 + 2;
                                    if(arr_b17 == null) {
                                        arr_b19[v29 + 1] = 0;
                                    }
                                    else {
                                        arr_b19[v29 + 1] = (byte)arr_b17.length;
                                        v30 = qwc.b(arr_b17, 0, arr_b19, v30, arr_b17.length);
                                    }
                                    int v31 = v30 + 1;
                                    arr_b19[v30] = 1;
                                    if(arr_b20[23] == 92) {
                                        switch(arr_b20[24]) {
                                            case -73: {
                                                v32 = v30 + 2;
                                                arr_b19[v31] = 5;
                                                break;
                                            }
                                            case -33: {
                                                v32 = v30 + 2;
                                                arr_b19[v31] = 2;
                                                break;
                                            }
                                            case 69: {
                                                v32 = v30 + 2;
                                                arr_b19[v31] = 1;
                                                break;
                                            }
                                            case 105: {
                                                v32 = v30 + 2;
                                                arr_b19[v31] = 3;
                                                break;
                                            }
                                            default: {
                                                goto label_247;
                                            }
                                        }
                                        v31 = v32;
                                    }
                                    else {
                                        arr_b19[v31] = 0;
                                        v31 = v30 + 2;
                                    }
                                label_247:
                                    if(qvs2.o(0x11F10)) {
                                        byte[] arr_b21 = qvs2.q(0x11F10);
                                        qwc.b(arr_b21, 0, arr_b19, v31, arr_b21.length);
                                    }
                                }
                            }
                            if(v13 == -91) {
                                byte[] arr_b22 = new byte[v26 + 13];
                                arr_b22[0] = (byte)0x80;
                                arr_b22[1] = (byte)(v26 + 11);
                                arr_b22[2] = b5;
                                qwc.b(arr_b19, 0, arr_b22, qwc.b(arr_b15, 0, arr_b22, qwc.l(arr_b22, 3, ((short)v24)), 8), v26);
                                qvf0.a = arr_b22;
                            }
                            else {
                                int v33 = qwc.q(qvs0.a) / 8;
                                if(v33 == 0) {
                                    throw new qux(0x6F00);
                                }
                                byte[] arr_b23 = new byte[8];
                                System.arraycopy(qvs0.a, 24, arr_b23, 0, 8);
                                byte[] arr_b24 = new byte[v33 - 2];
                                qwc.m(arr_b24, 0, v33 - 2, 0);
                                MessageDigest messageDigest0 = qvs0.j();
                                if(messageDigest0 == null) {
                                    throw new qux(0x6F00);
                                }
                                messageDigest0.update(qvb0.e);
                                byte[] arr_b25 = new byte[v26 + 9];
                                qwc.b(arr_b, 0, arr_b25, 0, 9);
                                arr_b25[3] = b5;
                                qwc.b(arr_b19, 0, arr_b25, qwc.l(arr_b25, 7, ((short)v24)), v26);
                                byte[] arr_b26 = messageDigest0.digest(arr_b25);
                                qwc.b(arr_b26, 0, arr_b24, 21, arr_b26.length);
                                qwc.b(arr_b1, 0, arr_b24, 0, 4);
                                qwc.l(arr_b24, 10, ((short)v24));
                                arr_b24[12] = b5;
                                qwc.b(arr_b15, 0, arr_b24, 13, 8);
                                qwc.m(arr_b24, 41, v33 - 0x3F, -69);
                                qwc.b(qvb0.e, ((int)arr_b18[1]), arr_b24, v33 - 22, 4);
                                byte[] arr_b27 = new byte[v33];
                                int v34 = qvm1.n(arr_b24, arr_b27, arr_b23);
                                if(v34 < 0) {
                                    throw new qux(27013);
                                }
                                int v35 = v33 + 14 + v26;
                                if(v33 > 0x7F) {
                                    v35 += 2;
                                }
                                else if(v35 - 2 > 0x7F) {
                                    ++v35;
                                }
                                byte[] arr_b28 = new byte[v35];
                                arr_b28[0] = 0x77;
                                if(v35 - 2 > 0x7F) {
                                    arr_b28[1] = (byte)0x81;
                                    arr_b28[2] = (byte)(v35 - 3);
                                    v36 = 3;
                                }
                                else {
                                    arr_b28[1] = (byte)(v35 - 2);
                                    v36 = 2;
                                }
                                int v37 = qwc.l(arr_b28, qwc.b(arr_b25, 0, arr_b28, v36, v26 + 9), (short)0x9F4B);
                                if(v33 > 0x7F) {
                                    arr_b28[v37] = (byte)0x81;
                                    ++v37;
                                }
                                arr_b28[v37] = (byte)v34;
                                qwc.b(arr_b27, 0, arr_b28, v37 + 1, v33);
                                qvf0.a = arr_b28;
                            }
                            int v38 = arr_b2[0x1F];
                            if(v38 == 0x72) {
                                qvs0.g = quw.d;
                            }
                            else if(v38 == 0xFFFFFF90) {
                                qvs0.g = quw.c;
                            }
                            qvs0.l(0x51F15, arr_b15);
                            qvs0.l(0x51F16, arr_b4);
                            arr_b2[17] = -59;
                            return qvf0;
                        }
                    }
                    throw new qux(27270);
                }
            }
        }
        throw new qux(quw.f);
    }
}

