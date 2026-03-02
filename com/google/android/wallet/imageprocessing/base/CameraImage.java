package com.google.android.wallet.imageprocessing.base;

import MoreObjects;
import ToStringHelper;
import gftb;

public class CameraImage {
    public boolean a;
    public byte[] b;
    public int c;
    public int d;
    public int e;
    public int f;

    public CameraImage() {
        this.b = new byte[0];
        this.c = 0x80000000;
        this.f = 0x80000000;
    }

    public CameraImage(byte[] arr_b, int v, int v1, int v2, int v3) {
        boolean z = false;
        this.b = new byte[0];
        this.c = 0x80000000;
        this.f = 0x80000000;
        if(v != 16 && v != 17 && v != 0x100 && (v != 0 && v != 4)) {
            switch(v) {
                case 20: {
                    z = true;
                    break;
                }
                case 842094169: {
                    v = 842094169;
                    z = true;
                }
            }
        }
        else {
            z = true;
        }
        gftb.d(z, "Invalid format %s", v);
        this.a = true;
        this.b = arr_b;
        this.c = v;
        this.d = v1;
        this.e = v2;
        this.f = v3;
    }

    public byte[] getData() {
        gftb.r(this.a, "no data buffer allocated");
        return this.b;
    }

    public int getFormat() {
        gftb.r(this.a, "no data buffer allocated");
        return this.c;
    }

    public int getHeight() {
        gftb.r(this.a, "no data buffer allocated");
        return this.e;
    }

    public int getOrientation() {
        gftb.r(this.f != 0x80000000, "no data buffer allocated");
        return this.f;
    }

    public int getWidth() {
        gftb.r(this.a, "no data buffer allocated");
        return this.d;
    }

    @Override
    public final String toString() {
        if(this.a) {
            ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
            byte[] arr_b = this.b;
            gftb.check(arr_b);
            gfsv0.f("length", arr_b.length);
            gfsv0.f("format", this.c);
            gfsv0.f("width", this.d);
            gfsv0.f("height", this.e);
            gfsv0.f("orientation", this.f);
            return gfsv0.toString();
        }
        return "no data buffer allocated";
    }
}

