package io.github.danushka96.models.me;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author danushka
 * 7/10/2021
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Connections {
    public Albums albums;
    public Appearances appearances;
    public Categories categories;
    public Channels channels;
    public Feed feed;
    public Followers followers;
    public Following following;
    public Groups groups;
    public Likes likes;
    public Membership membership;
    public ModeratedChannels moderated_channels;
    public Portfolios portfolios;
    public Videos videos;
    public Watchlater watchlater;
    public Shared shared;
    public Pictures pictures;
    public WatchedVideos watched_videos;
    public FoldersRoot folders_root;
    public Folders folders;
    public Teams teams;
    public Block block;
}

