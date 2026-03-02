package j$.time.zone;

import j..time.ZoneOffset;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.TimeZone;

public final class a implements Externalizable {
    public byte a;
    public Serializable b;
    private static final long serialVersionUID = 0x84B0FEEB7C1A53BEL;

    public a() {
    }

    public a(byte b, Serializable serializable0) {
        this.a = b;
        this.b = serializable0;
    }

    public static long a(ObjectInput objectInput0) {
        int v = objectInput0.readByte() & 0xFF;
        return v == 0xFF ? objectInput0.readLong() : ((long)((v << 16) + ((objectInput0.readByte() & 0xFF) << 8) + (objectInput0.readByte() & 0xFF))) * 900L - 0x110BC5000L;
    }

    public static ZoneOffset b(ObjectInput objectInput0) {
        int v = objectInput0.readByte();
        return v == 0x7F ? ZoneOffset.ofTotalSeconds(objectInput0.readInt()) : ZoneOffset.ofTotalSeconds(v * 900);
    }

    public static void c(long v, ObjectOutput objectOutput0) {
        if(Long.compare(v, 0xFFFFFFFEEF43B000L) >= 0 && v < 10413792000L && v % 900L == 0L) {
            int v1 = (int)((v + 0x110BC5000L) / 900L);
            objectOutput0.writeByte(v1 >>> 16 & 0xFF);
            objectOutput0.writeByte(v1 >>> 8 & 0xFF);
            objectOutput0.writeByte(v1 & 0xFF);
            return;
        }
        objectOutput0.writeByte(0xFF);
        objectOutput0.writeLong(v);
    }

    public static void d(ZoneOffset zoneOffset0, ObjectOutput objectOutput0) {
        int v = zoneOffset0.b;
        int v1 = v % 900 == 0 ? v / 900 : 0x7F;
        objectOutput0.writeByte(v1);
        if(v1 == 0x7F) {
            objectOutput0.writeInt(v);
        }
    }

    @Override
    public final void readExternal(ObjectInput objectInput0) {
        d d0;
        byte b = objectInput0.readByte();
        this.a = b;
        switch(b) {
            case 1: {
                int v = objectInput0.readInt();
                long[] arr_v = e.i;
                long[] arr_v1 = v == 0 ? arr_v : new long[v];
                for(int v2 = 0; v2 < v; ++v2) {
                    arr_v1[v2] = a.a(objectInput0);
                }
                ZoneOffset[] arr_zoneOffset = new ZoneOffset[v + 1];
                for(int v3 = 0; v3 < v + 1; ++v3) {
                    arr_zoneOffset[v3] = a.b(objectInput0);
                }
                int v4 = objectInput0.readInt();
                if(v4 != 0) {
                    arr_v = new long[v4];
                }
                for(int v5 = 0; v5 < v4; ++v5) {
                    arr_v[v5] = a.a(objectInput0);
                }
                ZoneOffset[] arr_zoneOffset1 = new ZoneOffset[v4 + 1];
                for(int v6 = 0; v6 < v4 + 1; ++v6) {
                    arr_zoneOffset1[v6] = a.b(objectInput0);
                }
                int v7 = objectInput0.readByte();
                d[] arr_d = v7 == 0 ? e.j : new d[v7];
                for(int v1 = 0; v1 < v7; ++v1) {
                    arr_d[v1] = d.a(objectInput0);
                }
                d0 = new e(arr_v1, arr_zoneOffset, arr_v, arr_zoneOffset1, arr_d);
                break;
            }
            case 2: {
                long v8 = a.a(objectInput0);
                ZoneOffset zoneOffset0 = a.b(objectInput0);
                ZoneOffset zoneOffset1 = a.b(objectInput0);
                if(zoneOffset0.equals(zoneOffset1)) {
                    throw new IllegalArgumentException("Offsets must not be equal");
                }
                d0 = new b(v8, zoneOffset0, zoneOffset1);
                break;
            }
            case 3: {
                d0 = d.a(objectInput0);
                break;
            }
            case 100: {
                d0 = new e(TimeZone.getTimeZone(objectInput0.readUTF()));
                break;
            }
            default: {
                throw new StreamCorruptedException("Unknown serialized type");
            }
        }
        this.b = d0;
    }

    private Object readResolve() {
        return this.b;
    }

    @Override
    public final void writeExternal(ObjectOutput objectOutput0) {
        int v = this.a;
        Serializable serializable0 = this.b;
        objectOutput0.writeByte(v);
        switch(v) {
            case 1: {
                d[] arr_d = ((e)serializable0).f;
                long[] arr_v = ((e)serializable0).c;
                long[] arr_v1 = ((e)serializable0).a;
                objectOutput0.writeInt(arr_v1.length);
                for(int v2 = 0; v2 < arr_v1.length; ++v2) {
                    a.c(arr_v1[v2], objectOutput0);
                }
                ZoneOffset[] arr_zoneOffset = ((e)serializable0).b;
                for(int v3 = 0; v3 < arr_zoneOffset.length; ++v3) {
                    a.d(arr_zoneOffset[v3], objectOutput0);
                }
                objectOutput0.writeInt(arr_v.length);
                for(int v4 = 0; v4 < arr_v.length; ++v4) {
                    a.c(arr_v[v4], objectOutput0);
                }
                ZoneOffset[] arr_zoneOffset1 = ((e)serializable0).e;
                for(int v5 = 0; v5 < arr_zoneOffset1.length; ++v5) {
                    a.d(arr_zoneOffset1[v5], objectOutput0);
                }
                objectOutput0.writeByte(arr_d.length);
                for(int v1 = 0; v1 < arr_d.length; ++v1) {
                    arr_d[v1].writeExternal(objectOutput0);
                }
                return;
            }
            case 2: {
                a.c(((b)serializable0).a, objectOutput0);
                a.d(((b)serializable0).c, objectOutput0);
                a.d(((b)serializable0).d, objectOutput0);
                return;
            }
            case 3: {
                ((d)serializable0).writeExternal(objectOutput0);
                return;
            }
            case 100: {
                objectOutput0.writeUTF(((e)serializable0).g.getID());
                return;
            }
            default: {
                throw new InvalidClassException("Unknown serialized type");
            }
        }
    }
}

