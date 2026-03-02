import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Build;
import android.util.Size;
import j..util.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import jeb.synthetic.TWR;

final class bfw implements bse {
    private final brb a;

    public bfw(blp blp0) {
        this.a = new brb(blp0);
    }

    @Override  // bse
    public final Object a(Object object0) {
        byte[] arr_b5;
        byte[] arr_b6;
        int v23;
        Object object1;
        bnr bnr0;
        byte[] arr_b3;
        try {
            bsf bsf0 = ((bfv)object0).a;
            int v = bsf0.c;
            int v1 = 2;
            switch(v) {
                case 35: {
                    bcn bcn0 = (bcn)bsf0.a;
                    Rect rect0 = bsf0.e;
                    try {
                        int v2 = ((bfv)object0).b;
                        int v3 = bsf0.f;
                        if(bcn0.a() != 35) {
                            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + bcn0.a());
                        }
                        bcm bcm0 = bcn0.g()[0];
                        bcm bcm1 = bcn0.g()[1];
                        bcm bcm2 = bcn0.g()[2];
                        ByteBuffer byteBuffer0 = bcm0.c();
                        ByteBuffer byteBuffer1 = bcm1.c();
                        ByteBuffer byteBuffer2 = bcm2.c();
                        byteBuffer0.rewind();
                        byteBuffer1.rewind();
                        byteBuffer2.rewind();
                        int v4 = byteBuffer0.remaining();
                        byte[] arr_b = new byte[v4 + bcn0.c() * bcn0.b() / 2];
                        int v6 = 0;
                        for(int v5 = 0; v5 < bcn0.b(); ++v5) {
                            byteBuffer0.get(arr_b, v6, bcn0.c());
                            v6 += bcn0.c();
                            int v7 = bcm0.b();
                            byteBuffer0.position(Math.min(v4, byteBuffer0.position() - bcn0.c() + v7));
                        }
                        int v8 = bcn0.b() / 2;
                        int v9 = bcn0.c() / 2;
                        int v10 = bcm2.b();
                        int v11 = bcm1.b();
                        int v12 = bcm2.a();
                        int v13 = bcm1.a();
                        byte[] arr_b1 = new byte[v10];
                        int v14 = v6;
                        byte[] arr_b2 = new byte[v11];
                        int v15 = 0;
                        while(v15 < v8) {
                            byteBuffer2.get(arr_b1, 0, Math.min(v10, byteBuffer2.remaining()));
                            byteBuffer1.get(arr_b2, 0, Math.min(v11, byteBuffer1.remaining()));
                            int v16 = v14;
                            int v17 = 0;
                            int v19 = 0;
                            for(int v18 = 0; v18 < v9; ++v18) {
                                int v20 = v16 + 1;
                                arr_b[v16] = arr_b1[v17];
                                v16 += 2;
                                arr_b[v20] = arr_b2[v19];
                                v17 += v12;
                                v19 += v13;
                            }
                            ++v15;
                            v8 = v8;
                            v10 = v10;
                            v14 = v16;
                        }
                        YuvImage yuvImage0 = new YuvImage(arr_b, 17, bcn0.c(), bcn0.b(), null);
                        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                        bnw bnw0 = new bnw(ByteOrder.BIG_ENDIAN);
                        bnw0.b("Orientation", "1");
                        bnw0.b("XResolution", "72/1");
                        bnw0.b("YResolution", "72/1");
                        bnw0.b("ResolutionUnit", "2");
                        bnw0.b("YCbCrPositioning", "1");
                        bnw0.b("Make", Build.MANUFACTURER);
                        bnw0.b("Model", Build.MODEL);
                        if(bcn0.e() != null) {
                            bcn0.e().e(bnw0);
                        }
                        bnw0.c(v3);
                        bnw0.b("ImageWidth", String.valueOf(bcn0.c()));
                        bnw0.b("ImageLength", String.valueOf(bcn0.b()));
                        ArrayList arrayList0 = Collections.list(new bnv(bnw0));
                        if(!((Map)arrayList0.get(1)).isEmpty()) {
                            bnw0.a("ExposureProgram", "0", arrayList0);
                            bnw0.a("ExifVersion", "0230", arrayList0);
                            bnw0.a("ComponentsConfiguration", bnx.d, arrayList0);
                            bnw0.a("MeteringMode", "0", arrayList0);
                            bnw0.a("LightSource", "0", arrayList0);
                            bnw0.a("FlashpixVersion", "0100", arrayList0);
                            bnw0.a("FocalPlaneResolutionUnit", "2", arrayList0);
                            bnw0.a("FileSource", "3", arrayList0);
                            bnw0.a("SceneType", "1", arrayList0);
                            bnw0.a("CustomRendered", "0", arrayList0);
                            bnw0.a("SceneCaptureType", "0", arrayList0);
                            bnw0.a("Contrast", "0", arrayList0);
                            bnw0.a("Saturation", "0", arrayList0);
                            bnw0.a("Sharpness", "0", arrayList0);
                        }
                        if(!((Map)arrayList0.get(2)).isEmpty()) {
                            bnw0.a("GPSVersionID", "2300", arrayList0);
                            bnw0.a("GPSSpeedRef", "K", arrayList0);
                            bnw0.a("GPSTrackRef", "T", arrayList0);
                            bnw0.a("GPSImgDirectionRef", "T", arrayList0);
                            bnw0.a("GPSDestBearingRef", "T", arrayList0);
                            bnw0.a("GPSDestDistanceRef", "K", arrayList0);
                        }
                        if(!yuvImage0.compressToJpeg(rect0, v2, new bny(byteArrayOutputStream0, new bnx(bnw0.c, arrayList0)))) {
                            throw new brg();
                        }
                        arr_b3 = byteArrayOutputStream0.toByteArray();
                    }
                    catch(brg brg0) {
                        throw new bcf("Failed to encode the image to JPEG.", brg0);
                    }
                    try {
                        bnr0 = bnr.c(new ByteArrayInputStream(arr_b3));
                    }
                    catch(IOException iOException0) {
                        throw new bcf("Failed to extract Exif from YUV-generated JPEG", iOException0);
                    }
                    Size size0 = new Size(rect0.width(), rect0.height());
                    Rect rect1 = new Rect(0, 0, rect0.width(), rect0.height());
                    Matrix matrix0 = bok.f(bsf0.g, rect0);
                    object1 = new bsf(arr_b3, bnr0, 0x100, size0, rect1, bsf0.f, matrix0, bsf0.h);
                    break;
                }
                case 0x100: 
                case 0x1005: {
                    bcn bcn1 = (bcn)bsf0.a;
                    if(this.a.a == null) {
                        ByteBuffer byteBuffer4 = bcn1.g()[0].c();
                        arr_b5 = new byte[byteBuffer4.capacity()];
                        byteBuffer4.rewind();
                        byteBuffer4.get(arr_b5);
                    label_145:
                        arr_b6 = arr_b5;
                    }
                    else {
                        ByteBuffer byteBuffer3 = bcn1.g()[0].c();
                        int v21 = byteBuffer3.capacity();
                        byte[] arr_b4 = new byte[v21];
                        byteBuffer3.rewind();
                        byteBuffer3.get(arr_b4);
                        int v22 = 2;
                        while(true) {
                            if(v22 + 4 <= v21 && arr_b4[v22] == -1) {
                                goto label_136;
                            }
                            while(v1 + 1 <= v21) {
                                if(arr_b4[v1] != -1 || arr_b4[v1 + 1] != -40) {
                                    ++v1;
                                    continue;
                                }
                                v23 = v1;
                                goto label_131;
                            }
                            v23 = -1;
                        label_131:
                            if(v23 == -1) {
                                arr_b6 = arr_b4;
                                goto label_146;
                            label_136:
                                if(arr_b4[v22 + 1] != -38) {
                                    v22 += ((arr_b4[v22 + 2] & 0xFF) << 8 | arr_b4[v22 + 3] & 0xFF) + 2;
                                    continue;
                                }
                                break;
                            }
                            else {
                                arr_b5 = Arrays.copyOfRange(arr_b4, v23, byteBuffer3.limit());
                                goto label_145;
                            }
                            goto label_146;
                        }
                        arr_b5 = Arrays.copyOfRange(arr_b4, 0, byteBuffer3.limit());
                        goto label_145;
                    }
                label_146:
                    object1 = new bsf(arr_b6, ((bnr)Objects.requireNonNull(bsf0.b)), v, bsf0.d, bsf0.e, bsf0.f, bsf0.g, bsf0.h);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unexpected format: " + v);
                }
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(((bcn)((bfv)object0).a.a), throwable0);
            throw throwable0;
        }
        ((bcn)((bfv)object0).a.a).close();
        return object1;
    }
}

