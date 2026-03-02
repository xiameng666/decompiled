import com.google.android.gms.leveldb.LevelDb.Iterator;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class fvzn {
    public static final byte[] a;
    public static final byte[] b;
    public static final byte[] c;
    public final ggrv d;
    public final int e;
    public LevelDb f;
    private final File g;

    static {
        fvzn.a = "device_bias".getBytes(StandardCharsets.UTF_8);
        fvzn.b = "size".getBytes(StandardCharsets.UTF_8);
        fvzn.c = "version".getBytes(StandardCharsets.UTF_8);
    }

    public fvzn(File file0, int v, ggrv ggrv0) {
        this.g = file0;
        this.e = v;
        this.d = ggrv0;
    }

    final int a(long v) {
        return ghgc.a.b(v).a() % (this.e / 2 - 1);
    }

    public final Integer b(byte[] arr_b) {
        try {
            LevelDb levelDb0 = this.f;
            gftb.check(levelDb0);
            byte[] arr_b1 = levelDb0.get(arr_b);
            if(arr_b1 != null) {
                return glwy.c(arr_b1);
            }
        }
        catch(LevelDbException levelDbException0) {
            ggrv ggrv0 = this.d;
            if(ggrv0 != null) {
                ggrv0.i().s(levelDbException0).ar(19108).x("LevelDB read int field failed.");
            }
        }
        return null;
    }

    public final Map c() {
        gftb.check(this.f);
        Map map0 = new HashMap();
        try(LevelDb.Iterator levelDb$Iterator0 = this.f.iterator()) {
            levelDb$Iterator0.seekToFirst();
            while(true) {
                if(!levelDb$Iterator0.isValid()) {
                    break;
                }
                byte[] arr_b = levelDb$Iterator0.key();
                if(!Arrays.equals(arr_b, fvzn.a) && !Arrays.equals(arr_b, fvzn.b) && !Arrays.equals(arr_b, fvzn.c)) {
                    icvl icvl0 = this.d(levelDb$Iterator0.value());
                    if(icvl0 != null) {
                        map0.put(Integer.valueOf(ByteBuffer.wrap(levelDb$Iterator0.key()).getInt()), icvl0);
                    }
                }
                levelDb$Iterator0.next();
            }
        }
        return map0;
    }

    public final icvl d(byte[] arr_b) {
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)icvl.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return (icvl)hftv0;
        }
        catch(hfur hfur0) {
            ggrv ggrv0 = this.d;
            if(ggrv0 != null) {
                ggrv0.i().s(hfur0).ar(0x4AA0).x("Failed to parse DeviceBaroBiasTableEntry");
            }
            return null;
        }
    }

    public final void e(byte[] arr_b, int v) {
        Integer integer0 = this.b(arr_b);
        if(integer0 == null) {
            this.j(arr_b, v);
            return;
        }
        if(((int)integer0) != v) {
            this.f();
            this.g();
            if(this.f != null) {
                this.j(arr_b, v);
            }
        }
    }

    public final void f() {
        LevelDb levelDb0 = this.f;
        if(levelDb0 != null) {
            levelDb0.close();
            this.f = null;
        }
        try {
            LevelDb.destroy(this.g);
        }
        catch(LevelDbException levelDbException0) {
            ggrv ggrv0 = this.d;
            if(ggrv0 != null) {
                ggrv0.i().s(levelDbException0).ar(19102).x("Clearing LevelDB failed.");
            }
        }
    }

    public final void g() {
        gftb.q(this.f == null);
        try {
            this.f = LevelDb.open(this.g);
        }
        catch(LevelDbException levelDbException0) {
            ggrv ggrv0 = this.d;
            if(ggrv0 != null) {
                ggrv0.i().s(levelDbException0).ar(0x4A9F).x("LevelDB open failed.");
            }
        }
    }

    public final boolean h() {
        return this.f != null;
    }

    public static byte[] i(int v) {
        return ByteBuffer.allocate(4).putInt(v).array();
    }

    private final void j(byte[] arr_b, int v) {
        try {
            LevelDb levelDb0 = this.f;
            gftb.check(levelDb0);
            levelDb0.put(arr_b, glwy.l(v));
        }
        catch(LevelDbException levelDbException0) {
            ggrv ggrv0 = this.d;
            if(ggrv0 != null) {
                ggrv0.i().s(levelDbException0).ar(0x4AA7).x("LevelDB put int field failed");
            }
        }
    }
}

