package com.google.android.wallet.imageprocessing.processors;

public class CardDetector.Options {
    public float areaDeviationWeight;
    public float areaToleranceFactor;
    public float aspectRatioDeviationWeight;
    public float cameraHorizontalFov;
    public float cornerAngleDeviationWeight;
    public float cornerAngleTolerance;
    public float cornerOffsetRoiToleranceFactor;
    public float cornerOutsideImageToleranceFactor;
    public float lineSegmentDetectorGradientQuantization;
    public float maxDistance;
    public float maxGeometricError;
    public float maxSlant;
    public float maxTiltDeviation;
    public float minPerimeterCoverageFraction;
    public float perimeterCoverageWeight;
    public boolean returnLineSegments;

    public CardDetector.Options() {
        this.cameraHorizontalFov = 38.0f;
        this.cornerOutsideImageToleranceFactor = 0.05f;
        this.cornerOffsetRoiToleranceFactor = -1.0f;
        this.cornerAngleTolerance = 20.0f;
        this.areaToleranceFactor = 2.0f;
        this.minPerimeterCoverageFraction = 0.3f;
        this.maxGeometricError = 8.0f;
        this.maxSlant = 45.0f;
        this.maxTiltDeviation = 90.0f;
        this.areaDeviationWeight = 1.0f;
        this.cornerAngleDeviationWeight = 1.0f;
        this.aspectRatioDeviationWeight = 1.0f;
        this.perimeterCoverageWeight = 1.0f;
        this.maxDistance = 240.0f;
        this.returnLineSegments = false;
        this.lineSegmentDetectorGradientQuantization = 1.0f;
    }
}

