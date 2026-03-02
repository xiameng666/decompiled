import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri.Builder;
import com.google.android.gms.wearable.internal.DataItemParcelable;
import java.util.Map.Entry;

public final class fdur {
    static ContentValues a(fduq fduq0) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("sourceNode", fduq0.e);
        contentValues0.put("seqId", Long.valueOf(fduq0.f));
        contentValues0.put("v1SourceNode", fduq0.e);
        contentValues0.put("v1SeqId", Long.valueOf(fduq0.g));
        contentValues0.put("timestampMs", Long.valueOf(fduq0.h));
        if(fduq0.c) {
            contentValues0.put("deleted", Integer.valueOf(1));
            contentValues0.putNull("data");
        }
        else {
            contentValues0.put("deleted", Integer.valueOf(0));
            contentValues0.put("data", fduq0.b.e);
        }
        contentValues0.put("assetsPresent", Integer.valueOf(((int)fduq0.d)));
        return contentValues0;
    }

    public static fcez b(fduq fduq0, String s, String s1) {
        return fduq0.c || !fduq0.b.a.equals(s) || !fduq0.b.b.equals(s1) ? null : fcez.b(fduq0.b.c());
    }

    public static fcez c(fdvl fdvl0, String s, String s1) {
        fduq fduq0 = fdur.e(fdvl0, s, s1);
        return fduq0 == null ? null : fcez.b(fduq0.b.c());
    }

    public static DataItemParcelable d(fduq fduq0) {
        DataItemParcelable dataItemParcelable0 = new DataItemParcelable(fduq0.b.c);
        dataItemParcelable0.c = fduq0.b.e;
        for(Object object0: fduq0.b.b().entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            String s1 = ((fdpo)((Map.Entry)object0).getValue()).b;
            batl.s(s1);
            fdhg fdhg0 = new fdhg(s1, s);
            dataItemParcelable0.b.put(s, fdhg0);
        }
        return dataItemParcelable0;
    }

    public static fduq e(fdvl fdvl0, String s, String s1) {
        fdpl fdpl0;
        if(ffgp.k()) {
            fdpl0 = ffgp.b;
            if(fdpl0 == null) {
                return null;
            }
        }
        else {
            fdpl0 = ffgp.a;
        }
        try(Cursor cursor0 = fdvl0.c(fdpl0, new Uri.Builder().scheme("wear").authority(s).path(s1).build())) {
            cursor0.moveToFirst();
            return !cursor0.isAfterLast() ? fdur.f(cursor0) : null;
        }
    }

    public static fduq f(Cursor cursor0) {
        boolean z = true;
        String s = cursor0.getString(1);
        batl.s(s);
        String s1 = cursor0.getString(2);
        batl.s(s1);
        fduq fduq0 = new fduq(fdpl.a(s, s1));
        String s2 = cursor0.getString(7);
        batl.s(s2);
        fduq0.e = s2;
        fduq0.f = cursor0.getLong(5);
        fduq0.g = cursor0.getLong(14);
        fduq0.h = cursor0.getLong(9);
        fduq0.c = cursor0.getInt(6) != 0;
        if(cursor0.getLong(10) == 0L) {
            z = false;
        }
        fduq0.d = z;
        String s3 = cursor0.getString(3);
        batl.s(s3);
        String s4 = cursor0.getString(4);
        batl.s(s4);
        fduq0.b = new fdun(s3, s4);
        if(!fduq0.c) {
            fdun fdun0 = fduq0.b;
            fdun0.e = cursor0.getBlob(8);
        }
        String s5 = fdur.i(cursor0);
        String s6 = cursor0.getString(11);
        if(s6 != null) {
            while(s5.equals(fdur.i(cursor0))) {
                String s7 = cursor0.getString(12);
                batl.s(s7);
                if(!fduq0.c) {
                    fdun fdun1 = fduq0.b;
                    batl.s(s6);
                    fdun1.d(s6, new fdpo(null, s7, null));
                }
                if(!cursor0.moveToNext()) {
                    break;
                }
                s6 = cursor0.getString(11);
            }
            return fduq0;
        }
        cursor0.moveToNext();
        return fduq0;
    }

    public static gmcd g(fdvl fdvl0, String s, String s1) {
        fdpl fdpl0;
        if(ffgp.k()) {
            fdpl0 = ffgp.b;
            if(fdpl0 == null) {
                return gmbu.h(new IllegalStateException("LocalEdition has null AppKey"));
            }
        }
        else {
            fdpl0 = ffgp.a;
        }
        return fdvl0.j(fdpl0, new Uri.Builder().scheme("wear").authority(s).path(s1).build(), false);
    }

    public static gmcd h(fdvl fdvl0, String s, String s1, byte[] arr_b) {
        fdun fdun0 = new fdun(s, s1, true, 0L);
        fdun0.e = arr_b;
        return fdvl0.o(ffgp.a, fdun0);
    }

    static String i(Cursor cursor0) {
        String s = cursor0.getString(0);
        batl.s(s);
        return s;
    }

    public static void j(fdvl fdvl0, String s, String s1, fcez fcez0) {
        fdur.h(fdvl0, s, s1, fcez0.y());
    }
}

