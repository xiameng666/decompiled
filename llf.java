import android.content.res.AssetManager.AssetInputStream;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import j..util.DesugarCollections;
import j..util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import jeb.synthetic.TWR;

public final class llf {
    private static final byte[] A;
    private static final byte[] B;
    private static final byte[] C;
    private static final byte[] D;
    private static final SimpleDateFormat E;
    private static final lld[] F;
    private static final lld[] G;
    private static final lld[] H;
    private static final lld[] I;
    private static final lld[] J;
    private static final lld K;
    private static final lld[] L;
    private static final lld[] M;
    private static final lld[] N;
    private static final lld[] O;
    private static final lld[] P;
    private static final HashMap[] Q;
    private static final HashMap[] R;
    private static final Set S;
    private static final HashMap T;
    private static final Pattern U;
    private static final Pattern V;
    private static final Pattern W;
    private AssetManager.AssetInputStream X;
    private final HashMap[] Y;
    private final Set Z;
    public static final int[] a;
    private ByteOrder aa;
    private int ab;
    private int ac;
    private int ad;
    public static final int[] b;
    static final byte[] c;
    public static final byte[] d;
    public static final byte[] e;
    public static final SimpleDateFormat f;
    public static final String[] g;
    public static final int[] h;
    public static final byte[] i;
    static final lld[][] j;
    public static final Charset k;
    public static final byte[] l;
    public static final byte[] m;
    public String n;
    public FileDescriptor o;
    public int p;
    public boolean q;
    public boolean r;
    public int s;
    public llc t;
    private static final byte[] u;
    private static final byte[] v;
    private static final byte[] w;
    private static final byte[] x;
    private static final byte[] y;
    private static final byte[] z;

    static {
        Integer integer0 = (int)1;
        Integer integer1 = (int)3;
        Integer integer2 = (int)8;
        Arrays.asList(new Integer[]{integer0, ((int)6), integer1, integer2});
        Integer integer3 = (int)2;
        Integer integer4 = (int)7;
        Integer integer5 = (int)5;
        Arrays.asList(new Integer[]{integer3, integer4, ((int)4), integer5});
        llf.a = new int[]{8, 8, 8};
        llf.b = new int[]{8};
        llf.c = new byte[]{-1, -40, -1};
        llf.u = new byte[]{102, 0x74, 0x79, 0x70};
        llf.v = new byte[]{109, 105, 102, 49};
        llf.w = new byte[]{104, 101, 105, 99};
        llf.x = new byte[]{97, 0x76, 105, 102};
        llf.y = new byte[]{97, 0x76, 105, 0x73};
        llf.z = new byte[]{0x4F, 76, 89, 77, 80, 0};
        llf.A = new byte[]{0x4F, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        llf.d = new byte[]{(byte)0x89, 80, 78, 71, 13, 10, 26, 10};
        llf.e = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        llf.B = new byte[]{82, 73, 70, 70};
        llf.C = new byte[]{87, 69, 66, 80};
        llf.D = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        llf.g = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        llf.h = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        llf.i = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        lld[] arr_lld = {new lld("NewSubfileType", 0xFE, 4), new lld("SubfileType", 0xFF, 4), new lld("ImageWidth", 0x100, 3, 4), new lld("ImageLength", 0x101, 3, 4), new lld("BitsPerSample", 0x102, 3), new lld("Compression", 0x103, 3), new lld("PhotometricInterpretation", 0x106, 3), new lld("ImageDescription", 270, 2), new lld("Make", 0x10F, 2), new lld("Model", 0x110, 2), new lld("StripOffsets", 273, 3, 4), new lld("Orientation", 274, 3), new lld("SamplesPerPixel", 277, 3), new lld("RowsPerStrip", 278, 3, 4), new lld("StripByteCounts", 279, 3, 4), new lld("XResolution", 282, 5), new lld("YResolution", 283, 5), new lld("PlanarConfiguration", 284, 3), new lld("ResolutionUnit", 296, 3), new lld("TransferFunction", 301, 3), new lld("Software", 305, 2), new lld("DateTime", 306, 2), new lld("Artist", 315, 2), new lld("WhitePoint", 318, 5), new lld("PrimaryChromaticities", 0x13F, 5), new lld("SubIFDPointer", 330, 4), new lld("JPEGInterchangeFormat", 0x201, 4), new lld("JPEGInterchangeFormatLength", 0x202, 4), new lld("YCbCrCoefficients", 529, 5), new lld("YCbCrSubSampling", 530, 3), new lld("YCbCrPositioning", 531, 3), new lld("ReferenceBlackWhite", 532, 5), new lld("Copyright", 0x8298, 2), new lld("ExifIFDPointer", 0x8769, 4), new lld("GPSInfoIFDPointer", 0x8825, 4), new lld("SensorTopBorder", 4, 4), new lld("SensorLeftBorder", 5, 4), new lld("SensorBottomBorder", 6, 4), new lld("SensorRightBorder", 7, 4), new lld("ISO", 23, 3), new lld("JpgFromRaw", 46, 7), new lld("Xmp", 700, 1)};
        llf.F = arr_lld;
        lld[] arr_lld1 = {new lld("ExposureTime", 0x829A, 5), new lld("FNumber", 0x829D, 5), new lld("ExposureProgram", 34850, 3), new lld("SpectralSensitivity", 0x8824, 2), new lld("PhotographicSensitivity", 0x8827, 3), new lld("OECF", 0x8828, 7), new lld("SensitivityType", 0x8830, 3), new lld("StandardOutputSensitivity", 0x8831, 4), new lld("RecommendedExposureIndex", 0x8832, 4), new lld("ISOSpeed", 0x8833, 4), new lld("ISOSpeedLatitudeyyy", 0x8834, 4), new lld("ISOSpeedLatitudezzz", 0x8835, 4), new lld("ExifVersion", 0x9000, 2), new lld("DateTimeOriginal", 0x9003, 2), new lld("DateTimeDigitized", 0x9004, 2), new lld("OffsetTime", 0x9010, 2), new lld("OffsetTimeOriginal", 0x9011, 2), new lld("OffsetTimeDigitized", 0x9012, 2), new lld("ComponentsConfiguration", 0x9101, 7), new lld("CompressedBitsPerPixel", 0x9102, 5), new lld("ShutterSpeedValue", 0x9201, 10), new lld("ApertureValue", 0x9202, 5), new lld("BrightnessValue", 0x9203, 10), new lld("ExposureBiasValue", 0x9204, 10), new lld("MaxApertureValue", 0x9205, 5), new lld("SubjectDistance", 0x9206, 5), new lld("MeteringMode", 0x9207, 3), new lld("LightSource", 0x9208, 3), new lld("Flash", 0x9209, 3), new lld("FocalLength", 0x920A, 5), new lld("SubjectArea", 0x9214, 3), new lld("MakerNote", 37500, 7), new lld("UserComment", 37510, 7), new lld("SubSecTime", 0x9290, 2), new lld("SubSecTimeOriginal", 0x9291, 2), new lld("SubSecTimeDigitized", 0x9292, 2), new lld("FlashpixVersion", 0xA000, 7), new lld("ColorSpace", 0xA001, 3), new lld("PixelXDimension", 0xA002, 3, 4), new lld("PixelYDimension", 0xA003, 3, 4), new lld("RelatedSoundFile", 0xA004, 2), new lld("InteroperabilityIFDPointer", 0xA005, 4), new lld("FlashEnergy", 0xA20B, 5), new lld("SpatialFrequencyResponse", 0xA20C, 7), new lld("FocalPlaneXResolution", 0xA20E, 5), new lld("FocalPlaneYResolution", 0xA20F, 5), new lld("FocalPlaneResolutionUnit", 0xA210, 3), new lld("SubjectLocation", 0xA214, 3), new lld("ExposureIndex", 0xA215, 5), new lld("SensingMethod", 0xA217, 3), new lld("FileSource", 0xA300, 7), new lld("SceneType", 0xA301, 7), new lld("CFAPattern", 0xA302, 7), new lld("CustomRendered", 0xA401, 3), new lld("ExposureMode", 0xA402, 3), new lld("WhiteBalance", 0xA403, 3), new lld("DigitalZoomRatio", 0xA404, 5), new lld("FocalLengthIn35mmFilm", 0xA405, 3), new lld("SceneCaptureType", 0xA406, 3), new lld("GainControl", 0xA407, 3), new lld("Contrast", 0xA408, 3), new lld("Saturation", 0xA409, 3), new lld("Sharpness", 0xA40A, 3), new lld("DeviceSettingDescription", 0xA40B, 7), new lld("SubjectDistanceRange", 0xA40C, 3), new lld("ImageUniqueID", 0xA420, 2), new lld("CameraOwnerName", 0xA430, 2), new lld("BodySerialNumber", 42033, 2), new lld("LensSpecification", 42034, 5), new lld("LensMake", 42035, 2), new lld("LensModel", 42036, 2), new lld("Gamma", 0xA500, 5), new lld("DNGVersion", 50706, 1), new lld("DefaultCropSize", 50720, 3, 4)};
        llf.G = arr_lld1;
        lld[] arr_lld2 = {new lld("GPSVersionID", 0, 1), new lld("GPSLatitudeRef", 1, 2), new lld("GPSLatitude", 2, 5, 10), new lld("GPSLongitudeRef", 3, 2), new lld("GPSLongitude", 4, 5, 10), new lld("GPSAltitudeRef", 5, 1), new lld("GPSAltitude", 6, 5), new lld("GPSTimeStamp", 7, 5), new lld("GPSSatellites", 8, 2), new lld("GPSStatus", 9, 2), new lld("GPSMeasureMode", 10, 2), new lld("GPSDOP", 11, 5), new lld("GPSSpeedRef", 12, 2), new lld("GPSSpeed", 13, 5), new lld("GPSTrackRef", 14, 2), new lld("GPSTrack", 15, 5), new lld("GPSImgDirectionRef", 16, 2), new lld("GPSImgDirection", 17, 5), new lld("GPSMapDatum", 18, 2), new lld("GPSDestLatitudeRef", 19, 2), new lld("GPSDestLatitude", 20, 5), new lld("GPSDestLongitudeRef", 21, 2), new lld("GPSDestLongitude", 22, 5), new lld("GPSDestBearingRef", 23, 2), new lld("GPSDestBearing", 24, 5), new lld("GPSDestDistanceRef", 25, 2), new lld("GPSDestDistance", 26, 5), new lld("GPSProcessingMethod", 27, 7), new lld("GPSAreaInformation", 28, 7), new lld("GPSDateStamp", 29, 2), new lld("GPSDifferential", 30, 3), new lld("GPSHPositioningError", 0x1F, 5)};
        llf.H = arr_lld2;
        lld[] arr_lld3 = {new lld("InteroperabilityIndex", 1, 2)};
        llf.I = arr_lld3;
        lld[] arr_lld4 = {new lld("NewSubfileType", 0xFE, 4), new lld("SubfileType", 0xFF, 4), new lld("ThumbnailImageWidth", 0x100, 3, 4), new lld("ThumbnailImageLength", 0x101, 3, 4), new lld("BitsPerSample", 0x102, 3), new lld("Compression", 0x103, 3), new lld("PhotometricInterpretation", 0x106, 3), new lld("ImageDescription", 270, 2), new lld("Make", 0x10F, 2), new lld("Model", 0x110, 2), new lld("StripOffsets", 273, 3, 4), new lld("ThumbnailOrientation", 274, 3), new lld("SamplesPerPixel", 277, 3), new lld("RowsPerStrip", 278, 3, 4), new lld("StripByteCounts", 279, 3, 4), new lld("XResolution", 282, 5), new lld("YResolution", 283, 5), new lld("PlanarConfiguration", 284, 3), new lld("ResolutionUnit", 296, 3), new lld("TransferFunction", 301, 3), new lld("Software", 305, 2), new lld("DateTime", 306, 2), new lld("Artist", 315, 2), new lld("WhitePoint", 318, 5), new lld("PrimaryChromaticities", 0x13F, 5), new lld("SubIFDPointer", 330, 4), new lld("JPEGInterchangeFormat", 0x201, 4), new lld("JPEGInterchangeFormatLength", 0x202, 4), new lld("YCbCrCoefficients", 529, 5), new lld("YCbCrSubSampling", 530, 3), new lld("YCbCrPositioning", 531, 3), new lld("ReferenceBlackWhite", 532, 5), new lld("Copyright", 0x8298, 2), new lld("ExifIFDPointer", 0x8769, 4), new lld("GPSInfoIFDPointer", 0x8825, 4), new lld("DNGVersion", 50706, 1), new lld("DefaultCropSize", 50720, 3, 4)};
        llf.J = arr_lld4;
        llf.K = new lld("StripOffsets", 273, 3);
        lld[] arr_lld5 = {new lld("ThumbnailImage", 0x100, 7), new lld("CameraSettingsIFDPointer", 0x2020, 4), new lld("ImageProcessingIFDPointer", 0x2040, 4)};
        llf.L = arr_lld5;
        lld[] arr_lld6 = {new lld("PreviewImageStart", 0x101, 4), new lld("PreviewImageLength", 0x102, 4)};
        llf.M = arr_lld6;
        lld[] arr_lld7 = {new lld("AspectFrame", 4371, 3)};
        llf.N = arr_lld7;
        lld[] arr_lld8 = {new lld("ColorSpace", 55, 3)};
        llf.O = arr_lld8;
        llf.j = new lld[][]{arr_lld, arr_lld1, arr_lld2, arr_lld3, arr_lld4, arr_lld, arr_lld5, arr_lld6, arr_lld7, arr_lld8};
        llf.P = new lld[]{new lld("SubIFDPointer", 330, 4), new lld("ExifIFDPointer", 0x8769, 4), new lld("GPSInfoIFDPointer", 0x8825, 4), new lld("InteroperabilityIFDPointer", 0xA005, 4), new lld("CameraSettingsIFDPointer", 0x2020, 1), new lld("ImageProcessingIFDPointer", 0x2040, 1)};
        llf.Q = new HashMap[10];
        llf.R = new HashMap[10];
        llf.S = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance"})));
        llf.T = new HashMap();
        Charset charset0 = Charset.forName("US-ASCII");
        llf.k = charset0;
        llf.l = "Exif\u0000\u0000".getBytes(charset0);
        llf.m = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charset0);
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        llf.f = simpleDateFormat0;
        simpleDateFormat0.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        llf.E = simpleDateFormat1;
        simpleDateFormat1.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        for(int v = 0; true; ++v) {
            lld[][] arr2_lld = llf.j;
            if(v >= 10) {
                break;
            }
            llf.Q[v] = new HashMap();
            llf.R[v] = new HashMap();
            lld[] arr_lld9 = arr2_lld[v];
            for(int v1 = 0; v1 < arr_lld9.length; ++v1) {
                lld lld0 = arr_lld9[v1];
                llf.Q[v].put(Integer.valueOf(lld0.a), lld0);
                llf.R[v].put(lld0.b, lld0);
            }
        }
        llf.T.put(Integer.valueOf(llf.P[0].a), integer5);
        llf.T.put(Integer.valueOf(llf.P[1].a), integer0);
        llf.T.put(Integer.valueOf(llf.P[2].a), integer3);
        llf.T.put(Integer.valueOf(llf.P[3].a), integer1);
        llf.T.put(Integer.valueOf(llf.P[4].a), integer4);
        llf.T.put(Integer.valueOf(llf.P[5].a), integer2);
        llf.U = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        llf.V = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        llf.W = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    }

    public llf(InputStream inputStream0) {
        this.Y = new HashMap[10];
        this.Z = new HashSet(10);
        this.aa = ByteOrder.BIG_ENDIAN;
        if(inputStream0 == null) {
            throw new NullPointerException("inputStream cannot be null");
        }
        FileDescriptor fileDescriptor0 = null;
        this.n = null;
        if((inputStream0 instanceof AssetManager.AssetInputStream)) {
            this.X = (AssetManager.AssetInputStream)inputStream0;
            this.o = null;
        }
        else {
            if((inputStream0 instanceof FileInputStream) && llf.v(((FileInputStream)inputStream0).getFD())) {
                this.X = null;
                fileDescriptor0 = ((FileInputStream)inputStream0).getFD();
            }
            else {
                this.X = null;
            }
            this.o = fileDescriptor0;
        }
        this.o(inputStream0);
    }

    public llf(String s) {
        FileInputStream fileInputStream1;
        FileInputStream fileInputStream0;
        this.Y = new HashMap[10];
        this.Z = new HashSet(10);
        this.aa = ByteOrder.BIG_ENDIAN;
        if(s == null) {
            throw new NullPointerException("filename cannot be null");
        }
        try {
            fileInputStream0 = null;
            this.X = null;
            this.n = s;
            fileInputStream1 = new FileInputStream(s);
        }
        catch(Throwable throwable0) {
            llg.a(fileInputStream0);
            throw throwable0;
        }
        try {
            this.o = llf.v(fileInputStream1.getFD()) ? fileInputStream1.getFD() : null;
            this.o(fileInputStream1);
        }
        catch(Throwable throwable0) {
            fileInputStream0 = fileInputStream1;
            llg.a(fileInputStream0);
            throw throwable0;
        }
        llg.a(fileInputStream1);
    }

    private static final int A(byte[] arr_b) {
        boolean z2;
        boolean z1;
        boolean z;
        long v3;
        byte[] arr_b2;
        long v1;
        long v;
        llb llb0 = null;
        try {
            llb0 = new llb(arr_b);
            v = (long)llb0.readInt();
            byte[] arr_b1 = new byte[4];
            llb0.readFully(arr_b1);
            if(!Arrays.equals(arr_b1, llf.u)) {
                goto label_6;
            }
            goto label_8;
        }
        catch(Exception unused_ex) {
            goto label_41;
        }
        catch(Throwable throwable0) {
            goto label_45;
        }
    label_6:
        llb0.close();
        return 0;
    label_8:
        if(Long.compare(v, 1L) == 0) {
            try {
                v1 = 16L;
                v = llb0.readLong();
                if(v < 16L) {
                    goto label_12;
                }
                goto label_15;
            }
            catch(Exception unused_ex) {
                goto label_41;
            }
            catch(Throwable throwable0) {
                goto label_45;
            }
        label_12:
            llb0.close();
            return 0;
        }
        else {
            v1 = 8L;
        }
    label_15:
        if(v > 5000L) {
            v = 5000L;
        }
        long v2 = v - v1;
        if(v2 < 8L) {
            llb0.close();
            return 0;
        }
        try {
            arr_b2 = new byte[4];
            v3 = 0L;
            z = false;
            z1 = false;
            z2 = false;
        }
        catch(Exception unused_ex) {
            goto label_41;
        }
        catch(Throwable throwable0) {
            goto label_45;
        }
        while(v3 < v2 >> 2) {
            try {
                llb0.readFully(arr_b2);
                goto label_31;
            }
            catch(EOFException unused_ex) {
                llb0.close();
                return 0;
            label_31:
                if(v3 != 1L) {
                    try {
                        if(Arrays.equals(arr_b2, llf.v)) {
                            z = true;
                        }
                        else if(Arrays.equals(arr_b2, llf.w)) {
                            z1 = true;
                        }
                        else if(Arrays.equals(arr_b2, llf.x) || Arrays.equals(arr_b2, llf.y)) {
                            z2 = true;
                        }
                        goto label_47;
                    }
                    catch(Exception unused_ex) {
                        goto label_41;
                    }
                    catch(Throwable throwable0) {
                        goto label_45;
                    }
                }
                goto label_54;
            }
            catch(Exception unused_ex) {
            label_41:
                if(llb0 != null) {
                    llb0.close();
                }
                return 0;
            }
            catch(Throwable throwable0) {
            label_45:
                TWR.safeClose$NT(llb0, throwable0);
                throw throwable0;
            }
        label_47:
            if(z) {
                if(z1) {
                    llb0.close();
                    return 12;
                }
                if(z2) {
                    llb0.close();
                    return 15;
                }
            }
        label_54:
            ++v3;
        }
        llb0.close();
        return 0;
    }

    private static final ByteOrder B(llb llb0) {
        int v = llb0.readShort();
        switch(v) {
            case 0x4949: {
                return ByteOrder.LITTLE_ENDIAN;
            }
            case 0x4D4D: {
                return ByteOrder.BIG_ENDIAN;
            }
            default: {
                throw new IOException("Invalid byte order: " + Integer.toHexString(v));
            }
        }
    }

    public static double a(String s, String s1) {
        try {
            String[] arr_s = s.split(",", -1);
            String[] arr_s1 = arr_s[0].split("/", -1);
            double f = Double.parseDouble(arr_s1[0].trim()) / Double.parseDouble(arr_s1[1].trim());
            String[] arr_s2 = arr_s[1].split("/", -1);
            double f1 = Double.parseDouble(arr_s2[0].trim()) / Double.parseDouble(arr_s2[1].trim());
            String[] arr_s3 = arr_s[2].split("/", -1);
            double f2 = f + f1 / 60.0 + Double.parseDouble(arr_s3[0].trim()) / Double.parseDouble(arr_s3[1].trim()) / 3600.0;
            if(!s1.equals("S") && !s1.equals("W")) {
                if(!s1.equals("N") && !s1.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return f2;
            }
            return -f2;
        }
        catch(NumberFormatException | ArrayIndexOutOfBoundsException exception0) {
            throw new IllegalArgumentException(exception0);
        }
    }

    public final double b(String s, double f) {
        llc llc0 = this.h(s);
        if(llc0 != null) {
            try {
                return llc0.a(this.aa);
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        return f;
    }

    public final int c(String s, int v) {
        llc llc0 = this.h(s);
        if(llc0 != null) {
            try {
                return llc0.b(this.aa);
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        return v;
    }

    public final String d(String s) {
        if(s == null) {
            throw new NullPointerException("tag shouldn\'t be null");
        }
        llc llc0 = this.h(s);
        if(llc0 == null) {
            return null;
        }
        if(s.equals("GPSTimeStamp")) {
            int v = llc0.a;
            if(v != 5 && v != 10) {
                Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + v);
                return null;
            }
            lle[] arr_lle = (lle[])llc0.k(this.aa);
            if(arr_lle != null && arr_lle.length == 3) {
                return String.format("%02d:%02d:%02d", ((int)(((float)arr_lle[0].a) / ((float)arr_lle[0].b))), ((int)(((float)arr_lle[1].a) / ((float)arr_lle[1].b))), ((int)(((float)arr_lle[2].a) / ((float)arr_lle[2].b))));
            }
            Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(arr_lle));
            return null;
        }
        if(llf.S.contains(s)) {
            try {
                return Double.toString(llc0.a(this.aa));
            }
            catch(NumberFormatException unused_ex) {
                return null;
            }
        }
        return llc0.l(this.aa);
    }

    public final void e(String s, String s1) {
        lle lle0;
        long v6;
        long v5;
        String s2 = s;
        String s3 = s1;
        if(s2 == null) {
            throw new NullPointerException("tag shouldn\'t be null");
        }
        if("ISOSpeedRatings".equals(s2)) {
            s2 = "PhotographicSensitivity";
        }
        if(s3 != null) {
            if(llf.S.contains(s2) && !s3.contains("/")) {
                try {
                    double f = Double.parseDouble(s3);
                    if(Double.compare(f, 9223372036854776000.0) < 0 && f > -9223372036854776000.0) {
                        double f1 = Math.abs(f);
                        long v = 1L;
                        double f2 = f1;
                        long v1 = 0L;
                        long v2 = 1L;
                        for(long v3 = 0L; true; v3 = v5) {
                            long v4 = (long)(f2 - f2 % 1.0);
                            v5 = v4 * v3 + v2;
                            v6 = v4 * v + v1;
                            if(Math.abs(f1 - ((double)v6) / ((double)v5)) <= 1.000000E-08 * f1) {
                                break;
                            }
                            f = f;
                            v1 = v;
                            f2 = 1.0 / (f2 % 1.0);
                            v = v6;
                            v2 = v3;
                        }
                        if((f < 0.0)) {
                            v6 = -v6;
                        }
                        lle0 = new lle(v6, v5);
                    }
                    else {
                        lle0 = new lle((f > 0.0 ? 0x7FFFFFFFFFFFFFFFL : 0x8000000000000000L), 1L);
                    }
                    s3 = lle0.toString();
                }
                catch(NumberFormatException unused_ex) {
                    Log.w("ExifInterface", a.l(s3, s2, "Invalid value for ", " : "));
                    return;
                }
            }
            else if(s2.equals("GPSTimeStamp")) {
                Matcher matcher0 = llf.U.matcher(s3);
                if(!matcher0.find()) {
                    Log.w("ExifInterface", a.l(s3, s2, "Invalid value for ", " : "));
                    return;
                }
                s3 = Integer.parseInt(matcher0.group(1)) + "/1," + Integer.parseInt(matcher0.group(2)) + "/1," + Integer.parseInt(matcher0.group(3)) + "/1";
            }
            else if("DateTime".equals(s2) || "DateTimeOriginal".equals(s2) || "DateTimeDigitized".equals(s2)) {
                boolean z = llf.V.matcher(s3).find();
                boolean z1 = llf.W.matcher(s3).find();
                if(s3.length() != 19) {
                    Log.w("ExifInterface", a.l(s3, s2, "Invalid value for ", " : "));
                    return;
                }
                if(!z) {
                    if(!z1) {
                        Log.w("ExifInterface", a.l(s3, s2, "Invalid value for ", " : "));
                        return;
                    }
                    s3 = s3.replaceAll("-", ":");
                }
                else if(z1) {
                    s3 = s3.replaceAll("-", ":");
                }
            }
        }
        if("Xmp".equals(s2)) {
            boolean z2 = this.Y[0].containsKey("Xmp") || this.Y[5].containsKey("Xmp");
            int v7 = llf.f(this.p);
            if(v7 == 2) {
                if(this.t != null || !z2) {
                    this.t = s3 == null ? null : llc.c(s3);
                    return;
                }
                z2 = true;
                v7 = 2;
            }
            if(v7 == 3 && !z2) {
                this.t = s3 == null ? null : llc.c(s3);
                return;
            }
        }
        int v8 = 0;
        while(true) {
            int v9 = 4;
            if(v8 >= 10) {
                break;
            }
            if(v8 != 4) {
            label_72:
                lld lld0 = (lld)llf.R[v8].get(s2);
                if(lld0 != null) {
                    if(s3 == null) {
                        this.Y[v8].remove(s2);
                    }
                    else {
                        Pair pair0 = llf.g(s3);
                        int v10 = lld0.c;
                        if(v10 != ((int)(((Integer)pair0.first))) && v10 != ((int)(((Integer)pair0.second)))) {
                            int v11 = lld0.d;
                            if(v11 != -1 && (v11 == ((int)(((Integer)pair0.first))) || v11 == ((int)(((Integer)pair0.second))))) {
                                v10 = v11;
                            }
                            else {
                                switch(v10) {
                                    case 1: {
                                        goto label_88;
                                    }
                                    case 2: 
                                    case 7: {
                                        goto label_91;
                                    }
                                    default: {
                                        goto label_90;
                                    }
                                }
                            }
                        }
                        switch(v10) {
                            case 1: {
                            label_88:
                                this.Y[v8].put(s2, llc.c(s3));
                            label_90:
                                break;
                            }
                            case 3: {
                                String[] arr_s = s3.split(",", -1);
                                int[] arr_v = new int[arr_s.length];
                                for(int v12 = 0; v12 < arr_s.length; ++v12) {
                                    arr_v[v12] = Integer.parseInt(arr_s[v12]);
                                }
                                this.Y[v8].put(s2, llc.j(arr_v, this.aa));
                                break;
                            }
                            case 4: {
                                String[] arr_s1 = s3.split(",", -1);
                                long[] arr_v1 = new long[arr_s1.length];
                                for(int v13 = 0; v13 < arr_s1.length; ++v13) {
                                    arr_v1[v13] = Long.parseLong(arr_s1[v13]);
                                }
                                this.Y[v8].put(s2, llc.f(arr_v1, this.aa));
                                break;
                            }
                            case 5: {
                                String[] arr_s2 = s3.split(",", -1);
                                lle[] arr_lle = new lle[arr_s2.length];
                                for(int v14 = 0; v14 < arr_s2.length; ++v14) {
                                    String[] arr_s3 = arr_s2[v14].split("/", -1);
                                    arr_lle[v14] = new lle(((long)Double.parseDouble(arr_s3[0])), ((long)Double.parseDouble(arr_s3[1])));
                                }
                                this.Y[v8].put(s2, llc.h(arr_lle, this.aa));
                                break;
                            }
                            case 2: 
                            case 7: {
                            label_91:
                                this.Y[v8].put(s2, llc.d(s3));
                                break;
                            }
                            case 9: {
                                String[] arr_s4 = s3.split(",", -1);
                                int[] arr_v2 = new int[arr_s4.length];
                                for(int v15 = 0; v15 < arr_s4.length; ++v15) {
                                    arr_v2[v15] = Integer.parseInt(arr_s4[v15]);
                                }
                                HashMap hashMap0 = this.Y[v8];
                                ByteOrder byteOrder0 = this.aa;
                                ByteBuffer byteBuffer0 = ByteBuffer.wrap(new byte[llf.h[9] * arr_s4.length]);
                                byteBuffer0.order(byteOrder0);
                                for(int v16 = 0; v16 < arr_s4.length; ++v16) {
                                    byteBuffer0.putInt(arr_v2[v16]);
                                }
                                byte[] arr_b = byteBuffer0.array();
                                hashMap0.put(s2, new llc(9, arr_s4.length, arr_b));
                                break;
                            }
                            case 10: {
                                String[] arr_s5 = s3.split(",", -1);
                                lle[] arr_lle1 = new lle[arr_s5.length];
                                for(int v17 = 0; v17 < arr_s5.length; ++v17) {
                                    String[] arr_s6 = arr_s5[v17].split("/", -1);
                                    arr_lle1[v17] = new lle(((long)Double.parseDouble(arr_s6[0])), ((long)Double.parseDouble(arr_s6[1])));
                                }
                                HashMap hashMap1 = this.Y[v8];
                                ByteOrder byteOrder1 = this.aa;
                                ByteBuffer byteBuffer1 = ByteBuffer.wrap(new byte[llf.h[10] * arr_s5.length]);
                                byteBuffer1.order(byteOrder1);
                                for(int v18 = 0; v18 < arr_s5.length; ++v18) {
                                    lle lle1 = arr_lle1[v18];
                                    byteBuffer1.putInt(((int)lle1.a));
                                    byteBuffer1.putInt(((int)lle1.b));
                                }
                                byte[] arr_b1 = byteBuffer1.array();
                                hashMap1.put(s2, new llc(10, arr_s5.length, arr_b1));
                            }
                        }
                    }
                }
                v9 = v8;
            }
            else if(this.q) {
                v8 = 4;
                goto label_72;
            }
            v8 = v9 + 1;
        }
    }

    private static int f(int v) {
        switch(v) {
            case 4: {
                return 3;
            }
            case 9: 
            case 12: 
            case 13: 
            case 15: {
                return 2;
            }
            default: {
                return 1;
            }
        }
    }

    private static Pair g(String s) {
        int v = 1;
        Integer integer0 = (int)2;
        Integer integer1 = (int)-1;
        if(s.contains(",")) {
            String[] arr_s = s.split(",", -1);
            Pair pair0 = llf.g(arr_s[0]);
            if(((int)(((Integer)pair0.first))) != 2) {
                while(v < arr_s.length) {
                    Pair pair1 = llf.g(arr_s[v]);
                    int v1 = ((Integer)pair1.first).equals(pair0.first) || ((Integer)pair1.second).equals(pair0.first) ? ((int)(((Integer)pair0.first))) : -1;
                    int v2 = ((int)(((Integer)pair0.second))) == -1 || !((Integer)pair1.first).equals(pair0.second) && !((Integer)pair1.second).equals(pair0.second) ? -1 : ((int)(((Integer)pair0.second)));
                    if(v1 == -1) {
                        if(v2 != -1) {
                            v1 = -1;
                            goto label_16;
                        }
                        return new Pair(integer0, integer1);
                    }
                label_16:
                    if(v1 == -1) {
                        pair0 = new Pair(v2, integer1);
                    }
                    else if(v2 == -1) {
                        pair0 = new Pair(v1, integer1);
                    }
                    ++v;
                }
            }
            return pair0;
        }
        if(s.contains("/")) {
            String[] arr_s1 = s.split("/", -1);
            if(arr_s1.length == 2) {
                try {
                    long v3 = (long)Double.parseDouble(arr_s1[0]);
                    long v4 = (long)Double.parseDouble(arr_s1[1]);
                    if(Long.compare(v3, 0L) >= 0 && v4 >= 0L) {
                        return Long.compare(v3, 0x7FFFFFFFL) > 0 || v4 > 0x7FFFFFFFL ? new Pair(((int)5), integer1) : new Pair(((int)10), ((int)5));
                    }
                    return new Pair(((int)10), integer1);
                }
                catch(NumberFormatException unused_ex) {
                }
            }
            return new Pair(integer0, integer1);
        }
        try {
            long v5 = Long.parseLong(s);
            Long long0 = v5;
            long0.getClass();
            int v6 = Long.compare(v5, 0L);
            if(v6 >= 0) {
                long0.getClass();
                if(v5 <= 0xFFFFL) {
                    return new Pair(((int)3), ((int)4));
                }
            }
            long0.getClass();
            return v6 >= 0 ? new Pair(((int)4), integer1) : new Pair(((int)9), integer1);
        }
        catch(NumberFormatException unused_ex) {
            try {
                Double.parseDouble(s);
                return new Pair(((int)12), integer1);
            }
            catch(NumberFormatException unused_ex) {
                return new Pair(integer0, integer1);
            }
        }
    }

    private final llc h(String s) {
        if("ISOSpeedRatings".equals(s)) {
            s = "PhotographicSensitivity";
        }
        if("Xmp".equals(s) && llf.f(this.p) == 2) {
            llc llc0 = this.t;
            if(llc0 != null) {
                return llc0;
            }
        }
        for(int v = 0; v < 10; ++v) {
            llc llc1 = (llc)this.Y[v].get(s);
            if(llc1 != null) {
                return llc1;
            }
        }
        if("Xmp".equals(s)) {
            return this.t == null ? null : this.t;
        }
        return null;
    }

    private final void i() {
        String s = this.d("DateTimeOriginal");
        if(s != null && this.d("DateTime") == null) {
            this.Y[0].put("DateTime", llc.d(s));
        }
        if(this.d("ImageWidth") == null) {
            this.Y[0].put("ImageWidth", llc.e(0L, this.aa));
        }
        if(this.d("ImageLength") == null) {
            this.Y[0].put("ImageLength", llc.e(0L, this.aa));
        }
        if(this.d("Orientation") == null) {
            this.Y[0].put("Orientation", llc.e(0L, this.aa));
        }
        if(this.d("LightSource") == null) {
            this.Y[1].put("LightSource", llc.e(0L, this.aa));
        }
    }

    private final void j(llb llb0, int v, int v1) {
        llb0.c = ByteOrder.BIG_ENDIAN;
        int v2 = llb0.readByte();
        if(v2 != -1) {
            throw new IOException("Invalid marker: " + Integer.toHexString(v2 & 0xFF));
        }
        if(llb0.readByte() != -40) {
            throw new IOException("Invalid marker: " + Integer.toHexString(0xFF));
        }
        for(int v3 = 2; true; v3 = v8 + v7) {
            int v4 = llb0.readByte();
            if(v4 != -1) {
                throw new IOException("Invalid marker:" + Integer.toHexString(v4 & 0xFF));
            }
            int v5 = llb0.readByte();
            if(v5 == -39 || v5 == -38) {
                llb0.c = this.aa;
                return;
            }
            int v6 = llb0.readUnsignedShort();
            int v7 = v6 - 2;
            int v8 = v3 + 4;
            if(v7 < 0) {
                throw new IOException("Invalid length");
            }
            switch(v5) {
                case 0xFFFFFFE1: {
                    byte[] arr_b = new byte[v7];
                    llb0.readFully(arr_b);
                    byte[] arr_b1 = llf.l;
                    if(llg.b(arr_b, arr_b1)) {
                        byte[] arr_b2 = Arrays.copyOfRange(arr_b, arr_b1.length, v7);
                        this.s = v + v8 + arr_b1.length;
                        this.q(arr_b2, v1);
                        this.s(new llb(arr_b2));
                    }
                    else {
                        byte[] arr_b3 = llf.m;
                        if(llg.b(arr_b, arr_b3)) {
                            byte[] arr_b4 = Arrays.copyOfRange(arr_b, arr_b3.length, v7);
                            this.t = new llc(1, arr_b4.length, ((long)(v8 + arr_b3.length)), arr_b4);
                        }
                    }
                    v8 += v7;
                    v7 = 0;
                    break;
                }
                case -2: {
                    byte[] arr_b5 = new byte[v7];
                    llb0.readFully(arr_b5);
                    if(this.d("UserComment") == null) {
                        this.Y[1].put("UserComment", llc.d(new String(arr_b5, llf.k)));
                    }
                    v7 = 0;
                    break;
                }
                default: {
                    if(v5 == 0xFFFFFFC0 || v5 == 0xFFFFFFC1 || v5 == -62 || v5 == -61 || (v5 == -59 || v5 == -58 || v5 == -57) || (v5 == -55 || v5 == -54 || v5 == -53) || (v5 == -51 || v5 == -50 || v5 == -49)) {
                        llb0.b(1);
                        this.Y[v1].put((v1 == 4 ? "ThumbnailImageLength" : "ImageLength"), llc.e(llb0.readUnsignedShort(), this.aa));
                        this.Y[v1].put((v1 == 4 ? "ThumbnailImageWidth" : "ImageWidth"), llc.e(llb0.readUnsignedShort(), this.aa));
                        v7 = v6 - 7;
                    }
                }
            }
            if(v7 < 0) {
                break;
            }
            llb0.b(v7);
        }
        throw new IOException("Invalid length");
    }

    private final void k(llb llb0) {
        llb0.c = ByteOrder.BIG_ENDIAN;
        int v = llb0.b;
        llb0.b(8);
        boolean z = false;
        boolean z1 = false;
        while(true) {
            if(z1) {
                if(z) {
                    return;
                }
                z = false;
            }
            try {
                int v1 = llb0.readInt();
                int v2 = llb0.readInt();
                int v3 = llb0.b + v1;
                int v4 = llb0.b - v;
                if(v4 == 16) {
                    if(v2 != 1229472850) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                    }
                    v4 = 16;
                }
                switch(v2) {
                    case 0x49454E44: {
                        return;
                    }
                    case 1700284774: {
                        if(!z1) {
                            this.s = v4;
                            byte[] arr_b = new byte[v1];
                            llb0.readFully(arr_b);
                            int v5 = llb0.readInt();
                            CRC32 cRC320 = new CRC32();
                            cRC320.update(101);
                            cRC320.update(0x6558);
                            cRC320.update(0x655849);
                            cRC320.update(1700284774);
                            cRC320.update(arr_b);
                            if(((int)cRC320.getValue()) != v5) {
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + v5 + ", calculated CRC value: " + cRC320.getValue());
                            }
                            this.q(arr_b, 0);
                            this.u();
                            this.s(new llb(arr_b));
                            z1 = true;
                        }
                        break;
                    }
                    case 0x69545874: {
                        if(!z) {
                            byte[] arr_b1 = llf.e;
                            int v6 = arr_b1.length;
                            if(v1 >= v6) {
                                byte[] arr_b2 = new byte[v6];
                                llb0.readFully(arr_b2);
                                if(Arrays.equals(arr_b2, arr_b1)) {
                                    int v7 = llb0.b - v;
                                    int v8 = v1 - v6;
                                    byte[] arr_b3 = new byte[v8];
                                    llb0.readFully(arr_b3);
                                    this.t = new llc(1, v8, ((long)v7), arr_b3);
                                    z = true;
                                }
                            }
                        }
                    }
                }
                llb0.b(v3 + 4 - llb0.b);
                continue;
            }
            catch(EOFException eOFException0) {
            }
            break;
        }
        throw new IOException("Encountered corrupt PNG file.", eOFException0);
    }

    private final void l(llb llb0) {
        llb0.c = ByteOrder.LITTLE_ENDIAN;
        llb0.b(4);
        int v = llb0.readInt() + 8;
        llb0.b(4);
        int v1 = 12;
        try {
            while(true) {
                byte[] arr_b = new byte[4];
                llb0.readFully(arr_b);
                int v2 = llb0.readInt();
                if(Arrays.equals(llf.D, arr_b)) {
                    byte[] arr_b1 = new byte[v2];
                    llb0.readFully(arr_b1);
                    byte[] arr_b2 = llf.l;
                    if(llg.b(arr_b1, arr_b2)) {
                        arr_b1 = Arrays.copyOfRange(arr_b1, arr_b2.length, v2);
                    }
                    this.s = v1 + 8;
                    this.q(arr_b1, 0);
                    this.s(new llb(arr_b1));
                    return;
                }
                if(v2 % 2 == 1) {
                    ++v2;
                }
                v1 = v1 + 8 + v2;
                if(v1 == v) {
                    return;
                }
                if(v1 > v) {
                    break;
                }
                llb0.b(v2);
            }
            throw new IOException("Encountered WebP file with invalid chunk size");
        }
        catch(EOFException eOFException0) {
            throw new IOException("Encountered corrupt WebP file.", eOFException0);
        }
    }

    private final void m(llb llb0, HashMap hashMap0) {
        llc llc0 = (llc)hashMap0.get("JPEGInterchangeFormat");
        llc llc1 = (llc)hashMap0.get("JPEGInterchangeFormatLength");
        if(llc0 != null && llc1 != null) {
            int v = llc0.b(this.aa);
            int v1 = llc1.b(this.aa);
            if(this.p == 7) {
                v += this.ab;
            }
            if(v > 0 && v1 > 0) {
                this.q = true;
                if(this.n == null && this.X == null && this.o == null) {
                    llb0.b(v);
                    llb0.readFully(new byte[v1]);
                }
            }
        }
    }

    private final void n(llb llb0, HashMap hashMap0) {
        byte[] arr_b1;
        llc llc0 = (llc)hashMap0.get("StripOffsets");
        llc llc1 = (llc)hashMap0.get("StripByteCounts");
        if(llc0 != null && llc1 != null) {
            long[] arr_v = llg.c(llc0.k(this.aa));
            long[] arr_v1 = llg.c(llc1.k(this.aa));
            if(arr_v != null && arr_v.length != 0) {
                if(arr_v1 == null || arr_v1.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if(arr_v.length != arr_v1.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long v = 0L;
                for(int v1 = 0; v1 < arr_v1.length; ++v1) {
                    v += arr_v1[v1];
                }
                byte[] arr_b = new byte[((int)v)];
                this.r = true;
                this.q = true;
                int v2 = 0;
                int v3 = 0;
                int v4 = 0;
                while(v2 < arr_v.length) {
                    int v5 = (int)arr_v[v2];
                    int v6 = (int)arr_v1[v2];
                    if(v2 < arr_v.length - 1) {
                        arr_b1 = arr_b;
                        if(((long)(v5 + v6)) != arr_v[v2 + 1]) {
                            this.r = false;
                        }
                    }
                    else {
                        arr_b1 = arr_b;
                    }
                    int v7 = v5 - v3;
                    if(v7 < 0) {
                        return;
                    }
                    try {
                        llb0.b(v7);
                    }
                    catch(EOFException unused_ex) {
                        return;
                    }
                    byte[] arr_b2 = new byte[v6];
                    try {
                        llb0.readFully(arr_b2);
                    }
                    catch(EOFException unused_ex) {
                        return;
                    }
                    ++v2;
                    v3 = v3 + v7 + v6;
                    System.arraycopy(arr_b2, 0, arr_b1, v4, v6);
                    v4 += v6;
                    arr_b = arr_b1;
                }
                if(this.r) {
                    long v8 = arr_v[0];
                }
            }
            else {
                Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            }
        }
    }

    private final void o(InputStream inputStream0) {
        int v17;
        String s5;
        String s4;
        MediaMetadataRetriever mediaMetadataRetriever0;
        llb llb3;
        llb llb2;
        int v4;
        llb llb1;
        llb llb0;
        byte[] arr_b;
        BufferedInputStream bufferedInputStream0;
        int v1;
        try {
            for(int v = 0; v < 10; ++v) {
                this.Y[v] = new HashMap();
            }
            v1 = 4;
            bufferedInputStream0 = new BufferedInputStream(inputStream0, 5000);
            bufferedInputStream0.mark(5000);
            arr_b = new byte[5000];
            bufferedInputStream0.read(arr_b);
            bufferedInputStream0.reset();
            int v2 = 0;
        alab1:
            while(true) {
                byte[] arr_b1 = llf.c;
                llb0 = null;
                if(v2 >= 3) {
                    goto label_103;
                }
                if(arr_b[v2] == arr_b1[v2]) {
                    ++v2;
                }
                else {
                    byte[] arr_b2 = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                    int v3 = 0;
                    while(true) {
                        if(v3 >= arr_b2.length) {
                            v1 = 9;
                            goto label_103;
                        }
                        if(arr_b[v3] == arr_b2[v3]) {
                            ++v3;
                            continue;
                        }
                        v1 = llf.A(arr_b);
                        break alab1;
                    }
                }
            }
        }
        catch(IOException | UnsupportedOperationException unused_ex) {
            goto label_274;
        }
        catch(Throwable throwable0) {
            this.i();
            throw throwable0;
        }
        if(v1 == 0) {
            try {
                llb0 = null;
                llb1 = null;
                llb1 = new llb(arr_b);
                goto label_34;
            }
            catch(Exception unused_ex) {
                goto label_39;
            }
            catch(Throwable throwable1) {
            }
            try {
                goto label_44;
            }
            catch(IOException | UnsupportedOperationException unused_ex) {
                goto label_274;
            }
            catch(Throwable throwable0) {
                this.i();
                throw throwable0;
            }
            try {
            label_34:
                ByteOrder byteOrder0 = llf.B(llb1);
                this.aa = byteOrder0;
                llb1.c = byteOrder0;
                v4 = llb1.readShort();
                goto label_47;
            }
            catch(Exception unused_ex) {
            }
            catch(Throwable throwable1) {
                goto label_43;
            }
            try {
            label_39:
                if(llb1 != null) {
                    llb1.close();
                    llb0 = null;
                    llb2 = null;
                    llb2 = new llb(arr_b);
                    goto label_61;
                label_43:
                    llb0 = llb1;
                label_44:
                    if(llb0 != null) {
                        llb0.close();
                    }
                    throw throwable1;
                label_47:
                    int v5 = v4 != 20306 && v4 != 21330 ? 0 : 1;
                    llb1.close();
                    if(v5 != 0) {
                        v1 = 7;
                        goto label_103;
                    }
                }
            }
            catch(IOException | UnsupportedOperationException unused_ex) {
                goto label_274;
            }
            catch(Throwable throwable0) {
                this.i();
                throw throwable0;
            }
            try {
                llb0 = null;
                llb2 = null;
                llb2 = new llb(arr_b);
                goto label_61;
            }
            catch(Exception unused_ex) {
                goto label_66;
            }
            catch(Throwable throwable2) {
            }
            try {
                goto label_73;
            }
            catch(IOException | UnsupportedOperationException unused_ex) {
                goto label_274;
            }
            catch(Throwable throwable0) {
                this.i();
                throw throwable0;
            }
            try {
            label_61:
                ByteOrder byteOrder1 = llf.B(llb2);
                this.aa = byteOrder1;
                llb2.c = byteOrder1;
                int v6 = llb2.readShort();
                goto label_76;
            }
            catch(Exception unused_ex) {
            }
            catch(Throwable throwable2) {
                goto label_72;
            }
            try {
            label_66:
                if(llb2 != null) {
                    llb2.close();
                }
                v1 = 13;
                int v7 = 0;
                goto label_80;
            label_72:
                llb0 = llb2;
            label_73:
                if(llb0 != null) {
                    llb0.close();
                }
                throw throwable2;
            label_76:
                llb2.close();
                if(v6 == 85) {
                    v1 = 10;
                }
                else {
                    v1 = 13;
                    v7 = 0;
                alab2:
                    while(true) {
                    label_80:
                        byte[] arr_b3 = llf.d;
                        if(v7 >= 8) {
                            break;
                        }
                        if(arr_b[v7] != arr_b3[v7]) {
                            for(int v8 = 0; true; ++v8) {
                                byte[] arr_b4 = llf.B;
                                if(v8 >= 4) {
                                    v1 = 14;
                                    for(int v9 = 0; true; ++v9) {
                                        byte[] arr_b5 = llf.C;
                                        if(v9 >= 4) {
                                            break alab2;
                                        }
                                        if(arr_b[v9 + 8] != arr_b5[v9]) {
                                            break;
                                        }
                                    }
                                    v1 = 0;
                                    break alab2;
                                }
                                if(arr_b[v8] != arr_b4[v8]) {
                                    break;
                                }
                            }
                            v1 = 0;
                            break;
                        }
                        ++v7;
                    }
                }
            label_103:
                this.p = v1;
                if(v1 != 4 && v1 != 9 && v1 != 13 && v1 != 14) {
                    llb3 = new llb(bufferedInputStream0, null);
                    switch(this.p) {
                        case 7: {
                            goto label_109;
                        }
                        case 10: {
                            goto label_155;
                        }
                        case 12: 
                        case 15: {
                            mediaMetadataRetriever0 = new MediaMetadataRetriever();
                            goto label_165;
                        }
                    }
                    this.x(llb3);
                    goto label_226;
                label_109:
                    this.x(llb3);
                    HashMap[] arr_hashMap = this.Y;
                    llc llc0 = (llc)arr_hashMap[1].get("MakerNote");
                    if(llc0 != null) {
                        llb llb4 = new llb(llc0.d, null);
                        llb4.c = this.aa;
                        byte[] arr_b6 = new byte[6];
                        llb4.readFully(arr_b6);
                        llb4.c(0L);
                        byte[] arr_b7 = llf.A;
                        byte[] arr_b8 = new byte[10];
                        llb4.readFully(arr_b8);
                        if(Arrays.equals(arr_b6, llf.z)) {
                            llb4.c(8L);
                        }
                        else if(Arrays.equals(arr_b8, arr_b7)) {
                            llb4.c(12L);
                        }
                        this.y(llb4, 6);
                        llc llc1 = (llc)arr_hashMap[7].get("PreviewImageStart");
                        llc llc2 = (llc)arr_hashMap[7].get("PreviewImageLength");
                        if(llc1 != null && llc2 != null) {
                            arr_hashMap[5].put("JPEGInterchangeFormat", llc1);
                            arr_hashMap[5].put("JPEGInterchangeFormatLength", llc2);
                        }
                        llc llc3 = (llc)arr_hashMap[8].get("AspectFrame");
                        if(llc3 != null) {
                            int[] arr_v = (int[])llc3.k(this.aa);
                            if(arr_v != null && arr_v.length == 4) {
                                int v10 = arr_v[2];
                                int v11 = arr_v[0];
                                if(v10 > v11) {
                                    int v12 = arr_v[3];
                                    int v13 = arr_v[1];
                                    if(v12 > v13) {
                                        int v14 = v10 - v11 + 1;
                                        int v15 = v12 - v13 + 1;
                                        if(v14 < v15) {
                                            int v16 = v14 + v15;
                                            v15 = v16 - v15;
                                            v14 = v16 - v15;
                                        }
                                        llc llc4 = llc.i(v14, this.aa);
                                        llc llc5 = llc.i(v15, this.aa);
                                        arr_hashMap[0].put("ImageWidth", llc4);
                                        arr_hashMap[0].put("ImageLength", llc5);
                                    }
                                }
                            }
                            else {
                                Log.w("ExifInterface", "Invalid aspect frame values. frame=".concat(Arrays.toString(arr_v)));
                                goto label_226;
                            label_155:
                                this.x(llb3);
                                HashMap[] arr_hashMap1 = this.Y;
                                llc llc6 = (llc)arr_hashMap1[0].get("JpgFromRaw");
                                if(llc6 != null) {
                                    this.j(new llb(llc6.d), ((int)llc6.c), 5);
                                }
                                llc llc7 = (llc)arr_hashMap1[0].get("ISO");
                                if(llc7 != null && ((llc)arr_hashMap1[1].get("PhotographicSensitivity")) == null) {
                                    arr_hashMap1[1].put("PhotographicSensitivity", llc7);
                                }
                            }
                        }
                    }
                    goto label_226;
                }
                else {
                    goto label_229;
                }
                goto label_274;
            }
            catch(IOException | UnsupportedOperationException unused_ex) {
                goto label_274;
            }
            catch(Throwable throwable0) {
                this.i();
                throw throwable0;
            }
        }
        goto label_103;
        try {
            try {
            label_165:
                mediaMetadataRetriever0.setDataSource(new lla(llb3));
                String s = mediaMetadataRetriever0.extractMetadata(33);
                String s1 = mediaMetadataRetriever0.extractMetadata(34);
                String s2 = mediaMetadataRetriever0.extractMetadata(26);
                String s3 = mediaMetadataRetriever0.extractMetadata(17);
                if("yes".equals(s2)) {
                    llb0 = mediaMetadataRetriever0.extractMetadata(29);
                    s4 = mediaMetadataRetriever0.extractMetadata(30);
                    s5 = mediaMetadataRetriever0.extractMetadata(0x1F);
                }
                else if("yes".equals(s3)) {
                    llb0 = mediaMetadataRetriever0.extractMetadata(18);
                    s4 = mediaMetadataRetriever0.extractMetadata(19);
                    s5 = mediaMetadataRetriever0.extractMetadata(24);
                }
                else {
                    s4 = null;
                    s5 = null;
                }
                if(llb0 != null) {
                    this.Y[0].put("ImageWidth", llc.i(Integer.parseInt(((String)llb0)), this.aa));
                }
                if(s4 != null) {
                    this.Y[0].put("ImageLength", llc.i(Integer.parseInt(s4), this.aa));
                }
                if(s5 != null) {
                    switch(Integer.parseInt(s5)) {
                        case 90: {
                            v17 = 6;
                            break;
                        }
                        case 180: {
                            v17 = 3;
                            break;
                        }
                        case 270: {
                            v17 = 8;
                            break;
                        }
                        default: {
                            v17 = 1;
                        }
                    }
                    this.Y[0].put("Orientation", llc.i(v17, this.aa));
                }
                if(s != null && s1 != null) {
                    int v18 = Integer.parseInt(s);
                    int v19 = Integer.parseInt(s1);
                    if(v19 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    llb3.c(((long)v18));
                    byte[] arr_b9 = new byte[6];
                    llb3.readFully(arr_b9);
                    if(!Arrays.equals(arr_b9, llf.l)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] arr_b10 = new byte[v19 - 6];
                    llb3.readFully(arr_b10);
                    this.s = v18 + 6;
                    this.q(arr_b10, 0);
                }
                String s6 = mediaMetadataRetriever0.extractMetadata(41);
                String s7 = mediaMetadataRetriever0.extractMetadata(42);
                if(s6 != null && s7 != null) {
                    int v20 = Integer.parseInt(s6);
                    int v21 = Integer.parseInt(s7);
                    llb3.c(((long)v20));
                    byte[] arr_b11 = new byte[v21];
                    llb3.readFully(arr_b11);
                    this.t = new llc(1, v21, ((long)v20), arr_b11);
                }
                goto label_225;
            }
            catch(RuntimeException runtimeException0) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", runtimeException0);
            }
        }
        catch(Throwable throwable3) {
            try {
                try {
                    mediaMetadataRetriever0.release();
                }
                catch(IOException unused_ex) {
                }
                try {
                    throw throwable3;
                }
                catch(IOException unused_ex) {
                    goto label_274;
                }
                try {
                label_225:
                    mediaMetadataRetriever0.release();
                }
                catch(IOException unused_ex) {
                }
                try {
                label_226:
                    llb3.c(((long)this.s));
                    this.s(llb3);
                }
                catch(IOException unused_ex) {
                }
            }
            catch(UnsupportedOperationException unused_ex) {
            }
            catch(Throwable throwable0) {
                this.i();
                throw throwable0;
            }
        }
        goto label_274;
        try {
        label_229:
            llb llb5 = new llb(bufferedInputStream0);
            int v22 = this.p;
            switch(v22) {
                case 4: {
                    this.j(llb5, 0, 0);
                    goto label_274;
                }
                case 9: {
                    llb5.b(84);
                    byte[] arr_b12 = new byte[4];
                    byte[] arr_b13 = new byte[4];
                    byte[] arr_b14 = new byte[4];
                    llb5.readFully(arr_b12);
                    llb5.readFully(arr_b13);
                    llb5.readFully(arr_b14);
                    int v23 = ByteBuffer.wrap(arr_b12).getInt();
                    int v24 = ByteBuffer.wrap(arr_b13).getInt();
                    int v25 = ByteBuffer.wrap(arr_b14).getInt();
                    byte[] arr_b15 = new byte[v24];
                    llb5.b(v23 - llb5.b);
                    llb5.readFully(arr_b15);
                    this.j(new llb(arr_b15), v23, 5);
                    llb5.b(v25 - llb5.b);
                    llb5.c = ByteOrder.BIG_ENDIAN;
                    int v26 = llb5.readInt();
                    int v27 = 0;
                    while(true) {
                        if(v27 >= v26) {
                            goto label_274;
                        }
                        int v28 = llb5.readUnsignedShort();
                        int v29 = llb5.readUnsignedShort();
                        if(v28 != llf.K.a) {
                            llb5.b(v29);
                            ++v27;
                            continue;
                        }
                        int v30 = llb5.readShort();
                        int v31 = llb5.readShort();
                        llc llc8 = llc.i(v30, this.aa);
                        llc llc9 = llc.i(v31, this.aa);
                        this.Y[0].put("ImageLength", llc8);
                        this.Y[0].put("ImageWidth", llc9);
                        goto label_274;
                    }
                }
                case 13: {
                    this.k(llb5);
                    goto label_274;
                }
                default: {
                    if(v22 == 14) {
                        this.l(llb5);
                    }
                    goto label_274;
                }
            }
        }
        catch(IOException | UnsupportedOperationException unused_ex) {
            goto label_274;
        }
        catch(Throwable throwable0) {
        }
        this.i();
        throw throwable0;
    label_274:
        this.i();
    }

    private final void p(llb llb0) {
        ByteOrder byteOrder0 = llf.B(llb0);
        this.aa = byteOrder0;
        llb0.c = byteOrder0;
        int v = llb0.readUnsignedShort();
        if(this.p != 7 && this.p != 10 && v != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(v));
        }
        int v1 = llb0.readInt();
        if(v1 < 8) {
            throw new IOException("Invalid first Ifd offset: " + v1);
        }
        if(v1 - 8 > 0) {
            llb0.b(v1 - 8);
        }
    }

    private final void q(byte[] arr_b, int v) {
        llb llb0 = new llb(arr_b, null);
        this.p(llb0);
        this.y(llb0, v);
    }

    private final void r(int v, String s, String s1) {
        HashMap[] arr_hashMap = this.Y;
        if(!arr_hashMap[v].isEmpty() && arr_hashMap[v].get(s) != null) {
            HashMap hashMap0 = arr_hashMap[v];
            hashMap0.put(s1, ((llc)hashMap0.get(s)));
            arr_hashMap[v].remove(s);
        }
    }

    private final void s(llb llb0) {
        HashMap hashMap0 = this.Y[4];
        llc llc0 = (llc)hashMap0.get("Compression");
        if(llc0 != null) {
            int v = llc0.b(this.aa);
            switch(v) {
                case 1: {
                label_7:
                    llc llc1 = (llc)hashMap0.get("BitsPerSample");
                    if(llc1 != null) {
                        int[] arr_v = (int[])llc1.k(this.aa);
                        int[] arr_v1 = llf.a;
                        if(Arrays.equals(arr_v1, arr_v)) {
                            this.n(llb0, hashMap0);
                        }
                        else if(this.p == 3) {
                            llc llc2 = (llc)hashMap0.get("PhotometricInterpretation");
                            if(llc2 != null) {
                                int v1 = llc2.b(this.aa);
                                if(v1 == 1) {
                                    if(!Arrays.equals(arr_v, llf.b)) {
                                        return;
                                    }
                                    this.n(llb0, hashMap0);
                                    return;
                                }
                                if(v1 == 6 && Arrays.equals(arr_v, arr_v1)) {
                                    this.n(llb0, hashMap0);
                                    return;
                                }
                            }
                        }
                    }
                    return;
                }
                case 6: {
                    this.m(llb0, hashMap0);
                    return;
                }
                default: {
                    if(v != 7) {
                        return;
                    }
                    goto label_7;
                }
            }
        }
        this.m(llb0, hashMap0);
    }

    private final void t(int v, int v1) {
        HashMap[] arr_hashMap = this.Y;
        if(!arr_hashMap[v].isEmpty() && !arr_hashMap[v1].isEmpty()) {
            llc llc0 = (llc)arr_hashMap[v].get("ImageLength");
            llc llc1 = (llc)arr_hashMap[v].get("ImageWidth");
            llc llc2 = (llc)arr_hashMap[v1].get("ImageLength");
            llc llc3 = (llc)arr_hashMap[v1].get("ImageWidth");
            if(llc0 != null && llc1 != null && llc2 != null && llc3 != null) {
                int v2 = llc0.b(this.aa);
                int v3 = llc1.b(this.aa);
                if(v2 < llc2.b(this.aa) && v3 < llc3.b(this.aa)) {
                    HashMap hashMap0 = arr_hashMap[v];
                    arr_hashMap[v] = arr_hashMap[v1];
                    arr_hashMap[v1] = hashMap0;
                }
            }
        }
    }

    private final void u() {
        this.t(0, 5);
        this.t(0, 4);
        this.t(5, 4);
        HashMap[] arr_hashMap = this.Y;
        llc llc0 = (llc)arr_hashMap[1].get("PixelXDimension");
        llc llc1 = (llc)arr_hashMap[1].get("PixelYDimension");
        if(llc0 != null && llc1 != null) {
            arr_hashMap[0].put("ImageWidth", llc0);
            arr_hashMap[0].put("ImageLength", llc1);
        }
        if(arr_hashMap[4].isEmpty() && this.w(arr_hashMap[5])) {
            arr_hashMap[4] = arr_hashMap[5];
            arr_hashMap[5] = new HashMap();
        }
        this.w(arr_hashMap[4]);
        this.r(0, "ThumbnailOrientation", "Orientation");
        this.r(0, "ThumbnailImageLength", "ImageLength");
        this.r(0, "ThumbnailImageWidth", "ImageWidth");
        this.r(5, "ThumbnailOrientation", "Orientation");
        this.r(5, "ThumbnailImageLength", "ImageLength");
        this.r(5, "ThumbnailImageWidth", "ImageWidth");
        this.r(4, "Orientation", "ThumbnailOrientation");
        this.r(4, "ImageLength", "ThumbnailImageLength");
        this.r(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private static boolean v(FileDescriptor fileDescriptor0) {
        try {
            Os.lseek(fileDescriptor0, 0L, OsConstants.SEEK_CUR);
            return true;
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    private final boolean w(HashMap hashMap0) {
        llc llc0 = (llc)hashMap0.get("ImageLength");
        llc llc1 = (llc)hashMap0.get("ImageWidth");
        return llc0 != null && llc1 != null && (llc0.b(this.aa) <= 0x200 && llc1.b(this.aa) <= 0x200);
    }

    private final void x(llb llb0) {
        this.p(llb0);
        this.y(llb0, 0);
        this.z(llb0, 0);
        this.z(llb0, 5);
        this.z(llb0, 4);
        this.u();
        if(this.p == 8) {
            HashMap[] arr_hashMap = this.Y;
            llc llc0 = (llc)arr_hashMap[1].get("MakerNote");
            if(llc0 != null) {
                llb llb1 = new llb(llc0.d, null);
                llb1.c = this.aa;
                llb1.b(6);
                this.y(llb1, 9);
                llc llc1 = (llc)arr_hashMap[9].get("ColorSpace");
                if(llc1 != null) {
                    arr_hashMap[1].put("ColorSpace", llc1);
                }
            }
        }
    }

    // This method was un-flattened
    private final void y(llb llb0, int v) {
        long v17;
        int v16;
        lld lld1;
        int v15;
        int v14;
        int v13;
        int v10;
        int v1 = v;
        Set set0 = this.Z;
        set0.add(Integer.valueOf(llb0.b));
        int v2 = llb0.readShort();
        if(v2 > 0) {
            int v3 = 0;
            while(v3 < v2) {
                int v4 = llb0.readUnsignedShort();
                int v5 = llb0.readUnsignedShort();
                int v6 = llb0.readInt();
                long v7 = (long)llb0.b;
                Integer integer0 = v4;
                lld lld0 = (lld)llf.Q[v1].get(integer0);
                if(lld0 == null) {
                    v10 = v3;
                label_104:
                    llb0.c(v7 + 4L);
                    v13 = v2;
                    v14 = v10;
                }
                else if(v5 > 0) {
                    int[] arr_v = llf.h;
                    if(v5 < 14) {
                        int v8 = lld0.c;
                        if(v8 != 7 && v5 != 7 && v8 != v5) {
                            int v9 = lld0.d;
                            if(v9 != v5) {
                                if(v8 != 4) {
                                    if(v9 == 4) {
                                        v9 = 4;
                                    }
                                    else {
                                        goto label_25;
                                    }
                                }
                                if(v5 != 3) {
                                label_25:
                                    if(v8 != 9 && v9 != 9 || v5 != 8) {
                                        v10 = v3;
                                        goto label_104;
                                    }
                                }
                            }
                        }
                        if(v5 == 7) {
                            v5 = v8;
                        }
                        v10 = v3;
                        long v11 = ((long)v6) * ((long)arr_v[v5]);
                        if(v11 >= 0L && v11 <= 0x7FFFFFFFL) {
                            if(Long.compare(v11, 4L) > 0) {
                                int v12 = llb0.readInt();
                                v13 = v2;
                                v14 = v10;
                                if(this.p == 7) {
                                    String s = lld0.b;
                                    if("MakerNote".equals(s)) {
                                        this.ab = v12;
                                    }
                                    else if(v1 == 6) {
                                        if("ThumbnailImage".equals(s)) {
                                            this.ac = v12;
                                            this.ad = v6;
                                            llc llc0 = llc.i(6, this.aa);
                                            v15 = v6;
                                            lld1 = lld0;
                                            llc llc1 = llc.e(this.ac, this.aa);
                                            llc llc2 = llc.e(this.ad, this.aa);
                                            this.Y[4].put("Compression", llc0);
                                            this.Y[4].put("JPEGInterchangeFormat", llc1);
                                            this.Y[4].put("JPEGInterchangeFormatLength", llc2);
                                        }
                                        else {
                                            v15 = v6;
                                            lld1 = lld0;
                                        }
                                        v16 = 6;
                                        goto label_62;
                                    }
                                }
                                v15 = v6;
                                lld1 = lld0;
                                v16 = v;
                            label_62:
                                llb0.c(((long)v12));
                            }
                            else {
                                v13 = v2;
                                v14 = v10;
                                v15 = v6;
                                lld1 = lld0;
                                v16 = v;
                            }
                            Integer integer1 = (Integer)llf.T.get(integer0);
                            if(integer1 == null) {
                                int v18 = llb0.b + this.s;
                                byte[] arr_b = new byte[((int)v11)];
                                llb0.readFully(arr_b);
                                llc llc3 = new llc(v5, v15, ((long)v18), arr_b);
                                String s1 = lld1.b;
                                this.Y[v16].put(s1, llc3);
                                if("DNGVersion".equals(s1)) {
                                    this.p = 3;
                                }
                                if(("Make".equals(s1) || "Model".equals(s1)) && llc3.l(this.aa).contains("PENTAX") || "Compression".equals(s1) && llc3.b(this.aa) == 0xFFFF) {
                                    this.p = 8;
                                }
                                if(((long)llb0.b) != v7 + 4L) {
                                    llb0.c(v7 + 4L);
                                }
                            }
                            else {
                                switch(v5) {
                                    case 3: {
                                        v17 = (long)llb0.readUnsignedShort();
                                        break;
                                    }
                                    case 4: {
                                        v17 = llb0.a();
                                        break;
                                    }
                                    case 8: {
                                        v17 = (long)llb0.readShort();
                                        break;
                                    }
                                    case 9: 
                                    case 13: {
                                        v17 = (long)llb0.readInt();
                                        break;
                                    }
                                    default: {
                                        v17 = -1L;
                                    }
                                }
                                if(v17 > 0L && ((llb0.d == -1 || v17 < ((long)llb0.d)) && !set0.contains(Integer.valueOf(((int)v17))))) {
                                    llb0.c(v17);
                                    this.y(llb0, integer1.intValue());
                                }
                                llb0.c(v7 + 4L);
                            }
                        }
                        else {
                            goto label_104;
                        }
                    }
                    else {
                        v10 = v3;
                        goto label_104;
                    }
                }
                else {
                    v10 = v3;
                    goto label_104;
                }
                v3 = (short)(v14 + 1);
                v1 = v;
                v2 = v13;
            }
            int v19 = llb0.readInt();
            if(((long)v19) > 0L && !set0.contains(Integer.valueOf(v19))) {
                llb0.c(((long)v19));
                HashMap[] arr_hashMap = this.Y;
                if(arr_hashMap[4].isEmpty()) {
                    this.y(llb0, 4);
                    return;
                }
                if(arr_hashMap[5].isEmpty()) {
                    this.y(llb0, 5);
                }
            }
        }
    }

    private final void z(llb llb0, int v) {
        llc llc6;
        llc llc5;
        HashMap[] arr_hashMap = this.Y;
        llc llc0 = (llc)arr_hashMap[v].get("DefaultCropSize");
        llc llc1 = (llc)arr_hashMap[v].get("SensorTopBorder");
        llc llc2 = (llc)arr_hashMap[v].get("SensorLeftBorder");
        llc llc3 = (llc)arr_hashMap[v].get("SensorBottomBorder");
        llc llc4 = (llc)arr_hashMap[v].get("SensorRightBorder");
        if(llc0 != null) {
            if(llc0.a == 5) {
                lle[] arr_lle = (lle[])llc0.k(this.aa);
                if(arr_lle != null && arr_lle.length == 2) {
                    llc5 = llc.g(arr_lle[0], this.aa);
                    llc6 = llc.g(arr_lle[1], this.aa);
                    arr_hashMap[v].put("ImageWidth", llc5);
                    arr_hashMap[v].put("ImageLength", llc6);
                    return;
                }
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(arr_lle));
                return;
            }
            int[] arr_v = (int[])llc0.k(this.aa);
            if(arr_v != null && arr_v.length == 2) {
                llc5 = llc.i(arr_v[0], this.aa);
                llc6 = llc.i(arr_v[1], this.aa);
                arr_hashMap[v].put("ImageWidth", llc5);
                arr_hashMap[v].put("ImageLength", llc6);
                return;
            }
            Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(arr_v));
            return;
        }
        if(llc1 != null && llc2 != null && llc3 != null && llc4 != null) {
            int v1 = llc1.b(this.aa);
            int v2 = llc3.b(this.aa);
            int v3 = llc4.b(this.aa);
            int v4 = llc2.b(this.aa);
            if(v2 > v1 && v3 > v4) {
                llc llc7 = llc.i(v2 - v1, this.aa);
                llc llc8 = llc.i(v3 - v4, this.aa);
                arr_hashMap[v].put("ImageLength", llc7);
                arr_hashMap[v].put("ImageWidth", llc8);
            }
        }
        else if(((llc)arr_hashMap[v].get("ImageLength")) == null || ((llc)arr_hashMap[v].get("ImageWidth")) == null) {
            llc llc9 = (llc)arr_hashMap[v].get("JPEGInterchangeFormat");
            if(llc9 != null && ((llc)arr_hashMap[v].get("JPEGInterchangeFormatLength")) != null) {
                int v5 = llc9.b(this.aa);
                int v6 = llc9.b(this.aa);
                llb0.c(((long)v5));
                byte[] arr_b = new byte[v6];
                llb0.readFully(arr_b);
                this.j(new llb(arr_b), v5, v);
            }
        }
    }
}

