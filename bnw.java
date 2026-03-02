import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class bnw {
    static final List a;
    final List b;
    public final ByteOrder c;
    private static final Pattern d;
    private static final Pattern e;
    private static final Pattern f;

    static {
        bnw.d = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        bnw.e = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        bnw.f = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        bnw.a = Collections.list(new bnt());
    }

    public bnw(ByteOrder byteOrder0) {
        this.b = Collections.list(new bnu());
        this.c = byteOrder0;
    }

    public final void a(String s, String s1, List list0) {
        for(Object object0: list0) {
            if(((Map)object0).containsKey(s)) {
                return;
            }
        }
        this.e(s, s1, list0);
    }

    public final void b(String s, String s1) {
        this.e(s, s1, this.b);
    }

    public final void c(int v) {
        int v1;
        switch(v) {
            case 0: {
                v1 = 1;
                break;
            }
            case 90: {
                v1 = 6;
                break;
            }
            case 180: {
                v1 = 3;
                break;
            }
            case 270: {
                v1 = 8;
                break;
            }
            default: {
                bcs.d("ExifData", a.f(v, "Unexpected orientation value: ", ". Must be one of 0, 90, 180, 270."));
                v1 = 0;
            }
        }
        this.b("Orientation", String.valueOf(v1));
    }

    private static Pair d(String s) {
        int v = 1;
        Integer integer0 = (int)2;
        Integer integer1 = (int)-1;
        if(s.contains(",")) {
            String[] arr_s = s.split(",", -1);
            Pair pair0 = bnw.d(arr_s[0]);
            if(((int)(((Integer)pair0.first))) != 2) {
                while(v < arr_s.length) {
                    Pair pair1 = bnw.d(arr_s[v]);
                    int v1 = ((Integer)pair1.first).equals(pair0.first) || ((Integer)pair1.second).equals(pair0.first) ? ((int)(((Integer)pair0.first))) : -1;
                    int v2 = ((int)(((Integer)pair0.second))) == -1 || !((Integer)pair1.first).equals(pair0.second) && !((Integer)pair1.second).equals(pair0.second) ? -1 : ((int)(((Integer)pair0.second)));
                    if(v1 == -1) {
                        if(v2 != -1) {
                            v1 = -1;
                            goto label_16;
                        }
                        return new Pair(integer0, integer1);
                    }
                label_16:
                    if(v1 == -1) {
                        pair0 = new Pair(v2, integer1);
                    }
                    else if(v2 == -1) {
                        pair0 = new Pair(v1, integer1);
                    }
                    ++v;
                }
            }
            return pair0;
        }
        if(s.contains("/")) {
            String[] arr_s1 = s.split("/", -1);
            if(arr_s1.length == 2) {
                try {
                    long v3 = (long)Double.parseDouble(arr_s1[0]);
                    long v4 = (long)Double.parseDouble(arr_s1[1]);
                    if(Long.compare(v3, 0L) >= 0 && v4 >= 0L) {
                        return Long.compare(v3, 0x7FFFFFFFL) > 0 || v4 > 0x7FFFFFFFL ? new Pair(((int)5), integer1) : new Pair(((int)10), ((int)5));
                    }
                    return new Pair(((int)10), integer1);
                }
                catch(NumberFormatException unused_ex) {
                }
            }
            return new Pair(integer0, integer1);
        }
        try {
            long v5 = Long.parseLong(s);
            int v6 = Long.compare(v5, 0L);
            if(v6 >= 0 && v5 <= 0xFFFFL) {
                return new Pair(((int)3), ((int)4));
            }
            return v6 >= 0 ? new Pair(((int)4), integer1) : new Pair(((int)9), integer1);
        }
        catch(NumberFormatException unused_ex) {
            try {
                Double.parseDouble(s);
                return new Pair(((int)12), integer1);
            }
            catch(NumberFormatException unused_ex) {
                return new Pair(integer0, integer1);
            }
        }
    }

    private final void e(String s, String s1, List list0) {
        bns bns0;
        String s2 = s;
        String s3 = s1;
        if(("DateTime".equals(s2) || "DateTimeOriginal".equals(s2) || "DateTimeDigitized".equals(s2)) && s3 != null) {
            boolean z = bnw.e.matcher(s3).find();
            boolean z1 = bnw.f.matcher(s3).find();
            if(s3.length() != 19) {
                bcs.d("ExifData", a.l(s3, s2, "Invalid value for ", " : "));
                return;
            }
            if(!z) {
                if(!z1) {
                    bcs.d("ExifData", a.l(s3, s2, "Invalid value for ", " : "));
                    return;
                }
                s3 = s3.replaceAll("-", ":");
            }
            else if(z1) {
                s3 = s3.replaceAll("-", ":");
            }
        }
        if("ISOSpeedRatings".equals(s2)) {
            s2 = "PhotographicSensitivity";
        }
        if(s3 != null && bnx.c.contains(s2)) {
            if(s2.equals("GPSTimeStamp")) {
                Matcher matcher0 = bnw.d.matcher(s3);
                if(!matcher0.find()) {
                    bcs.d("ExifData", a.l(s3, s2, "Invalid value for ", " : "));
                    return;
                }
                String s4 = matcher0.group(1);
                kay.i(s4);
                String s5 = matcher0.group(2);
                kay.i(s5);
                String s6 = matcher0.group(3);
                kay.i(s6);
                s3 = Integer.parseInt(s4) + "/1," + Integer.parseInt(s5) + "/1," + Integer.parseInt(s6) + "/1";
            }
            else {
                try {
                    s3 = new bob(((long)(Double.parseDouble(s3) * 10000.0)), 10000L).toString();
                }
                catch(NumberFormatException numberFormatException0) {
                    bcs.e("ExifData", a.l(s3, s2, "Invalid value for ", " : "), numberFormatException0);
                    return;
                }
            }
        }
        int v = 0;
        while(v < 4) {
            bnz bnz0 = (bnz)((HashMap)bnw.a.get(v)).get(s2);
            if(bnz0 != null) {
                if(s3 == null) {
                    ((Map)list0.get(v)).remove(s2);
                }
                else {
                    Pair pair0 = bnw.d(s3);
                    int v1 = bnz0.c;
                    if(v1 != ((int)(((Integer)pair0.first))) && v1 != ((int)(((Integer)pair0.second)))) {
                        int v2 = bnz0.d;
                        if(v2 != -1 && (v2 == ((int)(((Integer)pair0.first))) || v2 == ((int)(((Integer)pair0.second))))) {
                            v1 = v2;
                        }
                        else {
                            switch(v1) {
                                case 1: {
                                    goto label_54;
                                }
                                case 2: 
                                case 7: {
                                    goto label_63;
                                }
                                default: {
                                    goto label_62;
                                }
                            }
                        }
                    }
                    switch(v1) {
                        case 1: {
                        label_54:
                            Map map0 = (Map)list0.get(v);
                            if(s3.length() == 1 && s3.charAt(0) >= 0x30 && s3.charAt(0) <= 49) {
                                bns0 = new bns(1, 1, new byte[]{((byte)(s3.charAt(0) - 0x30))});
                            }
                            else {
                                byte[] arr_b = s3.getBytes(bns.a);
                                bns0 = new bns(1, arr_b.length, arr_b);
                            }
                            map0.put(s2, bns0);
                        label_62:
                            break;
                        }
                        case 3: {
                            String[] arr_s = s3.split(",", -1);
                            int[] arr_v = new int[arr_s.length];
                            for(int v3 = 0; v3 < arr_s.length; ++v3) {
                                arr_v[v3] = Integer.parseInt(arr_s[v3]);
                            }
                            Map map2 = (Map)list0.get(v);
                            ByteBuffer byteBuffer0 = ByteBuffer.wrap(new byte[bns.c[3] * arr_s.length]);
                            byteBuffer0.order(this.c);
                            for(int v4 = 0; v4 < arr_s.length; ++v4) {
                                byteBuffer0.putShort(((short)arr_v[v4]));
                            }
                            byte[] arr_b2 = byteBuffer0.array();
                            map2.put(s2, new bns(3, arr_s.length, arr_b2));
                            break;
                        }
                        case 4: {
                            String[] arr_s1 = s3.split(",", -1);
                            long[] arr_v1 = new long[arr_s1.length];
                            for(int v5 = 0; v5 < arr_s1.length; ++v5) {
                                arr_v1[v5] = Long.parseLong(arr_s1[v5]);
                            }
                            ((Map)list0.get(v)).put(s2, bns.c(arr_v1, this.c));
                            break;
                        }
                        case 5: {
                            String[] arr_s2 = s3.split(",", -1);
                            bob[] arr_bob = new bob[arr_s2.length];
                            int v6 = 0;
                            while(v6 < arr_s2.length) {
                                String[] arr_s3 = arr_s2[v6].split("/", -1);
                                arr_bob[v6] = new bob(((long)Double.parseDouble(arr_s3[0])), ((long)Double.parseDouble(arr_s3[1])));
                                ++v6;
                                arr_bob = arr_bob;
                            }
                            Map map3 = (Map)list0.get(v);
                            ByteBuffer byteBuffer1 = ByteBuffer.wrap(new byte[bns.c[5] * arr_s2.length]);
                            byteBuffer1.order(this.c);
                            for(int v7 = 0; v7 < arr_s2.length; ++v7) {
                                bob bob0 = arr_bob[v7];
                                byteBuffer1.putInt(((int)bob0.a));
                                byteBuffer1.putInt(((int)bob0.b));
                            }
                            byte[] arr_b3 = byteBuffer1.array();
                            map3.put(s2, new bns(5, arr_s2.length, arr_b3));
                            break;
                        }
                        case 2: 
                        case 7: {
                        label_63:
                            Map map1 = (Map)list0.get(v);
                            byte[] arr_b1 = (s3 + '\u0000').getBytes(bns.a);
                            map1.put(s2, new bns(2, arr_b1.length, arr_b1));
                            break;
                        }
                        case 9: {
                            String[] arr_s4 = s3.split(",", -1);
                            int[] arr_v2 = new int[arr_s4.length];
                            for(int v8 = 0; v8 < arr_s4.length; ++v8) {
                                arr_v2[v8] = Integer.parseInt(arr_s4[v8]);
                            }
                            Map map4 = (Map)list0.get(v);
                            ByteBuffer byteBuffer2 = ByteBuffer.wrap(new byte[bns.c[9] * arr_s4.length]);
                            byteBuffer2.order(this.c);
                            for(int v9 = 0; v9 < arr_s4.length; ++v9) {
                                byteBuffer2.putInt(arr_v2[v9]);
                            }
                            byte[] arr_b4 = byteBuffer2.array();
                            map4.put(s2, new bns(9, arr_s4.length, arr_b4));
                            break;
                        }
                        case 10: {
                            String[] arr_s5 = s3.split(",", -1);
                            int v10 = arr_s5.length;
                            bob[] arr_bob1 = new bob[v10];
                            int v11 = 0;
                            while(v11 < arr_s5.length) {
                                String[] arr_s6 = arr_s5[v11].split("/", -1);
                                arr_bob1[v11] = new bob(((long)Double.parseDouble(arr_s6[0])), ((long)Double.parseDouble(arr_s6[1])));
                                ++v11;
                                arr_s5 = arr_s5;
                            }
                            Map map5 = (Map)list0.get(v);
                            ByteBuffer byteBuffer3 = ByteBuffer.wrap(new byte[bns.c[10] * v10]);
                            byteBuffer3.order(this.c);
                            for(int v12 = 0; v12 < v10; ++v12) {
                                bob bob1 = arr_bob1[v12];
                                byteBuffer3.putInt(((int)bob1.a));
                                byteBuffer3.putInt(((int)bob1.b));
                            }
                            map5.put(s2, new bns(10, v10, byteBuffer3.array()));
                        }
                    }
                }
            }
            ++v;
        }
    }
}

