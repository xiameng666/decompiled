import android.location.Location;
import android.util.Log;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class bnr {
    public static final String a = "bnr";
    public static final List b;
    public static final List c;
    public final llf d;
    private static final ThreadLocal e;
    private static final ThreadLocal f;
    private static final ThreadLocal g;

    static {
        bnr.e = new bnn();
        bnr.f = new bno();
        bnr.g = new bnp();
        bnr.b = Arrays.asList(new String[]{"ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType"});
        bnr.c = Arrays.asList(new String[]{"ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation"});
    }

    public bnr(llf llf0) {
        this.d = llf0;
    }

    public final int a() {
        return this.d.c("Orientation", 0);
    }

    public final int b() {
        switch(this.a()) {
            case 3: 
            case 4: {
                return 180;
            }
            case 5: {
                return 270;
            }
            case 6: 
            case 7: {
                return 90;
            }
            case 8: {
                return 270;
            }
            default: {
                return 0;
            }
        }
    }

    public static bnr c(InputStream inputStream0) {
        return new bnr(new llf(inputStream0));
    }

    private static final long d(String s) {
        if(s != null) {
            try {
                return ((SimpleDateFormat)bnr.g.get()).parse(s).getTime();
            }
            catch(ParseException unused_ex) {
            }
        }
        return -1L;
    }

    private static final long e(String s, String s1) {
        if(s == null && s1 == null) {
            return -1L;
        }
        if(s1 == null) {
            try {
                return ((SimpleDateFormat)bnr.e.get()).parse(s).getTime();
            }
            catch(ParseException unused_ex) {
                return -1L;
            }
        }
        if(s == null) {
            try {
                return ((SimpleDateFormat)bnr.f.get()).parse(s1).getTime();
            }
            catch(ParseException unused_ex) {
                return -1L;
            }
        }
        return bnr.d(a.r(s1, s, " "));
    }

    @Override
    public final String toString() {
        Location location0;
        Integer integer4;
        Integer integer3;
        double f1;
        double[] arr_f;
        boolean z;
        Locale locale0 = Locale.ENGLISH;
        llf llf0 = this.d;
        Integer integer0 = llf0.c("ImageWidth", 0);
        Integer integer1 = llf0.c("ImageLength", 0);
        Integer integer2 = this.b();
        switch(this.a()) {
            case 4: 
            case 5: 
            case 7: {
                z = true;
                break;
            }
            default: {
                z = false;
            }
        }
        Boolean boolean0 = Boolean.valueOf(z);
        Boolean boolean1 = Boolean.valueOf(this.a() == 2);
        String s = llf0.d("GPSProcessingMethod");
        String s1 = llf0.d("GPSLatitude");
        String s2 = llf0.d("GPSLatitudeRef");
        String s3 = llf0.d("GPSLongitude");
        String s4 = llf0.d("GPSLongitudeRef");
        if(s1 != null && s2 != null && s3 != null && s4 != null) {
            try {
                arr_f = new double[]{llf.a(s1, s2), llf.a(s3, s4)};
            }
            catch(IllegalArgumentException unused_ex) {
                Log.w("ExifInterface", "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", s1, s2, s3, s4));
                arr_f = null;
            }
        }
        else {
            arr_f = null;
        }
        llf llf1 = this.d;
        double f = llf1.b("GPSAltitude", -1.0);
        int v = -1;
        int v1 = llf1.c("GPSAltitudeRef", -1);
        if(Double.compare(f, 0.0) >= 0 && v1 >= 0) {
            if(v1 != 1) {
                v = 1;
            }
            f1 = f * ((double)v);
        }
        else {
            f1 = 0.0;
        }
        double f2 = llf1.b("GPSSpeed", 0.0);
        String s5 = llf1.d("GPSSpeedRef");
        if(s5 == null) {
            s5 = "K";
        }
        long v2 = bnr.e(llf1.d("GPSDateStamp"), llf1.d("GPSTimeStamp"));
        long v3 = -1L;
        if(arr_f == null) {
            integer3 = integer0;
            integer4 = integer1;
            location0 = null;
        }
        else {
            if(s == null) {
                s = bnr.a;
            }
            Location location1 = new Location(s);
            integer3 = integer0;
            integer4 = integer1;
            location1.setLatitude(arr_f[0]);
            location1.setLongitude(arr_f[1]);
            if(f1 != 0.0) {
                location1.setAltitude(f1);
            }
            if(f2 != 0.0) {
                switch(s5.hashCode()) {
                    case 77: {
                        if(!s5.equals("M")) {
                            f2 *= 0.621371;
                        }
                        break;
                    }
                    case 78: {
                        f2 *= (s5.equals("N") ? 1.15078 : 0.621371);
                        break;
                    }
                    default: {
                        f2 *= 0.621371;
                    }
                }
                location1.setSpeed(((float)(f2 / 2.23694)));
            }
            if(v2 != -1L) {
                location1.setTime(v2);
            }
            location0 = location1;
        }
        long v4 = bnr.d(llf1.d("DateTimeOriginal"));
        if(v4 != -1L) {
            String s6 = llf1.d("SubSecTimeOriginal");
            if(s6 != null) {
                try {
                    long v5;
                    for(v5 = Long.parseLong(s6); v5 > 1000L; v5 /= 10L) {
                    }
                    v4 += v5;
                }
                catch(NumberFormatException unused_ex) {
                }
            }
            v3 = v4;
        }
        return String.format(locale0, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", integer3, integer4, integer2, boolean0, boolean1, location0, v3, this.d.d("ImageDescription"));
    }
}

