import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class llc {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public llc(int v, int v1, long v2, byte[] arr_b) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = arr_b;
    }

    public llc(int v, int v1, byte[] arr_b) {
        this(v, v1, -1L, arr_b);
    }

    public final double a(ByteOrder byteOrder0) {
        Object object0 = this.k(byteOrder0);
        if(object0 == null) {
            throw new NumberFormatException("NULL can\'t be converted to a double value");
        }
        if((object0 instanceof String)) {
            return Double.parseDouble(((String)object0));
        }
        if((object0 instanceof long[])) {
            if(((long[])object0).length == 1) {
                return (double)((long[])object0)[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if((object0 instanceof int[])) {
            if(((int[])object0).length == 1) {
                return (double)((int[])object0)[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if((object0 instanceof double[])) {
            if(((double[])object0).length == 1) {
                return ((double[])object0)[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if(!(object0 instanceof lle[])) {
            throw new NumberFormatException("Couldn\'t find a double value");
        }
        if(((lle[])object0).length == 1) {
            return ((double)((lle[])object0)[0].a) / ((double)((lle[])object0)[0].b);
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final int b(ByteOrder byteOrder0) {
        Object object0 = this.k(byteOrder0);
        if(object0 == null) {
            throw new NumberFormatException("NULL can\'t be converted to a integer value");
        }
        if((object0 instanceof String)) {
            return Integer.parseInt(((String)object0));
        }
        if((object0 instanceof long[])) {
            if(((long[])object0).length == 1) {
                return (int)((long[])object0)[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if(!(object0 instanceof int[])) {
            throw new NumberFormatException("Couldn\'t find a integer value");
        }
        if(((int[])object0).length == 1) {
            return ((int[])object0)[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public static llc c(String s) {
        if(s.length() == 1 && s.charAt(0) >= 0x30 && s.charAt(0) <= 49) {
            return new llc(1, 1, new byte[]{((byte)(s.charAt(0) - 0x30))});
        }
        byte[] arr_b = s.getBytes(llf.k);
        return new llc(1, arr_b.length, arr_b);
    }

    public static llc d(String s) {
        byte[] arr_b = (s + '\u0000').getBytes(llf.k);
        return new llc(2, arr_b.length, arr_b);
    }

    public static llc e(long v, ByteOrder byteOrder0) {
        return llc.f(new long[]{v}, byteOrder0);
    }

    public static llc f(long[] arr_v, ByteOrder byteOrder0) {
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(new byte[llf.h[4] * arr_v.length]);
        byteBuffer0.order(byteOrder0);
        for(int v = 0; v < arr_v.length; ++v) {
            byteBuffer0.putInt(((int)arr_v[v]));
        }
        byte[] arr_b = byteBuffer0.array();
        return new llc(4, arr_v.length, arr_b);
    }

    public static llc g(lle lle0, ByteOrder byteOrder0) {
        return llc.h(new lle[]{lle0}, byteOrder0);
    }

    public static llc h(lle[] arr_lle, ByteOrder byteOrder0) {
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(new byte[llf.h[5] * arr_lle.length]);
        byteBuffer0.order(byteOrder0);
        for(int v = 0; v < arr_lle.length; ++v) {
            lle lle0 = arr_lle[v];
            byteBuffer0.putInt(((int)lle0.a));
            byteBuffer0.putInt(((int)lle0.b));
        }
        byte[] arr_b = byteBuffer0.array();
        return new llc(5, arr_lle.length, arr_b);
    }

    public static llc i(int v, ByteOrder byteOrder0) {
        return llc.j(new int[]{v}, byteOrder0);
    }

    public static llc j(int[] arr_v, ByteOrder byteOrder0) {
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(new byte[llf.h[3] * arr_v.length]);
        byteBuffer0.order(byteOrder0);
        for(int v = 0; v < arr_v.length; ++v) {
            byteBuffer0.putShort(((short)arr_v[v]));
        }
        byte[] arr_b = byteBuffer0.array();
        return new llc(3, arr_v.length, arr_b);
    }

    final Object k(ByteOrder byteOrder0) {
        StringBuilder stringBuilder0;
        Object object0;
        int[] arr_v;
        int v;
        llb llb1;
        llb llb0 = null;
        try {
            llb1 = null;
            llb1 = new llb(this.d);
            goto label_6;
        }
        catch(IOException iOException0) {
            goto label_104;
        }
        catch(Throwable throwable0) {
        }
        goto label_113;
        try {
        label_6:
            llb1.c = byteOrder0;
            v = 0;
            switch(this.a) {
                case 3: {
                    goto label_48;
                }
                case 4: {
                    goto label_55;
                }
                case 5: {
                    goto label_62;
                }
                case 1: 
                case 6: {
                    goto label_14;
                }
                case 2: 
                case 7: {
                    goto label_22;
                }
                case 8: {
                    goto label_69;
                }
                case 9: {
                    goto label_76;
                }
                case 10: {
                    goto label_83;
                }
                case 11: {
                    goto label_90;
                }
                case 12: {
                    goto label_97;
                }
            }
        }
        catch(IOException iOException0) {
            goto label_104;
        }
        catch(Throwable throwable0) {
            goto label_112;
        }
        try {
            llb1.close();
        }
        catch(IOException iOException1) {
            Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException1);
        }
        return null;
        try {
        label_14:
            byte[] arr_b = this.d;
            if(arr_b.length == 1) {
                int v1 = arr_b[0];
                if(v1 >= 0 && v1 <= 1) {
                    arr_v = new String(new char[]{((char)(this.d[0] + 0x30))});
                    goto label_119;
                }
            }
            object0 = new String(arr_b, llf.k);
            goto label_43;
        label_22:
            int v2 = this.b;
            byte[] arr_b1 = llf.i;
            if(v2 >= 8) {
                int v3 = 0;
                while(true) {
                    if(v3 < 8) {
                        if(this.d[v3] != arr_b1[v3]) {
                            goto label_32;
                        }
                        ++v3;
                        continue;
                    }
                    v = 8;
                    goto label_32;
                }
            }
            else {
            label_32:
                stringBuilder0 = new StringBuilder();
            }
            while(v < v2) {
                int v4 = this.d[v];
                if(v4 == 0) {
                    break;
                }
                if(v4 >= 0x20) {
                    stringBuilder0.append(((char)v4));
                }
                else {
                    stringBuilder0.append('?');
                }
                ++v;
            }
            object0 = stringBuilder0.toString();
        }
        catch(IOException iOException0) {
            goto label_104;
        }
        catch(Throwable throwable0) {
            goto label_112;
        }
        try {
        label_43:
            llb1.close();
        }
        catch(IOException iOException2) {
            Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException2);
        }
        return object0;
        try {
        label_48:
            int v5 = this.b;
            arr_v = new int[v5];
            while(v < v5) {
                arr_v[v] = llb1.readUnsignedShort();
                ++v;
            }
            goto label_119;
        label_55:
            int v6 = this.b;
            arr_v = new long[v6];
            while(v < v6) {
                arr_v[v] = llb1.a();
                ++v;
            }
            goto label_119;
        label_62:
            int v7 = this.b;
            arr_v = new lle[v7];
            while(v < v7) {
                arr_v[v] = new lle(llb1.a(), llb1.a());
                ++v;
            }
            goto label_119;
        label_69:
            int v8 = this.b;
            arr_v = new int[v8];
            while(v < v8) {
                arr_v[v] = llb1.readShort();
                ++v;
            }
            goto label_119;
        label_76:
            int v9 = this.b;
            arr_v = new int[v9];
            while(v < v9) {
                arr_v[v] = llb1.readInt();
                ++v;
            }
            goto label_119;
        label_83:
            int v10 = this.b;
            arr_v = new lle[v10];
            while(v < v10) {
                arr_v[v] = new lle(((long)llb1.readInt()), ((long)llb1.readInt()));
                ++v;
            }
            goto label_119;
        label_90:
            int v11 = this.b;
            arr_v = new double[v11];
            while(v < v11) {
                arr_v[v] = (double)llb1.readFloat();
                ++v;
            }
        }
        catch(IOException iOException0) {
            goto label_104;
        }
        catch(Throwable throwable0) {
            goto label_112;
        }
        goto label_119;
        try {
            try {
            label_97:
                int v12 = this.b;
                arr_v = new double[v12];
                while(true) {
                    if(v >= v12) {
                        goto label_119;
                    }
                    arr_v[v] = llb1.readDouble();
                    ++v;
                }
            }
            catch(IOException iOException0) {
            }
        label_104:
            Log.w("ExifInterface", "IOException occurred during reading a value", iOException0);
            if(llb1 != null) {
                goto label_106;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_112;
        }
        try {
        label_106:
            llb1.close();
            return null;
        }
        catch(IOException iOException3) {
            Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException3);
        }
        return null;
    label_112:
        llb0 = llb1;
    label_113:
        if(llb0 != null) {
            try {
                llb0.close();
            }
            catch(IOException iOException4) {
                Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException4);
            }
        }
        throw throwable0;
        try {
        label_119:
            llb1.close();
        }
        catch(IOException iOException5) {
            Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException5);
        }
        return arr_v;
    }

    public final String l(ByteOrder byteOrder0) {
        Object object0 = this.k(byteOrder0);
        if(object0 != null) {
            if((object0 instanceof String)) {
                return (String)object0;
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            int v = 0;
            if((object0 instanceof long[])) {
                while(v < ((long[])object0).length) {
                    stringBuilder0.append(((long[])object0)[v]);
                    ++v;
                    if(v != ((long[])object0).length) {
                        stringBuilder0.append(",");
                    }
                }
                return stringBuilder0.toString();
            }
            if((object0 instanceof int[])) {
                while(v < ((int[])object0).length) {
                    stringBuilder0.append(((int[])object0)[v]);
                    ++v;
                    if(v != ((int[])object0).length) {
                        stringBuilder0.append(",");
                    }
                }
                return stringBuilder0.toString();
            }
            if((object0 instanceof double[])) {
                while(v < ((double[])object0).length) {
                    stringBuilder0.append(((double[])object0)[v]);
                    ++v;
                    if(v != ((double[])object0).length) {
                        stringBuilder0.append(",");
                    }
                }
                return stringBuilder0.toString();
            }
            if((object0 instanceof lle[])) {
                while(v < ((lle[])object0).length) {
                    stringBuilder0.append(((lle[])object0)[v].a);
                    stringBuilder0.append('/');
                    stringBuilder0.append(((lle[])object0)[v].b);
                    ++v;
                    if(v != ((lle[])object0).length) {
                        stringBuilder0.append(",");
                    }
                }
                return stringBuilder0.toString();
            }
        }
        return null;
    }

    @Override
    public final String toString() {
        return "(" + llf.g[this.a] + ", data length:" + this.d.length + ")";
    }
}

