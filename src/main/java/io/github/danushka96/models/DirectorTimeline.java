package io.github.danushka96.models;

/**
 * @author danushka
 * 11/4/2020
 */
class DirectorTimeline {
    private int pitch;
    private int roll;
    private int timecode;
    private int yaw;

    public DirectorTimeline(int pitch, int roll, int timecode, int yaw) {
        this.pitch = pitch;
        this.roll = roll;
        this.timecode = timecode;
        this.yaw = yaw;
    }

    public int getPitch() {
        return pitch;
    }

    public void setPitch(int pitch) {
        this.pitch = pitch;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getTimecode() {
        return timecode;
    }

    public void setTimecode(int timecode) {
        this.timecode = timecode;
    }

    public int getYaw() {
        return yaw;
    }

    public void setYaw(int yaw) {
        this.yaw = yaw;
    }

    public static class Builder {
        private int pitch;
        private int roll;
        private int timecode;
        private int yaw;

        public Builder() {
        }

        /**
         * The 360 director timeline pitch.
         * This value must be between −90 and 90, and you must specify it only when spatial.director_timeline is defined.
         *
         * @param pitch
         * @return
         */
        public Builder withPitch(int pitch) {
            this.pitch = pitch;
            return this;
        }

        /**
         * The 360 director timeline roll.
         *
         * @param roll
         * @return
         */
        public Builder withRoll(int roll) {
            this.roll = roll;
            return this;
        }

        /**
         * The 360 director timeline time code.
         * This paramater is qequired only when spatial.director_timeline is defined.
         *
         * @param timeCode
         * @return
         */
        public Builder withTimeCode(int timeCode) {
            this.timecode = timeCode;
            return this;
        }

        /**
         * The 360 director timeline yaw. This value must be between 0 and 360,
         * and you must specify it only when spatial.director_timeline is defined.
         *
         * @param yaw
         * @return
         */
        public Builder withYaw(int yaw) {
            this.yaw = yaw;
            return this;
        }

        public DirectorTimeline build() {
            return new DirectorTimeline(pitch, roll, timecode, yaw);
        }

    }
}
