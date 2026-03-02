package com.google.android.gms.common.data;

import a;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import bakr;
import baks;
import bakt;
import baku;
import batl;
import baub;
import bbhy;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Map;
import jeb.synthetic.TWR;

public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator CREATOR;
    public static final baks a;
    final int b;
    public final String[] c;
    public Bundle d;
    public final CursorWindow[] e;
    public final int f;
    public final Bundle g;
    int[] h;
    public int i;
    boolean j;
    private boolean k;

    static {
        DataHolder.CREATOR = new baku();
        DataHolder.a = new bakr(new String[0]);
    }

    public DataHolder(int v, String[] arr_s, CursorWindow[] arr_cursorWindow, int v1, Bundle bundle0) {
        this.j = false;
        this.k = true;
        this.b = v;
        this.c = arr_s;
        this.e = arr_cursorWindow;
        this.f = v1;
        this.g = bundle0;
    }

    public DataHolder(Cursor cursor0) {
        int v1;
        bbhy bbhy0 = new bbhy(cursor0);
        String[] arr_s = bbhy0.getColumnNames();
        ArrayList arrayList0 = new ArrayList();
        try {
            int v = bbhy0.getCount();
            CursorWindow cursorWindow0 = bbhy0.getWindow();
            if(cursorWindow0 != null && cursorWindow0.getStartPosition() == 0) {
                cursorWindow0.acquireReference();
                bbhy0.a();
                arrayList0.add(cursorWindow0);
                v1 = cursorWindow0.getNumRows();
            }
            else {
                v1 = 0;
            }
            while(v1 < v && bbhy0.moveToPosition(v1)) {
                CursorWindow cursorWindow1 = bbhy0.getWindow();
                if(cursorWindow1 == null) {
                    cursorWindow1 = new CursorWindow(false);
                    cursorWindow1.setStartPosition(v1);
                    bbhy0.fillWindow(v1, cursorWindow1);
                }
                else {
                    cursorWindow1.acquireReference();
                    bbhy0.a();
                }
                if(cursorWindow1.getNumRows() == 0) {
                    break;
                }
                arrayList0.add(cursorWindow1);
                v1 = cursorWindow1.getStartPosition() + cursorWindow1.getNumRows();
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(bbhy0, throwable0);
            throw throwable0;
        }
        bbhy0.close();
        this(arr_s, ((CursorWindow[])arrayList0.toArray(new CursorWindow[arrayList0.size()])), 0, null);
    }

    public DataHolder(baks baks0, int v) {
        CursorWindow[] arr_cursorWindow = DataHolder.i(baks0);
        this(baks0.a, arr_cursorWindow, v, null);
    }

    public DataHolder(baks baks0, int v, Bundle bundle0) {
        CursorWindow[] arr_cursorWindow = DataHolder.i(baks0);
        this(baks0.a, arr_cursorWindow, v, bundle0);
    }

    public DataHolder(String[] arr_s, CursorWindow[] arr_cursorWindow, int v, Bundle bundle0) {
        this.j = false;
        this.k = true;
        this.b = 1;
        batl.s(arr_s);
        this.c = arr_s;
        batl.s(arr_cursorWindow);
        this.e = arr_cursorWindow;
        this.f = v;
        this.g = bundle0;
        this.d();
    }

    public final int a(int v) {
        int v2;
        int v1 = 0;
        batl.l(v >= 0 && v < this.i);
        while(true) {
            int[] arr_v = this.h;
            v2 = arr_v.length;
            if(v1 >= v2) {
                break;
            }
            if(v < arr_v[v1]) {
                --v1;
                return v1 == v2 ? v1 - 1 : v1;
            }
            ++v1;
        }
        return v1 == v2 ? v1 - 1 : v1;
    }

    public final String b(String s, int v, int v1) {
        this.c(s, v);
        return this.e[v1].getString(v, this.d.getInt(s));
    }

    public final void c(String s, int v) {
        if(this.d == null || !this.d.containsKey(s)) {
            throw new IllegalArgumentException("No such column: " + s);
        }
        if(this.g()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if(v >= 0 && v < this.i) {
            return;
        }
        throw new CursorIndexOutOfBoundsException(v, this.i);
    }

    @Override
    public final void close() {
        synchronized(this) {
            if(!this.j) {
                this.j = true;
                for(int v1 = 0; true; ++v1) {
                    CursorWindow[] arr_cursorWindow = this.e;
                    if(v1 >= arr_cursorWindow.length) {
                        break;
                    }
                    arr_cursorWindow[v1].close();
                }
            }
        }
    }

    public final void d() {
        this.d = new Bundle();
        for(int v1 = 0; true; ++v1) {
            String[] arr_s = this.c;
            if(v1 >= arr_s.length) {
                break;
            }
            this.d.putInt(arr_s[v1], v1);
        }
        CursorWindow[] arr_cursorWindow = this.e;
        this.h = new int[arr_cursorWindow.length];
        int v2 = 0;
        for(int v = 0; v < arr_cursorWindow.length; ++v) {
            this.h[v] = v2;
            int v3 = v2 - arr_cursorWindow[v].getStartPosition();
            v2 += arr_cursorWindow[v].getNumRows() - v3;
        }
        this.i = v2;
    }

    public final boolean e(String s) {
        return this.d.containsKey(s);
    }

    public final boolean f(String s, int v, int v1) {
        this.c(s, v);
        return this.e[v1].isNull(v, this.d.getInt(s));
    }

    @Override
    protected final void finalize() {
        try {
            if(this.k && this.e.length > 0 && !this.g()) {
                this.close();
                Log.e("DataBuffer", a.b(this, "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ", ")"));
            }
        }
        finally {
            super.finalize();
        }
    }

    public final boolean g() {
        synchronized(this) {
        }
        return this.j;
    }

    public final byte[] h(String s, int v, int v1) {
        this.c(s, v);
        return this.e[v1].getBlob(v, this.d.getInt(s));
    }

    private static CursorWindow[] i(baks baks0) {
        String[] arr_s = baks0.a;
        if(arr_s.length != 0) {
            ArrayList arrayList0 = baks0.b;
            int v1 = arrayList0.size();
            CursorWindow cursorWindow0 = new CursorWindow(false);
            ArrayList arrayList1 = new ArrayList();
            arrayList1.add(cursorWindow0);
            cursorWindow0.setNumColumns(arr_s.length);
            int v2 = 0;
            boolean z = false;
            while(v2 < v1) {
                try {
                    if(!cursorWindow0.allocRow()) {
                        cursorWindow0 = new CursorWindow(false);
                        cursorWindow0.setStartPosition(v2);
                        cursorWindow0.setNumColumns(arr_s.length);
                        arrayList1.add(cursorWindow0);
                        if(!cursorWindow0.allocRow()) {
                            Log.e("DataHolder", "Unable to allocate row to hold data.");
                            arrayList1.remove(cursorWindow0);
                            return (CursorWindow[])arrayList1.toArray(new CursorWindow[arrayList1.size()]);
                        }
                    }
                    Map map0 = (Map)arrayList0.get(v2);
                    int v3 = 0;
                    boolean z1 = true;
                    while(v3 < arr_s.length) {
                        if(z1) {
                            String s = arr_s[v3];
                            Object object0 = map0.get(s);
                            if(object0 == null) {
                                z1 = cursorWindow0.putNull(v2, v3);
                            }
                            else if((object0 instanceof String)) {
                                z1 = cursorWindow0.putString(((String)object0), v2, v3);
                            }
                            else if((object0 instanceof Long)) {
                                z1 = cursorWindow0.putLong(((Long)object0).longValue(), v2, v3);
                            }
                            else if((object0 instanceof Integer)) {
                                z1 = cursorWindow0.putLong(((long)(((int)(((Integer)object0))))), v2, v3);
                            }
                            else if((object0 instanceof Boolean)) {
                                z1 = cursorWindow0.putLong((((Boolean)object0).booleanValue() ? 1L : 0L), v2, v3);
                            }
                            else if((object0 instanceof byte[])) {
                                z1 = cursorWindow0.putBlob(((byte[])object0), v2, v3);
                            }
                            else if((object0 instanceof Double)) {
                                z1 = cursorWindow0.putDouble(((Double)object0).doubleValue(), v2, v3);
                            }
                            else {
                                if(!(object0 instanceof Float)) {
                                    throw new IllegalArgumentException(a.q(s, object0, "Unsupported object for column ", ": "));
                                }
                                z1 = cursorWindow0.putDouble(((double)(((float)(((Float)object0))))), v2, v3);
                            }
                            ++v3;
                            continue;
                        }
                        else {
                            goto label_55;
                        }
                        break;
                    }
                    if(z1) {
                        z = false;
                    }
                    else {
                    label_55:
                        if(z) {
                            throw new bakt();
                        }
                        cursorWindow0.freeLastRow();
                        cursorWindow0 = new CursorWindow(false);
                        cursorWindow0.setStartPosition(v2);
                        cursorWindow0.setNumColumns(arr_s.length);
                        arrayList1.add(cursorWindow0);
                        --v2;
                        z = true;
                    }
                    ++v2;
                }
                catch(RuntimeException runtimeException0) {
                    int v4 = arrayList1.size();
                    for(int v = 0; v < v4; ++v) {
                        ((CursorWindow)arrayList1.get(v)).close();
                    }
                    throw runtimeException0;
                }
            }
            return (CursorWindow[])arrayList1.toArray(new CursorWindow[arrayList1.size()]);
        }
        return new CursorWindow[0];
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.w(parcel0, 1, this.c, false);
        baub.J(parcel0, 2, this.e, v);
        baub.o(parcel0, 3, this.f);
        baub.g(parcel0, 4, this.g, false);
        baub.o(parcel0, 1000, this.b);
        baub.c(parcel0, v1);
        if((v & 1) != 0) {
            this.close();
        }
    }
}

