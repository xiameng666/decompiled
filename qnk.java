import android.content.Context;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class qnk {
    public static final qnu a(qkb qkb0, boolean z, boolean z1, boolean z2, qoj qoj0, float f, int v, goz goz0, int v1, int v2) {
        qnu qnu1;
        goz0.M(0x28BFD0F4);
        qoe qoe0 = qoe.a;
        if(v <= 0) {
            throw new IllegalArgumentException(a.f(v, "Iterations must be a positive number (", ")."));
        }
        float f1 = (v2 & 0x20) == 0 ? f : 1.0f;
        if(!(Math.abs(f1) <= 3.402823E+38f)) {
            throw new IllegalArgumentException("Speed must be a finite number. It is " + f1 + ".");
        }
        int v3 = ((v2 & 2) == 0 ? 1 : 0) ^ 1 | ((int)z);
        qnu qnu0 = qnv.c(goz0);
        goz0.M(0x6E3C21FE);
        Object object0 = goz0.j();
        Object object1 = gop.a;
        if(object0 == object1) {
            ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(Boolean.valueOf(((boolean)v3)), gul.a);
            goz0.P(parcelableSnapshotMutableState0);
            object0 = parcelableSnapshotMutableState0;
        }
        qoj qoj1 = (v2 & 16) == 0 ? qoj0 : null;
        goz0.x();
        goz0.M(0xF80FCFB5);
        float f2 = f1 / qty.b(((Context)goz0.h(AndroidCompositionLocals_androidKt.b)));
        goz0.x();
        Object[] arr_object = {qkb0, Boolean.valueOf(((boolean)v3)), qoj1, f2, v};
        goz0.M(-1224400529);
        int v4 = ((v1 & 0x70 ^ 0x30) <= 0x20 || !goz0.Y(((boolean)v3))) && (v1 & 0x30) != 0x20 ? 0 : 1;
        int v5 = ((v2 & 4) == 0 ? 1 : 0) ^ 1 | ((int)z1);
        int v6 = (((v1 & 0x380 ^ 0x180) <= 0x100 || !goz0.Y(((boolean)v5))) && (v1 & 0x180) != 0x100 ? 0 : 1) | v4 | goz0.X(qnu0) | goz0.Z(qkb0);
        int v7 = ((0x380000 & v1 ^ 0x180000) <= 0x100000 || !goz0.V(v)) && (v1 & 0x180000) != 0x100000 ? 0 : 1;
        int v8 = ((v2 & 8) == 0 ? 1 : 0) & ((int)z2);
        int v9 = (((v1 & 0x1C00 ^ 0xC00) <= 0x800 || !goz0.Y(((boolean)v8))) && (v1 & 0xC00) != 0x800 ? 0 : 1) | (v6 | v7) | goz0.U(f2);
        int v10 = ((0xE000 & v1 ^ 0x6000) <= 0x4000 || !goz0.X(qoj1)) && (v1 & 0x6000) != 0x4000 ? 0 : 1;
        int v11 = goz0.Y(false);
        Object object2 = goz0.j();
        if((v9 | v10 | goz0.V(qoe0.ordinal()) | v11) == 0 && object2 != object1) {
            qnu1 = qnu0;
        }
        else {
            qnu1 = qnu0;
            qnj qnj0 = new qnj(((boolean)v3), ((boolean)v5), qnu1, qkb0, v, ((boolean)v8), f2, qoj1, qoe0, ((gra)object0), null);
            goz0.P(qnj0);
            object2 = qnj0;
        }
        goz0.x();
        gqe.g(arr_object, ((ibtw)object2), goz0);
        goz0.x();
        return qnu1;
    }
}

