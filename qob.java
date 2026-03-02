import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.airbnb.lottie.compose.LottieAnimationSizeElement;

public final class qob {
    public static final qox a(gra gra0) {
        return (qox)gra0.a();
    }

    public static final void b(qkb qkb0, hfc hfc0, boolean z, boolean z1, qoj qoj0, float f, int v, boolean z2, boolean z3, boolean z4, int v1, boolean z5, boolean z6, qox qox0, hel hel0, hyt hyt0, boolean z7, int v2, goz goz0, int v3, int v4, int v5, int v6) {
        hel hel1;
        qoj qoj2;
        boolean z13;
        qox qox1;
        int v33;
        float f1;
        int v32;
        int v31;
        hfc hfc2;
        goz goz2;
        boolean z12;
        boolean z11;
        boolean z10;
        boolean z9;
        boolean z8;
        int v30;
        hyt hyt1;
        int v29;
        int v28;
        int v27;
        int v26;
        int v25;
        int v24;
        int v23;
        int v22;
        int v21;
        int v20;
        int v18;
        int v16;
        int v14;
        int v13;
        qoj qoj1;
        hfc hfc1;
        int v7;
        goz goz1 = goz0.ao(0xBB57DC91);
        if((v6 & 1) == 0) {
            v7 = (v3 & 6) == 0 ? (goz1.Z(qkb0) ? 4 : 2) | v3 : v3;
        }
        else {
            v7 = v3 | 6;
        }
        int v8 = 16;
        if((v6 & 2) == 0) {
            hfc1 = hfc0;
            if((v3 & 0x30) == 0) {
                v7 |= (goz1.X(hfc1) ? 0x20 : 16);
            }
        }
        else {
            v7 |= 0x30;
            hfc1 = hfc0;
        }
        int v9 = 0;
        int v10 = 0x80;
        if((v6 & 4) != 0) {
            v7 |= 0x180;
        }
        else if((v3 & 0x180) == 0) {
            v7 |= (goz1.Y(((int)z)) ? 0x100 : 0x80);
        }
        int v11 = 0x400;
        if((v6 & 8) != 0) {
            v7 |= 0xC00;
        }
        else if((v3 & 0xC00) == 0) {
            v7 |= (goz1.Y(((int)z1)) ? 0x800 : 0x400);
        }
        int v12 = 0x2000;
        if((v6 & 16) != 0) {
            v7 |= 0x6000;
            qoj1 = qoj0;
        }
        else if((v3 & 0x6000) == 0) {
            qoj1 = qoj0;
            v7 |= (goz1.X(qoj1) ? 0x4000 : 0x2000);
        }
        else {
            qoj1 = qoj0;
        }
        if((v6 & 0x20) != 0) {
            v7 |= 0x30000;
            v13 = v6 & 0x20;
        }
        else if((v3 & 0x30000) == 0) {
            v13 = v6 & 0x20;
            v7 |= (goz1.U(f) ? 0x20000 : 0x10000);
        }
        else {
            v13 = v6 & 0x20;
        }
        if((v6 & 0x40) == 0) {
            v14 = v6 & 0x40;
            if((v3 & 0x180000) == 0) {
                v7 |= (goz1.V(v) ? 0x100000 : 0x80000);
            }
        }
        else {
            v7 |= 0x180000;
            v14 = v6 & 0x40;
        }
        int v15 = (v6 & 0x80) == 0 ? 1 : 0;
        if((v6 & 0x80) != 0) {
            v7 |= 0xC00000;
            v16 = v15;
        }
        else if((0xC00000 & v3) == 0) {
            v16 = v15;
            v7 |= (goz1.Y(z2) ? 0x800000 : 0x400000);
        }
        else {
            v16 = v15;
        }
        int v17 = (v6 & 0x100) == 0 ? 1 : 0;
        if((v6 & 0x100) != 0) {
            v7 |= 0x6000000;
            v18 = v17;
        }
        else if((0x6000000 & v3) == 0) {
            v18 = v17;
            v7 |= (goz1.Y(z3) ? 0x4000000 : 0x2000000);
        }
        else {
            v18 = v17;
        }
        int v19 = (v6 & 0x200) == 0 ? 1 : 0;
        if((v6 & 0x200) != 0) {
            v7 |= 0x30000000;
            v20 = v19;
        }
        else if((0x30000000 & v3) == 0) {
            v20 = v19;
            v7 |= (goz1.Y(z4) ? 0x20000000 : 0x10000000);
        }
        else {
            v20 = v19;
        }
        if((v6 & 0x400) != 0) {
            v21 = v4 | 6;
            v22 = v6 & 0x400;
            v23 = v1;
        }
        else if((v4 & 6) == 0) {
            if(v1 == 0) {
                v22 = v6 & 0x400;
                v24 = -1;
                v25 = 0;
            }
            else {
                v22 = v6 & 0x400;
                v24 = 0;
                v25 = 1;
            }
            v21 = v4 | (goz1.V(v24) ? 4 : 2);
            v23 = v25;
        }
        else {
            v22 = v6 & 0x400;
            v23 = v1;
            v21 = v4;
        }
        if((v6 & 0x800) != 0) {
            v21 |= 0x30;
        }
        else if((v4 & 0x30) == 0) {
            if(goz1.Y(z5)) {
                v8 = 0x20;
            }
            v21 |= v8;
        }
        if((v6 & 0x1000) != 0) {
            v21 |= 0x180;
        }
        else if((v4 & 0x180) == 0) {
            if(goz1.Y(z6)) {
                v10 = 0x100;
            }
            v21 |= v10;
        }
        if((v6 & 0x2000) == 0) {
            v26 = v6 & 0x2000;
            if((v4 & 0xC00) == 0) {
                if(goz1.Z(qox0)) {
                    v11 = 0x800;
                }
                v21 |= v11;
            }
        }
        else {
            v21 |= 0xC00;
            v26 = v6 & 0x2000;
        }
        if((v6 & 0x4000) == 0) {
            v27 = v6 & 0x4000;
            if((v4 & 0x6000) == 0) {
                if(goz1.X(hel0)) {
                    v12 = 0x4000;
                }
                v21 |= v12;
            }
        }
        else {
            v21 |= 0x6000;
            v27 = v6 & 0x4000;
        }
        if((0x8000 & v6) == 0) {
            v28 = 0x8000 & v6;
            if((v4 & 0x30000) == 0) {
                v21 |= (goz1.X(hyt0) ? 0x20000 : 0x10000);
            }
        }
        else {
            v21 |= 0x30000;
            v28 = 0x8000 & v6;
        }
        if((v6 & 0x10000) != 0) {
            v21 |= 0x180000;
        }
        else if((v4 & 0x180000) == 0) {
            v21 |= (goz1.Y(z7) ? 0x100000 : 0x80000);
        }
        if((v7 & 306783379) == 306783378 && ((v21 | 0x36C00000) & 306783379) == 306783378 && ((v5 | 6) & 3) == 2 && goz1.ac()) {
            goz1.G();
            v29 = v23;
            hyt1 = hyt0;
            v30 = v2;
            z8 = z2;
            z9 = z3;
            z10 = z4;
            z11 = z6;
            z12 = z7;
            goz2 = goz1;
            hfc2 = hfc1;
            v31 = (int)z;
            v32 = (int)z1;
            f1 = f;
            v33 = v;
            qox1 = qox0;
            z13 = z5;
            qoj2 = qoj1;
            hel1 = hel0;
        }
        else {
            if((v6 & 2) != 0) {
                hfc1 = hfc.e;
            }
            qoj qoj3 = (v6 & 16) == 0 ? qoj1 : null;
            float f2 = v13 == 0 ? f : 1.0f;
            int v34 = v14 == 0 ? v : 1;
            int v35 = v20 & z4;
            if(v22 == 0) {
                v9 = 1;
            }
            int v36 = ((v6 & 0x1000) == 0 ? 1 : 0) & z6;
            qox qox2 = v26 == 0 ? qox0 : null;
            hel hel2 = v27 == 0 ? hel0 : hei.e;
            hyt hyt2 = v28 == 0 ? hyt0 : hys.b;
            int v37 = ((v6 & 0x10000) == 0 ? 1 : 0) ^ 1 | z7;
            int v38 = ((v6 & 4) == 0 ? 1 : 0) ^ 1 | ((int)z);
            int v39 = ((v6 & 8) == 0 ? 1 : 0) ^ 1 | ((int)z1);
            int v40 = ((v6 & 0x800) == 0 ? 1 : 0) & z5;
            qnu qnu0 = qnk.a(qkb0, ((boolean)v38), ((boolean)v39), ((boolean)v40), qoj3, f2, v34, goz1, v7 & 14 | v7 >> 3 & 0x70 | v7 >> 3 & 0x380 | (v21 | 0x36C00000) << 6 & 0x1C00 | v7 & 0xE000 | v7 & 0x70000 | v7 & 0x380000, 0x380);
            z13 = v40;
            goz2 = goz1;
            int v41 = v16 & z2;
            goz2.M(5004770);
            boolean z14 = goz2.X(qnu0);
            Object object0 = goz2.j();
            int v42 = v18 & z3;
            if(z14 || object0 == gop.a) {
                object0 = new qnz(qnu0);
                goz2.P(object0);
            }
            goz2.x();
            int v43 = (v21 | 0x36C00000) << 15;
            int v44 = v9 ^ 1 | v23;
            qob.c(qkb0, ((ibth)object0), hfc1, ((boolean)v41), ((boolean)v42), ((boolean)v35), v44, ((boolean)v36), qox2, hel2, hyt2, ((boolean)v37), 1, goz2, v7 >> 12 & 0x70000 | (v7 & 14 | v7 << 3 & 0x380 | v7 >> 12 & 0x1C00 | v7 >> 12 & 0xE000) | (v21 | 0x36C00000) << 18 & 0x380000 | v43 & 0x1C00000 | v43 & 0xE000000 | v43 & 0x70000000, (v21 | 0x36C00000) >> 15 & 0x1FFE | (v5 | 6) << 12 & 0xE000 | (v21 | 0x36C00000) >> 12 & 0x70000, 0);
            z8 = v41;
            z9 = v42;
            z10 = v35;
            v31 = v38;
            z11 = v36;
            v32 = v39;
            hfc2 = hfc1;
            qoj2 = qoj3;
            f1 = f2;
            qox1 = qox2;
            hel1 = hel2;
            hyt1 = hyt2;
            v30 = 1;
            v29 = v44;
            z12 = v37;
            v33 = v34;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new qoa(qkb0, hfc2, ((boolean)v31), ((boolean)v32), qoj2, f1, v33, z8, z9, z10, v29, z13, z11, qox1, hel1, hyt1, z12, v30, v3, v4, v5, v6);
        }
    }

    public static final void c(qkb qkb0, ibth ibth0, hfc hfc0, boolean z, boolean z1, boolean z2, int v, boolean z3, qox qox0, hel hel0, hyt hyt0, boolean z4, int v1, goz goz0, int v2, int v3, int v4) {
        int v37;
        hfc hfc6;
        hyt hyt3;
        int v36;
        hel hel3;
        hfc hfc5;
        Object object5;
        boolean z9;
        boolean z8;
        boolean z7;
        hyt hyt1;
        boolean z6;
        hfc hfc2;
        goz goz2;
        boolean z5;
        int v24;
        hel hel1;
        qox qox1;
        int v23;
        int v22;
        int v20;
        int v21;
        int v19;
        int v18;
        int v17;
        int v16;
        int v15;
        int v14;
        int v13;
        int v12;
        int v11;
        hfc hfc1;
        int v5;
        ibuq.f(ibth0, "progress");
        goz goz1 = goz0.ao(0xD7CF696A);
        if((v4 & 1) == 0) {
            v5 = (v2 & 6) == 0 ? (goz1.Z(qkb0) ? 4 : 2) | v2 : v2;
        }
        else {
            v5 = v2 | 6;
        }
        int v6 = 16;
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v5 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        int v7 = 0x80;
        if((v4 & 4) != 0) {
            v5 |= 0x180;
            hfc1 = hfc0;
        }
        else if((v2 & 0x180) == 0) {
            hfc1 = hfc0;
            v5 |= (goz1.X(hfc1) ? 0x100 : 0x80);
        }
        else {
            hfc1 = hfc0;
        }
        int v8 = 0x400;
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
        }
        else if((v2 & 0xC00) == 0) {
            v5 |= (goz1.Y(((int)z)) ? 0x800 : 0x400);
        }
        int v9 = 0x2000;
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((v2 & 0x6000) == 0) {
            v5 |= (goz1.Y(((int)z1)) ? 0x4000 : 0x2000);
        }
        int v10 = 0x10000;
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((v2 & 0x30000) == 0) {
            v5 |= (goz1.Y(z2) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
            v11 = v4 & 0x40;
        }
        else if((0x180000 & v2) == 0) {
            if(v == 0) {
                v11 = v4 & 0x40;
                v12 = -1;
                v13 = 0;
            }
            else {
                v11 = v4 & 0x40;
                v12 = 0;
                v13 = 1;
            }
            v = v13;
            v5 |= (goz1.V(v12) ? 0x100000 : 0x80000);
        }
        else {
            v11 = v4 & 0x40;
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0xC00000;
            v14 = v;
        }
        else if((0xC00000 & v2) == 0) {
            v14 = v;
            v5 |= (goz1.Y(z3) ? 0x800000 : 0x400000);
        }
        else {
            v14 = v;
        }
        if((v4 & 0x100) != 0) {
            v5 |= 0x6000000;
            v15 = v4 & 0x100;
        }
        else if((0x6000000 & v2) == 0) {
            v15 = v4 & 0x100;
            v5 |= (goz1.Z(qox0) ? 0x4000000 : 0x2000000);
        }
        else {
            v15 = v4 & 0x100;
        }
        if((v4 & 0x200) != 0) {
            v5 |= 0x30000000;
            v16 = v4 & 0x200;
        }
        else if((0x30000000 & v2) == 0) {
            v16 = v4 & 0x200;
            v5 |= (goz1.X(hel0) ? 0x20000000 : 0x10000000);
        }
        else {
            v16 = v4 & 0x200;
        }
        if((v4 & 0x400) != 0) {
            v17 = v3 | 6;
            v18 = v4 & 0x400;
        }
        else if((v3 & 6) == 0) {
            v18 = v4 & 0x400;
            v17 = v3 | (goz1.X(hyt0) ? 4 : 2);
        }
        else {
            v18 = v4 & 0x400;
            v17 = v3;
        }
        if((v4 & 0x800) != 0) {
            v17 |= 0x30;
        }
        else if((v3 & 0x30) == 0) {
            if(goz1.Y(z4)) {
                v6 = 0x20;
            }
            v17 |= v6;
        }
        if((v4 & 0x1000) != 0) {
            v17 |= 0x180;
        }
        else if((v3 & 0x180) == 0) {
            if(goz1.Y(false)) {
                v7 = 0x100;
            }
            v17 |= v7;
        }
        if((v4 & 0x2000) != 0) {
            v19 = v17 | 0xC00;
        }
        else if((v3 & 0xC00) == 0) {
            if(goz1.Z(null)) {
                v8 = 0x800;
            }
            v19 = v17 | v8;
        }
        else {
            v19 = v17;
        }
        if((v4 & 0x4000) == 0) {
            v20 = v4 & 0x4000;
            if((v3 & 0x6000) == 0) {
                if(v1 == 0) {
                    v21 = -1;
                    v1 = 0;
                }
                else {
                    v1 = 1;
                    v21 = 0;
                }
                if(goz1.V(v21)) {
                    v9 = 0x4000;
                }
                v19 |= v9;
            }
        }
        else {
            v19 |= 0x6000;
            v20 = v4 & 0x4000;
        }
        if((v4 & 0x8000) == 0) {
            v22 = v1;
            if((v3 & 0x30000) == 0) {
                if(goz1.Y(false)) {
                    v10 = 0x20000;
                }
                v19 |= v10;
            }
        }
        else {
            v19 |= 0x30000;
            v22 = v1;
        }
        if((306783379 & v5) == 306783378 && (74899 & v19) == 74898 && goz1.ac()) {
            goz1.G();
            v23 = v14;
            qox1 = qox0;
            hel1 = hel0;
            v24 = v22;
            z5 = z3;
            goz2 = goz1;
            hfc2 = hfc1;
            z6 = (int)z1;
            hyt1 = hyt0;
            z7 = z4;
            z8 = z2;
            z9 = (int)z;
            goto label_245;
        }
        else {
            hfc hfc3 = (v4 & 4) == 0 ? hfc1 : hfc.e;
            int v25 = ((v4 & 16) == 0 ? 1 : 0) & ((int)z1);
            int v26 = (v11 == 0 ? 1 : 0) ^ 1 | v14;
            qox qox2 = v15 == 0 ? qox0 : null;
            hel hel2 = v16 == 0 ? hel0 : hei.e;
            hyt hyt2 = v18 == 0 ? hyt0 : hys.b;
            int v27 = 1;
            int v28 = (v20 == 0 ? 1 : 0) ^ 1 | v22;
            int v29 = ((v4 & 8) == 0 ? 1 : 0) & ((int)z);
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            int v30 = z2 & ((v4 & 0x20) == 0 ? 1 : 0);
            Object object1 = gop.a;
            if(object0 == object1) {
                object0 = new qkz();
                goz1.P(object0);
            }
            goz1.x();
            int v31 = ((v4 & 0x80) == 0 ? 1 : 0) & z3;
            goz1.M(0x6E3C21FE);
            Object object2 = goz1.j();
            if(object2 == object1) {
                object2 = new Matrix();
                goz1.P(object2);
            }
            goz1.x();
            int v32 = ((v4 & 0x800) == 0 ? 1 : 0) ^ 1 | z4;
            goz1.M(5004770);
            boolean z10 = goz1.X(qkb0);
            Object object3 = goz1.j();
            if(z10 || object3 == object1) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(null, gul.a);
                goz1.P(parcelableSnapshotMutableState0);
                object3 = parcelableSnapshotMutableState0;
            }
            goz1.x();
            goz1.M(563817909);
            if(qkb0 == null || qkb0.a() == 0.0f) {
                dhw.d(hfc3, goz1, v5 >> 6 & 14);
                goz1.x();
                gsb gsb1 = goz1.af();
                if(gsb1 != null) {
                    gsb1.d = new qnw(qkb0, ibth0, hfc3, ((boolean)v29), ((boolean)v25), ((boolean)v30), v26, ((boolean)v31), qox2, hel2, hyt2, ((boolean)v32), v28, v2, v3, v4);
                }
            }
            else {
                goz1.x();
                Rect rect0 = qkb0.j;
                int v33 = rect0.width();
                int v34 = rect0.height();
                ibuq.f(hfc3, "<this>");
                hfc hfc4 = hfc3.a(new LottieAnimationSizeElement(v33, v34));
                goz1.M(-1224400529);
                int v35 = ((0xE000 & v19) == 0x4000 ? 1 : 0) | (((v19 & 14) == 4 ? 1 : 0) | goz1.Z(rect0) | ((0x70000000 & v5) == 0x20000000 ? 1 : 0) | goz1.Z(((Matrix)object2)) | goz1.Z(((qkz)object0)) | ((0x70000 & v5) == 0x20000 ? 1 : 0) | ((v19 & 0x70000) == 0x20000 ? 1 : 0) | ((0x380000 & v5) == 0x100000 ? 1 : 0)) | goz1.Z(qkb0) | goz1.Z(null) | goz1.Z(qox2) | goz1.X(((gra)object3));
                if((v5 & 0x70) != 0x20) {
                    v27 = 0;
                }
                Object object4 = goz1.j();
                if((((v19 & 0x380) == 0x100 ? 1 : 0) | (v35 | ((v5 & 0x1C00) == 0x800 ? 1 : 0) | ((0xE000 & v5) == 0x4000 ? 1 : 0) | ((0x1C00000 & v5) == 0x800000 ? 1 : 0) | ((v19 & 0x70) == 0x20 ? 1 : 0)) | v27) == 0 && object4 != object1) {
                    z9 = v29;
                    z8 = v30;
                    z7 = v32;
                    z6 = v25;
                    object5 = object4;
                    hfc5 = hfc4;
                    goz2 = goz1;
                    v23 = v26;
                    qox1 = qox2;
                    hel3 = hel2;
                    v36 = v28;
                    hyt3 = hyt2;
                    hfc6 = hfc3;
                    v37 = v31;
                }
                else {
                    hfc5 = hfc4;
                    v23 = v26;
                    v36 = v28;
                    hyt3 = hyt2;
                    hfc6 = hfc3;
                    v37 = v31;
                    hel3 = hel2;
                    z8 = v30;
                    object5 = new qnx(rect0, hyt3, hel3, ((Matrix)object2), ((qkz)object0), z8, v23, v36, qkb0, qox2, ((boolean)v29), ((boolean)v25), ((boolean)v37), ((boolean)v32), ibth0, ((gra)object3));
                    qox1 = qox2;
                    z9 = v29;
                    z6 = v25;
                    z7 = v32;
                    goz2 = goz1;
                    goz2.P(object5);
                }
                goz2.x();
                crn.a(hfc5, ((ibts)object5), goz2, 0);
                v24 = v36;
                z5 = v37;
                hyt1 = hyt3;
                hel1 = hel3;
                hfc2 = hfc6;
            label_245:
                gsb gsb0 = goz2.af();
                if(gsb0 != null) {
                    gsb0.d = new qny(qkb0, ibth0, hfc2, z9, z6, z8, v23, z5, qox1, hel1, hyt1, z7, v24, v2, v3, v4);
                }
            }
        }
    }
}

