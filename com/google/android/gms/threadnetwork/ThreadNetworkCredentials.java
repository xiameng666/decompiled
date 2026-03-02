package com.google.android.gms.threadnetwork;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import evwg;
import evwh;
import evwi;
import evwj;
import evwk;
import ggeo;
import ggfp;
import ghjc;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

public final class ThreadNetworkCredentials extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final evwi a;
    public static final evwh b;
    public static final Charset c;
    public long d;
    public long e;
    public final boolean f;
    public final evwj g;
    public final String h;
    public final int i;
    public final int j;
    public final ggfp k;
    public final int l;
    public final evwi m;
    private static final ggeo n;
    private final byte[] o;
    private final byte[] p;
    private final byte[] q;
    private final byte[] r;
    private final byte[] s;

    static {
        ThreadNetworkCredentials.CREATOR = new evwk();
        ThreadNetworkCredentials.a = new evwi(0x2A0, new byte[]{-1, -8});
        ThreadNetworkCredentials.b = new evwh(0, new byte[]{0, 0x1F, -1, (byte)0xE0});
        ThreadNetworkCredentials.n = ggeo.t(Byte.valueOf(((byte)0)), "Channel", Byte.valueOf(((byte)1)), "PAN ID", Byte.valueOf(((byte)2)), "Extended PAN ID", Byte.valueOf(((byte)3)), "Network Name", Byte.valueOf(((byte)4)), "PSKc", Byte.valueOf(((byte)5)), "Network Key", Byte.valueOf(((byte)7)), "Mesh Local Prefix", Byte.valueOf(((byte)12)), "Security Policy", Byte.valueOf(((byte)14)), "Active Timestamp", Byte.valueOf(((byte)53)), "Channel Mask");
        ThreadNetworkCredentials.c = Charset.forName("UTF-8");
    }

    public ThreadNetworkCredentials(byte[] arr_b, long v, long v1, boolean z) {
        this.g = evwj.c(ThreadNetworkCredentials.f(((byte)14), arr_b));
        this.h = new String(ThreadNetworkCredentials.f(((byte)3), arr_b), ThreadNetworkCredentials.c);
        byte[] arr_b1 = ThreadNetworkCredentials.f(((byte)0), arr_b);
        int v2 = arr_b1[0] & 0xFF;
        int v3 = arr_b1[1] & 0xFF;
        int v4 = arr_b1[2] & 0xFF;
        Integer integer0 = v2;
        batl.d(true, "Invalid Thread Channel Page (page = %d, allowedRange = [0, 255])", new Object[]{integer0});
        int v5 = v4 | v3 << 8;
        if(v2 == 0) {
            batl.d(v5 >= 11 && v5 <= 26, "Invalid Thread Channel %d in page %d (allowedChannelRange = [%d, %d])", new Object[]{v5, integer0, ((int)11), ((int)26)});
        }
        else {
            Integer integer1 = v5;
            batl.d(true, "Invalid Thread Channel %d in page %d (channel = %d, allowedRange = [0, 65535])", new Object[]{integer1, integer0, integer1});
        }
        this.j = v5;
        this.i = v2;
        this.k = evwg.b(ThreadNetworkCredentials.f(((byte)53), arr_b));
        this.l = evwg.a(ThreadNetworkCredentials.f(((byte)1), arr_b));
        this.p = ThreadNetworkCredentials.f(((byte)2), arr_b);
        this.q = ThreadNetworkCredentials.f(((byte)4), arr_b);
        byte[] arr_b2 = ThreadNetworkCredentials.f(((byte)7), arr_b);
        evwg.c(arr_b2);
        this.r = arr_b2;
        byte[] arr_b3 = ThreadNetworkCredentials.f(((byte)12), arr_b);
        this.m = new evwi((arr_b3[0] & 0xFF) << 8 | arr_b3[1] & 0xFF, Arrays.copyOfRange(arr_b3, 2, arr_b3.length));
        byte[] arr_b4 = ThreadNetworkCredentials.f(((byte)5), arr_b);
        if(arr_b4 == null) {
            throw new IllegalArgumentException("Thread Network Key is missing in the dataset");
        }
        this.s = arr_b4;
        this.o = (byte[])arr_b.clone();
        this.d = v;
        this.e = v1;
        this.f = z;
    }

    public final byte[] a() {
        return (byte[])this.o.clone();
    }

    public final byte[] b() {
        return (byte[])this.p.clone();
    }

    public final byte[] c() {
        return (byte[])this.r.clone();
    }

    public final byte[] d() {
        return (byte[])this.s.clone();
    }

    public final byte[] e() {
        return (byte[])this.q.clone();
    }

    private static byte[] f(byte b, byte[] arr_b) {
        if(arr_b.length > 0xFE) {
            throw new IllegalArgumentException(String.format("Thread operational dataset is too long (length = %d, maxLength = %d)", ((int)arr_b.length), ((int)0xFE)));
        }
        int v = 0;
        while(v < arr_b.length) {
            int v1 = arr_b[v];
            if(v + 1 >= arr_b.length) {
                throw new IllegalArgumentException(String.format("Found TLV type %X at end of operational dataset with length %d", ((byte)v1), ((int)arr_b.length)));
            }
            int v2 = arr_b[v + 1] & 0xFF;
            int v3 = v + 2 + v2;
            if(v3 > arr_b.length) {
                throw new IllegalArgumentException(String.format("Found TLV type %X with length %d which exceeds the remaining data in the operational dataset with length %d", ((byte)v1), v2, ((int)arr_b.length)));
            }
            byte[] arr_b1 = Arrays.copyOfRange(arr_b, v + 2, v3);
            switch(v1) {
                case 0: {
                    if(arr_b1.length != 3) {
                        throw new IllegalArgumentException(String.format("Found invalid Thread Channel TLV (length = %d, expectedLength = %d)", ((int)arr_b1.length), ((int)3)));
                    }
                    break;
                }
                case 1: {
                    evwg.a(arr_b1);
                    break;
                }
                case 2: {
                    if(arr_b1.length != 8) {
                        throw new IllegalArgumentException(String.format("Found invalid Thread Extended PAN ID TLV (length = %d, expectedLength = %d)", ((int)arr_b1.length), ((int)8)));
                    }
                    break;
                }
                case 3: {
                    if(arr_b1.length == 0 || arr_b1.length > 16) {
                        throw new IllegalArgumentException(String.format("Found invalid Thread Network Name TLV (length = %d, expectedLengthRange = (0, %d])", ((int)arr_b1.length), ((int)16)));
                    }
                    break;
                }
                case 4: {
                    if(arr_b1.length > 16) {
                        throw new IllegalArgumentException(String.format("Found invalid Thread PSKc TLV (length = %d, maxLength = %d)", ((int)arr_b1.length), ((int)16)));
                    }
                    break;
                }
                case 5: {
                    if(arr_b1.length != 16) {
                        throw new IllegalArgumentException(String.format("Found invalid Thread Network Key TLV (length = %d, expectedLength = %d)", ((int)arr_b1.length), ((int)16)));
                    }
                    break;
                }
                case 7: {
                    evwg.c(arr_b1);
                    break;
                }
                case 12: {
                    if(arr_b1.length < 3) {
                        throw new IllegalArgumentException(String.format("Found invalid Thread Security Policy TLV (length = %d, minimumLength = %d)", ((int)arr_b1.length), ((int)3)));
                    }
                    break;
                }
                case 14: {
                    if(arr_b1.length != 8) {
                        throw new IllegalArgumentException(String.format("Found invalid Thread Active Timestamp TLV (length = %d, expectedLength = %d)", ((int)arr_b1.length), ((int)8)));
                    }
                    break;
                }
                case 53: {
                    evwg.b(arr_b1);
                }
            }
            if(v1 != b) {
                v = v3;
                continue;
            }
            return arr_b1;
        }
        throw new IllegalArgumentException(String.format("Thread %s is missing from the dataset", ThreadNetworkCredentials.n.get(Byte.valueOf(b))));
    }

    @Override
    public final String toString() {
        return String.format(Locale.US, "{ExtendedPanId: %s, ActiveTimestamp: %s}", ghjc.f.o(this.p), this.g);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 1, this.a(), false);
        baub.q(parcel0, 2, this.d);
        baub.q(parcel0, 3, this.e);
        baub.e(parcel0, 4, this.f);
        baub.c(parcel0, v1);
    }
}

