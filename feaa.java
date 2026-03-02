import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class feaa {
    static final ayux a;
    public static final int b;

    static {
        feaa.a = fdob.b().a(fdnp.b);
    }

    public static int a(fdvx fdvx0, fdzw fdzw0, OutputStream outputStream0, ffav ffav0, fdzr fdzr0, fdvw fdvw0, fdpd fdpd0, int v) {
        byte[] arr_b;
        int v1;
        fdzr0.d(true);
        if(fdpd0 == null) {
            if(((ProtoLiteMessage)ffav0).isImmutable()) {
                v1 = ((ProtoLiteMessage)ffav0).t(null);
                if(v1 < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + v1);
                }
            }
            else {
                v1 = ffav0.memoizedSerializedSize & 0x7FFFFFFF;
                if(v1 == 0x7FFFFFFF) {
                    v1 = ((ProtoLiteMessage)ffav0).t(null);
                    if(v1 < 0) {
                        throw new IllegalStateException("serialized size must be non-negative, was " + v1);
                    }
                    ffav0.memoizedSerializedSize = ffav0.memoizedSerializedSize & 0x80000000 | v1;
                    feaa.l(fdzw0, v1);
                    ((ProtoLiteMessage)ffav0).writeTo(((CodedOutputStream)new hfso(fdzw0.b, 0, v1)));
                    arr_b = fdzw0.b;
                    goto label_22;
                }
            }
            feaa.l(fdzw0, v1);
            ((ProtoLiteMessage)ffav0).writeTo(((CodedOutputStream)new hfso(fdzw0.b, 0, v1)));
            arr_b = fdzw0.b;
        }
        else {
            byte[] arr_b1 = ffav0.toBytesArray();
            hhsq hhsq0 = fdpd0.d;
            if(hhsq0 == null) {
                throw new IllegalStateException("D2DConnectionContext session is null.");
            }
            arr_b = hhsq0.k(arr_b1);
            v1 = arr_b.length;
        }
    label_22:
        if(Log.isLoggable("wearable", 2) || Log.isLoggable("WearableVerbose", 2)) {
            Log.v("wearable", "sending message of length " + v1);
        }
        if(v >= 3 && hzzi.a.i().aj()) {
            fdzw0.a.clear();
            fdzw0.a.putInt(arr_b.length);
            fdzw0.a.flip();
            byte[] arr_b2 = fdzw0.a.array();
            int v2 = arr_b2.length + arr_b.length;
            byte[] arr_b3 = Arrays.copyOf(arr_b2, v2);
            System.arraycopy(arr_b, 0, arr_b3, arr_b2.length, arr_b.length);
            outputStream0.write(arr_b3, 0, v2);
        }
        else {
            fdzw0.a.clear();
            Integer.valueOf(v1).getClass();
            fdzw0.a.putInt(v1);
            fdzw0.a.flip();
            byte[] arr_b4 = fdzw0.a.array();
            int v3 = fdzw0.a.arrayOffset();
            outputStream0.write(arr_b4, fdzw0.a.position() + v3, fdzw0.a.limit());
            outputStream0.write(arr_b, 0, v1);
        }
        fdzr0.d(false);
        fdzr0.c(v1 + 4);
        fdvx0.a(fdvw0, "bytesSent", v1 + 4);
        fdvx0.a(fdvw0, "msgsSent", 1);
        fdob.b().c(fdvw0.b, fdvw0.a, ((long)(v1 + 4)), true);
        if(!Log.isLoggable("wearable", 2) && !Log.isLoggable("WearableVerbose", 2)) {
            return v1 + 4;
        }
        Log.v("wearable", a.f(v1, "sending message of length ", " is done"));
        return v1 + 4;
    }

    public static fdvw b(ffau ffau0) {
        int v = ffau0.b;
        String s = "unknown";
        String s1 = null;
        if((v & 1) == 0) {
            if((v & 4) != 0) {
                String s2 = (ffau0.e == null ? fezj.a : ffau0.e).c;
                if(!gfta.c(s2)) {
                    s = s2;
                }
            }
            else if((v & 0x80) != 0) {
                s = (ffau0.j == null ? ffby.a : ffau0.j).c;
            }
            else if((v & 0x100) != 0) {
                s = (ffau0.k == null ? ffbw.a : ffau0.k).d;
            }
            else if((v & 0x200) == 0) {
                s = (v & 0x2000) == 0 ? null : (ffau0.p == null ? ffbw.a : ffau0.p).d;
            }
            else {
                s = (ffau0.l == null ? ffbw.a : ffau0.l).d;
            }
        }
        else if(((ffau0.c == null ? ffbx.a : ffau0.c).b & 2) != 0) {
            ffbx ffbx0 = ffau0.c == null ? ffbx.a : ffau0.c;
            if((ffbx0.d == null ? fexb.a : ffbx0.d).b.size() > 0) {
                ffbx ffbx1 = ffau0.c == null ? ffbx.a : ffau0.c;
                s = ((fexi)(ffbx1.d == null ? fexb.a : ffbx1.d).b.get(0)).c;
            }
            ffbx ffbx2 = ffau0.c == null ? ffbx.a : ffau0.c;
            if((ffbx2.d == null ? fexb.a : ffbx2.d).b.size() > 1) {
                s = s + "(shared)";
            }
        }
        ffaw ffaw0 = ffax.a(ffau0);
        if((ffau0.b & 0x100) != 0 && (ffau0.k == null ? ffbw.a : ffau0.k).d.equals("com.google.android.wearable.app")) {
            s1 = (ffau0.k == null ? ffbw.a : ffau0.k).g;
            if(TextUtils.isEmpty(s1)) {
                s1 = "(no path)";
            }
        }
        return new fdvw(ffaw0, s, s1);
    }

    public static ffau c(ffav ffav0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffau.a).v_newBuilder();
        hftp0.bF(ffav0.c.toByteArray(), ffav0.c.size());
        ffau ffau0 = (ffau)hftp0.N_build();
        String s = fdvl.s(ffav0.c.toByteArray());
        if(!ffav0.d.equals(s)) {
            feaa.a.a(0L, 1L, ayvf.b);
            throw new IOException("Unsegmented message digest should match the received digest: size[" + ((ffav0.b & 1) == 0 ? 0 : ffav0.c.size()) + "], " + s + ", " + ffav0.d);
        }
        return ffau0;
    }

    public static ffau d(List list0) {
        String s = ((ffav)list0.get(0)).d;
        int v1 = 0;
        for(Object object0: list0) {
            v1 += ((ffav)object0).c.size();
        }
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(v1);
        for(int v = 0; v < list0.size(); ++v) {
            byteBuffer0.put(((ffav)list0.get(v)).c.toByteArray());
        }
        String s1 = fdvl.s(byteBuffer0.array());
        if(s.equals(s1)) {
            return (ffau)((ProtoLiteBuilder)((ProtoLiteMessage)ffau.a).v_newBuilder().y(byteBuffer0.array())).N_build();
        }
        feaa.a.a(0L, 1L, ayvf.b);
        throw new IOException("Segmented message digest should match the received digest: size[" + v1 + "], " + s1 + ", " + s + "; numSegments: " + list0.size());
    }

    public static ffav e(ffau ffau0) {
        byte[] arr_b = ffau0.toBytesArray();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffav.a).v_newBuilder();
        ByteString hfsf0 = ByteString.copyFrom(arr_b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffav ffav0 = (ffav)hftp0.b_message;
        ffav0.b |= 1;
        ffav0.c = hfsf0;
        String s = fdvl.s(arr_b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((ffav)hftv0).b |= 2;
        ((ffav)hftv0).d = s;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((ffav)hftv1).b |= 4;
        ((ffav)hftv1).e = 1;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffav ffav1 = (ffav)hftp0.b_message;
        ffav1.b |= 8;
        ffav1.f = 1;
        return (ffav)hftp0.N_build();
    }

    public static String f(ffav ffav0) {
        return String.format(Locale.US, "MessagePiece: queueId=%d digest=%s len=%d piece=%d of %d", ((int)ffav0.g), ffav0.d, ffav0.c.size(), ((int)ffav0.e), ((int)ffav0.f));
    }

    public static List g(ffau ffau0, int v, int v1) {
        byte[] arr_b = ffau0.toBytesArray();
        String s = fdvl.s(arr_b);
        int v2 = (arr_b.length + v - 1) / v;
        List list0 = new ArrayList(v2);
        int v3 = 0;
        while(v3 < v2) {
            int v4 = v3 * v;
            int v5 = Math.min(arr_b.length - v4, v);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffav.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((ffav)hftv0).b |= 16;
            ((ffav)hftv0).g = v1;
            ++v3;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((ffav)hftv1).b |= 4;
            ((ffav)hftv1).e = v3;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ffav ffav0 = (ffav)hftp0.b_message;
            ffav0.b |= 2;
            ffav0.d = s;
            ByteString hfsf0 = ByteString.z(arr_b, v4, v5);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((ffav)hftv2).b |= 1;
            ((ffav)hftv2).c = hfsf0;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            ffav ffav1 = (ffav)hftp0.b_message;
            ffav1.b |= 8;
            ffav1.f = v2;
            list0.add(((ffav)hftp0.N_build()));
        }
        return list0;
    }

    public static boolean h(int v, int v1) {
        if(!hzvy.a.b().a()) {
            return true;
        }
        if(!hzvy.e()) {
            return false;
        }
        if(v1 != 0) {
            v = v1;
        }
        return v < 30;
    }

    public static void i(fdzx fdzx0, ffav ffav0, fdvw fdvw0, fdpd fdpd0) {
        feaa.a(fdzx0.d, fdzx0.c, fdzx0.b, ffav0, fdzx0.e, fdvw0, fdpd0, -1);
    }

    public static int j(fdzw fdzw0, InputStream inputStream0, ProtoLiteBuilder hftp0, fdzr fdzr0, fdpd fdpd0) {
        int v1;
        byte[] arr_b;
        fdzr0.e(false);
        fdzw0.a.clear();
        feaa.m(inputStream0, fdzw0.a.array(), 4);
        fdzw0.a.position(4);
        fdzw0.a.flip();
        int v = fdzw0.a.getInt();
        if(fdpd0 == null) {
            feaa.l(fdzw0, v);
            feaa.m(inputStream0, fdzw0.b, v);
            arr_b = fdzw0.b;
            v1 = v;
        }
        else {
            byte[] arr_b1 = new byte[v];
            feaa.m(inputStream0, arr_b1, v);
            arr_b = fdpd0.e(arr_b1);
            v1 = arr_b.length;
        }
        hftp0.Y(arr_b, v1, hftc.a());
        fdzr0.e(true);
        fdzr0.b(v + 4);
        return v + 4;
    }

    public static void k(fdzx fdzx0, ProtoLiteBuilder hftp0, fdpd fdpd0) {
        feaa.j(fdzx0.c, fdzx0.a, hftp0, fdzx0.e, fdpd0);
    }

    private static void l(fdzw fdzw0, int v) {
        if(fdzw0.b != null && v <= fdzw0.b.length) {
            return;
        }
        int v1 = Math.round(((float)v) * 1.1f);
        byte[] arr_b = fdzw0.b;
        if(arr_b != null) {
            Log.v("wearable", "ensureBuffersHaveSpace: increasing size from " + arr_b.length + " to " + v1);
        }
        fdzw0.b = new byte[v1];
    }

    private static void m(InputStream inputStream0, byte[] arr_b, int v) {
        int v1 = 0;
        while(v1 < v) {
            int v2 = inputStream0.read(arr_b, v1, v - v1);
            if(v2 <= 0) {
                throw new IOException("connection closed");
            }
            v1 += v2;
            continue;
        }
        if(!Log.isLoggable("wearable", 2) && !Log.isLoggable("WearableVerbose", 2)) {
            return;
        }
        Log.v("wearable", a.f(v, "reading message of length ", " is done."));
    }
}

