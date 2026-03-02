import android.hardware.camera2.CameraCharacteristics;
import android.os.Build.VERSION;
import android.os.Build;
import androidx.camera.camera2.internal.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk;
import androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

public final class axs {
    public static blp a(awp awp0) {
        boolean z15;
        boolean z14;
        boolean z7;
        try {
            Object object0 = blm.b.c.b.get();
            gmcd gmcd0 = (object0 instanceof bme) ? new bpu(((bme)object0).a()) : bpt.b(object0);
            blk blk0 = (blk)gmcd0.get();
        }
        catch(ExecutionException | InterruptedException exception0) {
            throw new AssertionError("Unexpected error in QuirkSettings StateObservable", exception0);
        }
        ArrayList arrayList0 = new ArrayList();
        Integer integer0 = (Integer)awp0.c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        boolean z = false;
        if(blk0.a(AeFpsRangeLegacyQuirk.class, integer0 != null && ((int)integer0) == 2)) {
            arrayList0.add(new AeFpsRangeLegacyQuirk(awp0));
        }
        boolean z1 = ((Integer)awp0.c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)) == null;
        if(blk0.a(AspectRatioLegacyApi21Quirk.class, false)) {
            arrayList0.add(new AspectRatioLegacyApi21Quirk());
        }
        boolean z2 = JpegHalCorruptImageQuirk.a.contains(Build.DEVICE.toLowerCase(Locale.US));
        if(blk0.a(JpegHalCorruptImageQuirk.class, z2)) {
            arrayList0.add(new JpegHalCorruptImageQuirk());
        }
        boolean z3 = JpegCaptureDownsizingQuirk.a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((int)(((Integer)awp0.c(CameraCharacteristics.LENS_FACING)))) == 0;
        if(blk0.a(JpegCaptureDownsizingQuirk.class, z3)) {
            arrayList0.add(new JpegCaptureDownsizingQuirk());
        }
        Integer integer1 = (Integer)awp0.c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if(blk0.a(CamcorderProfileResolutionQuirk.class, integer1 != null && ((int)integer1) == 2)) {
            arrayList0.add(new CamcorderProfileResolutionQuirk(awp0));
        }
        boolean z4 = ("samsungexynos7420".equalsIgnoreCase(Build.HARDWARE) || "universal7420".equalsIgnoreCase(Build.HARDWARE)) && ((int)(((Integer)awp0.c(CameraCharacteristics.LENS_FACING)))) == 1;
        if(blk0.a(CaptureNoResponseQuirk.class, z4)) {
            arrayList0.add(new CaptureNoResponseQuirk());
        }
        Integer integer2 = (Integer)awp0.c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if(blk0.a(LegacyCameraOutputConfigNullPointerQuirk.class, integer2 != null && ((int)integer2) == 2)) {
            arrayList0.add(new LegacyCameraOutputConfigNullPointerQuirk());
        }
        if(blk0.a(LegacyCameraSurfaceCleanupQuirk.class, false)) {
            arrayList0.add(new LegacyCameraSurfaceCleanupQuirk());
        }
        boolean z5 = ImageCaptureWashedOutImageQuirk.a.contains(Build.MODEL.toUpperCase(Locale.US)) && ((int)(((Integer)awp0.c(CameraCharacteristics.LENS_FACING)))) == 1;
        if(blk0.a(ImageCaptureWashedOutImageQuirk.class, z5)) {
            arrayList0.add(new ImageCaptureWashedOutImageQuirk());
        }
        boolean z6 = CameraNoResponseWhenEnablingFlashQuirk.a.contains(Build.MODEL.toUpperCase(Locale.US)) && ((int)(((Integer)awp0.c(CameraCharacteristics.LENS_FACING)))) == 1;
        if(blk0.a(CameraNoResponseWhenEnablingFlashQuirk.class, z6)) {
            arrayList0.add(new CameraNoResponseWhenEnablingFlashQuirk());
        }
        if("motorola".equalsIgnoreCase(Build.BRAND) && "MotoG3".equalsIgnoreCase(Build.MODEL)) {
            z7 = true;
        }
        else if((!"samsung".equalsIgnoreCase(Build.BRAND) || !"SM-G532F".equalsIgnoreCase(Build.MODEL)) && (!"samsung".equalsIgnoreCase(Build.BRAND) || !"SM-J700F".equalsIgnoreCase(Build.MODEL)) && (!"samsung".equalsIgnoreCase(Build.BRAND) || !"SM-A920F".equalsIgnoreCase(Build.MODEL)) && (!"samsung".equalsIgnoreCase(Build.BRAND) || !"SM-J415F".equalsIgnoreCase(Build.MODEL)) && (!"xiaomi".equalsIgnoreCase(Build.BRAND) || !"Mi A1".equalsIgnoreCase(Build.MODEL))) {
            z7 = false;
        }
        else {
            z7 = true;
        }
        if(blk0.a(YuvImageOnePixelShiftQuirk.class, z7)) {
            arrayList0.add(new YuvImageOnePixelShiftQuirk());
        }
        boolean z8 = false;
        for(Object object1: FlashTooSlowQuirk.a) {
            if(Build.MODEL.toUpperCase(Locale.US).startsWith(((String)object1))) {
                if(((int)(((Integer)awp0.c(CameraCharacteristics.LENS_FACING)))) != 1) {
                    break;
                }
                z8 = true;
                break;
            }
        }
        if(blk0.a(FlashTooSlowQuirk.class, z8)) {
            arrayList0.add(new FlashTooSlowQuirk());
        }
        boolean z9 = Build.BRAND.equalsIgnoreCase("SAMSUNG") && Build.VERSION.SDK_INT < 33 && ((int)(((Integer)awp0.c(CameraCharacteristics.LENS_FACING)))) == 0;
        if(blk0.a(AfRegionFlipHorizontallyQuirk.class, z9)) {
            arrayList0.add(new AfRegionFlipHorizontallyQuirk());
        }
        Integer integer3 = (Integer)awp0.c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if(blk0.a(ConfigureSurfaceToSecondarySessionFailQuirk.class, integer3 != null && ((int)integer3) == 2)) {
            arrayList0.add(new ConfigureSurfaceToSecondarySessionFailQuirk());
        }
        Integer integer4 = (Integer)awp0.c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if(blk0.a(PreviewOrientationIncorrectQuirk.class, integer4 != null && ((int)integer4) == 2)) {
            arrayList0.add(new PreviewOrientationIncorrectQuirk());
        }
        Integer integer5 = (Integer)awp0.c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if(blk0.a(CaptureSessionStuckQuirk.class, integer5 != null && ((int)integer5) == 2)) {
            arrayList0.add(new CaptureSessionStuckQuirk());
        }
        boolean z10 = ImageCaptureFlashNotFireQuirk.b.contains(Build.MODEL.toLowerCase(Locale.US)) && ((int)(((Integer)awp0.c(CameraCharacteristics.LENS_FACING)))) == 0 || ImageCaptureFlashNotFireQuirk.a.contains(Build.MODEL.toLowerCase(Locale.US));
        if(blk0.a(ImageCaptureFlashNotFireQuirk.class, z10)) {
            arrayList0.add(new ImageCaptureFlashNotFireQuirk());
        }
        boolean z11 = ImageCaptureWithFlashUnderexposureQuirk.a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((int)(((Integer)awp0.c(CameraCharacteristics.LENS_FACING)))) == 1;
        if(blk0.a(ImageCaptureWithFlashUnderexposureQuirk.class, z11)) {
            arrayList0.add(new ImageCaptureWithFlashUnderexposureQuirk());
        }
        boolean z12 = ImageCaptureFailWithAutoFlashQuirk.a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((int)(((Integer)awp0.c(CameraCharacteristics.LENS_FACING)))) == 0;
        if(blk0.a(ImageCaptureFailWithAutoFlashQuirk.class, z12)) {
            arrayList0.add(new ImageCaptureFailWithAutoFlashQuirk());
        }
        Integer integer6 = (Integer)awp0.c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if(blk0.a(IncorrectCaptureStateQuirk.class, integer6 != null && ((int)integer6) == 2)) {
            arrayList0.add(new IncorrectCaptureStateQuirk());
        }
        boolean z13 = false;
        for(Object object2: TorchFlashRequiredFor3aUpdateQuirk.a) {
            if(Build.MODEL.toUpperCase(Locale.US).equals(((String)object2))) {
                if(((int)(((Integer)awp0.c(CameraCharacteristics.LENS_FACING)))) != 0) {
                    break;
                }
                z13 = true;
                break;
            }
        }
        if(blk0.a(TorchFlashRequiredFor3aUpdateQuirk.class, z13)) {
            arrayList0.add(new TorchFlashRequiredFor3aUpdateQuirk(awp0));
        }
        if("HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) && "HUAWEI ALE-L04".equalsIgnoreCase(Build.MODEL)) {
            z14 = true;
        }
        else if((!"Samsung".equalsIgnoreCase(Build.MANUFACTURER) || !"sm-j320f".equalsIgnoreCase(Build.MODEL)) && (!"Samsung".equalsIgnoreCase(Build.MANUFACTURER) || !"sm-j700f".equalsIgnoreCase(Build.MODEL)) && (!"Samsung".equalsIgnoreCase(Build.MANUFACTURER) || !"sm-j111f".equalsIgnoreCase(Build.MODEL)) && (!"OPPO".equalsIgnoreCase(Build.MANUFACTURER) || !"A37F".equalsIgnoreCase(Build.MODEL)) && (!"Samsung".equalsIgnoreCase(Build.MANUFACTURER) || !"sm-j510fn".equalsIgnoreCase(Build.MODEL))) {
            z14 = false;
        }
        else {
            z14 = true;
        }
        if(blk0.a(PreviewStretchWhenVideoCaptureIsBoundQuirk.class, z14)) {
            arrayList0.add(new PreviewStretchWhenVideoCaptureIsBoundQuirk());
        }
        if(blk0.a(PreviewDelayWhenVideoCaptureIsBoundQuirk.class, "Huawei".equalsIgnoreCase(Build.MANUFACTURER))) {
            arrayList0.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk());
        }
        if(!ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.a() && !ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.c() && !ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.e() && !ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.d()) {
            "pixel 4 xl".equalsIgnoreCase(Build.MODEL);
            if((!"motorola".equalsIgnoreCase(Build.BRAND) || !"moto e13".equalsIgnoreCase(Build.MODEL)) && (!"samsung".equalsIgnoreCase(Build.BRAND) || !"gta8".equalsIgnoreCase(Build.DEVICE) && !"gta8wifi".equalsIgnoreCase(Build.DEVICE)) && !ibzk.k("Spreadtrum", Build.SOC_MANUFACTURER, true)) {
                String s = Build.HARDWARE;
                ibuq.e(s, "HARDWARE");
                String s1 = s.toLowerCase(Locale.ROOT);
                ibuq.e(s1, "toLowerCase(...)");
                if(ibzk.W(s1, "ums")) {
                    z15 = true;
                }
                else {
                    String s2 = Build.MANUFACTURER;
                    ibuq.e(s2, "MANUFACTURER");
                    if(axt.a(s2)) {
                    label_118:
                        String s4 = Build.HARDWARE;
                        ibuq.e(s4, "HARDWARE");
                        String s5 = s4.toLowerCase(Locale.ROOT);
                        ibuq.e(s5, "toLowerCase(...)");
                        z15 = ibzk.W(s5, "sp");
                    }
                    else {
                        String s3 = Build.BRAND;
                        ibuq.e(s3, "BRAND");
                        if(!axt.a(s3)) {
                            z15 = false;
                            goto label_132;
                        }
                        goto label_118;
                    }
                }
            }
            else {
                z15 = true;
            }
        }
        else {
            z15 = true;
        }
    label_132:
        if(blk0.a(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class, z15)) {
            arrayList0.add(new ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
        }
        boolean z16 = "Pixel 8".equalsIgnoreCase(Build.MODEL) && ((int)(((Integer)awp0.c(CameraCharacteristics.LENS_FACING)))) == 0;
        if(blk0.a(TemporalNoiseQuirk.class, z16)) {
            arrayList0.add(new TemporalNoiseQuirk());
        }
        boolean z17 = ImageCaptureFailedForVideoSnapshotQuirk.a.contains(Build.MODEL.toLowerCase(Locale.US)) || "Spreadtrum".equalsIgnoreCase(Build.SOC_MANUFACTURER) || Build.HARDWARE.toLowerCase(Locale.US).startsWith("ums") || "itel".equalsIgnoreCase(Build.BRAND) && Build.HARDWARE.toLowerCase(Locale.US).startsWith("sp") || "HUAWEI".equalsIgnoreCase(Build.BRAND) && "FIG-LX1".equalsIgnoreCase(Build.MODEL);
        if(blk0.a(ImageCaptureFailedForVideoSnapshotQuirk.class, z17)) {
            arrayList0.add(new ImageCaptureFailedForVideoSnapshotQuirk());
        }
        if("motorola".equalsIgnoreCase(Build.BRAND) && "moto e20".equalsIgnoreCase(Build.MODEL) && awp0.a.equals("1")) {
            z = true;
        }
        if(blk0.a(CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class, z)) {
            arrayList0.add(new CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk());
        }
        boolean z18 = AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.a();
        if(blk0.a(AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.class, z18)) {
            arrayList0.add(new AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk());
        }
        blp blp0 = new blp(arrayList0);
        blp.d(blp0);
        bcs.h("CameraQuirks");
        return blp0;
    }
}

