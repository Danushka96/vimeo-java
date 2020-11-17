package io.github.danushka96.models;

import io.github.danushka96.enums.SpatialProjection;

/**
 * @author danushka
 * 11/4/2020
 */
public class Spatial {
    private DirectorTimeline[] director_timeline;
    private int field_of_view;
    private String projection;
    private String stereo_format;

    public Spatial() {
    }

    public Spatial(DirectorTimeline[] director_timeline, int field_of_view, String projection, String stereo_format) {
        this.director_timeline = director_timeline;
        this.field_of_view = field_of_view;
        this.projection = projection;
        this.stereo_format = stereo_format;
    }

    public static Builder builder() {
        return new Builder();
    }

    public DirectorTimeline[] getDirector_timeline() {
        return director_timeline;
    }

    public void setDirector_timeline(DirectorTimeline[] director_timeline) {
        this.director_timeline = director_timeline;
    }

    public int getField_of_view() {
        return field_of_view;
    }

    public void setField_of_view(int field_of_view) {
        this.field_of_view = field_of_view;
    }

    public String getProjection() {
        return projection;
    }

    public void setProjection(String projection) {
        this.projection = projection;
    }

    public String getStereo_format() {
        return stereo_format;
    }

    public void setStereo_format(String stereo_format) {
        this.stereo_format = stereo_format;
    }

    public static class Builder {
        private DirectorTimeline[] director_timeline;
        private int field_of_view;
        private String projection;
        private String stereo_format;

        /**
         * An array representing the 360 director timeline.
         *
         * @param directorTimeLine
         * @return
         */
        public Builder withDirectorTimeLine(DirectorTimeline[] directorTimeLine) {
            this.director_timeline = directorTimeLine;
            return this;
        }

        /**
         * The 360 field of view. This value must be between 30 and 90. The default is 50.
         *
         * @param fieldOfView
         * @return
         */
        public Builder withFieldOfView(int fieldOfView) {
            this.field_of_view = fieldOfView;
            return this;
        }

        /**
         * The 360 spatial projection.Option descriptions:
         * cubical - Use cubical projection.
         * cylindrical - Use cylindrical projection.
         * dome - Use dome projection.
         * equirectangular - Use equirectangular projection.
         * pyramid - Use pyramid projection.
         *
         * @param projection
         * @return
         */
        public Builder withProjection(SpatialProjection projection) {
            this.projection = projection.getVal();
            return this;
        }

        /**
         * The 360 field of view. This value must be between 30 and 90. The default is 50.
         *
         * @param stereoFormat
         * @return
         */
        public Builder withStereoFormat(String stereoFormat) {
            this.stereo_format = stereoFormat;
            return this;
        }

        public Spatial build() {
            return new Spatial(director_timeline, field_of_view, projection, stereo_format);
        }

    }
}

