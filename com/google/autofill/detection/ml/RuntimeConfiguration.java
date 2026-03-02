package com.google.autofill.detection.ml;

public final class RuntimeConfiguration {
    private final boolean allowProximityDecoratorCaching;
    private final boolean allowProximityDecoratorLevelSwapping;
    private final boolean allowRegexCountingSignalEarlyQuitting;
    private final boolean disableProximityDecoratorStreaming;
    private final boolean enableMoreEfficientProximityDecoratorGenerate;
    private final boolean latencyOptimizationEnabled;
    private final boolean optimizeRegexBuilderProducers;
    private final boolean randomizeModelSignalOrder;
    private static boolean staticAllowProximityDecoratorCaching = false;
    private static boolean staticAllowProximityDecoratorLevelSwapping = false;
    private static boolean staticAllowRegexCountingSignalEarlyQuitting = false;
    private static boolean staticDisableProximityDecoratorStreaming = false;
    private static boolean staticEnableMoreEfficientProximityDecoratorGenerate = false;
    private static boolean staticLatencyOptimizationEnabled = false;
    private static boolean staticOptimizeRegexBuilderProducers = false;
    private static boolean staticRandomizeModelSignalOrder = false;

    static {
    }

    private RuntimeConfiguration() {
        this.allowProximityDecoratorCaching = RuntimeConfiguration.staticAllowProximityDecoratorCaching;
        this.disableProximityDecoratorStreaming = RuntimeConfiguration.staticDisableProximityDecoratorStreaming;
        this.allowProximityDecoratorLevelSwapping = RuntimeConfiguration.staticAllowProximityDecoratorLevelSwapping;
        this.randomizeModelSignalOrder = RuntimeConfiguration.staticRandomizeModelSignalOrder;
        this.enableMoreEfficientProximityDecoratorGenerate = RuntimeConfiguration.staticEnableMoreEfficientProximityDecoratorGenerate;
        this.optimizeRegexBuilderProducers = RuntimeConfiguration.staticOptimizeRegexBuilderProducers;
        this.allowRegexCountingSignalEarlyQuitting = RuntimeConfiguration.staticAllowRegexCountingSignalEarlyQuitting;
        this.latencyOptimizationEnabled = RuntimeConfiguration.staticLatencyOptimizationEnabled;
    }

    public static RuntimeConfiguration getSnapshot() {
        return new RuntimeConfiguration();
    }

    public boolean isLatencyOptimizationEnabled() {
        return this.latencyOptimizationEnabled;
    }

    public boolean isMoreEfficientProximityDecoratorGenerateEnabled() {
        return this.enableMoreEfficientProximityDecoratorGenerate;
    }

    public boolean isProximityDecoratorCachingAllowed() {
        return this.allowProximityDecoratorCaching;
    }

    public boolean isProximityDecoratorLevelSwappingAllowed() {
        return this.allowProximityDecoratorLevelSwapping;
    }

    public boolean isProximityDecoratorStreamingDisabled() {
        return this.disableProximityDecoratorStreaming;
    }

    public boolean isRegexBuilderProducerOptimizationEnabled() {
        return this.optimizeRegexBuilderProducers;
    }

    public boolean isRegexCountingSignalEarlyQuittingEnabled() {
        return this.allowRegexCountingSignalEarlyQuitting;
    }

    public static void setAllowProximityDecoratorCaching(boolean z) {
        RuntimeConfiguration.staticAllowProximityDecoratorCaching = z;
    }

    public static void setAllowProximityDecoratorLevelSwapping(boolean z) {
        RuntimeConfiguration.staticAllowProximityDecoratorLevelSwapping = z;
    }

    public static void setAllowRegexCountingSignalEarlyQuitting(boolean z) {
        RuntimeConfiguration.staticAllowRegexCountingSignalEarlyQuitting = z;
    }

    public static void setDisableProximityDecoratorStreaming(boolean z) {
        RuntimeConfiguration.staticDisableProximityDecoratorStreaming = z;
    }

    public static void setEnableMoreEfficientProximityDecoratorGenerate(boolean z) {
        RuntimeConfiguration.staticEnableMoreEfficientProximityDecoratorGenerate = z;
    }

    public static void setLatencyOptimizationEnabled(boolean z) {
        RuntimeConfiguration.staticLatencyOptimizationEnabled = z;
    }

    public static void setOptimizeRegexBuilderProducers(boolean z) {
        RuntimeConfiguration.staticOptimizeRegexBuilderProducers = z;
    }

    public static void setRandomizeModelSignalOrder(boolean z) {
        RuntimeConfiguration.staticRandomizeModelSignalOrder = z;
    }

    public boolean shouldRandomizeSignalOrder() {
        return this.randomizeModelSignalOrder;
    }
}

