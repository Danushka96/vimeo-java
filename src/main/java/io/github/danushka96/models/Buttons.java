package io.github.danushka96.models;

/**
 * @author danushka
 * 11/4/2020
 */
class Buttons {
    private boolean embed;
    private boolean fullscreen;
    private boolean hd;
    private boolean like;
    private boolean scaling;
    private boolean share;
    private boolean watchLater;

    public Buttons() {
    }

    public Buttons(boolean embed, boolean fullscreen, boolean hd, boolean like, boolean scaling, boolean share, boolean watchLater) {
        this.embed = embed;
        this.fullscreen = fullscreen;
        this.hd = hd;
        this.like = like;
        this.scaling = scaling;
        this.share = share;
        this.watchLater = watchLater;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean isEmbed() {
        return embed;
    }

    public void setEmbed(boolean embed) {
        this.embed = embed;
    }

    public boolean isFullscreen() {
        return fullscreen;
    }

    public void setFullscreen(boolean fullscreen) {
        this.fullscreen = fullscreen;
    }

    public boolean isHd() {
        return hd;
    }

    public void setHd(boolean hd) {
        this.hd = hd;
    }

    public boolean isLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }

    public boolean isScaling() {
        return scaling;
    }

    public void setScaling(boolean scaling) {
        this.scaling = scaling;
    }

    public boolean isShare() {
        return share;
    }

    public void setShare(boolean share) {
        this.share = share;
    }

    public boolean isWatchLater() {
        return watchLater;
    }

    public void setWatchLater(boolean watchLater) {
        this.watchLater = watchLater;
    }

    public static class Builder {
        private boolean embed;
        private boolean fullscreen;
        private boolean hd;
        private boolean like;
        private boolean scaling;
        private boolean share;
        private boolean watchLater;

        public Builder() {
            this.embed = false;
            this.fullscreen = false;
            this.hd = false;
            this.like = false;
            this.scaling = false;
            this.share = false;
            this.watchLater = false;
        }

        /**
         * Whether to show the embed button on the embeddable player.
         *
         * @param value
         * @return Builder
         */
        public Builder withEmbed(boolean value) {
            this.embed = value;
            return this;
        }

        /**
         * Whether to show the fullscreen button on the embeddable player.
         *
         * @param value
         * @return Builder
         */
        public Builder withFullscreen(boolean value) {
            this.fullscreen = value;
            return this;
        }

        /**
         * Whether to show the HD button on the embeddable player.
         *
         * @param value
         * @return Builder
         */
        public Builder withHd(boolean value) {
            this.hd = value;
            return this;
        }

        /**
         * Whether to show the like button on the embeddable player.
         *
         * @param value
         * @return Builder
         */
        public Builder withLike(boolean value) {
            this.like = value;
            return this;
        }

        /**
         * Whether to show the scaling button on the embeddable player in fullscreen mode.
         *
         * @param value
         * @return Builder
         */
        public Builder withScaling(boolean value) {
            this.scaling = value;
            return this;
        }

        /**
         * Whether to show the share button on the embeddable player.
         *
         * @param value
         * @return Builder
         */
        public Builder withShare(boolean value) {
            this.share = value;
            return this;
        }

        /**
         * Whether to show the watch later button on the embeddable player.
         *
         * @param value
         * @return Builder
         */
        public Builder withWatchLater(boolean value) {
            this.watchLater = value;
            return this;
        }

        public Buttons build() {
            return new Buttons(embed, fullscreen, hd, like, scaling, share, watchLater);
        }
    }
}
