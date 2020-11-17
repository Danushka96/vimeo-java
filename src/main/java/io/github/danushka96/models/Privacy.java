package io.github.danushka96.models;

import io.github.danushka96.enums.PrivacyScope;
import io.github.danushka96.enums.PrivacyView;

/**
 * @author danushka
 * 11/1/2020
 */
public class Privacy {
    public boolean add;
    public String comments;
    public boolean download;
    public String embed;
    public String view;

    public Privacy(boolean add, String comments, boolean download, String embed, String view) {
        this.add = add;
        this.comments = comments;
        this.download = download;
        this.embed = embed;
        this.view = view;
    }

    public Privacy() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean isDownload() {
        return download;
    }

    public void setDownload(boolean download) {
        this.download = download;
    }

    public String getEmbed() {
        return embed;
    }

    public void setEmbed(PrivacyScope embed) {
        this.embed = embed.getVal();
    }

    public void setEmbed(String embed) {
        this.embed = embed;
    }

    public String getView() {
        return view;
    }

    public void setView(PrivacyView view) {
        this.view = view.getVal();
    }

    public void setView(String view) {
        this.view = view;
    }

    public boolean isAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public static class Builder {
        public boolean add;
        public String comments;
        public boolean download;
        public String embed;
        public String view;

        public Builder() {
        }

        /**
         * Whether a user can add the video to a showcase, channel, or group.
         *
         * @param add
         * @return
         */
        public Builder withAdd(boolean add) {
            this.add = add;
            return this;
        }

        /**
         * The privacy level required to comment on the video.Option descriptions:
         * anybody - Anyone can comment on the video.
         * contacts - Only the owner's contacts can comment on the video.
         * nobody - No one can comment on the video.
         * anybody
         * contacts
         * nobody
         *
         * @param comments
         * @return
         */
        public Builder withComments(PrivacyView comments) {
            this.comments = comments.getVal();
            return this;
        }

        /**
         * Whether a user can download the video. This field isn't available to Vimeo Basic members.
         *
         * @param download
         * @return
         */
        public Builder withDownload(boolean download) {
            this.download = download;
            return this;
        }

        public Builder withEmbed(PrivacyScope privacyScope) {
            this.embed = privacyScope.getVal();
            return this;
        }

        public Builder withView(PrivacyView privacyView) {
            this.view = privacyView.getVal();
            return this;
        }

        public Privacy build() {
            return new Privacy(add, comments, download, embed, view);
        }
    }
}
