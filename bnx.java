import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class bnx {
    static final bnz[] a;
    static final bnz[][] b;
    static final HashSet c;
    public static final String d;
    public final ByteOrder e;
    private static final bnz[] f;
    private static final bnz[] g;
    private static final bnz[] h;
    private static final bnz[] i;
    private final List j;

    static {
        bnz[] arr_bnz = {new bnz("ImageWidth", 0x100, 3, 4), new bnz("ImageLength", 0x101, 3, 4), new bnz("Make", 0x10F, 2), new bnz("Model", 0x110, 2), new bnz("Orientation", 274, 3), new bnz("XResolution", 282, 5), new bnz("YResolution", 283, 5), new bnz("ResolutionUnit", 296, 3), new bnz("Software", 305, 2), new bnz("DateTime", 306, 2), new bnz("YCbCrPositioning", 531, 3), new bnz("SubIFDPointer", 330, 4), new bnz("ExifIFDPointer", 0x8769, 4), new bnz("GPSInfoIFDPointer", 0x8825, 4)};
        bnx.f = arr_bnz;
        bnz[] arr_bnz1 = {new bnz("ExposureTime", 0x829A, 5), new bnz("FNumber", 0x829D, 5), new bnz("ExposureProgram", 34850, 3), new bnz("PhotographicSensitivity", 0x8827, 3), new bnz("SensitivityType", 0x8830, 3), new bnz("ExifVersion", 0x9000, 2), new bnz("DateTimeOriginal", 0x9003, 2), new bnz("DateTimeDigitized", 0x9004, 2), new bnz("ComponentsConfiguration", 0x9101, 7), new bnz("ShutterSpeedValue", 0x9201, 10), new bnz("ApertureValue", 0x9202, 5), new bnz("BrightnessValue", 0x9203, 10), new bnz("ExposureBiasValue", 0x9204, 10), new bnz("MaxApertureValue", 0x9205, 5), new bnz("MeteringMode", 0x9207, 3), new bnz("LightSource", 0x9208, 3), new bnz("Flash", 0x9209, 3), new bnz("FocalLength", 0x920A, 5), new bnz("SubSecTime", 0x9290, 2), new bnz("SubSecTimeOriginal", 0x9291, 2), new bnz("SubSecTimeDigitized", 0x9292, 2), new bnz("FlashpixVersion", 0xA000, 7), new bnz("ColorSpace", 0xA001, 3), new bnz("PixelXDimension", 0xA002, 3, 4), new bnz("PixelYDimension", 0xA003, 3, 4), new bnz("InteroperabilityIFDPointer", 0xA005, 4), new bnz("FocalPlaneResolutionUnit", 0xA210, 3), new bnz("SensingMethod", 0xA217, 3), new bnz("FileSource", 0xA300, 7), new bnz("SceneType", 0xA301, 7), new bnz("CustomRendered", 0xA401, 3), new bnz("ExposureMode", 0xA402, 3), new bnz("WhiteBalance", 0xA403, 3), new bnz("SceneCaptureType", 0xA406, 3), new bnz("Contrast", 0xA408, 3), new bnz("Saturation", 0xA409, 3), new bnz("Sharpness", 0xA40A, 3)};
        bnx.g = arr_bnz1;
        bnz[] arr_bnz2 = {new bnz("GPSVersionID", 0, 1), new bnz("GPSLatitudeRef", 1, 2), new bnz("GPSLatitude", 2, 5, 10), new bnz("GPSLongitudeRef", 3, 2), new bnz("GPSLongitude", 4, 5, 10), new bnz("GPSAltitudeRef", 5, 1), new bnz("GPSAltitude", 6, 5), new bnz("GPSTimeStamp", 7, 5), new bnz("GPSSpeedRef", 12, 2), new bnz("GPSTrackRef", 14, 2), new bnz("GPSImgDirectionRef", 16, 2), new bnz("GPSDestBearingRef", 23, 2), new bnz("GPSDestDistanceRef", 25, 2)};
        bnx.h = arr_bnz2;
        bnx.a = new bnz[]{new bnz("SubIFDPointer", 330, 4), new bnz("ExifIFDPointer", 0x8769, 4), new bnz("GPSInfoIFDPointer", 0x8825, 4), new bnz("InteroperabilityIFDPointer", 0xA005, 4)};
        bnz[] arr_bnz3 = {new bnz("InteroperabilityIndex", 1, 2)};
        bnx.i = arr_bnz3;
        bnx.b = new bnz[][]{arr_bnz, arr_bnz1, arr_bnz2, arr_bnz3};
        bnx.c = new HashSet(Arrays.asList(new String[]{"FNumber", "ExposureTime", "GPSTimeStamp"}));
        bnx.d = new String(new byte[]{1, 2, 3, 0}, StandardCharsets.UTF_8);
    }

    public bnx(ByteOrder byteOrder0, List list0) {
        kay.d(list0.size() == 4, "Malformed attributes list. Number of IFDs mismatch.");
        this.e = byteOrder0;
        this.j = list0;
    }

    final Map a(int v) {
        kay.f(v, 0, 4, a.f(v, "Invalid IFD index: ", ". Index should be between [0, EXIF_TAGS.length] "));
        return (Map)this.j.get(v);
    }
}

