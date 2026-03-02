package com.google.android.gms.cast.mirroring.protocol;

import auxv;
import ibuq;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class Tags {
    private final String encodedVideoFilePath;
    private final long maxBitrate;
    private final String maxFramerate;
    private final long minLatency;
    private final String receiverProductName;
    private final String receiverVersion;
    private final String resolution;
    private final String senderBuild;
    private final long senderGmsCoreVersion;
    private final String senderModel;
    private final String senderPlatform;
    private final String senderVersion;

    public Tags(long v, long v1, String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, long v2, String s8) {
        ibuq.f(s2, "receiverProductName");
        ibuq.f(s3, "receiverVersion");
        ibuq.f(s4, "senderPlatform");
        ibuq.f(s5, "senderBuild");
        ibuq.f(s6, "senderModel");
        ibuq.f(s7, "senderVersion");
        super();
        this.maxBitrate = v;
        this.minLatency = v1;
        this.resolution = s;
        this.maxFramerate = s1;
        this.receiverProductName = s2;
        this.receiverVersion = s3;
        this.senderPlatform = s4;
        this.senderBuild = s5;
        this.senderModel = s6;
        this.senderVersion = s7;
        this.senderGmsCoreVersion = v2;
        this.encodedVideoFilePath = s8;
    }

    public Tags(long v, long v1, String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, long v2, String s8, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, v1, ((v3 & 4) == 0 ? s : null), ((v3 & 8) == 0 ? s1 : null), s2, s3, s4, s5, s6, s7, v2, ((v3 & 0x800) == 0 ? s8 : null));
    }

    public final long component1() {
        return this.maxBitrate;
    }

    public final String component10() {
        return this.senderVersion;
    }

    public final long component11() {
        return this.senderGmsCoreVersion;
    }

    public final String component12() {
        return this.encodedVideoFilePath;
    }

    public final long component2() {
        return this.minLatency;
    }

    public final String component3() {
        return this.resolution;
    }

    public final String component4() {
        return this.maxFramerate;
    }

    public final String component5() {
        return this.receiverProductName;
    }

    public final String component6() {
        return this.receiverVersion;
    }

    public final String component7() {
        return this.senderPlatform;
    }

    public final String component8() {
        return this.senderBuild;
    }

    public final String component9() {
        return this.senderModel;
    }

    public final Tags copy(long v, long v1, String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, long v2, String s8) {
        ibuq.f(s2, "receiverProductName");
        ibuq.f(s3, "receiverVersion");
        ibuq.f(s4, "senderPlatform");
        ibuq.f(s5, "senderBuild");
        ibuq.f(s6, "senderModel");
        ibuq.f(s7, "senderVersion");
        return new Tags(v, v1, s, s1, s2, s3, s4, s5, s6, s7, v2, s8);
    }

    public static Tags copy$default(Tags tags0, long v, long v1, String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, long v2, String s8, int v3, Object object0) {
        long v4 = (v3 & 1) == 0 ? v : tags0.maxBitrate;
        long v5 = (v3 & 2) == 0 ? v1 : tags0.minLatency;
        String s9 = (v3 & 4) == 0 ? s : tags0.resolution;
        String s10 = (v3 & 8) == 0 ? s1 : tags0.maxFramerate;
        String s11 = (v3 & 16) == 0 ? s2 : tags0.receiverProductName;
        String s12 = (v3 & 0x20) == 0 ? s3 : tags0.receiverVersion;
        String s13 = (v3 & 0x40) == 0 ? s4 : tags0.senderPlatform;
        String s14 = (v3 & 0x80) == 0 ? s5 : tags0.senderBuild;
        String s15 = (v3 & 0x100) == 0 ? s6 : tags0.senderModel;
        String s16 = (v3 & 0x200) == 0 ? s7 : tags0.senderVersion;
        long v6 = (v3 & 0x400) == 0 ? v2 : tags0.senderGmsCoreVersion;
        return (v3 & 0x800) == 0 ? tags0.copy(v4, v5, s9, s10, s11, s12, s13, s14, s15, s16, v6, s8) : tags0.copy(v4, v5, s9, s10, s11, s12, s13, s14, s15, s16, v6, tags0.encodedVideoFilePath);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Tags)) {
            return false;
        }
        if(this.maxBitrate != ((Tags)object0).maxBitrate) {
            return false;
        }
        if(this.minLatency != ((Tags)object0).minLatency) {
            return false;
        }
        if(!ibuq.m(this.resolution, ((Tags)object0).resolution)) {
            return false;
        }
        if(!ibuq.m(this.maxFramerate, ((Tags)object0).maxFramerate)) {
            return false;
        }
        if(!ibuq.m(this.receiverProductName, ((Tags)object0).receiverProductName)) {
            return false;
        }
        if(!ibuq.m(this.receiverVersion, ((Tags)object0).receiverVersion)) {
            return false;
        }
        if(!ibuq.m(this.senderPlatform, ((Tags)object0).senderPlatform)) {
            return false;
        }
        if(!ibuq.m(this.senderBuild, ((Tags)object0).senderBuild)) {
            return false;
        }
        if(!ibuq.m(this.senderModel, ((Tags)object0).senderModel)) {
            return false;
        }
        if(!ibuq.m(this.senderVersion, ((Tags)object0).senderVersion)) {
            return false;
        }
        return this.senderGmsCoreVersion == ((Tags)object0).senderGmsCoreVersion ? ibuq.m(this.encodedVideoFilePath, ((Tags)object0).encodedVideoFilePath) : false;
    }

    public final String getEncodedVideoFilePath() {
        return this.encodedVideoFilePath;
    }

    public final long getMaxBitrate() {
        return this.maxBitrate;
    }

    public final String getMaxFramerate() {
        return this.maxFramerate;
    }

    public final long getMinLatency() {
        return this.minLatency;
    }

    public final String getReceiverProductName() {
        return this.receiverProductName;
    }

    public final String getReceiverVersion() {
        return this.receiverVersion;
    }

    public final String getResolution() {
        return this.resolution;
    }

    public final String getSenderBuild() {
        return this.senderBuild;
    }

    public final long getSenderGmsCoreVersion() {
        return this.senderGmsCoreVersion;
    }

    public final String getSenderModel() {
        return this.senderModel;
    }

    public final String getSenderPlatform() {
        return this.senderPlatform;
    }

    public final String getSenderVersion() {
        return this.senderVersion;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = ((((((((auxv.a(this.maxBitrate) * 0x1F + auxv.a(this.minLatency)) * 0x1F + (this.resolution == null ? 0 : this.resolution.hashCode())) * 0x1F + (this.maxFramerate == null ? 0 : this.maxFramerate.hashCode())) * 0x1F + this.receiverProductName.hashCode()) * 0x1F + this.receiverVersion.hashCode()) * 0x1F + this.senderPlatform.hashCode()) * 0x1F + this.senderBuild.hashCode()) * 0x1F + this.senderModel.hashCode()) * 0x1F + this.senderVersion.hashCode();
        long v2 = this.senderGmsCoreVersion;
        String s = this.encodedVideoFilePath;
        if(s != null) {
            v = s.hashCode();
        }
        return (v1 * 0x1F + auxv.a(v2)) * 0x1F + v;
    }

    @Override
    public String toString() {
        return "Tags(maxBitrate=" + this.maxBitrate + ", minLatency=" + this.minLatency + ", resolution=" + this.resolution + ", maxFramerate=" + this.maxFramerate + ", receiverProductName=" + this.receiverProductName + ", receiverVersion=" + this.receiverVersion + ", senderPlatform=" + this.senderPlatform + ", senderBuild=" + this.senderBuild + ", senderModel=" + this.senderModel + ", senderVersion=" + this.senderVersion + ", senderGmsCoreVersion=" + this.senderGmsCoreVersion + ", encodedVideoFilePath=" + this.encodedVideoFilePath + ")";
    }
}

