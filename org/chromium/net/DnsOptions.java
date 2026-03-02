package org.chromium.net;

public final class DnsOptions {
    private final Boolean mEnableStaleDns;
    private final Boolean mPersistHostCache;
    private final Long mPersistHostCachePeriodMillis;
    private final Boolean mPreestablishConnectionsToStaleDnsResults;
    private final DnsOptions.StaleDnsOptions mStaleDnsOptions;
    private final Boolean mUseBuiltInDnsResolver;

    public DnsOptions(DnsOptions.Builder dnsOptions$Builder0) {
        this.mEnableStaleDns = dnsOptions$Builder0.mEnableStaleDns;
        this.mStaleDnsOptions = dnsOptions$Builder0.mStaleDnsOptions;
        this.mPersistHostCachePeriodMillis = dnsOptions$Builder0.mPersistHostCachePeriodMillis;
        this.mPreestablishConnectionsToStaleDnsResults = dnsOptions$Builder0.mPreestablishConnectionsToStaleDnsResults;
        this.mUseBuiltInDnsResolver = dnsOptions$Builder0.mUseBuiltInDnsResolver;
        this.mPersistHostCache = dnsOptions$Builder0.mPersistHostCache;
    }

    public static DnsOptions.Builder builder() {
        return new DnsOptions.Builder();
    }

    public Boolean getEnableStaleDns() {
        return this.mEnableStaleDns;
    }

    public Boolean getPersistHostCache() {
        return this.mPersistHostCache;
    }

    public Long getPersistHostCachePeriodMillis() {
        return this.mPersistHostCachePeriodMillis;
    }

    public Boolean getPreestablishConnectionsToStaleDnsResults() {
        return this.mPreestablishConnectionsToStaleDnsResults;
    }

    public DnsOptions.StaleDnsOptions getStaleDnsOptions() {
        return this.mStaleDnsOptions;
    }

    public Boolean getUseBuiltInDnsResolver() {
        return this.mUseBuiltInDnsResolver;
    }
}

