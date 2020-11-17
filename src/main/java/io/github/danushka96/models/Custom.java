package io.github.danushka96.models;

/**
 * @author danushka
 * 11/4/2020
 */
class Custom {
    private boolean active;
    private boolean id;
    private boolean sticky;
    private String link;

    public Custom() {
    }

    public Custom(boolean active, boolean id, boolean sticky, String link) {
        this.active = active;
        this.id = id;
        this.sticky = sticky;
        this.link = link;
    }

    public static Builder Builder() {
        return new Builder();
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isId() {
        return id;
    }

    public void setId(boolean id) {
        this.id = id;
    }

    public boolean isSticky() {
        return sticky;
    }

    public void setSticky(boolean sticky) {
        this.sticky = sticky;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public static class Builder {
        private boolean active;
        private boolean id;
        private boolean sticky;
        private String link;

        public Builder() {
            this.active = false;
            this.id = false;
            this.sticky = false;
        }

        /**
         * Whether to show the active custom logo on the embeddable player.
         *
         * @param value
         * @return Builder
         */
        public Builder withActive(boolean value) {
            this.active = value;
            return this;
        }

        /**
         * The ID of the custom logo that will show on the emeddable player.
         *
         * @param value
         * @return
         */
        public Builder withId(boolean value) {
            this.id = value;
            return this;
        }

        /**
         * The URL that loads when the user clicks the custom logo.
         *
         * @param link
         * @return
         */
        public Builder withLink(String link) {
            this.link = link;
            return this;
        }

        /**
         * Whether the custom logo is always visible on the embeddable player (true)
         * or whether the logo appears and disappears with the rest of the UI (false).
         *
         * @param value
         * @return
         */
        public Builder withSticky(boolean value) {
            this.sticky = value;
            return this;
        }

        public Custom build() {
            return new Custom(active, id, sticky, link);
        }
    }
}
