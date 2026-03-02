package com.google.android.gms.cast.mirroring.protocol;

import auxu;
import ibuq;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class Stream {
    private String aesIvMask;
    private String aesKey;
    private Long bitRate;
    private Long channels;
    private Codec codecName;
    private String codecParameter;
    private String errorRecoveryMode;
    private long index;
    private Boolean intraRefreshEnable;
    private String level;
    private Long maxBitRate;
    private String maxFrameRate;
    private String profile;
    private String protection;
    private String receiverRtcpDscp;
    private boolean receiverRtcpEventLog;
    private List resolutions;
    private List rtpExtensions;
    private long rtpPayloadType;
    private String rtpProfile;
    private Long sampleRate;
    private long ssrc;
    private long storeTime;
    private long targetDelay;
    private String timeBase;
    private SourceType type;

    public Stream(long v, SourceType sourceType0, Codec codec0, long v1, long v2, String s, List list0, boolean z, long v3, long v4, String s1, String s2, Long long0, Long long1, Long long2, String s3, String s4, String s5, String s6, Long long3, String s7, String s8, List list1, Boolean boolean0, String s9, String s10) {
        ibuq.f(sourceType0, "type");
        ibuq.f(codec0, "codecName");
        ibuq.f(s, "rtpProfile");
        ibuq.f(list0, "rtpExtensions");
        ibuq.f(s1, "timeBase");
        ibuq.f(s2, "errorRecoveryMode");
        super();
        this.index = v;
        this.type = sourceType0;
        this.codecName = codec0;
        this.ssrc = v1;
        this.rtpPayloadType = v2;
        this.rtpProfile = s;
        this.rtpExtensions = list0;
        this.receiverRtcpEventLog = z;
        this.targetDelay = v3;
        this.storeTime = v4;
        this.timeBase = s1;
        this.errorRecoveryMode = s2;
        this.channels = long0;
        this.bitRate = long1;
        this.sampleRate = long2;
        this.profile = s3;
        this.level = s4;
        this.codecParameter = s5;
        this.receiverRtcpDscp = s6;
        this.maxBitRate = long3;
        this.maxFrameRate = s7;
        this.protection = s8;
        this.resolutions = list1;
        this.intraRefreshEnable = boolean0;
        this.aesIvMask = s9;
        this.aesKey = s10;
    }

    public Stream(long v, SourceType sourceType0, Codec codec0, long v1, long v2, String s, List list0, boolean z, long v3, long v4, String s1, String s2, Long long0, Long long1, Long long2, String s3, String s4, String s5, String s6, Long long3, String s7, String s8, List list1, Boolean boolean0, String s9, String s10, int v5, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, sourceType0, codec0, v1, v2, s, list0, z, v3, v4, s1, s2, ((v5 & 0x1000) == 0 ? long0 : null), ((v5 & 0x2000) == 0 ? long1 : null), ((v5 & 0x4000) == 0 ? long2 : null), ((0x8000 & v5) == 0 ? s3 : null), ((0x10000 & v5) == 0 ? s4 : null), ((0x20000 & v5) == 0 ? s5 : null), ((0x40000 & v5) == 0 ? s6 : null), ((0x80000 & v5) == 0 ? long3 : null), ((0x100000 & v5) == 0 ? s7 : null), ((0x200000 & v5) == 0 ? s8 : null), ((0x400000 & v5) == 0 ? list1 : null), ((0x800000 & v5) == 0 ? boolean0 : null), ((0x1000000 & v5) == 0 ? s9 : null), ((v5 & 0x2000000) == 0 ? s10 : null));
    }

    public final long component1() {
        return this.index;
    }

    public final long component10() {
        return this.storeTime;
    }

    public final String component11() {
        return this.timeBase;
    }

    public final String component12() {
        return this.errorRecoveryMode;
    }

    public final Long component13() {
        return this.channels;
    }

    public final Long component14() {
        return this.bitRate;
    }

    public final Long component15() {
        return this.sampleRate;
    }

    public final String component16() {
        return this.profile;
    }

    public final String component17() {
        return this.level;
    }

    public final String component18() {
        return this.codecParameter;
    }

    public final String component19() {
        return this.receiverRtcpDscp;
    }

    public final SourceType component2() {
        return this.type;
    }

    public final Long component20() {
        return this.maxBitRate;
    }

    public final String component21() {
        return this.maxFrameRate;
    }

    public final String component22() {
        return this.protection;
    }

    public final List component23() {
        return this.resolutions;
    }

    public final Boolean component24() {
        return this.intraRefreshEnable;
    }

    public final String component25() {
        return this.aesIvMask;
    }

    public final String component26() {
        return this.aesKey;
    }

    public final Codec component3() {
        return this.codecName;
    }

    public final long component4() {
        return this.ssrc;
    }

    public final long component5() {
        return this.rtpPayloadType;
    }

    public final String component6() {
        return this.rtpProfile;
    }

    public final List component7() {
        return this.rtpExtensions;
    }

    public final boolean component8() {
        return this.receiverRtcpEventLog;
    }

    public final long component9() {
        return this.targetDelay;
    }

    public final Stream copy(long v, SourceType sourceType0, Codec codec0, long v1, long v2, String s, List list0, boolean z, long v3, long v4, String s1, String s2, Long long0, Long long1, Long long2, String s3, String s4, String s5, String s6, Long long3, String s7, String s8, List list1, Boolean boolean0, String s9, String s10) {
        ibuq.f(sourceType0, "type");
        ibuq.f(codec0, "codecName");
        ibuq.f(s, "rtpProfile");
        ibuq.f(list0, "rtpExtensions");
        ibuq.f(s1, "timeBase");
        ibuq.f(s2, "errorRecoveryMode");
        return new Stream(v, sourceType0, codec0, v1, v2, s, list0, z, v3, v4, s1, s2, long0, long1, long2, s3, s4, s5, s6, long3, s7, s8, list1, boolean0, s9, s10);
    }

    public static Stream copy$default(Stream stream0, long v, SourceType sourceType0, Codec codec0, long v1, long v2, String s, List list0, boolean z, long v3, long v4, String s1, String s2, Long long0, Long long1, Long long2, String s3, String s4, String s5, String s6, Long long3, String s7, String s8, List list1, Boolean boolean0, String s9, String s10, int v5, Object object0) {
        long v11;
        long v10;
        long v6 = (v5 & 1) == 0 ? v : stream0.index;
        SourceType sourceType1 = (v5 & 2) == 0 ? sourceType0 : stream0.type;
        Codec codec1 = (v5 & 4) == 0 ? codec0 : stream0.codecName;
        long v7 = (v5 & 8) == 0 ? v1 : stream0.ssrc;
        long v8 = (v5 & 16) == 0 ? v2 : stream0.rtpPayloadType;
        String s11 = (v5 & 0x20) == 0 ? s : stream0.rtpProfile;
        List list2 = (v5 & 0x40) == 0 ? list0 : stream0.rtpExtensions;
        boolean z1 = (v5 & 0x80) == 0 ? z : stream0.receiverRtcpEventLog;
        long v9 = (v5 & 0x100) == 0 ? v3 : stream0.targetDelay;
        if((v5 & 0x200) == 0) {
            v10 = v6;
            v11 = v4;
        }
        else {
            v10 = v6;
            v11 = stream0.storeTime;
        }
        String s12 = (v5 & 0x400) == 0 ? s1 : stream0.timeBase;
        String s13 = (v5 & 0x800) == 0 ? s2 : stream0.errorRecoveryMode;
        Long long4 = (v5 & 0x1000) == 0 ? long0 : stream0.channels;
        Long long5 = (v5 & 0x2000) == 0 ? long1 : stream0.bitRate;
        Long long6 = (v5 & 0x4000) == 0 ? long2 : stream0.sampleRate;
        String s14 = (v5 & 0x8000) == 0 ? s3 : stream0.profile;
        String s15 = (v5 & 0x10000) == 0 ? s4 : stream0.level;
        String s16 = (v5 & 0x20000) == 0 ? s5 : stream0.codecParameter;
        String s17 = (v5 & 0x40000) == 0 ? s6 : stream0.receiverRtcpDscp;
        Long long7 = (v5 & 0x80000) == 0 ? long3 : stream0.maxBitRate;
        String s18 = (v5 & 0x100000) == 0 ? s7 : stream0.maxFrameRate;
        String s19 = (v5 & 0x200000) == 0 ? s8 : stream0.protection;
        List list3 = (v5 & 0x400000) == 0 ? list1 : stream0.resolutions;
        Boolean boolean1 = (v5 & 0x800000) == 0 ? boolean0 : stream0.intraRefreshEnable;
        String s20 = (v5 & 0x1000000) == 0 ? s9 : stream0.aesIvMask;
        return (v5 & 0x2000000) == 0 ? stream0.copy(v10, sourceType1, codec1, v7, v8, s11, list2, z1, v9, v11, s12, s13, long4, long5, long6, s14, s15, s16, s17, long7, s18, s19, list3, boolean1, s20, s10) : stream0.copy(v10, sourceType1, codec1, v7, v8, s11, list2, z1, v9, v11, s12, s13, long4, long5, long6, s14, s15, s16, s17, long7, s18, s19, list3, boolean1, s20, stream0.aesKey);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Stream)) {
            return false;
        }
        if(this.index != ((Stream)object0).index) {
            return false;
        }
        if(this.type != ((Stream)object0).type) {
            return false;
        }
        if(this.codecName != ((Stream)object0).codecName) {
            return false;
        }
        if(this.ssrc != ((Stream)object0).ssrc) {
            return false;
        }
        if(this.rtpPayloadType != ((Stream)object0).rtpPayloadType) {
            return false;
        }
        if(!ibuq.m(this.rtpProfile, ((Stream)object0).rtpProfile)) {
            return false;
        }
        if(!ibuq.m(this.rtpExtensions, ((Stream)object0).rtpExtensions)) {
            return false;
        }
        if(this.receiverRtcpEventLog != ((Stream)object0).receiverRtcpEventLog) {
            return false;
        }
        if(this.targetDelay != ((Stream)object0).targetDelay) {
            return false;
        }
        if(this.storeTime != ((Stream)object0).storeTime) {
            return false;
        }
        if(!ibuq.m(this.timeBase, ((Stream)object0).timeBase)) {
            return false;
        }
        if(!ibuq.m(this.errorRecoveryMode, ((Stream)object0).errorRecoveryMode)) {
            return false;
        }
        if(!ibuq.m(this.channels, ((Stream)object0).channels)) {
            return false;
        }
        if(!ibuq.m(this.bitRate, ((Stream)object0).bitRate)) {
            return false;
        }
        if(!ibuq.m(this.sampleRate, ((Stream)object0).sampleRate)) {
            return false;
        }
        if(!ibuq.m(this.profile, ((Stream)object0).profile)) {
            return false;
        }
        if(!ibuq.m(this.level, ((Stream)object0).level)) {
            return false;
        }
        if(!ibuq.m(this.codecParameter, ((Stream)object0).codecParameter)) {
            return false;
        }
        if(!ibuq.m(this.receiverRtcpDscp, ((Stream)object0).receiverRtcpDscp)) {
            return false;
        }
        if(!ibuq.m(this.maxBitRate, ((Stream)object0).maxBitRate)) {
            return false;
        }
        if(!ibuq.m(this.maxFrameRate, ((Stream)object0).maxFrameRate)) {
            return false;
        }
        if(!ibuq.m(this.protection, ((Stream)object0).protection)) {
            return false;
        }
        if(!ibuq.m(this.resolutions, ((Stream)object0).resolutions)) {
            return false;
        }
        if(!ibuq.m(this.intraRefreshEnable, ((Stream)object0).intraRefreshEnable)) {
            return false;
        }
        return ibuq.m(this.aesIvMask, ((Stream)object0).aesIvMask) ? ibuq.m(this.aesKey, ((Stream)object0).aesKey) : false;
    }

    public final String getAesIvMask() {
        return this.aesIvMask;
    }

    public final String getAesKey() {
        return this.aesKey;
    }

    public final Long getBitRate() {
        return this.bitRate;
    }

    public final Long getChannels() {
        return this.channels;
    }

    public final Codec getCodecName() {
        return this.codecName;
    }

    public final String getCodecParameter() {
        return this.codecParameter;
    }

    public final String getErrorRecoveryMode() {
        return this.errorRecoveryMode;
    }

    public final long getIndex() {
        return this.index;
    }

    public final Boolean getIntraRefreshEnable() {
        return this.intraRefreshEnable;
    }

    public final String getLevel() {
        return this.level;
    }

    public final Long getMaxBitRate() {
        return this.maxBitRate;
    }

    public final String getMaxFrameRate() {
        return this.maxFrameRate;
    }

    public final String getProfile() {
        return this.profile;
    }

    public final String getProtection() {
        return this.protection;
    }

    public final String getReceiverRtcpDscp() {
        return this.receiverRtcpDscp;
    }

    public final boolean getReceiverRtcpEventLog() {
        return this.receiverRtcpEventLog;
    }

    public final List getResolutions() {
        return this.resolutions;
    }

    public final List getRtpExtensions() {
        return this.rtpExtensions;
    }

    public final long getRtpPayloadType() {
        return this.rtpPayloadType;
    }

    public final String getRtpProfile() {
        return this.rtpProfile;
    }

    public final Long getSampleRate() {
        return this.sampleRate;
    }

    public final long getSsrc() {
        return this.ssrc;
    }

    public final long getStoreTime() {
        return this.storeTime;
    }

    public final long getTargetDelay() {
        return this.targetDelay;
    }

    public final String getTimeBase() {
        return this.timeBase;
    }

    public final SourceType getType() {
        return this.type;
    }

    @Override
    public int hashCode() {
        int v = ((((((((((auxu.a(this.index) * 0x1F + this.type.hashCode()) * 0x1F + this.codecName.hashCode()) * 0x1F + auxu.a(this.ssrc)) * 0x1F + auxu.a(this.rtpPayloadType)) * 0x1F + this.rtpProfile.hashCode()) * 0x1F + this.rtpExtensions.hashCode()) * 0x1F + (this.receiverRtcpEventLog ? 0x4CF : 0x4D5)) * 0x1F + auxu.a(this.targetDelay)) * 0x1F + auxu.a(this.storeTime)) * 0x1F + this.timeBase.hashCode()) * 0x1F + this.errorRecoveryMode.hashCode();
        int v1 = 0;
        int v2 = this.channels == null ? 0 : this.channels.hashCode();
        int v3 = this.bitRate == null ? 0 : this.bitRate.hashCode();
        int v4 = this.sampleRate == null ? 0 : this.sampleRate.hashCode();
        int v5 = this.profile == null ? 0 : this.profile.hashCode();
        int v6 = this.level == null ? 0 : this.level.hashCode();
        int v7 = this.codecParameter == null ? 0 : this.codecParameter.hashCode();
        int v8 = this.receiverRtcpDscp == null ? 0 : this.receiverRtcpDscp.hashCode();
        int v9 = this.maxBitRate == null ? 0 : this.maxBitRate.hashCode();
        int v10 = this.maxFrameRate == null ? 0 : this.maxFrameRate.hashCode();
        int v11 = this.protection == null ? 0 : this.protection.hashCode();
        int v12 = this.resolutions == null ? 0 : this.resolutions.hashCode();
        int v13 = this.intraRefreshEnable == null ? 0 : this.intraRefreshEnable.hashCode();
        int v14 = this.aesIvMask == null ? 0 : this.aesIvMask.hashCode();
        String s = this.aesKey;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (((((((((((((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v10) * 0x1F + v11) * 0x1F + v12) * 0x1F + v13) * 0x1F + v14) * 0x1F + v1;
    }

    public final void setAesIvMask(String s) {
        this.aesIvMask = s;
    }

    public final void setAesKey(String s) {
        this.aesKey = s;
    }

    public final void setBitRate(Long long0) {
        this.bitRate = long0;
    }

    public final void setChannels(Long long0) {
        this.channels = long0;
    }

    public final void setCodecName(Codec codec0) {
        ibuq.f(codec0, "<set-?>");
        this.codecName = codec0;
    }

    public final void setCodecParameter(String s) {
        this.codecParameter = s;
    }

    public final void setErrorRecoveryMode(String s) {
        ibuq.f(s, "<set-?>");
        this.errorRecoveryMode = s;
    }

    public final void setIndex(long v) {
        this.index = v;
    }

    public final void setIntraRefreshEnable(Boolean boolean0) {
        this.intraRefreshEnable = boolean0;
    }

    public final void setLevel(String s) {
        this.level = s;
    }

    public final void setMaxBitRate(Long long0) {
        this.maxBitRate = long0;
    }

    public final void setMaxFrameRate(String s) {
        this.maxFrameRate = s;
    }

    public final void setProfile(String s) {
        this.profile = s;
    }

    public final void setProtection(String s) {
        this.protection = s;
    }

    public final void setReceiverRtcpDscp(String s) {
        this.receiverRtcpDscp = s;
    }

    public final void setReceiverRtcpEventLog(boolean z) {
        this.receiverRtcpEventLog = z;
    }

    public final void setResolutions(List list0) {
        this.resolutions = list0;
    }

    public final void setRtpExtensions(List list0) {
        ibuq.f(list0, "<set-?>");
        this.rtpExtensions = list0;
    }

    public final void setRtpPayloadType(long v) {
        this.rtpPayloadType = v;
    }

    public final void setRtpProfile(String s) {
        ibuq.f(s, "<set-?>");
        this.rtpProfile = s;
    }

    public final void setSampleRate(Long long0) {
        this.sampleRate = long0;
    }

    public final void setSsrc(long v) {
        this.ssrc = v;
    }

    public final void setStoreTime(long v) {
        this.storeTime = v;
    }

    public final void setTargetDelay(long v) {
        this.targetDelay = v;
    }

    public final void setTimeBase(String s) {
        ibuq.f(s, "<set-?>");
        this.timeBase = s;
    }

    public final void setType(SourceType sourceType0) {
        ibuq.f(sourceType0, "<set-?>");
        this.type = sourceType0;
    }

    @Override
    public String toString() {
        return "Stream(index=" + this.index + ", type=" + this.type + ", codecName=" + this.codecName + ", ssrc=" + this.ssrc + ", rtpPayloadType=" + this.rtpPayloadType + ", rtpProfile=" + this.rtpProfile + ", rtpExtensions=" + this.rtpExtensions + ", receiverRtcpEventLog=" + this.receiverRtcpEventLog + ", targetDelay=" + this.targetDelay + ", storeTime=" + this.storeTime + ", timeBase=" + this.timeBase + ", errorRecoveryMode=" + this.errorRecoveryMode + ", channels=" + this.channels + ", bitRate=" + this.bitRate + ", sampleRate=" + this.sampleRate + ", profile=" + this.profile + ", level=" + this.level + ", codecParameter=" + this.codecParameter + ", receiverRtcpDscp=" + this.receiverRtcpDscp + ", maxBitRate=" + this.maxBitRate + ", maxFrameRate=" + this.maxFrameRate + ", protection=" + this.protection + ", resolutions=" + this.resolutions + ", intraRefreshEnable=" + this.intraRefreshEnable + ", aesIvMask=" + this.aesIvMask + ", aesKey=" + this.aesKey + ")";
    }
}

