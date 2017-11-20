package com.huwei.sweetmusicplayer.business.models;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table ALBUM_INFO.
 */
public class AlbumInfo {

    private Long albumId;
    private String title;
    private String artist;
    private Integer numSongs;
    private String albumArt;

    public AlbumInfo() {
    }

    public AlbumInfo(Long albumId) {
        this.albumId = albumId;
    }

    public AlbumInfo(Long albumId, String title, String artist, Integer numSongs, String albumArt) {
        this.albumId = albumId;
        this.title = title;
        this.artist = artist;
        this.numSongs = numSongs;
        this.albumArt = albumArt;
    }

    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Integer getNumSongs() {
        return numSongs;
    }

    public void setNumSongs(Integer numSongs) {
        this.numSongs = numSongs;
    }

    public String getAlbumArt() {
        return albumArt;
    }

    public void setAlbumArt(String albumArt) {
        this.albumArt = albumArt;
    }

}
