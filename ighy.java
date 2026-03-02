import java.io.DataInput;
import java.io.IOException;

public final class ighy {
    static long a(DataInput dataInput0) {
        int v = dataInput0.readUnsignedByte();
        switch(v >> 6) {
            case 1: {
                int v1 = dataInput0.readUnsignedByte() << 16;
                int v2 = dataInput0.readUnsignedByte() << 8;
                return ((long)(dataInput0.readUnsignedByte() | (v << 26 >> 2 | v1 | v2))) * 60000L;
            }
            case 2: {
                return (((long)v) << 58 >> 26 | ((long)(dataInput0.readUnsignedByte() << 24)) | ((long)(dataInput0.readUnsignedByte() << 16)) | ((long)(dataInput0.readUnsignedByte() << 8)) | ((long)dataInput0.readUnsignedByte())) * 1000L;
            }
            default: {
                return v >> 6 == 3 ? dataInput0.readLong() : ((long)(v << 26 >> 26)) * 1800000L;
            }
        }
    }

    public static igcw b(DataInput dataInput0, String s) {
        switch(dataInput0.readUnsignedByte()) {
            case 67: {
                return new ight(ighw.c(dataInput0, s));
            }
            case 70: {
                igcw igcw0 = new igia(s, dataInput0.readUTF(), ((int)ighy.a(dataInput0)), ((int)ighy.a(dataInput0)));
                return igcw0.equals(igcw.b) ? igcw.b : igcw0;
            }
            case 80: {
                return ighw.c(dataInput0, s);
            }
            default: {
                throw new IOException("Invalid encoding");
            }
        }
    }
}

