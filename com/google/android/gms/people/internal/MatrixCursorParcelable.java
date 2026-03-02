package com.google.android.gms.people.internal;

import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import eggz;
import jeb.synthetic.TWR;

public class MatrixCursorParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final Cursor a;
    private final int b;

    static {
        MatrixCursorParcelable.CREATOR = new eggz();
    }

    public MatrixCursorParcelable(Cursor cursor0) {
        this.a = cursor0;
        this.b = cursor0 == null ? 0 : cursor0.getCount();
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        Cursor cursor0 = this.a;
        if(cursor0 != null) {
            try {
                int v1 = cursor0.getColumnCount();
                parcel0.writeInt(v1);
                parcel0.writeStringArray(cursor0.getColumnNames());
                parcel0.writeInt(this.b);
                cursor0.moveToPosition(-1);
                while(cursor0.moveToNext()) {
                    Object[] arr_object = new Object[v1];
                    for(int v2 = 0; v2 < v1; ++v2) {
                        switch(cursor0.getType(v2)) {
                            case 0: {
                                arr_object[v2] = null;
                                break;
                            }
                            case 1: {
                                arr_object[v2] = cursor0.getInt(v2);
                                break;
                            }
                            case 2: {
                                arr_object[v2] = cursor0.getFloat(v2);
                                break;
                            }
                            case 3: {
                                arr_object[v2] = cursor0.getString(v2);
                                break;
                            }
                            case 4: {
                                arr_object[v2] = cursor0.getBlob(v2);
                            }
                        }
                    }
                    parcel0.writeArray(arr_object);
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(this.a, throwable0);
                throw throwable0;
            }
            this.a.close();
            return;
        }
        parcel0.writeInt(0);
        parcel0.writeStringArray(new String[0]);
        parcel0.writeInt(0);
    }
}

