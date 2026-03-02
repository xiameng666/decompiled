import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.internal.connection.ParcelByteArray;
import com.google.android.gms.nearby.sharing.AppAttachment;
import com.google.android.gms.nearby.sharing.FileAttachment;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.StreamAttachment;
import com.google.android.gms.nearby.sharing.TextAttachment;
import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;
import java.util.List;

public final class dclu implements Parcelable.Creator {
    public static void a(ShareTarget shareTarget0, Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.q(parcel0, 1, shareTarget0.a);
        baub.v(parcel0, 2, shareTarget0.b, false);
        baub.t(parcel0, 3, shareTarget0.c, v, false);
        baub.o(parcel0, 4, shareTarget0.d);
        baub.g(parcel0, 5, shareTarget0.e, false);
        baub.y(parcel0, 6, shareTarget0.i(), false);
        baub.y(parcel0, 7, shareTarget0.f(), false);
        baub.y(parcel0, 8, shareTarget0.j(), false);
        baub.e(parcel0, 9, shareTarget0.f);
        baub.v(parcel0, 10, shareTarget0.g, false);
        baub.e(parcel0, 11, shareTarget0.h);
        baub.v(parcel0, 12, shareTarget0.i, false);
        baub.t(parcel0, 13, shareTarget0.j, v, false);
        baub.e(parcel0, 14, shareTarget0.k);
        baub.v(parcel0, 15, shareTarget0.l, false);
        baub.y(parcel0, 16, shareTarget0.d(), false);
        baub.o(parcel0, 17, shareTarget0.m);
        baub.e(parcel0, 18, shareTarget0.n);
        baub.y(parcel0, 19, shareTarget0.g(), false);
        baub.o(parcel0, 20, shareTarget0.o);
        baub.v(parcel0, 21, shareTarget0.p, false);
        baub.e(parcel0, 22, shareTarget0.q);
        baub.o(parcel0, 23, shareTarget0.r);
        baub.t(parcel0, 24, shareTarget0.s, v, false);
        baub.o(parcel0, 25, shareTarget0.t);
        baub.E(parcel0, 26, shareTarget0.h());
        baub.c(parcel0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        Uri uri0 = null;
        Bundle bundle0 = null;
        List list0 = null;
        List list1 = null;
        List list2 = null;
        String s1 = null;
        String s2 = null;
        PendingIntent pendingIntent0 = null;
        String s3 = null;
        List list3 = null;
        List list4 = null;
        String s4 = null;
        ParcelByteArray parcelByteArray0 = null;
        List list5 = null;
        int v1 = 500;
        int v2 = 0;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        int v3 = 0;
        boolean z3 = false;
        int v4 = 0;
        boolean z4 = false;
        int v5 = 0;
        long v6 = 0L;
        while(parcel0.dataPosition() < v) {
            int v7 = parcel0.readInt();
            switch(((char)v7)) {
                case 1: {
                    v6 = baua.i(parcel0, v7);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v7);
                    break;
                }
                case 3: {
                    uri0 = (Uri)baua.m(parcel0, v7, Uri.CREATOR);
                    break;
                }
                case 4: {
                    v2 = baua.f(parcel0, v7);
                    break;
                }
                case 5: {
                    bundle0 = baua.j(parcel0, v7);
                    break;
                }
                case 6: {
                    list0 = baua.y(parcel0, v7, TextAttachment.CREATOR);
                    break;
                }
                case 7: {
                    list1 = baua.y(parcel0, v7, FileAttachment.CREATOR);
                    break;
                }
                case 8: {
                    list2 = baua.y(parcel0, v7, WifiCredentialsAttachment.CREATOR);
                    break;
                }
                case 9: {
                    z = baua.D(parcel0, v7);
                    break;
                }
                case 10: {
                    s1 = baua.s(parcel0, v7);
                    break;
                }
                case 11: {
                    z1 = baua.D(parcel0, v7);
                    break;
                }
                case 12: {
                    s2 = baua.s(parcel0, v7);
                    break;
                }
                case 13: {
                    pendingIntent0 = (PendingIntent)baua.m(parcel0, v7, PendingIntent.CREATOR);
                    break;
                }
                case 14: {
                    z2 = baua.D(parcel0, v7);
                    break;
                }
                case 15: {
                    s3 = baua.s(parcel0, v7);
                    break;
                }
                case 16: {
                    list3 = baua.y(parcel0, v7, AppAttachment.CREATOR);
                    break;
                }
                case 17: {
                    v3 = baua.f(parcel0, v7);
                    break;
                }
                case 18: {
                    z3 = baua.D(parcel0, v7);
                    break;
                }
                case 19: {
                    list4 = baua.y(parcel0, v7, StreamAttachment.CREATOR);
                    break;
                }
                case 20: {
                    v4 = baua.f(parcel0, v7);
                    break;
                }
                case 21: {
                    s4 = baua.s(parcel0, v7);
                    break;
                }
                case 22: {
                    z4 = baua.D(parcel0, v7);
                    break;
                }
                case 23: {
                    v5 = baua.f(parcel0, v7);
                    break;
                }
                case 24: {
                    parcelByteArray0 = (ParcelByteArray)baua.m(parcel0, v7, ParcelByteArray.CREATOR);
                    break;
                }
                case 25: {
                    v1 = baua.f(parcel0, v7);
                    break;
                }
                case 26: {
                    list5 = baua.v(parcel0, v7);
                    break;
                }
                default: {
                    baua.C(parcel0, v7);
                }
            }
        }
        baua.A(parcel0, v);
        return new ShareTarget(v6, s, uri0, v2, bundle0, list0, list1, list2, z, s1, z1, s2, pendingIntent0, z2, s3, list3, v3, z3, list4, v4, s4, z4, v5, parcelByteArray0, v1, list5);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ShareTarget[v];
    }
}

