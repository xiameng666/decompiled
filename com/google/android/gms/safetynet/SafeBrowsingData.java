package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ekom;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class SafeBrowsingData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public DataHolder b;
    public ParcelFileDescriptor c;
    public long d;
    public byte[] e;
    public byte[] f;
    public File g;

    static {
        SafeBrowsingData.CREATOR = new ekom();
    }

    public SafeBrowsingData() {
        this(null, null, null, 0L, null);
    }

    public SafeBrowsingData(String s) {
        this(s, null, null, 0L, null);
    }

    public SafeBrowsingData(String s, DataHolder dataHolder0, ParcelFileDescriptor parcelFileDescriptor0, long v, byte[] arr_b) {
        this.a = s;
        this.b = dataHolder0;
        this.c = parcelFileDescriptor0;
        this.d = v;
        this.e = arr_b;
    }

    private static final void a(Closeable closeable0) {
        try {
            closeable0.close();
        }
        catch(IOException unused_ex) {
        }
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        FileOutputStream fileOutputStream0;
        File file1;
        if(this.c == null && this.f != null) {
            File file0 = this.g;
            if(file0 == null) {
                fileOutputStream0 = null;
            }
            else {
                try {
                    file1 = null;
                    file1 = File.createTempFile("xlb", ".tmp", file0);
                    fileOutputStream0 = new FileOutputStream(file1);
                    this.c = ParcelFileDescriptor.open(file1, 0x10000000);
                }
                catch(IOException unused_ex) {
                    if(file1 != null) {
                        file1.delete();
                    }
                    fileOutputStream0 = null;
                    goto label_22;
                }
                catch(Throwable throwable0) {
                    if(file1 != null) {
                        file1.delete();
                    }
                    throw throwable0;
                }
                if(file1 != null) {
                    file1.delete();
                }
            }
        label_22:
            if(fileOutputStream0 == null) {
                ekom.a(this, parcel0, v);
            }
            else {
                DataOutputStream dataOutputStream0 = new DataOutputStream(new BufferedOutputStream(fileOutputStream0));
                try {
                    dataOutputStream0.writeInt(this.f.length);
                    dataOutputStream0.write(this.f);
                }
                catch(IOException unused_ex) {
                    ekom.a(this, parcel0, v);
                    goto label_39;
                }
                finally {
                    SafeBrowsingData.a(dataOutputStream0);
                }
                ekom.a(this, parcel0, v | 1);
            }
        }
        else {
            ekom.a(this, parcel0, v);
        }
    label_39:
        this.c = null;
    }
}

