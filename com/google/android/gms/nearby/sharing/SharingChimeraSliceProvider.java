package com.google.android.gms.nearby.sharing;

import android.content.Context;
import android.net.Uri;
import android.util.ArrayMap;
import androidx.slice.Slice;
import dcvz;
import diwc;
import diwn;
import diwv;
import diww;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;
import xmj;

public class SharingChimeraSliceProvider extends xmj {
    private final Map b;

    public SharingChimeraSliceProvider() {
        this.b = new ArrayMap();
    }

    @Override  // xmj
    public final Slice a(Uri uri0) {
        synchronized(this) {
            diww diww0 = this.e(uri0);
            if(diww0 != null) {
                return diww0.a(uri0);
            }
            dcvz.a.b().p("onBindSlice failed since slice uri does not match", new Object[0]);
        }
        return null;
    }

    @Override  // xmj
    public final void b(Uri uri0) {
        synchronized(this) {
            diww diww0 = this.e(uri0);
            if(diww0 != null) {
                diww0.jK(uri0);
                return;
            }
            dcvz.a.b().p("onSlicePinned failed since slice uri does not match", new Object[0]);
        }
    }

    @Override  // xmj
    public final void c(Uri uri0) {
        synchronized(this) {
            diww diww0 = this.e(uri0);
            if(diww0 != null) {
                diww0.jL(uri0);
                return;
            }
            dcvz.a.b().p("onSliceUnpinned failed since slice uri does not match", new Object[0]);
        }
    }

    @Override  // xmj
    public final void d() {
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final void dump(FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        super.dump(fileDescriptor0, printWriter0, arr_s);
        printWriter0.write("\n");
        printWriter0.write(String.format("%s\n", "com.google.android.gms.nearby.sharing.SharingSliceProvider"));
        for(Object object0: this.b.values()) {
            ((diww)object0).g(printWriter0);
        }
        printWriter0.flush();
    }

    private final diww e(Uri uri0) {
        Map map0 = this.b;
        diww diww0 = (diww)map0.get(uri0);
        if(diww0 == null) {
            Context context0 = this.getContext();
            if(context0 == null) {
                dcvz.a.e().p("SliceProvider creating failed since context is null", new Object[0]);
                return null;
            }
            if(diww.e.equals(uri0)) {
                diww0 = new diwv(context0);
            }
            if(diww.f.equals(uri0)) {
                diww0 = new diwn(context0);
            }
            if(diww.g.equals(uri0)) {
                diww0 = new diwc(context0);
            }
            if(diww0 != null) {
                map0.put(uri0, diww0);
            }
        }
        return diww0;
    }
}

