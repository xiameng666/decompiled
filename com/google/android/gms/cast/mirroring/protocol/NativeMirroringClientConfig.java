package com.google.android.gms.cast.mirroring.protocol;

import ibuq;
import java.util.List;

public final class NativeMirroringClientConfig {
    private final int appUid;
    private final Tags extraData;
    private final long maxTargetDelay;
    private final String remoteFriendlyName;
    private final List sendFormats;

    public NativeMirroringClientConfig(List list0, String s, long v, int v1, Tags tags0) {
        ibuq.f(list0, "sendFormats");
        ibuq.f(s, "remoteFriendlyName");
        ibuq.f(tags0, "extraData");
        super();
        this.sendFormats = list0;
        this.remoteFriendlyName = s;
        this.maxTargetDelay = v;
        this.appUid = v1;
        this.extraData = tags0;
    }

    public final List component1() {
        return this.sendFormats;
    }

    public final String component2() {
        return this.remoteFriendlyName;
    }

    public final long component3() {
        return this.maxTargetDelay;
    }

    public final int component4() {
        return this.appUid;
    }

    public final Tags component5() {
        return this.extraData;
    }

    public final NativeMirroringClientConfig copy(List list0, String s, long v, int v1, Tags tags0) {
        ibuq.f(list0, "sendFormats");
        ibuq.f(s, "remoteFriendlyName");
        ibuq.f(tags0, "extraData");
        return new NativeMirroringClientConfig(list0, s, v, v1, tags0);
    }

    public static NativeMirroringClientConfig copy$default(NativeMirroringClientConfig nativeMirroringClientConfig0, List list0, String s, long v, int v1, Tags tags0, int v2, Object object0) {
        if((v2 & 1) != 0) {
            list0 = nativeMirroringClientConfig0.sendFormats;
        }
        if((v2 & 2) != 0) {
            s = nativeMirroringClientConfig0.remoteFriendlyName;
        }
        if((v2 & 4) != 0) {
            v = nativeMirroringClientConfig0.maxTargetDelay;
        }
        if((v2 & 8) != 0) {
            v1 = nativeMirroringClientConfig0.appUid;
        }
        if((v2 & 16) != 0) {
            tags0 = nativeMirroringClientConfig0.extraData;
        }
        return nativeMirroringClientConfig0.copy(list0, s, v, v1, tags0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof NativeMirroringClientConfig)) {
            return false;
        }
        if(!ibuq.m(this.sendFormats, ((NativeMirroringClientConfig)object0).sendFormats)) {
            return false;
        }
        if(!ibuq.m(this.remoteFriendlyName, ((NativeMirroringClientConfig)object0).remoteFriendlyName)) {
            return false;
        }
        if(this.maxTargetDelay != ((NativeMirroringClientConfig)object0).maxTargetDelay) {
            return false;
        }
        return this.appUid == ((NativeMirroringClientConfig)object0).appUid ? ibuq.m(this.extraData, ((NativeMirroringClientConfig)object0).extraData) : false;
    }

    public final int getAppUid() {
        return this.appUid;
    }

    public final Tags getExtraData() {
        return this.extraData;
    }

    public final long getMaxTargetDelay() {
        return this.maxTargetDelay;
    }

    public final String getRemoteFriendlyName() {
        return this.remoteFriendlyName;
    }

    public final List getSendFormats() {
        return this.sendFormats;
    }

    @Override
    public int hashCode() {
        return (((this.sendFormats.hashCode() * 0x1F + this.remoteFriendlyName.hashCode()) * 0x1F + ((int)(this.maxTargetDelay ^ this.maxTargetDelay >>> 0x20))) * 0x1F + this.appUid) * 0x1F + this.extraData.hashCode();
    }

    @Override
    public String toString() {
        return "NativeMirroringClientConfig(sendFormats=" + this.sendFormats + ", remoteFriendlyName=" + this.remoteFriendlyName + ", maxTargetDelay=" + this.maxTargetDelay + ", appUid=" + this.appUid + ", extraData=" + this.extraData + ")";
    }
}

