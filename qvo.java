import android.util.Log;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public final class qvo {
    public qvo() {
    }

    public qvo(qva qva0, quz quz0) {
        qvs qvs0 = qvt.a();
        qvs0.i = quz0;
        qvs0.j = new qvm(qva0);
    }

    public static final qvj a(Exception exception0) {
        qvj qvj0 = quw.e;
        if((exception0 instanceof qux)) {
            qvj qvj1 = ((qux)exception0).a;
            return qvj1 == null ? qvj0 : qvj1;
        }
        return qvj0;
    }

    public static final void b(qvj qvj0, qvj qvj1, String s) {
        qvj0.d = "220" + s + qvj1.c;
        String s1 = qvj1.e;
        if(s.compareToIgnoreCase("07") == 0) {
            qvs qvs0 = qvt.a();
            byte[] arr_b = qvs0.c;
            if(arr_b[33] == 92 && qvs0.p(0x51F11)) {
                s1 = s1 + ",AMOUNT=" + qwc.g(qvs0.r(0x51F11));
                arr_b[33] = -91;
            }
            if(qvs0.p(0x51F0F)) {
                s1 = s1 + ",MERCHANT_NAME=" + qwc.g(qvs0.r(0x51F0F));
                arr_b[33] = 92;
            }
            if(qvs0.p(0x51F10)) {
                s1 = s1 + ",MERCHANT_CODE=" + qwc.g(qvs0.r(0x51F10));
                arr_b[33] = 92;
            }
        }
        qvj0.e = s1;
        qvj0.c = qvj1.c;
    }

    public static final qvf c(byte[] arr_b) {
        qvj qvj1;
        byte[] arr_b18;
        byte[] arr_b14;
        byte[] arr_b13;
        int v23;
        int v22;
        int v21;
        int v20;
        boolean z1;
        int v12;
        boolean z;
        byte[] arr_b6;
        byte[] arr_b4;
        byte[] arr_b3;
        qvj qvj0 = quw.a;
        qvf qvf0 = new qvf();
        try {
            qvr qvr0 = qvr.a;
            qve qve0 = qvr0.b;
            if(qve0 == null) {
                throw new qux(quw.f);
            }
            qve qve1 = qve.c;
            if(!qve0.equals(qve1) && !qvr0.b.equals(qve.d)) {
                throw new qux(quw.f);
            }
            byte[] arr_b1 = qvt.a().c;
            switch(arr_b1[41]) {
                case -76: 
                case 0: {
                    arr_b1[41] = -76;
                    if(arr_b.length < 4) {
                        throw new qux(quw.h);
                    }
                    qvb qvb0 = new qvb(arr_b);
                    if(qvb0.a != 0 && qvb0.a != 0x80) {
                        throw new qux(0x6E00);
                    }
                alab1:
                    switch(qwc.c(arr_b, 0)) {
                        case 0xA4: {
                            arr_b1[14] = 35;
                            qvs qvs0 = qvt.a();
                            byte[] arr_b2 = qvs0.c;
                            if(arr_b2[14] != 35) {
                                throw new qux(quw.f);
                            }
                            arr_b2[14] = -91;
                            qvf qvf1 = new qvf();
                            int v = qvb0.c;
                            if((v & 2) == 2) {
                                throw new qux(0x6A82);
                            }
                            if(qvb0.b != 4 || v != 0) {
                                throw new qux(27270);
                            }
                            if(qvb0.d < 5 || qvb0.d > 16) {
                                throw new qux(0x6700);
                            }
                            if(qvb0.f != 3 && qvb0.f != 4) {
                                throw new qux(0x6700);
                            }
                            qvs0.g = null;
                            if(arr_b2[17] == -59) {
                                arr_b2[23] = -91;
                            }
                            int v1 = arr_b2[15];
                            if(qwc.p(qvb0.e, qvv.a, 0, qvb0.d) == 92) {
                                switch(v1) {
                                    case -54: {
                                        arr_b4 = qvs0.q(0x11F1A);
                                        break;
                                    }
                                    case 51: {
                                        arr_b4 = qvs0.q(0x11F19);
                                        break;
                                    }
                                    default: {
                                        arr_b4 = qvs0.q(0x11F18);
                                    }
                                }
                                arr_b2[16] = 0;
                                arr_b2[17] = 86;
                            }
                            else {
                                switch(v1) {
                                    case -54: {
                                        v1 = -54;
                                        goto label_45;
                                    }
                                    case 0: {
                                        throw new qux(0x6A82);
                                    }
                                    case 51: {
                                    label_45:
                                        if(qwc.p(qvb0.e, qvs0.q(0x11F02), 0, qvb0.d) == 92) {
                                            arr_b3 = qvs0.q(0x11F0E);
                                            arr_b2[16] = 51;
                                        }
                                        else {
                                        label_46:
                                            if(v1 != -54 && v1 != 84 || qwc.p(qvb0.e, qvs0.q(0x11F01), 0, qvb0.d) != 92) {
                                                throw new qux(0x6A82);
                                            }
                                            arr_b3 = qvs0.q(0x11F0F);
                                            arr_b2[16] = 84;
                                        }
                                        break;
                                    }
                                    default: {
                                        goto label_46;
                                    }
                                }
                                if(qvs0.b[6] == 1 && qvs0.b() == 0) {
                                    qvs0.w(4);
                                }
                                int v2 = qvs0.b[6];
                                if(v2 == 4) {
                                    qvf1.b = 0x6283;
                                    goto label_70;
                                }
                                else if(qvs0.a[11] != 4) {
                                    switch(v2) {
                                        case 2: {
                                            qvf1.b = 0x6283;
                                            goto label_70;
                                        }
                                        case 5: {
                                            qvf1.b = 27013;
                                        label_70:
                                            qvs0.g = quw.i;
                                        }
                                    }
                                }
                                else if(v2 == 5) {
                                    qvf1.b = 27013;
                                    goto label_70;
                                }
                                else {
                                    qvf1.b = 0x6283;
                                    goto label_70;
                                }
                                arr_b2[17] = -104;
                                if(!qvs0.o(0x11F01)) {
                                    arr_b2[38] = (byte)(arr_b2[38] | 1);
                                }
                                else if(arr_b2[16] == 51) {
                                    arr_b2[38] = (byte)(arr_b2[38] | 2);
                                }
                                else {
                                    arr_b2[38] = (byte)(arr_b2[38] | 1);
                                }
                                arr_b4 = arr_b3;
                            }
                            qvf1.a = arr_b4;
                            qvf0 = qvf1;
                            break;
                        }
                        case 0xB2: {
                            arr_b1[14] = -33;
                            int v3 = qvb0.c;
                            int v4 = qvb0.b;
                            qvs qvs1 = qvt.a();
                            byte[] arr_b5 = qvs1.c;
                            if(arr_b5[14] != -33) {
                                throw new qux(quw.f);
                            }
                            arr_b5[14] = -91;
                            qvf qvf2 = new qvf();
                            switch(qvs1.b[6]) {
                                case 4: {
                                    throw new qux(27014);
                                }
                                case 2: 
                                case 5: {
                                    throw new qux(27014);
                                }
                                default: {
                                    int v5 = arr_b5[17];
                                    if(v5 != -104 && v5 != -94 && v5 != -59) {
                                        throw new qux(27013);
                                    }
                                    if((v3 & 7) != 4 || v4 == 0 || (((byte)(v3 & 0xF8)) >> 3 & 0xFF) > 30) {
                                        throw new qux(27270);
                                    }
                                    if(qvb0.f != 2) {
                                        throw new qux(0x6700);
                                    }
                                    int v6 = qwc.d(((byte)(v3 >> 3)), ((byte)v4));
                                    if(v5 == -104) {
                                        if(v6 != 0x101 || qvs1.a[17] == 0xFFFFFF87) {
                                            throw new qux(27013);
                                        }
                                        v6 = 0x101;
                                    }
                                    qvs qvs2 = qvt.a();
                                    if(qvs2.p(0x51F01)) {
                                        arr_b6 = qvs2.r(0x51F01);
                                    }
                                    else {
                                        switch(qvs2.a[17]) {
                                            case -94: 
                                            case 19: {
                                                arr_b6 = qvs2.q(0x11F04);
                                                break;
                                            }
                                            default: {
                                                arr_b6 = qvs2.q(0x11F08);
                                            }
                                        }
                                    }
                                    if(arr_b6 == null) {
                                        throw new qux(0x6A82);
                                    }
                                    int v7 = 0x6A82;
                                    int v8 = 0;
                                    while(true) {
                                        if(v8 >= arr_b6.length) {
                                            goto label_133;
                                        }
                                        int v9 = arr_b6[v8] >> 3;
                                        int v10 = arr_b6[v8 + 1];
                                        int v11 = arr_b6[v8 + 2];
                                        if(v3 >> 3 == v9) {
                                            if(((byte)v4) >= v10 && ((byte)v4) <= v11) {
                                                v7 = 0xFFFF9000;
                                            label_133:
                                                if(v7 != 0xFFFF9000) {
                                                    throw new qux(((short)v7));
                                                }
                                                if(v6 != 0x101) {
                                                    z = false;
                                                }
                                                else if(arr_b5[27] == 0xFFFFFF87) {
                                                    v6 = 8450;
                                                    z = true;
                                                }
                                                else {
                                                    v6 = 0x2101;
                                                    z = false;
                                                }
                                                byte[] arr_b7 = qvs1.q(v6);
                                                if(arr_b7 == null) {
                                                    throw new qux(0x6A82);
                                                }
                                                if(z && qvz.a(4, 1) == 92) {
                                                    if(arr_b5[23] == 92) {
                                                        switch(arr_b5[24]) {
                                                            case -73: {
                                                                v12 = 0x728;
                                                                break;
                                                            }
                                                            case 69: 
                                                            case 105: {
                                                                v12 = 0x727;
                                                                break;
                                                            }
                                                            default: {
                                                                v12 = 0x721;
                                                            }
                                                        }
                                                    }
                                                    else {
                                                        v12 = 0x721;
                                                    }
                                                    byte[] arr_b8 = qvs1.a;
                                                    int v13 = arr_b8[22];
                                                    int v14 = (short)qwc.c(arr_b7, v13);
                                                    int v15 = arr_b8[23] == 92 ? v12 << 4 | v14 & 15 : ((short)(v12 | ((short)(v14 & 0xFFFFF000))));
                                                    qwc.l(arr_b7, v13, ((short)v15));
                                                }
                                                qvf2.a = arr_b7;
                                                qvf0 = qvf2;
                                                break alab1;
                                            }
                                            v7 = 0x6A83;
                                        }
                                        v8 += 4;
                                    }
                                }
                            }
                        }
                        case 0x80A8: {
                            arr_b1[14] = 86;
                            qvs qvs3 = qvt.a();
                            byte[] arr_b9 = qvs3.c;
                            if(arr_b9[14] != 86) {
                                throw new qux(quw.f);
                            }
                            arr_b9[14] = -91;
                            arr_b9[23] = -91;
                            qvf qvf3 = new qvf();
                            switch(qvs3.b[6]) {
                                case 4: {
                                    throw new qux(27014);
                                }
                                case 2: 
                                case 5: {
                                    throw new qux(27014);
                                }
                                default: {
                                    if(arr_b9[17] != -104) {
                                        throw new qux(27013);
                                    }
                                    if(qvb0.b != 0 || qvb0.c != 0) {
                                        throw new qux(27270);
                                    }
                                    if(qvb0.f != 3 && qvb0.f != 4) {
                                        throw new qux(0x6700);
                                    }
                                    if(qvb0.e[0] != 0xFFFFFF83 || qvb0.e[1] + 2 != qvb0.d) {
                                        throw new qux(27013);
                                    }
                                    byte[] arr_b10 = qvs3.q(0x11F09);
                                    if(arr_b9[16] == 84 && qvs3.o(0x11F0A)) {
                                        arr_b10 = qvs3.q(0x11F0A);
                                    }
                                    int v16 = arr_b10 == null ? 2 : arr_b10[0] + 2;
                                    if(v16 > 2 && qvb0.d <= 2) {
                                        throw new qux(27013);
                                    }
                                    if(v16 != qvb0.d) {
                                        throw new qux(0x6700);
                                    }
                                    int v17 = qwc.c(qvs3.b, 0);
                                    byte[] arr_b11 = qvs3.b;
                                    if(arr_b11[16] == 92 && arr_b9[42] == -91) {
                                        qwc.l(arr_b11, 0, ((short)(v17 + 1)));
                                        arr_b9[42] = 92;
                                    }
                                    if(arr_b10 == null) {
                                        v22 = -1;
                                        v20 = -80;
                                        z1 = false;
                                        v23 = 0;
                                        v21 = 0;
                                    }
                                    else {
                                        int v18 = arr_b10[2];
                                        z1 = v18 != -1 && (qwc.c(qvb0.e, v18 + 2) != 0 || qwc.c(qvb0.e, arr_b10[2] + 4) != 0);
                                        if(z1) {
                                            byte[] arr_b12 = qvb0.e;
                                            int v19 = arr_b10[2];
                                            v20 = arr_b12[v19 + 2];
                                            v21 = arr_b12[v19 + 3];
                                            v22 = arr_b12[v19 + 4];
                                            v23 = arr_b12[v19 + 5];
                                        }
                                        else {
                                            v20 = qvb0.e[arr_b10[1] + 2];
                                            v23 = 0;
                                            v21 = 0;
                                            v22 = v20;
                                        }
                                    }
                                    arr_b9[18] = -91;
                                    System.arraycopy(qvv.b, 0, arr_b9, 19, 4);
                                    if(qvr0.b.equals(qve1) && arr_b9[23] == -91) {
                                        arr_b9[23] = 92;
                                        arr_b9[24] = 105;
                                    }
                                    if(z1) {
                                        byte b = (byte)(arr_b9[38] | 4);
                                        arr_b9[38] = b;
                                        if((v22 & 0xFFFFFF80) == 0) {
                                            arr_b9[18] = 92;
                                        }
                                        if((v22 & 0x40) == 0x40 && (v21 & 0xFFFFFF80) == 0xFFFFFF80) {
                                            arr_b9[25] = 92;
                                            arr_b9[38] = (byte)(b | 8);
                                        }
                                        else {
                                            arr_b9[25] = -91;
                                        }
                                        if((v20 & 8) == 8) {
                                            arr_b9[26] = -14;
                                            arr_b9[38] = (byte)(((byte)(arr_b9[38] | 16)) | 0x20);
                                        }
                                        else {
                                            arr_b9[26] = -67;
                                            arr_b9[38] = (byte)(arr_b9[38] | 0x20);
                                        }
                                        if((v20 & 16) == 16) {
                                            arr_b9[27] = 19;
                                            arr_b9[38] = (byte)(arr_b9[38] | 0xFFFFFF80);
                                            if(qvz.a(2, 1) == 92 || qvs3.a[17] == 0xFFFFFF87) {
                                                arr_b9[27] = (byte)0x87;
                                            }
                                        }
                                        else {
                                            arr_b9[27] = (byte)0x87;
                                        }
                                        arr_b9[36] = (v23 & 0x40) == 0x40 ? 92 : -91;
                                        arr_b9[37] = (v23 & 0x20) == 0x20 ? 92 : -91;
                                    }
                                    else {
                                        if((v20 & 7) == 1 || ((v20 & 7) == 2 || (v20 & 7) == 4) || (v20 & 7) == 5) {
                                            arr_b9[18] = 92;
                                        }
                                        if((v20 & 8) == 8) {
                                            arr_b9[25] = 92;
                                            arr_b9[38] = (byte)(arr_b9[38] | 8);
                                        }
                                        else {
                                            arr_b9[25] = -91;
                                        }
                                        if(((byte)(v20 & 0xC0)) == 0xFFFFFF80) {
                                            arr_b9[27] = 19;
                                            arr_b9[26] = -67;
                                            arr_b9[38] = (byte)(arr_b9[38] | 0xFFFFFFA0);
                                            if(qvz.a(2, 1) == 92 || qvs3.a[17] == 0xFFFFFF87) {
                                                arr_b9[27] = (byte)0x87;
                                            }
                                            arr_b9[25] = -91;
                                        }
                                        else {
                                            switch(((byte)(v20 & 0xC0))) {
                                                case 0xFFFFFFC0: {
                                                    arr_b9[27] = 19;
                                                    arr_b9[26] = -14;
                                                    arr_b9[38] = (byte)(arr_b9[38] | -80);
                                                    if(qvz.a(2, 1) == 92 || qvs3.a[17] == 0xFFFFFF87) {
                                                        arr_b9[27] = (byte)0x87;
                                                    }
                                                    break;
                                                }
                                                case 0: {
                                                    arr_b9[27] = (byte)0x87;
                                                    arr_b9[26] = -56;
                                                    arr_b9[25] = -91;
                                                    arr_b9[38] = (byte)(arr_b9[38] | 16);
                                                    break;
                                                }
                                                default: {
                                                    if(((byte)(v20 & 0xC0)) != 0x40) {
                                                        throw new qux(27013);
                                                    }
                                                    arr_b9[27] = (byte)0x87;
                                                    if(arr_b9[25] == 92) {
                                                        arr_b9[26] = -14;
                                                        arr_b9[38] = (byte)(((byte)(arr_b9[38] | 16)) | 0x20);
                                                    }
                                                    else {
                                                        arr_b9[26] = -67;
                                                        arr_b9[38] = (byte)(arr_b9[38] | 0x20);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    int v24 = qvs3.a[17];
                                    if(v24 != -94 && v24 != arr_b9[27]) {
                                        throw new qux(27013);
                                    }
                                    qvz.d();
                                    if(qvr0.b.equals(qve.d) && qvz.a(4, 8) == 92 && arr_b9[27] != 19) {
                                        throw new qux(27013);
                                    }
                                    if(arr_b9[27] == 0xFFFFFF87) {
                                        arr_b13 = qvs3.q(0x11F07);
                                        arr_b14 = qvs3.q(0x11F08);
                                    }
                                    else {
                                        if(arr_b9[16] == 84) {
                                            arr_b13 = qvs3.q(0x11F05);
                                            arr_b14 = qvs3.q(0x11F06);
                                        }
                                        else {
                                            arr_b14 = null;
                                            arr_b13 = null;
                                        }
                                        if(arr_b9[16] == 51 || arr_b13 == null || arr_b14 == null) {
                                            arr_b13 = qvs3.q(0x11F03);
                                            arr_b14 = qvs3.q(0x11F04);
                                        }
                                    }
                                    if(arr_b14 == null || arr_b13 == null) {
                                        throw new qux(27013);
                                    }
                                    byte[] arr_b15 = new byte[arr_b13.length];
                                    byte[] arr_b16 = new byte[arr_b14.length];
                                    System.arraycopy(arr_b13, 0, arr_b15, 0, arr_b13.length);
                                    System.arraycopy(arr_b14, 0, arr_b16, 0, arr_b14.length);
                                    if(qvz.a(4, 4) == -91) {
                                        arr_b15[0] = (byte)(arr_b15[0] & -2);
                                    }
                                    if(qvs3.o(0x11F01) && arr_b9[16] == 51) {
                                        arr_b9[36] = 92;
                                        arr_b9[37] = 92;
                                    }
                                    if(arr_b9[36] != 92 || arr_b9[37] != 92) {
                                        arr_b15[0] = (byte)(arr_b15[0] & -2);
                                    }
                                    qvs3.g = qvj0;
                                    switch(arr_b9[26]) {
                                        case -67: {
                                            if(arr_b9[27] == 0xFFFFFF87) {
                                                arr_b9[0x1F] = 0x72;
                                            }
                                            break;
                                        }
                                        case -56: {
                                            arr_b15[0] = (byte)(arr_b15[0] & 0x7C);
                                            int v25 = arr_b15[1];
                                            arr_b15[1] = 0;
                                            arr_b9[0x1F] = 0x72;
                                            break;
                                        }
                                        case -14: {
                                            arr_b9[0x1F] = arr_b9[25] == 92 ? 0x72 : (byte)0x90;
                                        }
                                    }
                                    if(arr_b9[23] == 92) {
                                        byte[] arr_b17 = qvs3.a;
                                        arr_b17[34] = 0;
                                        arr_b17[35] = 0;
                                    }
                                    if(arr_b9[26] == -14 && qvz.a(4, 1) == 92) {
                                        int v26 = arr_b13.length + arr_b14.length;
                                        arr_b18 = new byte[v26 + 12];
                                        arr_b18[0] = 0x77;
                                        arr_b18[1] = (byte)(v26 + 10);
                                        arr_b18[2] = (byte)0x82;
                                        arr_b18[3] = (byte)arr_b13.length;
                                        System.arraycopy(arr_b15, 0, arr_b18, 4, arr_b13.length);
                                        arr_b18[arr_b13.length + 4] = -108;
                                        arr_b18[arr_b13.length + 5] = (byte)arr_b14.length;
                                        System.arraycopy(arr_b16, 0, arr_b18, arr_b13.length + 6, arr_b14.length);
                                        int v27 = qwc.l(arr_b18, arr_b13.length + 6 + arr_b14.length, (short)0x9F71);
                                        arr_b18[v27] = 3;
                                        System.arraycopy(arr_b9, 28, arr_b18, v27 + 1, 3);
                                    }
                                    else {
                                        int v28 = arr_b13.length + arr_b14.length;
                                        arr_b18 = new byte[v28 + 2];
                                        arr_b18[0] = (byte)0x80;
                                        arr_b18[1] = (byte)v28;
                                        System.arraycopy(arr_b15, 0, arr_b18, 2, arr_b13.length);
                                        System.arraycopy(arr_b16, 0, arr_b18, arr_b13.length + 2, arr_b14.length);
                                    }
                                    if(arr_b9[0x1F] == 0x72 && arr_b9[23] == -91) {
                                        qvs3.g = quw.b;
                                        if(arr_b9[26] == -14) {
                                            arr_b9[0x20] = 92;
                                        }
                                    }
                                    qvf3.a = arr_b18;
                                    arr_b9[17] = -94;
                                    int v29 = qvb0.d;
                                    if(v29 > 2) {
                                        byte[] arr_b19 = new byte[v29 - 2];
                                        System.arraycopy(qvb0.e, 2, arr_b19, 0, v29 - 2);
                                        MessageDigest messageDigest0 = qvs3.j();
                                        if(messageDigest0 == null) {
                                            throw new qux(0x6F00);
                                        }
                                        messageDigest0.reset();
                                        messageDigest0.update(arr_b19);
                                    }
                                    qvs3.l(0x51F02, arr_b15);
                                    qvs3.l(0x51F01, arr_b16);
                                    if(arr_b10 != null) {
                                        int v30 = arr_b10[3];
                                        if(v30 != -1) {
                                            int v31 = arr_b10[5];
                                            if(v31 != -1) {
                                                byte[] arr_b20 = new byte[v31];
                                                System.arraycopy(qvb0.e, v30 + 2, arr_b20, 0, v31);
                                                qvs3.l(0x51F0F, arr_b20);
                                            }
                                        }
                                        int v32 = arr_b10[4];
                                        if(v32 != -1) {
                                            byte[] arr_b21 = new byte[2];
                                            System.arraycopy(qvb0.e, v32 + 2, arr_b21, 0, 2);
                                            qvs3.l(0x51F10, arr_b21);
                                        }
                                    }
                                    qvf0 = qvf3;
                                    break alab1;
                                }
                            }
                        }
                        case 0x80AE: {
                            arr_b1[14] = -68;
                            qvf0 = qvq.a(qvb0, new byte[]{-97, 39, 1, 0, -97, 54, 2, 0, 0}, new byte[]{5, 1, 38, 8});
                            break;
                        }
                        case 0x80CA: {
                            arr_b1[14] = -103;
                            qvs qvs4 = qvt.a();
                            byte[] arr_b22 = qvs4.c;
                            if(arr_b22[14] != -103) {
                                throw new qux(quw.f);
                            }
                            arr_b22[14] = -91;
                            qvf qvf4 = new qvf();
                            switch(qvs4.b[6]) {
                                case 4: {
                                    throw new qux(27014);
                                }
                                case 2: 
                                case 5: {
                                    throw new qux(27014);
                                }
                                default: {
                                    switch(arr_b22[17]) {
                                        case -94: 
                                        case -59: {
                                            if(arr_b22[27] != 0xFFFFFF87) {
                                                throw new qux(27013);
                                            }
                                            if(qvb0.b != 0x9F || qvb0.c != 54) {
                                                throw new qux(27270);
                                            }
                                            if(qvb0.f != 2) {
                                                throw new qux(0x6700);
                                            }
                                            byte[] arr_b23 = new byte[5];
                                            int v33 = qwc.l(arr_b23, 0, (short)0x9F36);
                                            arr_b23[v33] = 2;
                                            qvd qvd0 = qvs4.h;
                                            if(qvd0 == null) {
                                                System.arraycopy(qvs4.b, 0, arr_b23, v33 + 1, 2);
                                            }
                                            else {
                                                qwc.l(arr_b23, v33 + 1, ((short)qvd0.d));
                                            }
                                            qvf4.a = arr_b23;
                                            qvf0 = qvf4;
                                            break alab1;
                                        }
                                        default: {
                                            throw new qux(27013);
                                        }
                                    }
                                }
                            }
                        }
                        default: {
                            throw new qux(0x6D00);
                        }
                    }
                    if(qvt.a().g != null) {
                        qvj0 = qvt.a().g;
                        goto label_445;
                    label_438:
                        qvf0.b = qux0.b;
                        qvj1 = qux0.a;
                        if(qvj1 != null) {
                            break;
                        }
                    }
                    goto label_445;
                }
                default: {
                    throw new qux(quw.f);
                }
            }
        }
        catch(qux qux0) {
            goto label_438;
        }
        catch(Exception unused_ex) {
            goto label_443;
        }
        catch(Throwable throwable0) {
            goto label_449;
        }
        qvj0 = qvj1;
        goto label_445;
        try {
        label_443:
            qvf0.b = 0x6F00;
            qvj0 = quw.e;
        }
        catch(Throwable throwable0) {
            goto label_449;
        }
    label_445:
        qvo.b(qvf0, qvj0, "07");
        if(arr_b != null) {
            qvy.c(arr_b[1], qvf0.b);
        }
        return qvf0;
    label_449:
        qvo.b(qvf0, qvj0, "07");
        if(arr_b != null) {
            qvy.c(arr_b[1], qvf0.b);
        }
        throw throwable0;
    }

    public static final qvh d() {
        String s6;
        String s5;
        String s4;
        qvj qvj0 = quw.a;
        qvh qvh0 = new qvh();
        try {
            try {
                qvh qvh1 = new qvh();
                qvs qvs0 = qvt.a();
                qvr qvr0 = qvr.a;
                if(qvr0.b == null) {
                    throw new qux(quw.f);
                }
                String s = qvr0.c;
                qvs qvs1 = qvt.a();
                boolean z = !qvs1.d.isEmpty() && qvs1.c[13] != 92;
                if(z) {
                    byte[] arr_b = qvs0.c;
                    if(arr_b[12] == 92) {
                        qvs0.w(4);
                    }
                    if(arr_b[46] == 92) {
                        qvs0.w(5);
                    }
                    if(arr_b[11] == 92) {
                        LinkedHashMap linkedHashMap0 = qvs0.d;
                        StringBuffer stringBuffer0 = new StringBuffer();
                        for(Iterator iterator0 = linkedHashMap0.keySet().iterator(); iterator0.hasNext(); iterator0 = iterator0) {
                            Object object0 = iterator0.next();
                            Integer integer0 = (Integer)object0;
                            if(((int)integer0) <= 0x51F00) {
                                byte[] arr_b1 = (byte[])linkedHashMap0.get(integer0);
                                String s1 = qwc.g(arr_b1);
                                stringBuffer0.append(String.format("%06x", integer0) + String.format("%04x", ((int)arr_b1.length)) + s1);
                            }
                        }
                        String s2 = stringBuffer0.toString();
                        String s3 = qwc.g(qvs0.a);
                        s4 = "1" + String.format("%04x", ((int)0xAFFF)) + "01" + String.format("%02x", ((byte)17)) + (String.format("%04x", ((int)0x1FFF)) + String.format("%04x", ((int)(s2.length() / 2))) + s2) + (String.format("%04x", ((int)0x2FFF)) + String.format("%04x", ((int)(s3.length() / 2))) + s3);
                    }
                    else {
                        s4 = qvs0.p(0x51F14) ? "1" + qwc.g(qvs0.v(0x51F14)) : null;
                    }
                    if(s4 != null) {
                        byte[] arr_b2 = qvx.b(new Object[]{s4});
                        qvs.t(qvs0.h().s(arr_b2, arr_b2.length, new byte[arr_b2.length + 0x800], arr_b2.length + 0x800));
                        arr_b[0x2F] = 92;
                    }
                    s5 = qvs0.i(-91);
                }
                else {
                    s5 = null;
                }
                qvs.t(qvs0.h().e((s == null || s.contentEquals("") ? "10".getBytes() : qvx.b(new Object[]{"1" + s}))));
                qvs0.h();
                if(z) {
                    qve qve0 = qve.g;
                    if(qvr0.b.equals(qve0) && s != null) {
                        s6 = s.substring(0, s.length() - 8);
                        qvr0.c = s6;
                    }
                    else {
                        s6 = s;
                    }
                    if(qvr0.b.equals(qve0)) {
                        qvs.t(qvs0.h().j(s, s6));
                    }
                    if(s5 != null) {
                        qvs0.c().b(s6, "HCECLIENT_META_DATA", s5);
                    }
                }
                else {
                    byte[] arr_b3 = qvs0.c;
                    if(arr_b3[13] == 92) {
                        qvs0.c().a(s);
                        qvs0.h().j(s, null);
                    }
                    else if(arr_b3[39] == 92) {
                        String s7 = qvr0.c;
                        qvs0.c().b(s7, "PROVISIONING_DATA_CONTEXT", "dummy");
                    }
                }
                byte[] arr_b4 = qvs0.c;
                if(arr_b4[0x30] == 92) {
                    qvs0.c().a(s);
                }
                byte[] arr_b5 = qvs0.v(0x51F04);
                if(arr_b5 == null) {
                    byte[] arr_b6 = qvs0.v(0x51F15);
                    byte[] arr_b7 = qvs0.v(0x51F16);
                    if(arr_b6 != null && arr_b7 != null) {
                        arr_b4[14] = -94;
                        arr_b5 = qvz.e(arr_b7, arr_b6, arr_b4[27]);
                    }
                    else {
                        arr_b5 = qwc.n("0000000000000000000000000000000000000000000000000000000000000000");
                    }
                }
                qvh1.a = qwc.g(arr_b5).toLowerCase();
                qvh0 = qvh1;
            }
            catch(Exception exception0) {
                qvj0 = qvo.a(exception0);
            }
        }
        catch(Throwable throwable0) {
            qvo.b(qvh0, qvj0, "02");
            qvy.a(qvh0.d, qvr.a.b, 0L);
            qvs qvs2 = qvt.a();
            qwc.g(qvs2.v(0x51F18));
            qvr.a.b();
            qvs2.u();
            throw throwable0;
        }
        qvo.b(qvh0, qvj0, "02");
        qvy.a(qvh0.d, qvr.a.b, 0L);
        qvs qvs3 = qvt.a();
        qwc.g(qvs3.v(0x51F18));
        qvr.a.b();
        qvs3.u();
        return qvh0;
    }

    public static final qvj e(int v, String s) {
        qve qve4;
        boolean z1;
        String s1;
        qve qve0;
        Log.i("amexhceclient", "::SDK Build Version::1.0.23-2.0.25");
        qvj qvj0 = quw.a;
        qvj qvj1 = new qvj();
        qve[] arr_qve = qve.values();
        for(int v1 = 0; true; ++v1) {
            qve0 = null;
            if(v1 >= arr_qve.length) {
                break;
            }
            qve qve1 = arr_qve[v1];
            if(qve1.ordinal() == v) {
                qve0 = qve1;
                break;
            }
        }
        try {
            if(qve0 == null) {
                throw new qux(quw.f);
            }
            qvs qvs0 = qvt.a();
            qve qve2 = qve.c;
            if(!qve0.equals(qve2) && !qve0.equals(qve.d) && !qve0.equals(qve.f) && !qve0.equals(qve.e) && !qve0.equals(qve.g) && !qve0.equals(qve.b)) {
                throw new qux(quw.f);
            }
            boolean z = qvt.a().c().d();
            qve qve3 = qve.g;
            if(qve0.equals(qve3)) {
                if(!z) {
                    throw new qux(quw.f);
                }
                s1 = s + "_reperso";
                z = false;
            }
            else {
                s1 = s;
            }
            if(z) {
                z1 = true;
            }
            else {
                qvs0.c[39] = 92;
                if(!qve.b.equals(qve0) && !qve3.equals(qve0)) {
                    throw new qux(quw.f);
                }
                z1 = false;
            }
            qvr qvr0 = qvr.a;
            qvr0.a(qve0);
            qvr0.c = s1;
            qvs qvs1 = qvt.a();
            byte[] arr_b = qvx.b(new Object[]{"1" + qvr0.c});
            int v2 = qvs1.h().k(arr_b);
            qvs.t(v2);
            if(z1 && v2 == 0) {
                throw new qux(quw.g);
            }
            if(v2 > 0) {
                qwc.e(qvs1.c, 7, ((long)v2));
            }
            if(z1) {
                qvs0.n();
                byte[] arr_b1 = qvs0.c;
                qve4 = qve2;
                int v3 = (int)qwc.f(arr_b1, 7);
                if(v3 == 0) {
                    throw new qux(quw.e);
                }
                qvm qvm0 = qvs0.h();
                byte[] arr_b2 = new byte[v3];
                qvs.t(qvm0.o(1, null, 0, arr_b2, v3));
                Object[] arr_object = qvx.c(arr_b2);
                if(arr_object == null) {
                    throw new qux(quw.e);
                }
                String s2 = arr_object[0].toString();
                if(Integer.parseInt(s2.substring(0, 4), 16) == 0xAFFF && Integer.parseInt(s2.substring(6, 8), 16) == 17) {
                    for(int v4 = 8; v4 < s2.length(); v4 = v6) {
                        int v5 = Integer.parseInt(s2.substring(v4 + 4, v4 + 8), 16);
                        int v6 = v5 + v5 + (v4 + 8);
                        String s3 = s2.substring(v4 + 8, v6);
                        switch(Integer.parseInt(s2.substring(v4, v4 + 4), 16)) {
                            case 0x1FFF: {
                                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                                if(s3.length() < 10) {
                                    linkedHashMap0 = null;
                                }
                                else {
                                    for(int v7 = 0; v7 < s3.length(); v7 = v9) {
                                        int v8 = Integer.parseInt(s3.substring(v7 + 6, v7 + 10), 16);
                                        int v9 = v8 + v8 + (v7 + 10);
                                        linkedHashMap0.put(Integer.valueOf(Integer.parseInt(s3.substring(v7, v7 + 6), 16)), qwc.n(s3.substring(v7 + 10, v9)));
                                    }
                                }
                                qvs0.d = linkedHashMap0;
                                break;
                            }
                            case 0x2FFF: {
                                byte[] arr_b3 = qwc.n(s3);
                                int v10 = arr_b3.length;
                                if(v10 > qvs0.a.length) {
                                    qvs0.a = new byte[v10];
                                }
                                System.arraycopy(arr_b3, 0, qvs0.a, 0, v10);
                                break;
                            }
                            default: {
                                throw new qux(quw.e);
                            }
                        }
                    }
                    qvs0.l(0x51F14, qwc.n(s2));
                }
                else {
                    arr_b1[40] = 92;
                    qvs0.l(0x51F1A, s2.getBytes());
                }
                if(arr_b1[40] == 92) {
                    Object[] arr_object1 = qvx.c(new String(qvs0.v(0x51F1A)).getBytes());
                    if(arr_object1 == null || arr_object1.length != 2) {
                        throw new qux(quw.e);
                    }
                    String s4 = arr_object1[0].toString();
                    String s5 = arr_object1[1].toString();
                    try {
                        qwe qwe0 = new qwe();
                        Map map0 = (Map)qwe0.a(s4);
                        Map map1 = (Map)qwe0.a(s5);
                        if(map0 == null || map1 == null) {
                            throw new qux(quw.e);
                        }
                        for(Object object0: map0.keySet()) {
                            String s6 = (String)map0.get(((String)object0));
                            StringBuilder stringBuilder0 = new StringBuilder();
                            stringBuilder0.append(((String)object0));
                            int v11 = s6.length() / 2;
                            if(v11 > 0xFF) {
                                stringBuilder0.append("FF");
                                stringBuilder0.append(String.format("%04x", v11));
                            }
                            else {
                                stringBuilder0.append(String.format("%02x", v11));
                            }
                            stringBuilder0.append(s6);
                            qvp.c(qwc.n(stringBuilder0.toString()));
                        }
                        qvp.d();
                        qvp.b();
                        qvp.a();
                        for(Object object1: map1.keySet()) {
                            String s7 = (String)map1.get(((String)object1));
                            String[] arr_s = ((String)object1).split("-");
                            if(arr_s[0].compareTo("LOCK_CODE") == 0) {
                                qwc.b(qwc.n(s7), 0, qvs0.a, 24, 8);
                            }
                            else if(arr_s[0].compareTo("9601") != 0) {
                                if(arr_s[0].compareTo("MST_SUPPORTED") != 0) {
                                    continue;
                                }
                                qvs0.a[16] = s7.compareToIgnoreCase("true") == 0 ? 92 : -91;
                            }
                            else if(arr_s[1].compareTo("82") == 0) {
                                qvs0.k(73490, qwc.n(s7));
                            }
                            else {
                                if(arr_s[1].compareTo("83") != 0) {
                                    continue;
                                }
                                qvs0.k(0x11F13, qwc.n(s7));
                            }
                        }
                    }
                    catch(qwf unused_ex) {
                        throw new qux(quw.e);
                    }
                    qvs0.m(new String(qvs0.v(0x51F1B)));
                }
                byte[] arr_b4 = qvs0.b;
                byte b = arr_b4[6];
                byte[] arr_b5 = qvs0.a;
                if(b != arr_b5[11]) {
                    arr_b5[11] = b;
                }
                if(arr_b4[16] == 92) {
                    int v12 = qwc.c(arr_b4, 0);
                    qvc qvc0 = qvs0.e();
                    if(qvc0 != null) {
                        int v13 = qvc0.a;
                        if(v12 < v13) {
                            qwc.l(qvs0.b, 0, ((short)(v13 - 1)));
                        }
                    }
                }
            }
            else {
                qve4 = qve2;
            }
            qvs qvs2 = qvt.a();
            byte[] arr_b6 = qvs2.c;
            arr_b6[1] = -91;
            arr_b6[4] = -91;
            arr_b6[0] = -91;
            arr_b6[11] = 92;
            arr_b6[12] = -91;
            arr_b6[13] = -91;
            arr_b6[14] = -91;
            arr_b6[16] = 0;
            arr_b6[17] = -68;
            arr_b6[23] = -91;
            arr_b6[33] = -91;
            arr_b6[0x1F] = -57;
            arr_b6[27] = -25;
            arr_b6[38] = 0;
            arr_b6[41] = 0;
            arr_b6[42] = -91;
            arr_b6[43] = -91;
            arr_b6[0x2F] = -91;
            qve qve5 = qve.d;
            if(qvr0.b.equals(qve5) && qvz.a(4, 8) == 92) {
                arr_b6[15] = 51;
            }
            else if(qvs2.o(0x11F01)) {
                arr_b6[15] = -54;
            }
            else {
                arr_b6[15] = 51;
            }
            if(qvr0.b.equals(qve4)) {
                arr_b6[23] = 92;
                arr_b6[24] = 105;
            }
            if(z1) {
                arr_b6[0] = -91;
            }
            else {
                arr_b6[0] = 92;
                qwc.l(qvs2.a, 18, -1);
                qvs2.a[8] = -1;
            }
            qvs2.h = null;
            System.arraycopy(qvv.b, 0, arr_b6, 19, 4);
            if((qve0.equals(qve4) || qve0.equals(qve5)) && qvs0.b() == 0) {
                qvs0.g = quw.j;
                qvj0 = quw.j;
            }
            goto label_212;
        }
        catch(Exception exception0) {
        }
        catch(Throwable throwable0) {
            qvo.b(qvj1, qvj0, "01");
            qvy.a(qvj1.d, qve0, 0L);
            throw throwable0;
        }
        qvo.b(qvj1, qvo.a(exception0), "01");
        qvy.a(qvj1.d, qve0, 0L);
        if(qvt.a().c[34] != 92) {
            qwc.g(qvt.a().v(0x51F18));
            qvr.a.b();
        }
        return qvj1;
    label_212:
        qvo.b(qvj1, qvj0, "01");
        qvy.a(qvj1.d, qve0, 0L);
        return qvj1;
    }

    public static final qvl f(long v, String s) {
        qvr qvr1;
        qvl qvl3;
        int v27;
        int v19;
        qvc qvc0;
        Iterator iterator0;
        int v5;
        int v4;
        LinkedHashMap linkedHashMap0;
        long v3;
        int v1;
        qvl qvl2;
        qvl qvl1;
        qvr qvr0;
        qvs qvs0;
        qvj qvj0 = quw.a;
        qvl qvl0 = new qvl();
        try {
            qvs0 = qvt.a();
            qvs0.g = null;
            qvr0 = qvr.a;
            qvr0.a(qve.h);
            qvl1 = new qvl();
            qvr0.d = v;
            qvr0.c = s;
            if(qvs0.c().d()) {
                qvs0.n();
                if(v < qwc.f(qvs0.b, 11)) {
                    qvl2 = qvl0;
                    throw new qux(quw.h);
                }
                qwc.e(qvs0.b, 11, v);
                if(qvs0.b[16] == 92) {
                    goto label_21;
                }
                else {
                    goto label_74;
                }
                goto label_100;
            }
            else {
                goto label_145;
            }
            goto label_146;
        }
        catch(Exception exception0) {
            qvl2 = qvl0;
            qvl3 = qvl2;
            goto label_159;
        }
        catch(Throwable throwable0) {
            qvl2 = qvl0;
            goto label_152;
        }
        try {
        label_21:
            qvs qvs1 = qvt.a();
            v1 = qwc.c(qvs1.b, 0);
            if(qvs1.b() == 0) {
                goto label_68;
            }
            else {
                int v2 = qvs1.b[7] * 3600;
                v3 = qvr0.d;
                linkedHashMap0 = qvs1.f;
                v4 = 0;
                v5 = -1;
                iterator0 = linkedHashMap0.keySet().iterator();
                while(true) {
                label_30:
                    if(!iterator0.hasNext()) {
                        goto label_59;
                    }
                    Object object0 = iterator0.next();
                    qvc0 = (qvc)linkedHashMap0.get(((Integer)object0));
                    qvl2 = qvl0;
                    goto label_41;
                }
            }
            goto label_71;
        }
        catch(Exception exception0) {
        }
        catch(Throwable throwable0) {
            qvl2 = qvl0;
            goto label_152;
        }
        try {
            qvl2 = qvl0;
            qvl3 = qvl2;
            goto label_159;
        label_41:
            long v6 = qvc0.d;
            if(v6 > v3) {
                long v7 = v6 - v3;
                if(v7 < ((long)v2)) {
                    int v8 = qvc0.a;
                    if(v8 <= v1) {
                        int v9 = qvc0.b;
                        if(v9 >= v1) {
                            v4 += v9 - v1;
                            goto label_52;
                        }
                    }
                    v4 += qvc0.b - v8 + 1;
                }
            label_52:
                if(v5 == -1 || v7 < ((long)v5)) {
                    v5 = (int)v7;
                }
            }
            else {
                iterator0.remove();
            }
            qvl0 = qvl2;
            v3 = v3;
            goto label_30;
        label_59:
            qvl2 = qvl0;
            Integer integer0 = (int)0;
            if(linkedHashMap0.get(integer0) == null) {
                Integer integer1 = (int)1;
                if(linkedHashMap0.get(integer1) != null) {
                    linkedHashMap0.put(integer0, ((qvc)linkedHashMap0.get(integer1)));
                    linkedHashMap0.remove(integer1);
                }
            }
            int v10 = v4;
            goto label_71;
        label_68:
            qvl2 = qvl0;
            v10 = 0;
            v5 = -1;
        label_71:
            int v11 = v10;
            int v12 = v5;
            goto label_100;
        label_74:
            qvl2 = qvl0;
            qvs qvs2 = qvt.a();
            if(qvs2.b() != 0) {
                int v13 = qvs2.b[7] * 3600;
                TreeMap treeMap0 = qvs2.e;
                int v14 = 0;
                int v15 = -1;
                Iterator iterator1 = treeMap0.keySet().iterator();
                while(iterator1.hasNext()) {
                    Object object1 = iterator1.next();
                    long v16 = ((qvd)treeMap0.get(((Integer)object1))).f;
                    long v17 = qvr0.d;
                    if(v16 > v17) {
                        long v18 = v16 - v17;
                        v14 = v18 >= ((long)v13) ? v14 : v14 + 1;
                        if(v15 == -1) {
                            v19 = v13;
                            goto label_94;
                        }
                        else {
                            v19 = v13;
                            if(v18 < ((long)v15)) {
                            label_94:
                                v15 = (int)v18;
                            }
                        }
                        v13 = v19;
                        treeMap0 = treeMap0;
                    }
                    else {
                        iterator1.remove();
                    }
                }
            }
        label_100:
            long v20 = (long)v12;
            int v21 = qvs0.b();
            byte[] arr_b = qvs0.b;
            arr_b[10] = (byte)v21;
            int v22 = arr_b[9];
            boolean z = v21 <= v22 ? v21 <= v22 : v21 - v11 <= v22;
            if(v21 == 0) {
                v27 = 0;
                arr_b[6] = 2;
                qvs0.g = quw.j;
            }
            else {
                if(arr_b[16] == 92) {
                    int v23 = qwc.c(arr_b, 0);
                    qvc qvc1 = qvs0.e();
                    if(qvc1 != null) {
                        int v24 = qvc1.a;
                        if(v23 < v24) {
                            qwc.l(qvs0.b, 0, ((short)(v24 - 1)));
                        }
                    }
                }
                else {
                    qvd qvd0 = qvs0.f(false);
                    qwc.l(qvs0.b, 0, ((short)qvd0.d));
                }
                if(!z) {
                    long v25 = (long)(qvs0.b[7] * 3600);
                    long v26 = v20 > v25 ? v20 - v25 : 3600L;
                    if(v26 < 0L) {
                        v26 = v20;
                    }
                    qvl1.g = v26;
                }
                v27 = v21;
            }
            qvl1.f = qwc.c(qvs0.b, 2);
            byte[] arr_b1 = qvs0.b;
            qvl1.a = arr_b1[10];
            qvl1.b = z;
            if(z) {
                if(v20 > 3600L) {
                    v20 = 3600L;
                }
                qvl1.g = v20;
            }
            qvl1.k = v27 - v11;
            qvl1.j = qwc.h(arr_b1[6]);
            qvl1.h = qwc.j(qwc.c(qvs0.b, 4));
            String s1 = qvs0.i(92);
            if(s1 != null) {
                qvs0.c().b(qvr0.c, "HCECLIENT_META_DATA", s1);
                goto label_146;
            label_145:
                qvl2 = qvl0;
            }
        label_146:
            qvr0.b();
            goto label_154;
        }
        catch(Exception exception0) {
            qvl3 = qvl2;
            goto label_159;
        }
        catch(Throwable throwable0) {
        }
    label_152:
        qvl qvl4 = qvl2;
        goto label_169;
        try {
        label_154:
            if(qvt.a().g != null) {
                qvj0 = qvt.a().g;
            }
            goto label_177;
        }
        catch(Exception exception0) {
            qvl3 = qvl1;
        label_159:
            qvo.b(qvl3, qvo.a(exception0), "11");
            qvr1 = qvr.a;
            qvy.a(qvl3.d, qvr1.b, v);
            qvl3.l = qwc.g(qvt.a().v(0x51F18));
            if(qvt.a().c[34] != 92) {
                qvr1.b();
                qvt.a().u();
                return qvl3;
            }
            return qvl3;
        }
        catch(Throwable throwable0) {
            qvl4 = qvl1;
        }
    label_169:
        qvo.b(qvl4, qvj0, "11");
        qvr qvr2 = qvr.a;
        qvy.a(qvl4.d, qvr2.b, v);
        qvl4.l = qwc.g(qvt.a().v(0x51F18));
        if(qvt.a().c[34] != 92) {
            qvr2.b();
            qvt.a().u();
        }
        throw throwable0;
    label_177:
        qvo.b(qvl1, qvj0, "11");
        qvr1 = qvr.a;
        qvy.a(qvl1.d, qvr1.b, v);
        qvl1.l = qwc.g(qvt.a().v(0x51F18));
        if(qvt.a().c[34] == 92) {
            return qvl1;
        }
        qvr1.b();
        qvt.a().u();
        return qvl1;
    }
}

