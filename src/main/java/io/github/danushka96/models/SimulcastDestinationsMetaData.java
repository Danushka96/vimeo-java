package io.github.danushka96.models;

import io.github.danushka96.enums.SimulcastVideoType;
import io.github.danushka96.enums.SocialPrivacy;

/**
 * @author danushka
 * 11/14/2020
 */
public class SimulcastDestinationsMetaData {
    private String description;
    private String event_id;
    private String parent_id;
    private String privacy;
    private boolean should_tweet;
    private String title;
    private String type;
    private String user_id;
    private String video_id;

    public SimulcastDestinationsMetaData(String description, String event_id, String parent_id, String privacy, boolean should_tweet, String title, String type, String user_id, String video_id) {
        this.description = description;
        this.event_id = event_id;
        this.parent_id = parent_id;
        this.privacy = privacy;
        this.should_tweet = should_tweet;
        this.title = title;
        this.type = type;
        this.user_id = user_id;
        this.video_id = video_id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEvent_id() {
        return event_id;
    }

    public void setEvent_id(String event_id) {
        this.event_id = event_id;
    }

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public boolean isShould_tweet() {
        return should_tweet;
    }

    public void setShould_tweet(boolean should_tweet) {
        this.should_tweet = should_tweet;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getVideo_id() {
        return video_id;
    }

    public void setVideo_id(String video_id) {
        this.video_id = video_id;
    }

    public static class Builder {
        private String description;
        private String event_id;
        private String parent_id;
        private String privacy;
        private boolean should_tweet;
        private String title;
        private String type;
        private String user_id;
        private String video_id;

        public Builder() {
        }

        /**
         * The description of the simulcast. This field applies to Facebook and YouTube destinations.
         *
         * @param description
         * @return
         */
        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * The ID of the event associated with the simulcast. This field applies to Livestream destinations.
         *
         * @param eventId
         * @return
         */
        public Builder withEventId(String eventId) {
            this.event_id = eventId;
            return this;
        }

        /**
         * The ID of the object that contains the video on the host service. This field applies to Facebook destinations.
         *
         * @param parentId
         * @return
         */
        public Builder withParentId(String parentId) {
            this.parent_id = parentId;
            return this;
        }


        /**
         * The privacy level of the stream on the simulcast destination. This field applies to Facebook and YouTube destinations.Option descriptions:
         * all_friends - Facebook: The owner and their friends can access the stream.
         * custom - Facebook: A user-specified whitelist of permitted Facebook members can access the stream.
         * everyone - Facebook: Anyone can access the stream.
         * friends_of_friends - Facebook: The owner, their friends, and the friends of their friends can access the stream.
         * private - YouTube: The owner can access the stream.
         * public - YouTube: Anyone can access the stream.
         * self - Facebook: The owner of the Facebook profile can access the stream.
         * unlisted - YouTube: Anyone can access the stream, but it isn't searchable.
         *
         * @param privacy
         * @return
         */
        public Builder withPrivacy(SocialPrivacy privacy) {
            this.privacy = privacy.getVal();
            return this;
        }

        /**
         * Whether the simulcast is automatically tweeted. This field applies to Periscope destinations.
         *
         * @param should_tweet
         * @return
         */
        public Builder withShouldTweet(boolean should_tweet) {
            this.should_tweet = should_tweet;
            return this;
        }

        /**
         * The title of the simulcast. This field applies to YouTube, Facebook, Periscope, and Livestream destinations.
         *
         * @param title
         * @return
         */
        public Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        /**
         * The type of the object that contains the simulcast video on the host service.
         * This field applies to Facebook destinations.Option descriptions:
         * event - The simulcast is in a Facebook event.
         * group - The sinulcast is in a Facebook group.
         * page - The simulcast is on a Facebook page.
         * profile - The simulcast is in a Facebook profile.
         * scheduled_broadcast - The simulcast is in a Facebook Live scheduled broadcast.
         *
         * @param type
         * @return
         */
        public Builder withType(SimulcastVideoType type) {
            this.type = type.getVal();
            return this;
        }

        /**
         * The host-service ID of the user who owns the simulcast video.
         * This field applies to Facebook, YouTube, Periscope, and Livestream destinations.
         *
         * @param userId
         * @return
         */
        public Builder withUserId(String userId) {
            this.user_id = userId;
            return this;
        }

        /**
         * The host-service ID of the simulcast video.
         * This field applies to Facebook, YouTube, and Periscope destinations.
         *
         * @param videoId
         * @return
         */
        public Builder withVideoId(String videoId) {
            this.video_id = videoId;
            return this;
        }

        public SimulcastDestinationsMetaData build() {
            return new SimulcastDestinationsMetaData(description, event_id, parent_id, privacy, should_tweet, title,
                    type, user_id, video_id);
        }

    }
}
