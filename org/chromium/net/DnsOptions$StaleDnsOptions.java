package org.chromium.net;

public class DnsOptions.StaleDnsOptions {
    private final Boolean mAllowCrossNetworkUsage;
    private final Long mFreshLookupTimeoutMillis;
    private final Long mMaxExpiredDelayMillis;
    private final Boolean mUseStaleOnNameNotResolved;

    public DnsOptions.StaleDnsOptions(DnsOptions.StaleDnsOptions.Builder dnsOptions$StaleDnsOptions$Builder0) {
        this.mFreshLookupTimeoutMillis = dnsOptions$StaleDnsOptions$Builder0.mFreshLookupTimeoutMillis;
        this.mMaxExpiredDelayMillis = dnsOptions$StaleDnsOptions$Builder0.mMaxExpiredDelayMillis;
        this.mAllowCrossNetworkUsage = dnsOptions$StaleDnsOptions$Builder0.mAllowCrossNetworkUsage;
        this.mUseStaleOnNameNotResolved = dnsOptions$StaleDnsOptions$Builder0.mUseStaleOnNameNotResolved;
    }

    public static DnsOptions.StaleDnsOptions.Builder builder() {
        return new DnsOptions.StaleDnsOptions.Builder();
    }

    public Boolean getAllowCrossNetworkUsage() {
        return this.mAllowCrossNetworkUsage;
    }

    public Long getFreshLookupTimeoutMillis() {
        return this.mFreshLookupTimeoutMillis;
    }

    public Long getMaxExpiredDelayMillis() {
        return this.mMaxExpiredDelayMillis;
    }

    public Boolean getUseStaleOnNameNotResolved() {
        return this.mUseStaleOnNameNotResolved;
    }
}

