import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.nearby.internal.connection.ParcelByteArray;
import com.google.android.gms.nearby.internal.connection.ParcelableFileWithMetaData;
import com.google.android.gms.nearby.internal.connection.ParcelableOneWayMessage;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;
import com.google.android.gms.nearby.internal.connection.ParcelableRequest;
import com.google.android.gms.nearby.internal.connection.ParcelableResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

public final class czho {
    public static File a;

    static Pair a(cuwu cuwu0) {
        ParcelFileDescriptor[] arr_parcelFileDescriptor1;
        ParcelFileDescriptor[] arr_parcelFileDescriptor;
        if((cuwu0 instanceof cvyh)) {
            cvye cvye0 = ((cvyh)cuwu0).v;
            cvyf cvyf0 = ((cvyh)cuwu0).t;
            cvyg cvyg0 = ((cvyh)cuwu0).u;
            int v = ((cvyh)cuwu0).s;
            if(v != 1) {
                switch(v) {
                    case 2: {
                        if(cvyg0 == null) {
                            throw new IllegalArgumentException("DctPayload is not response.");
                        }
                        if(!(cvyg0 instanceof cvyb)) {
                            throw new IllegalArgumentException("DctPayload response is not bytes response.");
                        }
                        LinkedList linkedList0 = new LinkedList();
                        for(Object object0: ((cvyb)cvyg0).a) {
                            ParcelByteArray parcelByteArray1 = new ParcelByteArray();
                            parcelByteArray1.a = (byte[])object0;
                            linkedList0.add(parcelByteArray1);
                        }
                        czhk czhk1 = new czhk();
                        czhk1.o(((cvyh)cuwu0).j);
                        czhk1.e(((cvyh)cuwu0).i);
                        czhk1.c(2);
                        ParcelableResponse parcelableResponse0 = new ParcelableResponse();
                        parcelableResponse0.a = ((cvyb)cvyg0).b;
                        parcelableResponse0.b = ((cvyb)cvyg0).c;
                        parcelableResponse0.c = ((cvyb)cvyg0).d;
                        parcelableResponse0.g = (ParcelByteArray[])gged_interceptors.i(linkedList0).toArray(new ParcelByteArray[0]);
                        parcelableResponse0.a = ((cvyb)cvyg0).b;
                        parcelableResponse0.f = ((cvyb)cvyg0).e;
                        czhk1.n(parcelableResponse0);
                        return Pair.create(czhk1.a, gfqx.a);
                    }
                    case 3: {
                        if(cvyg0 == null) {
                            throw new IllegalArgumentException("DctPayload is not response.");
                        }
                        if(!(cvyg0 instanceof cvyd)) {
                            throw new IllegalArgumentException("DctPayload response is not files response.");
                        }
                        LinkedList linkedList1 = new LinkedList();
                        for(Object object1: ((cvyd)cvyg0).a) {
                            ParcelableFileWithMetaData parcelableFileWithMetaData0 = new ParcelableFileWithMetaData();
                            parcelableFileWithMetaData0.a = (byte[])((Pair)object1).first;
                            parcelableFileWithMetaData0.b = ((cuws)((Pair)object1).second).b;
                            parcelableFileWithMetaData0.c = ((cuws)((Pair)object1).second).c;
                            parcelableFileWithMetaData0.d = ((cuws)((Pair)object1).second).d;
                            linkedList1.add(parcelableFileWithMetaData0);
                        }
                        gged_interceptors gged0 = gged_interceptors.i(linkedList1);
                        czhk czhk2 = new czhk();
                        czhk2.o(((cvyh)cuwu0).j);
                        czhk2.e(((cvyh)cuwu0).i);
                        czhk2.c(3);
                        ParcelableResponse parcelableResponse1 = new ParcelableResponse();
                        parcelableResponse1.a = ((cvyd)cvyg0).b;
                        parcelableResponse1.b = ((cvyd)cvyg0).c;
                        parcelableResponse1.c = ((cvyd)cvyg0).d;
                        parcelableResponse1.e = (ParcelableFileWithMetaData[])gged0.toArray(new ParcelableFileWithMetaData[0]);
                        parcelableResponse1.a = ((cvyd)cvyg0).b;
                        parcelableResponse1.f = ((cvyd)cvyg0).e;
                        czhk2.n(parcelableResponse1);
                        return Pair.create(czhk2.a, gfqx.a);
                    }
                    default: {
                        if(cvye0 == null) {
                            throw new IllegalArgumentException("DctPayload is not one way message.");
                        }
                        ParcelableOneWayMessage parcelableOneWayMessage0 = new ParcelableOneWayMessage();
                        parcelableOneWayMessage0.a = cvye0.a;
                        ParcelByteArray parcelByteArray0 = new ParcelByteArray();
                        parcelByteArray0.a = cvye0.b;
                        parcelableOneWayMessage0.b = parcelByteArray0;
                        czhk czhk0 = new czhk();
                        czhk0.o(((cvyh)cuwu0).j);
                        czhk0.e(((cvyh)cuwu0).i);
                        czhk0.j(parcelableOneWayMessage0);
                        czhk0.c(4);
                        return Pair.create(czhk0.a, gfqx.a);
                    }
                }
            }
            if(cvyf0 == null) {
                throw new IllegalArgumentException("DctPayload is not request.");
            }
            ParcelableRequest parcelableRequest0 = new ParcelableRequest();
            parcelableRequest0.b = cvyf0.a;
            parcelableRequest0.a = cvyf0.b;
            parcelableRequest0.c = cvyf0.c;
            czhk czhk3 = new czhk();
            czhk3.o(((cvyh)cuwu0).j);
            czhk3.e(((cvyh)cuwu0).i);
            czhk3.m(parcelableRequest0);
            czhk3.c(1);
            czho.c(czhk3, cvyf0.d);
            return Pair.create(czhk3.a, gfqx.a);
        }
        int v1 = cuwu0.j;
        switch(v1) {
            case 1: {
                czhk czhk5 = new czhk();
                czhk5.e(cuwu0.i);
                czhk5.o(cuwu0.j);
                czho.c(czhk5, cuwu0.k);
                return Pair.create(czhk5.a, gfqx.a);
            }
            case 2: {
                gftb.z(cuwu0.l, "File cannot be null for Payload.Type.FILE");
                File file0 = cuwu0.l.a;
                String s = file0 == null ? null : file0.getAbsolutePath();
                czhk czhk6 = new czhk();
                czhk6.e(cuwu0.i);
                czhk6.o(2);
                czhk6.b(cuwu0.l.b);
                czhk6.p(cuwu0.l.d);
                czhk6.g(s);
                czhk6.h(cuwu0.l.c);
                czhk6.i(cuwu0.n);
                czhk6.f(cuwu0.o);
                czhk6.l(cuwu0.p);
                czhk6.d(cuwu0.q);
                czhk6.k(cuwu0.r);
                return Pair.create(czhk6.a, gfqx.a);
            }
            default: {
                if(v1 == 3) {
                    try {
                        arr_parcelFileDescriptor = ParcelFileDescriptor.createPipe();
                        arr_parcelFileDescriptor1 = ParcelFileDescriptor.createPipe();
                    }
                    catch(IOException iOException0) {
                        Log.e("NearbyConnections", String.format("Unable to create PFD pipe for streaming payload %d from client to service.", ((long)cuwu0.i)), iOException0);
                        throw iOException0;
                    }
                    czhk czhk4 = new czhk();
                    czhk4.e(cuwu0.i);
                    czhk4.o(cuwu0.j);
                    czhk4.b(arr_parcelFileDescriptor[0]);
                    czhk4.a.g = arr_parcelFileDescriptor1[0];
                    czhk4.i(cuwu0.n);
                    czhk4.l(cuwu0.p);
                    gfsx gfsx0 = gfsx.m(Pair.create(arr_parcelFileDescriptor[1], arr_parcelFileDescriptor1[1]));
                    return Pair.create(czhk4.a, gfsx0);
                }
                IllegalArgumentException illegalArgumentException0 = new IllegalArgumentException(String.format("Outgoing Payload %d has unknown type %d", ((long)cuwu0.i), ((int)cuwu0.j)));
                Log.wtf("NearbyConnections", "Unknown payload type!", illegalArgumentException0);
                throw illegalArgumentException0;
            }
        }
    }

    static cuwu b(Context context0, ParcelablePayload parcelablePayload0) {
        ParcelableRequest parcelableRequest0 = parcelablePayload0.o;
        if(parcelableRequest0 == null && parcelablePayload0.p == null && parcelablePayload0.q == null) {
            long v = parcelablePayload0.a;
            int v1 = parcelablePayload0.b;
            if(v1 != 1) {
                switch(v1) {
                    case 2: {
                        String s = parcelablePayload0.e;
                        Uri uri0 = parcelablePayload0.h;
                        if(s != null && uri0 != null) {
                            try {
                                ParcelFileDescriptor parcelFileDescriptor0 = context0.getContentResolver().openFileDescriptor(uri0, "r");
                                if(parcelFileDescriptor0 == null) {
                                    Log.w("NearbyConnections", String.format("Failed to get ParcelFileDescriptor for %s", uri0));
                                    return null;
                                }
                                cuwu cuwu0 = cuwu.e(cuws.a(new File(ccsb.a.a(s)), parcelFileDescriptor0, parcelablePayload0.f, uri0), v);
                                if(!TextUtils.isEmpty(parcelablePayload0.n)) {
                                    cuwu0.l(parcelablePayload0.n);
                                }
                                if(!TextUtils.isEmpty(parcelablePayload0.m)) {
                                    cuwu0.j(parcelablePayload0.m);
                                }
                                return cuwu0;
                            }
                            catch(SecurityException securityException0) {
                                Log.w("NearbyConnections", String.format("Failed to create Payload from ParcelablePayload: unable to open uri %s for file %s.", uri0, s), securityException0);
                                return null;
                            }
                            catch(FileNotFoundException fileNotFoundException0) {
                                Log.w("NearbyConnections", String.format("Failed to create Payload from ParcelablePayload: unable to open uri %s for file %s.", uri0, s), fileNotFoundException0);
                                return null;
                            }
                        }
                        if(uri0 != null && parcelablePayload0.d == null) {
                            return cuwu.e(new cuws(parcelablePayload0.l, uri0), v);
                        }
                        ParcelFileDescriptor parcelFileDescriptor1 = parcelablePayload0.d;
                        gftb.z(parcelFileDescriptor1, "Data ParcelFileDescriptor cannot be null for type FILE");
                        return cuwu.e(cuws.b(parcelFileDescriptor1), v);
                    }
                    case 3: {
                        ParcelFileDescriptor parcelFileDescriptor2 = parcelablePayload0.d;
                        gftb.z(parcelFileDescriptor2, "Data ParcelFileDescriptor cannot be null for type STREAM");
                        return new cuwu(v, 3, null, null, cuwt.a(parcelFileDescriptor2));
                    }
                    default: {
                        Log.w("NearbyConnections", String.format("Incoming ParcelablePayload %d has unknown type %d", v, ((int)parcelablePayload0.b)));
                        return null;
                    }
                }
            }
            byte[] arr_b = czho.f(parcelablePayload0);
            gftb.z(arr_b, "Payload bytes cannot be null if type is BYTES.");
            return new cuwu(v, 1, arr_b, null, null);
        }
        ParcelableOneWayMessage parcelableOneWayMessage0 = parcelablePayload0.q;
        ParcelableResponse parcelableResponse0 = parcelablePayload0.p;
        int v2 = parcelablePayload0.r;
        if(v2 != 1) {
            switch(v2) {
                case 2: {
                    if(parcelableResponse0 == null) {
                        return null;
                    }
                    String s2 = parcelableResponse0.c;
                    if(s2 == null) {
                        return null;
                    }
                    long v4 = parcelablePayload0.a;
                    long v5 = parcelableResponse0.b;
                    ParcelByteArray[] arr_parcelByteArray = parcelableResponse0.g;
                    LinkedList linkedList0 = new LinkedList();
                    for(int v3 = 0; v3 < arr_parcelByteArray.length; ++v3) {
                        linkedList0.add(arr_parcelByteArray[v3].a);
                    }
                    return new cvyh(2, v4, null, new cvyb(v5, gged_interceptors.i(linkedList0), s2, parcelableResponse0.a, parcelableResponse0.f), null);
                }
                case 3: {
                    if(parcelableResponse0 == null) {
                        return null;
                    }
                    String s3 = parcelableResponse0.c;
                    if(s3 == null) {
                        return null;
                    }
                    long v6 = parcelablePayload0.a;
                    int v7 = 0;
                    long v8 = parcelableResponse0.b;
                    ParcelableFileWithMetaData[] arr_parcelableFileWithMetaData = parcelableResponse0.e;
                    LinkedList linkedList1 = new LinkedList();
                    while(v7 < arr_parcelableFileWithMetaData.length) {
                        ParcelableFileWithMetaData parcelableFileWithMetaData0 = arr_parcelableFileWithMetaData[v7];
                        Uri uri1 = parcelableFileWithMetaData0.d;
                        gftb.z(uri1, "Uri cannot be null for type FILE");
                        ParcelFileDescriptor parcelFileDescriptor3 = parcelableFileWithMetaData0.b;
                        gftb.z(parcelFileDescriptor3, "Data ParcelFileDescriptor cannot be null for type FILE");
                        byte[] arr_b2 = parcelableFileWithMetaData0.a;
                        gftb.z(arr_b2, "FileMetaData cannot be null for type FILE");
                        linkedList1.add(new cvyc(uri1, parcelFileDescriptor3, arr_b2, parcelableFileWithMetaData0.c));
                        ++v7;
                        arr_parcelableFileWithMetaData = arr_parcelableFileWithMetaData;
                        v8 = v8;
                    }
                    return new cvyh(3, v6, null, new cvyd(v8, gged_interceptors.i(linkedList1), s3, parcelableResponse0.a, parcelableResponse0.f), null);
                }
                default: {
                    if(v2 != 4) {
                        return null;
                    }
                    if(parcelableOneWayMessage0 == null) {
                        return null;
                    }
                    byte[] arr_b1 = czho.e(parcelableOneWayMessage0);
                    if(arr_b1 == null) {
                        return null;
                    }
                    String s1 = parcelableOneWayMessage0.a;
                    return s1 == null ? null : new cvyh(4, parcelablePayload0.a, null, null, new cvye(s1, arr_b1));
                }
            }
        }
        if(parcelableRequest0 == null) {
            return null;
        }
        Uri uri2 = parcelableRequest0.b;
        if(uri2 == null) {
            return null;
        }
        String s4 = parcelableRequest0.c;
        long v9 = parcelablePayload0.a;
        long v10 = parcelableRequest0.a;
        byte[] arr_b3 = czho.f(parcelablePayload0);
        if(arr_b3 == null) {
            return new cvyh(1, v9, new cvyf(uri2, v10), null, null);
        }
        if(s4 != null) {
            return new cvyh(1, v9, new cvyf(uri2, s4, arr_b3, v10), null, null);
        }
        throw new NullPointerException("Cannot create a DctPayload request from null contentType.");
    }

    public static void c(czhk czhk0, byte[] arr_b) {
        if(arr_b != null && arr_b.length > 0x8000) {
            ParcelByteArray parcelByteArray0 = new ParcelByteArray();
            parcelByteArray0.a = arr_b;
            czhk0.a.k = parcelByteArray0;
            czhk0.a(Arrays.copyOf(arr_b, 0x8000));
            return;
        }
        czhk0.a(arr_b);
    }

    public static void d(File file0) {
        if(file0 == null) {
            Log.e("NearbyConnections", "Cannot set null temp directory");
            return;
        }
        czho.a = file0;
    }

    public static byte[] e(ParcelableOneWayMessage parcelableOneWayMessage0) {
        return parcelableOneWayMessage0.b == null ? null : parcelableOneWayMessage0.b.a;
    }

    public static byte[] f(ParcelablePayload parcelablePayload0) {
        return parcelablePayload0.k == null ? parcelablePayload0.c : parcelablePayload0.k.a;
    }
}

