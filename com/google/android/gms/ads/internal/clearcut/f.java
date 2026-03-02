package com.google.android.gms.ads.internal.clearcut;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.clearcut.a;
import com.google.android.gms.ads.internal.util.client.h;
import j..util.Objects;

public final class f {
    public int a;
    final g b;
    private final byte[] c;

    public f(g g0, byte[] arr_b) {
        Objects.requireNonNull(g0);
        this.b = g0;
        super();
        this.c = arr_b;
    }

    // Detected as a lambda impl.
    public final void a() {
        synchronized(this) {
            try {
                g g0 = this.b;
                if(g0.a) {
                    a a0 = g0.c;
                    Parcel parcel0 = a0.jo();
                    parcel0.writeByteArray(this.c);
                    a0.jp(5, parcel0);
                    a a1 = g0.c;
                    Parcel parcel1 = a1.jo();
                    parcel1.writeInt(0);
                    a1.jp(6, parcel1);
                    a a2 = g0.c;
                    int v1 = this.a;
                    Parcel parcel2 = a2.jo();
                    parcel2.writeInt(v1);
                    a2.jp(7, parcel2);
                    a a3 = g0.c;
                    Parcel parcel3 = a3.jo();
                    parcel3.writeIntArray(null);
                    a3.jp(4, parcel3);
                    g0.c.jp(3, g0.c.jo());
                }
            }
            catch(RemoteException remoteException0) {
                h.e("Clearcut log failed", remoteException0);
            }
        }
    }

    public final void b() {
        synchronized(this) {
            e e0 = () -> synchronized(this) {
                try {
                    g g0 = this.b;
                    if(g0.a) {
                        a a0 = g0.c;
                        Parcel parcel0 = a0.jo();
                        parcel0.writeByteArray(this.c);
                        a0.jp(5, parcel0);
                        a a1 = g0.c;
                        Parcel parcel1 = a1.jo();
                        parcel1.writeInt(0);
                        a1.jp(6, parcel1);
                        a a2 = g0.c;
                        int v1 = this.a;
                        Parcel parcel2 = a2.jo();
                        parcel2.writeInt(v1);
                        a2.jp(7, parcel2);
                        a a3 = g0.c;
                        Parcel parcel3 = a3.jo();
                        parcel3.writeIntArray(null);
                        a3.jp(4, parcel3);
                        g0.c.jp(3, g0.c.jo());
                    }
                }
                catch(RemoteException remoteException0) {
                    h.e("Clearcut log failed", remoteException0);
                }
            };
            this.b.b.execute(e0);
        }
    }
}

