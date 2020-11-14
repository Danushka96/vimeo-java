package io.github.danushka96.models;

/**
 * @author danushka
 * 11/4/2020
 */
public class ReviewPage {
    private boolean active;
    private boolean notes;
    private boolean vimeo_logo;

    public ReviewPage() {
    }

    public ReviewPage(boolean active, boolean notes, boolean vimeo_logo) {
        this.active = active;
        this.notes = notes;
        this.vimeo_logo = vimeo_logo;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isNotes() {
        return notes;
    }

    public void setNotes(boolean notes) {
        this.notes = notes;
    }

    public boolean isVimeo_logo() {
        return vimeo_logo;
    }

    public void setVimeo_logo(boolean vimeo_logo) {
        this.vimeo_logo = vimeo_logo;
    }

    public static class Builder{
        private boolean active;
        private boolean notes;
        private boolean vimeo_logo;

        public Builder() {
        }

        /**
         * Whether to enable video review.
         * @param active
         * @return
         */
        public Builder withActive(boolean active){
            this.active = active;
            return this;
        }

        /**
         * Whether to enable review comments.
         * @param notes
         * @return
         */
        public Builder withNotes(boolean notes){
            this.notes = notes;
            return this;
        }

        /**
         * Whether to show the Vimeo logo on the review page.
         * @param vimeoLogo
         * @return
         */
        public Builder withVimeoLogo(boolean vimeoLogo){
            this.vimeo_logo = vimeoLogo;
            return this;
        }

        public ReviewPage build(){
            return new ReviewPage(active, notes, vimeo_logo);
        }
    }
}
